package com.hedgehog.domain;

import java.util.ArrayList;
import java.util.List;

public class web_freewebExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public web_freewebExample() {
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

        public Criteria andFreewebidIsNull() {
            addCriterion("freewebID is null");
            return (Criteria) this;
        }

        public Criteria andFreewebidIsNotNull() {
            addCriterion("freewebID is not null");
            return (Criteria) this;
        }

        public Criteria andFreewebidEqualTo(Integer value) {
            addCriterion("freewebID =", value, "freewebid");
            return (Criteria) this;
        }

        public Criteria andFreewebidNotEqualTo(Integer value) {
            addCriterion("freewebID <>", value, "freewebid");
            return (Criteria) this;
        }

        public Criteria andFreewebidGreaterThan(Integer value) {
            addCriterion("freewebID >", value, "freewebid");
            return (Criteria) this;
        }

        public Criteria andFreewebidGreaterThanOrEqualTo(Integer value) {
            addCriterion("freewebID >=", value, "freewebid");
            return (Criteria) this;
        }

        public Criteria andFreewebidLessThan(Integer value) {
            addCriterion("freewebID <", value, "freewebid");
            return (Criteria) this;
        }

        public Criteria andFreewebidLessThanOrEqualTo(Integer value) {
            addCriterion("freewebID <=", value, "freewebid");
            return (Criteria) this;
        }

        public Criteria andFreewebidIn(List<Integer> values) {
            addCriterion("freewebID in", values, "freewebid");
            return (Criteria) this;
        }

        public Criteria andFreewebidNotIn(List<Integer> values) {
            addCriterion("freewebID not in", values, "freewebid");
            return (Criteria) this;
        }

        public Criteria andFreewebidBetween(Integer value1, Integer value2) {
            addCriterion("freewebID between", value1, value2, "freewebid");
            return (Criteria) this;
        }

        public Criteria andFreewebidNotBetween(Integer value1, Integer value2) {
            addCriterion("freewebID not between", value1, value2, "freewebid");
            return (Criteria) this;
        }

        public Criteria andFreewebMenuidIsNull() {
            addCriterion("freeweb_menuID is null");
            return (Criteria) this;
        }

        public Criteria andFreewebMenuidIsNotNull() {
            addCriterion("freeweb_menuID is not null");
            return (Criteria) this;
        }

        public Criteria andFreewebMenuidEqualTo(Integer value) {
            addCriterion("freeweb_menuID =", value, "freewebMenuid");
            return (Criteria) this;
        }

        public Criteria andFreewebMenuidNotEqualTo(Integer value) {
            addCriterion("freeweb_menuID <>", value, "freewebMenuid");
            return (Criteria) this;
        }

        public Criteria andFreewebMenuidGreaterThan(Integer value) {
            addCriterion("freeweb_menuID >", value, "freewebMenuid");
            return (Criteria) this;
        }

