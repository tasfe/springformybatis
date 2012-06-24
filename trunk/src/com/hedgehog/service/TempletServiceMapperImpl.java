package com.hedgehog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hedgehog.domain.QueryParam;
import com.hedgehog.domain.biz_templet;
import com.hedgehog.domain.biz_templet_class;
import com.hedgehog.mapper.biz_templetMapper;
import com.hedgehog.mapper.biz_templet_classMapper;

@Service("templetService")
public class TempletServiceMapperImpl implements TempletService{
	private biz_templetMapper templetMapper;
	@Autowired
	public void setTempletMapper(biz_templetMapper templetMapper) {
		this.templetMapper = templetMapper;
	}
	private biz_templet_classMapper templetclassMapper;
	@Autowired
	public void setTempletclassMapper(biz_templet_classMapper templetclassMapper) {
		this.templetclassMapper = templetclassMapper;
	}

	public int deleteByPrimaryKey(Integer templetid) {
		// TODO Auto-generated method stub
		return this.templetMapper.deleteByPrimaryKey(templetid);
	}

	public int insertSelective(biz_templet record) {
		// TODO Auto-generated method stub
		return this.templetMapper.insertSelective(record);
	}

	public biz_templet selectByPrimaryKey(Integer templetid) {
		// TODO Auto-generated method stub
		return this.templetMapper.selectByPrimaryKey(templetid);
	}

	public List<biz_templet> selectRecordInPager(QueryParam qp) {
		// TODO Auto-generated method stub
		return this.templetMapper.selectRecordInPager(qp);
	}

	public int updateByPrimaryKeySelective(biz_templet record) {
		// TODO Auto-generated method stub
		return this.templetMapper.updateByPrimaryKeySelective(record);
	}

	public List<biz_templet_class> selectTempletclassAllRecord() {
		// TODO Auto-generated method stub
		return this.templetclassMapper.selectTempletclassAllRecord();
	}

	public biz_templet selectByCode(String templetCode) {
		// TODO Auto-generated method stub
		return this.templetMapper.selectByCode(templetCode);
	}

	public biz_templet_class selectTempletclassByArray(Integer arraylist) {
		// TODO Auto-generated method stub
		return this.templetclassMapper.selectTempletclassByArray(arraylist);
	}

	

	

}
