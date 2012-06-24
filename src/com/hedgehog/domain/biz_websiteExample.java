package com.hedgehog.domain;

import java.util.ArrayList;
import java.util.List;

public class biz_websiteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public biz_websiteExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andWebsiteidIsNull() {
            addCriterion("websiteID is null");
            return (Criteria) this;
        }

        public Criteria andWebsiteidIsNotNull() {
            addCriterion("websiteID is not null");
            return (Criteria) this;
        }

        public Criteria andWebsiteidEqualTo(Integer value) {
            addCriterion("websiteID =", value, "websiteid");
            return (Criteria) this;
        }

        public Criteria andWebsiteidNotEqualTo(Integer value) {
            addCriterion("websiteID <>", value, "websiteid");
            return (Criteria) this;
        }

        public Criteria andWebsiteidGreaterThan(Integer value) {
            addCriterion("websiteID >", value, "websiteid");
            return (Criteria) this;
        }

        public Criteria andWebsiteidGreaterThanOrEqualTo(Integer value) {
            addCriterion("websiteID >=", value, "websiteid");
            return (Criteria) this;
        }

        public Criteria andWebsiteidLessThan(Integer value) {
            addCriterion("websiteID <", value, "websiteid");
            return (Criteria) this;
        }

        public Criteria andWebsiteidLessThanOrEqualTo(Integer value) {
            addCriterion("websiteID <=", value, "websiteid");
            return (Criteria) this;
        }

        public Criteria andWebsiteidIn(List<Integer> values) {
            addCriterion("websiteID in", values, "websiteid");
            return (Criteria) this;
        }

        public Criteria andWebsiteidNotIn(List<Integer> values) {
            addCriterion("websiteID not in", values, "websiteid");
            return (Criteria) this;
        }

        public Criteria andWebsiteidBetween(Integer value1, Integer value2) {
            addCriterion("websiteID between", value1, value2, "websiteid");
            return (Criteria) this;
        }

        public Criteria andWebsiteidNotBetween(Integer value1, Integer value2) {
            addCriterion("websiteID not between", value1, value2, "websiteid");
            return (Criteria) this;
        }

        public Criteria andWMemberidIsNull() {
            addCriterion("w_memberID is null");
            return (Criteria) this;
        }

        public Criteria andWMemberidIsNotNull() {
            addCriterion("w_memberID is not null");
            return (Criteria) this;
        }

        public Criteria andWMemberidEqualTo(Integer value) {
            addCriterion("w_memberID =", value, "wMemberid");
            return (Criteria) this;
        }

        public Criteria andWMemberidNotEqualTo(Integer value) {
            addCriterion("w_memberID <>", value, "wMemberid");
            return (Criteria) this;
        }

        public Criteria andWMemberidGreaterThan(Integer value) {
            addCriterion("w_memberID >", value, "wMemberid");
            return (Criteria) this;
        }

        public Criteria andWMemberidGreaterThanOrEqualTo(Integer value) {
            addCriterion("w_memberID >=", value, "wMemberid");
            return (Criteria) this;
        }

        public Criteria andWMemberidLessThan(Integer value) {
            addCriterion("w_memberID <", value, "wMemberid");
            return (Criteria) this;
        }

        public Criteria andWMemberidLessThanOrEqualTo(Integer value) {
            addCriterion("w_memberID <=", value, "wMemberid");
            return (Criteria) this;
        }

        public Criteria andWMemberidIn(List<Integer> values) {
            addCriterion("w_memberID in", values, "wMemberid");
            return (Criteria) this;
        }

        public Criteria andWMemberidNotIn(List<Integer> values) {
            addCriterion("w_memberID not in", values, "wMemberid");
            return (Criteria) this;
        }

        public Criteria andWMemberidBetween(Integer value1, Integer value2) {
            addCriterion("w_memberID between", value1, value2, "wMemberid");
            return (Criteria) this;
        }

        public Criteria andWMemberidNotBetween(Integer value1, Integer value2) {
            addCriterion("w_memberID not between", value1, value2, "wMemberid");
            return (Criteria) this;
        }

        public Criteria andWTempletIsNull() {
            addCriterion("w_templet is null");
            return (Criteria) this;
        }

        public Criteria andWTempletIsNotNull() {
            addCriterion("w_templet is not null");
            return (Criteria) this;
        }

        public Criteria andWTempletEqualTo(String value) {
            addCriterion("w_templet =", value, "wTemplet");
            return (Criteria) this;
        }

        public Criteria andWTempletNotEqualTo(String value) {
            addCriterion("w_templet <>", value, "wTemplet");
            return (Criteria) this;
        }

        public Criteria andWTempletGreaterThan(String value) {
            addCriterion("w_templet >", value, "wTemplet");
            return (Criteria) this;
        }

        public Criteria andWTempletGreaterThanOrEqualTo(String value) {
            addCriterion("w_templet >=", value, "wTemplet");
            return (Criteria) this;
        }

        public Criteria andWTempletLessThan(String value) {
            addCriterion("w_templet <", value, "wTemplet");
            return (Criteria) this;
        }

        public Criteria andWTempletLessThanOrEqualTo(String value) {
            addCriterion("w_templet <=", value, "wTemplet");
            return (Criteria) this;
        }

        public Criteria andWTempletLike(String value) {
            addCriterion("w_templet like", value, "wTemplet");
            return (Criteria) this;
        }

        public Criteria andWTempletNotLike(String value) {
            addCriterion("w_templet not like", value, "wTemplet");
            return (Criteria) this;
        }

        public Criteria andWTempletIn(List<String> values) {
            addCriterion("w_templet in", values, "wTemplet");
            return (Criteria) this;
        }

        public Criteria andWTempletNotIn(List<String> values) {
            addCriterion("w_templet not in", values, "wTemplet");
            return (Criteria) this;
        }

        public Criteria andWTempletBetween(String value1, String value2) {
            addCriterion("w_templet between", value1, value2, "wTemplet");
            return (Criteria) this;
        }

        public Criteria andWTempletNotBetween(String value1, String value2) {
            addCriterion("w_templet not between", value1, value2, "wTemplet");
            return (Criteria) this;
        }

        public Criteria andWBcomtypeIsNull() {
            addCriterion("w_BComType is null");
            return (Criteria) this;
        }

        public Criteria andWBcomtypeIsNotNull() {
            addCriterion("w_BComType is not null");
            return (Criteria) this;
        }

        public Criteria andWBcomtypeEqualTo(String value) {
            addCriterion("w_BComType =", value, "wBcomtype");
            return (Criteria) this;
        }

        public Criteria andWBcomtypeNotEqualTo(String value) {
            addCriterion("w_BComType <>", value, "wBcomtype");
            return (Criteria) this;
        }

        public Criteria andWBcomtypeGreaterThan(String value) {
            addCriterion("w_BComType >", value, "wBcomtype");
            return (Criteria) this;
        }

        public Criteria andWBcomtypeGreaterThanOrEqualTo(String value) {
            addCriterion("w_BComType >=", value, "wBcomtype");
            return (Criteria) this;
        }

        public Criteria andWBcomtypeLessThan(String value) {
            addCriterion("w_BComType <", value, "wBcomtype");
            return (Criteria) this;
        }

        public Criteria andWBcomtypeLessThanOrEqualTo(String value) {
            addCriterion("w_BComType <=", value, "wBcomtype");
            return (Criteria) this;
        }

        public Criteria andWBcomtypeLike(String value) {
            addCriterion("w_BComType like", value, "wBcomtype");
            return (Criteria) this;
        }

        public Criteria andWBcomtypeNotLike(String value) {
            addCriterion("w_BComType not like", value, "wBcomtype");
            return (Criteria) this;
        }

        public Criteria andWBcomtypeIn(List<String> values) {
            addCriterion("w_BComType in", values, "wBcomtype");
            return (Criteria) this;
        }

        public Criteria andWBcomtypeNotIn(List<String> values) {
            addCriterion("w_BComType not in", values, "wBcomtype");
            return (Criteria) this;
        }

        public Criteria andWBcomtypeBetween(String value1, String value2) {
            addCriterion("w_BComType between", value1, value2, "wBcomtype");
            return (Criteria) this;
        }

        public Criteria andWBcomtypeNotBetween(String value1, String value2) {
            addCriterion("w_BComType not between", value1, value2, "wBcomtype");
            return (Criteria) this;
        }

        public Criteria andWScomtypeIsNull() {
            addCriterion("w_SComType is null");
            return (Criteria) this;
        }

        public Criteria andWScomtypeIsNotNull() {
            addCriterion("w_SComType is not null");
            return (Criteria) this;
        }

        public Criteria andWScomtypeEqualTo(Integer value) {
            addCriterion("w_SComType =", value, "wScomtype");
            return (Criteria) this;
        }

        public Criteria andWScomtypeNotEqualTo(Integer value) {
            addCriterion("w_SComType <>", value, "wScomtype");
            return (Criteria) this;
        }

        public Criteria andWScomtypeGreaterThan(Integer value) {
            addCriterion("w_SComType >", value, "wScomtype");
            return (Criteria) this;
        }

        public Criteria andWScomtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("w_SComType >=", value, "wScomtype");
            return (Criteria) this;
        }

        public Criteria andWScomtypeLessThan(Integer value) {
            addCriterion("w_SComType <", value, "wScomtype");
            return (Criteria) this;
        }

        public Criteria andWScomtypeLessThanOrEqualTo(Integer value) {
            addCriterion("w_SComType <=", value, "wScomtype");
            return (Criteria) this;
        }

        public Criteria andWScomtypeIn(List<Integer> values) {
            addCriterion("w_SComType in", values, "wScomtype");
            return (Criteria) this;
        }

        public Criteria andWScomtypeNotIn(List<Integer> values) {
            addCriterion("w_SComType not in", values, "wScomtype");
            return (Criteria) this;
        }

        public Criteria andWScomtypeBetween(Integer value1, Integer value2) {
            addCriterion("w_SComType between", value1, value2, "wScomtype");
            return (Criteria) this;
        }

        public Criteria andWScomtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("w_SComType not between", value1, value2, "wScomtype");
            return (Criteria) this;
        }

        public Criteria andWComnameIsNull() {
            addCriterion("w_ComName is null");
            return (Criteria) this;
        }

        public Criteria andWComnameIsNotNull() {
            addCriterion("w_ComName is not null");
            return (Criteria) this;
        }

        public Criteria andWComnameEqualTo(String value) {
            addCriterion("w_ComName =", value, "wComname");
            return (Criteria) this;
        }

        public Criteria andWComnameNotEqualTo(String value) {
            addCriterion("w_ComName <>", value, "wComname");
            return (Criteria) this;
        }

        public Criteria andWComnameGreaterThan(String value) {
            addCriterion("w_ComName >", value, "wComname");
            return (Criteria) this;
        }

        public Criteria andWComnameGreaterThanOrEqualTo(String value) {
            addCriterion("w_ComName >=", value, "wComname");
            return (Criteria) this;
        }

        public Criteria andWComnameLessThan(String value) {
            addCriterion("w_ComName <", value, "wComname");
            return (Criteria) this;
        }

        public Criteria andWComnameLessThanOrEqualTo(String value) {
            addCriterion("w_ComName <=", value, "wComname");
            return (Criteria) this;
        }

        public Criteria andWComnameLike(String value) {
            addCriterion("w_ComName like", value, "wComname");
            return (Criteria) this;
        }

        public Criteria andWComnameNotLike(String value) {
            addCriterion("w_ComName not like", value, "wComname");
            return (Criteria) this;
        }

        public Criteria andWComnameIn(List<String> values) {
            addCriterion("w_ComName in", values, "wComname");
            return (Criteria) this;
        }

        public Criteria andWComnameNotIn(List<String> values) {
            addCriterion("w_ComName not in", values, "wComname");
            return (Criteria) this;
        }

        public Criteria andWComnameBetween(String value1, String value2) {
            addCriterion("w_ComName between", value1, value2, "wComname");
            return (Criteria) this;
        }

        public Criteria andWComnameNotBetween(String value1, String value2) {
            addCriterion("w_ComName not between", value1, value2, "wComname");
            return (Criteria) this;
        }

        public Criteria andWTitleIsNull() {
            addCriterion("w_Title is null");
            return (Criteria) this;
        }

        public Criteria andWTitleIsNotNull() {
            addCriterion("w_Title is not null");
            return (Criteria) this;
        }

        public Criteria andWTitleEqualTo(String value) {
            addCriterion("w_Title =", value, "wTitle");
            return (Criteria) this;
        }

        public Criteria andWTitleNotEqualTo(String value) {
            addCriterion("w_Title <>", value, "wTitle");
            return (Criteria) this;
        }

        public Criteria andWTitleGreaterThan(String value) {
            addCriterion("w_Title >", value, "wTitle");
            return (Criteria) this;
        }

        public Criteria andWTitleGreaterThanOrEqualTo(String value) {
            addCriterion("w_Title >=", value, "wTitle");
            return (Criteria) this;
        }

        public Criteria andWTitleLessThan(String value) {
            addCriterion("w_Title <", value, "wTitle");
            return (Criteria) this;
        }

        public Criteria andWTitleLessThanOrEqualTo(String value) {
            addCriterion("w_Title <=", value, "wTitle");
            return (Criteria) this;
        }

        public Criteria andWTitleLike(String value) {
            addCriterion("w_Title like", value, "wTitle");
            return (Criteria) this;
        }

        public Criteria andWTitleNotLike(String value) {
            addCriterion("w_Title not like", value, "wTitle");
            return (Criteria) this;
        }

        public Criteria andWTitleIn(List<String> values) {
            addCriterion("w_Title in", values, "wTitle");
            return (Criteria) this;
        }

        public Criteria andWTitleNotIn(List<String> values) {
            addCriterion("w_Title not in", values, "wTitle");
            return (Criteria) this;
        }

        public Criteria andWTitleBetween(String value1, String value2) {
            addCriterion("w_Title between", value1, value2, "wTitle");
            return (Criteria) this;
        }

        public Criteria andWTitleNotBetween(String value1, String value2) {
            addCriterion("w_Title not between", value1, value2, "wTitle");
            return (Criteria) this;
        }

        public Criteria andEcomnameIsNull() {
            addCriterion("eComName is null");
            return (Criteria) this;
        }

        public Criteria andEcomnameIsNotNull() {
            addCriterion("eComName is not null");
            return (Criteria) this;
        }

        public Criteria andEcomnameEqualTo(String value) {
            addCriterion("eComName =", value, "ecomname");
            return (Criteria) this;
        }

        public Criteria andEcomnameNotEqualTo(String value) {
            addCriterion("eComName <>", value, "ecomname");
            return (Criteria) this;
        }

        public Criteria andEcomnameGreaterThan(String value) {
            addCriterion("eComName >", value, "ecomname");
            return (Criteria) this;
        }

        public Criteria andEcomnameGreaterThanOrEqualTo(String value) {
            addCriterion("eComName >=", value, "ecomname");
            return (Criteria) this;
        }

        public Criteria andEcomnameLessThan(String value) {
            addCriterion("eComName <", value, "ecomname");
            return (Criteria) this;
        }

        public Criteria andEcomnameLessThanOrEqualTo(String value) {
            addCriterion("eComName <=", value, "ecomname");
            return (Criteria) this;
        }

        public Criteria andEcomnameLike(String value) {
            addCriterion("eComName like", value, "ecomname");
            return (Criteria) this;
        }

        public Criteria andEcomnameNotLike(String value) {
            addCriterion("eComName not like", value, "ecomname");
            return (Criteria) this;
        }

        public Criteria andEcomnameIn(List<String> values) {
            addCriterion("eComName in", values, "ecomname");
            return (Criteria) this;
        }

        public Criteria andEcomnameNotIn(List<String> values) {
            addCriterion("eComName not in", values, "ecomname");
            return (Criteria) this;
        }

        public Criteria andEcomnameBetween(String value1, String value2) {
            addCriterion("eComName between", value1, value2, "ecomname");
            return (Criteria) this;
        }

        public Criteria andEcomnameNotBetween(String value1, String value2) {
            addCriterion("eComName not between", value1, value2, "ecomname");
            return (Criteria) this;
        }

        public Criteria andWCityIsNull() {
            addCriterion("w_city is null");
            return (Criteria) this;
        }

        public Criteria andWCityIsNotNull() {
            addCriterion("w_city is not null");
            return (Criteria) this;
        }

        public Criteria andWCityEqualTo(Integer value) {
            addCriterion("w_city =", value, "wCity");
            return (Criteria) this;
        }

        public Criteria andWCityNotEqualTo(Integer value) {
            addCriterion("w_city <>", value, "wCity");
            return (Criteria) this;
        }

        public Criteria andWCityGreaterThan(Integer value) {
            addCriterion("w_city >", value, "wCity");
            return (Criteria) this;
        }

        public Criteria andWCityGreaterThanOrEqualTo(Integer value) {
            addCriterion("w_city >=", value, "wCity");
            return (Criteria) this;
        }

        public Criteria andWCityLessThan(Integer value) {
            addCriterion("w_city <", value, "wCity");
            return (Criteria) this;
        }

        public Criteria andWCityLessThanOrEqualTo(Integer value) {
            addCriterion("w_city <=", value, "wCity");
            return (Criteria) this;
        }

        public Criteria andWCityIn(List<Integer> values) {
            addCriterion("w_city in", values, "wCity");
            return (Criteria) this;
        }

        public Criteria andWCityNotIn(List<Integer> values) {
            addCriterion("w_city not in", values, "wCity");
            return (Criteria) this;
        }

        public Criteria andWCityBetween(Integer value1, Integer value2) {
            addCriterion("w_city between", value1, value2, "wCity");
            return (Criteria) this;
        }

        public Criteria andWCityNotBetween(Integer value1, Integer value2) {
            addCriterion("w_city not between", value1, value2, "wCity");
            return (Criteria) this;
        }

        public Criteria andWPropertyIsNull() {
            addCriterion("w_Property is null");
            return (Criteria) this;
        }

        public Criteria andWPropertyIsNotNull() {
            addCriterion("w_Property is not null");
            return (Criteria) this;
        }

        public Criteria andWPropertyEqualTo(String value) {
            addCriterion("w_Property =", value, "wProperty");
            return (Criteria) this;
        }

        public Criteria andWPropertyNotEqualTo(String value) {
            addCriterion("w_Property <>", value, "wProperty");
            return (Criteria) this;
        }

        public Criteria andWPropertyGreaterThan(String value) {
            addCriterion("w_Property >", value, "wProperty");
            return (Criteria) this;
        }

        public Criteria andWPropertyGreaterThanOrEqualTo(String value) {
            addCriterion("w_Property >=", value, "wProperty");
            return (Criteria) this;
        }

        public Criteria andWPropertyLessThan(String value) {
            addCriterion("w_Property <", value, "wProperty");
            return (Criteria) this;
        }

        public Criteria andWPropertyLessThanOrEqualTo(String value) {
            addCriterion("w_Property <=", value, "wProperty");
            return (Criteria) this;
        }

        public Criteria andWPropertyLike(String value) {
            addCriterion("w_Property like", value, "wProperty");
            return (Criteria) this;
        }

        public Criteria andWPropertyNotLike(String value) {
            addCriterion("w_Property not like", value, "wProperty");
            return (Criteria) this;
        }

        public Criteria andWPropertyIn(List<String> values) {
            addCriterion("w_Property in", values, "wProperty");
            return (Criteria) this;
        }

        public Criteria andWPropertyNotIn(List<String> values) {
            addCriterion("w_Property not in", values, "wProperty");
            return (Criteria) this;
        }

        public Criteria andWPropertyBetween(String value1, String value2) {
            addCriterion("w_Property between", value1, value2, "wProperty");
            return (Criteria) this;
        }

        public Criteria andWPropertyNotBetween(String value1, String value2) {
            addCriterion("w_Property not between", value1, value2, "wProperty");
            return (Criteria) this;
        }

        public Criteria andWAddressIsNull() {
            addCriterion("w_Address is null");
            return (Criteria) this;
        }

        public Criteria andWAddressIsNotNull() {
            addCriterion("w_Address is not null");
            return (Criteria) this;
        }

        public Criteria andWAddressEqualTo(String value) {
            addCriterion("w_Address =", value, "wAddress");
            return (Criteria) this;
        }

        public Criteria andWAddressNotEqualTo(String value) {
            addCriterion("w_Address <>", value, "wAddress");
            return (Criteria) this;
        }

        public Criteria andWAddressGreaterThan(String value) {
            addCriterion("w_Address >", value, "wAddress");
            return (Criteria) this;
        }

        public Criteria andWAddressGreaterThanOrEqualTo(String value) {
            addCriterion("w_Address >=", value, "wAddress");
            return (Criteria) this;
        }

        public Criteria andWAddressLessThan(String value) {
            addCriterion("w_Address <", value, "wAddress");
            return (Criteria) this;
        }

        public Criteria andWAddressLessThanOrEqualTo(String value) {
            addCriterion("w_Address <=", value, "wAddress");
            return (Criteria) this;
        }

        public Criteria andWAddressLike(String value) {
            addCriterion("w_Address like", value, "wAddress");
            return (Criteria) this;
        }

        public Criteria andWAddressNotLike(String value) {
            addCriterion("w_Address not like", value, "wAddress");
            return (Criteria) this;
        }

        public Criteria andWAddressIn(List<String> values) {
            addCriterion("w_Address in", values, "wAddress");
            return (Criteria) this;
        }

        public Criteria andWAddressNotIn(List<String> values) {
            addCriterion("w_Address not in", values, "wAddress");
            return (Criteria) this;
        }

        public Criteria andWAddressBetween(String value1, String value2) {
            addCriterion("w_Address between", value1, value2, "wAddress");
            return (Criteria) this;
        }

        public Criteria andWAddressNotBetween(String value1, String value2) {
            addCriterion("w_Address not between", value1, value2, "wAddress");
            return (Criteria) this;
        }

        public Criteria andWMailIsNull() {
            addCriterion("w_Mail is null");
            return (Criteria) this;
        }

        public Criteria andWMailIsNotNull() {
            addCriterion("w_Mail is not null");
            return (Criteria) this;
        }

        public Criteria andWMailEqualTo(String value) {
            addCriterion("w_Mail =", value, "wMail");
            return (Criteria) this;
        }

        public Criteria andWMailNotEqualTo(String value) {
            addCriterion("w_Mail <>", value, "wMail");
            return (Criteria) this;
        }

        public Criteria andWMailGreaterThan(String value) {
            addCriterion("w_Mail >", value, "wMail");
            return (Criteria) this;
        }

        public Criteria andWMailGreaterThanOrEqualTo(String value) {
            addCriterion("w_Mail >=", value, "wMail");
            return (Criteria) this;
        }

        public Criteria andWMailLessThan(String value) {
            addCriterion("w_Mail <", value, "wMail");
            return (Criteria) this;
        }

        public Criteria andWMailLessThanOrEqualTo(String value) {
            addCriterion("w_Mail <=", value, "wMail");
            return (Criteria) this;
        }

        public Criteria andWMailLike(String value) {
            addCriterion("w_Mail like", value, "wMail");
            return (Criteria) this;
        }

        public Criteria andWMailNotLike(String value) {
            addCriterion("w_Mail not like", value, "wMail");
            return (Criteria) this;
        }

        public Criteria andWMailIn(List<String> values) {
            addCriterion("w_Mail in", values, "wMail");
            return (Criteria) this;
        }

        public Criteria andWMailNotIn(List<String> values) {
            addCriterion("w_Mail not in", values, "wMail");
            return (Criteria) this;
        }

        public Criteria andWMailBetween(String value1, String value2) {
            addCriterion("w_Mail between", value1, value2, "wMail");
            return (Criteria) this;
        }

        public Criteria andWMailNotBetween(String value1, String value2) {
            addCriterion("w_Mail not between", value1, value2, "wMail");
            return (Criteria) this;
        }

        public Criteria andWTelIsNull() {
            addCriterion("w_tel is null");
            return (Criteria) this;
        }

        public Criteria andWTelIsNotNull() {
            addCriterion("w_tel is not null");
            return (Criteria) this;
        }

        public Criteria andWTelEqualTo(String value) {
            addCriterion("w_tel =", value, "wTel");
            return (Criteria) this;
        }

        public Criteria andWTelNotEqualTo(String value) {
            addCriterion("w_tel <>", value, "wTel");
            return (Criteria) this;
        }

        public Criteria andWTelGreaterThan(String value) {
            addCriterion("w_tel >", value, "wTel");
            return (Criteria) this;
        }

        public Criteria andWTelGreaterThanOrEqualTo(String value) {
            addCriterion("w_tel >=", value, "wTel");
            return (Criteria) this;
        }

        public Criteria andWTelLessThan(String value) {
            addCriterion("w_tel <", value, "wTel");
            return (Criteria) this;
        }

        public Criteria andWTelLessThanOrEqualTo(String value) {
            addCriterion("w_tel <=", value, "wTel");
            return (Criteria) this;
        }

        public Criteria andWTelLike(String value) {
            addCriterion("w_tel like", value, "wTel");
            return (Criteria) this;
        }

        public Criteria andWTelNotLike(String value) {
            addCriterion("w_tel not like", value, "wTel");
            return (Criteria) this;
        }

        public Criteria andWTelIn(List<String> values) {
            addCriterion("w_tel in", values, "wTel");
            return (Criteria) this;
        }

        public Criteria andWTelNotIn(List<String> values) {
            addCriterion("w_tel not in", values, "wTel");
            return (Criteria) this;
        }

        public Criteria andWTelBetween(String value1, String value2) {
            addCriterion("w_tel between", value1, value2, "wTel");
            return (Criteria) this;
        }

        public Criteria andWTelNotBetween(String value1, String value2) {
            addCriterion("w_tel not between", value1, value2, "wTel");
            return (Criteria) this;
        }

        public Criteria andWFaxIsNull() {
            addCriterion("w_fax is null");
            return (Criteria) this;
        }

        public Criteria andWFaxIsNotNull() {
            addCriterion("w_fax is not null");
            return (Criteria) this;
        }

        public Criteria andWFaxEqualTo(String value) {
            addCriterion("w_fax =", value, "wFax");
            return (Criteria) this;
        }

        public Criteria andWFaxNotEqualTo(String value) {
            addCriterion("w_fax <>", value, "wFax");
            return (Criteria) this;
        }

        public Criteria andWFaxGreaterThan(String value) {
            addCriterion("w_fax >", value, "wFax");
            return (Criteria) this;
        }

        public Criteria andWFaxGreaterThanOrEqualTo(String value) {
            addCriterion("w_fax >=", value, "wFax");
            return (Criteria) this;
        }

        public Criteria andWFaxLessThan(String value) {
            addCriterion("w_fax <", value, "wFax");
            return (Criteria) this;
        }

        public Criteria andWFaxLessThanOrEqualTo(String value) {
            addCriterion("w_fax <=", value, "wFax");
            return (Criteria) this;
        }

        public Criteria andWFaxLike(String value) {
            addCriterion("w_fax like", value, "wFax");
            return (Criteria) this;
        }

        public Criteria andWFaxNotLike(String value) {
            addCriterion("w_fax not like", value, "wFax");
            return (Criteria) this;
        }

        public Criteria andWFaxIn(List<String> values) {
            addCriterion("w_fax in", values, "wFax");
            return (Criteria) this;
        }

        public Criteria andWFaxNotIn(List<String> values) {
            addCriterion("w_fax not in", values, "wFax");
            return (Criteria) this;
        }

        public Criteria andWFaxBetween(String value1, String value2) {
            addCriterion("w_fax between", value1, value2, "wFax");
            return (Criteria) this;
        }

        public Criteria andWFaxNotBetween(String value1, String value2) {
            addCriterion("w_fax not between", value1, value2, "wFax");
            return (Criteria) this;
        }

        public Criteria andWZipIsNull() {
            addCriterion("w_zip is null");
            return (Criteria) this;
        }

        public Criteria andWZipIsNotNull() {
            addCriterion("w_zip is not null");
            return (Criteria) this;
        }

        public Criteria andWZipEqualTo(String value) {
            addCriterion("w_zip =", value, "wZip");
            return (Criteria) this;
        }

        public Criteria andWZipNotEqualTo(String value) {
            addCriterion("w_zip <>", value, "wZip");
            return (Criteria) this;
        }

        public Criteria andWZipGreaterThan(String value) {
            addCriterion("w_zip >", value, "wZip");
            return (Criteria) this;
        }

        public Criteria andWZipGreaterThanOrEqualTo(String value) {
            addCriterion("w_zip >=", value, "wZip");
            return (Criteria) this;
        }

        public Criteria andWZipLessThan(String value) {
            addCriterion("w_zip <", value, "wZip");
            return (Criteria) this;
        }

        public Criteria andWZipLessThanOrEqualTo(String value) {
            addCriterion("w_zip <=", value, "wZip");
            return (Criteria) this;
        }

        public Criteria andWZipLike(String value) {
            addCriterion("w_zip like", value, "wZip");
            return (Criteria) this;
        }

        public Criteria andWZipNotLike(String value) {
            addCriterion("w_zip not like", value, "wZip");
            return (Criteria) this;
        }

        public Criteria andWZipIn(List<String> values) {
            addCriterion("w_zip in", values, "wZip");
            return (Criteria) this;
        }

        public Criteria andWZipNotIn(List<String> values) {
            addCriterion("w_zip not in", values, "wZip");
            return (Criteria) this;
        }

        public Criteria andWZipBetween(String value1, String value2) {
            addCriterion("w_zip between", value1, value2, "wZip");
            return (Criteria) this;
        }

        public Criteria andWZipNotBetween(String value1, String value2) {
            addCriterion("w_zip not between", value1, value2, "wZip");
            return (Criteria) this;
        }

        public Criteria andWCallingIsNull() {
            addCriterion("w_calling is null");
            return (Criteria) this;
        }

        public Criteria andWCallingIsNotNull() {
            addCriterion("w_calling is not null");
            return (Criteria) this;
        }

        public Criteria andWCallingEqualTo(String value) {
            addCriterion("w_calling =", value, "wCalling");
            return (Criteria) this;
        }

        public Criteria andWCallingNotEqualTo(String value) {
            addCriterion("w_calling <>", value, "wCalling");
            return (Criteria) this;
        }

        public Criteria andWCallingGreaterThan(String value) {
            addCriterion("w_calling >", value, "wCalling");
            return (Criteria) this;
        }

        public Criteria andWCallingGreaterThanOrEqualTo(String value) {
            addCriterion("w_calling >=", value, "wCalling");
            return (Criteria) this;
        }

        public Criteria andWCallingLessThan(String value) {
            addCriterion("w_calling <", value, "wCalling");
            return (Criteria) this;
        }

        public Criteria andWCallingLessThanOrEqualTo(String value) {
            addCriterion("w_calling <=", value, "wCalling");
            return (Criteria) this;
        }

        public Criteria andWCallingLike(String value) {
            addCriterion("w_calling like", value, "wCalling");
            return (Criteria) this;
        }

        public Criteria andWCallingNotLike(String value) {
            addCriterion("w_calling not like", value, "wCalling");
            return (Criteria) this;
        }

        public Criteria andWCallingIn(List<String> values) {
            addCriterion("w_calling in", values, "wCalling");
            return (Criteria) this;
        }

        public Criteria andWCallingNotIn(List<String> values) {
            addCriterion("w_calling not in", values, "wCalling");
            return (Criteria) this;
        }

        public Criteria andWCallingBetween(String value1, String value2) {
            addCriterion("w_calling between", value1, value2, "wCalling");
            return (Criteria) this;
        }

        public Criteria andWCallingNotBetween(String value1, String value2) {
            addCriterion("w_calling not between", value1, value2, "wCalling");
            return (Criteria) this;
        }

        public Criteria andWContactsIsNull() {
            addCriterion("w_Contacts is null");
            return (Criteria) this;
        }

        public Criteria andWContactsIsNotNull() {
            addCriterion("w_Contacts is not null");
            return (Criteria) this;
        }

        public Criteria andWContactsEqualTo(String value) {
            addCriterion("w_Contacts =", value, "wContacts");
            return (Criteria) this;
        }

        public Criteria andWContactsNotEqualTo(String value) {
            addCriterion("w_Contacts <>", value, "wContacts");
            return (Criteria) this;
        }

        public Criteria andWContactsGreaterThan(String value) {
            addCriterion("w_Contacts >", value, "wContacts");
            return (Criteria) this;
        }

        public Criteria andWContactsGreaterThanOrEqualTo(String value) {
            addCriterion("w_Contacts >=", value, "wContacts");
            return (Criteria) this;
        }

        public Criteria andWContactsLessThan(String value) {
            addCriterion("w_Contacts <", value, "wContacts");
            return (Criteria) this;
        }

        public Criteria andWContactsLessThanOrEqualTo(String value) {
            addCriterion("w_Contacts <=", value, "wContacts");
            return (Criteria) this;
        }

        public Criteria andWContactsLike(String value) {
            addCriterion("w_Contacts like", value, "wContacts");
            return (Criteria) this;
        }

        public Criteria andWContactsNotLike(String value) {
            addCriterion("w_Contacts not like", value, "wContacts");
            return (Criteria) this;
        }

        public Criteria andWContactsIn(List<String> values) {
            addCriterion("w_Contacts in", values, "wContacts");
            return (Criteria) this;
        }

        public Criteria andWContactsNotIn(List<String> values) {
            addCriterion("w_Contacts not in", values, "wContacts");
            return (Criteria) this;
        }

        public Criteria andWContactsBetween(String value1, String value2) {
            addCriterion("w_Contacts between", value1, value2, "wContacts");
            return (Criteria) this;
        }

        public Criteria andWContactsNotBetween(String value1, String value2) {
            addCriterion("w_Contacts not between", value1, value2, "wContacts");
            return (Criteria) this;
        }

        public Criteria andWProvinceIsNull() {
            addCriterion("w_province is null");
            return (Criteria) this;
        }

        public Criteria andWProvinceIsNotNull() {
            addCriterion("w_province is not null");
            return (Criteria) this;
        }

        public Criteria andWProvinceEqualTo(Integer value) {
            addCriterion("w_province =", value, "wProvince");
            return (Criteria) this;
        }

        public Criteria andWProvinceNotEqualTo(Integer value) {
            addCriterion("w_province <>", value, "wProvince");
            return (Criteria) this;
        }

        public Criteria andWProvinceGreaterThan(Integer value) {
            addCriterion("w_province >", value, "wProvince");
            return (Criteria) this;
        }

        public Criteria andWProvinceGreaterThanOrEqualTo(Integer value) {
            addCriterion("w_province >=", value, "wProvince");
            return (Criteria) this;
        }

        public Criteria andWProvinceLessThan(Integer value) {
            addCriterion("w_province <", value, "wProvince");
            return (Criteria) this;
        }

        public Criteria andWProvinceLessThanOrEqualTo(Integer value) {
            addCriterion("w_province <=", value, "wProvince");
            return (Criteria) this;
        }

        public Criteria andWProvinceIn(List<Integer> values) {
            addCriterion("w_province in", values, "wProvince");
            return (Criteria) this;
        }

        public Criteria andWProvinceNotIn(List<Integer> values) {
            addCriterion("w_province not in", values, "wProvince");
            return (Criteria) this;
        }

        public Criteria andWProvinceBetween(Integer value1, Integer value2) {
            addCriterion("w_province between", value1, value2, "wProvince");
            return (Criteria) this;
        }

        public Criteria andWProvinceNotBetween(Integer value1, Integer value2) {
            addCriterion("w_province not between", value1, value2, "wProvince");
            return (Criteria) this;
        }

        public Criteria andWLogoIsNull() {
            addCriterion("w_Logo is null");
            return (Criteria) this;
        }

        public Criteria andWLogoIsNotNull() {
            addCriterion("w_Logo is not null");
            return (Criteria) this;
        }

        public Criteria andWLogoEqualTo(String value) {
            addCriterion("w_Logo =", value, "wLogo");
            return (Criteria) this;
        }

        public Criteria andWLogoNotEqualTo(String value) {
            addCriterion("w_Logo <>", value, "wLogo");
            return (Criteria) this;
        }

        public Criteria andWLogoGreaterThan(String value) {
            addCriterion("w_Logo >", value, "wLogo");
            return (Criteria) this;
        }

        public Criteria andWLogoGreaterThanOrEqualTo(String value) {
            addCriterion("w_Logo >=", value, "wLogo");
            return (Criteria) this;
        }

        public Criteria andWLogoLessThan(String value) {
            addCriterion("w_Logo <", value, "wLogo");
            return (Criteria) this;
        }

        public Criteria andWLogoLessThanOrEqualTo(String value) {
            addCriterion("w_Logo <=", value, "wLogo");
            return (Criteria) this;
        }

        public Criteria andWLogoLike(String value) {
            addCriterion("w_Logo like", value, "wLogo");
            return (Criteria) this;
        }

        public Criteria andWLogoNotLike(String value) {
            addCriterion("w_Logo not like", value, "wLogo");
            return (Criteria) this;
        }

        public Criteria andWLogoIn(List<String> values) {
            addCriterion("w_Logo in", values, "wLogo");
            return (Criteria) this;
        }

        public Criteria andWLogoNotIn(List<String> values) {
            addCriterion("w_Logo not in", values, "wLogo");
            return (Criteria) this;
        }

        public Criteria andWLogoBetween(String value1, String value2) {
            addCriterion("w_Logo between", value1, value2, "wLogo");
            return (Criteria) this;
        }

        public Criteria andWLogoNotBetween(String value1, String value2) {
            addCriterion("w_Logo not between", value1, value2, "wLogo");
            return (Criteria) this;
        }

        public Criteria andWLogohrefIsNull() {
            addCriterion("w_LogoHref is null");
            return (Criteria) this;
        }

        public Criteria andWLogohrefIsNotNull() {
            addCriterion("w_LogoHref is not null");
            return (Criteria) this;
        }

        public Criteria andWLogohrefEqualTo(String value) {
            addCriterion("w_LogoHref =", value, "wLogohref");
            return (Criteria) this;
        }

        public Criteria andWLogohrefNotEqualTo(String value) {
            addCriterion("w_LogoHref <>", value, "wLogohref");
            return (Criteria) this;
        }

        public Criteria andWLogohrefGreaterThan(String value) {
            addCriterion("w_LogoHref >", value, "wLogohref");
            return (Criteria) this;
        }

        public Criteria andWLogohrefGreaterThanOrEqualTo(String value) {
            addCriterion("w_LogoHref >=", value, "wLogohref");
            return (Criteria) this;
        }

        public Criteria andWLogohrefLessThan(String value) {
            addCriterion("w_LogoHref <", value, "wLogohref");
            return (Criteria) this;
        }

        public Criteria andWLogohrefLessThanOrEqualTo(String value) {
            addCriterion("w_LogoHref <=", value, "wLogohref");
            return (Criteria) this;
        }

        public Criteria andWLogohrefLike(String value) {
            addCriterion("w_LogoHref like", value, "wLogohref");
            return (Criteria) this;
        }

        public Criteria andWLogohrefNotLike(String value) {
            addCriterion("w_LogoHref not like", value, "wLogohref");
            return (Criteria) this;
        }

        public Criteria andWLogohrefIn(List<String> values) {
            addCriterion("w_LogoHref in", values, "wLogohref");
            return (Criteria) this;
        }

        public Criteria andWLogohrefNotIn(List<String> values) {
            addCriterion("w_LogoHref not in", values, "wLogohref");
            return (Criteria) this;
        }

        public Criteria andWLogohrefBetween(String value1, String value2) {
            addCriterion("w_LogoHref between", value1, value2, "wLogohref");
            return (Criteria) this;
        }

        public Criteria andWLogohrefNotBetween(String value1, String value2) {
            addCriterion("w_LogoHref not between", value1, value2, "wLogohref");
            return (Criteria) this;
        }

        public Criteria andWLogotitleIsNull() {
            addCriterion("w_LogoTitle is null");
            return (Criteria) this;
        }

        public Criteria andWLogotitleIsNotNull() {
            addCriterion("w_LogoTitle is not null");
            return (Criteria) this;
        }

        public Criteria andWLogotitleEqualTo(String value) {
            addCriterion("w_LogoTitle =", value, "wLogotitle");
            return (Criteria) this;
        }

        public Criteria andWLogotitleNotEqualTo(String value) {
            addCriterion("w_LogoTitle <>", value, "wLogotitle");
            return (Criteria) this;
        }

        public Criteria andWLogotitleGreaterThan(String value) {
            addCriterion("w_LogoTitle >", value, "wLogotitle");
            return (Criteria) this;
        }

        public Criteria andWLogotitleGreaterThanOrEqualTo(String value) {
            addCriterion("w_LogoTitle >=", value, "wLogotitle");
            return (Criteria) this;
        }

        public Criteria andWLogotitleLessThan(String value) {
            addCriterion("w_LogoTitle <", value, "wLogotitle");
            return (Criteria) this;
        }

        public Criteria andWLogotitleLessThanOrEqualTo(String value) {
            addCriterion("w_LogoTitle <=", value, "wLogotitle");
            return (Criteria) this;
        }

        public Criteria andWLogotitleLike(String value) {
            addCriterion("w_LogoTitle like", value, "wLogotitle");
            return (Criteria) this;
        }

        public Criteria andWLogotitleNotLike(String value) {
            addCriterion("w_LogoTitle not like", value, "wLogotitle");
            return (Criteria) this;
        }

        public Criteria andWLogotitleIn(List<String> values) {
            addCriterion("w_LogoTitle in", values, "wLogotitle");
            return (Criteria) this;
        }

        public Criteria andWLogotitleNotIn(List<String> values) {
            addCriterion("w_LogoTitle not in", values, "wLogotitle");
            return (Criteria) this;
        }

        public Criteria andWLogotitleBetween(String value1, String value2) {
            addCriterion("w_LogoTitle between", value1, value2, "wLogotitle");
            return (Criteria) this;
        }

        public Criteria andWLogotitleNotBetween(String value1, String value2) {
            addCriterion("w_LogoTitle not between", value1, value2, "wLogotitle");
            return (Criteria) this;
        }

        public Criteria andWCompanyIsNull() {
            addCriterion("w_Company is null");
            return (Criteria) this;
        }

        public Criteria andWCompanyIsNotNull() {
            addCriterion("w_Company is not null");
            return (Criteria) this;
        }

        public Criteria andWCompanyEqualTo(String value) {
            addCriterion("w_Company =", value, "wCompany");
            return (Criteria) this;
        }

        public Criteria andWCompanyNotEqualTo(String value) {
            addCriterion("w_Company <>", value, "wCompany");
            return (Criteria) this;
        }

        public Criteria andWCompanyGreaterThan(String value) {
            addCriterion("w_Company >", value, "wCompany");
            return (Criteria) this;
        }

        public Criteria andWCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("w_Company >=", value, "wCompany");
            return (Criteria) this;
        }

        public Criteria andWCompanyLessThan(String value) {
            addCriterion("w_Company <", value, "wCompany");
            return (Criteria) this;
        }

        public Criteria andWCompanyLessThanOrEqualTo(String value) {
            addCriterion("w_Company <=", value, "wCompany");
            return (Criteria) this;
        }

        public Criteria andWCompanyLike(String value) {
            addCriterion("w_Company like", value, "wCompany");
            return (Criteria) this;
        }

        public Criteria andWCompanyNotLike(String value) {
            addCriterion("w_Company not like", value, "wCompany");
            return (Criteria) this;
        }

        public Criteria andWCompanyIn(List<String> values) {
            addCriterion("w_Company in", values, "wCompany");
            return (Criteria) this;
        }

        public Criteria andWCompanyNotIn(List<String> values) {
            addCriterion("w_Company not in", values, "wCompany");
            return (Criteria) this;
        }

        public Criteria andWCompanyBetween(String value1, String value2) {
            addCriterion("w_Company between", value1, value2, "wCompany");
            return (Criteria) this;
        }

        public Criteria andWCompanyNotBetween(String value1, String value2) {
            addCriterion("w_Company not between", value1, value2, "wCompany");
            return (Criteria) this;
        }

        public Criteria andWCompanytextIsNull() {
            addCriterion("w_CompanyText is null");
            return (Criteria) this;
        }

        public Criteria andWCompanytextIsNotNull() {
            addCriterion("w_CompanyText is not null");
            return (Criteria) this;
        }

        public Criteria andWCompanytextEqualTo(String value) {
            addCriterion("w_CompanyText =", value, "wCompanytext");
            return (Criteria) this;
        }

        public Criteria andWCompanytextNotEqualTo(String value) {
            addCriterion("w_CompanyText <>", value, "wCompanytext");
            return (Criteria) this;
        }

        public Criteria andWCompanytextGreaterThan(String value) {
            addCriterion("w_CompanyText >", value, "wCompanytext");
            return (Criteria) this;
        }

        public Criteria andWCompanytextGreaterThanOrEqualTo(String value) {
            addCriterion("w_CompanyText >=", value, "wCompanytext");
            return (Criteria) this;
        }

        public Criteria andWCompanytextLessThan(String value) {
            addCriterion("w_CompanyText <", value, "wCompanytext");
            return (Criteria) this;
        }

        public Criteria andWCompanytextLessThanOrEqualTo(String value) {
            addCriterion("w_CompanyText <=", value, "wCompanytext");
            return (Criteria) this;
        }

        public Criteria andWCompanytextLike(String value) {
            addCriterion("w_CompanyText like", value, "wCompanytext");
            return (Criteria) this;
        }

        public Criteria andWCompanytextNotLike(String value) {
            addCriterion("w_CompanyText not like", value, "wCompanytext");
            return (Criteria) this;
        }

        public Criteria andWCompanytextIn(List<String> values) {
            addCriterion("w_CompanyText in", values, "wCompanytext");
            return (Criteria) this;
        }

        public Criteria andWCompanytextNotIn(List<String> values) {
            addCriterion("w_CompanyText not in", values, "wCompanytext");
            return (Criteria) this;
        }

        public Criteria andWCompanytextBetween(String value1, String value2) {
            addCriterion("w_CompanyText between", value1, value2, "wCompanytext");
            return (Criteria) this;
        }

        public Criteria andWCompanytextNotBetween(String value1, String value2) {
            addCriterion("w_CompanyText not between", value1, value2, "wCompanytext");
            return (Criteria) this;
        }

        public Criteria andWUsercomtextIsNull() {
            addCriterion("w_UserComText is null");
            return (Criteria) this;
        }

        public Criteria andWUsercomtextIsNotNull() {
            addCriterion("w_UserComText is not null");
            return (Criteria) this;
        }

        public Criteria andWUsercomtextEqualTo(Integer value) {
            addCriterion("w_UserComText =", value, "wUsercomtext");
            return (Criteria) this;
        }

        public Criteria andWUsercomtextNotEqualTo(Integer value) {
            addCriterion("w_UserComText <>", value, "wUsercomtext");
            return (Criteria) this;
        }

        public Criteria andWUsercomtextGreaterThan(Integer value) {
            addCriterion("w_UserComText >", value, "wUsercomtext");
            return (Criteria) this;
        }

        public Criteria andWUsercomtextGreaterThanOrEqualTo(Integer value) {
            addCriterion("w_UserComText >=", value, "wUsercomtext");
            return (Criteria) this;
        }

        public Criteria andWUsercomtextLessThan(Integer value) {
            addCriterion("w_UserComText <", value, "wUsercomtext");
            return (Criteria) this;
        }

        public Criteria andWUsercomtextLessThanOrEqualTo(Integer value) {
            addCriterion("w_UserComText <=", value, "wUsercomtext");
            return (Criteria) this;
        }

        public Criteria andWUsercomtextIn(List<Integer> values) {
            addCriterion("w_UserComText in", values, "wUsercomtext");
            return (Criteria) this;
        }

        public Criteria andWUsercomtextNotIn(List<Integer> values) {
            addCriterion("w_UserComText not in", values, "wUsercomtext");
            return (Criteria) this;
        }

        public Criteria andWUsercomtextBetween(Integer value1, Integer value2) {
            addCriterion("w_UserComText between", value1, value2, "wUsercomtext");
            return (Criteria) this;
        }

        public Criteria andWUsercomtextNotBetween(Integer value1, Integer value2) {
            addCriterion("w_UserComText not between", value1, value2, "wUsercomtext");
            return (Criteria) this;
        }

        public Criteria andWBannerIsNull() {
            addCriterion("w_Banner is null");
            return (Criteria) this;
        }

        public Criteria andWBannerIsNotNull() {
            addCriterion("w_Banner is not null");
            return (Criteria) this;
        }

        public Criteria andWBannerEqualTo(String value) {
            addCriterion("w_Banner =", value, "wBanner");
            return (Criteria) this;
        }

        public Criteria andWBannerNotEqualTo(String value) {
            addCriterion("w_Banner <>", value, "wBanner");
            return (Criteria) this;
        }

        public Criteria andWBannerGreaterThan(String value) {
            addCriterion("w_Banner >", value, "wBanner");
            return (Criteria) this;
        }

        public Criteria andWBannerGreaterThanOrEqualTo(String value) {
            addCriterion("w_Banner >=", value, "wBanner");
            return (Criteria) this;
        }

        public Criteria andWBannerLessThan(String value) {
            addCriterion("w_Banner <", value, "wBanner");
            return (Criteria) this;
        }

        public Criteria andWBannerLessThanOrEqualTo(String value) {
            addCriterion("w_Banner <=", value, "wBanner");
            return (Criteria) this;
        }

        public Criteria andWBannerLike(String value) {
            addCriterion("w_Banner like", value, "wBanner");
            return (Criteria) this;
        }

        public Criteria andWBannerNotLike(String value) {
            addCriterion("w_Banner not like", value, "wBanner");
            return (Criteria) this;
        }

        public Criteria andWBannerIn(List<String> values) {
            addCriterion("w_Banner in", values, "wBanner");
            return (Criteria) this;
        }

        public Criteria andWBannerNotIn(List<String> values) {
            addCriterion("w_Banner not in", values, "wBanner");
            return (Criteria) this;
        }

        public Criteria andWBannerBetween(String value1, String value2) {
            addCriterion("w_Banner between", value1, value2, "wBanner");
            return (Criteria) this;
        }

        public Criteria andWBannerNotBetween(String value1, String value2) {
            addCriterion("w_Banner not between", value1, value2, "wBanner");
            return (Criteria) this;
        }

        public Criteria andWCounterIsNull() {
            addCriterion("w_counter is null");
            return (Criteria) this;
        }

        public Criteria andWCounterIsNotNull() {
            addCriterion("w_counter is not null");
            return (Criteria) this;
        }

        public Criteria andWCounterEqualTo(Long value) {
            addCriterion("w_counter =", value, "wCounter");
            return (Criteria) this;
        }

        public Criteria andWCounterNotEqualTo(Long value) {
            addCriterion("w_counter <>", value, "wCounter");
            return (Criteria) this;
        }

        public Criteria andWCounterGreaterThan(Long value) {
            addCriterion("w_counter >", value, "wCounter");
            return (Criteria) this;
        }

        public Criteria andWCounterGreaterThanOrEqualTo(Long value) {
            addCriterion("w_counter >=", value, "wCounter");
            return (Criteria) this;
        }

        public Criteria andWCounterLessThan(Long value) {
            addCriterion("w_counter <", value, "wCounter");
            return (Criteria) this;
        }

        public Criteria andWCounterLessThanOrEqualTo(Long value) {
            addCriterion("w_counter <=", value, "wCounter");
            return (Criteria) this;
        }

        public Criteria andWCounterIn(List<Long> values) {
            addCriterion("w_counter in", values, "wCounter");
            return (Criteria) this;
        }

        public Criteria andWCounterNotIn(List<Long> values) {
            addCriterion("w_counter not in", values, "wCounter");
            return (Criteria) this;
        }

        public Criteria andWCounterBetween(Long value1, Long value2) {
            addCriterion("w_counter between", value1, value2, "wCounter");
            return (Criteria) this;
        }

        public Criteria andWCounterNotBetween(Long value1, Long value2) {
            addCriterion("w_counter not between", value1, value2, "wCounter");
            return (Criteria) this;
        }

        public Criteria andWDomainIsNull() {
            addCriterion("w_domain is null");
            return (Criteria) this;
        }

        public Criteria andWDomainIsNotNull() {
            addCriterion("w_domain is not null");
            return (Criteria) this;
        }

        public Criteria andWDomainEqualTo(String value) {
            addCriterion("w_domain =", value, "wDomain");
            return (Criteria) this;
        }

        public Criteria andWDomainNotEqualTo(String value) {
            addCriterion("w_domain <>", value, "wDomain");
            return (Criteria) this;
        }

        public Criteria andWDomainGreaterThan(String value) {
            addCriterion("w_domain >", value, "wDomain");
            return (Criteria) this;
        }

        public Criteria andWDomainGreaterThanOrEqualTo(String value) {
            addCriterion("w_domain >=", value, "wDomain");
            return (Criteria) this;
        }

        public Criteria andWDomainLessThan(String value) {
            addCriterion("w_domain <", value, "wDomain");
            return (Criteria) this;
        }

        public Criteria andWDomainLessThanOrEqualTo(String value) {
            addCriterion("w_domain <=", value, "wDomain");
            return (Criteria) this;
        }

        public Criteria andWDomainLike(String value) {
            addCriterion("w_domain like", value, "wDomain");
            return (Criteria) this;
        }

        public Criteria andWDomainNotLike(String value) {
            addCriterion("w_domain not like", value, "wDomain");
            return (Criteria) this;
        }

        public Criteria andWDomainIn(List<String> values) {
            addCriterion("w_domain in", values, "wDomain");
            return (Criteria) this;
        }

        public Criteria andWDomainNotIn(List<String> values) {
            addCriterion("w_domain not in", values, "wDomain");
            return (Criteria) this;
        }

        public Criteria andWDomainBetween(String value1, String value2) {
            addCriterion("w_domain between", value1, value2, "wDomain");
            return (Criteria) this;
        }

        public Criteria andWDomainNotBetween(String value1, String value2) {
            addCriterion("w_domain not between", value1, value2, "wDomain");
            return (Criteria) this;
        }

        public Criteria andWIcpIsNull() {
            addCriterion("w_ICP is null");
            return (Criteria) this;
        }

        public Criteria andWIcpIsNotNull() {
            addCriterion("w_ICP is not null");
            return (Criteria) this;
        }

        public Criteria andWIcpEqualTo(String value) {
            addCriterion("w_ICP =", value, "wIcp");
            return (Criteria) this;
        }

        public Criteria andWIcpNotEqualTo(String value) {
            addCriterion("w_ICP <>", value, "wIcp");
            return (Criteria) this;
        }

        public Criteria andWIcpGreaterThan(String value) {
            addCriterion("w_ICP >", value, "wIcp");
            return (Criteria) this;
        }

        public Criteria andWIcpGreaterThanOrEqualTo(String value) {
            addCriterion("w_ICP >=", value, "wIcp");
            return (Criteria) this;
        }

        public Criteria andWIcpLessThan(String value) {
            addCriterion("w_ICP <", value, "wIcp");
            return (Criteria) this;
        }

        public Criteria andWIcpLessThanOrEqualTo(String value) {
            addCriterion("w_ICP <=", value, "wIcp");
            return (Criteria) this;
        }

        public Criteria andWIcpLike(String value) {
            addCriterion("w_ICP like", value, "wIcp");
            return (Criteria) this;
        }

        public Criteria andWIcpNotLike(String value) {
            addCriterion("w_ICP not like", value, "wIcp");
            return (Criteria) this;
        }

        public Criteria andWIcpIn(List<String> values) {
            addCriterion("w_ICP in", values, "wIcp");
            return (Criteria) this;
        }

        public Criteria andWIcpNotIn(List<String> values) {
            addCriterion("w_ICP not in", values, "wIcp");
            return (Criteria) this;
        }

        public Criteria andWIcpBetween(String value1, String value2) {
            addCriterion("w_ICP between", value1, value2, "wIcp");
            return (Criteria) this;
        }

        public Criteria andWIcpNotBetween(String value1, String value2) {
            addCriterion("w_ICP not between", value1, value2, "wIcp");
            return (Criteria) this;
        }

        public Criteria andWIcphrefIsNull() {
            addCriterion("w_ICPHref is null");
            return (Criteria) this;
        }

        public Criteria andWIcphrefIsNotNull() {
            addCriterion("w_ICPHref is not null");
            return (Criteria) this;
        }

        public Criteria andWIcphrefEqualTo(String value) {
            addCriterion("w_ICPHref =", value, "wIcphref");
            return (Criteria) this;
        }

        public Criteria andWIcphrefNotEqualTo(String value) {
            addCriterion("w_ICPHref <>", value, "wIcphref");
            return (Criteria) this;
        }

        public Criteria andWIcphrefGreaterThan(String value) {
            addCriterion("w_ICPHref >", value, "wIcphref");
            return (Criteria) this;
        }

        public Criteria andWIcphrefGreaterThanOrEqualTo(String value) {
            addCriterion("w_ICPHref >=", value, "wIcphref");
            return (Criteria) this;
        }

        public Criteria andWIcphrefLessThan(String value) {
            addCriterion("w_ICPHref <", value, "wIcphref");
            return (Criteria) this;
        }

        public Criteria andWIcphrefLessThanOrEqualTo(String value) {
            addCriterion("w_ICPHref <=", value, "wIcphref");
            return (Criteria) this;
        }

        public Criteria andWIcphrefLike(String value) {
            addCriterion("w_ICPHref like", value, "wIcphref");
            return (Criteria) this;
        }

        public Criteria andWIcphrefNotLike(String value) {
            addCriterion("w_ICPHref not like", value, "wIcphref");
            return (Criteria) this;
        }

        public Criteria andWIcphrefIn(List<String> values) {
            addCriterion("w_ICPHref in", values, "wIcphref");
            return (Criteria) this;
        }

        public Criteria andWIcphrefNotIn(List<String> values) {
            addCriterion("w_ICPHref not in", values, "wIcphref");
            return (Criteria) this;
        }

        public Criteria andWIcphrefBetween(String value1, String value2) {
            addCriterion("w_ICPHref between", value1, value2, "wIcphref");
            return (Criteria) this;
        }

        public Criteria andWIcphrefNotBetween(String value1, String value2) {
            addCriterion("w_ICPHref not between", value1, value2, "wIcphref");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}