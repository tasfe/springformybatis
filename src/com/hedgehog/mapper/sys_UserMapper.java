package com.hedgehog.mapper;

import com.hedgehog.domain.QueryParam;
import com.hedgehog.domain.sys_User;
import com.hedgehog.domain.web_news;
//import com.hedgehog.domain.sys_UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface sys_UserMapper {
//    int countByExample(sys_UserExample example);
//
//    int deleteByExample(sys_UserExample example);

    int deleteByPrimaryKey(Integer userid);

    int insert(sys_User record);

    int insertSelective(sys_User record);

//    List<sys_User> selectByExampleWithBLOBs(sys_UserExample example);
//
//    List<sys_User> selectByExample(sys_UserExample example);

    sys_User selectByPrimaryKey(Integer userid);    

//    int updateByExampleSelective(@Param("record") sys_User record, @Param("example") sys_UserExample example);
//
//    int updateByExampleWithBLOBs(@Param("record") sys_User record, @Param("example") sys_UserExample example);
//
//    int updateByExample(@Param("record") sys_User record, @Param("example") sys_UserExample example);

    int updateByPrimaryKeySelective(sys_User record);

    int updateByPrimaryKeyWithBLOBs(sys_User record);

    int updateByPrimaryKey(sys_User record);    
    
    List<sys_User> selectUserInPager(QueryParam qp);
    
    int authenticate(sys_User record);
	sys_User getUser(String username);
}