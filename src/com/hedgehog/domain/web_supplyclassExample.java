package com.hedgehog.domain;

import java.util.ArrayList;
import java.util.List;

public class web_supplyclassExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public web_supplyclassExample() {
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

        public Criteria andScidIsNull() {
            addCriterion("scID is null");
            return (Criteria) this;
        }

        public Criteria andScidIsNotNull() {
            addCriterion("scID is not null");
            return (Criteria) this;
        }

        public Criteria andScidEqualTo(Integer value) {
            addCriterion("scID =", value, "scid");
            return (Criteria) this;
        }

        public Criteria andScidNotEqualTo(Integer value) {
            addCriterion("scID <>", value, "scid");
            return (Criteria) this;
        }

        public Criteria andScidGreaterThan(Integer value) {
            addCriterion("scID >", value, "scid");
            return (Criteria) this;
        }

        public Criteria andScidGreaterThanOrEqualTo(Integer value) {
            addCriterion("scID >=", value, "scid");
            return (Criteria) this;
        }

        public Criteria andScidLessThan(Integer value) {
            addCriterion("scID <", value, "scid");
            return (Criteria) this;
        }

        public Criteria andScidLessThanOrEqualTo(Integer value) {
            addCriterion("scID <=", value, "scid");
            return (Criteria) this;
        }

        public Criteria andScidIn(List<Integer> values) {
            addCriterion("scID in", values, "scid");
            return (Criteria) this;
        }

        public Criteria andScidNotIn(List<Integer> values) {
            addCriterion("scID not in", values, "scid");
            return (Criteria) this;
        }

        public Criteria andScidBetween(Integer value1, Integer value2) {
            addCriterion("scID between", value1, value2, "scid");
            return (Criteria) this;
        }

        public Criteria andScidNotBetween(Integer value1, Integer value2) {
            addCriterion("scID not between", value1, value2, "scid");
            return (Criteria) this;
        }

        public Criteria andScParentidIsNull() {
            addCriterion("sc_parentID is null");
            return (Criteria) this;
        }

        public Criteria andScParentidIsNotNull() {
            addCriterion("sc_parentID is not null");
            return (Criteria) this;
        }

        public Criteria andScParentidEqualTo(Integer value) {
            addCriterion("sc_parentID =", value, "scParentid");
            return (Criteria) this;
        }

        public Criteria andScParentidNotEqualTo(Integer value) {
            addCriterion("sc_parentID <>", value, "scParentid");
            return (Criteria) this;
        }

        public Criteria andScParentidGreaterThan(Integer value) {
            addCriterion("sc_parentID >", value, "scParentid");
            return (Criteria) this;
        }

