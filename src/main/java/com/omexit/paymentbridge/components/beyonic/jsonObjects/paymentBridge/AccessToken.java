package com.omexit.paymentbridge.components.beyonic.jsonObjects.paymentBridge;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Created by aomeri on 9/24/16.
 */
@Data
public class AccessToken {
    @JsonProperty("access_token")
    private String accessToken;
    @JsonProperty("token_type")
    private String tokenType;
    @JsonProperty("expires_in")
    private String expiresIn;
    @JsonProperty("scope")
    private String scope;
    @JsonProperty("jti")
    private String jti;
}
