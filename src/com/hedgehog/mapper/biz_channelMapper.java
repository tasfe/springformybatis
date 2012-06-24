package com.hedgehog.mapper;

import com.hedgehog.domain.biz_channel;
import com.hedgehog.domain.biz_channelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface biz_channelMapper {
    int countByExample(biz_channelExample example);

    int deleteByExample(biz_channelExample example);

    int deleteByPrimaryKey(Integer channelid);

    int insert(biz_channel record);

    int insertSelective(biz_channel record);

    List<biz_channel> selectByExample(biz_channelExample example);

    biz_channel selectByPrimaryKey(Integer channelid);
    biz_channel selectByChannelCode(String ch_code);//ԭ��ע�ͣ������õ� ȡ��ע��(��Ȼxml�����ļ�������ڸ�ID��ѯ ���������õ�)
    
    int updateByExampleSelective(@Param("record") biz_channel record, @Param("example") biz_channelExample example);

    int updateByExample(@Param("record") biz_channel record, @Param("example") biz_channelExample example);

    int updateByPrimaryKeySelective(biz_channel record);

    int updateByPrimaryKey(biz_channel record);
}