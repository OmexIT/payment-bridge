package com.omexit.paymentbridge.core.channel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Created by omexic on 7/15/2015.
 */
@Repository
public interface ChannelRepository extends JpaRepository<Channel, Long> {
	List<Channel> findAll();

	Optional<Channel> findById(Long channelId);

	Channel findByChannelName(String channelName);
}
