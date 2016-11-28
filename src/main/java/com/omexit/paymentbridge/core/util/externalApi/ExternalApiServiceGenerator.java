package com.omexit.paymentbridge.core.util.externalApi;

import okhttp3.*;
import org.springframework.stereotype.Component;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import javax.net.ssl.*;
import java.io.IOException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

/**
 * Created by aomeri on 9/24/16.
 */
@Component
public class ExternalApiServiceGenerator {

    private static Retrofit.Builder builder =
            new Retrofit.Builder()
                    .addConverterFactory(JacksonConverterFactory.create());


    public <S> S createService(Class<S> serviceClass, String baseUrl) {
        return createService(serviceClass, baseUrl, null);
    }

    public <S> S createService(Class<S> serviceClass, String baseUrl, final String username, final String password) {
        OkHttpClient.Builder httpClient = getUnsafeOkHttpClient();

        if (username != null && password != null) {

            final String basic = Credentials.basic(username, password);

            httpClient.addInterceptor(new Interceptor() {
                @Override
                public Response intercept(Chain chain) throws IOException {
                    Request original = chain.request();

                    Request.Builder requestBuilder = original.newBuilder()
                            .header("Authorization", basic)
                            .header("Accept", "application/json")
                            .method(original.method(), original.body());

                    Request request = requestBuilder.build();
                    return chain.proceed(request);
                }
            });
        }

        Retrofit retrofit = builder
                .client(httpClient.build())
                .baseUrl(baseUrl).build();

        return retrofit.create(serviceClass);
    }

    public <S> S createService(Class<S> serviceClass, String baseUrl, final AccessToken token) {
        OkHttpClient.Builder httpClient = getUnsafeOkHttpClient();


        if (token != null) {
            httpClient.addInterceptor(new Interceptor() {
                @Override
                public Response intercept(Chain chain) throws IOException {
                    Request original = chain.request();

                    Request.Builder requestBuilder = original.newBuilder()
                            .header("Accept", "application/json")
                            .header("Authorization",
                                    token.getTokenType() + " " + token.getAccessToken())
                            .method(original.method(), original.body());

                    Request request = requestBuilder.build();
                    return chain.proceed(request);
                }
            });
        }

        Retrofit retrofit = builder
                .client(httpClient.build())
                .baseUrl(baseUrl).build();

        return retrofit.create(serviceClass);
    }

    /**
     * This method needs to be improved!
     * @return
     */
    private OkHttpClient.Builder getUnsafeOkHttpClient() {
        try {
            // Create a trust manager that does not validate certificate chains
            final TrustManager[] trustAllCerts = new TrustManager[]{
                    new X509TrustManager() {
                        @Override
                        public void checkClientTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {

                        }

                        @Override
                        public void checkServerTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {

                        }

                        @Override
                        public X509Certificate[] getAcceptedIssuers() {
                            return new X509Certificate[0];
                        }
                    }
            };

            // Install the all-trusting trust manager
            final SSLContext sslContext = SSLContext.getInstance("SSL");
            sslContext.init(null, trustAllCerts, new java.security.SecureRandom());
            // Create an ssl socket factory with our all-trusting manager
            final SSLSocketFactory sslSocketFactory = sslContext.getSocketFactory();

//            OkHttpClient okHttpClient = new OkHttpClient();
            OkHttpClient.Builder okHttpClientBuilder = new OkHttpClient.Builder();
            okHttpClientBuilder.sslSocketFactory(sslSocketFactory);
            okHttpClientBuilder.hostnameVerifier(new HostnameVerifier() {
                @Override
                public boolean verify(String hostname, SSLSession session) {
                    return true;
                }
            });

            return okHttpClientBuilder;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
