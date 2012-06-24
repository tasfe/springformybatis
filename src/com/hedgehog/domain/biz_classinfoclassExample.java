package com.hedgehog.domain;

import java.util.ArrayList;
import java.util.List;

public class biz_classinfoclassExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public biz_classinfoclassExample() {
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

        public Criteria andCicidIsNull() {
            addCriterion("cicID is null");
            return (Criteria) this;
        }

        public Criteria andCicidIsNotNull() {
            addCriterion("cicID is not null");
            return (Criteria) this;
        }

        public Criteria andCicidEqualTo(Integer value) {
            addCriterion("cicID =", value, "cicid");
            return (Criteria) this;
        }

        public Criteria andCicidNotEqualTo(Integer value) {
            addCriterion("cicID <>", value, "cicid");
            return (Criteria) this;
        }

        public Criteria andCicidGreaterThan(Integer value) {
            addCriterion("cicID >", value, "cicid");
            return (Criteria) this;
        }

        public Criteria andCicidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cicID >=", value, "cicid");
            return (Criteria) this;
        }

        public Criteria andCicidLessThan(Integer value) {
            addCriterion("cicID <", value, "cicid");
            return (Criteria) this;
        }

        public Criteria andCicidLessThanOrEqualTo(Integer value) {
            addCriterion("cicID <=", value, "cicid");
            return (Criteria) this;
        }

        public Criteria andCicidIn(List<Integer> values) {
            addCriterion("cicID in", values, "cicid");
            return (Criteria) this;
        }

        public Criteria andCicidNotIn(List<Integer> values) {
            addCriterion("cicID not in", values, "cicid");
            return (Criteria) this;
        }

        public Criteria andCicidBetween(Integer value1, Integer value2) {
            addCriterion("cicID between", value1, value2, "cicid");
            return (Criteria) this;
        }

        public Criteria andCicidNotBetween(Integer value1, Integer value2) {
            addCriterion("cicID not between", value1, value2, "cicid");
            return (Criteria) this;
        }

        public Criteria andCicParentidIsNull() {
            addCriterion("cic_parentID is null");
            return (Criteria) this;
        }

        public Criteria andCicParentidIsNotNull() {
            addCriterion("cic_parentID is not null");
            return (Criteria) this;
        }

        public Criteria andCicParentidEqualTo(Integer value) {
            addCriterion("cic_parentID =", value, "cicParentid");
            return (Criteria) this;
        }

        public Criteria andCicParentidNotEqualTo(Integer value) {
            addCriterion("cic_parentID <>", value, "cicParentid");
            return (Criteria) this;
        }

        public Criteria andCicParentidGreaterThan(Integer value) {
            addCriterion("cic_parentID >", value, "cicParentid");
            return (Criteria) this;
        }

        public Criteria andCicParentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cic_parentID >=", value, "cicParentid");
            return (Criteria) this;
        }

        public Criteria andCicParentidLessThan(Integer value) {
            addCriterion("cic_parentID <", value, "cicParentid");
            return (Criteria) this;
        }

        public Criteria andCicParentidLessThanOrEqualTo(Integer value) {
            addCriterion("cic_parentID <=", value, "cicParentid");
            return (Criteria) this;
        }

        public Criteria andCicParentidIn(List<Integer> values) {
            addCriterion("cic_parentID in", values, "cicParentid");
            return (Criteria) this;
        }

        public Criteria andCicParentidNotIn(List<Integer> values) {
            addCriterion("cic_parentID not in", values, "cicParentid");
            return (Criteria) this;
        }

        public Criteria andCicParentidBetween(Integer value1, Integer value2) {
            addCriterion("cic_parentID between", value1, value2, "cicParentid");
            return (Criteria) this;
        }

        public Criteria andCicParentidNotBetween(Integer value1, Integer value2) {
            addCriterion("cic_parentID not between", value1, value2, "cicParentid");
            return (Criteria) this;
        }

        public Criteria andCicNameIsNull() {
            addCriterion("cic_name is null");
            return (Criteria) this;
        }

        public Criteria andCicNameIsNotNull() {
            addCriterion("cic_name is not null");
            return (Criteria) this;
        }

        public Criteria andCicNameEqualTo(String value) {
            addCriterion("cic_name =", value, "cicName");
            return (Criteria) this;
        }

        public Criteria andCicNameNotEqualTo(String value) {
            addCriterion("cic_name <>", value, "cicName");
            return (Criteria) this;
        }

        public Criteria andCicNameGreaterThan(String value) {
            addCriterion("cic_name >", value, "cicName");
            return (Criteria) this;
        }

        public Criteria andCicNameGreaterThanOrEqualTo(String value) {
            addCriterion("cic_name >=", value, "cicName");
            return (Criteria) this;
        }

        public Criteria andCicNameLessThan(String value) {
            addCriterion("cic_name <", value, "cicName");
            return (Criteria) this;
        }

        public Criteria andCicNameLessThanOrEqualTo(String value) {
            addCriterion("cic_name <=", value, "cicName");
            return (Criteria) this;
        }

        public Criteria andCicNameLike(String value) {
            addCriterion("cic_name like", value, "cicName");
            return (Criteria) this;
        }

        public Criteria andCicNameNotLike(String value) {
            addCriterion("cic_name not like", value, "cicName");
            return (Criteria) this;
        }

        public Criteria andCicNameIn(List<String> values) {
            addCriterion("cic_name in", values, "cicName");
            return (Criteria) this;
        }

        public Criteria andCicNameNotIn(List<String> values) {
            addCriterion("cic_name not in", values, "cicName");
            return (Criteria) this;
        }

        public Criteria andCicNameBetween(String value1, String value2) {
            addCriterion("cic_name between", value1, value2, "cicName");
            return (Criteria) this;
        }

        public Criteria andCicNameNotBetween(String value1, String value2) {
            addCriterion("cic_name not between", value1, value2, "cicName");
            return (Criteria) this;
        }

        public Criteria andCicCodeIsNull() {
            addCriterion("cic_code is null");
            return (Criteria) this;
        }

        public Criteria andCicCodeIsNotNull() {
            addCriterion("cic_code is not null");
            return (Criteria) this;
        }

        public Criteria andCicCodeEqualTo(String value) {
            addCriterion("cic_code =", value, "cicCode");
            return (Criteria) this;
        }

        public Criteria andCicCodeNotEqualTo(String value) {
            addCriterion("cic_code <>", value, "cicCode");
            return (Criteria) this;
        }

        public Criteria andCicCodeGreaterThan(String value) {
            addCriterion("cic_code >", value, "cicCode");
            return (Criteria) this;
        }

        public Criteria andCicCodeGreaterThanOrEqualTo(String value) {
            addCriterion("cic_code >=", value, "cicCode");
            return (Criteria) this;
        }

        public Criteria andCicCodeLessThan(String value) {
            addCriterion("cic_code <", value, "cicCode");
            return (Criteria) this;
        }

        public Criteria andCicCodeLessThanOrEqualTo(String value) {
            addCriterion("cic_code <=", value, "cicCode");
            return (Criteria) this;
        }

        public Criteria andCicCodeLike(String value) {
            addCriterion("cic_code like", value, "cicCode");
            return (Criteria) this;
        }

        public Criteria andCicCodeNotLike(String value) {
            addCriterion("cic_code not like", value, "cicCode");
            return (Criteria) this;
        }

        public Criteria andCicCodeIn(List<String> values) {
            addCriterion("cic_code in", values, "cicCode");
            return (Criteria) this;
        }

        public Criteria andCicCodeNotIn(List<String> values) {
            addCriterion("cic_code not in", values, "cicCode");
            return (Criteria) this;
        }

        public Criteria andCicCodeBetween(String value1, String value2) {
            addCriterion("cic_code between", value1, value2, "cicCode");
            return (Criteria) this;
        }

        public Criteria andCicCodeNotBetween(String value1, String value2) {
            addCriterion("cic_code not between", value1, value2, "cicCode");
            return (Criteria) this;
        }

        public Criteria andCicOrderIsNull() {
            addCriterion("cic_order is null");
            return (Criteria) this;
        }

        public Criteria andCicOrderIsNotNull() {
            addCriterion("cic_order is not null");
            return (Criteria) this;
        }

        public Criteria andCicOrderEqualTo(Integer value) {
            addCriterion("cic_order =", value, "cicOrder");
            return (Criteria) this;
        }

        public Criteria andCicOrderNotEqualTo(Integer value) {
            addCriterion("cic_order <>", value, "cicOrder");
            return (Criteria) this;
        }

        public Criteria andCicOrderGreaterThan(Integer value) {
            addCriterion("cic_order >", value, "cicOrder");
            return (Criteria) this;
        }

        public Criteria andCicOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("cic_order >=", value, "cicOrder");
            return (Criteria) this;
        }

        public Criteria andCicOrderLessThan(Integer value) {
            addCriterion("cic_order <", value, "cicOrder");
            return (Criteria) this;
        }

        public Criteria andCicOrderLessThanOrEqualTo(Integer value) {
            addCriterion("cic_order <=", value, "cicOrder");
            return (Criteria) this;
        }

        public Criteria andCicOrderIn(List<Integer> values) {
            addCriterion("cic_order in", values, "cicOrder");
            return (Criteria) this;
        }

        public Criteria andCicOrderNotIn(List<Integer> values) {
            addCriterion("cic_order not in", values, "cicOrder");
            return (Criteria) this;
        }

        public Criteria andCicOrderBetween(Integer value1, Integer value2) {
            addCriterion("cic_order between", value1, value2, "cicOrder");
            return (Criteria) this;
        }

        public Criteria andCicOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("cic_order not between", value1, value2, "cicOrder");
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