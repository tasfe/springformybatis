package com.hedgehog.service;

import com.hedgehog.domain.biz_channel;

public interface ChannelService {
	biz_channel selectByChannelCode(String ch_code);

}
