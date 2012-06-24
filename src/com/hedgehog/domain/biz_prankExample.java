package com.hedgehog.domain;

import java.util.ArrayList;
import java.util.List;

public class biz_prankExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public biz_prankExample() {
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

        public Criteria andPrankidIsNull() {
            addCriterion("prankID is null");
            return (Criteria) this;
        }

        public Criteria andPrankidIsNotNull() {
            addCriterion("prankID is not null");
            return (Criteria) this;
        }

        public Criteria andPrankidEqualTo(Integer value) {
            addCriterion("prankID =", value, "prankid");
            return (Criteria) this;
        }

        public Criteria andPrankidNotEqualTo(Integer value) {
            addCriterion("prankID <>", value, "prankid");
            return (Criteria) this;
        }

        public Criteria andPrankidGreaterThan(Integer value) {
            addCriterion("prankID >", value, "prankid");
            return (Criteria) this;
        }

        public Criteria andPrankidGreaterThanOrEqualTo(Integer value) {
            addCriterion("prankID >=", value, "prankid");
            return (Criteria) this;
        }

        public Criteria andPrankidLessThan(Integer value) {
            addCriterion("prankID <", value, "prankid");
            return (Criteria) this;
        }

        public Criteria andPrankidLessThanOrEqualTo(Integer value) {
            addCriterion("prankID <=", value, "prankid");
            return (Criteria) this;
        }

        public Criteria andPrankidIn(List<Integer> values) {
            addCriterion("prankID in", values, "prankid");
            return (Criteria) this;
        }

        public Criteria andPrankidNotIn(List<Integer> values) {
            addCriterion("prankID not in", values, "prankid");
            return (Criteria) this;
        }

        public Criteria andPrankidBetween(Integer value1, Integer value2) {
            addCriterion("prankID between", value1, value2, "prankid");
            return (Criteria) this;
        }

        public Criteria andPrankidNotBetween(Integer value1, Integer value2) {
            addCriterion("prankID not between", value1, value2, "prankid");
            return (Criteria) this;
        }

        public Criteria andPrankNameIsNull() {
            addCriterion("prank_name is null");
            return (Criteria) this;
        }

        public Criteria andPrankNameIsNotNull() {
            addCriterion("prank_name is not null");
            return (Criteria) this;
        }

        public Criteria andPrankNameEqualTo(String value) {
            addCriterion("prank_name =", value, "prankName");
            return (Criteria) this;
        }

        public Criteria andPrankNameNotEqualTo(String value) {
            addCriterion("prank_name <>", value, "prankName");
            return (Criteria) this;
        }

        public Criteria andPrankNameGreaterThan(String value) {
            addCriterion("prank_name >", value, "prankName");
            return (Criteria) this;
        }

        public Criteria andPrankNameGreaterThanOrEqualTo(String value) {
            addCriterion("prank_name >=", value, "prankName");
            return (Criteria) this;
        }

        public Criteria andPrankNameLessThan(String value) {
            addCriterion("prank_name <", value, "prankName");
            return (Criteria) this;
        }

        public Criteria andPrankNameLessThanOrEqualTo(String value) {
            addCriterion("prank_name <=", value, "prankName");
            return (Criteria) this;
        }

        public Criteria andPrankNameLike(String value) {
            addCriterion("prank_name like", value, "prankName");
            return (Criteria) this;
        }

        public Criteria andPrankNameNotLike(String value) {
            addCriterion("prank_name not like", value, "prankName");
            return (Criteria) this;
        }

        public Criteria andPrankNameIn(List<String> values) {
            addCriterion("prank_name in", values, "prankName");
            return (Criteria) this;
        }

        public Criteria andPrankNameNotIn(List<String> values) {
            addCriterion("prank_name not in", values, "prankName");
            return (Criteria) this;
        }

        public Criteria andPrankNameBetween(String value1, String value2) {
            addCriterion("prank_name between", value1, value2, "prankName");
            return (Criteria) this;
        }

        public Criteria andPrankNameNotBetween(String value1, String value2) {
            addCriterion("prank_name not between", value1, value2, "prankName");
            return (Criteria) this;
        }

