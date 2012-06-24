package com.hedgehog.domain;

import java.util.ArrayList;
import java.util.List;

public class biz_menuoperExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public biz_menuoperExample() {
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

        public Criteria andMenuoperidIsNull() {
            addCriterion("menuoperID is null");
            return (Criteria) this;
        }

        public Criteria andMenuoperidIsNotNull() {
            addCriterion("menuoperID is not null");
            return (Criteria) this;
        }

        public Criteria andMenuoperidEqualTo(Integer value) {
            addCriterion("menuoperID =", value, "menuoperid");
            return (Criteria) this;
        }

        public Criteria andMenuoperidNotEqualTo(Integer value) {
            addCriterion("menuoperID <>", value, "menuoperid");
            return (Criteria) this;
        }

        public Criteria andMenuoperidGreaterThan(Integer value) {
            addCriterion("menuoperID >", value, "menuoperid");
            return (Criteria) this;
        }

        public Criteria andMenuoperidGreaterThanOrEqualTo(Integer value) {
            addCriterion("menuoperID >=", value, "menuoperid");
            return (Criteria) this;
        }

        public Criteria andMenuoperidLessThan(Integer value) {
            addCriterion("menuoperID <", value, "menuoperid");
            return (Criteria) this;
        }

        public Criteria andMenuoperidLessThanOrEqualTo(Integer value) {
            addCriterion("menuoperID <=", value, "menuoperid");
            return (Criteria) this;
        }

        public Criteria andMenuoperidIn(List<Integer> values) {
            addCriterion("menuoperID in", values, "menuoperid");
            return (Criteria) this;
        }

        public Criteria andMenuoperidNotIn(List<Integer> values) {
            addCriterion("menuoperID not in", values, "menuoperid");
            return (Criteria) this;
        }

        public Criteria andMenuoperidBetween(Integer value1, Integer value2) {
            addCriterion("menuoperID between", value1, value2, "menuoperid");
            return (Criteria) this;
        }

        public Criteria andMenuoperidNotBetween(Integer value1, Integer value2) {
            addCriterion("menuoperID not between", value1, value2, "menuoperid");
            return (Criteria) this;
        }

        public Criteria andMenuoperNameIsNull() {
            addCriterion("menuoper_name is null");
            return (Criteria) this;
        }

        public Criteria andMenuoperNameIsNotNull() {
            addCriterion("menuoper_name is not null");
            return (Criteria) this;
        }

        public Criteria andMenuoperNameEqualTo(String value) {
            addCriterion("menuoper_name =", value, "menuoperName");
            return (Criteria) this;
        }

        public Criteria andMenuoperNameNotEqualTo(String value) {
            addCriterion("menuoper_name <>", value, "menuoperName");
            return (Criteria) this;
        }

        public Criteria andMenuoperNameGreaterThan(String value) {
            addCriterion("menuoper_name >", value, "menuoperName");
            return (Criteria) this;
        }

        public Criteria andMenuoperNameGreaterThanOrEqualTo(String value) {
            addCriterion("menuoper_name >=", value, "menuoperName");
            return (Criteria) this;
        }

        public Criteria andMenuoperNameLessThan(String value) {
            addCriterion("menuoper_name <", value, "menuoperName");
            return (Criteria) this;
        }

        public Criteria andMenuoperNameLessThanOrEqualTo(String value) {
            addCriterion("menuoper_name <=", value, "menuoperName");
            return (Criteria) this;
        }

        public Criteria andMenuoperNameLike(String value) {
            addCriterion("menuoper_name like", value, "menuoperName");
            return (Criteria) this;
        }

        public Criteria andMenuoperNameNotLike(String value) {
            addCriterion("menuoper_name not like", value, "menuoperName");
            return (Criteria) this;
        }

        public Criteria andMenuoperNameIn(List<String> values) {
            addCriterion("menuoper_name in", values, "menuoperName");
            return (Criteria) this;
        }

        public Criteria andMenuoperNameNotIn(List<String> values) {
            addCriterion("menuoper_name not in", values, "menuoperName");
            return (Criteria) this;
        }

        public Criteria andMenuoperNameBetween(String value1, String value2) {
            addCriterion("menuoper_name between", value1, value2, "menuoperName");
            return (Criteria) this;
        }

        public Criteria andMenuoperNameNotBetween(String value1, String value2) {
            addCriterion("menuoper_name not between", value1, value2, "menuoperName");
            return (Criteria) this;
        }

        public Criteria andMenuoperLinkIsNull() {
            addCriterion("menuoper_link is null");
            return (Criteria) this;
        }

