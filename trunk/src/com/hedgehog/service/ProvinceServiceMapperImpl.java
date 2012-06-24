package com.hedgehog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hedgehog.domain.biz_province;
import com.hedgehog.mapper.biz_provinceMapper;

@Service("provinceService")
public class ProvinceServiceMapperImpl implements  ProvinceService{
	
	private biz_provinceMapper provincemapper;
	
	@Autowired
	public void setProvincemapper(biz_provinceMapper provincemapper) {
		this.provincemapper = provincemapper;
	}

	public List<biz_province> selectAllRecord() {
		// TODO Auto-generated method stub
		return this.provincemapper.selectAllRecord();
	}
	

}
