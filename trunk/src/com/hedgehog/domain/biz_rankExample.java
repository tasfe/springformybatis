package com.hedgehog.domain;

import java.util.ArrayList;
import java.util.List;

public class biz_rankExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public biz_rankExample() {
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

        public Criteria andRankidIsNull() {
            addCriterion("rankID is null");
            return (Criteria) this;
        }

        public Criteria andRankidIsNotNull() {
            addCriterion("rankID is not null");
            return (Criteria) this;
        }

        public Criteria andRankidEqualTo(Integer value) {
            addCriterion("rankID =", value, "rankid");
            return (Criteria) this;
        }

        public Criteria andRankidNotEqualTo(Integer value) {
            addCriterion("rankID <>", value, "rankid");
            return (Criteria) this;
        }

        public Criteria andRankidGreaterThan(Integer value) {
            addCriterion("rankID >", value, "rankid");
            return (Criteria) this;
        }

        public Criteria andRankidGreaterThanOrEqualTo(Integer value) {
            addCriterion("rankID >=", value, "rankid");
            return (Criteria) this;
        }

        public Criteria andRankidLessThan(Integer value) {
            addCriterion("rankID <", value, "rankid");
            return (Criteria) this;
        }

        public Criteria andRankidLessThanOrEqualTo(Integer value) {
            addCriterion("rankID <=", value, "rankid");
            return (Criteria) this;
        }

        public Criteria andRankidIn(List<Integer> values) {
            addCriterion("rankID in", values, "rankid");
            return (Criteria) this;
        }

        public Criteria andRankidNotIn(List<Integer> values) {
            addCriterion("rankID not in", values, "rankid");
            return (Criteria) this;
        }

        public Criteria andRankidBetween(Integer value1, Integer value2) {
            addCriterion("rankID between", value1, value2, "rankid");
            return (Criteria) this;
        }

        public Criteria andRankidNotBetween(Integer value1, Integer value2) {
            addCriterion("rankID not between", value1, value2, "rankid");
            return (Criteria) this;
        }

        public Criteria andRankParenidIsNull() {
            addCriterion("rank_parenid is null");
            return (Criteria) this;
        }

        public Criteria andRankParenidIsNotNull() {
            addCriterion("rank_parenid is not null");
            return (Criteria) this;
        }

        public Criteria andRankParenidEqualTo(Integer value) {
            addCriterion("rank_parenid =", value, "rankParenid");
            return (Criteria) this;
        }

        public Criteria andRankParenidNotEqualTo(Integer value) {
            addCriterion("rank_parenid <>", value, "rankParenid");
            return (Criteria) this;
        }

        public Criteria andRankParenidGreaterThan(Integer value) {
            addCriterion("rank_parenid >", value, "rankParenid");
            return (Criteria) this;
        }

        public Criteria andRankParenidGreaterThanOrEqualTo(Integer value) {
            addCriterion("rank_parenid >=", value, "rankParenid");
            return (Criteria) this;
        }

        public Criteria andRankParenidLessThan(Integer value) {
            addCriterion("rank_parenid <", value, "rankParenid");
            return (Criteria) this;
        }

        public Criteria andRankParenidLessThanOrEqualTo(Integer value) {
            addCriterion("rank_parenid <=", value, "rankParenid");
            return (Criteria) this;
        }

        public Criteria andRankParenidIn(List<Integer> values) {
            addCriterion("rank_parenid in", values, "rankParenid");
            return (Criteria) this;
        }

        public Criteria andRankParenidNotIn(List<Integer> values) {
            addCriterion("rank_parenid not in", values, "rankParenid");
            return (Criteria) this;
        }

        public Criteria andRankParenidBetween(Integer value1, Integer value2) {
            addCriterion("rank_parenid between", value1, value2, "rankParenid");
            return (Criteria) this;
        }

        public Criteria andRankParenidNotBetween(Integer value1, Integer value2) {
            addCriterion("rank_parenid not between", value1, value2, "rankParenid");
            return (Criteria) this;
        }

        public Criteria andRankNameIsNull() {
            addCriterion("rank_name is null");
            return (Criteria) this;
        }

        public Criteria andRankNameIsNotNull() {
            addCriterion("rank_name is not null");
            return (Criteria) this;
        }

        public Criteria andRankNameEqualTo(String value) {
            addCriterion("rank_name =", value, "rankName");
            return (Criteria) this;
        }

        public Criteria andRankNameNotEqualTo(String value) {
            addCriterion("rank_name <>", value, "rankName");
            return (Criteria) this;
        }

        public Criteria andRankNameGreaterThan(String value) {
            addCriterion("rank_name >", value, "rankName");
            return (Criteria) this;
        }

