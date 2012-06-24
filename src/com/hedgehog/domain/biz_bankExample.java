package com.hedgehog.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class biz_bankExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public biz_bankExample() {
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

        public Criteria andBankidIsNull() {
            addCriterion("bankID is null");
            return (Criteria) this;
        }

        public Criteria andBankidIsNotNull() {
            addCriterion("bankID is not null");
            return (Criteria) this;
        }

        public Criteria andBankidEqualTo(Long value) {
            addCriterion("bankID =", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidNotEqualTo(Long value) {
            addCriterion("bankID <>", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidGreaterThan(Long value) {
            addCriterion("bankID >", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidGreaterThanOrEqualTo(Long value) {
            addCriterion("bankID >=", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidLessThan(Long value) {
            addCriterion("bankID <", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidLessThanOrEqualTo(Long value) {
            addCriterion("bankID <=", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidIn(List<Long> values) {
            addCriterion("bankID in", values, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidNotIn(List<Long> values) {
            addCriterion("bankID not in", values, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidBetween(Long value1, Long value2) {
            addCriterion("bankID between", value1, value2, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidNotBetween(Long value1, Long value2) {
            addCriterion("bankID not between", value1, value2, "bankid");
            return (Criteria) this;
        }

        public Criteria andMIdIsNull() {
            addCriterion("m_id is null");
            return (Criteria) this;
        }

        public Criteria andMIdIsNotNull() {
            addCriterion("m_id is not null");
            return (Criteria) this;
        }

        public Criteria andMIdEqualTo(Integer value) {
            addCriterion("m_id =", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotEqualTo(Integer value) {
            addCriterion("m_id <>", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdGreaterThan(Integer value) {
            addCriterion("m_id >", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("m_id >=", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdLessThan(Integer value) {
            addCriterion("m_id <", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdLessThanOrEqualTo(Integer value) {
            addCriterion("m_id <=", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdIn(List<Integer> values) {
            addCriterion("m_id in", values, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotIn(List<Integer> values) {
            addCriterion("m_id not in", values, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdBetween(Integer value1, Integer value2) {
            addCriterion("m_id between", value1, value2, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotBetween(Integer value1, Integer value2) {
            addCriterion("m_id not between", value1, value2, "mId");
            return (Criteria) this;
        }

        public Criteria andBTypeIsNull() {
            addCriterion("b_type is null");
            return (Criteria) this;
        }

        public Criteria andBTypeIsNotNull() {
            addCriterion("b_type is not null");
            return (Criteria) this;
        }

        public Criteria andBTypeEqualTo(String value) {
            addCriterion("b_type =", value, "bType");
            return (Criteria) this;
        }

        public Criteria andBTypeNotEqualTo(String value) {
            addCriterion("b_type <>", value, "bType");
            return (Criteria) this;
        }

        public Criteria andBTypeGreaterThan(String value) {
            addCriterion("b_type >", value, "bType");
            return (Criteria) this;
        }

        public Criteria andBTypeGreaterThanOrEqualTo(String value) {
            addCriterion("b_type >=", value, "bType");
            return (Criteria) this;
        }

        public Criteria andBTypeLessThan(String value) {
            addCriterion("b_type <", value, "bType");
            return (Criteria) this;
        }

        public Criteria andBTypeLessThanOrEqualTo(String value) {
            addCriterion("b_type <=", value, "bType");
            return (Criteria) this;
        }

        public Criteria andBTypeLike(String value) {
            addCriterion("b_type like", value, "bType");
            return (Criteria) this;
        }

        public Criteria andBTypeNotLike(String value) {
            addCriterion("b_type not like", value, "bType");
            return (Criteria) this;
        }

        public Criteria andBTypeIn(List<String> values) {
            addCriterion("b_type in", values, "bType");
            return (Criteria) this;
        }

        public Criteria andBTypeNotIn(List<String> values) {
            addCriterion("b_type not in", values, "bType");
            return (Criteria) this;
        }

        public Criteria andBTypeBetween(String value1, String value2) {
            addCriterion("b_type between", value1, value2, "bType");
            return (Criteria) this;
        }

        public Criteria andBTypeNotBetween(String value1, String value2) {
            addCriterion("b_type not between", value1, value2, "bType");
            return (Criteria) this;
        }

        public Criteria andBMoneyIsNull() {
            addCriterion("b_money is null");
            return (Criteria) this;
        }

        public Criteria andBMoneyIsNotNull() {
            addCriterion("b_money is not null");
            return (Criteria) this;
        }

        public Criteria andBMoneyEqualTo(BigDecimal value) {
            addCriterion("b_money =", value, "bMoney");
            return (Criteria) this;
        }

        public Criteria andBMoneyNotEqualTo(BigDecimal value) {
            addCriterion("b_money <>", value, "bMoney");
            return (Criteria) this;
        }

        public Criteria andBMoneyGreaterThan(BigDecimal value) {
            addCriterion("b_money >", value, "bMoney");
            return (Criteria) this;
        }

        public Criteria andBMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("b_money >=", value, "bMoney");
            return (Criteria) this;
        }

        public Criteria andBMoneyLessThan(BigDecimal value) {
            addCriterion("b_money <", value, "bMoney");
            return (Criteria) this;
        }

        public Criteria andBMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("b_money <=", value, "bMoney");
            return (Criteria) this;
        }

        public Criteria andBMoneyIn(List<BigDecimal> values) {
            addCriterion("b_money in", values, "bMoney");
            return (Criteria) this;
        }

        public Criteria andBMoneyNotIn(List<BigDecimal> values) {
            addCriterion("b_money not in", values, "bMoney");
            return (Criteria) this;
        }

        public Criteria andBMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("b_money between", value1, value2, "bMoney");
            return (Criteria) this;
        }

        public Criteria andBMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("b_money not between", value1, value2, "bMoney");
            return (Criteria) this;
        }

        public Criteria andBNoteIsNull() {
            addCriterion("b_note is null");
            return (Criteria) this;
        }

        public Criteria andBNoteIsNotNull() {
            addCriterion("b_note is not null");
            return (Criteria) this;
        }

        public Criteria andBNoteEqualTo(String value) {
            addCriterion("b_note =", value, "bNote");
            return (Criteria) this;
        }

        public Criteria andBNoteNotEqualTo(String value) {
            addCriterion("b_note <>", value, "bNote");
            return (Criteria) this;
        }

        public Criteria andBNoteGreaterThan(String value) {
            addCriterion("b_note >", value, "bNote");
            return (Criteria) this;
        }

        public Criteria andBNoteGreaterThanOrEqualTo(String value) {
            addCriterion("b_note >=", value, "bNote");
            return (Criteria) this;
        }

        public Criteria andBNoteLessThan(String value) {
            addCriterion("b_note <", value, "bNote");
            return (Criteria) this;
        }

        public Criteria andBNoteLessThanOrEqualTo(String value) {
            addCriterion("b_note <=", value, "bNote");
            return (Criteria) this;
        }

        public Criteria andBNoteLike(String value) {
            addCriterion("b_note like", value, "bNote");
            return (Criteria) this;
        }

        public Criteria andBNoteNotLike(String value) {
            addCriterion("b_note not like", value, "bNote");
            return (Criteria) this;
        }

        public Criteria andBNoteIn(List<String> values) {
            addCriterion("b_note in", values, "bNote");
            return (Criteria) this;
        }

        public Criteria andBNoteNotIn(List<String> values) {
            addCriterion("b_note not in", values, "bNote");
            return (Criteria) this;
        }

        public Criteria andBNoteBetween(String value1, String value2) {
            addCriterion("b_note between", value1, value2, "bNote");
            return (Criteria) this;
        }

        public Criteria andBNoteNotBetween(String value1, String value2) {
            addCriterion("b_note not between", value1, value2, "bNote");
            return (Criteria) this;
        }

        public Criteria andBCreatetimeIsNull() {
            addCriterion("b_createtime is null");
            return (Criteria) this;
        }

        public Criteria andBCreatetimeIsNotNull() {
            addCriterion("b_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andBCreatetimeEqualTo(Date value) {
            addCriterion("b_createtime =", value, "bCreatetime");
            return (Criteria) this;
        }

        public Criteria andBCreatetimeNotEqualTo(Date value) {
            addCriterion("b_createtime <>", value, "bCreatetime");
            return (Criteria) this;
        }

        public Criteria andBCreatetimeGreaterThan(Date value) {
            addCriterion("b_createtime >", value, "bCreatetime");
            return (Criteria) this;
        }

        public Criteria andBCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("b_createtime >=", value, "bCreatetime");
            return (Criteria) this;
        }

        public Criteria andBCreatetimeLessThan(Date value) {
            addCriterion("b_createtime <", value, "bCreatetime");
            return (Criteria) this;
        }

        public Criteria andBCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("b_createtime <=", value, "bCreatetime");
            return (Criteria) this;
        }

        public Criteria andBCreatetimeIn(List<Date> values) {
            addCriterion("b_createtime in", values, "bCreatetime");
            return (Criteria) this;
        }

        public Criteria andBCreatetimeNotIn(List<Date> values) {
            addCriterion("b_createtime not in", values, "bCreatetime");
            return (Criteria) this;
        }

        public Criteria andBCreatetimeBetween(Date value1, Date value2) {
            addCriterion("b_createtime between", value1, value2, "bCreatetime");
            return (Criteria) this;
        }

        public Criteria andBCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("b_createtime not between", value1, value2, "bCreatetime");
            return (Criteria) this;
        }

        public Criteria andBAdminidIsNull() {
            addCriterion("b_adminid is null");
            return (Criteria) this;
        }

        public Criteria andBAdminidIsNotNull() {
            addCriterion("b_adminid is not null");
            return (Criteria) this;
        }

        public Criteria andBAdminidEqualTo(Integer value) {
            addCriterion("b_adminid =", value, "bAdminid");
            return (Criteria) this;
        }

        public Criteria andBAdminidNotEqualTo(Integer value) {
            addCriterion("b_adminid <>", value, "bAdminid");
            return (Criteria) this;
        }

        public Criteria andBAdminidGreaterThan(Integer value) {
            addCriterion("b_adminid >", value, "bAdminid");
            return (Criteria) this;
        }

        public Criteria andBAdminidGreaterThanOrEqualTo(Integer value) {
            addCriterion("b_adminid >=", value, "bAdminid");
            return (Criteria) this;
        }

        public Criteria andBAdminidLessThan(Integer value) {
            addCriterion("b_adminid <", value, "bAdminid");
            return (Criteria) this;
        }

        public Criteria andBAdminidLessThanOrEqualTo(Integer value) {
            addCriterion("b_adminid <=", value, "bAdminid");
            return (Criteria) this;
        }

        public Criteria andBAdminidIn(List<Integer> values) {
            addCriterion("b_adminid in", values, "bAdminid");
            return (Criteria) this;
        }

        public Criteria andBAdminidNotIn(List<Integer> values) {
            addCriterion("b_adminid not in", values, "bAdminid");
            return (Criteria) this;
        }

        public Criteria andBAdminidBetween(Integer value1, Integer value2) {
            addCriterion("b_adminid between", value1, value2, "bAdminid");
            return (Criteria) this;
        }

        public Criteria andBAdminidNotBetween(Integer value1, Integer value2) {
            addCriterion("b_adminid not between", value1, value2, "bAdminid");
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