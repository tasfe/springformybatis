package com.hedgehog.domain;

import java.util.ArrayList;
import java.util.List;

public class biz_templet_classExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public biz_templet_classExample() {
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

        public Criteria andTcidIsNull() {
            addCriterion("tcID is null");
            return (Criteria) this;
        }

        public Criteria andTcidIsNotNull() {
            addCriterion("tcID is not null");
            return (Criteria) this;
        }

        public Criteria andTcidEqualTo(Integer value) {
            addCriterion("tcID =", value, "tcid");
            return (Criteria) this;
        }

        public Criteria andTcidNotEqualTo(Integer value) {
            addCriterion("tcID <>", value, "tcid");
            return (Criteria) this;
        }

        public Criteria andTcidGreaterThan(Integer value) {
            addCriterion("tcID >", value, "tcid");
            return (Criteria) this;
        }

        public Criteria andTcidGreaterThanOrEqualTo(Integer value) {
            addCriterion("tcID >=", value, "tcid");
            return (Criteria) this;
        }

        public Criteria andTcidLessThan(Integer value) {
            addCriterion("tcID <", value, "tcid");
            return (Criteria) this;
        }

        public Criteria andTcidLessThanOrEqualTo(Integer value) {
            addCriterion("tcID <=", value, "tcid");
            return (Criteria) this;
        }

        public Criteria andTcidIn(List<Integer> values) {
            addCriterion("tcID in", values, "tcid");
            return (Criteria) this;
        }

        public Criteria andTcidNotIn(List<Integer> values) {
            addCriterion("tcID not in", values, "tcid");
            return (Criteria) this;
        }

        public Criteria andTcidBetween(Integer value1, Integer value2) {
            addCriterion("tcID between", value1, value2, "tcid");
            return (Criteria) this;
        }

        public Criteria andTcidNotBetween(Integer value1, Integer value2) {
            addCriterion("tcID not between", value1, value2, "tcid");
            return (Criteria) this;
        }

        public Criteria andTcNameIsNull() {
            addCriterion("tc_name is null");
            return (Criteria) this;
        }

        public Criteria andTcNameIsNotNull() {
            addCriterion("tc_name is not null");
            return (Criteria) this;
        }

        public Criteria andTcNameEqualTo(String value) {
            addCriterion("tc_name =", value, "tcName");
            return (Criteria) this;
        }

        public Criteria andTcNameNotEqualTo(String value) {
            addCriterion("tc_name <>", value, "tcName");
            return (Criteria) this;
        }

        public Criteria andTcNameGreaterThan(String value) {
            addCriterion("tc_name >", value, "tcName");
            return (Criteria) this;
        }

        public Criteria andTcNameGreaterThanOrEqualTo(String value) {
            addCriterion("tc_name >=", value, "tcName");
            return (Criteria) this;
        }

        public Criteria andTcNameLessThan(String value) {
            addCriterion("tc_name <", value, "tcName");
            return (Criteria) this;
        }

        public Criteria andTcNameLessThanOrEqualTo(String value) {
            addCriterion("tc_name <=", value, "tcName");
            return (Criteria) this;
        }

        public Criteria andTcNameLike(String value) {
            addCriterion("tc_name like", value, "tcName");
            return (Criteria) this;
        }

        public Criteria andTcNameNotLike(String value) {
            addCriterion("tc_name not like", value, "tcName");
            return (Criteria) this;
        }

        public Criteria andTcNameIn(List<String> values) {
            addCriterion("tc_name in", values, "tcName");
            return (Criteria) this;
        }

        public Criteria andTcNameNotIn(List<String> values) {
            addCriterion("tc_name not in", values, "tcName");
            return (Criteria) this;
        }

        public Criteria andTcNameBetween(String value1, String value2) {
            addCriterion("tc_name between", value1, value2, "tcName");
            return (Criteria) this;
        }

        public Criteria andTcNameNotBetween(String value1, String value2) {
            addCriterion("tc_name not between", value1, value2, "tcName");
            return (Criteria) this;
        }

        public Criteria andTcCodeIsNull() {
            addCriterion("tc_code is null");
            return (Criteria) this;
        }

