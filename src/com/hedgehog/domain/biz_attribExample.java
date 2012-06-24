package com.hedgehog.domain;

import java.util.ArrayList;
import java.util.List;

public class biz_attribExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public biz_attribExample() {
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

        public Criteria andAttribidIsNull() {
            addCriterion("attribID is null");
            return (Criteria) this;
        }

        public Criteria andAttribidIsNotNull() {
            addCriterion("attribID is not null");
            return (Criteria) this;
        }

        public Criteria andAttribidEqualTo(Integer value) {
            addCriterion("attribID =", value, "attribid");
            return (Criteria) this;
        }

        public Criteria andAttribidNotEqualTo(Integer value) {
            addCriterion("attribID <>", value, "attribid");
            return (Criteria) this;
        }

        public Criteria andAttribidGreaterThan(Integer value) {
            addCriterion("attribID >", value, "attribid");
            return (Criteria) this;
        }

        public Criteria andAttribidGreaterThanOrEqualTo(Integer value) {
            addCriterion("attribID >=", value, "attribid");
            return (Criteria) this;
        }

        public Criteria andAttribidLessThan(Integer value) {
            addCriterion("attribID <", value, "attribid");
            return (Criteria) this;
        }

        public Criteria andAttribidLessThanOrEqualTo(Integer value) {
            addCriterion("attribID <=", value, "attribid");
            return (Criteria) this;
        }

        public Criteria andAttribidIn(List<Integer> values) {
            addCriterion("attribID in", values, "attribid");
            return (Criteria) this;
        }

        public Criteria andAttribidNotIn(List<Integer> values) {
            addCriterion("attribID not in", values, "attribid");
            return (Criteria) this;
        }

        public Criteria andAttribidBetween(Integer value1, Integer value2) {
            addCriterion("attribID between", value1, value2, "attribid");
            return (Criteria) this;
        }

        public Criteria andAttribidNotBetween(Integer value1, Integer value2) {
            addCriterion("attribID not between", value1, value2, "attribid");
            return (Criteria) this;
        }

        public Criteria andKNameIsNull() {
            addCriterion("k_name is null");
            return (Criteria) this;
        }

        public Criteria andKNameIsNotNull() {
            addCriterion("k_name is not null");
            return (Criteria) this;
        }

        public Criteria andKNameEqualTo(String value) {
            addCriterion("k_name =", value, "kName");
            return (Criteria) this;
        }

        public Criteria andKNameNotEqualTo(String value) {
            addCriterion("k_name <>", value, "kName");
            return (Criteria) this;
        }

        public Criteria andKNameGreaterThan(String value) {
            addCriterion("k_name >", value, "kName");
            return (Criteria) this;
        }

        public Criteria andKNameGreaterThanOrEqualTo(String value) {
            addCriterion("k_name >=", value, "kName");
            return (Criteria) this;
        }

        public Criteria andKNameLessThan(String value) {
            addCriterion("k_name <", value, "kName");
            return (Criteria) this;
        }

        public Criteria andKNameLessThanOrEqualTo(String value) {
            addCriterion("k_name <=", value, "kName");
            return (Criteria) this;
        }

        public Criteria andKNameLike(String value) {
            addCriterion("k_name like", value, "kName");
            return (Criteria) this;
        }

        public Criteria andKNameNotLike(String value) {
            addCriterion("k_name not like", value, "kName");
            return (Criteria) this;
        }

        public Criteria andKNameIn(List<String> values) {
            addCriterion("k_name in", values, "kName");
            return (Criteria) this;
        }

        public Criteria andKNameNotIn(List<String> values) {
            addCriterion("k_name not in", values, "kName");
            return (Criteria) this;
        }

        public Criteria andKNameBetween(String value1, String value2) {
            addCriterion("k_name between", value1, value2, "kName");
            return (Criteria) this;
        }

        public Criteria andKNameNotBetween(String value1, String value2) {
            addCriterion("k_name not between", value1, value2, "kName");
            return (Criteria) this;
        }

        public Criteria andKValueIsNull() {
            addCriterion("k_value is null");
            return (Criteria) this;
        }

        public Criteria andKValueIsNotNull() {
            addCriterion("k_value is not null");
            return (Criteria) this;
        }

        public Criteria andKValueEqualTo(String value) {
            addCriterion("k_value =", value, "kValue");
            return (Criteria) this;
        }

        public Criteria andKValueNotEqualTo(String value) {
            addCriterion("k_value <>", value, "kValue");
            return (Criteria) this;
        }

