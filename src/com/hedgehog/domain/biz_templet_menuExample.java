package com.hedgehog.domain;

import java.util.ArrayList;
import java.util.List;

public class biz_templet_menuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public biz_templet_menuExample() {
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

        public Criteria andTmidIsNull() {
            addCriterion("tmID is null");
            return (Criteria) this;
        }

        public Criteria andTmidIsNotNull() {
            addCriterion("tmID is not null");
            return (Criteria) this;
        }

        public Criteria andTmidEqualTo(Integer value) {
            addCriterion("tmID =", value, "tmid");
            return (Criteria) this;
        }

        public Criteria andTmidNotEqualTo(Integer value) {
            addCriterion("tmID <>", value, "tmid");
            return (Criteria) this;
        }

        public Criteria andTmidGreaterThan(Integer value) {
            addCriterion("tmID >", value, "tmid");
            return (Criteria) this;
        }

        public Criteria andTmidGreaterThanOrEqualTo(Integer value) {
            addCriterion("tmID >=", value, "tmid");
            return (Criteria) this;
        }

        public Criteria andTmidLessThan(Integer value) {
            addCriterion("tmID <", value, "tmid");
            return (Criteria) this;
        }

        public Criteria andTmidLessThanOrEqualTo(Integer value) {
            addCriterion("tmID <=", value, "tmid");
            return (Criteria) this;
        }

        public Criteria andTmidIn(List<Integer> values) {
            addCriterion("tmID in", values, "tmid");
            return (Criteria) this;
        }

        public Criteria andTmidNotIn(List<Integer> values) {
            addCriterion("tmID not in", values, "tmid");
            return (Criteria) this;
        }

        public Criteria andTmidBetween(Integer value1, Integer value2) {
            addCriterion("tmID between", value1, value2, "tmid");
            return (Criteria) this;
        }

        public Criteria andTmidNotBetween(Integer value1, Integer value2) {
            addCriterion("tmID not between", value1, value2, "tmid");
            return (Criteria) this;
        }

        public Criteria andTmTCodeIsNull() {
            addCriterion("tm_t_code is null");
            return (Criteria) this;
        }

        public Criteria andTmTCodeIsNotNull() {
            addCriterion("tm_t_code is not null");
            return (Criteria) this;
        }

        public Criteria andTmTCodeEqualTo(String value) {
            addCriterion("tm_t_code =", value, "tmTCode");
            return (Criteria) this;
        }

        public Criteria andTmTCodeNotEqualTo(String value) {
            addCriterion("tm_t_code <>", value, "tmTCode");
            return (Criteria) this;
        }

        public Criteria andTmTCodeGreaterThan(String value) {
            addCriterion("tm_t_code >", value, "tmTCode");
            return (Criteria) this;
        }

        public Criteria andTmTCodeGreaterThanOrEqualTo(String value) {
            addCriterion("tm_t_code >=", value, "tmTCode");
            return (Criteria) this;
        }

        public Criteria andTmTCodeLessThan(String value) {
            addCriterion("tm_t_code <", value, "tmTCode");
            return (Criteria) this;
        }

        public Criteria andTmTCodeLessThanOrEqualTo(String value) {
            addCriterion("tm_t_code <=", value, "tmTCode");
            return (Criteria) this;
        }

        public Criteria andTmTCodeLike(String value) {
            addCriterion("tm_t_code like", value, "tmTCode");
            return (Criteria) this;
        }

        public Criteria andTmTCodeNotLike(String value) {
            addCriterion("tm_t_code not like", value, "tmTCode");
            return (Criteria) this;
        }

        public Criteria andTmTCodeIn(List<String> values) {
            addCriterion("tm_t_code in", values, "tmTCode");
            return (Criteria) this;
        }

        public Criteria andTmTCodeNotIn(List<String> values) {
            addCriterion("tm_t_code not in", values, "tmTCode");
            return (Criteria) this;
        }

        public Criteria andTmTCodeBetween(String value1, String value2) {
            addCriterion("tm_t_code between", value1, value2, "tmTCode");
            return (Criteria) this;
        }

        public Criteria andTmTCodeNotBetween(String value1, String value2) {
            addCriterion("tm_t_code not between", value1, value2, "tmTCode");
            return (Criteria) this;
        }

        public Criteria andTmChCodeIsNull() {
            addCriterion("tm_ch_code is null");
            return (Criteria) this;
        }

        public Criteria andTmChCodeIsNotNull() {
            addCriterion("tm_ch_code is not null");
            return (Criteria) this;
        }

        public Criteria andTmChCodeEqualTo(String value) {
            addCriterion("tm_ch_code =", value, "tmChCode");
            return (Criteria) this;
        }

