package com.hedgehog.mapper;

import com.hedgehog.domain.QueryParam;
import com.hedgehog.domain.biz_reply;
import com.hedgehog.domain.biz_replyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface biz_replyMapper {
    int countByExample(biz_replyExample example);

    int deleteByExample(biz_replyExample example);

    int deleteByPrimaryKey(Integer replyid);
    
    int deleteByClassinfoid(Integer classinfoid);//删除

    int insert(biz_reply record);

    int insertSelective(biz_reply record);

    List<biz_reply> selectByExampleWithBLOBs(biz_replyExample example);

    List<biz_reply> selectByExample(biz_replyExample example);
    
    List<biz_reply> selectByInfoID(Integer classinfoid);//分类信息回复
    
    List<biz_reply> selectRecordInPager(QueryParam qp);//分页

    biz_reply selectByPrimaryKey(Integer replyid);

    int updateByExampleSelective(@Param("record") biz_reply record, @Param("example") biz_replyExample example);

    int updateByExampleWithBLOBs(@Param("record") biz_reply record, @Param("example") biz_replyExample example);

    int updateByExample(@Param("record") biz_reply record, @Param("example") biz_replyExample example);

    int updateByPrimaryKeySelective(biz_reply record);

    int updateByPrimaryKeyWithBLOBs(biz_reply record);

    int updateByPrimaryKey(biz_reply record);
}