package com.hedgehog.service;

import java.util.List;

import com.hedgehog.domain.biz_city;

public interface CityService {
	List<biz_city> selectAllRecord();
	List<biz_city> selectAllRecordBypro(Integer proid);
	biz_city selectByCode(String cityCode);
	

}
