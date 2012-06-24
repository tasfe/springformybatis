package com.hedgehog.domain;

import java.util.ArrayList;
import java.util.List;

public class web_newsclassExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public web_newsclassExample() {
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

        public Criteria andNewsclassidIsNull() {
            addCriterion("newsclassID is null");
            return (Criteria) this;
        }

        public Criteria andNewsclassidIsNotNull() {
            addCriterion("newsclassID is not null");
            return (Criteria) this;
        }

        public Criteria andNewsclassidEqualTo(Integer value) {
            addCriterion("newsclassID =", value, "newsclassid");
            return (Criteria) this;
        }

        public Criteria andNewsclassidNotEqualTo(Integer value) {
            addCriterion("newsclassID <>", value, "newsclassid");
            return (Criteria) this;
        }

        public Criteria andNewsclassidGreaterThan(Integer value) {
            addCriterion("newsclassID >", value, "newsclassid");
            return (Criteria) this;
        }

        public Criteria andNewsclassidGreaterThanOrEqualTo(Integer value) {
            addCriterion("newsclassID >=", value, "newsclassid");
            return (Criteria) this;
        }

        public Criteria andNewsclassidLessThan(Integer value) {
            addCriterion("newsclassID <", value, "newsclassid");
            return (Criteria) this;
        }

        public Criteria andNewsclassidLessThanOrEqualTo(Integer value) {
            addCriterion("newsclassID <=", value, "newsclassid");
            return (Criteria) this;
        }

        public Criteria andNewsclassidIn(List<Integer> values) {
            addCriterion("newsclassID in", values, "newsclassid");
            return (Criteria) this;
        }

        public Criteria andNewsclassidNotIn(List<Integer> values) {
            addCriterion("newsclassID not in", values, "newsclassid");
            return (Criteria) this;
        }

        public Criteria andNewsclassidBetween(Integer value1, Integer value2) {
            addCriterion("newsclassID between", value1, value2, "newsclassid");
            return (Criteria) this;
        }

        public Criteria andNewsclassidNotBetween(Integer value1, Integer value2) {
            addCriterion("newsclassID not between", value1, value2, "newsclassid");
            return (Criteria) this;
        }

        public Criteria andNcParentidIsNull() {
            addCriterion("nc_parentID is null");
            return (Criteria) this;
        }

        public Criteria andNcParentidIsNotNull() {
            addCriterion("nc_parentID is not null");
            return (Criteria) this;
        }

        public Criteria andNcParentidEqualTo(Integer value) {
            addCriterion("nc_parentID =", value, "ncParentid");
            return (Criteria) this;
        }

        public Criteria andNcParentidNotEqualTo(Integer value) {
            addCriterion("nc_parentID <>", value, "ncParentid");
            return (Criteria) this;
        }

        public Criteria andNcParentidGreaterThan(Integer value) {
            addCriterion("nc_parentID >", value, "ncParentid");
            return (Criteria) this;
        }

