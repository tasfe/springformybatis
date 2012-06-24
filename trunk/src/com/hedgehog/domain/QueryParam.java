package com.hedgehog.domain;

public class QueryParam {
	private String TableName;
	private String ReturnFields;
	private Integer PageSize=Integer.MAX_VALUE;
	private Integer PageIndex=1;
	private String Where="";
	private String Orderfld;
	private Integer OrderType=1;
	private Integer RecordCount;
	private Integer PageCount;
	public String getTableName() {
		return TableName;
	}
	public void setTableName(String tableName) {
		TableName = tableName;
	}
	public String getReturnFields() {
		return ReturnFields;
	}
	public void setReturnFields(String returnFields) {
		ReturnFields = returnFields;
	}
	public Integer getPageSize() {
		return PageSize;
	}
	public void setPageSize(Integer pageSize) {
		PageSize = pageSize;
	}
	public Integer getPageIndex() {
		return PageIndex;
	}
	public void setPageIndex(Integer pageIndex) {
		PageIndex = pageIndex;
	}
	public String getWhere() {
		return Where;
	}
	public void setWhere(String where) {
		Where = where;
	}
	public String getOrderfld() {
		return Orderfld;
	}
	public void setOrderfld(String orderfld) {
		Orderfld = orderfld;
	}
	public Integer getOrderType() {
		return OrderType;
	}
	public void setOrderType(Integer orderType) {
		OrderType = orderType;
	}
	public Integer getRecordCount() {
		return RecordCount;
	}
	public void setRecordCount(Integer recordCount) {
		RecordCount = recordCount;
	}
	public Integer getPageCount() {
		return PageCount;
	}
	public void setPageCount(Integer pageCount) {
		PageCount = pageCount;
	}

}
