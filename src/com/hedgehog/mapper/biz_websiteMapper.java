package com.hedgehog.mapper;

import com.hedgehog.domain.ProNew;
import com.hedgehog.domain.QueryParam;
import com.hedgehog.domain.biz_website;
import com.hedgehog.domain.biz_websiteExample;
import com.hedgehog.domain.biz_websiteWithBLOBs;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface biz_websiteMapper {
    int countByExample(biz_websiteExample example);

    int deleteByExample(biz_websiteExample example);

    int deleteByPrimaryKey(Integer websiteid);

    int insert(biz_website record);

    int insertSelective(biz_website record);

    List<biz_website> selectByExampleWithBLOBs(biz_websiteExample example);

    List<biz_website> selectByExample(biz_websiteExample example);

    biz_website selectByPrimaryKey(Integer websiteid);
    
    biz_websiteWithBLOBs selectByPrimaryKeyWrap(Integer websiteid);
    
    biz_website selectByMember(Integer memberid);

    int updateByExampleSelective(@Param("record") biz_website record, @Param("example") biz_websiteExample example);

    int updateByExampleWithBLOBs(@Param("record") biz_website record, @Param("example") biz_websiteExample example);

    int updateByExample(@Param("record") biz_website record, @Param("example") biz_websiteExample example);

    int updateByPrimaryKeySelective(biz_website record);

   int updateByPrimaryKeyWithBLOBs(biz_website record);

    int updateByPrimaryKey(biz_website record);
    
//
    int updateByPrimaryKeySelectiveWrap(biz_websiteWithBLOBs record);

  //  int updateByPrimaryKeyWithBLOBs(biz_websiteWithBLOBs record);

 //   int updateByPrimaryKey(biz_website record);
    
    List<biz_website> selectRecordInPager(QueryParam qp);
}