package com.hedgehog.service;

import java.util.List;

import com.hedgehog.domain.web_friendlink;

public interface FriendlinkService {
	int deleteByPrimaryKey(Integer friendlinkId);
	int insertSelective(web_friendlink record);
	web_friendlink selectByPrimaryKey(Integer friendlinkId);
	int updateByPrimaryKeySelective(web_friendlink record);

    //int updateByPrimaryKey(web_friendlink record);
    
    List<web_friendlink> selectAllRecord();
    
    List<web_friendlink> selectRecordByWebsiteid(Integer friendlinkMenuid);

}
