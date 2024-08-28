package com.omexit.paymentbridge.core.channel;

import com.omexit.paymentbridge.exception.ChannelNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ChannelServiceImpl implements ChannelService {
	private final ChannelRepository channelRepository;

	@Override
	public Channel saveOrUpdateChannel(Channel channel) {
		return channelRepository.save(channel);
	}

	@Override
	public Channel findChannelByChannelName(String channelName) {

		return channelRepository.findByChannelName(channelName);
	}

	@Override
	public Channel findchannelbyId(Long channelId) {
		return channelRepository.findById(channelId)
				.orElseThrow(() -> new ChannelNotFoundException("Channel with id " + channelId + " not found"));
	}

	@Override
	public List<Channel> findAllChannels() {
		return channelRepository.findAll();
	}
}
