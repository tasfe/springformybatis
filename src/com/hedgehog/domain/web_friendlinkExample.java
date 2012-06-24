package com.hedgehog.domain;

import java.util.ArrayList;
import java.util.List;

public class web_friendlinkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public web_friendlinkExample() {
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

        public Criteria andFriendlinkIdIsNull() {
            addCriterion("friendlink_id is null");
            return (Criteria) this;
        }

        public Criteria andFriendlinkIdIsNotNull() {
            addCriterion("friendlink_id is not null");
            return (Criteria) this;
        }

        public Criteria andFriendlinkIdEqualTo(Integer value) {
            addCriterion("friendlink_id =", value, "friendlinkId");
            return (Criteria) this;
        }

        public Criteria andFriendlinkIdNotEqualTo(Integer value) {
            addCriterion("friendlink_id <>", value, "friendlinkId");
            return (Criteria) this;
        }

        public Criteria andFriendlinkIdGreaterThan(Integer value) {
            addCriterion("friendlink_id >", value, "friendlinkId");
            return (Criteria) this;
        }

        public Criteria andFriendlinkIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("friendlink_id >=", value, "friendlinkId");
            return (Criteria) this;
        }

        public Criteria andFriendlinkIdLessThan(Integer value) {
            addCriterion("friendlink_id <", value, "friendlinkId");
            return (Criteria) this;
        }

        public Criteria andFriendlinkIdLessThanOrEqualTo(Integer value) {
            addCriterion("friendlink_id <=", value, "friendlinkId");
            return (Criteria) this;
        }

        public Criteria andFriendlinkIdIn(List<Integer> values) {
            addCriterion("friendlink_id in", values, "friendlinkId");
            return (Criteria) this;
        }

        public Criteria andFriendlinkIdNotIn(List<Integer> values) {
            addCriterion("friendlink_id not in", values, "friendlinkId");
            return (Criteria) this;
        }

        public Criteria andFriendlinkIdBetween(Integer value1, Integer value2) {
            addCriterion("friendlink_id between", value1, value2, "friendlinkId");
            return (Criteria) this;
        }

        public Criteria andFriendlinkIdNotBetween(Integer value1, Integer value2) {
            addCriterion("friendlink_id not between", value1, value2, "friendlinkId");
            return (Criteria) this;
        }

        public Criteria andFriendlinkTitleIsNull() {
            addCriterion("friendlink_title is null");
            return (Criteria) this;
        }

        public Criteria andFriendlinkTitleIsNotNull() {
            addCriterion("friendlink_title is not null");
            return (Criteria) this;
        }

        public Criteria andFriendlinkTitleEqualTo(String value) {
            addCriterion("friendlink_title =", value, "friendlinkTitle");
            return (Criteria) this;
        }

        public Criteria andFriendlinkTitleNotEqualTo(String value) {
            addCriterion("friendlink_title <>", value, "friendlinkTitle");
            return (Criteria) this;
        }

        public Criteria andFriendlinkTitleGreaterThan(String value) {
            addCriterion("friendlink_title >", value, "friendlinkTitle");
            return (Criteria) this;
        }

        public Criteria andFriendlinkTitleGreaterThanOrEqualTo(String value) {
            addCriterion("friendlink_title >=", value, "friendlinkTitle");
            return (Criteria) this;
        }

        public Criteria andFriendlinkTitleLessThan(String value) {
            addCriterion("friendlink_title <", value, "friendlinkTitle");
            return (Criteria) this;
        }

        public Criteria andFriendlinkTitleLessThanOrEqualTo(String value) {
            addCriterion("friendlink_title <=", value, "friendlinkTitle");
            return (Criteria) this;
        }

        public Criteria andFriendlinkTitleLike(String value) {
            addCriterion("friendlink_title like", value, "friendlinkTitle");
            return (Criteria) this;
        }

        public Criteria andFriendlinkTitleNotLike(String value) {
            addCriterion("friendlink_title not like", value, "friendlinkTitle");
            return (Criteria) this;
        }

        public Criteria andFriendlinkTitleIn(List<String> values) {
            addCriterion("friendlink_title in", values, "friendlinkTitle");
            return (Criteria) this;
        }

        public Criteria andFriendlinkTitleNotIn(List<String> values) {
            addCriterion("friendlink_title not in", values, "friendlinkTitle");
            return (Criteria) this;
        }

        public Criteria andFriendlinkTitleBetween(String value1, String value2) {
            addCriterion("friendlink_title between", value1, value2, "friendlinkTitle");
            return (Criteria) this;
        }

        public Criteria andFriendlinkTitleNotBetween(String value1, String value2) {
            addCriterion("friendlink_title not between", value1, value2, "friendlinkTitle");
            return (Criteria) this;
        }

        public Criteria andFriendlinkUrlIsNull() {
            addCriterion("friendlink_URL is null");
            return (Criteria) this;
        }

        public Criteria andFriendlinkUrlIsNotNull() {
            addCriterion("friendlink_URL is not null");
            return (Criteria) this;
        }

        public Criteria andFriendlinkUrlEqualTo(String value) {
            addCriterion("friendlink_URL =", value, "friendlinkUrl");
            return (Criteria) this;
        }

        public Criteria andFriendlinkUrlNotEqualTo(String value) {
            addCriterion("friendlink_URL <>", value, "friendlinkUrl");
            return (Criteria) this;
        }

        public Criteria andFriendlinkUrlGreaterThan(String value) {
            addCriterion("friendlink_URL >", value, "friendlinkUrl");
            return (Criteria) this;
        }

        public Criteria andFriendlinkUrlGreaterThanOrEqualTo(String value) {
            addCriterion("friendlink_URL >=", value, "friendlinkUrl");
            return (Criteria) this;
        }

        public Criteria andFriendlinkUrlLessThan(String value) {
            addCriterion("friendlink_URL <", value, "friendlinkUrl");
            return (Criteria) this;
        }

        public Criteria andFriendlinkUrlLessThanOrEqualTo(String value) {
            addCriterion("friendlink_URL <=", value, "friendlinkUrl");
            return (Criteria) this;
        }

        public Criteria andFriendlinkUrlLike(String value) {
            addCriterion("friendlink_URL like", value, "friendlinkUrl");
            return (Criteria) this;
        }

        public Criteria andFriendlinkUrlNotLike(String value) {
            addCriterion("friendlink_URL not like", value, "friendlinkUrl");
            return (Criteria) this;
        }

        public Criteria andFriendlinkUrlIn(List<String> values) {
            addCriterion("friendlink_URL in", values, "friendlinkUrl");
            return (Criteria) this;
        }

        public Criteria andFriendlinkUrlNotIn(List<String> values) {
            addCriterion("friendlink_URL not in", values, "friendlinkUrl");
            return (Criteria) this;
        }

        public Criteria andFriendlinkUrlBetween(String value1, String value2) {
            addCriterion("friendlink_URL between", value1, value2, "friendlinkUrl");
            return (Criteria) this;
        }

        public Criteria andFriendlinkUrlNotBetween(String value1, String value2) {
            addCriterion("friendlink_URL not between", value1, value2, "friendlinkUrl");
            return (Criteria) this;
        }

        public Criteria andFriendlinkImageurlIsNull() {
            addCriterion("friendlink_imageURL is null");
            return (Criteria) this;
        }

        public Criteria andFriendlinkImageurlIsNotNull() {
            addCriterion("friendlink_imageURL is not null");
            return (Criteria) this;
        }

        public Criteria andFriendlinkImageurlEqualTo(String value) {
            addCriterion("friendlink_imageURL =", value, "friendlinkImageurl");
            return (Criteria) this;
        }

        public Criteria andFriendlinkImageurlNotEqualTo(String value) {
            addCriterion("friendlink_imageURL <>", value, "friendlinkImageurl");
            return (Criteria) this;
        }

        public Criteria andFriendlinkImageurlGreaterThan(String value) {
            addCriterion("friendlink_imageURL >", value, "friendlinkImageurl");
            return (Criteria) this;
        }

        public Criteria andFriendlinkImageurlGreaterThanOrEqualTo(String value) {
            addCriterion("friendlink_imageURL >=", value, "friendlinkImageurl");
            return (Criteria) this;
        }

        public Criteria andFriendlinkImageurlLessThan(String value) {
            addCriterion("friendlink_imageURL <", value, "friendlinkImageurl");
            return (Criteria) this;
        }

        public Criteria andFriendlinkImageurlLessThanOrEqualTo(String value) {
            addCriterion("friendlink_imageURL <=", value, "friendlinkImageurl");
            return (Criteria) this;
        }

        public Criteria andFriendlinkImageurlLike(String value) {
            addCriterion("friendlink_imageURL like", value, "friendlinkImageurl");
            return (Criteria) this;
        }

        public Criteria andFriendlinkImageurlNotLike(String value) {
            addCriterion("friendlink_imageURL not like", value, "friendlinkImageurl");
            return (Criteria) this;
        }

        public Criteria andFriendlinkImageurlIn(List<String> values) {
            addCriterion("friendlink_imageURL in", values, "friendlinkImageurl");
            return (Criteria) this;
        }

        public Criteria andFriendlinkImageurlNotIn(List<String> values) {
            addCriterion("friendlink_imageURL not in", values, "friendlinkImageurl");
            return (Criteria) this;
        }

        public Criteria andFriendlinkImageurlBetween(String value1, String value2) {
            addCriterion("friendlink_imageURL between", value1, value2, "friendlinkImageurl");
            return (Criteria) this;
        }

        public Criteria andFriendlinkImageurlNotBetween(String value1, String value2) {
            addCriterion("friendlink_imageURL not between", value1, value2, "friendlinkImageurl");
            return (Criteria) this;
        }

        public Criteria andFriendlinkOrderIsNull() {
            addCriterion("friendlink_order is null");
            return (Criteria) this;
        }

        public Criteria andFriendlinkOrderIsNotNull() {
            addCriterion("friendlink_order is not null");
            return (Criteria) this;
        }

        public Criteria andFriendlinkOrderEqualTo(Integer value) {
            addCriterion("friendlink_order =", value, "friendlinkOrder");
            return (Criteria) this;
        }

        public Criteria andFriendlinkOrderNotEqualTo(Integer value) {
            addCriterion("friendlink_order <>", value, "friendlinkOrder");
            return (Criteria) this;
        }

        public Criteria andFriendlinkOrderGreaterThan(Integer value) {
            addCriterion("friendlink_order >", value, "friendlinkOrder");
            return (Criteria) this;
        }

        public Criteria andFriendlinkOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("friendlink_order >=", value, "friendlinkOrder");
            return (Criteria) this;
        }

        public Criteria andFriendlinkOrderLessThan(Integer value) {
            addCriterion("friendlink_order <", value, "friendlinkOrder");
            return (Criteria) this;
        }

        public Criteria andFriendlinkOrderLessThanOrEqualTo(Integer value) {
            addCriterion("friendlink_order <=", value, "friendlinkOrder");
            return (Criteria) this;
        }

        public Criteria andFriendlinkOrderIn(List<Integer> values) {
            addCriterion("friendlink_order in", values, "friendlinkOrder");
            return (Criteria) this;
        }

        public Criteria andFriendlinkOrderNotIn(List<Integer> values) {
            addCriterion("friendlink_order not in", values, "friendlinkOrder");
            return (Criteria) this;
        }

        public Criteria andFriendlinkOrderBetween(Integer value1, Integer value2) {
            addCriterion("friendlink_order between", value1, value2, "friendlinkOrder");
            return (Criteria) this;
        }

        public Criteria andFriendlinkOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("friendlink_order not between", value1, value2, "friendlinkOrder");
            return (Criteria) this;
        }

        public Criteria andFriendlinkMenuidIsNull() {
            addCriterion("friendlink_menuid is null");
            return (Criteria) this;
        }

        public Criteria andFriendlinkMenuidIsNotNull() {
            addCriterion("friendlink_menuid is not null");
            return (Criteria) this;
        }

        public Criteria andFriendlinkMenuidEqualTo(Integer value) {
            addCriterion("friendlink_menuid =", value, "friendlinkMenuid");
            return (Criteria) this;
        }

        public Criteria andFriendlinkMenuidNotEqualTo(Integer value) {
            addCriterion("friendlink_menuid <>", value, "friendlinkMenuid");
            return (Criteria) this;
        }

        public Criteria andFriendlinkMenuidGreaterThan(Integer value) {
            addCriterion("friendlink_menuid >", value, "friendlinkMenuid");
            return (Criteria) this;
        }

        public Criteria andFriendlinkMenuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("friendlink_menuid >=", value, "friendlinkMenuid");
            return (Criteria) this;
        }

        public Criteria andFriendlinkMenuidLessThan(Integer value) {
            addCriterion("friendlink_menuid <", value, "friendlinkMenuid");
            return (Criteria) this;
        }

        public Criteria andFriendlinkMenuidLessThanOrEqualTo(Integer value) {
            addCriterion("friendlink_menuid <=", value, "friendlinkMenuid");
            return (Criteria) this;
        }

        public Criteria andFriendlinkMenuidIn(List<Integer> values) {
            addCriterion("friendlink_menuid in", values, "friendlinkMenuid");
            return (Criteria) this;
        }

        public Criteria andFriendlinkMenuidNotIn(List<Integer> values) {
            addCriterion("friendlink_menuid not in", values, "friendlinkMenuid");
            return (Criteria) this;
        }

        public Criteria andFriendlinkMenuidBetween(Integer value1, Integer value2) {
            addCriterion("friendlink_menuid between", value1, value2, "friendlinkMenuid");
            return (Criteria) this;
        }

        public Criteria andFriendlinkMenuidNotBetween(Integer value1, Integer value2) {
            addCriterion("friendlink_menuid not between", value1, value2, "friendlinkMenuid");
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