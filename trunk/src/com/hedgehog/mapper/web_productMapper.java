package com.hedgehog.mapper;

import com.hedgehog.domain.QueryParam;
import com.hedgehog.domain.web_product;
import com.hedgehog.domain.web_productExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface web_productMapper {
    int countByExample(web_productExample example);

    int deleteByExample(web_productExample example);

    int deleteByPrimaryKey(Integer productid);

    int insert(web_product record);

    int insertSelective(web_product record);

    List<web_product> selectByExampleWithBLOBs(web_productExample example);

    List<web_product> selectByExample(web_productExample example);

    web_product selectByPrimaryKey(Integer productid);

    int updateByExampleSelective(@Param("record") web_product record, @Param("example") web_productExample example);

    int updateByExampleWithBLOBs(@Param("record") web_product record, @Param("example") web_productExample example);

    int updateByExample(@Param("record") web_product record, @Param("example") web_productExample example);

    int updateByPrimaryKeySelective(web_product record);

    int updateByPrimaryKeyWithBLOBs(web_product record);

    int updateByPrimaryKey(web_product record);
    
    int selectCountByClass(Integer classid);
    
    List<web_product> selectWebProductInPager(QueryParam qp);
}