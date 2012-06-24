package com.hedgehog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hedgehog.domain.QueryParam;
import com.hedgehog.domain.biz_classinfo;
import com.hedgehog.domain.biz_classinfoclass;
import com.hedgehog.domain.biz_reply;
import com.hedgehog.domain.biz_templet;
import com.hedgehog.mapper.biz_classinfoMapper;
import com.hedgehog.mapper.biz_classinfoclassMapper;
import com.hedgehog.mapper.biz_replyMapper;

@Service("classinfoService")
public class ClassinfoServiceMapperImpl implements ClassinfoService{
	
	private biz_classinfoclassMapper classinfoclassMapper;
	@Autowired
	public void setClassinfoclassMapper(
			biz_classinfoclassMapper classinfoclassMapper) {
		this.classinfoclassMapper = classinfoclassMapper;
	}
	
	public List<biz_classinfoclass> selectcicAllRecord() {
		// TODO Auto-generated method stub
		return this.classinfoclassMapper.selectcicAllRecord();
	}
	public List<biz_classinfoclass> selectcicAllParentRecord() {
		// TODO Auto-generated method stub
		return this.classinfoclassMapper.selectcicAllParentRecord();
	}

	public List<biz_classinfoclass> selectcicByParentID(Integer cicid) {
		// TODO Auto-generated method stub
		return this.classinfoclassMapper.selectByParentID(cicid);
	}
	
	private biz_classinfoMapper classinfoMapper;
	
	@Autowired
	public void setClassinfoMapper(biz_classinfoMapper classinfoMapper) {
		this.classinfoMapper = classinfoMapper;
	}

	public int deleteByPrimaryKey(Integer classinfoid) {
		// TODO Auto-generated method stub
		return this.classinfoMapper.deleteByPrimaryKey(classinfoid);
	}

	public int insertSelective(biz_classinfo record) {
		// TODO Auto-generated method stub
		return this.classinfoMapper.insertSelective(record);
	}

	public biz_classinfo selectByPrimaryKey(Integer classinfoid) {
		// TODO Auto-generated method stub
		return this.classinfoMapper.selectByPrimaryKey(classinfoid);
	}

	public List<biz_classinfo> selectRecordInPager(QueryParam qp) {
		// TODO Auto-generated method stub
		return this.classinfoMapper.selectRecordInPager(qp);
	}

	public int updateByPrimaryKeySelective(biz_classinfo record) {
		// TODO Auto-generated method stub
		return this.classinfoMapper.updateByPrimaryKeySelective(record);
	}

	public biz_classinfoclass selectcicByPrimaryKey(Integer cicid) {
		// TODO Auto-generated method stub
		return this.classinfoclassMapper.selectByPrimaryKey(cicid);
	}
	
	private biz_replyMapper replyMapper;
	@Autowired
	public void setReplyMapper(biz_replyMapper replyMapper) {
		this.replyMapper = replyMapper;
	}

	public int deleteReplyByClassinfoid(Integer classinfoid) {
		// TODO Auto-generated method stub
		return this.replyMapper.deleteByClassinfoid(classinfoid);
	}

	public int deleteReplyByPrimaryKey(Integer replyid) {
		// TODO Auto-generated method stub
		return this.replyMapper.deleteByPrimaryKey(replyid);
	}

	public int insertReplySelective(biz_reply record) {
		// TODO Auto-generated method stub
		return this.replyMapper.insertSelective(record);
	}

	public List<biz_reply> selectReplyRecordInPager(QueryParam qp) {
		// TODO Auto-generated method stub
		return this.replyMapper.selectRecordInPager(qp);
	}

	

	

	

	
	

}
