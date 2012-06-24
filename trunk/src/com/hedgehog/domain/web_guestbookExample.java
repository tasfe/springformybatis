package com.hedgehog.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class web_guestbookExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public web_guestbookExample() {
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

        public Criteria andGuestbookidIsNull() {
            addCriterion("guestbookID is null");
            return (Criteria) this;
        }

        public Criteria andGuestbookidIsNotNull() {
            addCriterion("guestbookID is not null");
            return (Criteria) this;
        }

        public Criteria andGuestbookidEqualTo(Integer value) {
            addCriterion("guestbookID =", value, "guestbookid");
            return (Criteria) this;
        }

        public Criteria andGuestbookidNotEqualTo(Integer value) {
            addCriterion("guestbookID <>", value, "guestbookid");
            return (Criteria) this;
        }

        public Criteria andGuestbookidGreaterThan(Integer value) {
            addCriterion("guestbookID >", value, "guestbookid");
            return (Criteria) this;
        }

        public Criteria andGuestbookidGreaterThanOrEqualTo(Integer value) {
            addCriterion("guestbookID >=", value, "guestbookid");
            return (Criteria) this;
        }

        public Criteria andGuestbookidLessThan(Integer value) {
            addCriterion("guestbookID <", value, "guestbookid");
            return (Criteria) this;
        }

        public Criteria andGuestbookidLessThanOrEqualTo(Integer value) {
            addCriterion("guestbookID <=", value, "guestbookid");
            return (Criteria) this;
        }

        public Criteria andGuestbookidIn(List<Integer> values) {
            addCriterion("guestbookID in", values, "guestbookid");
            return (Criteria) this;
        }

        public Criteria andGuestbookidNotIn(List<Integer> values) {
            addCriterion("guestbookID not in", values, "guestbookid");
            return (Criteria) this;
        }

        public Criteria andGuestbookidBetween(Integer value1, Integer value2) {
            addCriterion("guestbookID between", value1, value2, "guestbookid");
            return (Criteria) this;
        }

        public Criteria andGuestbookidNotBetween(Integer value1, Integer value2) {
            addCriterion("guestbookID not between", value1, value2, "guestbookid");
            return (Criteria) this;
        }

        public Criteria andGbNikenameIsNull() {
            addCriterion("gb_nikename is null");
            return (Criteria) this;
        }

        public Criteria andGbNikenameIsNotNull() {
            addCriterion("gb_nikename is not null");
            return (Criteria) this;
        }

        public Criteria andGbNikenameEqualTo(String value) {
            addCriterion("gb_nikename =", value, "gbNikename");
            return (Criteria) this;
        }

        public Criteria andGbNikenameNotEqualTo(String value) {
            addCriterion("gb_nikename <>", value, "gbNikename");
            return (Criteria) this;
        }

        public Criteria andGbNikenameGreaterThan(String value) {
            addCriterion("gb_nikename >", value, "gbNikename");
            return (Criteria) this;
        }

        public Criteria andGbNikenameGreaterThanOrEqualTo(String value) {
            addCriterion("gb_nikename >=", value, "gbNikename");
            return (Criteria) this;
        }

        public Criteria andGbNikenameLessThan(String value) {
            addCriterion("gb_nikename <", value, "gbNikename");
            return (Criteria) this;
        }

        public Criteria andGbNikenameLessThanOrEqualTo(String value) {
            addCriterion("gb_nikename <=", value, "gbNikename");
            return (Criteria) this;
        }

        public Criteria andGbNikenameLike(String value) {
            addCriterion("gb_nikename like", value, "gbNikename");
            return (Criteria) this;
        }

        public Criteria andGbNikenameNotLike(String value) {
            addCriterion("gb_nikename not like", value, "gbNikename");
            return (Criteria) this;
        }

        public Criteria andGbNikenameIn(List<String> values) {
            addCriterion("gb_nikename in", values, "gbNikename");
            return (Criteria) this;
        }

        public Criteria andGbNikenameNotIn(List<String> values) {
            addCriterion("gb_nikename not in", values, "gbNikename");
            return (Criteria) this;
        }

        public Criteria andGbNikenameBetween(String value1, String value2) {
            addCriterion("gb_nikename between", value1, value2, "gbNikename");
            return (Criteria) this;
        }

        public Criteria andGbNikenameNotBetween(String value1, String value2) {
            addCriterion("gb_nikename not between", value1, value2, "gbNikename");
            return (Criteria) this;
        }

        public Criteria andGbContentIsNull() {
            addCriterion("gb_content is null");
            return (Criteria) this;
        }

        public Criteria andGbContentIsNotNull() {
            addCriterion("gb_content is not null");
            return (Criteria) this;
        }

        public Criteria andGbContentEqualTo(String value) {
            addCriterion("gb_content =", value, "gbContent");
            return (Criteria) this;
        }

        public Criteria andGbContentNotEqualTo(String value) {
            addCriterion("gb_content <>", value, "gbContent");
            return (Criteria) this;
        }

        public Criteria andGbContentGreaterThan(String value) {
            addCriterion("gb_content >", value, "gbContent");
            return (Criteria) this;
        }

        public Criteria andGbContentGreaterThanOrEqualTo(String value) {
            addCriterion("gb_content >=", value, "gbContent");
            return (Criteria) this;
        }

        public Criteria andGbContentLessThan(String value) {
            addCriterion("gb_content <", value, "gbContent");
            return (Criteria) this;
        }

        public Criteria andGbContentLessThanOrEqualTo(String value) {
            addCriterion("gb_content <=", value, "gbContent");
            return (Criteria) this;
        }

        public Criteria andGbContentLike(String value) {
            addCriterion("gb_content like", value, "gbContent");
            return (Criteria) this;
        }

        public Criteria andGbContentNotLike(String value) {
            addCriterion("gb_content not like", value, "gbContent");
            return (Criteria) this;
        }

        public Criteria andGbContentIn(List<String> values) {
            addCriterion("gb_content in", values, "gbContent");
            return (Criteria) this;
        }

        public Criteria andGbContentNotIn(List<String> values) {
            addCriterion("gb_content not in", values, "gbContent");
            return (Criteria) this;
        }

        public Criteria andGbContentBetween(String value1, String value2) {
            addCriterion("gb_content between", value1, value2, "gbContent");
            return (Criteria) this;
        }

        public Criteria andGbContentNotBetween(String value1, String value2) {
            addCriterion("gb_content not between", value1, value2, "gbContent");
            return (Criteria) this;
        }

        public Criteria andGbDatetimeIsNull() {
            addCriterion("gb_datetime is null");
            return (Criteria) this;
        }

        public Criteria andGbDatetimeIsNotNull() {
            addCriterion("gb_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andGbDatetimeEqualTo(Date value) {
            addCriterion("gb_datetime =", value, "gbDatetime");
            return (Criteria) this;
        }

        public Criteria andGbDatetimeNotEqualTo(Date value) {
            addCriterion("gb_datetime <>", value, "gbDatetime");
            return (Criteria) this;
        }

        public Criteria andGbDatetimeGreaterThan(Date value) {
            addCriterion("gb_datetime >", value, "gbDatetime");
            return (Criteria) this;
        }

        public Criteria andGbDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("gb_datetime >=", value, "gbDatetime");
            return (Criteria) this;
        }

        public Criteria andGbDatetimeLessThan(Date value) {
            addCriterion("gb_datetime <", value, "gbDatetime");
            return (Criteria) this;
        }

        public Criteria andGbDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("gb_datetime <=", value, "gbDatetime");
            return (Criteria) this;
        }

        public Criteria andGbDatetimeIn(List<Date> values) {
            addCriterion("gb_datetime in", values, "gbDatetime");
            return (Criteria) this;
        }

        public Criteria andGbDatetimeNotIn(List<Date> values) {
            addCriterion("gb_datetime not in", values, "gbDatetime");
            return (Criteria) this;
        }

        public Criteria andGbDatetimeBetween(Date value1, Date value2) {
            addCriterion("gb_datetime between", value1, value2, "gbDatetime");
            return (Criteria) this;
        }

        public Criteria andGbDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("gb_datetime not between", value1, value2, "gbDatetime");
            return (Criteria) this;
        }

        public Criteria andGbClientipIsNull() {
            addCriterion("gb_clientip is null");
            return (Criteria) this;
        }

        public Criteria andGbClientipIsNotNull() {
            addCriterion("gb_clientip is not null");
            return (Criteria) this;
        }

        public Criteria andGbClientipEqualTo(String value) {
            addCriterion("gb_clientip =", value, "gbClientip");
            return (Criteria) this;
        }

        public Criteria andGbClientipNotEqualTo(String value) {
            addCriterion("gb_clientip <>", value, "gbClientip");
            return (Criteria) this;
        }

        public Criteria andGbClientipGreaterThan(String value) {
            addCriterion("gb_clientip >", value, "gbClientip");
            return (Criteria) this;
        }

        public Criteria andGbClientipGreaterThanOrEqualTo(String value) {
            addCriterion("gb_clientip >=", value, "gbClientip");
            return (Criteria) this;
        }

        public Criteria andGbClientipLessThan(String value) {
            addCriterion("gb_clientip <", value, "gbClientip");
            return (Criteria) this;
        }

        public Criteria andGbClientipLessThanOrEqualTo(String value) {
            addCriterion("gb_clientip <=", value, "gbClientip");
            return (Criteria) this;
        }

        public Criteria andGbClientipLike(String value) {
            addCriterion("gb_clientip like", value, "gbClientip");
            return (Criteria) this;
        }

        public Criteria andGbClientipNotLike(String value) {
            addCriterion("gb_clientip not like", value, "gbClientip");
            return (Criteria) this;
        }

        public Criteria andGbClientipIn(List<String> values) {
            addCriterion("gb_clientip in", values, "gbClientip");
            return (Criteria) this;
        }

        public Criteria andGbClientipNotIn(List<String> values) {
            addCriterion("gb_clientip not in", values, "gbClientip");
            return (Criteria) this;
        }

        public Criteria andGbClientipBetween(String value1, String value2) {
            addCriterion("gb_clientip between", value1, value2, "gbClientip");
            return (Criteria) this;
        }

        public Criteria andGbClientipNotBetween(String value1, String value2) {
            addCriterion("gb_clientip not between", value1, value2, "gbClientip");
            return (Criteria) this;
        }

        public Criteria andGbMenuidIsNull() {
            addCriterion("gb_menuID is null");
            return (Criteria) this;
        }

        public Criteria andGbMenuidIsNotNull() {
            addCriterion("gb_menuID is not null");
            return (Criteria) this;
        }

        public Criteria andGbMenuidEqualTo(Integer value) {
            addCriterion("gb_menuID =", value, "gbMenuid");
            return (Criteria) this;
        }

        public Criteria andGbMenuidNotEqualTo(Integer value) {
            addCriterion("gb_menuID <>", value, "gbMenuid");
            return (Criteria) this;
        }

        public Criteria andGbMenuidGreaterThan(Integer value) {
            addCriterion("gb_menuID >", value, "gbMenuid");
            return (Criteria) this;
        }

        public Criteria andGbMenuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("gb_menuID >=", value, "gbMenuid");
            return (Criteria) this;
        }

        public Criteria andGbMenuidLessThan(Integer value) {
            addCriterion("gb_menuID <", value, "gbMenuid");
            return (Criteria) this;
        }

        public Criteria andGbMenuidLessThanOrEqualTo(Integer value) {
            addCriterion("gb_menuID <=", value, "gbMenuid");
            return (Criteria) this;
        }

        public Criteria andGbMenuidIn(List<Integer> values) {
            addCriterion("gb_menuID in", values, "gbMenuid");
            return (Criteria) this;
        }

        public Criteria andGbMenuidNotIn(List<Integer> values) {
            addCriterion("gb_menuID not in", values, "gbMenuid");
            return (Criteria) this;
        }

        public Criteria andGbMenuidBetween(Integer value1, Integer value2) {
            addCriterion("gb_menuID between", value1, value2, "gbMenuid");
            return (Criteria) this;
        }

        public Criteria andGbMenuidNotBetween(Integer value1, Integer value2) {
            addCriterion("gb_menuID not between", value1, value2, "gbMenuid");
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