        public Criteria andKValueGreaterThan(String value) {
            addCriterion("k_value >", value, "kValue");
            return (Criteria) this;
        }

        public Criteria andKValueGreaterThanOrEqualTo(String value) {
            addCriterion("k_value >=", value, "kValue");
            return (Criteria) this;
        }

        public Criteria andKValueLessThan(String value) {
            addCriterion("k_value <", value, "kValue");
            return (Criteria) this;
        }

        public Criteria andKValueLessThanOrEqualTo(String value) {
            addCriterion("k_value <=", value, "kValue");
            return (Criteria) this;
        }

        public Criteria andKValueLike(String value) {
            addCriterion("k_value like", value, "kValue");
            return (Criteria) this;
        }

        public Criteria andKValueNotLike(String value) {
            addCriterion("k_value not like", value, "kValue");
            return (Criteria) this;
        }

        public Criteria andKValueIn(List<String> values) {
            addCriterion("k_value in", values, "kValue");
            return (Criteria) this;
        }

        public Criteria andKValueNotIn(List<String> values) {
            addCriterion("k_value not in", values, "kValue");
            return (Criteria) this;
        }

        public Criteria andKValueBetween(String value1, String value2) {
            addCriterion("k_value between", value1, value2, "kValue");
            return (Criteria) this;
        }

        public Criteria andKValueNotBetween(String value1, String value2) {
            addCriterion("k_value not between", value1, value2, "kValue");
            return (Criteria) this;
        }

        public Criteria andMIdIsNull() {
            addCriterion("m_id is null");
            return (Criteria) this;
        }

        public Criteria andMIdIsNotNull() {
            addCriterion("m_id is not null");
            return (Criteria) this;
        }

        public Criteria andMIdEqualTo(Integer value) {
            addCriterion("m_id =", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotEqualTo(Integer value) {
            addCriterion("m_id <>", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdGreaterThan(Integer value) {
            addCriterion("m_id >", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("m_id >=", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdLessThan(Integer value) {
            addCriterion("m_id <", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdLessThanOrEqualTo(Integer value) {
            addCriterion("m_id <=", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdIn(List<Integer> values) {
            addCriterion("m_id in", values, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotIn(List<Integer> values) {
            addCriterion("m_id not in", values, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdBetween(Integer value1, Integer value2) {
            addCriterion("m_id between", value1, value2, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotBetween(Integer value1, Integer value2) {
            addCriterion("m_id not between", value1, value2, "mId");
            return (Criteria) this;
        }

        public Criteria andKTypeIsNull() {
            addCriterion("k_type is null");
            return (Criteria) this;
        }

        public Criteria andKTypeIsNotNull() {
            addCriterion("k_type is not null");
            return (Criteria) this;
        }

        public Criteria andKTypeEqualTo(String value) {
            addCriterion("k_type =", value, "kType");
            return (Criteria) this;
        }

        public Criteria andKTypeNotEqualTo(String value) {
            addCriterion("k_type <>", value, "kType");
            return (Criteria) this;
        }

        public Criteria andKTypeGreaterThan(String value) {
            addCriterion("k_type >", value, "kType");
            return (Criteria) this;
        }

        public Criteria andKTypeGreaterThanOrEqualTo(String value) {
            addCriterion("k_type >=", value, "kType");
            return (Criteria) this;
        }

        public Criteria andKTypeLessThan(String value) {
            addCriterion("k_type <", value, "kType");
            return (Criteria) this;
        }

        public Criteria andKTypeLessThanOrEqualTo(String value) {
            addCriterion("k_type <=", value, "kType");
            return (Criteria) this;
        }

        public Criteria andKTypeLike(String value) {
            addCriterion("k_type like", value, "kType");
            return (Criteria) this;
        }

        public Criteria andKTypeNotLike(String value) {
            addCriterion("k_type not like", value, "kType");
            return (Criteria) this;
        }

        public Criteria andKTypeIn(List<String> values) {
            addCriterion("k_type in", values, "kType");
            return (Criteria) this;
        }

        public Criteria andKTypeNotIn(List<String> values) {
            addCriterion("k_type not in", values, "kType");
            return (Criteria) this;
        }

        public Criteria andKTypeBetween(String value1, String value2) {
            addCriterion("k_type between", value1, value2, "kType");
            return (Criteria) this;
        }

        public Criteria andKTypeNotBetween(String value1, String value2) {
            addCriterion("k_type not between", value1, value2, "kType");
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