        public Criteria andMenuoperLinkIsNotNull() {
            addCriterion("menuoper_link is not null");
            return (Criteria) this;
        }

        public Criteria andMenuoperLinkEqualTo(String value) {
            addCriterion("menuoper_link =", value, "menuoperLink");
            return (Criteria) this;
        }

        public Criteria andMenuoperLinkNotEqualTo(String value) {
            addCriterion("menuoper_link <>", value, "menuoperLink");
            return (Criteria) this;
        }

        public Criteria andMenuoperLinkGreaterThan(String value) {
            addCriterion("menuoper_link >", value, "menuoperLink");
            return (Criteria) this;
        }

        public Criteria andMenuoperLinkGreaterThanOrEqualTo(String value) {
            addCriterion("menuoper_link >=", value, "menuoperLink");
            return (Criteria) this;
        }

        public Criteria andMenuoperLinkLessThan(String value) {
            addCriterion("menuoper_link <", value, "menuoperLink");
            return (Criteria) this;
        }

        public Criteria andMenuoperLinkLessThanOrEqualTo(String value) {
            addCriterion("menuoper_link <=", value, "menuoperLink");
            return (Criteria) this;
        }

        public Criteria andMenuoperLinkLike(String value) {
            addCriterion("menuoper_link like", value, "menuoperLink");
            return (Criteria) this;
        }

        public Criteria andMenuoperLinkNotLike(String value) {
            addCriterion("menuoper_link not like", value, "menuoperLink");
            return (Criteria) this;
        }

        public Criteria andMenuoperLinkIn(List<String> values) {
            addCriterion("menuoper_link in", values, "menuoperLink");
            return (Criteria) this;
        }

        public Criteria andMenuoperLinkNotIn(List<String> values) {
            addCriterion("menuoper_link not in", values, "menuoperLink");
            return (Criteria) this;
        }

        public Criteria andMenuoperLinkBetween(String value1, String value2) {
            addCriterion("menuoper_link between", value1, value2, "menuoperLink");
            return (Criteria) this;
        }

        public Criteria andMenuoperLinkNotBetween(String value1, String value2) {
            addCriterion("menuoper_link not between", value1, value2, "menuoperLink");
            return (Criteria) this;
        }

        public Criteria andMenuoperOrderIsNull() {
            addCriterion("menuoper_order is null");
            return (Criteria) this;
        }

        public Criteria andMenuoperOrderIsNotNull() {
            addCriterion("menuoper_order is not null");
            return (Criteria) this;
        }

        public Criteria andMenuoperOrderEqualTo(Integer value) {
            addCriterion("menuoper_order =", value, "menuoperOrder");
            return (Criteria) this;
        }

        public Criteria andMenuoperOrderNotEqualTo(Integer value) {
            addCriterion("menuoper_order <>", value, "menuoperOrder");
            return (Criteria) this;
        }

        public Criteria andMenuoperOrderGreaterThan(Integer value) {
            addCriterion("menuoper_order >", value, "menuoperOrder");
            return (Criteria) this;
        }

