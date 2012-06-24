package com.hedgehog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.hedgehog.domain.QueryParam;
import com.hedgehog.domain.biz_member;
import com.hedgehog.domain.biz_prank;
import com.hedgehog.domain.biz_rank;
import com.hedgehog.domain.biz_website;
import com.hedgehog.mapper.NewsMapper;
import com.hedgehog.mapper.biz_memberMapper;
import com.hedgehog.mapper.biz_prankMapper;
import com.hedgehog.mapper.biz_rankMapper;
import com.hedgehog.mapper.biz_websiteMapper;

@Service("memberService")
@Transactional(propagation=Propagation.REQUIRED)
public class MemberServiceMapperImpl implements MemberService {

	private biz_memberMapper memberMapper;
	public List<biz_member> selectRecordInPager(QueryParam qp) {
		// TODO Auto-generated method stub
		return this.memberMapper.selectRecordInPager(qp);
	}
	
	@Autowired
	public void setMemberMapper(biz_memberMapper memberMapper) {
		this.memberMapper = memberMapper;
	}
	
	private biz_websiteMapper websiteMapper;
	
	@Autowired
	public void setWebsiteMapper(biz_websiteMapper websiteMapper) {
		this.websiteMapper = websiteMapper;
	}

	public int insertSelective(biz_member record) {
		// TODO Auto-generated method stub
		return this.memberMapper.insertSelective(record);
	}

	public int insert(biz_member record) {
		// TODO Auto-generated method stub
		return this.memberMapper.insert(record);
	}
/*
 * (non-Javadoc)
 * @see com.hedgehog.service.MemberService#insertmemberpro(com.hedgehog.domain.biz_member)
 */
	public int insertmemberpro(biz_member record,biz_website record2) {
		// TODO Auto-generated method stub
		 this.memberMapper.insertmemberpro(record);
		 
		 record2.setwMemberid(record.getMemberid());
		 
		 this.websiteMapper.insertSelective(record2);
		 return 1;
		
	}

	public int deleteByPrimaryKey(Integer memberid) {
		// TODO Auto-generated method stub
		return this.memberMapper.deleteByPrimaryKey(memberid);
	}

	public boolean isExist(String username) {
		// TODO Auto-generated method stub		
		if(this.memberMapper.isExist(username)>0)
		{			
			return true;
		}		
		return false;
	}

	public boolean authenticate(biz_member record) {
		// TODO Auto-generated method stub
		if(this.memberMapper.authenticate(record)>0)
		{
			return true;
		}
		return false;
	}

	public biz_member selectByUsername(String username) {
		// TODO Auto-generated method stub
		return this.memberMapper.selectByUsername(username);
	}

	public biz_member selectByPrimaryKey(Integer memberid) {
		// TODO Auto-generated method stub
		return this.memberMapper.selectByPrimaryKey(memberid);
	}

	public int updateByPrimaryKeySelective(biz_member record) {
		// TODO Auto-generated method stub
		return this.memberMapper.updateByPrimaryKeySelective(record);
	}
	private biz_rankMapper rankMapper;
	@Autowired
	public void setRankMapper(biz_rankMapper rankMapper) {
		this.rankMapper = rankMapper;
	}
	private biz_prankMapper prankMapper;
	@Autowired
	public void setPrankMapper(biz_prankMapper prankMapper) {
		this.prankMapper = prankMapper;
	}

	public biz_prank selectPrankByPrimaryKey(Integer prankid) {
		// TODO Auto-generated method stub
		return this.prankMapper.selectByPrimaryKey(prankid);
	}
	
	public List<biz_prank> selectPrankAllRecord() {
		// TODO Auto-generated method stub
		return this.prankMapper.selectAllRecord();
	}

	public List<biz_rank> selectRankByParentid(Integer prankid) {
		// TODO Auto-generated method stub
		return this.rankMapper.selectByParentid(prankid);
	}

	public biz_rank selectRankByPrimaryKey(Integer rankid) {
		// TODO Auto-generated method stub
		return this.rankMapper.selectByPrimaryKey(rankid);
	}

}
