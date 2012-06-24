package com.hedgehog.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class biz_replyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public biz_replyExample() {
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

        public Criteria andReplyidIsNull() {
            addCriterion("replyID is null");
            return (Criteria) this;
        }

        public Criteria andReplyidIsNotNull() {
            addCriterion("replyID is not null");
            return (Criteria) this;
        }

        public Criteria andReplyidEqualTo(Integer value) {
            addCriterion("replyID =", value, "replyid");
            return (Criteria) this;
        }

        public Criteria andReplyidNotEqualTo(Integer value) {
            addCriterion("replyID <>", value, "replyid");
            return (Criteria) this;
        }

        public Criteria andReplyidGreaterThan(Integer value) {
            addCriterion("replyID >", value, "replyid");
            return (Criteria) this;
        }

        public Criteria andReplyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("replyID >=", value, "replyid");
            return (Criteria) this;
        }

        public Criteria andReplyidLessThan(Integer value) {
            addCriterion("replyID <", value, "replyid");
            return (Criteria) this;
        }

        public Criteria andReplyidLessThanOrEqualTo(Integer value) {
            addCriterion("replyID <=", value, "replyid");
            return (Criteria) this;
        }

        public Criteria andReplyidIn(List<Integer> values) {
            addCriterion("replyID in", values, "replyid");
            return (Criteria) this;
        }

        public Criteria andReplyidNotIn(List<Integer> values) {
            addCriterion("replyID not in", values, "replyid");
            return (Criteria) this;
        }

        public Criteria andReplyidBetween(Integer value1, Integer value2) {
            addCriterion("replyID between", value1, value2, "replyid");
            return (Criteria) this;
        }

        public Criteria andReplyidNotBetween(Integer value1, Integer value2) {
            addCriterion("replyID not between", value1, value2, "replyid");
            return (Criteria) this;
        }

        public Criteria andReplyInfoidIsNull() {
            addCriterion("reply_infoID is null");
            return (Criteria) this;
        }

        public Criteria andReplyInfoidIsNotNull() {
            addCriterion("reply_infoID is not null");
            return (Criteria) this;
        }

        public Criteria andReplyInfoidEqualTo(Integer value) {
            addCriterion("reply_infoID =", value, "replyInfoid");
            return (Criteria) this;
        }

        public Criteria andReplyInfoidNotEqualTo(Integer value) {
            addCriterion("reply_infoID <>", value, "replyInfoid");
            return (Criteria) this;
        }

        public Criteria andReplyInfoidGreaterThan(Integer value) {
            addCriterion("reply_infoID >", value, "replyInfoid");
            return (Criteria) this;
        }

        public Criteria andReplyInfoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("reply_infoID >=", value, "replyInfoid");
            return (Criteria) this;
        }

        public Criteria andReplyInfoidLessThan(Integer value) {
            addCriterion("reply_infoID <", value, "replyInfoid");
            return (Criteria) this;
        }

        public Criteria andReplyInfoidLessThanOrEqualTo(Integer value) {
            addCriterion("reply_infoID <=", value, "replyInfoid");
            return (Criteria) this;
        }

        public Criteria andReplyInfoidIn(List<Integer> values) {
            addCriterion("reply_infoID in", values, "replyInfoid");
            return (Criteria) this;
        }

        public Criteria andReplyInfoidNotIn(List<Integer> values) {
            addCriterion("reply_infoID not in", values, "replyInfoid");
            return (Criteria) this;
        }

        public Criteria andReplyInfoidBetween(Integer value1, Integer value2) {
            addCriterion("reply_infoID between", value1, value2, "replyInfoid");
            return (Criteria) this;
        }

        public Criteria andReplyInfoidNotBetween(Integer value1, Integer value2) {
            addCriterion("reply_infoID not between", value1, value2, "replyInfoid");
            return (Criteria) this;
        }

        public Criteria andReplyNikenameIsNull() {
            addCriterion("reply_nikename is null");
            return (Criteria) this;
        }

        public Criteria andReplyNikenameIsNotNull() {
            addCriterion("reply_nikename is not null");
            return (Criteria) this;
        }

        public Criteria andReplyNikenameEqualTo(String value) {
            addCriterion("reply_nikename =", value, "replyNikename");
            return (Criteria) this;
        }

        public Criteria andReplyNikenameNotEqualTo(String value) {
            addCriterion("reply_nikename <>", value, "replyNikename");
            return (Criteria) this;
        }

        public Criteria andReplyNikenameGreaterThan(String value) {
            addCriterion("reply_nikename >", value, "replyNikename");
            return (Criteria) this;
        }

        public Criteria andReplyNikenameGreaterThanOrEqualTo(String value) {
            addCriterion("reply_nikename >=", value, "replyNikename");
            return (Criteria) this;
        }

        public Criteria andReplyNikenameLessThan(String value) {
            addCriterion("reply_nikename <", value, "replyNikename");
            return (Criteria) this;
        }

        public Criteria andReplyNikenameLessThanOrEqualTo(String value) {
            addCriterion("reply_nikename <=", value, "replyNikename");
            return (Criteria) this;
        }

        public Criteria andReplyNikenameLike(String value) {
            addCriterion("reply_nikename like", value, "replyNikename");
            return (Criteria) this;
        }

        public Criteria andReplyNikenameNotLike(String value) {
            addCriterion("reply_nikename not like", value, "replyNikename");
            return (Criteria) this;
        }

        public Criteria andReplyNikenameIn(List<String> values) {
            addCriterion("reply_nikename in", values, "replyNikename");
            return (Criteria) this;
        }

        public Criteria andReplyNikenameNotIn(List<String> values) {
            addCriterion("reply_nikename not in", values, "replyNikename");
            return (Criteria) this;
        }

        public Criteria andReplyNikenameBetween(String value1, String value2) {
            addCriterion("reply_nikename between", value1, value2, "replyNikename");
            return (Criteria) this;
        }

        public Criteria andReplyNikenameNotBetween(String value1, String value2) {
            addCriterion("reply_nikename not between", value1, value2, "replyNikename");
            return (Criteria) this;
        }

        public Criteria andReplyEmailIsNull() {
            addCriterion("reply_email is null");
            return (Criteria) this;
        }

        public Criteria andReplyEmailIsNotNull() {
            addCriterion("reply_email is not null");
            return (Criteria) this;
        }

        public Criteria andReplyEmailEqualTo(String value) {
            addCriterion("reply_email =", value, "replyEmail");
            return (Criteria) this;
        }

        public Criteria andReplyEmailNotEqualTo(String value) {
            addCriterion("reply_email <>", value, "replyEmail");
            return (Criteria) this;
        }

        public Criteria andReplyEmailGreaterThan(String value) {
            addCriterion("reply_email >", value, "replyEmail");
            return (Criteria) this;
        }

        public Criteria andReplyEmailGreaterThanOrEqualTo(String value) {
            addCriterion("reply_email >=", value, "replyEmail");
            return (Criteria) this;
        }

        public Criteria andReplyEmailLessThan(String value) {
            addCriterion("reply_email <", value, "replyEmail");
            return (Criteria) this;
        }

        public Criteria andReplyEmailLessThanOrEqualTo(String value) {
            addCriterion("reply_email <=", value, "replyEmail");
            return (Criteria) this;
        }

        public Criteria andReplyEmailLike(String value) {
            addCriterion("reply_email like", value, "replyEmail");
            return (Criteria) this;
        }

        public Criteria andReplyEmailNotLike(String value) {
            addCriterion("reply_email not like", value, "replyEmail");
            return (Criteria) this;
        }

        public Criteria andReplyEmailIn(List<String> values) {
            addCriterion("reply_email in", values, "replyEmail");
            return (Criteria) this;
        }

        public Criteria andReplyEmailNotIn(List<String> values) {
            addCriterion("reply_email not in", values, "replyEmail");
            return (Criteria) this;
        }

        public Criteria andReplyEmailBetween(String value1, String value2) {
            addCriterion("reply_email between", value1, value2, "replyEmail");
            return (Criteria) this;
        }

        public Criteria andReplyEmailNotBetween(String value1, String value2) {
            addCriterion("reply_email not between", value1, value2, "replyEmail");
            return (Criteria) this;
        }

        public Criteria andReplyDatetimeIsNull() {
            addCriterion("reply_datetime is null");
            return (Criteria) this;
        }

        public Criteria andReplyDatetimeIsNotNull() {
            addCriterion("reply_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andReplyDatetimeEqualTo(Date value) {
            addCriterion("reply_datetime =", value, "replyDatetime");
            return (Criteria) this;
        }

        public Criteria andReplyDatetimeNotEqualTo(Date value) {
            addCriterion("reply_datetime <>", value, "replyDatetime");
            return (Criteria) this;
        }

        public Criteria andReplyDatetimeGreaterThan(Date value) {
            addCriterion("reply_datetime >", value, "replyDatetime");
            return (Criteria) this;
        }

        public Criteria andReplyDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("reply_datetime >=", value, "replyDatetime");
            return (Criteria) this;
        }

        public Criteria andReplyDatetimeLessThan(Date value) {
            addCriterion("reply_datetime <", value, "replyDatetime");
            return (Criteria) this;
        }

        public Criteria andReplyDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("reply_datetime <=", value, "replyDatetime");
            return (Criteria) this;
        }

        public Criteria andReplyDatetimeIn(List<Date> values) {
            addCriterion("reply_datetime in", values, "replyDatetime");
            return (Criteria) this;
        }

        public Criteria andReplyDatetimeNotIn(List<Date> values) {
            addCriterion("reply_datetime not in", values, "replyDatetime");
            return (Criteria) this;
        }

        public Criteria andReplyDatetimeBetween(Date value1, Date value2) {
            addCriterion("reply_datetime between", value1, value2, "replyDatetime");
            return (Criteria) this;
        }

        public Criteria andReplyDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("reply_datetime not between", value1, value2, "replyDatetime");
            return (Criteria) this;
        }

        public Criteria andReplyClientipIsNull() {
            addCriterion("reply_clientip is null");
            return (Criteria) this;
        }

        public Criteria andReplyClientipIsNotNull() {
            addCriterion("reply_clientip is not null");
            return (Criteria) this;
        }

        public Criteria andReplyClientipEqualTo(String value) {
            addCriterion("reply_clientip =", value, "replyClientip");
            return (Criteria) this;
        }

        public Criteria andReplyClientipNotEqualTo(String value) {
            addCriterion("reply_clientip <>", value, "replyClientip");
            return (Criteria) this;
        }

        public Criteria andReplyClientipGreaterThan(String value) {
            addCriterion("reply_clientip >", value, "replyClientip");
            return (Criteria) this;
        }

        public Criteria andReplyClientipGreaterThanOrEqualTo(String value) {
            addCriterion("reply_clientip >=", value, "replyClientip");
            return (Criteria) this;
        }

        public Criteria andReplyClientipLessThan(String value) {
            addCriterion("reply_clientip <", value, "replyClientip");
            return (Criteria) this;
        }

        public Criteria andReplyClientipLessThanOrEqualTo(String value) {
            addCriterion("reply_clientip <=", value, "replyClientip");
            return (Criteria) this;
        }

        public Criteria andReplyClientipLike(String value) {
            addCriterion("reply_clientip like", value, "replyClientip");
            return (Criteria) this;
        }

        public Criteria andReplyClientipNotLike(String value) {
            addCriterion("reply_clientip not like", value, "replyClientip");
            return (Criteria) this;
        }

        public Criteria andReplyClientipIn(List<String> values) {
            addCriterion("reply_clientip in", values, "replyClientip");
            return (Criteria) this;
        }

        public Criteria andReplyClientipNotIn(List<String> values) {
            addCriterion("reply_clientip not in", values, "replyClientip");
            return (Criteria) this;
        }

        public Criteria andReplyClientipBetween(String value1, String value2) {
            addCriterion("reply_clientip between", value1, value2, "replyClientip");
            return (Criteria) this;
        }

        public Criteria andReplyClientipNotBetween(String value1, String value2) {
            addCriterion("reply_clientip not between", value1, value2, "replyClientip");
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