        public Criteria andRankNameGreaterThanOrEqualTo(String value) {
            addCriterion("rank_name >=", value, "rankName");
            return (Criteria) this;
        }

        public Criteria andRankNameLessThan(String value) {
            addCriterion("rank_name <", value, "rankName");
            return (Criteria) this;
        }

        public Criteria andRankNameLessThanOrEqualTo(String value) {
            addCriterion("rank_name <=", value, "rankName");
            return (Criteria) this;
        }

        public Criteria andRankNameLike(String value) {
            addCriterion("rank_name like", value, "rankName");
            return (Criteria) this;
        }

        public Criteria andRankNameNotLike(String value) {
            addCriterion("rank_name not like", value, "rankName");
            return (Criteria) this;
        }

        public Criteria andRankNameIn(List<String> values) {
            addCriterion("rank_name in", values, "rankName");
            return (Criteria) this;
        }

        public Criteria andRankNameNotIn(List<String> values) {
            addCriterion("rank_name not in", values, "rankName");
            return (Criteria) this;
        }

        public Criteria andRankNameBetween(String value1, String value2) {
            addCriterion("rank_name between", value1, value2, "rankName");
            return (Criteria) this;
        }

        public Criteria andRankNameNotBetween(String value1, String value2) {
            addCriterion("rank_name not between", value1, value2, "rankName");
            return (Criteria) this;
        }

        public Criteria andRankCodeIsNull() {
            addCriterion("rank_code is null");
            return (Criteria) this;
        }

        public Criteria andRankCodeIsNotNull() {
            addCriterion("rank_code is not null");
            return (Criteria) this;
        }

        public Criteria andRankCodeEqualTo(String value) {
            addCriterion("rank_code =", value, "rankCode");
            return (Criteria) this;
        }

        public Criteria andRankCodeNotEqualTo(String value) {
            addCriterion("rank_code <>", value, "rankCode");
            return (Criteria) this;
        }

        public Criteria andRankCodeGreaterThan(String value) {
            addCriterion("rank_code >", value, "rankCode");
            return (Criteria) this;
        }

        public Criteria andRankCodeGreaterThanOrEqualTo(String value) {
            addCriterion("rank_code >=", value, "rankCode");
            return (Criteria) this;
        }

        public Criteria andRankCodeLessThan(String value) {
            addCriterion("rank_code <", value, "rankCode");
            return (Criteria) this;
        }

        public Criteria andRankCodeLessThanOrEqualTo(String value) {
            addCriterion("rank_code <=", value, "rankCode");
            return (Criteria) this;
        }

        public Criteria andRankCodeLike(String value) {
            addCriterion("rank_code like", value, "rankCode");
            return (Criteria) this;
        }

        public Criteria andRankCodeNotLike(String value) {
            addCriterion("rank_code not like", value, "rankCode");
            return (Criteria) this;
        }

        public Criteria andRankCodeIn(List<String> values) {
            addCriterion("rank_code in", values, "rankCode");
            return (Criteria) this;
        }

        public Criteria andRankCodeNotIn(List<String> values) {
            addCriterion("rank_code not in", values, "rankCode");
            return (Criteria) this;
        }

        public Criteria andRankCodeBetween(String value1, String value2) {
            addCriterion("rank_code between", value1, value2, "rankCode");
            return (Criteria) this;
        }

        public Criteria andRankCodeNotBetween(String value1, String value2) {
            addCriterion("rank_code not between", value1, value2, "rankCode");
            return (Criteria) this;
        }

        public Criteria andRankOrderIsNull() {
            addCriterion("rank_order is null");
            return (Criteria) this;
        }

        public Criteria andRankOrderIsNotNull() {
            addCriterion("rank_order is not null");
            return (Criteria) this;
        }

        public Criteria andRankOrderEqualTo(Integer value) {
            addCriterion("rank_order =", value, "rankOrder");
            return (Criteria) this;
        }

        public Criteria andRankOrderNotEqualTo(Integer value) {
            addCriterion("rank_order <>", value, "rankOrder");
            return (Criteria) this;
        }

        public Criteria andRankOrderGreaterThan(Integer value) {
            addCriterion("rank_order >", value, "rankOrder");
            return (Criteria) this;
        }

