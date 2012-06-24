package com.hedgehog.mapper;

import com.hedgehog.domain.biz_classinfoclass;
import com.hedgehog.domain.biz_classinfoclassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface biz_classinfoclassMapper {
    int countByExample(biz_classinfoclassExample example);

    int deleteByExample(biz_classinfoclassExample example);

    int deleteByPrimaryKey(Integer cicid);

    int insert(biz_classinfoclass record);

    int insertSelective(biz_classinfoclass record);

    List<biz_classinfoclass> selectByExample(biz_classinfoclassExample example);
    
    List<biz_classinfoclass> selectcicAllRecord();
    List<biz_classinfoclass> selectcicAllParentRecord();
    
    List<biz_classinfoclass> selectByParentID(Integer cicParentid);//xml文件 属性名
    List<biz_classinfoclass> selectByParent(Integer cicParentid);//xml文件 属性名

    biz_classinfoclass selectByPrimaryKey(Integer cicid);

    int updateByExampleSelective(@Param("record") biz_classinfoclass record, @Param("example") biz_classinfoclassExample example);

    int updateByExample(@Param("record") biz_classinfoclass record, @Param("example") biz_classinfoclassExample example);

    int updateByPrimaryKeySelective(biz_classinfoclass record);

    int updateByPrimaryKey(biz_classinfoclass record);
}