        public Criteria andTmChCodeNotEqualTo(String value) {
            addCriterion("tm_ch_code <>", value, "tmChCode");
            return (Criteria) this;
        }

        public Criteria andTmChCodeGreaterThan(String value) {
            addCriterion("tm_ch_code >", value, "tmChCode");
            return (Criteria) this;
        }

        public Criteria andTmChCodeGreaterThanOrEqualTo(String value) {
            addCriterion("tm_ch_code >=", value, "tmChCode");
            return (Criteria) this;
        }

        public Criteria andTmChCodeLessThan(String value) {
            addCriterion("tm_ch_code <", value, "tmChCode");
            return (Criteria) this;
        }

        public Criteria andTmChCodeLessThanOrEqualTo(String value) {
            addCriterion("tm_ch_code <=", value, "tmChCode");
            return (Criteria) this;
        }

        public Criteria andTmChCodeLike(String value) {
            addCriterion("tm_ch_code like", value, "tmChCode");
            return (Criteria) this;
        }

        public Criteria andTmChCodeNotLike(String value) {
            addCriterion("tm_ch_code not like", value, "tmChCode");
            return (Criteria) this;
        }

        public Criteria andTmChCodeIn(List<String> values) {
            addCriterion("tm_ch_code in", values, "tmChCode");
            return (Criteria) this;
        }

        public Criteria andTmChCodeNotIn(List<String> values) {
            addCriterion("tm_ch_code not in", values, "tmChCode");
            return (Criteria) this;
        }

        public Criteria andTmChCodeBetween(String value1, String value2) {
            addCriterion("tm_ch_code between", value1, value2, "tmChCode");
            return (Criteria) this;
        }

        public Criteria andTmChCodeNotBetween(String value1, String value2) {
            addCriterion("tm_ch_code not between", value1, value2, "tmChCode");
            return (Criteria) this;
        }

        public Criteria andTmIndexIsNull() {
            addCriterion("tm_index is null");
            return (Criteria) this;
        }

        public Criteria andTmIndexIsNotNull() {
            addCriterion("tm_index is not null");
            return (Criteria) this;
        }

        public Criteria andTmIndexEqualTo(Integer value) {
            addCriterion("tm_index =", value, "tmIndex");
            return (Criteria) this;
        }

        public Criteria andTmIndexNotEqualTo(Integer value) {
            addCriterion("tm_index <>", value, "tmIndex");
            return (Criteria) this;
        }

        public Criteria andTmIndexGreaterThan(Integer value) {
            addCriterion("tm_index >", value, "tmIndex");
            return (Criteria) this;
        }

        public Criteria andTmIndexGreaterThanOrEqualTo(Integer value) {
            addCriterion("tm_index >=", value, "tmIndex");
            return (Criteria) this;
        }

        public Criteria andTmIndexLessThan(Integer value) {
            addCriterion("tm_index <", value, "tmIndex");
            return (Criteria) this;
        }

        public Criteria andTmIndexLessThanOrEqualTo(Integer value) {
            addCriterion("tm_index <=", value, "tmIndex");
            return (Criteria) this;
        }

        public Criteria andTmIndexIn(List<Integer> values) {
            addCriterion("tm_index in", values, "tmIndex");
            return (Criteria) this;
        }

        public Criteria andTmIndexNotIn(List<Integer> values) {
            addCriterion("tm_index not in", values, "tmIndex");
            return (Criteria) this;
        }

        public Criteria andTmIndexBetween(Integer value1, Integer value2) {
            addCriterion("tm_index between", value1, value2, "tmIndex");
            return (Criteria) this;
        }

        public Criteria andTmIndexNotBetween(Integer value1, Integer value2) {
            addCriterion("tm_index not between", value1, value2, "tmIndex");
            return (Criteria) this;
        }

        public Criteria andTmNameIsNull() {
            addCriterion("tm_name is null");
            return (Criteria) this;
        }

        public Criteria andTmNameIsNotNull() {
            addCriterion("tm_name is not null");
            return (Criteria) this;
        }

        public Criteria andTmNameEqualTo(String value) {
            addCriterion("tm_name =", value, "tmName");
            return (Criteria) this;
        }

        public Criteria andTmNameNotEqualTo(String value) {
            addCriterion("tm_name <>", value, "tmName");
            return (Criteria) this;
        }

        public Criteria andTmNameGreaterThan(String value) {
            addCriterion("tm_name >", value, "tmName");
            return (Criteria) this;
        }

        public Criteria andTmNameGreaterThanOrEqualTo(String value) {
            addCriterion("tm_name >=", value, "tmName");
            return (Criteria) this;
        }

