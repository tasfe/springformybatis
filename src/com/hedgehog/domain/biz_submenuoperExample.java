package com.hedgehog.domain;

import java.util.ArrayList;
import java.util.List;

public class biz_submenuoperExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public biz_submenuoperExample() {
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

        public Criteria andSubmenuoperidIsNull() {
            addCriterion("submenuoperID is null");
            return (Criteria) this;
        }

        public Criteria andSubmenuoperidIsNotNull() {
            addCriterion("submenuoperID is not null");
            return (Criteria) this;
        }

        public Criteria andSubmenuoperidEqualTo(Integer value) {
            addCriterion("submenuoperID =", value, "submenuoperid");
            return (Criteria) this;
        }

        public Criteria andSubmenuoperidNotEqualTo(Integer value) {
            addCriterion("submenuoperID <>", value, "submenuoperid");
            return (Criteria) this;
        }

        public Criteria andSubmenuoperidGreaterThan(Integer value) {
            addCriterion("submenuoperID >", value, "submenuoperid");
            return (Criteria) this;
        }

        public Criteria andSubmenuoperidGreaterThanOrEqualTo(Integer value) {
            addCriterion("submenuoperID >=", value, "submenuoperid");
            return (Criteria) this;
        }

        public Criteria andSubmenuoperidLessThan(Integer value) {
            addCriterion("submenuoperID <", value, "submenuoperid");
            return (Criteria) this;
        }

        public Criteria andSubmenuoperidLessThanOrEqualTo(Integer value) {
            addCriterion("submenuoperID <=", value, "submenuoperid");
            return (Criteria) this;
        }

        public Criteria andSubmenuoperidIn(List<Integer> values) {
            addCriterion("submenuoperID in", values, "submenuoperid");
            return (Criteria) this;
        }

        public Criteria andSubmenuoperidNotIn(List<Integer> values) {
            addCriterion("submenuoperID not in", values, "submenuoperid");
            return (Criteria) this;
        }

        public Criteria andSubmenuoperidBetween(Integer value1, Integer value2) {
            addCriterion("submenuoperID between", value1, value2, "submenuoperid");
            return (Criteria) this;
        }

        public Criteria andSubmenuoperidNotBetween(Integer value1, Integer value2) {
            addCriterion("submenuoperID not between", value1, value2, "submenuoperid");
            return (Criteria) this;
        }

        public Criteria andSubmenuoperParentidIsNull() {
            addCriterion("submenuoper_parentID is null");
            return (Criteria) this;
        }

        public Criteria andSubmenuoperParentidIsNotNull() {
            addCriterion("submenuoper_parentID is not null");
            return (Criteria) this;
        }

        public Criteria andSubmenuoperParentidEqualTo(Integer value) {
            addCriterion("submenuoper_parentID =", value, "submenuoperParentid");
            return (Criteria) this;
        }

        public Criteria andSubmenuoperParentidNotEqualTo(Integer value) {
            addCriterion("submenuoper_parentID <>", value, "submenuoperParentid");
            return (Criteria) this;
        }

        public Criteria andSubmenuoperParentidGreaterThan(Integer value) {
            addCriterion("submenuoper_parentID >", value, "submenuoperParentid");
            return (Criteria) this;
        }