        public Criteria andPrankCodeIsNull() {
            addCriterion("prank_code is null");
            return (Criteria) this;
        }

        public Criteria andPrankCodeIsNotNull() {
            addCriterion("prank_code is not null");
            return (Criteria) this;
        }

        public Criteria andPrankCodeEqualTo(String value) {
            addCriterion("prank_code =", value, "prankCode");
            return (Criteria) this;
        }

        public Criteria andPrankCodeNotEqualTo(String value) {
            addCriterion("prank_code <>", value, "prankCode");
            return (Criteria) this;
        }

        public Criteria andPrankCodeGreaterThan(String value) {
            addCriterion("prank_code >", value, "prankCode");
            return (Criteria) this;
        }

        public Criteria andPrankCodeGreaterThanOrEqualTo(String value) {
            addCriterion("prank_code >=", value, "prankCode");
            return (Criteria) this;
        }

        public Criteria andPrankCodeLessThan(String value) {
            addCriterion("prank_code <", value, "prankCode");
            return (Criteria) this;
        }

        public Criteria andPrankCodeLessThanOrEqualTo(String value) {
            addCriterion("prank_code <=", value, "prankCode");
            return (Criteria) this;
        }

        public Criteria andPrankCodeLike(String value) {
            addCriterion("prank_code like", value, "prankCode");
            return (Criteria) this;
        }

        public Criteria andPrankCodeNotLike(String value) {
            addCriterion("prank_code not like", value, "prankCode");
            return (Criteria) this;
        }

        public Criteria andPrankCodeIn(List<String> values) {
            addCriterion("prank_code in", values, "prankCode");
            return (Criteria) this;
        }

        public Criteria andPrankCodeNotIn(List<String> values) {
            addCriterion("prank_code not in", values, "prankCode");
            return (Criteria) this;
        }

        public Criteria andPrankCodeBetween(String value1, String value2) {
            addCriterion("prank_code between", value1, value2, "prankCode");
            return (Criteria) this;
        }

        public Criteria andPrankCodeNotBetween(String value1, String value2) {
            addCriterion("prank_code not between", value1, value2, "prankCode");
            return (Criteria) this;
        }

        public Criteria andPrankOrderIsNull() {
            addCriterion("prank_order is null");
            return (Criteria) this;
        }

        public Criteria andPrankOrderIsNotNull() {
            addCriterion("prank_order is not null");
            return (Criteria) this;
        }

        public Criteria andPrankOrderEqualTo(Integer value) {
            addCriterion("prank_order =", value, "prankOrder");
            return (Criteria) this;
        }

        public Criteria andPrankOrderNotEqualTo(Integer value) {
            addCriterion("prank_order <>", value, "prankOrder");
            return (Criteria) this;
        }

        public Criteria andPrankOrderGreaterThan(Integer value) {
            addCriterion("prank_order >", value, "prankOrder");
            return (Criteria) this;
        }

