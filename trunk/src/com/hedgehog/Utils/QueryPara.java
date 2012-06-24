package com.hedgehog.Utils;

import java.util.List;
import java.util.Map;

import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;

/**
 * @author Administrator
 *
 */
public class QueryPara {
	private String HQL;

	/**
	 * @return
	 */
	public String getHQL() {
		return HQL;
	}

	/**
	 * @param hql
	 */
	public void setHQL(String hql) {
		HQL = hql;
	}
	private int pagesize;
	private int pageNo;
	private Class Clazz;
	private List<Criterion> criterions;
	private List<Order> orders;
	private int recordcount;
	private int pagecount;

	public int getPagesize() {
		return pagesize;
	}

	public void setPagesize(int pagesize) {
		this.pagesize = pagesize;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public Class getClazz() {
		return Clazz;
	}

	public void setClazz(Class clazz) {
		Clazz = clazz;
	}

	public List<Criterion> getCriterions() {
		return criterions;
	}

	public void setCriterions(List<Criterion> criterions) {
		this.criterions = criterions;
	}

	
	public int getRecordcount() {
		return recordcount;
	}

	/**
	 * @param recordcount
	 */
	public void setRecordcount(int recordcount) {
		this.recordcount = recordcount;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public int getPagecount() {
		return pagecount;
	}

	public void setPagecount(int pagecount) {
		this.pagecount = pagecount;
	}

}
