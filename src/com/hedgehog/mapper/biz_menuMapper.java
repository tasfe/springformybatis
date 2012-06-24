package com.hedgehog.mapper;

import com.hedgehog.domain.biz_menu;
import com.hedgehog.domain.biz_menuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface biz_menuMapper {
    int countByExample(biz_menuExample example);

    int deleteByExample(biz_menuExample example);

    int deleteByPrimaryKey(Integer menuid);

    int insert(biz_menu record);

    int insertSelective(biz_menu record);

    List<biz_menu> selectByExampleWithBLOBs(biz_menuExample example);

    List<biz_menu> selectByExample(biz_menuExample example);
    
    List<biz_menu> selectByMember(int memberid);
    
    List<biz_menu> selectByMemberEnable(int memberid);

    biz_menu selectByPrimaryKey(Integer menuid);

    int updateByExampleSelective(@Param("record") biz_menu record, @Param("example") biz_menuExample example);

    int updateByExampleWithBLOBs(@Param("record") biz_menu record, @Param("example") biz_menuExample example);

    int updateByExample(@Param("record") biz_menu record, @Param("example") biz_menuExample example);

    int updateByPrimaryKeySelective(biz_menu record);

    int updateByPrimaryKeyWithBLOBs(biz_menu record);

    int updateByPrimaryKey(biz_menu record);
}