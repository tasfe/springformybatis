package com.hedgehog.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class biz_messageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public biz_messageExample() {
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

        public Criteria andMessageidIsNull() {
            addCriterion("messageID is null");
            return (Criteria) this;
        }

        public Criteria andMessageidIsNotNull() {
            addCriterion("messageID is not null");
            return (Criteria) this;
        }

        public Criteria andMessageidEqualTo(Integer value) {
            addCriterion("messageID =", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidNotEqualTo(Integer value) {
            addCriterion("messageID <>", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidGreaterThan(Integer value) {
            addCriterion("messageID >", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidGreaterThanOrEqualTo(Integer value) {
            addCriterion("messageID >=", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidLessThan(Integer value) {
            addCriterion("messageID <", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidLessThanOrEqualTo(Integer value) {
            addCriterion("messageID <=", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidIn(List<Integer> values) {
            addCriterion("messageID in", values, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidNotIn(List<Integer> values) {
            addCriterion("messageID not in", values, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidBetween(Integer value1, Integer value2) {
            addCriterion("messageID between", value1, value2, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidNotBetween(Integer value1, Integer value2) {
            addCriterion("messageID not between", value1, value2, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageSenderIsNull() {
            addCriterion("message_sender is null");
            return (Criteria) this;
        }

        public Criteria andMessageSenderIsNotNull() {
            addCriterion("message_sender is not null");
            return (Criteria) this;
        }

        public Criteria andMessageSenderEqualTo(String value) {
            addCriterion("message_sender =", value, "messageSender");
            return (Criteria) this;
        }

        public Criteria andMessageSenderNotEqualTo(String value) {
            addCriterion("message_sender <>", value, "messageSender");
            return (Criteria) this;
        }

        public Criteria andMessageSenderGreaterThan(String value) {
            addCriterion("message_sender >", value, "messageSender");
            return (Criteria) this;
        }

        public Criteria andMessageSenderGreaterThanOrEqualTo(String value) {
            addCriterion("message_sender >=", value, "messageSender");
            return (Criteria) this;
        }

        public Criteria andMessageSenderLessThan(String value) {
            addCriterion("message_sender <", value, "messageSender");
            return (Criteria) this;
        }

        public Criteria andMessageSenderLessThanOrEqualTo(String value) {
            addCriterion("message_sender <=", value, "messageSender");
            return (Criteria) this;
        }

        public Criteria andMessageSenderLike(String value) {
            addCriterion("message_sender like", value, "messageSender");
            return (Criteria) this;
        }

        public Criteria andMessageSenderNotLike(String value) {
            addCriterion("message_sender not like", value, "messageSender");
            return (Criteria) this;
        }

        public Criteria andMessageSenderIn(List<String> values) {
            addCriterion("message_sender in", values, "messageSender");
            return (Criteria) this;
        }

        public Criteria andMessageSenderNotIn(List<String> values) {
            addCriterion("message_sender not in", values, "messageSender");
            return (Criteria) this;
        }

        public Criteria andMessageSenderBetween(String value1, String value2) {
            addCriterion("message_sender between", value1, value2, "messageSender");
            return (Criteria) this;
        }

        public Criteria andMessageSenderNotBetween(String value1, String value2) {
            addCriterion("message_sender not between", value1, value2, "messageSender");
            return (Criteria) this;
        }

        public Criteria andMessageInceptIsNull() {
            addCriterion("message_incept is null");
            return (Criteria) this;
        }

        public Criteria andMessageInceptIsNotNull() {
            addCriterion("message_incept is not null");
            return (Criteria) this;
        }

        public Criteria andMessageInceptEqualTo(String value) {
            addCriterion("message_incept =", value, "messageIncept");
            return (Criteria) this;
        }

        public Criteria andMessageInceptNotEqualTo(String value) {
            addCriterion("message_incept <>", value, "messageIncept");
            return (Criteria) this;
        }

        public Criteria andMessageInceptGreaterThan(String value) {
            addCriterion("message_incept >", value, "messageIncept");
            return (Criteria) this;
        }

        public Criteria andMessageInceptGreaterThanOrEqualTo(String value) {
            addCriterion("message_incept >=", value, "messageIncept");
            return (Criteria) this;
        }

        public Criteria andMessageInceptLessThan(String value) {
            addCriterion("message_incept <", value, "messageIncept");
            return (Criteria) this;
        }

        public Criteria andMessageInceptLessThanOrEqualTo(String value) {
            addCriterion("message_incept <=", value, "messageIncept");
            return (Criteria) this;
        }

        public Criteria andMessageInceptLike(String value) {
            addCriterion("message_incept like", value, "messageIncept");
            return (Criteria) this;
        }

        public Criteria andMessageInceptNotLike(String value) {
            addCriterion("message_incept not like", value, "messageIncept");
            return (Criteria) this;
        }

        public Criteria andMessageInceptIn(List<String> values) {
            addCriterion("message_incept in", values, "messageIncept");
            return (Criteria) this;
        }

        public Criteria andMessageInceptNotIn(List<String> values) {
            addCriterion("message_incept not in", values, "messageIncept");
            return (Criteria) this;
        }

        public Criteria andMessageInceptBetween(String value1, String value2) {
            addCriterion("message_incept between", value1, value2, "messageIncept");
            return (Criteria) this;
        }

        public Criteria andMessageInceptNotBetween(String value1, String value2) {
            addCriterion("message_incept not between", value1, value2, "messageIncept");
            return (Criteria) this;
        }

        public Criteria andMessageTitleIsNull() {
            addCriterion("message_title is null");
            return (Criteria) this;
        }

        public Criteria andMessageTitleIsNotNull() {
            addCriterion("message_title is not null");
            return (Criteria) this;
        }

        public Criteria andMessageTitleEqualTo(String value) {
            addCriterion("message_title =", value, "messageTitle");
            return (Criteria) this;
        }

        public Criteria andMessageTitleNotEqualTo(String value) {
            addCriterion("message_title <>", value, "messageTitle");
            return (Criteria) this;
        }

        public Criteria andMessageTitleGreaterThan(String value) {
            addCriterion("message_title >", value, "messageTitle");
            return (Criteria) this;
        }

        public Criteria andMessageTitleGreaterThanOrEqualTo(String value) {
            addCriterion("message_title >=", value, "messageTitle");
            return (Criteria) this;
        }

        public Criteria andMessageTitleLessThan(String value) {
            addCriterion("message_title <", value, "messageTitle");
            return (Criteria) this;
        }

        public Criteria andMessageTitleLessThanOrEqualTo(String value) {
            addCriterion("message_title <=", value, "messageTitle");
            return (Criteria) this;
        }

        public Criteria andMessageTitleLike(String value) {
            addCriterion("message_title like", value, "messageTitle");
            return (Criteria) this;
        }

        public Criteria andMessageTitleNotLike(String value) {
            addCriterion("message_title not like", value, "messageTitle");
            return (Criteria) this;
        }

        public Criteria andMessageTitleIn(List<String> values) {
            addCriterion("message_title in", values, "messageTitle");
            return (Criteria) this;
        }

        public Criteria andMessageTitleNotIn(List<String> values) {
            addCriterion("message_title not in", values, "messageTitle");
            return (Criteria) this;
        }

        public Criteria andMessageTitleBetween(String value1, String value2) {
            addCriterion("message_title between", value1, value2, "messageTitle");
            return (Criteria) this;
        }

        public Criteria andMessageTitleNotBetween(String value1, String value2) {
            addCriterion("message_title not between", value1, value2, "messageTitle");
            return (Criteria) this;
        }

        public Criteria andMessageFlagIsNull() {
            addCriterion("message_flag is null");
            return (Criteria) this;
        }

        public Criteria andMessageFlagIsNotNull() {
            addCriterion("message_flag is not null");
            return (Criteria) this;
        }

        public Criteria andMessageFlagEqualTo(Integer value) {
            addCriterion("message_flag =", value, "messageFlag");
            return (Criteria) this;
        }

        public Criteria andMessageFlagNotEqualTo(Integer value) {
            addCriterion("message_flag <>", value, "messageFlag");
            return (Criteria) this;
        }

        public Criteria andMessageFlagGreaterThan(Integer value) {
            addCriterion("message_flag >", value, "messageFlag");
            return (Criteria) this;
        }

        public Criteria andMessageFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("message_flag >=", value, "messageFlag");
            return (Criteria) this;
        }

        public Criteria andMessageFlagLessThan(Integer value) {
            addCriterion("message_flag <", value, "messageFlag");
            return (Criteria) this;
        }

        public Criteria andMessageFlagLessThanOrEqualTo(Integer value) {
            addCriterion("message_flag <=", value, "messageFlag");
            return (Criteria) this;
        }

        public Criteria andMessageFlagIn(List<Integer> values) {
            addCriterion("message_flag in", values, "messageFlag");
            return (Criteria) this;
        }

        public Criteria andMessageFlagNotIn(List<Integer> values) {
            addCriterion("message_flag not in", values, "messageFlag");
            return (Criteria) this;
        }

        public Criteria andMessageFlagBetween(Integer value1, Integer value2) {
            addCriterion("message_flag between", value1, value2, "messageFlag");
            return (Criteria) this;
        }

        public Criteria andMessageFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("message_flag not between", value1, value2, "messageFlag");
            return (Criteria) this;
        }

        public Criteria andMessageSendtimeIsNull() {
            addCriterion("message_sendtime is null");
            return (Criteria) this;
        }

        public Criteria andMessageSendtimeIsNotNull() {
            addCriterion("message_sendtime is not null");
            return (Criteria) this;
        }

        public Criteria andMessageSendtimeEqualTo(Date value) {
            addCriterion("message_sendtime =", value, "messageSendtime");
            return (Criteria) this;
        }

        public Criteria andMessageSendtimeNotEqualTo(Date value) {
            addCriterion("message_sendtime <>", value, "messageSendtime");
            return (Criteria) this;
        }

        public Criteria andMessageSendtimeGreaterThan(Date value) {
            addCriterion("message_sendtime >", value, "messageSendtime");
            return (Criteria) this;
        }

        public Criteria andMessageSendtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("message_sendtime >=", value, "messageSendtime");
            return (Criteria) this;
        }

        public Criteria andMessageSendtimeLessThan(Date value) {
            addCriterion("message_sendtime <", value, "messageSendtime");
            return (Criteria) this;
        }

        public Criteria andMessageSendtimeLessThanOrEqualTo(Date value) {
            addCriterion("message_sendtime <=", value, "messageSendtime");
            return (Criteria) this;
        }

        public Criteria andMessageSendtimeIn(List<Date> values) {
            addCriterion("message_sendtime in", values, "messageSendtime");
            return (Criteria) this;
        }

        public Criteria andMessageSendtimeNotIn(List<Date> values) {
            addCriterion("message_sendtime not in", values, "messageSendtime");
            return (Criteria) this;
        }

        public Criteria andMessageSendtimeBetween(Date value1, Date value2) {
            addCriterion("message_sendtime between", value1, value2, "messageSendtime");
            return (Criteria) this;
        }

        public Criteria andMessageSendtimeNotBetween(Date value1, Date value2) {
            addCriterion("message_sendtime not between", value1, value2, "messageSendtime");
            return (Criteria) this;
        }

        public Criteria andMessageDelrIsNull() {
            addCriterion("message_delR is null");
            return (Criteria) this;
        }

        public Criteria andMessageDelrIsNotNull() {
            addCriterion("message_delR is not null");
            return (Criteria) this;
        }

        public Criteria andMessageDelrEqualTo(Integer value) {
            addCriterion("message_delR =", value, "messageDelr");
            return (Criteria) this;
        }

        public Criteria andMessageDelrNotEqualTo(Integer value) {
            addCriterion("message_delR <>", value, "messageDelr");
            return (Criteria) this;
        }

        public Criteria andMessageDelrGreaterThan(Integer value) {
            addCriterion("message_delR >", value, "messageDelr");
            return (Criteria) this;
        }

        public Criteria andMessageDelrGreaterThanOrEqualTo(Integer value) {
            addCriterion("message_delR >=", value, "messageDelr");
            return (Criteria) this;
        }

        public Criteria andMessageDelrLessThan(Integer value) {
            addCriterion("message_delR <", value, "messageDelr");
            return (Criteria) this;
        }

        public Criteria andMessageDelrLessThanOrEqualTo(Integer value) {
            addCriterion("message_delR <=", value, "messageDelr");
            return (Criteria) this;
        }

        public Criteria andMessageDelrIn(List<Integer> values) {
            addCriterion("message_delR in", values, "messageDelr");
            return (Criteria) this;
        }

        public Criteria andMessageDelrNotIn(List<Integer> values) {
            addCriterion("message_delR not in", values, "messageDelr");
            return (Criteria) this;
        }

        public Criteria andMessageDelrBetween(Integer value1, Integer value2) {
            addCriterion("message_delR between", value1, value2, "messageDelr");
            return (Criteria) this;
        }

        public Criteria andMessageDelrNotBetween(Integer value1, Integer value2) {
            addCriterion("message_delR not between", value1, value2, "messageDelr");
            return (Criteria) this;
        }

        public Criteria andMessageDelsIsNull() {
            addCriterion("message_delS is null");
            return (Criteria) this;
        }

        public Criteria andMessageDelsIsNotNull() {
            addCriterion("message_delS is not null");
            return (Criteria) this;
        }

        public Criteria andMessageDelsEqualTo(Integer value) {
            addCriterion("message_delS =", value, "messageDels");
            return (Criteria) this;
        }

        public Criteria andMessageDelsNotEqualTo(Integer value) {
            addCriterion("message_delS <>", value, "messageDels");
            return (Criteria) this;
        }

        public Criteria andMessageDelsGreaterThan(Integer value) {
            addCriterion("message_delS >", value, "messageDels");
            return (Criteria) this;
        }

        public Criteria andMessageDelsGreaterThanOrEqualTo(Integer value) {
            addCriterion("message_delS >=", value, "messageDels");
            return (Criteria) this;
        }

        public Criteria andMessageDelsLessThan(Integer value) {
            addCriterion("message_delS <", value, "messageDels");
            return (Criteria) this;
        }

        public Criteria andMessageDelsLessThanOrEqualTo(Integer value) {
            addCriterion("message_delS <=", value, "messageDels");
            return (Criteria) this;
        }

        public Criteria andMessageDelsIn(List<Integer> values) {
            addCriterion("message_delS in", values, "messageDels");
            return (Criteria) this;
        }

        public Criteria andMessageDelsNotIn(List<Integer> values) {
            addCriterion("message_delS not in", values, "messageDels");
            return (Criteria) this;
        }

        public Criteria andMessageDelsBetween(Integer value1, Integer value2) {
            addCriterion("message_delS between", value1, value2, "messageDels");
            return (Criteria) this;
        }

        public Criteria andMessageDelsNotBetween(Integer value1, Integer value2) {
            addCriterion("message_delS not between", value1, value2, "messageDels");
            return (Criteria) this;
        }

        public Criteria andMessageIssendIsNull() {
            addCriterion("message_isSend is null");
            return (Criteria) this;
        }

        public Criteria andMessageIssendIsNotNull() {
            addCriterion("message_isSend is not null");
            return (Criteria) this;
        }

        public Criteria andMessageIssendEqualTo(Integer value) {
            addCriterion("message_isSend =", value, "messageIssend");
            return (Criteria) this;
        }

        public Criteria andMessageIssendNotEqualTo(Integer value) {
            addCriterion("message_isSend <>", value, "messageIssend");
            return (Criteria) this;
        }

        public Criteria andMessageIssendGreaterThan(Integer value) {
            addCriterion("message_isSend >", value, "messageIssend");
            return (Criteria) this;
        }

        public Criteria andMessageIssendGreaterThanOrEqualTo(Integer value) {
            addCriterion("message_isSend >=", value, "messageIssend");
            return (Criteria) this;
        }

        public Criteria andMessageIssendLessThan(Integer value) {
            addCriterion("message_isSend <", value, "messageIssend");
            return (Criteria) this;
        }

        public Criteria andMessageIssendLessThanOrEqualTo(Integer value) {
            addCriterion("message_isSend <=", value, "messageIssend");
            return (Criteria) this;
        }

        public Criteria andMessageIssendIn(List<Integer> values) {
            addCriterion("message_isSend in", values, "messageIssend");
            return (Criteria) this;
        }

        public Criteria andMessageIssendNotIn(List<Integer> values) {
            addCriterion("message_isSend not in", values, "messageIssend");
            return (Criteria) this;
        }

        public Criteria andMessageIssendBetween(Integer value1, Integer value2) {
            addCriterion("message_isSend between", value1, value2, "messageIssend");
            return (Criteria) this;
        }

        public Criteria andMessageIssendNotBetween(Integer value1, Integer value2) {
            addCriterion("message_isSend not between", value1, value2, "messageIssend");
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