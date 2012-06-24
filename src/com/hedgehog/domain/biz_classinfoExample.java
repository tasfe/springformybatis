package com.hedgehog.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class biz_classinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public biz_classinfoExample() {
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

        public Criteria andClassinfoidIsNull() {
            addCriterion("classinfoID is null");
            return (Criteria) this;
        }

        public Criteria andClassinfoidIsNotNull() {
            addCriterion("classinfoID is not null");
            return (Criteria) this;
        }

        public Criteria andClassinfoidEqualTo(Integer value) {
            addCriterion("classinfoID =", value, "classinfoid");
            return (Criteria) this;
        }

        public Criteria andClassinfoidNotEqualTo(Integer value) {
            addCriterion("classinfoID <>", value, "classinfoid");
            return (Criteria) this;
        }

        public Criteria andClassinfoidGreaterThan(Integer value) {
            addCriterion("classinfoID >", value, "classinfoid");
            return (Criteria) this;
        }

        public Criteria andClassinfoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("classinfoID >=", value, "classinfoid");
            return (Criteria) this;
        }

        public Criteria andClassinfoidLessThan(Integer value) {
            addCriterion("classinfoID <", value, "classinfoid");
            return (Criteria) this;
        }

        public Criteria andClassinfoidLessThanOrEqualTo(Integer value) {
            addCriterion("classinfoID <=", value, "classinfoid");
            return (Criteria) this;
        }

        public Criteria andClassinfoidIn(List<Integer> values) {
            addCriterion("classinfoID in", values, "classinfoid");
            return (Criteria) this;
        }

        public Criteria andClassinfoidNotIn(List<Integer> values) {
            addCriterion("classinfoID not in", values, "classinfoid");
            return (Criteria) this;
        }

        public Criteria andClassinfoidBetween(Integer value1, Integer value2) {
            addCriterion("classinfoID between", value1, value2, "classinfoid");
            return (Criteria) this;
        }

        public Criteria andClassinfoidNotBetween(Integer value1, Integer value2) {
            addCriterion("classinfoID not between", value1, value2, "classinfoid");
            return (Criteria) this;
        }

        public Criteria andClassinfoTitleIsNull() {
            addCriterion("classinfo_title is null");
            return (Criteria) this;
        }

        public Criteria andClassinfoTitleIsNotNull() {
            addCriterion("classinfo_title is not null");
            return (Criteria) this;
        }

        public Criteria andClassinfoTitleEqualTo(String value) {
            addCriterion("classinfo_title =", value, "classinfoTitle");
            return (Criteria) this;
        }

        public Criteria andClassinfoTitleNotEqualTo(String value) {
            addCriterion("classinfo_title <>", value, "classinfoTitle");
            return (Criteria) this;
        }

        public Criteria andClassinfoTitleGreaterThan(String value) {
            addCriterion("classinfo_title >", value, "classinfoTitle");
            return (Criteria) this;
        }

        public Criteria andClassinfoTitleGreaterThanOrEqualTo(String value) {
            addCriterion("classinfo_title >=", value, "classinfoTitle");
            return (Criteria) this;
        }

        public Criteria andClassinfoTitleLessThan(String value) {
            addCriterion("classinfo_title <", value, "classinfoTitle");
            return (Criteria) this;
        }

        public Criteria andClassinfoTitleLessThanOrEqualTo(String value) {
            addCriterion("classinfo_title <=", value, "classinfoTitle");
            return (Criteria) this;
        }

        public Criteria andClassinfoTitleLike(String value) {
            addCriterion("classinfo_title like", value, "classinfoTitle");
            return (Criteria) this;
        }

        public Criteria andClassinfoTitleNotLike(String value) {
            addCriterion("classinfo_title not like", value, "classinfoTitle");
            return (Criteria) this;
        }

        public Criteria andClassinfoTitleIn(List<String> values) {
            addCriterion("classinfo_title in", values, "classinfoTitle");
            return (Criteria) this;
        }

        public Criteria andClassinfoTitleNotIn(List<String> values) {
            addCriterion("classinfo_title not in", values, "classinfoTitle");
            return (Criteria) this;
        }

        public Criteria andClassinfoTitleBetween(String value1, String value2) {
            addCriterion("classinfo_title between", value1, value2, "classinfoTitle");
            return (Criteria) this;
        }

        public Criteria andClassinfoTitleNotBetween(String value1, String value2) {
            addCriterion("classinfo_title not between", value1, value2, "classinfoTitle");
            return (Criteria) this;
        }

        public Criteria andClassinfoClassIsNull() {
            addCriterion("classinfo_class is null");
            return (Criteria) this;
        }

        public Criteria andClassinfoClassIsNotNull() {
            addCriterion("classinfo_class is not null");
            return (Criteria) this;
        }

        public Criteria andClassinfoClassEqualTo(Integer value) {
            addCriterion("classinfo_class =", value, "classinfoClass");
            return (Criteria) this;
        }

        public Criteria andClassinfoClassNotEqualTo(Integer value) {
            addCriterion("classinfo_class <>", value, "classinfoClass");
            return (Criteria) this;
        }

        public Criteria andClassinfoClassGreaterThan(Integer value) {
            addCriterion("classinfo_class >", value, "classinfoClass");
            return (Criteria) this;
        }

        public Criteria andClassinfoClassGreaterThanOrEqualTo(Integer value) {
            addCriterion("classinfo_class >=", value, "classinfoClass");
            return (Criteria) this;
        }

        public Criteria andClassinfoClassLessThan(Integer value) {
            addCriterion("classinfo_class <", value, "classinfoClass");
            return (Criteria) this;
        }

        public Criteria andClassinfoClassLessThanOrEqualTo(Integer value) {
            addCriterion("classinfo_class <=", value, "classinfoClass");
            return (Criteria) this;
        }

        public Criteria andClassinfoClassIn(List<Integer> values) {
            addCriterion("classinfo_class in", values, "classinfoClass");
            return (Criteria) this;
        }

        public Criteria andClassinfoClassNotIn(List<Integer> values) {
            addCriterion("classinfo_class not in", values, "classinfoClass");
            return (Criteria) this;
        }

        public Criteria andClassinfoClassBetween(Integer value1, Integer value2) {
            addCriterion("classinfo_class between", value1, value2, "classinfoClass");
            return (Criteria) this;
        }

        public Criteria andClassinfoClassNotBetween(Integer value1, Integer value2) {
            addCriterion("classinfo_class not between", value1, value2, "classinfoClass");
            return (Criteria) this;
        }

        public Criteria andClassinfoPropertiesIsNull() {
            addCriterion("classinfo_properties is null");
            return (Criteria) this;
        }

        public Criteria andClassinfoPropertiesIsNotNull() {
            addCriterion("classinfo_properties is not null");
            return (Criteria) this;
        }

        public Criteria andClassinfoPropertiesEqualTo(String value) {
            addCriterion("classinfo_properties =", value, "classinfoProperties");
            return (Criteria) this;
        }

        public Criteria andClassinfoPropertiesNotEqualTo(String value) {
            addCriterion("classinfo_properties <>", value, "classinfoProperties");
            return (Criteria) this;
        }

        public Criteria andClassinfoPropertiesGreaterThan(String value) {
            addCriterion("classinfo_properties >", value, "classinfoProperties");
            return (Criteria) this;
        }

        public Criteria andClassinfoPropertiesGreaterThanOrEqualTo(String value) {
            addCriterion("classinfo_properties >=", value, "classinfoProperties");
            return (Criteria) this;
        }

        public Criteria andClassinfoPropertiesLessThan(String value) {
            addCriterion("classinfo_properties <", value, "classinfoProperties");
            return (Criteria) this;
        }

        public Criteria andClassinfoPropertiesLessThanOrEqualTo(String value) {
            addCriterion("classinfo_properties <=", value, "classinfoProperties");
            return (Criteria) this;
        }

        public Criteria andClassinfoPropertiesLike(String value) {
            addCriterion("classinfo_properties like", value, "classinfoProperties");
            return (Criteria) this;
        }

        public Criteria andClassinfoPropertiesNotLike(String value) {
            addCriterion("classinfo_properties not like", value, "classinfoProperties");
            return (Criteria) this;
        }

        public Criteria andClassinfoPropertiesIn(List<String> values) {
            addCriterion("classinfo_properties in", values, "classinfoProperties");
            return (Criteria) this;
        }

        public Criteria andClassinfoPropertiesNotIn(List<String> values) {
            addCriterion("classinfo_properties not in", values, "classinfoProperties");
            return (Criteria) this;
        }

        public Criteria andClassinfoPropertiesBetween(String value1, String value2) {
            addCriterion("classinfo_properties between", value1, value2, "classinfoProperties");
            return (Criteria) this;
        }

        public Criteria andClassinfoPropertiesNotBetween(String value1, String value2) {
            addCriterion("classinfo_properties not between", value1, value2, "classinfoProperties");
            return (Criteria) this;
        }

        public Criteria andClassinfoDesIsNull() {
            addCriterion("classinfo_des is null");
            return (Criteria) this;
        }

        public Criteria andClassinfoDesIsNotNull() {
            addCriterion("classinfo_des is not null");
            return (Criteria) this;
        }

        public Criteria andClassinfoDesEqualTo(String value) {
            addCriterion("classinfo_des =", value, "classinfoDes");
            return (Criteria) this;
        }

        public Criteria andClassinfoDesNotEqualTo(String value) {
            addCriterion("classinfo_des <>", value, "classinfoDes");
            return (Criteria) this;
        }

        public Criteria andClassinfoDesGreaterThan(String value) {
            addCriterion("classinfo_des >", value, "classinfoDes");
            return (Criteria) this;
        }

        public Criteria andClassinfoDesGreaterThanOrEqualTo(String value) {
            addCriterion("classinfo_des >=", value, "classinfoDes");
            return (Criteria) this;
        }

        public Criteria andClassinfoDesLessThan(String value) {
            addCriterion("classinfo_des <", value, "classinfoDes");
            return (Criteria) this;
        }

        public Criteria andClassinfoDesLessThanOrEqualTo(String value) {
            addCriterion("classinfo_des <=", value, "classinfoDes");
            return (Criteria) this;
        }

        public Criteria andClassinfoDesLike(String value) {
            addCriterion("classinfo_des like", value, "classinfoDes");
            return (Criteria) this;
        }

        public Criteria andClassinfoDesNotLike(String value) {
            addCriterion("classinfo_des not like", value, "classinfoDes");
            return (Criteria) this;
        }

        public Criteria andClassinfoDesIn(List<String> values) {
            addCriterion("classinfo_des in", values, "classinfoDes");
            return (Criteria) this;
        }

        public Criteria andClassinfoDesNotIn(List<String> values) {
            addCriterion("classinfo_des not in", values, "classinfoDes");
            return (Criteria) this;
        }

        public Criteria andClassinfoDesBetween(String value1, String value2) {
            addCriterion("classinfo_des between", value1, value2, "classinfoDes");
            return (Criteria) this;
        }

        public Criteria andClassinfoDesNotBetween(String value1, String value2) {
            addCriterion("classinfo_des not between", value1, value2, "classinfoDes");
            return (Criteria) this;
        }

        public Criteria andClassinfoPicIsNull() {
            addCriterion("classinfo_pic is null");
            return (Criteria) this;
        }

        public Criteria andClassinfoPicIsNotNull() {
            addCriterion("classinfo_pic is not null");
            return (Criteria) this;
        }

        public Criteria andClassinfoPicEqualTo(String value) {
            addCriterion("classinfo_pic =", value, "classinfoPic");
            return (Criteria) this;
        }

        public Criteria andClassinfoPicNotEqualTo(String value) {
            addCriterion("classinfo_pic <>", value, "classinfoPic");
            return (Criteria) this;
        }

        public Criteria andClassinfoPicGreaterThan(String value) {
            addCriterion("classinfo_pic >", value, "classinfoPic");
            return (Criteria) this;
        }

        public Criteria andClassinfoPicGreaterThanOrEqualTo(String value) {
            addCriterion("classinfo_pic >=", value, "classinfoPic");
            return (Criteria) this;
        }

        public Criteria andClassinfoPicLessThan(String value) {
            addCriterion("classinfo_pic <", value, "classinfoPic");
            return (Criteria) this;
        }

        public Criteria andClassinfoPicLessThanOrEqualTo(String value) {
            addCriterion("classinfo_pic <=", value, "classinfoPic");
            return (Criteria) this;
        }

        public Criteria andClassinfoPicLike(String value) {
            addCriterion("classinfo_pic like", value, "classinfoPic");
            return (Criteria) this;
        }

        public Criteria andClassinfoPicNotLike(String value) {
            addCriterion("classinfo_pic not like", value, "classinfoPic");
            return (Criteria) this;
        }

        public Criteria andClassinfoPicIn(List<String> values) {
            addCriterion("classinfo_pic in", values, "classinfoPic");
            return (Criteria) this;
        }

        public Criteria andClassinfoPicNotIn(List<String> values) {
            addCriterion("classinfo_pic not in", values, "classinfoPic");
            return (Criteria) this;
        }

        public Criteria andClassinfoPicBetween(String value1, String value2) {
            addCriterion("classinfo_pic between", value1, value2, "classinfoPic");
            return (Criteria) this;
        }

        public Criteria andClassinfoPicNotBetween(String value1, String value2) {
            addCriterion("classinfo_pic not between", value1, value2, "classinfoPic");
            return (Criteria) this;
        }

        public Criteria andClassinfoPriceIsNull() {
            addCriterion("classinfo_price is null");
            return (Criteria) this;
        }

        public Criteria andClassinfoPriceIsNotNull() {
            addCriterion("classinfo_price is not null");
            return (Criteria) this;
        }

        public Criteria andClassinfoPriceEqualTo(String value) {
            addCriterion("classinfo_price =", value, "classinfoPrice");
            return (Criteria) this;
        }

        public Criteria andClassinfoPriceNotEqualTo(String value) {
            addCriterion("classinfo_price <>", value, "classinfoPrice");
            return (Criteria) this;
        }

        public Criteria andClassinfoPriceGreaterThan(String value) {
            addCriterion("classinfo_price >", value, "classinfoPrice");
            return (Criteria) this;
        }

        public Criteria andClassinfoPriceGreaterThanOrEqualTo(String value) {
            addCriterion("classinfo_price >=", value, "classinfoPrice");
            return (Criteria) this;
        }

        public Criteria andClassinfoPriceLessThan(String value) {
            addCriterion("classinfo_price <", value, "classinfoPrice");
            return (Criteria) this;
        }

        public Criteria andClassinfoPriceLessThanOrEqualTo(String value) {
            addCriterion("classinfo_price <=", value, "classinfoPrice");
            return (Criteria) this;
        }

        public Criteria andClassinfoPriceLike(String value) {
            addCriterion("classinfo_price like", value, "classinfoPrice");
            return (Criteria) this;
        }

        public Criteria andClassinfoPriceNotLike(String value) {
            addCriterion("classinfo_price not like", value, "classinfoPrice");
            return (Criteria) this;
        }

        public Criteria andClassinfoPriceIn(List<String> values) {
            addCriterion("classinfo_price in", values, "classinfoPrice");
            return (Criteria) this;
        }

        public Criteria andClassinfoPriceNotIn(List<String> values) {
            addCriterion("classinfo_price not in", values, "classinfoPrice");
            return (Criteria) this;
        }

        public Criteria andClassinfoPriceBetween(String value1, String value2) {
            addCriterion("classinfo_price between", value1, value2, "classinfoPrice");
            return (Criteria) this;
        }

        public Criteria andClassinfoPriceNotBetween(String value1, String value2) {
            addCriterion("classinfo_price not between", value1, value2, "classinfoPrice");
            return (Criteria) this;
        }

        public Criteria andClassinfoEmailIsNull() {
            addCriterion("classinfo_email is null");
            return (Criteria) this;
        }

        public Criteria andClassinfoEmailIsNotNull() {
            addCriterion("classinfo_email is not null");
            return (Criteria) this;
        }

        public Criteria andClassinfoEmailEqualTo(String value) {
            addCriterion("classinfo_email =", value, "classinfoEmail");
            return (Criteria) this;
        }

        public Criteria andClassinfoEmailNotEqualTo(String value) {
            addCriterion("classinfo_email <>", value, "classinfoEmail");
            return (Criteria) this;
        }

        public Criteria andClassinfoEmailGreaterThan(String value) {
            addCriterion("classinfo_email >", value, "classinfoEmail");
            return (Criteria) this;
        }

        public Criteria andClassinfoEmailGreaterThanOrEqualTo(String value) {
            addCriterion("classinfo_email >=", value, "classinfoEmail");
            return (Criteria) this;
        }

        public Criteria andClassinfoEmailLessThan(String value) {
            addCriterion("classinfo_email <", value, "classinfoEmail");
            return (Criteria) this;
        }

        public Criteria andClassinfoEmailLessThanOrEqualTo(String value) {
            addCriterion("classinfo_email <=", value, "classinfoEmail");
            return (Criteria) this;
        }

        public Criteria andClassinfoEmailLike(String value) {
            addCriterion("classinfo_email like", value, "classinfoEmail");
            return (Criteria) this;
        }

        public Criteria andClassinfoEmailNotLike(String value) {
            addCriterion("classinfo_email not like", value, "classinfoEmail");
            return (Criteria) this;
        }

        public Criteria andClassinfoEmailIn(List<String> values) {
            addCriterion("classinfo_email in", values, "classinfoEmail");
            return (Criteria) this;
        }

        public Criteria andClassinfoEmailNotIn(List<String> values) {
            addCriterion("classinfo_email not in", values, "classinfoEmail");
            return (Criteria) this;
        }

        public Criteria andClassinfoEmailBetween(String value1, String value2) {
            addCriterion("classinfo_email between", value1, value2, "classinfoEmail");
            return (Criteria) this;
        }

        public Criteria andClassinfoEmailNotBetween(String value1, String value2) {
            addCriterion("classinfo_email not between", value1, value2, "classinfoEmail");
            return (Criteria) this;
        }

        public Criteria andClassinfoNameIsNull() {
            addCriterion("classinfo_name is null");
            return (Criteria) this;
        }

        public Criteria andClassinfoNameIsNotNull() {
            addCriterion("classinfo_name is not null");
            return (Criteria) this;
        }

        public Criteria andClassinfoNameEqualTo(String value) {
            addCriterion("classinfo_name =", value, "classinfoName");
            return (Criteria) this;
        }

        public Criteria andClassinfoNameNotEqualTo(String value) {
            addCriterion("classinfo_name <>", value, "classinfoName");
            return (Criteria) this;
        }

        public Criteria andClassinfoNameGreaterThan(String value) {
            addCriterion("classinfo_name >", value, "classinfoName");
            return (Criteria) this;
        }

        public Criteria andClassinfoNameGreaterThanOrEqualTo(String value) {
            addCriterion("classinfo_name >=", value, "classinfoName");
            return (Criteria) this;
        }

        public Criteria andClassinfoNameLessThan(String value) {
            addCriterion("classinfo_name <", value, "classinfoName");
            return (Criteria) this;
        }

        public Criteria andClassinfoNameLessThanOrEqualTo(String value) {
            addCriterion("classinfo_name <=", value, "classinfoName");
            return (Criteria) this;
        }

        public Criteria andClassinfoNameLike(String value) {
            addCriterion("classinfo_name like", value, "classinfoName");
            return (Criteria) this;
        }

        public Criteria andClassinfoNameNotLike(String value) {
            addCriterion("classinfo_name not like", value, "classinfoName");
            return (Criteria) this;
        }

        public Criteria andClassinfoNameIn(List<String> values) {
            addCriterion("classinfo_name in", values, "classinfoName");
            return (Criteria) this;
        }

        public Criteria andClassinfoNameNotIn(List<String> values) {
            addCriterion("classinfo_name not in", values, "classinfoName");
            return (Criteria) this;
        }

        public Criteria andClassinfoNameBetween(String value1, String value2) {
            addCriterion("classinfo_name between", value1, value2, "classinfoName");
            return (Criteria) this;
        }

        public Criteria andClassinfoNameNotBetween(String value1, String value2) {
            addCriterion("classinfo_name not between", value1, value2, "classinfoName");
            return (Criteria) this;
        }

        public Criteria andClassinfoAddrIsNull() {
            addCriterion("classinfo_addr is null");
            return (Criteria) this;
        }

        public Criteria andClassinfoAddrIsNotNull() {
            addCriterion("classinfo_addr is not null");
            return (Criteria) this;
        }

        public Criteria andClassinfoAddrEqualTo(String value) {
            addCriterion("classinfo_addr =", value, "classinfoAddr");
            return (Criteria) this;
        }

        public Criteria andClassinfoAddrNotEqualTo(String value) {
            addCriterion("classinfo_addr <>", value, "classinfoAddr");
            return (Criteria) this;
        }

        public Criteria andClassinfoAddrGreaterThan(String value) {
            addCriterion("classinfo_addr >", value, "classinfoAddr");
            return (Criteria) this;
        }

        public Criteria andClassinfoAddrGreaterThanOrEqualTo(String value) {
            addCriterion("classinfo_addr >=", value, "classinfoAddr");
            return (Criteria) this;
        }

        public Criteria andClassinfoAddrLessThan(String value) {
            addCriterion("classinfo_addr <", value, "classinfoAddr");
            return (Criteria) this;
        }

        public Criteria andClassinfoAddrLessThanOrEqualTo(String value) {
            addCriterion("classinfo_addr <=", value, "classinfoAddr");
            return (Criteria) this;
        }

        public Criteria andClassinfoAddrLike(String value) {
            addCriterion("classinfo_addr like", value, "classinfoAddr");
            return (Criteria) this;
        }

        public Criteria andClassinfoAddrNotLike(String value) {
            addCriterion("classinfo_addr not like", value, "classinfoAddr");
            return (Criteria) this;
        }

        public Criteria andClassinfoAddrIn(List<String> values) {
            addCriterion("classinfo_addr in", values, "classinfoAddr");
            return (Criteria) this;
        }

        public Criteria andClassinfoAddrNotIn(List<String> values) {
            addCriterion("classinfo_addr not in", values, "classinfoAddr");
            return (Criteria) this;
        }

        public Criteria andClassinfoAddrBetween(String value1, String value2) {
            addCriterion("classinfo_addr between", value1, value2, "classinfoAddr");
            return (Criteria) this;
        }

        public Criteria andClassinfoAddrNotBetween(String value1, String value2) {
            addCriterion("classinfo_addr not between", value1, value2, "classinfoAddr");
            return (Criteria) this;
        }

        public Criteria andClassinfoCodeIsNull() {
            addCriterion("classinfo_code is null");
            return (Criteria) this;
        }

        public Criteria andClassinfoCodeIsNotNull() {
            addCriterion("classinfo_code is not null");
            return (Criteria) this;
        }

        public Criteria andClassinfoCodeEqualTo(String value) {
            addCriterion("classinfo_code =", value, "classinfoCode");
            return (Criteria) this;
        }

        public Criteria andClassinfoCodeNotEqualTo(String value) {
            addCriterion("classinfo_code <>", value, "classinfoCode");
            return (Criteria) this;
        }

        public Criteria andClassinfoCodeGreaterThan(String value) {
            addCriterion("classinfo_code >", value, "classinfoCode");
            return (Criteria) this;
        }

        public Criteria andClassinfoCodeGreaterThanOrEqualTo(String value) {
            addCriterion("classinfo_code >=", value, "classinfoCode");
            return (Criteria) this;
        }

        public Criteria andClassinfoCodeLessThan(String value) {
            addCriterion("classinfo_code <", value, "classinfoCode");
            return (Criteria) this;
        }

        public Criteria andClassinfoCodeLessThanOrEqualTo(String value) {
            addCriterion("classinfo_code <=", value, "classinfoCode");
            return (Criteria) this;
        }

        public Criteria andClassinfoCodeLike(String value) {
            addCriterion("classinfo_code like", value, "classinfoCode");
            return (Criteria) this;
        }

        public Criteria andClassinfoCodeNotLike(String value) {
            addCriterion("classinfo_code not like", value, "classinfoCode");
            return (Criteria) this;
        }

        public Criteria andClassinfoCodeIn(List<String> values) {
            addCriterion("classinfo_code in", values, "classinfoCode");
            return (Criteria) this;
        }

        public Criteria andClassinfoCodeNotIn(List<String> values) {
            addCriterion("classinfo_code not in", values, "classinfoCode");
            return (Criteria) this;
        }

        public Criteria andClassinfoCodeBetween(String value1, String value2) {
            addCriterion("classinfo_code between", value1, value2, "classinfoCode");
            return (Criteria) this;
        }

        public Criteria andClassinfoCodeNotBetween(String value1, String value2) {
            addCriterion("classinfo_code not between", value1, value2, "classinfoCode");
            return (Criteria) this;
        }

        public Criteria andClassinfoTelIsNull() {
            addCriterion("classinfo_tel is null");
            return (Criteria) this;
        }

        public Criteria andClassinfoTelIsNotNull() {
            addCriterion("classinfo_tel is not null");
            return (Criteria) this;
        }

        public Criteria andClassinfoTelEqualTo(String value) {
            addCriterion("classinfo_tel =", value, "classinfoTel");
            return (Criteria) this;
        }

        public Criteria andClassinfoTelNotEqualTo(String value) {
            addCriterion("classinfo_tel <>", value, "classinfoTel");
            return (Criteria) this;
        }

        public Criteria andClassinfoTelGreaterThan(String value) {
            addCriterion("classinfo_tel >", value, "classinfoTel");
            return (Criteria) this;
        }

        public Criteria andClassinfoTelGreaterThanOrEqualTo(String value) {
            addCriterion("classinfo_tel >=", value, "classinfoTel");
            return (Criteria) this;
        }

        public Criteria andClassinfoTelLessThan(String value) {
            addCriterion("classinfo_tel <", value, "classinfoTel");
            return (Criteria) this;
        }

        public Criteria andClassinfoTelLessThanOrEqualTo(String value) {
            addCriterion("classinfo_tel <=", value, "classinfoTel");
            return (Criteria) this;
        }

        public Criteria andClassinfoTelLike(String value) {
            addCriterion("classinfo_tel like", value, "classinfoTel");
            return (Criteria) this;
        }

        public Criteria andClassinfoTelNotLike(String value) {
            addCriterion("classinfo_tel not like", value, "classinfoTel");
            return (Criteria) this;
        }

        public Criteria andClassinfoTelIn(List<String> values) {
            addCriterion("classinfo_tel in", values, "classinfoTel");
            return (Criteria) this;
        }

        public Criteria andClassinfoTelNotIn(List<String> values) {
            addCriterion("classinfo_tel not in", values, "classinfoTel");
            return (Criteria) this;
        }

        public Criteria andClassinfoTelBetween(String value1, String value2) {
            addCriterion("classinfo_tel between", value1, value2, "classinfoTel");
            return (Criteria) this;
        }

        public Criteria andClassinfoTelNotBetween(String value1, String value2) {
            addCriterion("classinfo_tel not between", value1, value2, "classinfoTel");
            return (Criteria) this;
        }

        public Criteria andClassinfoIcqIsNull() {
            addCriterion("classinfo_ICQ is null");
            return (Criteria) this;
        }

        public Criteria andClassinfoIcqIsNotNull() {
            addCriterion("classinfo_ICQ is not null");
            return (Criteria) this;
        }

        public Criteria andClassinfoIcqEqualTo(String value) {
            addCriterion("classinfo_ICQ =", value, "classinfoIcq");
            return (Criteria) this;
        }

        public Criteria andClassinfoIcqNotEqualTo(String value) {
            addCriterion("classinfo_ICQ <>", value, "classinfoIcq");
            return (Criteria) this;
        }

        public Criteria andClassinfoIcqGreaterThan(String value) {
            addCriterion("classinfo_ICQ >", value, "classinfoIcq");
            return (Criteria) this;
        }

        public Criteria andClassinfoIcqGreaterThanOrEqualTo(String value) {
            addCriterion("classinfo_ICQ >=", value, "classinfoIcq");
            return (Criteria) this;
        }

        public Criteria andClassinfoIcqLessThan(String value) {
            addCriterion("classinfo_ICQ <", value, "classinfoIcq");
            return (Criteria) this;
        }

        public Criteria andClassinfoIcqLessThanOrEqualTo(String value) {
            addCriterion("classinfo_ICQ <=", value, "classinfoIcq");
            return (Criteria) this;
        }

        public Criteria andClassinfoIcqLike(String value) {
            addCriterion("classinfo_ICQ like", value, "classinfoIcq");
            return (Criteria) this;
        }

        public Criteria andClassinfoIcqNotLike(String value) {
            addCriterion("classinfo_ICQ not like", value, "classinfoIcq");
            return (Criteria) this;
        }

        public Criteria andClassinfoIcqIn(List<String> values) {
            addCriterion("classinfo_ICQ in", values, "classinfoIcq");
            return (Criteria) this;
        }

        public Criteria andClassinfoIcqNotIn(List<String> values) {
            addCriterion("classinfo_ICQ not in", values, "classinfoIcq");
            return (Criteria) this;
        }

        public Criteria andClassinfoIcqBetween(String value1, String value2) {
            addCriterion("classinfo_ICQ between", value1, value2, "classinfoIcq");
            return (Criteria) this;
        }

        public Criteria andClassinfoIcqNotBetween(String value1, String value2) {
            addCriterion("classinfo_ICQ not between", value1, value2, "classinfoIcq");
            return (Criteria) this;
        }

        public Criteria andClassinfoHitsIsNull() {
            addCriterion("classinfo_hits is null");
            return (Criteria) this;
        }

        public Criteria andClassinfoHitsIsNotNull() {
            addCriterion("classinfo_hits is not null");
            return (Criteria) this;
        }

        public Criteria andClassinfoHitsEqualTo(Integer value) {
            addCriterion("classinfo_hits =", value, "classinfoHits");
            return (Criteria) this;
        }

        public Criteria andClassinfoHitsNotEqualTo(Integer value) {
            addCriterion("classinfo_hits <>", value, "classinfoHits");
            return (Criteria) this;
        }

        public Criteria andClassinfoHitsGreaterThan(Integer value) {
            addCriterion("classinfo_hits >", value, "classinfoHits");
            return (Criteria) this;
        }

        public Criteria andClassinfoHitsGreaterThanOrEqualTo(Integer value) {
            addCriterion("classinfo_hits >=", value, "classinfoHits");
            return (Criteria) this;
        }

        public Criteria andClassinfoHitsLessThan(Integer value) {
            addCriterion("classinfo_hits <", value, "classinfoHits");
            return (Criteria) this;
        }

        public Criteria andClassinfoHitsLessThanOrEqualTo(Integer value) {
            addCriterion("classinfo_hits <=", value, "classinfoHits");
            return (Criteria) this;
        }

        public Criteria andClassinfoHitsIn(List<Integer> values) {
            addCriterion("classinfo_hits in", values, "classinfoHits");
            return (Criteria) this;
        }

        public Criteria andClassinfoHitsNotIn(List<Integer> values) {
            addCriterion("classinfo_hits not in", values, "classinfoHits");
            return (Criteria) this;
        }

        public Criteria andClassinfoHitsBetween(Integer value1, Integer value2) {
            addCriterion("classinfo_hits between", value1, value2, "classinfoHits");
            return (Criteria) this;
        }

        public Criteria andClassinfoHitsNotBetween(Integer value1, Integer value2) {
            addCriterion("classinfo_hits not between", value1, value2, "classinfoHits");
            return (Criteria) this;
        }

        public Criteria andClassinfoClientipIsNull() {
            addCriterion("classinfo_clientip is null");
            return (Criteria) this;
        }

        public Criteria andClassinfoClientipIsNotNull() {
            addCriterion("classinfo_clientip is not null");
            return (Criteria) this;
        }

        public Criteria andClassinfoClientipEqualTo(String value) {
            addCriterion("classinfo_clientip =", value, "classinfoClientip");
            return (Criteria) this;
        }

        public Criteria andClassinfoClientipNotEqualTo(String value) {
            addCriterion("classinfo_clientip <>", value, "classinfoClientip");
            return (Criteria) this;
        }

        public Criteria andClassinfoClientipGreaterThan(String value) {
            addCriterion("classinfo_clientip >", value, "classinfoClientip");
            return (Criteria) this;
        }

        public Criteria andClassinfoClientipGreaterThanOrEqualTo(String value) {
            addCriterion("classinfo_clientip >=", value, "classinfoClientip");
            return (Criteria) this;
        }

        public Criteria andClassinfoClientipLessThan(String value) {
            addCriterion("classinfo_clientip <", value, "classinfoClientip");
            return (Criteria) this;
        }

        public Criteria andClassinfoClientipLessThanOrEqualTo(String value) {
            addCriterion("classinfo_clientip <=", value, "classinfoClientip");
            return (Criteria) this;
        }

        public Criteria andClassinfoClientipLike(String value) {
            addCriterion("classinfo_clientip like", value, "classinfoClientip");
            return (Criteria) this;
        }

        public Criteria andClassinfoClientipNotLike(String value) {
            addCriterion("classinfo_clientip not like", value, "classinfoClientip");
            return (Criteria) this;
        }

        public Criteria andClassinfoClientipIn(List<String> values) {
            addCriterion("classinfo_clientip in", values, "classinfoClientip");
            return (Criteria) this;
        }

        public Criteria andClassinfoClientipNotIn(List<String> values) {
            addCriterion("classinfo_clientip not in", values, "classinfoClientip");
            return (Criteria) this;
        }

        public Criteria andClassinfoClientipBetween(String value1, String value2) {
            addCriterion("classinfo_clientip between", value1, value2, "classinfoClientip");
            return (Criteria) this;
        }

        public Criteria andClassinfoClientipNotBetween(String value1, String value2) {
            addCriterion("classinfo_clientip not between", value1, value2, "classinfoClientip");
            return (Criteria) this;
        }

        public Criteria andClassinfoPublishdateIsNull() {
            addCriterion("classinfo_publishdate is null");
            return (Criteria) this;
        }

        public Criteria andClassinfoPublishdateIsNotNull() {
            addCriterion("classinfo_publishdate is not null");
            return (Criteria) this;
        }

        public Criteria andClassinfoPublishdateEqualTo(Date value) {
            addCriterion("classinfo_publishdate =", value, "classinfoPublishdate");
            return (Criteria) this;
        }

        public Criteria andClassinfoPublishdateNotEqualTo(Date value) {
            addCriterion("classinfo_publishdate <>", value, "classinfoPublishdate");
            return (Criteria) this;
        }

        public Criteria andClassinfoPublishdateGreaterThan(Date value) {
            addCriterion("classinfo_publishdate >", value, "classinfoPublishdate");
            return (Criteria) this;
        }

        public Criteria andClassinfoPublishdateGreaterThanOrEqualTo(Date value) {
            addCriterion("classinfo_publishdate >=", value, "classinfoPublishdate");
            return (Criteria) this;
        }

        public Criteria andClassinfoPublishdateLessThan(Date value) {
            addCriterion("classinfo_publishdate <", value, "classinfoPublishdate");
            return (Criteria) this;
        }

        public Criteria andClassinfoPublishdateLessThanOrEqualTo(Date value) {
            addCriterion("classinfo_publishdate <=", value, "classinfoPublishdate");
            return (Criteria) this;
        }

        public Criteria andClassinfoPublishdateIn(List<Date> values) {
            addCriterion("classinfo_publishdate in", values, "classinfoPublishdate");
            return (Criteria) this;
        }

        public Criteria andClassinfoPublishdateNotIn(List<Date> values) {
            addCriterion("classinfo_publishdate not in", values, "classinfoPublishdate");
            return (Criteria) this;
        }

        public Criteria andClassinfoPublishdateBetween(Date value1, Date value2) {
            addCriterion("classinfo_publishdate between", value1, value2, "classinfoPublishdate");
            return (Criteria) this;
        }

        public Criteria andClassinfoPublishdateNotBetween(Date value1, Date value2) {
            addCriterion("classinfo_publishdate not between", value1, value2, "classinfoPublishdate");
            return (Criteria) this;
        }

        public Criteria andClassinfoParentclassIsNull() {
            addCriterion("classinfo_parentclass is null");
            return (Criteria) this;
        }

        public Criteria andClassinfoParentclassIsNotNull() {
            addCriterion("classinfo_parentclass is not null");
            return (Criteria) this;
        }

        public Criteria andClassinfoParentclassEqualTo(Integer value) {
            addCriterion("classinfo_parentclass =", value, "classinfoParentclass");
            return (Criteria) this;
        }

        public Criteria andClassinfoParentclassNotEqualTo(Integer value) {
            addCriterion("classinfo_parentclass <>", value, "classinfoParentclass");
            return (Criteria) this;
        }

        public Criteria andClassinfoParentclassGreaterThan(Integer value) {
            addCriterion("classinfo_parentclass >", value, "classinfoParentclass");
            return (Criteria) this;
        }

        public Criteria andClassinfoParentclassGreaterThanOrEqualTo(Integer value) {
            addCriterion("classinfo_parentclass >=", value, "classinfoParentclass");
            return (Criteria) this;
        }

        public Criteria andClassinfoParentclassLessThan(Integer value) {
            addCriterion("classinfo_parentclass <", value, "classinfoParentclass");
            return (Criteria) this;
        }

        public Criteria andClassinfoParentclassLessThanOrEqualTo(Integer value) {
            addCriterion("classinfo_parentclass <=", value, "classinfoParentclass");
            return (Criteria) this;
        }

        public Criteria andClassinfoParentclassIn(List<Integer> values) {
            addCriterion("classinfo_parentclass in", values, "classinfoParentclass");
            return (Criteria) this;
        }

        public Criteria andClassinfoParentclassNotIn(List<Integer> values) {
            addCriterion("classinfo_parentclass not in", values, "classinfoParentclass");
            return (Criteria) this;
        }

        public Criteria andClassinfoParentclassBetween(Integer value1, Integer value2) {
            addCriterion("classinfo_parentclass between", value1, value2, "classinfoParentclass");
            return (Criteria) this;
        }

        public Criteria andClassinfoParentclassNotBetween(Integer value1, Integer value2) {
            addCriterion("classinfo_parentclass not between", value1, value2, "classinfoParentclass");
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