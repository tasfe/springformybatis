package com.hedgehog.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class web_supplyinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public web_supplyinfoExample() {
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

        public Criteria andSupplyinfoidIsNull() {
            addCriterion("supplyinfoID is null");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoidIsNotNull() {
            addCriterion("supplyinfoID is not null");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoidEqualTo(Integer value) {
            addCriterion("supplyinfoID =", value, "supplyinfoid");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoidNotEqualTo(Integer value) {
            addCriterion("supplyinfoID <>", value, "supplyinfoid");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoidGreaterThan(Integer value) {
            addCriterion("supplyinfoID >", value, "supplyinfoid");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("supplyinfoID >=", value, "supplyinfoid");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoidLessThan(Integer value) {
            addCriterion("supplyinfoID <", value, "supplyinfoid");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoidLessThanOrEqualTo(Integer value) {
            addCriterion("supplyinfoID <=", value, "supplyinfoid");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoidIn(List<Integer> values) {
            addCriterion("supplyinfoID in", values, "supplyinfoid");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoidNotIn(List<Integer> values) {
            addCriterion("supplyinfoID not in", values, "supplyinfoid");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoidBetween(Integer value1, Integer value2) {
            addCriterion("supplyinfoID between", value1, value2, "supplyinfoid");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoidNotBetween(Integer value1, Integer value2) {
            addCriterion("supplyinfoID not between", value1, value2, "supplyinfoid");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoScIsNull() {
            addCriterion("supplyinfo_sc is null");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoScIsNotNull() {
            addCriterion("supplyinfo_sc is not null");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoScEqualTo(Integer value) {
            addCriterion("supplyinfo_sc =", value, "supplyinfoSc");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoScNotEqualTo(Integer value) {
            addCriterion("supplyinfo_sc <>", value, "supplyinfoSc");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoScGreaterThan(Integer value) {
            addCriterion("supplyinfo_sc >", value, "supplyinfoSc");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoScGreaterThanOrEqualTo(Integer value) {
            addCriterion("supplyinfo_sc >=", value, "supplyinfoSc");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoScLessThan(Integer value) {
            addCriterion("supplyinfo_sc <", value, "supplyinfoSc");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoScLessThanOrEqualTo(Integer value) {
            addCriterion("supplyinfo_sc <=", value, "supplyinfoSc");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoScIn(List<Integer> values) {
            addCriterion("supplyinfo_sc in", values, "supplyinfoSc");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoScNotIn(List<Integer> values) {
            addCriterion("supplyinfo_sc not in", values, "supplyinfoSc");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoScBetween(Integer value1, Integer value2) {
            addCriterion("supplyinfo_sc between", value1, value2, "supplyinfoSc");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoScNotBetween(Integer value1, Integer value2) {
            addCriterion("supplyinfo_sc not between", value1, value2, "supplyinfoSc");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoTitleIsNull() {
            addCriterion("supplyinfo_Title is null");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoTitleIsNotNull() {
            addCriterion("supplyinfo_Title is not null");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoTitleEqualTo(String value) {
            addCriterion("supplyinfo_Title =", value, "supplyinfoTitle");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoTitleNotEqualTo(String value) {
            addCriterion("supplyinfo_Title <>", value, "supplyinfoTitle");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoTitleGreaterThan(String value) {
            addCriterion("supplyinfo_Title >", value, "supplyinfoTitle");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoTitleGreaterThanOrEqualTo(String value) {
            addCriterion("supplyinfo_Title >=", value, "supplyinfoTitle");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoTitleLessThan(String value) {
            addCriterion("supplyinfo_Title <", value, "supplyinfoTitle");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoTitleLessThanOrEqualTo(String value) {
            addCriterion("supplyinfo_Title <=", value, "supplyinfoTitle");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoTitleLike(String value) {
            addCriterion("supplyinfo_Title like", value, "supplyinfoTitle");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoTitleNotLike(String value) {
            addCriterion("supplyinfo_Title not like", value, "supplyinfoTitle");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoTitleIn(List<String> values) {
            addCriterion("supplyinfo_Title in", values, "supplyinfoTitle");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoTitleNotIn(List<String> values) {
            addCriterion("supplyinfo_Title not in", values, "supplyinfoTitle");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoTitleBetween(String value1, String value2) {
            addCriterion("supplyinfo_Title between", value1, value2, "supplyinfoTitle");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoTitleNotBetween(String value1, String value2) {
            addCriterion("supplyinfo_Title not between", value1, value2, "supplyinfoTitle");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoThumbsIsNull() {
            addCriterion("supplyinfo_thumbs is null");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoThumbsIsNotNull() {
            addCriterion("supplyinfo_thumbs is not null");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoThumbsEqualTo(String value) {
            addCriterion("supplyinfo_thumbs =", value, "supplyinfoThumbs");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoThumbsNotEqualTo(String value) {
            addCriterion("supplyinfo_thumbs <>", value, "supplyinfoThumbs");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoThumbsGreaterThan(String value) {
            addCriterion("supplyinfo_thumbs >", value, "supplyinfoThumbs");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoThumbsGreaterThanOrEqualTo(String value) {
            addCriterion("supplyinfo_thumbs >=", value, "supplyinfoThumbs");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoThumbsLessThan(String value) {
            addCriterion("supplyinfo_thumbs <", value, "supplyinfoThumbs");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoThumbsLessThanOrEqualTo(String value) {
            addCriterion("supplyinfo_thumbs <=", value, "supplyinfoThumbs");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoThumbsLike(String value) {
            addCriterion("supplyinfo_thumbs like", value, "supplyinfoThumbs");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoThumbsNotLike(String value) {
            addCriterion("supplyinfo_thumbs not like", value, "supplyinfoThumbs");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoThumbsIn(List<String> values) {
            addCriterion("supplyinfo_thumbs in", values, "supplyinfoThumbs");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoThumbsNotIn(List<String> values) {
            addCriterion("supplyinfo_thumbs not in", values, "supplyinfoThumbs");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoThumbsBetween(String value1, String value2) {
            addCriterion("supplyinfo_thumbs between", value1, value2, "supplyinfoThumbs");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoThumbsNotBetween(String value1, String value2) {
            addCriterion("supplyinfo_thumbs not between", value1, value2, "supplyinfoThumbs");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoTypeIsNull() {
            addCriterion("supplyinfo_type is null");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoTypeIsNotNull() {
            addCriterion("supplyinfo_type is not null");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoTypeEqualTo(Integer value) {
            addCriterion("supplyinfo_type =", value, "supplyinfoType");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoTypeNotEqualTo(Integer value) {
            addCriterion("supplyinfo_type <>", value, "supplyinfoType");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoTypeGreaterThan(Integer value) {
            addCriterion("supplyinfo_type >", value, "supplyinfoType");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("supplyinfo_type >=", value, "supplyinfoType");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoTypeLessThan(Integer value) {
            addCriterion("supplyinfo_type <", value, "supplyinfoType");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoTypeLessThanOrEqualTo(Integer value) {
            addCriterion("supplyinfo_type <=", value, "supplyinfoType");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoTypeIn(List<Integer> values) {
            addCriterion("supplyinfo_type in", values, "supplyinfoType");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoTypeNotIn(List<Integer> values) {
            addCriterion("supplyinfo_type not in", values, "supplyinfoType");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoTypeBetween(Integer value1, Integer value2) {
            addCriterion("supplyinfo_type between", value1, value2, "supplyinfoType");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("supplyinfo_type not between", value1, value2, "supplyinfoType");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoMenuidIsNull() {
            addCriterion("supplyinfo_menuID is null");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoMenuidIsNotNull() {
            addCriterion("supplyinfo_menuID is not null");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoMenuidEqualTo(Integer value) {
            addCriterion("supplyinfo_menuID =", value, "supplyinfoMenuid");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoMenuidNotEqualTo(Integer value) {
            addCriterion("supplyinfo_menuID <>", value, "supplyinfoMenuid");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoMenuidGreaterThan(Integer value) {
            addCriterion("supplyinfo_menuID >", value, "supplyinfoMenuid");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoMenuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("supplyinfo_menuID >=", value, "supplyinfoMenuid");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoMenuidLessThan(Integer value) {
            addCriterion("supplyinfo_menuID <", value, "supplyinfoMenuid");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoMenuidLessThanOrEqualTo(Integer value) {
            addCriterion("supplyinfo_menuID <=", value, "supplyinfoMenuid");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoMenuidIn(List<Integer> values) {
            addCriterion("supplyinfo_menuID in", values, "supplyinfoMenuid");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoMenuidNotIn(List<Integer> values) {
            addCriterion("supplyinfo_menuID not in", values, "supplyinfoMenuid");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoMenuidBetween(Integer value1, Integer value2) {
            addCriterion("supplyinfo_menuID between", value1, value2, "supplyinfoMenuid");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoMenuidNotBetween(Integer value1, Integer value2) {
            addCriterion("supplyinfo_menuID not between", value1, value2, "supplyinfoMenuid");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoUpdatetimeIsNull() {
            addCriterion("supplyinfo_updatetime is null");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoUpdatetimeIsNotNull() {
            addCriterion("supplyinfo_updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoUpdatetimeEqualTo(Date value) {
            addCriterion("supplyinfo_updatetime =", value, "supplyinfoUpdatetime");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoUpdatetimeNotEqualTo(Date value) {
            addCriterion("supplyinfo_updatetime <>", value, "supplyinfoUpdatetime");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoUpdatetimeGreaterThan(Date value) {
            addCriterion("supplyinfo_updatetime >", value, "supplyinfoUpdatetime");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("supplyinfo_updatetime >=", value, "supplyinfoUpdatetime");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoUpdatetimeLessThan(Date value) {
            addCriterion("supplyinfo_updatetime <", value, "supplyinfoUpdatetime");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("supplyinfo_updatetime <=", value, "supplyinfoUpdatetime");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoUpdatetimeIn(List<Date> values) {
            addCriterion("supplyinfo_updatetime in", values, "supplyinfoUpdatetime");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoUpdatetimeNotIn(List<Date> values) {
            addCriterion("supplyinfo_updatetime not in", values, "supplyinfoUpdatetime");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("supplyinfo_updatetime between", value1, value2, "supplyinfoUpdatetime");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("supplyinfo_updatetime not between", value1, value2, "supplyinfoUpdatetime");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoHitsIsNull() {
            addCriterion("supplyinfo_hits is null");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoHitsIsNotNull() {
            addCriterion("supplyinfo_hits is not null");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoHitsEqualTo(Integer value) {
            addCriterion("supplyinfo_hits =", value, "supplyinfoHits");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoHitsNotEqualTo(Integer value) {
            addCriterion("supplyinfo_hits <>", value, "supplyinfoHits");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoHitsGreaterThan(Integer value) {
            addCriterion("supplyinfo_hits >", value, "supplyinfoHits");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoHitsGreaterThanOrEqualTo(Integer value) {
            addCriterion("supplyinfo_hits >=", value, "supplyinfoHits");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoHitsLessThan(Integer value) {
            addCriterion("supplyinfo_hits <", value, "supplyinfoHits");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoHitsLessThanOrEqualTo(Integer value) {
            addCriterion("supplyinfo_hits <=", value, "supplyinfoHits");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoHitsIn(List<Integer> values) {
            addCriterion("supplyinfo_hits in", values, "supplyinfoHits");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoHitsNotIn(List<Integer> values) {
            addCriterion("supplyinfo_hits not in", values, "supplyinfoHits");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoHitsBetween(Integer value1, Integer value2) {
            addCriterion("supplyinfo_hits between", value1, value2, "supplyinfoHits");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoHitsNotBetween(Integer value1, Integer value2) {
            addCriterion("supplyinfo_hits not between", value1, value2, "supplyinfoHits");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoPropertiesIsNull() {
            addCriterion("supplyinfo_properties is null");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoPropertiesIsNotNull() {
            addCriterion("supplyinfo_properties is not null");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoPropertiesEqualTo(String value) {
            addCriterion("supplyinfo_properties =", value, "supplyinfoProperties");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoPropertiesNotEqualTo(String value) {
            addCriterion("supplyinfo_properties <>", value, "supplyinfoProperties");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoPropertiesGreaterThan(String value) {
            addCriterion("supplyinfo_properties >", value, "supplyinfoProperties");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoPropertiesGreaterThanOrEqualTo(String value) {
            addCriterion("supplyinfo_properties >=", value, "supplyinfoProperties");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoPropertiesLessThan(String value) {
            addCriterion("supplyinfo_properties <", value, "supplyinfoProperties");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoPropertiesLessThanOrEqualTo(String value) {
            addCriterion("supplyinfo_properties <=", value, "supplyinfoProperties");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoPropertiesLike(String value) {
            addCriterion("supplyinfo_properties like", value, "supplyinfoProperties");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoPropertiesNotLike(String value) {
            addCriterion("supplyinfo_properties not like", value, "supplyinfoProperties");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoPropertiesIn(List<String> values) {
            addCriterion("supplyinfo_properties in", values, "supplyinfoProperties");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoPropertiesNotIn(List<String> values) {
            addCriterion("supplyinfo_properties not in", values, "supplyinfoProperties");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoPropertiesBetween(String value1, String value2) {
            addCriterion("supplyinfo_properties between", value1, value2, "supplyinfoProperties");
            return (Criteria) this;
        }

        public Criteria andSupplyinfoPropertiesNotBetween(String value1, String value2) {
            addCriterion("supplyinfo_properties not between", value1, value2, "supplyinfoProperties");
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