        public Criteria andScParentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sc_parentID >=", value, "scParentid");
            return (Criteria) this;
        }

        public Criteria andScParentidLessThan(Integer value) {
            addCriterion("sc_parentID <", value, "scParentid");
            return (Criteria) this;
        }

        public Criteria andScParentidLessThanOrEqualTo(Integer value) {
            addCriterion("sc_parentID <=", value, "scParentid");
            return (Criteria) this;
        }

        public Criteria andScParentidIn(List<Integer> values) {
            addCriterion("sc_parentID in", values, "scParentid");
            return (Criteria) this;
        }

        public Criteria andScParentidNotIn(List<Integer> values) {
            addCriterion("sc_parentID not in", values, "scParentid");
            return (Criteria) this;
        }

        public Criteria andScParentidBetween(Integer value1, Integer value2) {
            addCriterion("sc_parentID between", value1, value2, "scParentid");
            return (Criteria) this;
        }

        public Criteria andScParentidNotBetween(Integer value1, Integer value2) {
            addCriterion("sc_parentID not between", value1, value2, "scParentid");
            return (Criteria) this;
        }

        public Criteria andScNameIsNull() {
            addCriterion("sc_name is null");
            return (Criteria) this;
        }

        public Criteria andScNameIsNotNull() {
            addCriterion("sc_name is not null");
            return (Criteria) this;
        }

        public Criteria andScNameEqualTo(String value) {
            addCriterion("sc_name =", value, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameNotEqualTo(String value) {
            addCriterion("sc_name <>", value, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameGreaterThan(String value) {
            addCriterion("sc_name >", value, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameGreaterThanOrEqualTo(String value) {
            addCriterion("sc_name >=", value, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameLessThan(String value) {
            addCriterion("sc_name <", value, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameLessThanOrEqualTo(String value) {
            addCriterion("sc_name <=", value, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameLike(String value) {
            addCriterion("sc_name like", value, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameNotLike(String value) {
            addCriterion("sc_name not like", value, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameIn(List<String> values) {
            addCriterion("sc_name in", values, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameNotIn(List<String> values) {
            addCriterion("sc_name not in", values, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameBetween(String value1, String value2) {
            addCriterion("sc_name between", value1, value2, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameNotBetween(String value1, String value2) {
            addCriterion("sc_name not between", value1, value2, "scName");
            return (Criteria) this;
        }

        public Criteria andScCodeIsNull() {
            addCriterion("sc_code is null");
            return (Criteria) this;
        }

        public Criteria andScCodeIsNotNull() {
            addCriterion("sc_code is not null");
            return (Criteria) this;
        }

        public Criteria andScCodeEqualTo(String value) {
            addCriterion("sc_code =", value, "scCode");
            return (Criteria) this;
        }

        public Criteria andScCodeNotEqualTo(String value) {
            addCriterion("sc_code <>", value, "scCode");
            return (Criteria) this;
        }

        public Criteria andScCodeGreaterThan(String value) {
            addCriterion("sc_code >", value, "scCode");
            return (Criteria) this;
        }

        public Criteria andScCodeGreaterThanOrEqualTo(String value) {
            addCriterion("sc_code >=", value, "scCode");
            return (Criteria) this;
        }

        public Criteria andScCodeLessThan(String value) {
            addCriterion("sc_code <", value, "scCode");
            return (Criteria) this;
        }

        public Criteria andScCodeLessThanOrEqualTo(String value) {
            addCriterion("sc_code <=", value, "scCode");
            return (Criteria) this;
        }

        public Criteria andScCodeLike(String value) {
            addCriterion("sc_code like", value, "scCode");
            return (Criteria) this;
        }

        public Criteria andScCodeNotLike(String value) {
            addCriterion("sc_code not like", value, "scCode");
            return (Criteria) this;
        }

        public Criteria andScCodeIn(List<String> values) {
            addCriterion("sc_code in", values, "scCode");
            return (Criteria) this;
        }

        public Criteria andScCodeNotIn(List<String> values) {
            addCriterion("sc_code not in", values, "scCode");
            return (Criteria) this;
        }

        public Criteria andScCodeBetween(String value1, String value2) {
            addCriterion("sc_code between", value1, value2, "scCode");
            return (Criteria) this;
        }

        public Criteria andScCodeNotBetween(String value1, String value2) {
            addCriterion("sc_code not between", value1, value2, "scCode");
            return (Criteria) this;
        }

        public Criteria andScMenuidIsNull() {
            addCriterion("sc_menuID is null");
            return (Criteria) this;
        }

        public Criteria andScMenuidIsNotNull() {
            addCriterion("sc_menuID is not null");
            return (Criteria) this;
        }

        public Criteria andScMenuidEqualTo(Integer value) {
            addCriterion("sc_menuID =", value, "scMenuid");
            return (Criteria) this;
        }

        public Criteria andScMenuidNotEqualTo(Integer value) {
            addCriterion("sc_menuID <>", value, "scMenuid");
            return (Criteria) this;
        }

        public Criteria andScMenuidGreaterThan(Integer value) {
            addCriterion("sc_menuID >", value, "scMenuid");
            return (Criteria) this;
        }

        public Criteria andScMenuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sc_menuID >=", value, "scMenuid");
            return (Criteria) this;
        }

        public Criteria andScMenuidLessThan(Integer value) {
            addCriterion("sc_menuID <", value, "scMenuid");
            return (Criteria) this;
        }

        public Criteria andScMenuidLessThanOrEqualTo(Integer value) {
            addCriterion("sc_menuID <=", value, "scMenuid");
            return (Criteria) this;
        }

        public Criteria andScMenuidIn(List<Integer> values) {
            addCriterion("sc_menuID in", values, "scMenuid");
            return (Criteria) this;
        }

        public Criteria andScMenuidNotIn(List<Integer> values) {
            addCriterion("sc_menuID not in", values, "scMenuid");
            return (Criteria) this;
        }

        public Criteria andScMenuidBetween(Integer value1, Integer value2) {
            addCriterion("sc_menuID between", value1, value2, "scMenuid");
            return (Criteria) this;
        }

        public Criteria andScMenuidNotBetween(Integer value1, Integer value2) {
            addCriterion("sc_menuID not between", value1, value2, "scMenuid");
            return (Criteria) this;
        }

        public Criteria andScOrderIsNull() {
            addCriterion("sc_order is null");
            return (Criteria) this;
        }

        public Criteria andScOrderIsNotNull() {
            addCriterion("sc_order is not null");
            return (Criteria) this;
        }

        public Criteria andScOrderEqualTo(Integer value) {
            addCriterion("sc_order =", value, "scOrder");
            return (Criteria) this;
        }

        public Criteria andScOrderNotEqualTo(Integer value) {
            addCriterion("sc_order <>", value, "scOrder");
            return (Criteria) this;
        }

        public Criteria andScOrderGreaterThan(Integer value) {
            addCriterion("sc_order >", value, "scOrder");
            return (Criteria) this;
        }

        public Criteria andScOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("sc_order >=", value, "scOrder");
            return (Criteria) this;
        }

        public Criteria andScOrderLessThan(Integer value) {
            addCriterion("sc_order <", value, "scOrder");
            return (Criteria) this;
        }

        public Criteria andScOrderLessThanOrEqualTo(Integer value) {
            addCriterion("sc_order <=", value, "scOrder");
            return (Criteria) this;
        }

        public Criteria andScOrderIn(List<Integer> values) {
            addCriterion("sc_order in", values, "scOrder");
            return (Criteria) this;
        }

        public Criteria andScOrderNotIn(List<Integer> values) {
            addCriterion("sc_order not in", values, "scOrder");
            return (Criteria) this;
        }

        public Criteria andScOrderBetween(Integer value1, Integer value2) {
            addCriterion("sc_order between", value1, value2, "scOrder");
            return (Criteria) this;
        }

        public Criteria andScOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("sc_order not between", value1, value2, "scOrder");
            return (Criteria) this;
        }

        public Criteria andScDesIsNull() {
            addCriterion("sc_des is null");
            return (Criteria) this;
        }

        public Criteria andScDesIsNotNull() {
            addCriterion("sc_des is not null");
            return (Criteria) this;
        }

        public Criteria andScDesEqualTo(String value) {
            addCriterion("sc_des =", value, "scDes");
            return (Criteria) this;
        }

        public Criteria andScDesNotEqualTo(String value) {
            addCriterion("sc_des <>", value, "scDes");
            return (Criteria) this;
        }

        public Criteria andScDesGreaterThan(String value) {
            addCriterion("sc_des >", value, "scDes");
            return (Criteria) this;
        }

        public Criteria andScDesGreaterThanOrEqualTo(String value) {
            addCriterion("sc_des >=", value, "scDes");
            return (Criteria) this;
        }

        public Criteria andScDesLessThan(String value) {
            addCriterion("sc_des <", value, "scDes");
            return (Criteria) this;
        }

        public Criteria andScDesLessThanOrEqualTo(String value) {
            addCriterion("sc_des <=", value, "scDes");
            return (Criteria) this;
        }

        public Criteria andScDesLike(String value) {
            addCriterion("sc_des like", value, "scDes");
            return (Criteria) this;
        }

        public Criteria andScDesNotLike(String value) {
            addCriterion("sc_des not like", value, "scDes");
            return (Criteria) this;
        }

        public Criteria andScDesIn(List<String> values) {
            addCriterion("sc_des in", values, "scDes");
            return (Criteria) this;
        }

        public Criteria andScDesNotIn(List<String> values) {
            addCriterion("sc_des not in", values, "scDes");
            return (Criteria) this;
        }

        public Criteria andScDesBetween(String value1, String value2) {
            addCriterion("sc_des between", value1, value2, "scDes");
            return (Criteria) this;
        }

        public Criteria andScDesNotBetween(String value1, String value2) {
            addCriterion("sc_des not between", value1, value2, "scDes");
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