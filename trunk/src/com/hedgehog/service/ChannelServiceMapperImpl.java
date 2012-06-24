package com.hedgehog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hedgehog.domain.biz_channel;
import com.hedgehog.mapper.biz_channelMapper;
@Service("channelService")
public class ChannelServiceMapperImpl implements ChannelService{
	private biz_channelMapper channelMapper;
	@Autowired
	public void setChannelMapper(biz_channelMapper channelMapper) {
		this.channelMapper = channelMapper;
	}

	public biz_channel selectByChannelCode(String ch_code) {
		// TODO Auto-generated method stub
		return this.channelMapper.selectByChannelCode(ch_code);
	}

	

}
