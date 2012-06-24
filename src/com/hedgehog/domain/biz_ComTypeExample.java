package com.hedgehog.domain;

import java.util.ArrayList;
import java.util.List;

public class biz_ComTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public biz_ComTypeExample() {
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

        public Criteria andComtypeidIsNull() {
            addCriterion("ComTypeID is null");
            return (Criteria) this;
        }

        public Criteria andComtypeidIsNotNull() {
            addCriterion("ComTypeID is not null");
            return (Criteria) this;
        }

        public Criteria andComtypeidEqualTo(Integer value) {
            addCriterion("ComTypeID =", value, "comtypeid");
            return (Criteria) this;
        }

        public Criteria andComtypeidNotEqualTo(Integer value) {
            addCriterion("ComTypeID <>", value, "comtypeid");
            return (Criteria) this;
        }

        public Criteria andComtypeidGreaterThan(Integer value) {
            addCriterion("ComTypeID >", value, "comtypeid");
            return (Criteria) this;
        }

        public Criteria andComtypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ComTypeID >=", value, "comtypeid");
            return (Criteria) this;
        }

        public Criteria andComtypeidLessThan(Integer value) {
            addCriterion("ComTypeID <", value, "comtypeid");
            return (Criteria) this;
        }

        public Criteria andComtypeidLessThanOrEqualTo(Integer value) {
            addCriterion("ComTypeID <=", value, "comtypeid");
            return (Criteria) this;
        }

        public Criteria andComtypeidIn(List<Integer> values) {
            addCriterion("ComTypeID in", values, "comtypeid");
            return (Criteria) this;
        }

        public Criteria andComtypeidNotIn(List<Integer> values) {
            addCriterion("ComTypeID not in", values, "comtypeid");
            return (Criteria) this;
        }

        public Criteria andComtypeidBetween(Integer value1, Integer value2) {
            addCriterion("ComTypeID between", value1, value2, "comtypeid");
            return (Criteria) this;
        }

        public Criteria andComtypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("ComTypeID not between", value1, value2, "comtypeid");
            return (Criteria) this;
        }

        public Criteria andComtypeNameIsNull() {
            addCriterion("ComType_name is null");
            return (Criteria) this;
        }

        public Criteria andComtypeNameIsNotNull() {
            addCriterion("ComType_name is not null");
            return (Criteria) this;
        }

        public Criteria andComtypeNameEqualTo(String value) {
            addCriterion("ComType_name =", value, "comtypeName");
            return (Criteria) this;
        }

        public Criteria andComtypeNameNotEqualTo(String value) {
            addCriterion("ComType_name <>", value, "comtypeName");
            return (Criteria) this;
        }

        public Criteria andComtypeNameGreaterThan(String value) {
            addCriterion("ComType_name >", value, "comtypeName");
            return (Criteria) this;
        }

        public Criteria andComtypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("ComType_name >=", value, "comtypeName");
            return (Criteria) this;
        }

        public Criteria andComtypeNameLessThan(String value) {
            addCriterion("ComType_name <", value, "comtypeName");
            return (Criteria) this;
        }

        public Criteria andComtypeNameLessThanOrEqualTo(String value) {
            addCriterion("ComType_name <=", value, "comtypeName");
            return (Criteria) this;
        }

        public Criteria andComtypeNameLike(String value) {
            addCriterion("ComType_name like", value, "comtypeName");
            return (Criteria) this;
        }

        public Criteria andComtypeNameNotLike(String value) {
            addCriterion("ComType_name not like", value, "comtypeName");
            return (Criteria) this;
        }

        public Criteria andComtypeNameIn(List<String> values) {
            addCriterion("ComType_name in", values, "comtypeName");
            return (Criteria) this;
        }

        public Criteria andComtypeNameNotIn(List<String> values) {
            addCriterion("ComType_name not in", values, "comtypeName");
            return (Criteria) this;
        }

        public Criteria andComtypeNameBetween(String value1, String value2) {
            addCriterion("ComType_name between", value1, value2, "comtypeName");
            return (Criteria) this;
        }

        public Criteria andComtypeNameNotBetween(String value1, String value2) {
            addCriterion("ComType_name not between", value1, value2, "comtypeName");
            return (Criteria) this;
        }

        public Criteria andComtypeCodeIsNull() {
            addCriterion("ComType_code is null");
            return (Criteria) this;
        }

        public Criteria andComtypeCodeIsNotNull() {
            addCriterion("ComType_code is not null");
            return (Criteria) this;
        }

        public Criteria andComtypeCodeEqualTo(String value) {
            addCriterion("ComType_code =", value, "comtypeCode");
            return (Criteria) this;
        }

        public Criteria andComtypeCodeNotEqualTo(String value) {
            addCriterion("ComType_code <>", value, "comtypeCode");
            return (Criteria) this;
        }

        public Criteria andComtypeCodeGreaterThan(String value) {
            addCriterion("ComType_code >", value, "comtypeCode");
            return (Criteria) this;
        }

        public Criteria andComtypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ComType_code >=", value, "comtypeCode");
            return (Criteria) this;
        }

        public Criteria andComtypeCodeLessThan(String value) {
            addCriterion("ComType_code <", value, "comtypeCode");
            return (Criteria) this;
        }

        public Criteria andComtypeCodeLessThanOrEqualTo(String value) {
            addCriterion("ComType_code <=", value, "comtypeCode");
            return (Criteria) this;
        }

        public Criteria andComtypeCodeLike(String value) {
            addCriterion("ComType_code like", value, "comtypeCode");
            return (Criteria) this;
        }

        public Criteria andComtypeCodeNotLike(String value) {
            addCriterion("ComType_code not like", value, "comtypeCode");
            return (Criteria) this;
        }

        public Criteria andComtypeCodeIn(List<String> values) {
            addCriterion("ComType_code in", values, "comtypeCode");
            return (Criteria) this;
        }

        public Criteria andComtypeCodeNotIn(List<String> values) {
            addCriterion("ComType_code not in", values, "comtypeCode");
            return (Criteria) this;
        }

        public Criteria andComtypeCodeBetween(String value1, String value2) {
            addCriterion("ComType_code between", value1, value2, "comtypeCode");
            return (Criteria) this;
        }

        public Criteria andComtypeCodeNotBetween(String value1, String value2) {
            addCriterion("ComType_code not between", value1, value2, "comtypeCode");
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