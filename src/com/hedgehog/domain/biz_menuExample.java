package com.hedgehog.domain;

import java.util.ArrayList;
import java.util.List;

public class biz_menuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public biz_menuExample() {
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

        public Criteria andMenuidIsNull() {
            addCriterion("menuID is null");
            return (Criteria) this;
        }

        public Criteria andMenuidIsNotNull() {
            addCriterion("menuID is not null");
            return (Criteria) this;
        }

        public Criteria andMenuidEqualTo(Integer value) {
            addCriterion("menuID =", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidNotEqualTo(Integer value) {
            addCriterion("menuID <>", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidGreaterThan(Integer value) {
            addCriterion("menuID >", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("menuID >=", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidLessThan(Integer value) {
            addCriterion("menuID <", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidLessThanOrEqualTo(Integer value) {
            addCriterion("menuID <=", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidIn(List<Integer> values) {
            addCriterion("menuID in", values, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidNotIn(List<Integer> values) {
            addCriterion("menuID not in", values, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidBetween(Integer value1, Integer value2) {
            addCriterion("menuID between", value1, value2, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidNotBetween(Integer value1, Integer value2) {
            addCriterion("menuID not between", value1, value2, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuMemberidIsNull() {
            addCriterion("menu_memberid is null");
            return (Criteria) this;
        }

        public Criteria andMenuMemberidIsNotNull() {
            addCriterion("menu_memberid is not null");
            return (Criteria) this;
        }

        public Criteria andMenuMemberidEqualTo(Integer value) {
            addCriterion("menu_memberid =", value, "menuMemberid");
            return (Criteria) this;
        }

        public Criteria andMenuMemberidNotEqualTo(Integer value) {
            addCriterion("menu_memberid <>", value, "menuMemberid");
            return (Criteria) this;
        }

        public Criteria andMenuMemberidGreaterThan(Integer value) {
            addCriterion("menu_memberid >", value, "menuMemberid");
            return (Criteria) this;
        }

        public Criteria andMenuMemberidGreaterThanOrEqualTo(Integer value) {
            addCriterion("menu_memberid >=", value, "menuMemberid");
            return (Criteria) this;
        }

        public Criteria andMenuMemberidLessThan(Integer value) {
            addCriterion("menu_memberid <", value, "menuMemberid");
            return (Criteria) this;
        }

        public Criteria andMenuMemberidLessThanOrEqualTo(Integer value) {
            addCriterion("menu_memberid <=", value, "menuMemberid");
            return (Criteria) this;
        }

        public Criteria andMenuMemberidIn(List<Integer> values) {
            addCriterion("menu_memberid in", values, "menuMemberid");
            return (Criteria) this;
        }

        public Criteria andMenuMemberidNotIn(List<Integer> values) {
            addCriterion("menu_memberid not in", values, "menuMemberid");
            return (Criteria) this;
        }

        public Criteria andMenuMemberidBetween(Integer value1, Integer value2) {
            addCriterion("menu_memberid between", value1, value2, "menuMemberid");
            return (Criteria) this;
        }

        public Criteria andMenuMemberidNotBetween(Integer value1, Integer value2) {
            addCriterion("menu_memberid not between", value1, value2, "menuMemberid");
            return (Criteria) this;
        }

        public Criteria andMenuParentidIsNull() {
            addCriterion("menu_parentID is null");
            return (Criteria) this;
        }

        public Criteria andMenuParentidIsNotNull() {
            addCriterion("menu_parentID is not null");
            return (Criteria) this;
        }

        public Criteria andMenuParentidEqualTo(Integer value) {
            addCriterion("menu_parentID =", value, "menuParentid");
            return (Criteria) this;
        }

        public Criteria andMenuParentidNotEqualTo(Integer value) {
            addCriterion("menu_parentID <>", value, "menuParentid");
            return (Criteria) this;
        }

        public Criteria andMenuParentidGreaterThan(Integer value) {
            addCriterion("menu_parentID >", value, "menuParentid");
            return (Criteria) this;
        }

        public Criteria andMenuParentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("menu_parentID >=", value, "menuParentid");
            return (Criteria) this;
        }

        public Criteria andMenuParentidLessThan(Integer value) {
            addCriterion("menu_parentID <", value, "menuParentid");
            return (Criteria) this;
        }

        public Criteria andMenuParentidLessThanOrEqualTo(Integer value) {
            addCriterion("menu_parentID <=", value, "menuParentid");
            return (Criteria) this;
        }

        public Criteria andMenuParentidIn(List<Integer> values) {
            addCriterion("menu_parentID in", values, "menuParentid");
            return (Criteria) this;
        }

        public Criteria andMenuParentidNotIn(List<Integer> values) {
            addCriterion("menu_parentID not in", values, "menuParentid");
            return (Criteria) this;
        }

        public Criteria andMenuParentidBetween(Integer value1, Integer value2) {
            addCriterion("menu_parentID between", value1, value2, "menuParentid");
            return (Criteria) this;
        }

        public Criteria andMenuParentidNotBetween(Integer value1, Integer value2) {
            addCriterion("menu_parentID not between", value1, value2, "menuParentid");
            return (Criteria) this;
        }

        public Criteria andMenuIndexIsNull() {
            addCriterion("menu_index is null");
            return (Criteria) this;
        }

        public Criteria andMenuIndexIsNotNull() {
            addCriterion("menu_index is not null");
            return (Criteria) this;
        }

        public Criteria andMenuIndexEqualTo(Integer value) {
            addCriterion("menu_index =", value, "menuIndex");
            return (Criteria) this;
        }

        public Criteria andMenuIndexNotEqualTo(Integer value) {
            addCriterion("menu_index <>", value, "menuIndex");
            return (Criteria) this;
        }

        public Criteria andMenuIndexGreaterThan(Integer value) {
            addCriterion("menu_index >", value, "menuIndex");
            return (Criteria) this;
        }

        public Criteria andMenuIndexGreaterThanOrEqualTo(Integer value) {
            addCriterion("menu_index >=", value, "menuIndex");
            return (Criteria) this;
        }

        public Criteria andMenuIndexLessThan(Integer value) {
            addCriterion("menu_index <", value, "menuIndex");
            return (Criteria) this;
        }

        public Criteria andMenuIndexLessThanOrEqualTo(Integer value) {
            addCriterion("menu_index <=", value, "menuIndex");
            return (Criteria) this;
        }

        public Criteria andMenuIndexIn(List<Integer> values) {
            addCriterion("menu_index in", values, "menuIndex");
            return (Criteria) this;
        }

        public Criteria andMenuIndexNotIn(List<Integer> values) {
            addCriterion("menu_index not in", values, "menuIndex");
            return (Criteria) this;
        }

        public Criteria andMenuIndexBetween(Integer value1, Integer value2) {
            addCriterion("menu_index between", value1, value2, "menuIndex");
            return (Criteria) this;
        }

        public Criteria andMenuIndexNotBetween(Integer value1, Integer value2) {
            addCriterion("menu_index not between", value1, value2, "menuIndex");
            return (Criteria) this;
        }

        public Criteria andMenuNameIsNull() {
            addCriterion("menu_name is null");
            return (Criteria) this;
        }

        public Criteria andMenuNameIsNotNull() {
            addCriterion("menu_name is not null");
            return (Criteria) this;
        }

        public Criteria andMenuNameEqualTo(String value) {
            addCriterion("menu_name =", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotEqualTo(String value) {
            addCriterion("menu_name <>", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameGreaterThan(String value) {
            addCriterion("menu_name >", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameGreaterThanOrEqualTo(String value) {
            addCriterion("menu_name >=", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLessThan(String value) {
            addCriterion("menu_name <", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLessThanOrEqualTo(String value) {
            addCriterion("menu_name <=", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLike(String value) {
            addCriterion("menu_name like", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotLike(String value) {
            addCriterion("menu_name not like", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameIn(List<String> values) {
            addCriterion("menu_name in", values, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotIn(List<String> values) {
            addCriterion("menu_name not in", values, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameBetween(String value1, String value2) {
            addCriterion("menu_name between", value1, value2, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotBetween(String value1, String value2) {
            addCriterion("menu_name not between", value1, value2, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuTargetIsNull() {
            addCriterion("menu_target is null");
            return (Criteria) this;
        }

        public Criteria andMenuTargetIsNotNull() {
            addCriterion("menu_target is not null");
            return (Criteria) this;
        }

        public Criteria andMenuTargetEqualTo(String value) {
            addCriterion("menu_target =", value, "menuTarget");
            return (Criteria) this;
        }

        public Criteria andMenuTargetNotEqualTo(String value) {
            addCriterion("menu_target <>", value, "menuTarget");
            return (Criteria) this;
        }

        public Criteria andMenuTargetGreaterThan(String value) {
            addCriterion("menu_target >", value, "menuTarget");
            return (Criteria) this;
        }

        public Criteria andMenuTargetGreaterThanOrEqualTo(String value) {
            addCriterion("menu_target >=", value, "menuTarget");
            return (Criteria) this;
        }

        public Criteria andMenuTargetLessThan(String value) {
            addCriterion("menu_target <", value, "menuTarget");
            return (Criteria) this;
        }

        public Criteria andMenuTargetLessThanOrEqualTo(String value) {
            addCriterion("menu_target <=", value, "menuTarget");
            return (Criteria) this;
        }

        public Criteria andMenuTargetLike(String value) {
            addCriterion("menu_target like", value, "menuTarget");
            return (Criteria) this;
        }

        public Criteria andMenuTargetNotLike(String value) {
            addCriterion("menu_target not like", value, "menuTarget");
            return (Criteria) this;
        }

        public Criteria andMenuTargetIn(List<String> values) {
            addCriterion("menu_target in", values, "menuTarget");
            return (Criteria) this;
        }

        public Criteria andMenuTargetNotIn(List<String> values) {
            addCriterion("menu_target not in", values, "menuTarget");
            return (Criteria) this;
        }

        public Criteria andMenuTargetBetween(String value1, String value2) {
            addCriterion("menu_target between", value1, value2, "menuTarget");
            return (Criteria) this;
        }

        public Criteria andMenuTargetNotBetween(String value1, String value2) {
            addCriterion("menu_target not between", value1, value2, "menuTarget");
            return (Criteria) this;
        }

        public Criteria andMenuClassIsNull() {
            addCriterion("menu_class is null");
            return (Criteria) this;
        }

        public Criteria andMenuClassIsNotNull() {
            addCriterion("menu_class is not null");
            return (Criteria) this;
        }

        public Criteria andMenuClassEqualTo(String value) {
            addCriterion("menu_class =", value, "menuClass");
            return (Criteria) this;
        }

        public Criteria andMenuClassNotEqualTo(String value) {
            addCriterion("menu_class <>", value, "menuClass");
            return (Criteria) this;
        }

        public Criteria andMenuClassGreaterThan(String value) {
            addCriterion("menu_class >", value, "menuClass");
            return (Criteria) this;
        }

        public Criteria andMenuClassGreaterThanOrEqualTo(String value) {
            addCriterion("menu_class >=", value, "menuClass");
            return (Criteria) this;
        }

        public Criteria andMenuClassLessThan(String value) {
            addCriterion("menu_class <", value, "menuClass");
            return (Criteria) this;
        }

        public Criteria andMenuClassLessThanOrEqualTo(String value) {
            addCriterion("menu_class <=", value, "menuClass");
            return (Criteria) this;
        }

        public Criteria andMenuClassLike(String value) {
            addCriterion("menu_class like", value, "menuClass");
            return (Criteria) this;
        }

        public Criteria andMenuClassNotLike(String value) {
            addCriterion("menu_class not like", value, "menuClass");
            return (Criteria) this;
        }

        public Criteria andMenuClassIn(List<String> values) {
            addCriterion("menu_class in", values, "menuClass");
            return (Criteria) this;
        }

        public Criteria andMenuClassNotIn(List<String> values) {
            addCriterion("menu_class not in", values, "menuClass");
            return (Criteria) this;
        }

        public Criteria andMenuClassBetween(String value1, String value2) {
            addCriterion("menu_class between", value1, value2, "menuClass");
            return (Criteria) this;
        }

        public Criteria andMenuClassNotBetween(String value1, String value2) {
            addCriterion("menu_class not between", value1, value2, "menuClass");
            return (Criteria) this;
        }

        public Criteria andMenuEnableIsNull() {
            addCriterion("menu_enable is null");
            return (Criteria) this;
        }

        public Criteria andMenuEnableIsNotNull() {
            addCriterion("menu_enable is not null");
            return (Criteria) this;
        }

        public Criteria andMenuEnableEqualTo(Integer value) {
            addCriterion("menu_enable =", value, "menuEnable");
            return (Criteria) this;
        }

        public Criteria andMenuEnableNotEqualTo(Integer value) {
            addCriterion("menu_enable <>", value, "menuEnable");
            return (Criteria) this;
        }

        public Criteria andMenuEnableGreaterThan(Integer value) {
            addCriterion("menu_enable >", value, "menuEnable");
            return (Criteria) this;
        }

        public Criteria andMenuEnableGreaterThanOrEqualTo(Integer value) {
            addCriterion("menu_enable >=", value, "menuEnable");
            return (Criteria) this;
        }

        public Criteria andMenuEnableLessThan(Integer value) {
            addCriterion("menu_enable <", value, "menuEnable");
            return (Criteria) this;
        }

        public Criteria andMenuEnableLessThanOrEqualTo(Integer value) {
            addCriterion("menu_enable <=", value, "menuEnable");
            return (Criteria) this;
        }

        public Criteria andMenuEnableIn(List<Integer> values) {
            addCriterion("menu_enable in", values, "menuEnable");
            return (Criteria) this;
        }

        public Criteria andMenuEnableNotIn(List<Integer> values) {
            addCriterion("menu_enable not in", values, "menuEnable");
            return (Criteria) this;
        }

        public Criteria andMenuEnableBetween(Integer value1, Integer value2) {
            addCriterion("menu_enable between", value1, value2, "menuEnable");
            return (Criteria) this;
        }

        public Criteria andMenuEnableNotBetween(Integer value1, Integer value2) {
            addCriterion("menu_enable not between", value1, value2, "menuEnable");
            return (Criteria) this;
        }

        public Criteria andMenuChCodeIsNull() {
            addCriterion("menu_ch_Code is null");
            return (Criteria) this;
        }

        public Criteria andMenuChCodeIsNotNull() {
            addCriterion("menu_ch_Code is not null");
            return (Criteria) this;
        }

        public Criteria andMenuChCodeEqualTo(String value) {
            addCriterion("menu_ch_Code =", value, "menuChCode");
            return (Criteria) this;
        }

        public Criteria andMenuChCodeNotEqualTo(String value) {
            addCriterion("menu_ch_Code <>", value, "menuChCode");
            return (Criteria) this;
        }

        public Criteria andMenuChCodeGreaterThan(String value) {
            addCriterion("menu_ch_Code >", value, "menuChCode");
            return (Criteria) this;
        }

        public Criteria andMenuChCodeGreaterThanOrEqualTo(String value) {
            addCriterion("menu_ch_Code >=", value, "menuChCode");
            return (Criteria) this;
        }

        public Criteria andMenuChCodeLessThan(String value) {
            addCriterion("menu_ch_Code <", value, "menuChCode");
            return (Criteria) this;
        }

        public Criteria andMenuChCodeLessThanOrEqualTo(String value) {
            addCriterion("menu_ch_Code <=", value, "menuChCode");
            return (Criteria) this;
        }

        public Criteria andMenuChCodeLike(String value) {
            addCriterion("menu_ch_Code like", value, "menuChCode");
            return (Criteria) this;
        }

        public Criteria andMenuChCodeNotLike(String value) {
            addCriterion("menu_ch_Code not like", value, "menuChCode");
            return (Criteria) this;
        }

        public Criteria andMenuChCodeIn(List<String> values) {
            addCriterion("menu_ch_Code in", values, "menuChCode");
            return (Criteria) this;
        }

        public Criteria andMenuChCodeNotIn(List<String> values) {
            addCriterion("menu_ch_Code not in", values, "menuChCode");
            return (Criteria) this;
        }

        public Criteria andMenuChCodeBetween(String value1, String value2) {
            addCriterion("menu_ch_Code between", value1, value2, "menuChCode");
            return (Criteria) this;
        }

        public Criteria andMenuChCodeNotBetween(String value1, String value2) {
            addCriterion("menu_ch_Code not between", value1, value2, "menuChCode");
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