        public Criteria andRankOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("rank_order >=", value, "rankOrder");
            return (Criteria) this;
        }

        public Criteria andRankOrderLessThan(Integer value) {
            addCriterion("rank_order <", value, "rankOrder");
            return (Criteria) this;
        }

        public Criteria andRankOrderLessThanOrEqualTo(Integer value) {
            addCriterion("rank_order <=", value, "rankOrder");
            return (Criteria) this;
        }

        public Criteria andRankOrderIn(List<Integer> values) {
            addCriterion("rank_order in", values, "rankOrder");
            return (Criteria) this;
        }

        public Criteria andRankOrderNotIn(List<Integer> values) {
            addCriterion("rank_order not in", values, "rankOrder");
            return (Criteria) this;
        }

        public Criteria andRankOrderBetween(Integer value1, Integer value2) {
            addCriterion("rank_order between", value1, value2, "rankOrder");
            return (Criteria) this;
        }

        public Criteria andRankOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("rank_order not between", value1, value2, "rankOrder");
            return (Criteria) this;
        }

        public Criteria andRankDesIsNull() {
            addCriterion("rank_des is null");
            return (Criteria) this;
        }

        public Criteria andRankDesIsNotNull() {
            addCriterion("rank_des is not null");
            return (Criteria) this;
        }

        public Criteria andRankDesEqualTo(String value) {
            addCriterion("rank_des =", value, "rankDes");
            return (Criteria) this;
        }

        public Criteria andRankDesNotEqualTo(String value) {
            addCriterion("rank_des <>", value, "rankDes");
            return (Criteria) this;
        }

        public Criteria andRankDesGreaterThan(String value) {
            addCriterion("rank_des >", value, "rankDes");
            return (Criteria) this;
        }

        public Criteria andRankDesGreaterThanOrEqualTo(String value) {
            addCriterion("rank_des >=", value, "rankDes");
            return (Criteria) this;
        }

        public Criteria andRankDesLessThan(String value) {
            addCriterion("rank_des <", value, "rankDes");
            return (Criteria) this;
        }

        public Criteria andRankDesLessThanOrEqualTo(String value) {
            addCriterion("rank_des <=", value, "rankDes");
            return (Criteria) this;
        }

        public Criteria andRankDesLike(String value) {
            addCriterion("rank_des like", value, "rankDes");
            return (Criteria) this;
        }

        public Criteria andRankDesNotLike(String value) {
            addCriterion("rank_des not like", value, "rankDes");
            return (Criteria) this;
        }

        public Criteria andRankDesIn(List<String> values) {
            addCriterion("rank_des in", values, "rankDes");
            return (Criteria) this;
        }

        public Criteria andRankDesNotIn(List<String> values) {
            addCriterion("rank_des not in", values, "rankDes");
            return (Criteria) this;
        }

        public Criteria andRankDesBetween(String value1, String value2) {
            addCriterion("rank_des between", value1, value2, "rankDes");
            return (Criteria) this;
        }

        public Criteria andRankDesNotBetween(String value1, String value2) {
            addCriterion("rank_des not between", value1, value2, "rankDes");
            return (Criteria) this;
        }

        public Criteria andRankHonorIsNull() {
            addCriterion("rank_honor is null");
            return (Criteria) this;
        }

        public Criteria andRankHonorIsNotNull() {
            addCriterion("rank_honor is not null");
            return (Criteria) this;
        }

        public Criteria andRankHonorEqualTo(String value) {
            addCriterion("rank_honor =", value, "rankHonor");
            return (Criteria) this;
        }

        public Criteria andRankHonorNotEqualTo(String value) {
            addCriterion("rank_honor <>", value, "rankHonor");
            return (Criteria) this;
        }

        public Criteria andRankHonorGreaterThan(String value) {
            addCriterion("rank_honor >", value, "rankHonor");
            return (Criteria) this;
        }

        public Criteria andRankHonorGreaterThanOrEqualTo(String value) {
            addCriterion("rank_honor >=", value, "rankHonor");
            return (Criteria) this;
        }

        public Criteria andRankHonorLessThan(String value) {
            addCriterion("rank_honor <", value, "rankHonor");
            return (Criteria) this;
        }

        public Criteria andRankHonorLessThanOrEqualTo(String value) {
            addCriterion("rank_honor <=", value, "rankHonor");
            return (Criteria) this;
        }

        public Criteria andRankHonorLike(String value) {
            addCriterion("rank_honor like", value, "rankHonor");
            return (Criteria) this;
        }

        public Criteria andRankHonorNotLike(String value) {
            addCriterion("rank_honor not like", value, "rankHonor");
            return (Criteria) this;
        }

        public Criteria andRankHonorIn(List<String> values) {
            addCriterion("rank_honor in", values, "rankHonor");
            return (Criteria) this;
        }

        public Criteria andRankHonorNotIn(List<String> values) {
            addCriterion("rank_honor not in", values, "rankHonor");
            return (Criteria) this;
        }

        public Criteria andRankHonorBetween(String value1, String value2) {
            addCriterion("rank_honor between", value1, value2, "rankHonor");
            return (Criteria) this;
        }

        public Criteria andRankHonorNotBetween(String value1, String value2) {
            addCriterion("rank_honor not between", value1, value2, "rankHonor");
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