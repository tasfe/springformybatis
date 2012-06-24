package com.hedgehog.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class biz_AdviseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public biz_AdviseExample() {
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

        public Criteria andAdviseidIsNull() {
            addCriterion("AdviseID is null");
            return (Criteria) this;
        }

        public Criteria andAdviseidIsNotNull() {
            addCriterion("AdviseID is not null");
            return (Criteria) this;
        }

        public Criteria andAdviseidEqualTo(Integer value) {
            addCriterion("AdviseID =", value, "adviseid");
            return (Criteria) this;
        }

        public Criteria andAdviseidNotEqualTo(Integer value) {
            addCriterion("AdviseID <>", value, "adviseid");
            return (Criteria) this;
        }

        public Criteria andAdviseidGreaterThan(Integer value) {
            addCriterion("AdviseID >", value, "adviseid");
            return (Criteria) this;
        }

        public Criteria andAdviseidGreaterThanOrEqualTo(Integer value) {
            addCriterion("AdviseID >=", value, "adviseid");
            return (Criteria) this;
        }

        public Criteria andAdviseidLessThan(Integer value) {
            addCriterion("AdviseID <", value, "adviseid");
            return (Criteria) this;
        }

        public Criteria andAdviseidLessThanOrEqualTo(Integer value) {
            addCriterion("AdviseID <=", value, "adviseid");
            return (Criteria) this;
        }

        public Criteria andAdviseidIn(List<Integer> values) {
            addCriterion("AdviseID in", values, "adviseid");
            return (Criteria) this;
        }

        public Criteria andAdviseidNotIn(List<Integer> values) {
            addCriterion("AdviseID not in", values, "adviseid");
            return (Criteria) this;
        }

        public Criteria andAdviseidBetween(Integer value1, Integer value2) {
            addCriterion("AdviseID between", value1, value2, "adviseid");
            return (Criteria) this;
        }

        public Criteria andAdviseidNotBetween(Integer value1, Integer value2) {
            addCriterion("AdviseID not between", value1, value2, "adviseid");
            return (Criteria) this;
        }

        public Criteria andAdviseNameIsNull() {
            addCriterion("Advise_name is null");
            return (Criteria) this;
        }

        public Criteria andAdviseNameIsNotNull() {
            addCriterion("Advise_name is not null");
            return (Criteria) this;
        }

        public Criteria andAdviseNameEqualTo(String value) {
            addCriterion("Advise_name =", value, "adviseName");
            return (Criteria) this;
        }

        public Criteria andAdviseNameNotEqualTo(String value) {
            addCriterion("Advise_name <>", value, "adviseName");
            return (Criteria) this;
        }

        public Criteria andAdviseNameGreaterThan(String value) {
            addCriterion("Advise_name >", value, "adviseName");
            return (Criteria) this;
        }

        public Criteria andAdviseNameGreaterThanOrEqualTo(String value) {
            addCriterion("Advise_name >=", value, "adviseName");
            return (Criteria) this;
        }

        public Criteria andAdviseNameLessThan(String value) {
            addCriterion("Advise_name <", value, "adviseName");
            return (Criteria) this;
        }

        public Criteria andAdviseNameLessThanOrEqualTo(String value) {
            addCriterion("Advise_name <=", value, "adviseName");
            return (Criteria) this;
        }

        public Criteria andAdviseNameLike(String value) {
            addCriterion("Advise_name like", value, "adviseName");
            return (Criteria) this;
        }

        public Criteria andAdviseNameNotLike(String value) {
            addCriterion("Advise_name not like", value, "adviseName");
            return (Criteria) this;
        }

        public Criteria andAdviseNameIn(List<String> values) {
            addCriterion("Advise_name in", values, "adviseName");
            return (Criteria) this;
        }

        public Criteria andAdviseNameNotIn(List<String> values) {
            addCriterion("Advise_name not in", values, "adviseName");
            return (Criteria) this;
        }

        public Criteria andAdviseNameBetween(String value1, String value2) {
            addCriterion("Advise_name between", value1, value2, "adviseName");
            return (Criteria) this;
        }

        public Criteria andAdviseNameNotBetween(String value1, String value2) {
            addCriterion("Advise_name not between", value1, value2, "adviseName");
            return (Criteria) this;
        }

        public Criteria andAdviseAdminflagIsNull() {
            addCriterion("Advise_Adminflag is null");
            return (Criteria) this;
        }

        public Criteria andAdviseAdminflagIsNotNull() {
            addCriterion("Advise_Adminflag is not null");
            return (Criteria) this;
        }

        public Criteria andAdviseAdminflagEqualTo(Integer value) {
            addCriterion("Advise_Adminflag =", value, "adviseAdminflag");
            return (Criteria) this;
        }

        public Criteria andAdviseAdminflagNotEqualTo(Integer value) {
            addCriterion("Advise_Adminflag <>", value, "adviseAdminflag");
            return (Criteria) this;
        }

        public Criteria andAdviseAdminflagGreaterThan(Integer value) {
            addCriterion("Advise_Adminflag >", value, "adviseAdminflag");
            return (Criteria) this;
        }

        public Criteria andAdviseAdminflagGreaterThanOrEqualTo(Integer value) {
            addCriterion("Advise_Adminflag >=", value, "adviseAdminflag");
            return (Criteria) this;
        }

        public Criteria andAdviseAdminflagLessThan(Integer value) {
            addCriterion("Advise_Adminflag <", value, "adviseAdminflag");
            return (Criteria) this;
        }

        public Criteria andAdviseAdminflagLessThanOrEqualTo(Integer value) {
            addCriterion("Advise_Adminflag <=", value, "adviseAdminflag");
            return (Criteria) this;
        }

        public Criteria andAdviseAdminflagIn(List<Integer> values) {
            addCriterion("Advise_Adminflag in", values, "adviseAdminflag");
            return (Criteria) this;
        }

        public Criteria andAdviseAdminflagNotIn(List<Integer> values) {
            addCriterion("Advise_Adminflag not in", values, "adviseAdminflag");
            return (Criteria) this;
        }

        public Criteria andAdviseAdminflagBetween(Integer value1, Integer value2) {
            addCriterion("Advise_Adminflag between", value1, value2, "adviseAdminflag");
            return (Criteria) this;
        }

        public Criteria andAdviseAdminflagNotBetween(Integer value1, Integer value2) {
            addCriterion("Advise_Adminflag not between", value1, value2, "adviseAdminflag");
            return (Criteria) this;
        }

        public Criteria andAdviseTitleIsNull() {
            addCriterion("Advise_title is null");
            return (Criteria) this;
        }

        public Criteria andAdviseTitleIsNotNull() {
            addCriterion("Advise_title is not null");
            return (Criteria) this;
        }

        public Criteria andAdviseTitleEqualTo(String value) {
            addCriterion("Advise_title =", value, "adviseTitle");
            return (Criteria) this;
        }

        public Criteria andAdviseTitleNotEqualTo(String value) {
            addCriterion("Advise_title <>", value, "adviseTitle");
            return (Criteria) this;
        }

        public Criteria andAdviseTitleGreaterThan(String value) {
            addCriterion("Advise_title >", value, "adviseTitle");
            return (Criteria) this;
        }

        public Criteria andAdviseTitleGreaterThanOrEqualTo(String value) {
            addCriterion("Advise_title >=", value, "adviseTitle");
            return (Criteria) this;
        }

        public Criteria andAdviseTitleLessThan(String value) {
            addCriterion("Advise_title <", value, "adviseTitle");
            return (Criteria) this;
        }

        public Criteria andAdviseTitleLessThanOrEqualTo(String value) {
            addCriterion("Advise_title <=", value, "adviseTitle");
            return (Criteria) this;
        }

        public Criteria andAdviseTitleLike(String value) {
            addCriterion("Advise_title like", value, "adviseTitle");
            return (Criteria) this;
        }

        public Criteria andAdviseTitleNotLike(String value) {
            addCriterion("Advise_title not like", value, "adviseTitle");
            return (Criteria) this;
        }

        public Criteria andAdviseTitleIn(List<String> values) {
            addCriterion("Advise_title in", values, "adviseTitle");
            return (Criteria) this;
        }

        public Criteria andAdviseTitleNotIn(List<String> values) {
            addCriterion("Advise_title not in", values, "adviseTitle");
            return (Criteria) this;
        }

        public Criteria andAdviseTitleBetween(String value1, String value2) {
            addCriterion("Advise_title between", value1, value2, "adviseTitle");
            return (Criteria) this;
        }

        public Criteria andAdviseTitleNotBetween(String value1, String value2) {
            addCriterion("Advise_title not between", value1, value2, "adviseTitle");
            return (Criteria) this;
        }

        public Criteria andAdviseAddateIsNull() {
            addCriterion("Advise_addate is null");
            return (Criteria) this;
        }

        public Criteria andAdviseAddateIsNotNull() {
            addCriterion("Advise_addate is not null");
            return (Criteria) this;
        }

        public Criteria andAdviseAddateEqualTo(Date value) {
            addCriterion("Advise_addate =", value, "adviseAddate");
            return (Criteria) this;
        }

        public Criteria andAdviseAddateNotEqualTo(Date value) {
            addCriterion("Advise_addate <>", value, "adviseAddate");
            return (Criteria) this;
        }

        public Criteria andAdviseAddateGreaterThan(Date value) {
            addCriterion("Advise_addate >", value, "adviseAddate");
            return (Criteria) this;
        }

        public Criteria andAdviseAddateGreaterThanOrEqualTo(Date value) {
            addCriterion("Advise_addate >=", value, "adviseAddate");
            return (Criteria) this;
        }

        public Criteria andAdviseAddateLessThan(Date value) {
            addCriterion("Advise_addate <", value, "adviseAddate");
            return (Criteria) this;
        }

        public Criteria andAdviseAddateLessThanOrEqualTo(Date value) {
            addCriterion("Advise_addate <=", value, "adviseAddate");
            return (Criteria) this;
        }

        public Criteria andAdviseAddateIn(List<Date> values) {
            addCriterion("Advise_addate in", values, "adviseAddate");
            return (Criteria) this;
        }

        public Criteria andAdviseAddateNotIn(List<Date> values) {
            addCriterion("Advise_addate not in", values, "adviseAddate");
            return (Criteria) this;
        }

        public Criteria andAdviseAddateBetween(Date value1, Date value2) {
            addCriterion("Advise_addate between", value1, value2, "adviseAddate");
            return (Criteria) this;
        }

        public Criteria andAdviseAddateNotBetween(Date value1, Date value2) {
            addCriterion("Advise_addate not between", value1, value2, "adviseAddate");
            return (Criteria) this;
        }

        public Criteria andAdviseIsreadIsNull() {
            addCriterion("Advise_isRead is null");
            return (Criteria) this;
        }

        public Criteria andAdviseIsreadIsNotNull() {
            addCriterion("Advise_isRead is not null");
            return (Criteria) this;
        }

        public Criteria andAdviseIsreadEqualTo(Byte value) {
            addCriterion("Advise_isRead =", value, "adviseIsread");
            return (Criteria) this;
        }

        public Criteria andAdviseIsreadNotEqualTo(Byte value) {
            addCriterion("Advise_isRead <>", value, "adviseIsread");
            return (Criteria) this;
        }

        public Criteria andAdviseIsreadGreaterThan(Byte value) {
            addCriterion("Advise_isRead >", value, "adviseIsread");
            return (Criteria) this;
        }

        public Criteria andAdviseIsreadGreaterThanOrEqualTo(Byte value) {
            addCriterion("Advise_isRead >=", value, "adviseIsread");
            return (Criteria) this;
        }

        public Criteria andAdviseIsreadLessThan(Byte value) {
            addCriterion("Advise_isRead <", value, "adviseIsread");
            return (Criteria) this;
        }

        public Criteria andAdviseIsreadLessThanOrEqualTo(Byte value) {
            addCriterion("Advise_isRead <=", value, "adviseIsread");
            return (Criteria) this;
        }

        public Criteria andAdviseIsreadIn(List<Byte> values) {
            addCriterion("Advise_isRead in", values, "adviseIsread");
            return (Criteria) this;
        }

        public Criteria andAdviseIsreadNotIn(List<Byte> values) {
            addCriterion("Advise_isRead not in", values, "adviseIsread");
            return (Criteria) this;
        }

        public Criteria andAdviseIsreadBetween(Byte value1, Byte value2) {
            addCriterion("Advise_isRead between", value1, value2, "adviseIsread");
            return (Criteria) this;
        }

        public Criteria andAdviseIsreadNotBetween(Byte value1, Byte value2) {
            addCriterion("Advise_isRead not between", value1, value2, "adviseIsread");
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