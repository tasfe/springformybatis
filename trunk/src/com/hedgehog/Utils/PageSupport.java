package com.hedgehog.Utils;
import java.io.Serializable;
import java.util.List;

public class PageSupport implements Serializable{
	private List resultList;
	private QueryPara qp;
	public List getResultList() {
		return resultList;
	}
	public void setResultList(List resultList) {
		this.resultList = resultList;
	}
	public QueryPara getQp() {
		return qp;
	}
	public void setQp(QueryPara qp) {
		this.qp = qp;
	}
	public PageSupport(List resultList, QueryPara qp) {
		//super();
		this.resultList = resultList;
		this.qp = qp;
	}

}
