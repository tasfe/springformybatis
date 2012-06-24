package com.hedgehog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hedgehog.domain.QueryParam;
import com.hedgehog.domain.web_product;
import com.hedgehog.domain.web_productclass;
import com.hedgehog.mapper.web_productMapper;
import com.hedgehog.mapper.web_productclassMapper;

@Service("webProductService")
public class WebProductServiceMapperImpl implements WebProductService{
	
	private web_productclassMapper productclassMapper;	
	@Autowired
	public void setProductclassMapper(web_productclassMapper productclassMapper) {
		this.productclassMapper = productclassMapper;
	}	
	
	public int deleteByPrimaryKey(Integer productclassid) {
		// TODO Auto-generated method stub
		return this.productclassMapper.deleteByPrimaryKey(productclassid);
	}
	public int insertSelective(web_productclass record) {
		// TODO Auto-generated method stub
		return this.productclassMapper.insertSelective(record);
	}
	public List<web_productclass> selectByMenuID(Integer pcMenuid) {
		// TODO Auto-generated method stub
		return this.productclassMapper.selectByMenuID(pcMenuid);
	}
	public web_productclass selectByPrimaryKey(Integer productclassid) {
		// TODO Auto-generated method stub
		return this.productclassMapper.selectByPrimaryKey(productclassid);
	}
	public int updateByPrimaryKeySelective(web_productclass record) {
		// TODO Auto-generated method stub
		return this.productclassMapper.updateByPrimaryKeySelective(record);
	}
	
	//下面是product部分
	
	private web_productMapper productMapper;
	@Autowired
	public void setProductMapper(web_productMapper productMapper) {
		this.productMapper = productMapper;
	}
	
	public int deleteProductByPrimaryKey(Integer productid) {
		// TODO Auto-generated method stub
		return this.productMapper.deleteByPrimaryKey(productid);
	}
	public int insertProductSelective(web_product record) {
		// TODO Auto-generated method stub
		return this.productMapper.insertSelective(record);
	}
	public int selectCountByClass(Integer classid) {
		// TODO Auto-generated method stub
		return this.productMapper.selectCountByClass(classid);
	}
	public web_product selectProductByPrimaryKey(Integer productid) {
		// TODO Auto-generated method stub
		return this.productMapper.selectByPrimaryKey(productid);
	}
	public List<web_product> selectWebProductInPager(QueryParam qp) {
		// TODO Auto-generated method stub
		return this.productMapper.selectWebProductInPager(qp);
	}
	public int updateProductByPrimaryKeySelective(web_product record) {
		// TODO Auto-generated method stub
		return this.productMapper.updateByPrimaryKeySelective(record);
	}

	

	

}