        public Criteria andTmNameLessThan(String value) {
            addCriterion("tm_name <", value, "tmName");
            return (Criteria) this;
        }

        public Criteria andTmNameLessThanOrEqualTo(String value) {
            addCriterion("tm_name <=", value, "tmName");
            return (Criteria) this;
        }

        public Criteria andTmNameLike(String value) {
            addCriterion("tm_name like", value, "tmName");
            return (Criteria) this;
        }

        public Criteria andTmNameNotLike(String value) {
            addCriterion("tm_name not like", value, "tmName");
            return (Criteria) this;
        }

        public Criteria andTmNameIn(List<String> values) {
            addCriterion("tm_name in", values, "tmName");
            return (Criteria) this;
        }

        public Criteria andTmNameNotIn(List<String> values) {
            addCriterion("tm_name not in", values, "tmName");
            return (Criteria) this;
        }

        public Criteria andTmNameBetween(String value1, String value2) {
            addCriterion("tm_name between", value1, value2, "tmName");
            return (Criteria) this;
        }

        public Criteria andTmNameNotBetween(String value1, String value2) {
            addCriterion("tm_name not between", value1, value2, "tmName");
            return (Criteria) this;
        }

        public Criteria andTmViewIsNull() {
            addCriterion("tm_view is null");
            return (Criteria) this;
        }

        public Criteria andTmViewIsNotNull() {
            addCriterion("tm_view is not null");
            return (Criteria) this;
        }

        public Criteria andTmViewEqualTo(String value) {
            addCriterion("tm_view =", value, "tmView");
            return (Criteria) this;
        }

        public Criteria andTmViewNotEqualTo(String value) {
            addCriterion("tm_view <>", value, "tmView");
            return (Criteria) this;
        }

        public Criteria andTmViewGreaterThan(String value) {
            addCriterion("tm_view >", value, "tmView");
            return (Criteria) this;
        }

        public Criteria andTmViewGreaterThanOrEqualTo(String value) {
            addCriterion("tm_view >=", value, "tmView");
            return (Criteria) this;
        }

        public Criteria andTmViewLessThan(String value) {
            addCriterion("tm_view <", value, "tmView");
            return (Criteria) this;
        }

        public Criteria andTmViewLessThanOrEqualTo(String value) {
            addCriterion("tm_view <=", value, "tmView");
            return (Criteria) this;
        }

        public Criteria andTmViewLike(String value) {
            addCriterion("tm_view like", value, "tmView");
            return (Criteria) this;
        }

        public Criteria andTmViewNotLike(String value) {
            addCriterion("tm_view not like", value, "tmView");
            return (Criteria) this;
        }

        public Criteria andTmViewIn(List<String> values) {
            addCriterion("tm_view in", values, "tmView");
            return (Criteria) this;
        }

        public Criteria andTmViewNotIn(List<String> values) {
            addCriterion("tm_view not in", values, "tmView");
            return (Criteria) this;
        }

        public Criteria andTmViewBetween(String value1, String value2) {
            addCriterion("tm_view between", value1, value2, "tmView");
            return (Criteria) this;
        }

        public Criteria andTmViewNotBetween(String value1, String value2) {
            addCriterion("tm_view not between", value1, value2, "tmView");
            return (Criteria) this;
        }

        public Criteria andTmTargetIsNull() {
            addCriterion("tm_target is null");
            return (Criteria) this;
        }

        public Criteria andTmTargetIsNotNull() {
            addCriterion("tm_target is not null");
            return (Criteria) this;
        }

        public Criteria andTmTargetEqualTo(String value) {
            addCriterion("tm_target =", value, "tmTarget");
            return (Criteria) this;
        }

        public Criteria andTmTargetNotEqualTo(String value) {
            addCriterion("tm_target <>", value, "tmTarget");
            return (Criteria) this;
        }

        public Criteria andTmTargetGreaterThan(String value) {
            addCriterion("tm_target >", value, "tmTarget");
            return (Criteria) this;
        }

        public Criteria andTmTargetGreaterThanOrEqualTo(String value) {
            addCriterion("tm_target >=", value, "tmTarget");
            return (Criteria) this;
        }

        public Criteria andTmTargetLessThan(String value) {
            addCriterion("tm_target <", value, "tmTarget");
            return (Criteria) this;
        }

        public Criteria andTmTargetLessThanOrEqualTo(String value) {
            addCriterion("tm_target <=", value, "tmTarget");
            return (Criteria) this;
        }

        public Criteria andTmTargetLike(String value) {
            addCriterion("tm_target like", value, "tmTarget");
            return (Criteria) this;
        }

        public Criteria andTmTargetNotLike(String value) {
            addCriterion("tm_target not like", value, "tmTarget");
            return (Criteria) this;
        }

