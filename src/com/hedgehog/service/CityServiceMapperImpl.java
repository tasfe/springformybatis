package com.hedgehog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hedgehog.domain.biz_city;
import com.hedgehog.mapper.biz_cityMapper;

@Service("cityService")
public class CityServiceMapperImpl implements CityService{
	
	private biz_cityMapper cityMapper;
	
	@Autowired
	public void setCityMapper(biz_cityMapper cityMapper) {
		this.cityMapper = cityMapper;
	}

	public List<biz_city> selectAllRecord() {
		// TODO Auto-generated method stub
		return this.cityMapper.selectAllRecord();
	}

	public List<biz_city> selectAllRecordBypro(Integer proid) {
		// TODO Auto-generated method stub
		return this.cityMapper.selectAllRecordBypro(proid);
	}

	public biz_city selectByCode(String cityCode) {
		// TODO Auto-generated method stub
		return this.cityMapper.selectByCode(cityCode);
	}

	

}