        public Criteria andSubmenuoperParentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("submenuoper_parentID >=", value, "submenuoperParentid");
            return (Criteria) this;
        }

        public Criteria andSubmenuoperParentidLessThan(Integer value) {
            addCriterion("submenuoper_parentID <", value, "submenuoperParentid");
            return (Criteria) this;
        }

        public Criteria andSubmenuoperParentidLessThanOrEqualTo(Integer value) {
            addCriterion("submenuoper_parentID <=", value, "submenuoperParentid");
            return (Criteria) this;
        }

        public Criteria andSubmenuoperParentidIn(List<Integer> values) {
            addCriterion("submenuoper_parentID in", values, "submenuoperParentid");
            return (Criteria) this;
        }

        public Criteria andSubmenuoperParentidNotIn(List<Integer> values) {
            addCriterion("submenuoper_parentID not in", values, "submenuoperParentid");
            return (Criteria) this;
        }

        public Criteria andSubmenuoperParentidBetween(Integer value1, Integer value2) {
            addCriterion("submenuoper_parentID between", value1, value2, "submenuoperParentid");
            return (Criteria) this;
        }

        public Criteria andSubmenuoperParentidNotBetween(Integer value1, Integer value2) {
            addCriterion("submenuoper_parentID not between", value1, value2, "submenuoperParentid");
            return (Criteria) this;
        }

        public Criteria andSubmenuoperNameIsNull() {
            addCriterion("submenuoper_name is null");
            return (Criteria) this;
        }

        public Criteria andSubmenuoperNameIsNotNull() {
            addCriterion("submenuoper_name is not null");
            return (Criteria) this;
        }

        public Criteria andSubmenuoperNameEqualTo(String value) {
            addCriterion("submenuoper_name =", value, "submenuoperName");
            return (Criteria) this;
        }

        public Criteria andSubmenuoperNameNotEqualTo(String value) {
            addCriterion("submenuoper_name <>", value, "submenuoperName");
            return (Criteria) this;
        }

        public Criteria andSubmenuoperNameGreaterThan(String value) {
            addCriterion("submenuoper_name >", value, "submenuoperName");
            return (Criteria) this;
        }

        public Criteria andSubmenuoperNameGreaterThanOrEqualTo(String value) {
            addCriterion("submenuoper_name >=", value, "submenuoperName");
            return (Criteria) this;
        }

        public Criteria andSubmenuoperNameLessThan(String value) {
            addCriterion("submenuoper_name <", value, "submenuoperName");
            return (Criteria) this;
        }

        public Criteria andSubmenuoperNameLessThanOrEqualTo(String value) {
            addCriterion("submenuoper_name <=", value, "submenuoperName");
            return (Criteria) this;
        }

        public Criteria andSubmenuoperNameLike(String value) {
            addCriterion("submenuoper_name like", value, "submenuoperName");
            return (Criteria) this;
        }

        public Criteria andSubmenuoperNameNotLike(String value) {
            addCriterion("submenuoper_name not like", value, "submenuoperName");
            return (Criteria) this;
        }

        public Criteria andSubmenuoperNameIn(List<String> values) {
            addCriterion("submenuoper_name in", values, "submenuoperName");
            return (Criteria) this;
        }

        public Criteria andSubmenuoperNameNotIn(List<String> values) {
            addCriterion("submenuoper_name not in", values, "submenuoperName");
            return (Criteria) this;
        }

        public Criteria andSubmenuoperNameBetween(String value1, String value2) {
            addCriterion("submenuoper_name between", value1, value2, "submenuoperName");
            return (Criteria) this;
        }

        public Criteria andSubmenuoperNameNotBetween(String value1, String value2) {
            addCriterion("submenuoper_name not between", value1, value2, "submenuoperName");
            return (Criteria) this;
        }

        public Criteria andSubmenuoperLinkIsNull() {
            addCriterion("submenuoper_link is null");
            return (Criteria) this;
        }

        public Criteria andSubmenuoperLinkIsNotNull() {
            addCriterion("submenuoper_link is not null");
            return (Criteria) this;
        }

        public Criteria andSubmenuoperLinkEqualTo(String value) {
            addCriterion("submenuoper_link =", value, "submenuoperLink");
            return (Criteria) this;
        }

        public Criteria andSubmenuoperLinkNotEqualTo(String value) {
            addCriterion("submenuoper_link <>", value, "submenuoperLink");
            return (Criteria) this;
        }

        public Criteria andSubmenuoperLinkGreaterThan(String value) {
            addCriterion("submenuoper_link >", value, "submenuoperLink");
            return (Criteria) this;
        }

        public Criteria andSubmenuoperLinkGreaterThanOrEqualTo(String value) {
            addCriterion("submenuoper_link >=", value, "submenuoperLink");
            return (Criteria) this;
        }

        public Criteria andSubmenuoperLinkLessThan(String value) {
            addCriterion("submenuoper_link <", value, "submenuoperLink");
            return (Criteria) this;
        }

        public Criteria andSubmenuoperLinkLessThanOrEqualTo(String value) {
            addCriterion("submenuoper_link <=", value, "submenuoperLink");
            return (Criteria) this;
        }

        public Criteria andSubmenuoperLinkLike(String value) {
            addCriterion("submenuoper_link like", value, "submenuoperLink");
            return (Criteria) this;
        }

        public Criteria andSubmenuoperLinkNotLike(String value) {
            addCriterion("submenuoper_link not like", value, "submenuoperLink");
            return (Criteria) this;
        }

        public Criteria andSubmenuoperLinkIn(List<String> values) {
            addCriterion("submenuoper_link in", values, "submenuoperLink");
            return (Criteria) this;
        }

        public Criteria andSubmenuoperLinkNotIn(List<String> values) {
            addCriterion("submenuoper_link not in", values, "submenuoperLink");
            return (Criteria) this;
        }

        public Criteria andSubmenuoperLinkBetween(String value1, String value2) {
            addCriterion("submenuoper_link between", value1, value2, "submenuoperLink");
            return (Criteria) this;
        }

        public Criteria andSubmenuoperLinkNotBetween(String value1, String value2) {
            addCriterion("submenuoper_link not between", value1, value2, "submenuoperLink");
            return (Criteria) this;
        }

        public Criteria andSubmenuoperOrderIsNull() {
            addCriterion("submenuoper_order is null");
            return (Criteria) this;
        }

        public Criteria andSubmenuoperOrderIsNotNull() {
            addCriterion("submenuoper_order is not null");
            return (Criteria) this;
        }

        public Criteria andSubmenuoperOrderEqualTo(Integer value) {
            addCriterion("submenuoper_order =", value, "submenuoperOrder");
            return (Criteria) this;
        }

        public Criteria andSubmenuoperOrderNotEqualTo(Integer value) {
            addCriterion("submenuoper_order <>", value, "submenuoperOrder");
            return (Criteria) this;
        }

        public Criteria andSubmenuoperOrderGreaterThan(Integer value) {
            addCriterion("submenuoper_order >", value, "submenuoperOrder");
            return (Criteria) this;
        }

        public Criteria andSubmenuoperOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("submenuoper_order >=", value, "submenuoperOrder");
            return (Criteria) this;
        }

        public Criteria andSubmenuoperOrderLessThan(Integer value) {
            addCriterion("submenuoper_order <", value, "submenuoperOrder");
            return (Criteria) this;
        }

        public Criteria andSubmenuoperOrderLessThanOrEqualTo(Integer value) {
            addCriterion("submenuoper_order <=", value, "submenuoperOrder");
            return (Criteria) this;
        }

        public Criteria andSubmenuoperOrderIn(List<Integer> values) {
            addCriterion("submenuoper_order in", values, "submenuoperOrder");
            return (Criteria) this;
        }

        public Criteria andSubmenuoperOrderNotIn(List<Integer> values) {
            addCriterion("submenuoper_order not in", values, "submenuoperOrder");
            return (Criteria) this;
        }

        public Criteria andSubmenuoperOrderBetween(Integer value1, Integer value2) {
            addCriterion("submenuoper_order between", value1, value2, "submenuoperOrder");
            return (Criteria) this;
        }

        public Criteria andSubmenuoperOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("submenuoper_order not between", value1, value2, "submenuoperOrder");
            return (Criteria) this;
        }

        public Criteria andSubmenuoperClassIsNull() {
            addCriterion("submenuoper_class is null");
            return (Criteria) this;
        }

        public Criteria andSubmenuoperClassIsNotNull() {
            addCriterion("submenuoper_class is not null");
            return (Criteria) this;
        }

        public Criteria andSubmenuoperClassEqualTo(String value) {
            addCriterion("submenuoper_class =", value, "submenuoperClass");
            return (Criteria) this;
        }

        public Criteria andSubmenuoperClassNotEqualTo(String value) {
            addCriterion("submenuoper_class <>", value, "submenuoperClass");
            return (Criteria) this;
        }

        public Criteria andSubmenuoperClassGreaterThan(String value) {
            addCriterion("submenuoper_class >", value, "submenuoperClass");
            return (Criteria) this;
        }

        public Criteria andSubmenuoperClassGreaterThanOrEqualTo(String value) {
            addCriterion("submenuoper_class >=", value, "submenuoperClass");
            return (Criteria) this;
        }

        public Criteria andSubmenuoperClassLessThan(String value) {
            addCriterion("submenuoper_class <", value, "submenuoperClass");
            return (Criteria) this;
        }

        public Criteria andSubmenuoperClassLessThanOrEqualTo(String value) {
            addCriterion("submenuoper_class <=", value, "submenuoperClass");
            return (Criteria) this;
        }

        public Criteria andSubmenuoperClassLike(String value) {
            addCriterion("submenuoper_class like", value, "submenuoperClass");
            return (Criteria) this;
        }

        public Criteria andSubmenuoperClassNotLike(String value) {
            addCriterion("submenuoper_class not like", value, "submenuoperClass");
            return (Criteria) this;
        }

        public Criteria andSubmenuoperClassIn(List<String> values) {
            addCriterion("submenuoper_class in", values, "submenuoperClass");
            return (Criteria) this;
        }

        public Criteria andSubmenuoperClassNotIn(List<String> values) {
            addCriterion("submenuoper_class not in", values, "submenuoperClass");
            return (Criteria) this;
        }

        public Criteria andSubmenuoperClassBetween(String value1, String value2) {
            addCriterion("submenuoper_class between", value1, value2, "submenuoperClass");
            return (Criteria) this;
        }

        public Criteria andSubmenuoperClassNotBetween(String value1, String value2) {
            addCriterion("submenuoper_class not between", value1, value2, "submenuoperClass");
            return (Criteria) this;
        }

        public Criteria andSubmenuoperTargetIsNull() {
            addCriterion("submenuoper_target is null");
            return (Criteria) this;
        }

        public Criteria andSubmenuoperTargetIsNotNull() {
            addCriterion("submenuoper_target is not null");
            return (Criteria) this;
        }

        public Criteria andSubmenuoperTargetEqualTo(String value) {
            addCriterion("submenuoper_target =", value, "submenuoperTarget");
            return (Criteria) this;
        }

        public Criteria andSubmenuoperTargetNotEqualTo(String value) {
            addCriterion("submenuoper_target <>", value, "submenuoperTarget");
            return (Criteria) this;
        }

        public Criteria andSubmenuoperTargetGreaterThan(String value) {
            addCriterion("submenuoper_target >", value, "submenuoperTarget");
            return (Criteria) this;
        }

        public Criteria andSubmenuoperTargetGreaterThanOrEqualTo(String value) {
            addCriterion("submenuoper_target >=", value, "submenuoperTarget");
            return (Criteria) this;
        }

        public Criteria andSubmenuoperTargetLessThan(String value) {
            addCriterion("submenuoper_target <", value, "submenuoperTarget");
            return (Criteria) this;
        }

        public Criteria andSubmenuoperTargetLessThanOrEqualTo(String value) {
            addCriterion("submenuoper_target <=", value, "submenuoperTarget");
            return (Criteria) this;
        }

        public Criteria andSubmenuoperTargetLike(String value) {
            addCriterion("submenuoper_target like", value, "submenuoperTarget");
            return (Criteria) this;
        }

        public Criteria andSubmenuoperTargetNotLike(String value) {
            addCriterion("submenuoper_target not like", value, "submenuoperTarget");
            return (Criteria) this;
        }

        public Criteria andSubmenuoperTargetIn(List<String> values) {
            addCriterion("submenuoper_target in", values, "submenuoperTarget");
            return (Criteria) this;
        }

        public Criteria andSubmenuoperTargetNotIn(List<String> values) {
            addCriterion("submenuoper_target not in", values, "submenuoperTarget");
            return (Criteria) this;
        }

        public Criteria andSubmenuoperTargetBetween(String value1, String value2) {
            addCriterion("submenuoper_target between", value1, value2, "submenuoperTarget");
            return (Criteria) this;
        }

        public Criteria andSubmenuoperTargetNotBetween(String value1, String value2) {
            addCriterion("submenuoper_target not between", value1, value2, "submenuoperTarget");
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