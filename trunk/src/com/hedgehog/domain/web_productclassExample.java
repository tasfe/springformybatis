package com.hedgehog.domain;

import java.util.ArrayList;
import java.util.List;

public class web_productclassExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public web_productclassExample() {
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

        public Criteria andPcidIsNull() {
            addCriterion("pcID is null");
            return (Criteria) this;
        }

        public Criteria andPcidIsNotNull() {
            addCriterion("pcID is not null");
            return (Criteria) this;
        }

        public Criteria andPcidEqualTo(Integer value) {
            addCriterion("pcID =", value, "pcid");
            return (Criteria) this;
        }

        public Criteria andPcidNotEqualTo(Integer value) {
            addCriterion("pcID <>", value, "pcid");
            return (Criteria) this;
        }

        public Criteria andPcidGreaterThan(Integer value) {
            addCriterion("pcID >", value, "pcid");
            return (Criteria) this;
        }

        public Criteria andPcidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pcID >=", value, "pcid");
            return (Criteria) this;
        }

        public Criteria andPcidLessThan(Integer value) {
            addCriterion("pcID <", value, "pcid");
            return (Criteria) this;
        }

        public Criteria andPcidLessThanOrEqualTo(Integer value) {
            addCriterion("pcID <=", value, "pcid");
            return (Criteria) this;
        }

        public Criteria andPcidIn(List<Integer> values) {
            addCriterion("pcID in", values, "pcid");
            return (Criteria) this;
        }

        public Criteria andPcidNotIn(List<Integer> values) {
            addCriterion("pcID not in", values, "pcid");
            return (Criteria) this;
        }

        public Criteria andPcidBetween(Integer value1, Integer value2) {
            addCriterion("pcID between", value1, value2, "pcid");
            return (Criteria) this;
        }

        public Criteria andPcidNotBetween(Integer value1, Integer value2) {
            addCriterion("pcID not between", value1, value2, "pcid");
            return (Criteria) this;
        }

        public Criteria andPcParentidIsNull() {
            addCriterion("pc_parentid is null");
            return (Criteria) this;
        }

        public Criteria andPcParentidIsNotNull() {
            addCriterion("pc_parentid is not null");
            return (Criteria) this;
        }

        public Criteria andPcParentidEqualTo(Integer value) {
            addCriterion("pc_parentid =", value, "pcParentid");
            return (Criteria) this;
        }

        public Criteria andPcParentidNotEqualTo(Integer value) {
            addCriterion("pc_parentid <>", value, "pcParentid");
            return (Criteria) this;
        }

        public Criteria andPcParentidGreaterThan(Integer value) {
            addCriterion("pc_parentid >", value, "pcParentid");
            return (Criteria) this;
        }

        public Criteria andPcParentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pc_parentid >=", value, "pcParentid");
            return (Criteria) this;
        }

        public Criteria andPcParentidLessThan(Integer value) {
            addCriterion("pc_parentid <", value, "pcParentid");
            return (Criteria) this;
        }

        public Criteria andPcParentidLessThanOrEqualTo(Integer value) {
            addCriterion("pc_parentid <=", value, "pcParentid");
            return (Criteria) this;
        }

        public Criteria andPcParentidIn(List<Integer> values) {
            addCriterion("pc_parentid in", values, "pcParentid");
            return (Criteria) this;
        }

        public Criteria andPcParentidNotIn(List<Integer> values) {
            addCriterion("pc_parentid not in", values, "pcParentid");
            return (Criteria) this;
        }

        public Criteria andPcParentidBetween(Integer value1, Integer value2) {
            addCriterion("pc_parentid between", value1, value2, "pcParentid");
            return (Criteria) this;
        }

        public Criteria andPcParentidNotBetween(Integer value1, Integer value2) {
            addCriterion("pc_parentid not between", value1, value2, "pcParentid");
            return (Criteria) this;
        }

        public Criteria andPcNameIsNull() {
            addCriterion("pc_name is null");
            return (Criteria) this;
        }

        public Criteria andPcNameIsNotNull() {
            addCriterion("pc_name is not null");
            return (Criteria) this;
        }

        public Criteria andPcNameEqualTo(String value) {
            addCriterion("pc_name =", value, "pcName");
            return (Criteria) this;
        }

        public Criteria andPcNameNotEqualTo(String value) {
            addCriterion("pc_name <>", value, "pcName");
            return (Criteria) this;
        }

        public Criteria andPcNameGreaterThan(String value) {
            addCriterion("pc_name >", value, "pcName");
            return (Criteria) this;
        }

        public Criteria andPcNameGreaterThanOrEqualTo(String value) {
            addCriterion("pc_name >=", value, "pcName");
            return (Criteria) this;
        }

        public Criteria andPcNameLessThan(String value) {
            addCriterion("pc_name <", value, "pcName");
            return (Criteria) this;
        }

        public Criteria andPcNameLessThanOrEqualTo(String value) {
            addCriterion("pc_name <=", value, "pcName");
            return (Criteria) this;
        }

        public Criteria andPcNameLike(String value) {
            addCriterion("pc_name like", value, "pcName");
            return (Criteria) this;
        }

        public Criteria andPcNameNotLike(String value) {
            addCriterion("pc_name not like", value, "pcName");
            return (Criteria) this;
        }

        public Criteria andPcNameIn(List<String> values) {
            addCriterion("pc_name in", values, "pcName");
            return (Criteria) this;
        }

        public Criteria andPcNameNotIn(List<String> values) {
            addCriterion("pc_name not in", values, "pcName");
            return (Criteria) this;
        }

        public Criteria andPcNameBetween(String value1, String value2) {
            addCriterion("pc_name between", value1, value2, "pcName");
            return (Criteria) this;
        }

        public Criteria andPcNameNotBetween(String value1, String value2) {
            addCriterion("pc_name not between", value1, value2, "pcName");
            return (Criteria) this;
        }

        public Criteria andPcCodeIsNull() {
            addCriterion("pc_code is null");
            return (Criteria) this;
        }

        public Criteria andPcCodeIsNotNull() {
            addCriterion("pc_code is not null");
            return (Criteria) this;
        }

        public Criteria andPcCodeEqualTo(String value) {
            addCriterion("pc_code =", value, "pcCode");
            return (Criteria) this;
        }

        public Criteria andPcCodeNotEqualTo(String value) {
            addCriterion("pc_code <>", value, "pcCode");
            return (Criteria) this;
        }

        public Criteria andPcCodeGreaterThan(String value) {
            addCriterion("pc_code >", value, "pcCode");
            return (Criteria) this;
        }

        public Criteria andPcCodeGreaterThanOrEqualTo(String value) {
            addCriterion("pc_code >=", value, "pcCode");
            return (Criteria) this;
        }

        public Criteria andPcCodeLessThan(String value) {
            addCriterion("pc_code <", value, "pcCode");
            return (Criteria) this;
        }

        public Criteria andPcCodeLessThanOrEqualTo(String value) {
            addCriterion("pc_code <=", value, "pcCode");
            return (Criteria) this;
        }

        public Criteria andPcCodeLike(String value) {
            addCriterion("pc_code like", value, "pcCode");
            return (Criteria) this;
        }

        public Criteria andPcCodeNotLike(String value) {
            addCriterion("pc_code not like", value, "pcCode");
            return (Criteria) this;
        }

        public Criteria andPcCodeIn(List<String> values) {
            addCriterion("pc_code in", values, "pcCode");
            return (Criteria) this;
        }

        public Criteria andPcCodeNotIn(List<String> values) {
            addCriterion("pc_code not in", values, "pcCode");
            return (Criteria) this;
        }

        public Criteria andPcCodeBetween(String value1, String value2) {
            addCriterion("pc_code between", value1, value2, "pcCode");
            return (Criteria) this;
        }

        public Criteria andPcCodeNotBetween(String value1, String value2) {
            addCriterion("pc_code not between", value1, value2, "pcCode");
            return (Criteria) this;
        }

        public Criteria andPcMenuidIsNull() {
            addCriterion("pc_menuid is null");
            return (Criteria) this;
        }

        public Criteria andPcMenuidIsNotNull() {
            addCriterion("pc_menuid is not null");
            return (Criteria) this;
        }

        public Criteria andPcMenuidEqualTo(Integer value) {
            addCriterion("pc_menuid =", value, "pcMenuid");
            return (Criteria) this;
        }

        public Criteria andPcMenuidNotEqualTo(Integer value) {
            addCriterion("pc_menuid <>", value, "pcMenuid");
            return (Criteria) this;
        }

        public Criteria andPcMenuidGreaterThan(Integer value) {
            addCriterion("pc_menuid >", value, "pcMenuid");
            return (Criteria) this;
        }

        public Criteria andPcMenuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pc_menuid >=", value, "pcMenuid");
            return (Criteria) this;
        }

        public Criteria andPcMenuidLessThan(Integer value) {
            addCriterion("pc_menuid <", value, "pcMenuid");
            return (Criteria) this;
        }

        public Criteria andPcMenuidLessThanOrEqualTo(Integer value) {
            addCriterion("pc_menuid <=", value, "pcMenuid");
            return (Criteria) this;
        }

        public Criteria andPcMenuidIn(List<Integer> values) {
            addCriterion("pc_menuid in", values, "pcMenuid");
            return (Criteria) this;
        }

        public Criteria andPcMenuidNotIn(List<Integer> values) {
            addCriterion("pc_menuid not in", values, "pcMenuid");
            return (Criteria) this;
        }

        public Criteria andPcMenuidBetween(Integer value1, Integer value2) {
            addCriterion("pc_menuid between", value1, value2, "pcMenuid");
            return (Criteria) this;
        }

        public Criteria andPcMenuidNotBetween(Integer value1, Integer value2) {
            addCriterion("pc_menuid not between", value1, value2, "pcMenuid");
            return (Criteria) this;
        }

        public Criteria andPcOrderIsNull() {
            addCriterion("pc_order is null");
            return (Criteria) this;
        }

        public Criteria andPcOrderIsNotNull() {
            addCriterion("pc_order is not null");
            return (Criteria) this;
        }

        public Criteria andPcOrderEqualTo(Integer value) {
            addCriterion("pc_order =", value, "pcOrder");
            return (Criteria) this;
        }

        public Criteria andPcOrderNotEqualTo(Integer value) {
            addCriterion("pc_order <>", value, "pcOrder");
            return (Criteria) this;
        }

        public Criteria andPcOrderGreaterThan(Integer value) {
            addCriterion("pc_order >", value, "pcOrder");
            return (Criteria) this;
        }

        public Criteria andPcOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("pc_order >=", value, "pcOrder");
            return (Criteria) this;
        }

        public Criteria andPcOrderLessThan(Integer value) {
            addCriterion("pc_order <", value, "pcOrder");
            return (Criteria) this;
        }

        public Criteria andPcOrderLessThanOrEqualTo(Integer value) {
            addCriterion("pc_order <=", value, "pcOrder");
            return (Criteria) this;
        }

        public Criteria andPcOrderIn(List<Integer> values) {
            addCriterion("pc_order in", values, "pcOrder");
            return (Criteria) this;
        }

        public Criteria andPcOrderNotIn(List<Integer> values) {
            addCriterion("pc_order not in", values, "pcOrder");
            return (Criteria) this;
        }

        public Criteria andPcOrderBetween(Integer value1, Integer value2) {
            addCriterion("pc_order between", value1, value2, "pcOrder");
            return (Criteria) this;
        }

        public Criteria andPcOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("pc_order not between", value1, value2, "pcOrder");
            return (Criteria) this;
        }

        public Criteria andPcDesIsNull() {
            addCriterion("pc_des is null");
            return (Criteria) this;
        }

        public Criteria andPcDesIsNotNull() {
            addCriterion("pc_des is not null");
            return (Criteria) this;
        }

        public Criteria andPcDesEqualTo(String value) {
            addCriterion("pc_des =", value, "pcDes");
            return (Criteria) this;
        }

        public Criteria andPcDesNotEqualTo(String value) {
            addCriterion("pc_des <>", value, "pcDes");
            return (Criteria) this;
        }

        public Criteria andPcDesGreaterThan(String value) {
            addCriterion("pc_des >", value, "pcDes");
            return (Criteria) this;
        }

        public Criteria andPcDesGreaterThanOrEqualTo(String value) {
            addCriterion("pc_des >=", value, "pcDes");
            return (Criteria) this;
        }

        public Criteria andPcDesLessThan(String value) {
            addCriterion("pc_des <", value, "pcDes");
            return (Criteria) this;
        }

        public Criteria andPcDesLessThanOrEqualTo(String value) {
            addCriterion("pc_des <=", value, "pcDes");
            return (Criteria) this;
        }

        public Criteria andPcDesLike(String value) {
            addCriterion("pc_des like", value, "pcDes");
            return (Criteria) this;
        }

        public Criteria andPcDesNotLike(String value) {
            addCriterion("pc_des not like", value, "pcDes");
            return (Criteria) this;
        }

        public Criteria andPcDesIn(List<String> values) {
            addCriterion("pc_des in", values, "pcDes");
            return (Criteria) this;
        }

        public Criteria andPcDesNotIn(List<String> values) {
            addCriterion("pc_des not in", values, "pcDes");
            return (Criteria) this;
        }

        public Criteria andPcDesBetween(String value1, String value2) {
            addCriterion("pc_des between", value1, value2, "pcDes");
            return (Criteria) this;
        }

        public Criteria andPcDesNotBetween(String value1, String value2) {
            addCriterion("pc_des not between", value1, value2, "pcDes");
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