        public Criteria andNcParentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("nc_parentID >=", value, "ncParentid");
            return (Criteria) this;
        }

        public Criteria andNcParentidLessThan(Integer value) {
            addCriterion("nc_parentID <", value, "ncParentid");
            return (Criteria) this;
        }

        public Criteria andNcParentidLessThanOrEqualTo(Integer value) {
            addCriterion("nc_parentID <=", value, "ncParentid");
            return (Criteria) this;
        }

        public Criteria andNcParentidIn(List<Integer> values) {
            addCriterion("nc_parentID in", values, "ncParentid");
            return (Criteria) this;
        }

        public Criteria andNcParentidNotIn(List<Integer> values) {
            addCriterion("nc_parentID not in", values, "ncParentid");
            return (Criteria) this;
        }

        public Criteria andNcParentidBetween(Integer value1, Integer value2) {
            addCriterion("nc_parentID between", value1, value2, "ncParentid");
            return (Criteria) this;
        }

        public Criteria andNcParentidNotBetween(Integer value1, Integer value2) {
            addCriterion("nc_parentID not between", value1, value2, "ncParentid");
            return (Criteria) this;
        }

        public Criteria andNcNameIsNull() {
            addCriterion("nc_name is null");
            return (Criteria) this;
        }

        public Criteria andNcNameIsNotNull() {
            addCriterion("nc_name is not null");
            return (Criteria) this;
        }

        public Criteria andNcNameEqualTo(String value) {
            addCriterion("nc_name =", value, "ncName");
            return (Criteria) this;
        }

        public Criteria andNcNameNotEqualTo(String value) {
            addCriterion("nc_name <>", value, "ncName");
            return (Criteria) this;
        }

        public Criteria andNcNameGreaterThan(String value) {
            addCriterion("nc_name >", value, "ncName");
            return (Criteria) this;
        }

        public Criteria andNcNameGreaterThanOrEqualTo(String value) {
            addCriterion("nc_name >=", value, "ncName");
            return (Criteria) this;
        }

        public Criteria andNcNameLessThan(String value) {
            addCriterion("nc_name <", value, "ncName");
            return (Criteria) this;
        }

        public Criteria andNcNameLessThanOrEqualTo(String value) {
            addCriterion("nc_name <=", value, "ncName");
            return (Criteria) this;
        }

        public Criteria andNcNameLike(String value) {
            addCriterion("nc_name like", value, "ncName");
            return (Criteria) this;
        }

        public Criteria andNcNameNotLike(String value) {
            addCriterion("nc_name not like", value, "ncName");
            return (Criteria) this;
        }

        public Criteria andNcNameIn(List<String> values) {
            addCriterion("nc_name in", values, "ncName");
            return (Criteria) this;
        }

        public Criteria andNcNameNotIn(List<String> values) {
            addCriterion("nc_name not in", values, "ncName");
            return (Criteria) this;
        }

        public Criteria andNcNameBetween(String value1, String value2) {
            addCriterion("nc_name between", value1, value2, "ncName");
            return (Criteria) this;
        }

        public Criteria andNcNameNotBetween(String value1, String value2) {
            addCriterion("nc_name not between", value1, value2, "ncName");
            return (Criteria) this;
        }

        public Criteria andNcCodeIsNull() {
            addCriterion("nc_code is null");
            return (Criteria) this;
        }

        public Criteria andNcCodeIsNotNull() {
            addCriterion("nc_code is not null");
            return (Criteria) this;
        }

        public Criteria andNcCodeEqualTo(String value) {
            addCriterion("nc_code =", value, "ncCode");
            return (Criteria) this;
        }

        public Criteria andNcCodeNotEqualTo(String value) {
            addCriterion("nc_code <>", value, "ncCode");
            return (Criteria) this;
        }

        public Criteria andNcCodeGreaterThan(String value) {
            addCriterion("nc_code >", value, "ncCode");
            return (Criteria) this;
        }

        public Criteria andNcCodeGreaterThanOrEqualTo(String value) {
            addCriterion("nc_code >=", value, "ncCode");
            return (Criteria) this;
        }

        public Criteria andNcCodeLessThan(String value) {
            addCriterion("nc_code <", value, "ncCode");
            return (Criteria) this;
        }

        public Criteria andNcCodeLessThanOrEqualTo(String value) {
            addCriterion("nc_code <=", value, "ncCode");
            return (Criteria) this;
        }

        public Criteria andNcCodeLike(String value) {
            addCriterion("nc_code like", value, "ncCode");
            return (Criteria) this;
        }

        public Criteria andNcCodeNotLike(String value) {
            addCriterion("nc_code not like", value, "ncCode");
            return (Criteria) this;
        }

        public Criteria andNcCodeIn(List<String> values) {
            addCriterion("nc_code in", values, "ncCode");
            return (Criteria) this;
        }

        public Criteria andNcCodeNotIn(List<String> values) {
            addCriterion("nc_code not in", values, "ncCode");
            return (Criteria) this;
        }

        public Criteria andNcCodeBetween(String value1, String value2) {
            addCriterion("nc_code between", value1, value2, "ncCode");
            return (Criteria) this;
        }

        public Criteria andNcCodeNotBetween(String value1, String value2) {
            addCriterion("nc_code not between", value1, value2, "ncCode");
            return (Criteria) this;
        }

        public Criteria andNcMenuidIsNull() {
            addCriterion("nc_menuid is null");
            return (Criteria) this;
        }

        public Criteria andNcMenuidIsNotNull() {
            addCriterion("nc_menuid is not null");
            return (Criteria) this;
        }

        public Criteria andNcMenuidEqualTo(Integer value) {
            addCriterion("nc_menuid =", value, "ncMenuid");
            return (Criteria) this;
        }

        public Criteria andNcMenuidNotEqualTo(Integer value) {
            addCriterion("nc_menuid <>", value, "ncMenuid");
            return (Criteria) this;
        }

        public Criteria andNcMenuidGreaterThan(Integer value) {
            addCriterion("nc_menuid >", value, "ncMenuid");
            return (Criteria) this;
        }

        public Criteria andNcMenuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("nc_menuid >=", value, "ncMenuid");
            return (Criteria) this;
        }

        public Criteria andNcMenuidLessThan(Integer value) {
            addCriterion("nc_menuid <", value, "ncMenuid");
            return (Criteria) this;
        }

        public Criteria andNcMenuidLessThanOrEqualTo(Integer value) {
            addCriterion("nc_menuid <=", value, "ncMenuid");
            return (Criteria) this;
        }

        public Criteria andNcMenuidIn(List<Integer> values) {
            addCriterion("nc_menuid in", values, "ncMenuid");
            return (Criteria) this;
        }

        public Criteria andNcMenuidNotIn(List<Integer> values) {
            addCriterion("nc_menuid not in", values, "ncMenuid");
            return (Criteria) this;
        }

        public Criteria andNcMenuidBetween(Integer value1, Integer value2) {
            addCriterion("nc_menuid between", value1, value2, "ncMenuid");
            return (Criteria) this;
        }

        public Criteria andNcMenuidNotBetween(Integer value1, Integer value2) {
            addCriterion("nc_menuid not between", value1, value2, "ncMenuid");
            return (Criteria) this;
        }

        public Criteria andNcOrderIsNull() {
            addCriterion("nc_order is null");
            return (Criteria) this;
        }

        public Criteria andNcOrderIsNotNull() {
            addCriterion("nc_order is not null");
            return (Criteria) this;
        }

        public Criteria andNcOrderEqualTo(Integer value) {
            addCriterion("nc_order =", value, "ncOrder");
            return (Criteria) this;
        }

        public Criteria andNcOrderNotEqualTo(Integer value) {
            addCriterion("nc_order <>", value, "ncOrder");
            return (Criteria) this;
        }

        public Criteria andNcOrderGreaterThan(Integer value) {
            addCriterion("nc_order >", value, "ncOrder");
            return (Criteria) this;
        }

        public Criteria andNcOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("nc_order >=", value, "ncOrder");
            return (Criteria) this;
        }

        public Criteria andNcOrderLessThan(Integer value) {
            addCriterion("nc_order <", value, "ncOrder");
            return (Criteria) this;
        }

        public Criteria andNcOrderLessThanOrEqualTo(Integer value) {
            addCriterion("nc_order <=", value, "ncOrder");
            return (Criteria) this;
        }

        public Criteria andNcOrderIn(List<Integer> values) {
            addCriterion("nc_order in", values, "ncOrder");
            return (Criteria) this;
        }

        public Criteria andNcOrderNotIn(List<Integer> values) {
            addCriterion("nc_order not in", values, "ncOrder");
            return (Criteria) this;
        }

        public Criteria andNcOrderBetween(Integer value1, Integer value2) {
            addCriterion("nc_order between", value1, value2, "ncOrder");
            return (Criteria) this;
        }

        public Criteria andNcOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("nc_order not between", value1, value2, "ncOrder");
            return (Criteria) this;
        }

        public Criteria andNcDesIsNull() {
            addCriterion("nc_des is null");
            return (Criteria) this;
        }

        public Criteria andNcDesIsNotNull() {
            addCriterion("nc_des is not null");
            return (Criteria) this;
        }

        public Criteria andNcDesEqualTo(String value) {
            addCriterion("nc_des =", value, "ncDes");
            return (Criteria) this;
        }

        public Criteria andNcDesNotEqualTo(String value) {
            addCriterion("nc_des <>", value, "ncDes");
            return (Criteria) this;
        }

        public Criteria andNcDesGreaterThan(String value) {
            addCriterion("nc_des >", value, "ncDes");
            return (Criteria) this;
        }

        public Criteria andNcDesGreaterThanOrEqualTo(String value) {
            addCriterion("nc_des >=", value, "ncDes");
            return (Criteria) this;
        }

        public Criteria andNcDesLessThan(String value) {
            addCriterion("nc_des <", value, "ncDes");
            return (Criteria) this;
        }

        public Criteria andNcDesLessThanOrEqualTo(String value) {
            addCriterion("nc_des <=", value, "ncDes");
            return (Criteria) this;
        }

        public Criteria andNcDesLike(String value) {
            addCriterion("nc_des like", value, "ncDes");
            return (Criteria) this;
        }

        public Criteria andNcDesNotLike(String value) {
            addCriterion("nc_des not like", value, "ncDes");
            return (Criteria) this;
        }

        public Criteria andNcDesIn(List<String> values) {
            addCriterion("nc_des in", values, "ncDes");
            return (Criteria) this;
        }

        public Criteria andNcDesNotIn(List<String> values) {
            addCriterion("nc_des not in", values, "ncDes");
            return (Criteria) this;
        }

        public Criteria andNcDesBetween(String value1, String value2) {
            addCriterion("nc_des between", value1, value2, "ncDes");
            return (Criteria) this;
        }

        public Criteria andNcDesNotBetween(String value1, String value2) {
            addCriterion("nc_des not between", value1, value2, "ncDes");
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