        public Criteria andFreewebMenuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("freeweb_menuID >=", value, "freewebMenuid");
            return (Criteria) this;
        }

        public Criteria andFreewebMenuidLessThan(Integer value) {
            addCriterion("freeweb_menuID <", value, "freewebMenuid");
            return (Criteria) this;
        }

        public Criteria andFreewebMenuidLessThanOrEqualTo(Integer value) {
            addCriterion("freeweb_menuID <=", value, "freewebMenuid");
            return (Criteria) this;
        }

        public Criteria andFreewebMenuidIn(List<Integer> values) {
            addCriterion("freeweb_menuID in", values, "freewebMenuid");
            return (Criteria) this;
        }

        public Criteria andFreewebMenuidNotIn(List<Integer> values) {
            addCriterion("freeweb_menuID not in", values, "freewebMenuid");
            return (Criteria) this;
        }

        public Criteria andFreewebMenuidBetween(Integer value1, Integer value2) {
            addCriterion("freeweb_menuID between", value1, value2, "freewebMenuid");
            return (Criteria) this;
        }

        public Criteria andFreewebMenuidNotBetween(Integer value1, Integer value2) {
            addCriterion("freeweb_menuID not between", value1, value2, "freewebMenuid");
            return (Criteria) this;
        }

        public Criteria andFreewebSummeryIsNull() {
            addCriterion("freeweb_summery is null");
            return (Criteria) this;
        }

        public Criteria andFreewebSummeryIsNotNull() {
            addCriterion("freeweb_summery is not null");
            return (Criteria) this;
        }

        public Criteria andFreewebSummeryEqualTo(String value) {
            addCriterion("freeweb_summery =", value, "freewebSummery");
            return (Criteria) this;
        }

        public Criteria andFreewebSummeryNotEqualTo(String value) {
            addCriterion("freeweb_summery <>", value, "freewebSummery");
            return (Criteria) this;
        }

        public Criteria andFreewebSummeryGreaterThan(String value) {
            addCriterion("freeweb_summery >", value, "freewebSummery");
            return (Criteria) this;
        }

        public Criteria andFreewebSummeryGreaterThanOrEqualTo(String value) {
            addCriterion("freeweb_summery >=", value, "freewebSummery");
            return (Criteria) this;
        }

        public Criteria andFreewebSummeryLessThan(String value) {
            addCriterion("freeweb_summery <", value, "freewebSummery");
            return (Criteria) this;
        }

        public Criteria andFreewebSummeryLessThanOrEqualTo(String value) {
            addCriterion("freeweb_summery <=", value, "freewebSummery");
            return (Criteria) this;
        }

        public Criteria andFreewebSummeryLike(String value) {
            addCriterion("freeweb_summery like", value, "freewebSummery");
            return (Criteria) this;
        }

        public Criteria andFreewebSummeryNotLike(String value) {
            addCriterion("freeweb_summery not like", value, "freewebSummery");
            return (Criteria) this;
        }

        public Criteria andFreewebSummeryIn(List<String> values) {
            addCriterion("freeweb_summery in", values, "freewebSummery");
            return (Criteria) this;
        }

        public Criteria andFreewebSummeryNotIn(List<String> values) {
            addCriterion("freeweb_summery not in", values, "freewebSummery");
            return (Criteria) this;
        }

        public Criteria andFreewebSummeryBetween(String value1, String value2) {
            addCriterion("freeweb_summery between", value1, value2, "freewebSummery");
            return (Criteria) this;
        }

        public Criteria andFreewebSummeryNotBetween(String value1, String value2) {
            addCriterion("freeweb_summery not between", value1, value2, "freewebSummery");
            return (Criteria) this;
        }

        public Criteria andFreewebKeywordsIsNull() {
            addCriterion("freeweb_keywords is null");
            return (Criteria) this;
        }

        public Criteria andFreewebKeywordsIsNotNull() {
            addCriterion("freeweb_keywords is not null");
            return (Criteria) this;
        }

        public Criteria andFreewebKeywordsEqualTo(String value) {
            addCriterion("freeweb_keywords =", value, "freewebKeywords");
            return (Criteria) this;
        }

        public Criteria andFreewebKeywordsNotEqualTo(String value) {
            addCriterion("freeweb_keywords <>", value, "freewebKeywords");
            return (Criteria) this;
        }

        public Criteria andFreewebKeywordsGreaterThan(String value) {
            addCriterion("freeweb_keywords >", value, "freewebKeywords");
            return (Criteria) this;
        }

        public Criteria andFreewebKeywordsGreaterThanOrEqualTo(String value) {
            addCriterion("freeweb_keywords >=", value, "freewebKeywords");
            return (Criteria) this;
        }

        public Criteria andFreewebKeywordsLessThan(String value) {
            addCriterion("freeweb_keywords <", value, "freewebKeywords");
            return (Criteria) this;
        }

        public Criteria andFreewebKeywordsLessThanOrEqualTo(String value) {
            addCriterion("freeweb_keywords <=", value, "freewebKeywords");
            return (Criteria) this;
        }

        public Criteria andFreewebKeywordsLike(String value) {
            addCriterion("freeweb_keywords like", value, "freewebKeywords");
            return (Criteria) this;
        }

        public Criteria andFreewebKeywordsNotLike(String value) {
            addCriterion("freeweb_keywords not like", value, "freewebKeywords");
            return (Criteria) this;
        }

        public Criteria andFreewebKeywordsIn(List<String> values) {
            addCriterion("freeweb_keywords in", values, "freewebKeywords");
            return (Criteria) this;
        }

        public Criteria andFreewebKeywordsNotIn(List<String> values) {
            addCriterion("freeweb_keywords not in", values, "freewebKeywords");
            return (Criteria) this;
        }

        public Criteria andFreewebKeywordsBetween(String value1, String value2) {
            addCriterion("freeweb_keywords between", value1, value2, "freewebKeywords");
            return (Criteria) this;
        }

        public Criteria andFreewebKeywordsNotBetween(String value1, String value2) {
            addCriterion("freeweb_keywords not between", value1, value2, "freewebKeywords");
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