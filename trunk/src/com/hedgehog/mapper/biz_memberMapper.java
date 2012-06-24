package com.hedgehog.mapper;

import com.hedgehog.domain.QueryParam;
import com.hedgehog.domain.biz_member;
import com.hedgehog.domain.biz_memberExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface biz_memberMapper {
    int countByExample(biz_memberExample example);

    int deleteByExample(biz_memberExample example);

    int deleteByPrimaryKey(Integer memberid);

    int insert(biz_member record);
    
    int insertmemberpro(biz_member record);
    

    int insertSelective(biz_member record);

    List<biz_member> selectByExample(biz_memberExample example);

    biz_member selectByPrimaryKey(Integer memberid);
    biz_member selectByUsername(String username);

    int updateByExampleSelective(@Param("record") biz_member record, @Param("example") biz_memberExample example);

    int updateByExample(@Param("record") biz_member record, @Param("example") biz_memberExample example);

    int updateByPrimaryKeySelective(biz_member record);

    int updateByPrimaryKey(biz_member record);
    List<biz_member> selectRecordInPager(QueryParam qp);
    int isExist(String username);    
    int authenticate(biz_member record);
}