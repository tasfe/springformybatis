package com.hedgehog.mapper;

import com.hedgehog.domain.QueryParam;
import com.hedgehog.domain.web_product;
import com.hedgehog.domain.web_supplyinfo;
import com.hedgehog.domain.web_supplyinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface web_supplyinfoMapper {
    int countByExample(web_supplyinfoExample example);

    int deleteByExample(web_supplyinfoExample example);

    int deleteByPrimaryKey(Integer supplyinfoid);

    int insert(web_supplyinfo record);

    int insertSelective(web_supplyinfo record);

    List<web_supplyinfo> selectByExampleWithBLOBs(web_supplyinfoExample example);

    List<web_supplyinfo> selectByExample(web_supplyinfoExample example);

    web_supplyinfo selectByPrimaryKey(Integer supplyinfoid);

    int updateByExampleSelective(@Param("record") web_supplyinfo record, @Param("example") web_supplyinfoExample example);

    int updateByExampleWithBLOBs(@Param("record") web_supplyinfo record, @Param("example") web_supplyinfoExample example);

    int updateByExample(@Param("record") web_supplyinfo record, @Param("example") web_supplyinfoExample example);

    int updateByPrimaryKeySelective(web_supplyinfo record);

    int updateByPrimaryKeyWithBLOBs(web_supplyinfo record);

    int updateByPrimaryKey(web_supplyinfo record);
    
    int selectCountByClass(Integer classid);
    
    List<web_supplyinfo> selectWebSupplyinfoInPager(QueryParam qp);
}