        public Criteria andPrankOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("prank_order >=", value, "prankOrder");
            return (Criteria) this;
        }

        public Criteria andPrankOrderLessThan(Integer value) {
            addCriterion("prank_order <", value, "prankOrder");
            return (Criteria) this;
        }

        public Criteria andPrankOrderLessThanOrEqualTo(Integer value) {
            addCriterion("prank_order <=", value, "prankOrder");
            return (Criteria) this;
        }

        public Criteria andPrankOrderIn(List<Integer> values) {
            addCriterion("prank_order in", values, "prankOrder");
            return (Criteria) this;
        }

        public Criteria andPrankOrderNotIn(List<Integer> values) {
            addCriterion("prank_order not in", values, "prankOrder");
            return (Criteria) this;
        }

        public Criteria andPrankOrderBetween(Integer value1, Integer value2) {
            addCriterion("prank_order between", value1, value2, "prankOrder");
            return (Criteria) this;
        }

        public Criteria andPrankOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("prank_order not between", value1, value2, "prankOrder");
            return (Criteria) this;
        }

        public Criteria andPrankDesIsNull() {
            addCriterion("prank_des is null");
            return (Criteria) this;
        }

        public Criteria andPrankDesIsNotNull() {
            addCriterion("prank_des is not null");
            return (Criteria) this;
        }

        public Criteria andPrankDesEqualTo(String value) {
            addCriterion("prank_des =", value, "prankDes");
            return (Criteria) this;
        }

        public Criteria andPrankDesNotEqualTo(String value) {
            addCriterion("prank_des <>", value, "prankDes");
            return (Criteria) this;
        }

        public Criteria andPrankDesGreaterThan(String value) {
            addCriterion("prank_des >", value, "prankDes");
            return (Criteria) this;
        }

        public Criteria andPrankDesGreaterThanOrEqualTo(String value) {
            addCriterion("prank_des >=", value, "prankDes");
            return (Criteria) this;
        }

        public Criteria andPrankDesLessThan(String value) {
            addCriterion("prank_des <", value, "prankDes");
            return (Criteria) this;
        }

        public Criteria andPrankDesLessThanOrEqualTo(String value) {
            addCriterion("prank_des <=", value, "prankDes");
            return (Criteria) this;
        }

        public Criteria andPrankDesLike(String value) {
            addCriterion("prank_des like", value, "prankDes");
            return (Criteria) this;
        }

        public Criteria andPrankDesNotLike(String value) {
            addCriterion("prank_des not like", value, "prankDes");
            return (Criteria) this;
        }

        public Criteria andPrankDesIn(List<String> values) {
            addCriterion("prank_des in", values, "prankDes");
            return (Criteria) this;
        }

        public Criteria andPrankDesNotIn(List<String> values) {
            addCriterion("prank_des not in", values, "prankDes");
            return (Criteria) this;
        }

        public Criteria andPrankDesBetween(String value1, String value2) {
            addCriterion("prank_des between", value1, value2, "prankDes");
            return (Criteria) this;
        }

        public Criteria andPrankDesNotBetween(String value1, String value2) {
            addCriterion("prank_des not between", value1, value2, "prankDes");
            return (Criteria) this;
        }

        public Criteria andPrankHonorIsNull() {
            addCriterion("prank_honor is null");
            return (Criteria) this;
        }

        public Criteria andPrankHonorIsNotNull() {
            addCriterion("prank_honor is not null");
            return (Criteria) this;
        }

        public Criteria andPrankHonorEqualTo(String value) {
            addCriterion("prank_honor =", value, "prankHonor");
            return (Criteria) this;
        }

        public Criteria andPrankHonorNotEqualTo(String value) {
            addCriterion("prank_honor <>", value, "prankHonor");
            return (Criteria) this;
        }

        public Criteria andPrankHonorGreaterThan(String value) {
            addCriterion("prank_honor >", value, "prankHonor");
            return (Criteria) this;
        }

        public Criteria andPrankHonorGreaterThanOrEqualTo(String value) {
            addCriterion("prank_honor >=", value, "prankHonor");
            return (Criteria) this;
        }

        public Criteria andPrankHonorLessThan(String value) {
            addCriterion("prank_honor <", value, "prankHonor");
            return (Criteria) this;
        }

        public Criteria andPrankHonorLessThanOrEqualTo(String value) {
            addCriterion("prank_honor <=", value, "prankHonor");
            return (Criteria) this;
        }

        public Criteria andPrankHonorLike(String value) {
            addCriterion("prank_honor like", value, "prankHonor");
            return (Criteria) this;
        }

        public Criteria andPrankHonorNotLike(String value) {
            addCriterion("prank_honor not like", value, "prankHonor");
            return (Criteria) this;
        }

        public Criteria andPrankHonorIn(List<String> values) {
            addCriterion("prank_honor in", values, "prankHonor");
            return (Criteria) this;
        }

        public Criteria andPrankHonorNotIn(List<String> values) {
            addCriterion("prank_honor not in", values, "prankHonor");
            return (Criteria) this;
        }

        public Criteria andPrankHonorBetween(String value1, String value2) {
            addCriterion("prank_honor between", value1, value2, "prankHonor");
            return (Criteria) this;
        }

        public Criteria andPrankHonorNotBetween(String value1, String value2) {
            addCriterion("prank_honor not between", value1, value2, "prankHonor");
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