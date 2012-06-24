package com.hedgehog.mapper;

import com.hedgehog.domain.biz_menuoper;
import com.hedgehog.domain.biz_menuoperExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface biz_menuoperMapper {
    int countByExample(biz_menuoperExample example);

    int deleteByExample(biz_menuoperExample example);

    int deleteByPrimaryKey(Integer menuoperid);

    int insert(biz_menuoper record);

    int insertSelective(biz_menuoper record);

    List<biz_menuoper> selectByExample(biz_menuoperExample example);
    
    biz_menuoper selectByAppKey(Integer appid);
    
    biz_menuoper selectByAppcode(String appcode);
    

    biz_menuoper selectByPrimaryKey(Integer menuoperid);

    int updateByExampleSelective(@Param("record") biz_menuoper record, @Param("example") biz_menuoperExample example);

    int updateByExample(@Param("record") biz_menuoper record, @Param("example") biz_menuoperExample example);

    int updateByPrimaryKeySelective(biz_menuoper record);

    int updateByPrimaryKey(biz_menuoper record);
}