        public Criteria andTmTargetIn(List<String> values) {
            addCriterion("tm_target in", values, "tmTarget");
            return (Criteria) this;
        }

        public Criteria andTmTargetNotIn(List<String> values) {
            addCriterion("tm_target not in", values, "tmTarget");
            return (Criteria) this;
        }

        public Criteria andTmTargetBetween(String value1, String value2) {
            addCriterion("tm_target between", value1, value2, "tmTarget");
            return (Criteria) this;
        }

        public Criteria andTmTargetNotBetween(String value1, String value2) {
            addCriterion("tm_target not between", value1, value2, "tmTarget");
            return (Criteria) this;
        }

        public Criteria andTmClassIsNull() {
            addCriterion("tm_class is null");
            return (Criteria) this;
        }

        public Criteria andTmClassIsNotNull() {
            addCriterion("tm_class is not null");
            return (Criteria) this;
        }

        public Criteria andTmClassEqualTo(String value) {
            addCriterion("tm_class =", value, "tmClass");
            return (Criteria) this;
        }

        public Criteria andTmClassNotEqualTo(String value) {
            addCriterion("tm_class <>", value, "tmClass");
            return (Criteria) this;
        }

        public Criteria andTmClassGreaterThan(String value) {
            addCriterion("tm_class >", value, "tmClass");
            return (Criteria) this;
        }

        public Criteria andTmClassGreaterThanOrEqualTo(String value) {
            addCriterion("tm_class >=", value, "tmClass");
            return (Criteria) this;
        }

        public Criteria andTmClassLessThan(String value) {
            addCriterion("tm_class <", value, "tmClass");
            return (Criteria) this;
        }

        public Criteria andTmClassLessThanOrEqualTo(String value) {
            addCriterion("tm_class <=", value, "tmClass");
            return (Criteria) this;
        }

        public Criteria andTmClassLike(String value) {
            addCriterion("tm_class like", value, "tmClass");
            return (Criteria) this;
        }

        public Criteria andTmClassNotLike(String value) {
            addCriterion("tm_class not like", value, "tmClass");
            return (Criteria) this;
        }

        public Criteria andTmClassIn(List<String> values) {
            addCriterion("tm_class in", values, "tmClass");
            return (Criteria) this;
        }

        public Criteria andTmClassNotIn(List<String> values) {
            addCriterion("tm_class not in", values, "tmClass");
            return (Criteria) this;
        }

        public Criteria andTmClassBetween(String value1, String value2) {
            addCriterion("tm_class between", value1, value2, "tmClass");
            return (Criteria) this;
        }

        public Criteria andTmClassNotBetween(String value1, String value2) {
            addCriterion("tm_class not between", value1, value2, "tmClass");
            return (Criteria) this;
        }

        public Criteria andTmEnableIsNull() {
            addCriterion("tm_enable is null");
            return (Criteria) this;
        }

        public Criteria andTmEnableIsNotNull() {
            addCriterion("tm_enable is not null");
            return (Criteria) this;
        }

        public Criteria andTmEnableEqualTo(Integer value) {
            addCriterion("tm_enable =", value, "tmEnable");
            return (Criteria) this;
        }

        public Criteria andTmEnableNotEqualTo(Integer value) {
            addCriterion("tm_enable <>", value, "tmEnable");
            return (Criteria) this;
        }

        public Criteria andTmEnableGreaterThan(Integer value) {
            addCriterion("tm_enable >", value, "tmEnable");
            return (Criteria) this;
        }

        public Criteria andTmEnableGreaterThanOrEqualTo(Integer value) {
            addCriterion("tm_enable >=", value, "tmEnable");
            return (Criteria) this;
        }

        public Criteria andTmEnableLessThan(Integer value) {
            addCriterion("tm_enable <", value, "tmEnable");
            return (Criteria) this;
        }

        public Criteria andTmEnableLessThanOrEqualTo(Integer value) {
            addCriterion("tm_enable <=", value, "tmEnable");
            return (Criteria) this;
        }

        public Criteria andTmEnableIn(List<Integer> values) {
            addCriterion("tm_enable in", values, "tmEnable");
            return (Criteria) this;
        }

        public Criteria andTmEnableNotIn(List<Integer> values) {
            addCriterion("tm_enable not in", values, "tmEnable");
            return (Criteria) this;
        }

        public Criteria andTmEnableBetween(Integer value1, Integer value2) {
            addCriterion("tm_enable between", value1, value2, "tmEnable");
            return (Criteria) this;
        }

        public Criteria andTmEnableNotBetween(Integer value1, Integer value2) {
            addCriterion("tm_enable not between", value1, value2, "tmEnable");
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