        public Criteria andTcCodeIsNotNull() {
            addCriterion("tc_code is not null");
            return (Criteria) this;
        }

        public Criteria andTcCodeEqualTo(String value) {
            addCriterion("tc_code =", value, "tcCode");
            return (Criteria) this;
        }

        public Criteria andTcCodeNotEqualTo(String value) {
            addCriterion("tc_code <>", value, "tcCode");
            return (Criteria) this;
        }

        public Criteria andTcCodeGreaterThan(String value) {
            addCriterion("tc_code >", value, "tcCode");
            return (Criteria) this;
        }

        public Criteria andTcCodeGreaterThanOrEqualTo(String value) {
            addCriterion("tc_code >=", value, "tcCode");
            return (Criteria) this;
        }

        public Criteria andTcCodeLessThan(String value) {
            addCriterion("tc_code <", value, "tcCode");
            return (Criteria) this;
        }

        public Criteria andTcCodeLessThanOrEqualTo(String value) {
            addCriterion("tc_code <=", value, "tcCode");
            return (Criteria) this;
        }

        public Criteria andTcCodeLike(String value) {
            addCriterion("tc_code like", value, "tcCode");
            return (Criteria) this;
        }

        public Criteria andTcCodeNotLike(String value) {
            addCriterion("tc_code not like", value, "tcCode");
            return (Criteria) this;
        }

        public Criteria andTcCodeIn(List<String> values) {
            addCriterion("tc_code in", values, "tcCode");
            return (Criteria) this;
        }

        public Criteria andTcCodeNotIn(List<String> values) {
            addCriterion("tc_code not in", values, "tcCode");
            return (Criteria) this;
        }

        public Criteria andTcCodeBetween(String value1, String value2) {
            addCriterion("tc_code between", value1, value2, "tcCode");
            return (Criteria) this;
        }

        public Criteria andTcCodeNotBetween(String value1, String value2) {
            addCriterion("tc_code not between", value1, value2, "tcCode");
            return (Criteria) this;
        }

        public Criteria andTcHoldIsNull() {
            addCriterion("tc_hold is null");
            return (Criteria) this;
        }

        public Criteria andTcHoldIsNotNull() {
            addCriterion("tc_hold is not null");
            return (Criteria) this;
        }

        public Criteria andTcHoldEqualTo(String value) {
            addCriterion("tc_hold =", value, "tcHold");
            return (Criteria) this;
        }

        public Criteria andTcHoldNotEqualTo(String value) {
            addCriterion("tc_hold <>", value, "tcHold");
            return (Criteria) this;
        }

        public Criteria andTcHoldGreaterThan(String value) {
            addCriterion("tc_hold >", value, "tcHold");
            return (Criteria) this;
        }

        public Criteria andTcHoldGreaterThanOrEqualTo(String value) {
            addCriterion("tc_hold >=", value, "tcHold");
            return (Criteria) this;
        }

        public Criteria andTcHoldLessThan(String value) {
            addCriterion("tc_hold <", value, "tcHold");
            return (Criteria) this;
        }

        public Criteria andTcHoldLessThanOrEqualTo(String value) {
            addCriterion("tc_hold <=", value, "tcHold");
            return (Criteria) this;
        }

        public Criteria andTcHoldLike(String value) {
            addCriterion("tc_hold like", value, "tcHold");
            return (Criteria) this;
        }

        public Criteria andTcHoldNotLike(String value) {
            addCriterion("tc_hold not like", value, "tcHold");
            return (Criteria) this;
        }

        public Criteria andTcHoldIn(List<String> values) {
            addCriterion("tc_hold in", values, "tcHold");
            return (Criteria) this;
        }

        public Criteria andTcHoldNotIn(List<String> values) {
            addCriterion("tc_hold not in", values, "tcHold");
            return (Criteria) this;
        }

        public Criteria andTcHoldBetween(String value1, String value2) {
            addCriterion("tc_hold between", value1, value2, "tcHold");
            return (Criteria) this;
        }

        public Criteria andTcHoldNotBetween(String value1, String value2) {
            addCriterion("tc_hold not between", value1, value2, "tcHold");
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