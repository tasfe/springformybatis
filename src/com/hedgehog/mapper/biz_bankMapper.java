package com.hedgehog.mapper;

import com.hedgehog.domain.biz_bank;
import com.hedgehog.domain.biz_bankExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface biz_bankMapper {
    int countByExample(biz_bankExample example);

    int deleteByExample(biz_bankExample example);

    int deleteByPrimaryKey(Long bankid);

    int insert(biz_bank record);

    int insertSelective(biz_bank record);

    List<biz_bank> selectByExample(biz_bankExample example);

    biz_bank selectByPrimaryKey(Long bankid);

    int updateByExampleSelective(@Param("record") biz_bank record, @Param("example") biz_bankExample example);

    int updateByExample(@Param("record") biz_bank record, @Param("example") biz_bankExample example);

    int updateByPrimaryKeySelective(biz_bank record);

    int updateByPrimaryKey(biz_bank record);
}