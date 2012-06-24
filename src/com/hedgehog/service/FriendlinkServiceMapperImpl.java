package com.hedgehog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hedgehog.domain.web_friendlink;
import com.hedgehog.mapper.web_friendlinkMapper;

@Service("friendlinkService")
public class FriendlinkServiceMapperImpl implements FriendlinkService{
	
	private web_friendlinkMapper friendlinkMapper;
	@Autowired
	public void setFriendlinkMapper(web_friendlinkMapper friendlinkMapper) {
		this.friendlinkMapper = friendlinkMapper;
	}

	public int deleteByPrimaryKey(Integer friendlinkId) {
		// TODO Auto-generated method stub
		return this.friendlinkMapper.deleteByPrimaryKey(friendlinkId);
	}

	public int insertSelective(web_friendlink record) {
		// TODO Auto-generated method stub
		return this.friendlinkMapper.insertSelective(record);
	}

	public List<web_friendlink> selectAllRecord() {
		// TODO Auto-generated method stub
		return this.friendlinkMapper.selectAllRecord();
	}

	public web_friendlink selectByPrimaryKey(Integer friendlinkId) {
		// TODO Auto-generated method stub
		return this.friendlinkMapper.selectByPrimaryKey(friendlinkId);
	}

	public int updateByPrimaryKeySelective(web_friendlink record) {
		// TODO Auto-generated method stub
		return this.friendlinkMapper.updateByPrimaryKeySelective(record);
	}

	public List<web_friendlink> selectRecordByWebsiteid(Integer friendlinkMenuid) {
		// TODO Auto-generated method stub
		return this.friendlinkMapper.selectRecordByWebsiteid(friendlinkMenuid);
	}

	

}
