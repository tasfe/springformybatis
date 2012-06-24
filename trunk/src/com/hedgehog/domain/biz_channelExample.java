package com.hedgehog.domain;

import java.util.ArrayList;
import java.util.List;

public class biz_channelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public biz_channelExample() {
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

        public Criteria andChannelidIsNull() {
            addCriterion("channelID is null");
            return (Criteria) this;
        }

        public Criteria andChannelidIsNotNull() {
            addCriterion("channelID is not null");
            return (Criteria) this;
        }

        public Criteria andChannelidEqualTo(Integer value) {
            addCriterion("channelID =", value, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidNotEqualTo(Integer value) {
            addCriterion("channelID <>", value, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidGreaterThan(Integer value) {
            addCriterion("channelID >", value, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidGreaterThanOrEqualTo(Integer value) {
            addCriterion("channelID >=", value, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidLessThan(Integer value) {
            addCriterion("channelID <", value, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidLessThanOrEqualTo(Integer value) {
            addCriterion("channelID <=", value, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidIn(List<Integer> values) {
            addCriterion("channelID in", values, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidNotIn(List<Integer> values) {
            addCriterion("channelID not in", values, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidBetween(Integer value1, Integer value2) {
            addCriterion("channelID between", value1, value2, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidNotBetween(Integer value1, Integer value2) {
            addCriterion("channelID not between", value1, value2, "channelid");
            return (Criteria) this;
        }

        public Criteria andChNameIsNull() {
            addCriterion("ch_Name is null");
            return (Criteria) this;
        }

        public Criteria andChNameIsNotNull() {
            addCriterion("ch_Name is not null");
            return (Criteria) this;
        }

        public Criteria andChNameEqualTo(String value) {
            addCriterion("ch_Name =", value, "chName");
            return (Criteria) this;
        }

        public Criteria andChNameNotEqualTo(String value) {
            addCriterion("ch_Name <>", value, "chName");
            return (Criteria) this;
        }

        public Criteria andChNameGreaterThan(String value) {
            addCriterion("ch_Name >", value, "chName");
            return (Criteria) this;
        }

        public Criteria andChNameGreaterThanOrEqualTo(String value) {
            addCriterion("ch_Name >=", value, "chName");
            return (Criteria) this;
        }

        public Criteria andChNameLessThan(String value) {
            addCriterion("ch_Name <", value, "chName");
            return (Criteria) this;
        }

        public Criteria andChNameLessThanOrEqualTo(String value) {
            addCriterion("ch_Name <=", value, "chName");
            return (Criteria) this;
        }

        public Criteria andChNameLike(String value) {
            addCriterion("ch_Name like", value, "chName");
            return (Criteria) this;
        }

        public Criteria andChNameNotLike(String value) {
            addCriterion("ch_Name not like", value, "chName");
            return (Criteria) this;
        }

        public Criteria andChNameIn(List<String> values) {
            addCriterion("ch_Name in", values, "chName");
            return (Criteria) this;
        }

        public Criteria andChNameNotIn(List<String> values) {
            addCriterion("ch_Name not in", values, "chName");
            return (Criteria) this;
        }

        public Criteria andChNameBetween(String value1, String value2) {
            addCriterion("ch_Name between", value1, value2, "chName");
            return (Criteria) this;
        }

        public Criteria andChNameNotBetween(String value1, String value2) {
            addCriterion("ch_Name not between", value1, value2, "chName");
            return (Criteria) this;
        }

        public Criteria andChCodeIsNull() {
            addCriterion("ch_Code is null");
            return (Criteria) this;
        }

        public Criteria andChCodeIsNotNull() {
            addCriterion("ch_Code is not null");
            return (Criteria) this;
        }

        public Criteria andChCodeEqualTo(String value) {
            addCriterion("ch_Code =", value, "chCode");
            return (Criteria) this;
        }

        public Criteria andChCodeNotEqualTo(String value) {
            addCriterion("ch_Code <>", value, "chCode");
            return (Criteria) this;
        }

        public Criteria andChCodeGreaterThan(String value) {
            addCriterion("ch_Code >", value, "chCode");
            return (Criteria) this;
        }

        public Criteria andChCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ch_Code >=", value, "chCode");
            return (Criteria) this;
        }

        public Criteria andChCodeLessThan(String value) {
            addCriterion("ch_Code <", value, "chCode");
            return (Criteria) this;
        }

        public Criteria andChCodeLessThanOrEqualTo(String value) {
            addCriterion("ch_Code <=", value, "chCode");
            return (Criteria) this;
        }

        public Criteria andChCodeLike(String value) {
            addCriterion("ch_Code like", value, "chCode");
            return (Criteria) this;
        }

        public Criteria andChCodeNotLike(String value) {
            addCriterion("ch_Code not like", value, "chCode");
            return (Criteria) this;
        }

        public Criteria andChCodeIn(List<String> values) {
            addCriterion("ch_Code in", values, "chCode");
            return (Criteria) this;
        }

        public Criteria andChCodeNotIn(List<String> values) {
            addCriterion("ch_Code not in", values, "chCode");
            return (Criteria) this;
        }

        public Criteria andChCodeBetween(String value1, String value2) {
            addCriterion("ch_Code between", value1, value2, "chCode");
            return (Criteria) this;
        }

        public Criteria andChCodeNotBetween(String value1, String value2) {
            addCriterion("ch_Code not between", value1, value2, "chCode");
            return (Criteria) this;
        }

        public Criteria andChUrlIsNull() {
            addCriterion("ch_url is null");
            return (Criteria) this;
        }

        public Criteria andChUrlIsNotNull() {
            addCriterion("ch_url is not null");
            return (Criteria) this;
        }

        public Criteria andChUrlEqualTo(String value) {
            addCriterion("ch_url =", value, "chUrl");
            return (Criteria) this;
        }

        public Criteria andChUrlNotEqualTo(String value) {
            addCriterion("ch_url <>", value, "chUrl");
            return (Criteria) this;
        }

        public Criteria andChUrlGreaterThan(String value) {
            addCriterion("ch_url >", value, "chUrl");
            return (Criteria) this;
        }

        public Criteria andChUrlGreaterThanOrEqualTo(String value) {
            addCriterion("ch_url >=", value, "chUrl");
            return (Criteria) this;
        }

        public Criteria andChUrlLessThan(String value) {
            addCriterion("ch_url <", value, "chUrl");
            return (Criteria) this;
        }

        public Criteria andChUrlLessThanOrEqualTo(String value) {
            addCriterion("ch_url <=", value, "chUrl");
            return (Criteria) this;
        }

        public Criteria andChUrlLike(String value) {
            addCriterion("ch_url like", value, "chUrl");
            return (Criteria) this;
        }

        public Criteria andChUrlNotLike(String value) {
            addCriterion("ch_url not like", value, "chUrl");
            return (Criteria) this;
        }

        public Criteria andChUrlIn(List<String> values) {
            addCriterion("ch_url in", values, "chUrl");
            return (Criteria) this;
        }

        public Criteria andChUrlNotIn(List<String> values) {
            addCriterion("ch_url not in", values, "chUrl");
            return (Criteria) this;
        }

        public Criteria andChUrlBetween(String value1, String value2) {
            addCriterion("ch_url between", value1, value2, "chUrl");
            return (Criteria) this;
        }

        public Criteria andChUrlNotBetween(String value1, String value2) {
            addCriterion("ch_url not between", value1, value2, "chUrl");
            return (Criteria) this;
        }

        public Criteria andChEditorIsNull() {
            addCriterion("ch_Editor is null");
            return (Criteria) this;
        }

        public Criteria andChEditorIsNotNull() {
            addCriterion("ch_Editor is not null");
            return (Criteria) this;
        }

        public Criteria andChEditorEqualTo(String value) {
            addCriterion("ch_Editor =", value, "chEditor");
            return (Criteria) this;
        }

        public Criteria andChEditorNotEqualTo(String value) {
            addCriterion("ch_Editor <>", value, "chEditor");
            return (Criteria) this;
        }

        public Criteria andChEditorGreaterThan(String value) {
            addCriterion("ch_Editor >", value, "chEditor");
            return (Criteria) this;
        }

        public Criteria andChEditorGreaterThanOrEqualTo(String value) {
            addCriterion("ch_Editor >=", value, "chEditor");
            return (Criteria) this;
        }

        public Criteria andChEditorLessThan(String value) {
            addCriterion("ch_Editor <", value, "chEditor");
            return (Criteria) this;
        }

        public Criteria andChEditorLessThanOrEqualTo(String value) {
            addCriterion("ch_Editor <=", value, "chEditor");
            return (Criteria) this;
        }

        public Criteria andChEditorLike(String value) {
            addCriterion("ch_Editor like", value, "chEditor");
            return (Criteria) this;
        }

        public Criteria andChEditorNotLike(String value) {
            addCriterion("ch_Editor not like", value, "chEditor");
            return (Criteria) this;
        }

        public Criteria andChEditorIn(List<String> values) {
            addCriterion("ch_Editor in", values, "chEditor");
            return (Criteria) this;
        }

        public Criteria andChEditorNotIn(List<String> values) {
            addCriterion("ch_Editor not in", values, "chEditor");
            return (Criteria) this;
        }

        public Criteria andChEditorBetween(String value1, String value2) {
            addCriterion("ch_Editor between", value1, value2, "chEditor");
            return (Criteria) this;
        }

        public Criteria andChEditorNotBetween(String value1, String value2) {
            addCriterion("ch_Editor not between", value1, value2, "chEditor");
            return (Criteria) this;
        }

        public Criteria andChReadonlyIsNull() {
            addCriterion("ch_Readonly is null");
            return (Criteria) this;
        }

        public Criteria andChReadonlyIsNotNull() {
            addCriterion("ch_Readonly is not null");
            return (Criteria) this;
        }

        public Criteria andChReadonlyEqualTo(Byte value) {
            addCriterion("ch_Readonly =", value, "chReadonly");
            return (Criteria) this;
        }

        public Criteria andChReadonlyNotEqualTo(Byte value) {
            addCriterion("ch_Readonly <>", value, "chReadonly");
            return (Criteria) this;
        }

        public Criteria andChReadonlyGreaterThan(Byte value) {
            addCriterion("ch_Readonly >", value, "chReadonly");
            return (Criteria) this;
        }

        public Criteria andChReadonlyGreaterThanOrEqualTo(Byte value) {
            addCriterion("ch_Readonly >=", value, "chReadonly");
            return (Criteria) this;
        }

        public Criteria andChReadonlyLessThan(Byte value) {
            addCriterion("ch_Readonly <", value, "chReadonly");
            return (Criteria) this;
        }

        public Criteria andChReadonlyLessThanOrEqualTo(Byte value) {
            addCriterion("ch_Readonly <=", value, "chReadonly");
            return (Criteria) this;
        }

        public Criteria andChReadonlyIn(List<Byte> values) {
            addCriterion("ch_Readonly in", values, "chReadonly");
            return (Criteria) this;
        }

        public Criteria andChReadonlyNotIn(List<Byte> values) {
            addCriterion("ch_Readonly not in", values, "chReadonly");
            return (Criteria) this;
        }

        public Criteria andChReadonlyBetween(Byte value1, Byte value2) {
            addCriterion("ch_Readonly between", value1, value2, "chReadonly");
            return (Criteria) this;
        }

        public Criteria andChReadonlyNotBetween(Byte value1, Byte value2) {
            addCriterion("ch_Readonly not between", value1, value2, "chReadonly");
            return (Criteria) this;
        }

        public Criteria andChHavesubIsNull() {
            addCriterion("ch_Havesub is null");
            return (Criteria) this;
        }

        public Criteria andChHavesubIsNotNull() {
            addCriterion("ch_Havesub is not null");
            return (Criteria) this;
        }

        public Criteria andChHavesubEqualTo(String value) {
            addCriterion("ch_Havesub =", value, "chHavesub");
            return (Criteria) this;
        }

        public Criteria andChHavesubNotEqualTo(String value) {
            addCriterion("ch_Havesub <>", value, "chHavesub");
            return (Criteria) this;
        }

        public Criteria andChHavesubGreaterThan(String value) {
            addCriterion("ch_Havesub >", value, "chHavesub");
            return (Criteria) this;
        }

        public Criteria andChHavesubGreaterThanOrEqualTo(String value) {
            addCriterion("ch_Havesub >=", value, "chHavesub");
            return (Criteria) this;
        }

        public Criteria andChHavesubLessThan(String value) {
            addCriterion("ch_Havesub <", value, "chHavesub");
            return (Criteria) this;
        }

        public Criteria andChHavesubLessThanOrEqualTo(String value) {
            addCriterion("ch_Havesub <=", value, "chHavesub");
            return (Criteria) this;
        }

        public Criteria andChHavesubLike(String value) {
            addCriterion("ch_Havesub like", value, "chHavesub");
            return (Criteria) this;
        }

        public Criteria andChHavesubNotLike(String value) {
            addCriterion("ch_Havesub not like", value, "chHavesub");
            return (Criteria) this;
        }

        public Criteria andChHavesubIn(List<String> values) {
            addCriterion("ch_Havesub in", values, "chHavesub");
            return (Criteria) this;
        }

        public Criteria andChHavesubNotIn(List<String> values) {
            addCriterion("ch_Havesub not in", values, "chHavesub");
            return (Criteria) this;
        }

        public Criteria andChHavesubBetween(String value1, String value2) {
            addCriterion("ch_Havesub between", value1, value2, "chHavesub");
            return (Criteria) this;
        }

        public Criteria andChHavesubNotBetween(String value1, String value2) {
            addCriterion("ch_Havesub not between", value1, value2, "chHavesub");
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