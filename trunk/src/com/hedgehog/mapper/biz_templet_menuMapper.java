package com.hedgehog.mapper;

import com.hedgehog.domain.biz_templet_menu;
import com.hedgehog.domain.biz_templet_menuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface biz_templet_menuMapper {
    int countByExample(biz_templet_menuExample example);

    int deleteByExample(biz_templet_menuExample example);

    int deleteByPrimaryKey(Integer tmid);

    int insert(biz_templet_menu record);

    int insertSelective(biz_templet_menu record);

    List<biz_templet_menu> selectByExampleWithBLOBs(biz_templet_menuExample example);

    List<biz_templet_menu> selectByExample(biz_templet_menuExample example);

    biz_templet_menu selectByPrimaryKey(Integer tmid);

    int updateByExampleSelective(@Param("record") biz_templet_menu record, @Param("example") biz_templet_menuExample example);

    int updateByExampleWithBLOBs(@Param("record") biz_templet_menu record, @Param("example") biz_templet_menuExample example);

    int updateByExample(@Param("record") biz_templet_menu record, @Param("example") biz_templet_menuExample example);

    int updateByPrimaryKeySelective(biz_templet_menu record);

    int updateByPrimaryKeyWithBLOBs(biz_templet_menu record);

    int updateByPrimaryKey(biz_templet_menu record);
}