package com.hedgehog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hedgehog.domain.QueryParam;
import com.hedgehog.domain.web_supplyclass;
import com.hedgehog.domain.web_supplyinfo;
import com.hedgehog.mapper.web_supplyclassMapper;
import com.hedgehog.mapper.web_supplyinfoMapper;

@Service("webPurveyService")
public class WebPurveyServiceImpl implements WebPurveyService{
	
	private web_supplyclassMapper supplyclassMapper;
	@Autowired
	public void setSupplyclassMapper(web_supplyclassMapper supplyclassMapper) {
		this.supplyclassMapper = supplyclassMapper;
	}

	public int deleteByPrimaryKey(Integer supplyclassid) {
		// TODO Auto-generated method stub
		return this.supplyclassMapper.deleteByPrimaryKey(supplyclassid);
	}

	public int insertSelective(web_supplyclass record) {
		// TODO Auto-generated method stub
		return this.supplyclassMapper.insertSelective(record);
	}

	public List<web_supplyclass> selectByMenuID(Integer pcMenuid) {
		// TODO Auto-generated method stub
		return this.supplyclassMapper.selectByMenuID(pcMenuid);
	}

	public web_supplyclass selectByPrimaryKey(Integer supplyclassid) {
		// TODO Auto-generated method stub
		return this.supplyclassMapper.selectByPrimaryKey(supplyclassid);
	}

	public int updateByPrimaryKeySelective(web_supplyclass record) {
		// TODO Auto-generated method stub
		return this.supplyclassMapper.updateByPrimaryKeySelective(record);
	}
	
	private web_supplyinfoMapper supplyinfoMapper;
	@Autowired
	public void setSupplyinfoMapper(web_supplyinfoMapper supplyinfoMapper) {
		this.supplyinfoMapper = supplyinfoMapper;
	}

	public int deleteSupplyinfoByPrimaryKey(Integer Supplyinfoid) {
		// TODO Auto-generated method stub
		return this.supplyinfoMapper.deleteByPrimaryKey(Supplyinfoid);
	}

	public int insertSupplyinfoSelective(web_supplyinfo record) {
		// TODO Auto-generated method stub
		return this.supplyinfoMapper.insertSelective(record);
	}

	public int selectCountByClass(Integer classid) {
		// TODO Auto-generated method stub
		return this.supplyinfoMapper.selectCountByClass(classid);
	}

	public web_supplyinfo selectSupplyinfoByPrimaryKey(Integer Supplyinfoid) {
		// TODO Auto-generated method stub
		return this.supplyinfoMapper.selectByPrimaryKey(Supplyinfoid);
	}

	public List<web_supplyinfo> selectWebSupplyinfoInPager(QueryParam qp) {
		// TODO Auto-generated method stub
		return this.supplyinfoMapper.selectWebSupplyinfoInPager(qp);
	}

	public int updateSupplyinfoByPrimaryKeySelective(web_supplyinfo record) {
		// TODO Auto-generated method stub
		return this.supplyinfoMapper.updateByPrimaryKeySelective(record);
	}

}
