package com.hedgehog.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class web_productExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public web_productExample() {
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

        public Criteria andProductidIsNull() {
            addCriterion("ProductID is null");
            return (Criteria) this;
        }

        public Criteria andProductidIsNotNull() {
            addCriterion("ProductID is not null");
            return (Criteria) this;
        }

        public Criteria andProductidEqualTo(Integer value) {
            addCriterion("ProductID =", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotEqualTo(Integer value) {
            addCriterion("ProductID <>", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThan(Integer value) {
            addCriterion("ProductID >", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ProductID >=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThan(Integer value) {
            addCriterion("ProductID <", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThanOrEqualTo(Integer value) {
            addCriterion("ProductID <=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidIn(List<Integer> values) {
            addCriterion("ProductID in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotIn(List<Integer> values) {
            addCriterion("ProductID not in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidBetween(Integer value1, Integer value2) {
            addCriterion("ProductID between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotBetween(Integer value1, Integer value2) {
            addCriterion("ProductID not between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andProductMenuidIsNull() {
            addCriterion("Product_menuID is null");
            return (Criteria) this;
        }

        public Criteria andProductMenuidIsNotNull() {
            addCriterion("Product_menuID is not null");
            return (Criteria) this;
        }

        public Criteria andProductMenuidEqualTo(Integer value) {
            addCriterion("Product_menuID =", value, "productMenuid");
            return (Criteria) this;
        }

        public Criteria andProductMenuidNotEqualTo(Integer value) {
            addCriterion("Product_menuID <>", value, "productMenuid");
            return (Criteria) this;
        }

        public Criteria andProductMenuidGreaterThan(Integer value) {
            addCriterion("Product_menuID >", value, "productMenuid");
            return (Criteria) this;
        }

        public Criteria andProductMenuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("Product_menuID >=", value, "productMenuid");
            return (Criteria) this;
        }

        public Criteria andProductMenuidLessThan(Integer value) {
            addCriterion("Product_menuID <", value, "productMenuid");
            return (Criteria) this;
        }

        public Criteria andProductMenuidLessThanOrEqualTo(Integer value) {
            addCriterion("Product_menuID <=", value, "productMenuid");
            return (Criteria) this;
        }

        public Criteria andProductMenuidIn(List<Integer> values) {
            addCriterion("Product_menuID in", values, "productMenuid");
            return (Criteria) this;
        }

        public Criteria andProductMenuidNotIn(List<Integer> values) {
            addCriterion("Product_menuID not in", values, "productMenuid");
            return (Criteria) this;
        }

        public Criteria andProductMenuidBetween(Integer value1, Integer value2) {
            addCriterion("Product_menuID between", value1, value2, "productMenuid");
            return (Criteria) this;
        }

        public Criteria andProductMenuidNotBetween(Integer value1, Integer value2) {
            addCriterion("Product_menuID not between", value1, value2, "productMenuid");
            return (Criteria) this;
        }

        public Criteria andProductClassIsNull() {
            addCriterion("Product_Class is null");
            return (Criteria) this;
        }

        public Criteria andProductClassIsNotNull() {
            addCriterion("Product_Class is not null");
            return (Criteria) this;
        }

        public Criteria andProductClassEqualTo(Integer value) {
            addCriterion("Product_Class =", value, "productClass");
            return (Criteria) this;
        }

        public Criteria andProductClassNotEqualTo(Integer value) {
            addCriterion("Product_Class <>", value, "productClass");
            return (Criteria) this;
        }

        public Criteria andProductClassGreaterThan(Integer value) {
            addCriterion("Product_Class >", value, "productClass");
            return (Criteria) this;
        }

        public Criteria andProductClassGreaterThanOrEqualTo(Integer value) {
            addCriterion("Product_Class >=", value, "productClass");
            return (Criteria) this;
        }

        public Criteria andProductClassLessThan(Integer value) {
            addCriterion("Product_Class <", value, "productClass");
            return (Criteria) this;
        }

        public Criteria andProductClassLessThanOrEqualTo(Integer value) {
            addCriterion("Product_Class <=", value, "productClass");
            return (Criteria) this;
        }

        public Criteria andProductClassIn(List<Integer> values) {
            addCriterion("Product_Class in", values, "productClass");
            return (Criteria) this;
        }

        public Criteria andProductClassNotIn(List<Integer> values) {
            addCriterion("Product_Class not in", values, "productClass");
            return (Criteria) this;
        }

        public Criteria andProductClassBetween(Integer value1, Integer value2) {
            addCriterion("Product_Class between", value1, value2, "productClass");
            return (Criteria) this;
        }

        public Criteria andProductClassNotBetween(Integer value1, Integer value2) {
            addCriterion("Product_Class not between", value1, value2, "productClass");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNull() {
            addCriterion("Product_Name is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("Product_Name is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("Product_Name =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("Product_Name <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("Product_Name >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("Product_Name >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("Product_Name <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("Product_Name <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("Product_Name like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("Product_Name not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("Product_Name in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("Product_Name not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("Product_Name between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("Product_Name not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductTypeIsNull() {
            addCriterion("Product_Type is null");
            return (Criteria) this;
        }

        public Criteria andProductTypeIsNotNull() {
            addCriterion("Product_Type is not null");
            return (Criteria) this;
        }

        public Criteria andProductTypeEqualTo(String value) {
            addCriterion("Product_Type =", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotEqualTo(String value) {
            addCriterion("Product_Type <>", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeGreaterThan(String value) {
            addCriterion("Product_Type >", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeGreaterThanOrEqualTo(String value) {
            addCriterion("Product_Type >=", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLessThan(String value) {
            addCriterion("Product_Type <", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLessThanOrEqualTo(String value) {
            addCriterion("Product_Type <=", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLike(String value) {
            addCriterion("Product_Type like", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotLike(String value) {
            addCriterion("Product_Type not like", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeIn(List<String> values) {
            addCriterion("Product_Type in", values, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotIn(List<String> values) {
            addCriterion("Product_Type not in", values, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeBetween(String value1, String value2) {
            addCriterion("Product_Type between", value1, value2, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotBetween(String value1, String value2) {
            addCriterion("Product_Type not between", value1, value2, "productType");
            return (Criteria) this;
        }

        public Criteria andProductMarketIsNull() {
            addCriterion("Product_Market is null");
            return (Criteria) this;
        }

        public Criteria andProductMarketIsNotNull() {
            addCriterion("Product_Market is not null");
            return (Criteria) this;
        }

        public Criteria andProductMarketEqualTo(String value) {
            addCriterion("Product_Market =", value, "productMarket");
            return (Criteria) this;
        }

        public Criteria andProductMarketNotEqualTo(String value) {
            addCriterion("Product_Market <>", value, "productMarket");
            return (Criteria) this;
        }

        public Criteria andProductMarketGreaterThan(String value) {
            addCriterion("Product_Market >", value, "productMarket");
            return (Criteria) this;
        }

        public Criteria andProductMarketGreaterThanOrEqualTo(String value) {
            addCriterion("Product_Market >=", value, "productMarket");
            return (Criteria) this;
        }

        public Criteria andProductMarketLessThan(String value) {
            addCriterion("Product_Market <", value, "productMarket");
            return (Criteria) this;
        }

        public Criteria andProductMarketLessThanOrEqualTo(String value) {
            addCriterion("Product_Market <=", value, "productMarket");
            return (Criteria) this;
        }

        public Criteria andProductMarketLike(String value) {
            addCriterion("Product_Market like", value, "productMarket");
            return (Criteria) this;
        }

        public Criteria andProductMarketNotLike(String value) {
            addCriterion("Product_Market not like", value, "productMarket");
            return (Criteria) this;
        }

        public Criteria andProductMarketIn(List<String> values) {
            addCriterion("Product_Market in", values, "productMarket");
            return (Criteria) this;
        }

        public Criteria andProductMarketNotIn(List<String> values) {
            addCriterion("Product_Market not in", values, "productMarket");
            return (Criteria) this;
        }

        public Criteria andProductMarketBetween(String value1, String value2) {
            addCriterion("Product_Market between", value1, value2, "productMarket");
            return (Criteria) this;
        }

        public Criteria andProductMarketNotBetween(String value1, String value2) {
            addCriterion("Product_Market not between", value1, value2, "productMarket");
            return (Criteria) this;
        }

        public Criteria andProductPromoteIsNull() {
            addCriterion("Product_Promote is null");
            return (Criteria) this;
        }

        public Criteria andProductPromoteIsNotNull() {
            addCriterion("Product_Promote is not null");
            return (Criteria) this;
        }

        public Criteria andProductPromoteEqualTo(String value) {
            addCriterion("Product_Promote =", value, "productPromote");
            return (Criteria) this;
        }

        public Criteria andProductPromoteNotEqualTo(String value) {
            addCriterion("Product_Promote <>", value, "productPromote");
            return (Criteria) this;
        }

        public Criteria andProductPromoteGreaterThan(String value) {
            addCriterion("Product_Promote >", value, "productPromote");
            return (Criteria) this;
        }

        public Criteria andProductPromoteGreaterThanOrEqualTo(String value) {
            addCriterion("Product_Promote >=", value, "productPromote");
            return (Criteria) this;
        }

        public Criteria andProductPromoteLessThan(String value) {
            addCriterion("Product_Promote <", value, "productPromote");
            return (Criteria) this;
        }

        public Criteria andProductPromoteLessThanOrEqualTo(String value) {
            addCriterion("Product_Promote <=", value, "productPromote");
            return (Criteria) this;
        }

        public Criteria andProductPromoteLike(String value) {
            addCriterion("Product_Promote like", value, "productPromote");
            return (Criteria) this;
        }

        public Criteria andProductPromoteNotLike(String value) {
            addCriterion("Product_Promote not like", value, "productPromote");
            return (Criteria) this;
        }

        public Criteria andProductPromoteIn(List<String> values) {
            addCriterion("Product_Promote in", values, "productPromote");
            return (Criteria) this;
        }

        public Criteria andProductPromoteNotIn(List<String> values) {
            addCriterion("Product_Promote not in", values, "productPromote");
            return (Criteria) this;
        }

        public Criteria andProductPromoteBetween(String value1, String value2) {
            addCriterion("Product_Promote between", value1, value2, "productPromote");
            return (Criteria) this;
        }

        public Criteria andProductPromoteNotBetween(String value1, String value2) {
            addCriterion("Product_Promote not between", value1, value2, "productPromote");
            return (Criteria) this;
        }

        public Criteria andProductThumbsIsNull() {
            addCriterion("Product_Thumbs is null");
            return (Criteria) this;
        }

        public Criteria andProductThumbsIsNotNull() {
            addCriterion("Product_Thumbs is not null");
            return (Criteria) this;
        }

        public Criteria andProductThumbsEqualTo(String value) {
            addCriterion("Product_Thumbs =", value, "productThumbs");
            return (Criteria) this;
        }

        public Criteria andProductThumbsNotEqualTo(String value) {
            addCriterion("Product_Thumbs <>", value, "productThumbs");
            return (Criteria) this;
        }

        public Criteria andProductThumbsGreaterThan(String value) {
            addCriterion("Product_Thumbs >", value, "productThumbs");
            return (Criteria) this;
        }

        public Criteria andProductThumbsGreaterThanOrEqualTo(String value) {
            addCriterion("Product_Thumbs >=", value, "productThumbs");
            return (Criteria) this;
        }

        public Criteria andProductThumbsLessThan(String value) {
            addCriterion("Product_Thumbs <", value, "productThumbs");
            return (Criteria) this;
        }

        public Criteria andProductThumbsLessThanOrEqualTo(String value) {
            addCriterion("Product_Thumbs <=", value, "productThumbs");
            return (Criteria) this;
        }

        public Criteria andProductThumbsLike(String value) {
            addCriterion("Product_Thumbs like", value, "productThumbs");
            return (Criteria) this;
        }

        public Criteria andProductThumbsNotLike(String value) {
            addCriterion("Product_Thumbs not like", value, "productThumbs");
            return (Criteria) this;
        }

        public Criteria andProductThumbsIn(List<String> values) {
            addCriterion("Product_Thumbs in", values, "productThumbs");
            return (Criteria) this;
        }

        public Criteria andProductThumbsNotIn(List<String> values) {
            addCriterion("Product_Thumbs not in", values, "productThumbs");
            return (Criteria) this;
        }

        public Criteria andProductThumbsBetween(String value1, String value2) {
            addCriterion("Product_Thumbs between", value1, value2, "productThumbs");
            return (Criteria) this;
        }

        public Criteria andProductThumbsNotBetween(String value1, String value2) {
            addCriterion("Product_Thumbs not between", value1, value2, "productThumbs");
            return (Criteria) this;
        }

        public Criteria andProductPropertyIsNull() {
            addCriterion("Product_Property is null");
            return (Criteria) this;
        }

        public Criteria andProductPropertyIsNotNull() {
            addCriterion("Product_Property is not null");
            return (Criteria) this;
        }

        public Criteria andProductPropertyEqualTo(String value) {
            addCriterion("Product_Property =", value, "productProperty");
            return (Criteria) this;
        }

        public Criteria andProductPropertyNotEqualTo(String value) {
            addCriterion("Product_Property <>", value, "productProperty");
            return (Criteria) this;
        }

        public Criteria andProductPropertyGreaterThan(String value) {
            addCriterion("Product_Property >", value, "productProperty");
            return (Criteria) this;
        }

        public Criteria andProductPropertyGreaterThanOrEqualTo(String value) {
            addCriterion("Product_Property >=", value, "productProperty");
            return (Criteria) this;
        }

        public Criteria andProductPropertyLessThan(String value) {
            addCriterion("Product_Property <", value, "productProperty");
            return (Criteria) this;
        }

        public Criteria andProductPropertyLessThanOrEqualTo(String value) {
            addCriterion("Product_Property <=", value, "productProperty");
            return (Criteria) this;
        }

        public Criteria andProductPropertyLike(String value) {
            addCriterion("Product_Property like", value, "productProperty");
            return (Criteria) this;
        }

        public Criteria andProductPropertyNotLike(String value) {
            addCriterion("Product_Property not like", value, "productProperty");
            return (Criteria) this;
        }

        public Criteria andProductPropertyIn(List<String> values) {
            addCriterion("Product_Property in", values, "productProperty");
            return (Criteria) this;
        }

        public Criteria andProductPropertyNotIn(List<String> values) {
            addCriterion("Product_Property not in", values, "productProperty");
            return (Criteria) this;
        }

        public Criteria andProductPropertyBetween(String value1, String value2) {
            addCriterion("Product_Property between", value1, value2, "productProperty");
            return (Criteria) this;
        }

        public Criteria andProductPropertyNotBetween(String value1, String value2) {
            addCriterion("Product_Property not between", value1, value2, "productProperty");
            return (Criteria) this;
        }

        public Criteria andProductUpdatetimeIsNull() {
            addCriterion("Product_updatetime is null");
            return (Criteria) this;
        }

        public Criteria andProductUpdatetimeIsNotNull() {
            addCriterion("Product_updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andProductUpdatetimeEqualTo(Date value) {
            addCriterion("Product_updatetime =", value, "productUpdatetime");
            return (Criteria) this;
        }

        public Criteria andProductUpdatetimeNotEqualTo(Date value) {
            addCriterion("Product_updatetime <>", value, "productUpdatetime");
            return (Criteria) this;
        }

        public Criteria andProductUpdatetimeGreaterThan(Date value) {
            addCriterion("Product_updatetime >", value, "productUpdatetime");
            return (Criteria) this;
        }

        public Criteria andProductUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Product_updatetime >=", value, "productUpdatetime");
            return (Criteria) this;
        }

        public Criteria andProductUpdatetimeLessThan(Date value) {
            addCriterion("Product_updatetime <", value, "productUpdatetime");
            return (Criteria) this;
        }

        public Criteria andProductUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("Product_updatetime <=", value, "productUpdatetime");
            return (Criteria) this;
        }

        public Criteria andProductUpdatetimeIn(List<Date> values) {
            addCriterion("Product_updatetime in", values, "productUpdatetime");
            return (Criteria) this;
        }

        public Criteria andProductUpdatetimeNotIn(List<Date> values) {
            addCriterion("Product_updatetime not in", values, "productUpdatetime");
            return (Criteria) this;
        }

        public Criteria andProductUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("Product_updatetime between", value1, value2, "productUpdatetime");
            return (Criteria) this;
        }

        public Criteria andProductUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("Product_updatetime not between", value1, value2, "productUpdatetime");
            return (Criteria) this;
        }

        public Criteria andProductHitsIsNull() {
            addCriterion("Product_hits is null");
            return (Criteria) this;
        }

        public Criteria andProductHitsIsNotNull() {
            addCriterion("Product_hits is not null");
            return (Criteria) this;
        }

        public Criteria andProductHitsEqualTo(Integer value) {
            addCriterion("Product_hits =", value, "productHits");
            return (Criteria) this;
        }

        public Criteria andProductHitsNotEqualTo(Integer value) {
            addCriterion("Product_hits <>", value, "productHits");
            return (Criteria) this;
        }

        public Criteria andProductHitsGreaterThan(Integer value) {
            addCriterion("Product_hits >", value, "productHits");
            return (Criteria) this;
        }

        public Criteria andProductHitsGreaterThanOrEqualTo(Integer value) {
            addCriterion("Product_hits >=", value, "productHits");
            return (Criteria) this;
        }

        public Criteria andProductHitsLessThan(Integer value) {
            addCriterion("Product_hits <", value, "productHits");
            return (Criteria) this;
        }

        public Criteria andProductHitsLessThanOrEqualTo(Integer value) {
            addCriterion("Product_hits <=", value, "productHits");
            return (Criteria) this;
        }

        public Criteria andProductHitsIn(List<Integer> values) {
            addCriterion("Product_hits in", values, "productHits");
            return (Criteria) this;
        }

        public Criteria andProductHitsNotIn(List<Integer> values) {
            addCriterion("Product_hits not in", values, "productHits");
            return (Criteria) this;
        }

        public Criteria andProductHitsBetween(Integer value1, Integer value2) {
            addCriterion("Product_hits between", value1, value2, "productHits");
            return (Criteria) this;
        }

        public Criteria andProductHitsNotBetween(Integer value1, Integer value2) {
            addCriterion("Product_hits not between", value1, value2, "productHits");
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