        public Criteria andMenuoperOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("menuoper_order >=", value, "menuoperOrder");
            return (Criteria) this;
        }

        public Criteria andMenuoperOrderLessThan(Integer value) {
            addCriterion("menuoper_order <", value, "menuoperOrder");
            return (Criteria) this;
        }

        public Criteria andMenuoperOrderLessThanOrEqualTo(Integer value) {
            addCriterion("menuoper_order <=", value, "menuoperOrder");
            return (Criteria) this;
        }

        public Criteria andMenuoperOrderIn(List<Integer> values) {
            addCriterion("menuoper_order in", values, "menuoperOrder");
            return (Criteria) this;
        }

        public Criteria andMenuoperOrderNotIn(List<Integer> values) {
            addCriterion("menuoper_order not in", values, "menuoperOrder");
            return (Criteria) this;
        }

        public Criteria andMenuoperOrderBetween(Integer value1, Integer value2) {
            addCriterion("menuoper_order between", value1, value2, "menuoperOrder");
            return (Criteria) this;
        }

        public Criteria andMenuoperOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("menuoper_order not between", value1, value2, "menuoperOrder");
            return (Criteria) this;
        }

        public Criteria andMenuoperAppidIsNull() {
            addCriterion("menuoper_appID is null");
            return (Criteria) this;
        }

        public Criteria andMenuoperAppidIsNotNull() {
            addCriterion("menuoper_appID is not null");
            return (Criteria) this;
        }

        public Criteria andMenuoperAppidEqualTo(Integer value) {
            addCriterion("menuoper_appID =", value, "menuoperAppid");
            return (Criteria) this;
        }

        public Criteria andMenuoperAppidNotEqualTo(Integer value) {
            addCriterion("menuoper_appID <>", value, "menuoperAppid");
            return (Criteria) this;
        }

        public Criteria andMenuoperAppidGreaterThan(Integer value) {
            addCriterion("menuoper_appID >", value, "menuoperAppid");
            return (Criteria) this;
        }

        public Criteria andMenuoperAppidGreaterThanOrEqualTo(Integer value) {
            addCriterion("menuoper_appID >=", value, "menuoperAppid");
            return (Criteria) this;
        }

        public Criteria andMenuoperAppidLessThan(Integer value) {
            addCriterion("menuoper_appID <", value, "menuoperAppid");
            return (Criteria) this;
        }

        public Criteria andMenuoperAppidLessThanOrEqualTo(Integer value) {
            addCriterion("menuoper_appID <=", value, "menuoperAppid");
            return (Criteria) this;
        }

        public Criteria andMenuoperAppidIn(List<Integer> values) {
            addCriterion("menuoper_appID in", values, "menuoperAppid");
            return (Criteria) this;
        }

        public Criteria andMenuoperAppidNotIn(List<Integer> values) {
            addCriterion("menuoper_appID not in", values, "menuoperAppid");
            return (Criteria) this;
        }

        public Criteria andMenuoperAppidBetween(Integer value1, Integer value2) {
            addCriterion("menuoper_appID between", value1, value2, "menuoperAppid");
            return (Criteria) this;
        }

        public Criteria andMenuoperAppidNotBetween(Integer value1, Integer value2) {
            addCriterion("menuoper_appID not between", value1, value2, "menuoperAppid");
            return (Criteria) this;
        }

        public Criteria andMenuoperClassIsNull() {
            addCriterion("menuoper_class is null");
            return (Criteria) this;
        }

        public Criteria andMenuoperClassIsNotNull() {
            addCriterion("menuoper_class is not null");
            return (Criteria) this;
        }

        public Criteria andMenuoperClassEqualTo(String value) {
            addCriterion("menuoper_class =", value, "menuoperClass");
            return (Criteria) this;
        }

        public Criteria andMenuoperClassNotEqualTo(String value) {
            addCriterion("menuoper_class <>", value, "menuoperClass");
            return (Criteria) this;
        }

        public Criteria andMenuoperClassGreaterThan(String value) {
            addCriterion("menuoper_class >", value, "menuoperClass");
            return (Criteria) this;
        }

        public Criteria andMenuoperClassGreaterThanOrEqualTo(String value) {
            addCriterion("menuoper_class >=", value, "menuoperClass");
            return (Criteria) this;
        }

        public Criteria andMenuoperClassLessThan(String value) {
            addCriterion("menuoper_class <", value, "menuoperClass");
            return (Criteria) this;
        }

        public Criteria andMenuoperClassLessThanOrEqualTo(String value) {
            addCriterion("menuoper_class <=", value, "menuoperClass");
            return (Criteria) this;
        }

        public Criteria andMenuoperClassLike(String value) {
            addCriterion("menuoper_class like", value, "menuoperClass");
            return (Criteria) this;
        }

        public Criteria andMenuoperClassNotLike(String value) {
            addCriterion("menuoper_class not like", value, "menuoperClass");
            return (Criteria) this;
        }

        public Criteria andMenuoperClassIn(List<String> values) {
            addCriterion("menuoper_class in", values, "menuoperClass");
            return (Criteria) this;
        }

        public Criteria andMenuoperClassNotIn(List<String> values) {
            addCriterion("menuoper_class not in", values, "menuoperClass");
            return (Criteria) this;
        }

        public Criteria andMenuoperClassBetween(String value1, String value2) {
            addCriterion("menuoper_class between", value1, value2, "menuoperClass");
            return (Criteria) this;
        }

        public Criteria andMenuoperClassNotBetween(String value1, String value2) {
            addCriterion("menuoper_class not between", value1, value2, "menuoperClass");
            return (Criteria) this;
        }

        public Criteria andMenuoperTargetIsNull() {
            addCriterion("menuoper_target is null");
            return (Criteria) this;
        }

        public Criteria andMenuoperTargetIsNotNull() {
            addCriterion("menuoper_target is not null");
            return (Criteria) this;
        }

        public Criteria andMenuoperTargetEqualTo(String value) {
            addCriterion("menuoper_target =", value, "menuoperTarget");
            return (Criteria) this;
        }

        public Criteria andMenuoperTargetNotEqualTo(String value) {
            addCriterion("menuoper_target <>", value, "menuoperTarget");
            return (Criteria) this;
        }

        public Criteria andMenuoperTargetGreaterThan(String value) {
            addCriterion("menuoper_target >", value, "menuoperTarget");
            return (Criteria) this;
        }

        public Criteria andMenuoperTargetGreaterThanOrEqualTo(String value) {
            addCriterion("menuoper_target >=", value, "menuoperTarget");
            return (Criteria) this;
        }

        public Criteria andMenuoperTargetLessThan(String value) {
            addCriterion("menuoper_target <", value, "menuoperTarget");
            return (Criteria) this;
        }

        public Criteria andMenuoperTargetLessThanOrEqualTo(String value) {
            addCriterion("menuoper_target <=", value, "menuoperTarget");
            return (Criteria) this;
        }

        public Criteria andMenuoperTargetLike(String value) {
            addCriterion("menuoper_target like", value, "menuoperTarget");
            return (Criteria) this;
        }

        public Criteria andMenuoperTargetNotLike(String value) {
            addCriterion("menuoper_target not like", value, "menuoperTarget");
            return (Criteria) this;
        }

        public Criteria andMenuoperTargetIn(List<String> values) {
            addCriterion("menuoper_target in", values, "menuoperTarget");
            return (Criteria) this;
        }

        public Criteria andMenuoperTargetNotIn(List<String> values) {
            addCriterion("menuoper_target not in", values, "menuoperTarget");
            return (Criteria) this;
        }

        public Criteria andMenuoperTargetBetween(String value1, String value2) {
            addCriterion("menuoper_target between", value1, value2, "menuoperTarget");
            return (Criteria) this;
        }

        public Criteria andMenuoperTargetNotBetween(String value1, String value2) {
            addCriterion("menuoper_target not between", value1, value2, "menuoperTarget");
            return (Criteria) this;
        }

        public Criteria andMenuoperAppcodeIsNull() {
            addCriterion("menuoper_appcode is null");
            return (Criteria) this;
        }

        public Criteria andMenuoperAppcodeIsNotNull() {
            addCriterion("menuoper_appcode is not null");
            return (Criteria) this;
        }

        public Criteria andMenuoperAppcodeEqualTo(String value) {
            addCriterion("menuoper_appcode =", value, "menuoperAppcode");
            return (Criteria) this;
        }

        public Criteria andMenuoperAppcodeNotEqualTo(String value) {
            addCriterion("menuoper_appcode <>", value, "menuoperAppcode");
            return (Criteria) this;
        }

        public Criteria andMenuoperAppcodeGreaterThan(String value) {
            addCriterion("menuoper_appcode >", value, "menuoperAppcode");
            return (Criteria) this;
        }

        public Criteria andMenuoperAppcodeGreaterThanOrEqualTo(String value) {
            addCriterion("menuoper_appcode >=", value, "menuoperAppcode");
            return (Criteria) this;
        }

        public Criteria andMenuoperAppcodeLessThan(String value) {
            addCriterion("menuoper_appcode <", value, "menuoperAppcode");
            return (Criteria) this;
        }

        public Criteria andMenuoperAppcodeLessThanOrEqualTo(String value) {
            addCriterion("menuoper_appcode <=", value, "menuoperAppcode");
            return (Criteria) this;
        }

        public Criteria andMenuoperAppcodeLike(String value) {
            addCriterion("menuoper_appcode like", value, "menuoperAppcode");
            return (Criteria) this;
        }

        public Criteria andMenuoperAppcodeNotLike(String value) {
            addCriterion("menuoper_appcode not like", value, "menuoperAppcode");
            return (Criteria) this;
        }

        public Criteria andMenuoperAppcodeIn(List<String> values) {
            addCriterion("menuoper_appcode in", values, "menuoperAppcode");
            return (Criteria) this;
        }

        public Criteria andMenuoperAppcodeNotIn(List<String> values) {
            addCriterion("menuoper_appcode not in", values, "menuoperAppcode");
            return (Criteria) this;
        }

        public Criteria andMenuoperAppcodeBetween(String value1, String value2) {
            addCriterion("menuoper_appcode between", value1, value2, "menuoperAppcode");
            return (Criteria) this;
        }

        public Criteria andMenuoperAppcodeNotBetween(String value1, String value2) {
            addCriterion("menuoper_appcode not between", value1, value2, "menuoperAppcode");
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