package com.hedgehog.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class web_newsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public web_newsExample() {
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

        public Criteria andNewsidIsNull() {
            addCriterion("NewsID is null");
            return (Criteria) this;
        }

        public Criteria andNewsidIsNotNull() {
            addCriterion("NewsID is not null");
            return (Criteria) this;
        }

        public Criteria andNewsidEqualTo(Integer value) {
            addCriterion("NewsID =", value, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidNotEqualTo(Integer value) {
            addCriterion("NewsID <>", value, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidGreaterThan(Integer value) {
            addCriterion("NewsID >", value, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("NewsID >=", value, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidLessThan(Integer value) {
            addCriterion("NewsID <", value, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidLessThanOrEqualTo(Integer value) {
            addCriterion("NewsID <=", value, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidIn(List<Integer> values) {
            addCriterion("NewsID in", values, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidNotIn(List<Integer> values) {
            addCriterion("NewsID not in", values, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidBetween(Integer value1, Integer value2) {
            addCriterion("NewsID between", value1, value2, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidNotBetween(Integer value1, Integer value2) {
            addCriterion("NewsID not between", value1, value2, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsTitleIsNull() {
            addCriterion("News_Title is null");
            return (Criteria) this;
        }

        public Criteria andNewsTitleIsNotNull() {
            addCriterion("News_Title is not null");
            return (Criteria) this;
        }

        public Criteria andNewsTitleEqualTo(String value) {
            addCriterion("News_Title =", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleNotEqualTo(String value) {
            addCriterion("News_Title <>", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleGreaterThan(String value) {
            addCriterion("News_Title >", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleGreaterThanOrEqualTo(String value) {
            addCriterion("News_Title >=", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleLessThan(String value) {
            addCriterion("News_Title <", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleLessThanOrEqualTo(String value) {
            addCriterion("News_Title <=", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleLike(String value) {
            addCriterion("News_Title like", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleNotLike(String value) {
            addCriterion("News_Title not like", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleIn(List<String> values) {
            addCriterion("News_Title in", values, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleNotIn(List<String> values) {
            addCriterion("News_Title not in", values, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleBetween(String value1, String value2) {
            addCriterion("News_Title between", value1, value2, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleNotBetween(String value1, String value2) {
            addCriterion("News_Title not between", value1, value2, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsClassIsNull() {
            addCriterion("News_Class is null");
            return (Criteria) this;
        }

        public Criteria andNewsClassIsNotNull() {
            addCriterion("News_Class is not null");
            return (Criteria) this;
        }

        public Criteria andNewsClassEqualTo(Integer value) {
            addCriterion("News_Class =", value, "newsClass");
            return (Criteria) this;
        }

        public Criteria andNewsClassNotEqualTo(Integer value) {
            addCriterion("News_Class <>", value, "newsClass");
            return (Criteria) this;
        }

        public Criteria andNewsClassGreaterThan(Integer value) {
            addCriterion("News_Class >", value, "newsClass");
            return (Criteria) this;
        }

        public Criteria andNewsClassGreaterThanOrEqualTo(Integer value) {
            addCriterion("News_Class >=", value, "newsClass");
            return (Criteria) this;
        }

        public Criteria andNewsClassLessThan(Integer value) {
            addCriterion("News_Class <", value, "newsClass");
            return (Criteria) this;
        }

        public Criteria andNewsClassLessThanOrEqualTo(Integer value) {
            addCriterion("News_Class <=", value, "newsClass");
            return (Criteria) this;
        }

        public Criteria andNewsClassIn(List<Integer> values) {
            addCriterion("News_Class in", values, "newsClass");
            return (Criteria) this;
        }

        public Criteria andNewsClassNotIn(List<Integer> values) {
            addCriterion("News_Class not in", values, "newsClass");
            return (Criteria) this;
        }

        public Criteria andNewsClassBetween(Integer value1, Integer value2) {
            addCriterion("News_Class between", value1, value2, "newsClass");
            return (Criteria) this;
        }

        public Criteria andNewsClassNotBetween(Integer value1, Integer value2) {
            addCriterion("News_Class not between", value1, value2, "newsClass");
            return (Criteria) this;
        }

        public Criteria andNewsSourceIsNull() {
            addCriterion("News_Source is null");
            return (Criteria) this;
        }

        public Criteria andNewsSourceIsNotNull() {
            addCriterion("News_Source is not null");
            return (Criteria) this;
        }

        public Criteria andNewsSourceEqualTo(String value) {
            addCriterion("News_Source =", value, "newsSource");
            return (Criteria) this;
        }

        public Criteria andNewsSourceNotEqualTo(String value) {
            addCriterion("News_Source <>", value, "newsSource");
            return (Criteria) this;
        }

        public Criteria andNewsSourceGreaterThan(String value) {
            addCriterion("News_Source >", value, "newsSource");
            return (Criteria) this;
        }

        public Criteria andNewsSourceGreaterThanOrEqualTo(String value) {
            addCriterion("News_Source >=", value, "newsSource");
            return (Criteria) this;
        }

        public Criteria andNewsSourceLessThan(String value) {
            addCriterion("News_Source <", value, "newsSource");
            return (Criteria) this;
        }

        public Criteria andNewsSourceLessThanOrEqualTo(String value) {
            addCriterion("News_Source <=", value, "newsSource");
            return (Criteria) this;
        }

        public Criteria andNewsSourceLike(String value) {
            addCriterion("News_Source like", value, "newsSource");
            return (Criteria) this;
        }

        public Criteria andNewsSourceNotLike(String value) {
            addCriterion("News_Source not like", value, "newsSource");
            return (Criteria) this;
        }

        public Criteria andNewsSourceIn(List<String> values) {
            addCriterion("News_Source in", values, "newsSource");
            return (Criteria) this;
        }

        public Criteria andNewsSourceNotIn(List<String> values) {
            addCriterion("News_Source not in", values, "newsSource");
            return (Criteria) this;
        }

        public Criteria andNewsSourceBetween(String value1, String value2) {
            addCriterion("News_Source between", value1, value2, "newsSource");
            return (Criteria) this;
        }

        public Criteria andNewsSourceNotBetween(String value1, String value2) {
            addCriterion("News_Source not between", value1, value2, "newsSource");
            return (Criteria) this;
        }

        public Criteria andNewsPropertiesIsNull() {
            addCriterion("News_Properties is null");
            return (Criteria) this;
        }

        public Criteria andNewsPropertiesIsNotNull() {
            addCriterion("News_Properties is not null");
            return (Criteria) this;
        }

        public Criteria andNewsPropertiesEqualTo(String value) {
            addCriterion("News_Properties =", value, "newsProperties");
            return (Criteria) this;
        }

        public Criteria andNewsPropertiesNotEqualTo(String value) {
            addCriterion("News_Properties <>", value, "newsProperties");
            return (Criteria) this;
        }

        public Criteria andNewsPropertiesGreaterThan(String value) {
            addCriterion("News_Properties >", value, "newsProperties");
            return (Criteria) this;
        }

        public Criteria andNewsPropertiesGreaterThanOrEqualTo(String value) {
            addCriterion("News_Properties >=", value, "newsProperties");
            return (Criteria) this;
        }

        public Criteria andNewsPropertiesLessThan(String value) {
            addCriterion("News_Properties <", value, "newsProperties");
            return (Criteria) this;
        }

        public Criteria andNewsPropertiesLessThanOrEqualTo(String value) {
            addCriterion("News_Properties <=", value, "newsProperties");
            return (Criteria) this;
        }

        public Criteria andNewsPropertiesLike(String value) {
            addCriterion("News_Properties like", value, "newsProperties");
            return (Criteria) this;
        }

        public Criteria andNewsPropertiesNotLike(String value) {
            addCriterion("News_Properties not like", value, "newsProperties");
            return (Criteria) this;
        }

        public Criteria andNewsPropertiesIn(List<String> values) {
            addCriterion("News_Properties in", values, "newsProperties");
            return (Criteria) this;
        }

        public Criteria andNewsPropertiesNotIn(List<String> values) {
            addCriterion("News_Properties not in", values, "newsProperties");
            return (Criteria) this;
        }

        public Criteria andNewsPropertiesBetween(String value1, String value2) {
            addCriterion("News_Properties between", value1, value2, "newsProperties");
            return (Criteria) this;
        }

        public Criteria andNewsPropertiesNotBetween(String value1, String value2) {
            addCriterion("News_Properties not between", value1, value2, "newsProperties");
            return (Criteria) this;
        }

        public Criteria andNewsSummeryIsNull() {
            addCriterion("News_Summery is null");
            return (Criteria) this;
        }

        public Criteria andNewsSummeryIsNotNull() {
            addCriterion("News_Summery is not null");
            return (Criteria) this;
        }

        public Criteria andNewsSummeryEqualTo(String value) {
            addCriterion("News_Summery =", value, "newsSummery");
            return (Criteria) this;
        }

        public Criteria andNewsSummeryNotEqualTo(String value) {
            addCriterion("News_Summery <>", value, "newsSummery");
            return (Criteria) this;
        }

        public Criteria andNewsSummeryGreaterThan(String value) {
            addCriterion("News_Summery >", value, "newsSummery");
            return (Criteria) this;
        }

        public Criteria andNewsSummeryGreaterThanOrEqualTo(String value) {
            addCriterion("News_Summery >=", value, "newsSummery");
            return (Criteria) this;
        }

        public Criteria andNewsSummeryLessThan(String value) {
            addCriterion("News_Summery <", value, "newsSummery");
            return (Criteria) this;
        }

        public Criteria andNewsSummeryLessThanOrEqualTo(String value) {
            addCriterion("News_Summery <=", value, "newsSummery");
            return (Criteria) this;
        }

        public Criteria andNewsSummeryLike(String value) {
            addCriterion("News_Summery like", value, "newsSummery");
            return (Criteria) this;
        }

        public Criteria andNewsSummeryNotLike(String value) {
            addCriterion("News_Summery not like", value, "newsSummery");
            return (Criteria) this;
        }

        public Criteria andNewsSummeryIn(List<String> values) {
            addCriterion("News_Summery in", values, "newsSummery");
            return (Criteria) this;
        }

        public Criteria andNewsSummeryNotIn(List<String> values) {
            addCriterion("News_Summery not in", values, "newsSummery");
            return (Criteria) this;
        }

        public Criteria andNewsSummeryBetween(String value1, String value2) {
            addCriterion("News_Summery between", value1, value2, "newsSummery");
            return (Criteria) this;
        }

        public Criteria andNewsSummeryNotBetween(String value1, String value2) {
            addCriterion("News_Summery not between", value1, value2, "newsSummery");
            return (Criteria) this;
        }

        public Criteria andNewsKeywordsIsNull() {
            addCriterion("News_Keywords is null");
            return (Criteria) this;
        }

        public Criteria andNewsKeywordsIsNotNull() {
            addCriterion("News_Keywords is not null");
            return (Criteria) this;
        }

        public Criteria andNewsKeywordsEqualTo(String value) {
            addCriterion("News_Keywords =", value, "newsKeywords");
            return (Criteria) this;
        }

        public Criteria andNewsKeywordsNotEqualTo(String value) {
            addCriterion("News_Keywords <>", value, "newsKeywords");
            return (Criteria) this;
        }

        public Criteria andNewsKeywordsGreaterThan(String value) {
            addCriterion("News_Keywords >", value, "newsKeywords");
            return (Criteria) this;
        }

        public Criteria andNewsKeywordsGreaterThanOrEqualTo(String value) {
            addCriterion("News_Keywords >=", value, "newsKeywords");
            return (Criteria) this;
        }

        public Criteria andNewsKeywordsLessThan(String value) {
            addCriterion("News_Keywords <", value, "newsKeywords");
            return (Criteria) this;
        }

        public Criteria andNewsKeywordsLessThanOrEqualTo(String value) {
            addCriterion("News_Keywords <=", value, "newsKeywords");
            return (Criteria) this;
        }

        public Criteria andNewsKeywordsLike(String value) {
            addCriterion("News_Keywords like", value, "newsKeywords");
            return (Criteria) this;
        }

        public Criteria andNewsKeywordsNotLike(String value) {
            addCriterion("News_Keywords not like", value, "newsKeywords");
            return (Criteria) this;
        }

        public Criteria andNewsKeywordsIn(List<String> values) {
            addCriterion("News_Keywords in", values, "newsKeywords");
            return (Criteria) this;
        }

        public Criteria andNewsKeywordsNotIn(List<String> values) {
            addCriterion("News_Keywords not in", values, "newsKeywords");
            return (Criteria) this;
        }

        public Criteria andNewsKeywordsBetween(String value1, String value2) {
            addCriterion("News_Keywords between", value1, value2, "newsKeywords");
            return (Criteria) this;
        }

        public Criteria andNewsKeywordsNotBetween(String value1, String value2) {
            addCriterion("News_Keywords not between", value1, value2, "newsKeywords");
            return (Criteria) this;
        }

        public Criteria andNewsHitsIsNull() {
            addCriterion("News_Hits is null");
            return (Criteria) this;
        }

        public Criteria andNewsHitsIsNotNull() {
            addCriterion("News_Hits is not null");
            return (Criteria) this;
        }

        public Criteria andNewsHitsEqualTo(Integer value) {
            addCriterion("News_Hits =", value, "newsHits");
            return (Criteria) this;
        }

        public Criteria andNewsHitsNotEqualTo(Integer value) {
            addCriterion("News_Hits <>", value, "newsHits");
            return (Criteria) this;
        }

        public Criteria andNewsHitsGreaterThan(Integer value) {
            addCriterion("News_Hits >", value, "newsHits");
            return (Criteria) this;
        }

        public Criteria andNewsHitsGreaterThanOrEqualTo(Integer value) {
            addCriterion("News_Hits >=", value, "newsHits");
            return (Criteria) this;
        }

        public Criteria andNewsHitsLessThan(Integer value) {
            addCriterion("News_Hits <", value, "newsHits");
            return (Criteria) this;
        }

        public Criteria andNewsHitsLessThanOrEqualTo(Integer value) {
            addCriterion("News_Hits <=", value, "newsHits");
            return (Criteria) this;
        }

        public Criteria andNewsHitsIn(List<Integer> values) {
            addCriterion("News_Hits in", values, "newsHits");
            return (Criteria) this;
        }

        public Criteria andNewsHitsNotIn(List<Integer> values) {
            addCriterion("News_Hits not in", values, "newsHits");
            return (Criteria) this;
        }

        public Criteria andNewsHitsBetween(Integer value1, Integer value2) {
            addCriterion("News_Hits between", value1, value2, "newsHits");
            return (Criteria) this;
        }

        public Criteria andNewsHitsNotBetween(Integer value1, Integer value2) {
            addCriterion("News_Hits not between", value1, value2, "newsHits");
            return (Criteria) this;
        }

        public Criteria andNewsUpdatetimeIsNull() {
            addCriterion("News_Updatetime is null");
            return (Criteria) this;
        }

        public Criteria andNewsUpdatetimeIsNotNull() {
            addCriterion("News_Updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andNewsUpdatetimeEqualTo(Date value) {
            addCriterion("News_Updatetime =", value, "newsUpdatetime");
            return (Criteria) this;
        }

        public Criteria andNewsUpdatetimeNotEqualTo(Date value) {
            addCriterion("News_Updatetime <>", value, "newsUpdatetime");
            return (Criteria) this;
        }

        public Criteria andNewsUpdatetimeGreaterThan(Date value) {
            addCriterion("News_Updatetime >", value, "newsUpdatetime");
            return (Criteria) this;
        }

        public Criteria andNewsUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("News_Updatetime >=", value, "newsUpdatetime");
            return (Criteria) this;
        }

        public Criteria andNewsUpdatetimeLessThan(Date value) {
            addCriterion("News_Updatetime <", value, "newsUpdatetime");
            return (Criteria) this;
        }

        public Criteria andNewsUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("News_Updatetime <=", value, "newsUpdatetime");
            return (Criteria) this;
        }

        public Criteria andNewsUpdatetimeIn(List<Date> values) {
            addCriterion("News_Updatetime in", values, "newsUpdatetime");
            return (Criteria) this;
        }

        public Criteria andNewsUpdatetimeNotIn(List<Date> values) {
            addCriterion("News_Updatetime not in", values, "newsUpdatetime");
            return (Criteria) this;
        }

        public Criteria andNewsUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("News_Updatetime between", value1, value2, "newsUpdatetime");
            return (Criteria) this;
        }

        public Criteria andNewsUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("News_Updatetime not between", value1, value2, "newsUpdatetime");
            return (Criteria) this;
        }

        public Criteria andNewsMenuidIsNull() {
            addCriterion("News_menuID is null");
            return (Criteria) this;
        }

        public Criteria andNewsMenuidIsNotNull() {
            addCriterion("News_menuID is not null");
            return (Criteria) this;
        }

        public Criteria andNewsMenuidEqualTo(Integer value) {
            addCriterion("News_menuID =", value, "newsMenuid");
            return (Criteria) this;
        }

        public Criteria andNewsMenuidNotEqualTo(Integer value) {
            addCriterion("News_menuID <>", value, "newsMenuid");
            return (Criteria) this;
        }

        public Criteria andNewsMenuidGreaterThan(Integer value) {
            addCriterion("News_menuID >", value, "newsMenuid");
            return (Criteria) this;
        }

        public Criteria andNewsMenuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("News_menuID >=", value, "newsMenuid");
            return (Criteria) this;
        }

        public Criteria andNewsMenuidLessThan(Integer value) {
            addCriterion("News_menuID <", value, "newsMenuid");
            return (Criteria) this;
        }

        public Criteria andNewsMenuidLessThanOrEqualTo(Integer value) {
            addCriterion("News_menuID <=", value, "newsMenuid");
            return (Criteria) this;
        }

        public Criteria andNewsMenuidIn(List<Integer> values) {
            addCriterion("News_menuID in", values, "newsMenuid");
            return (Criteria) this;
        }

        public Criteria andNewsMenuidNotIn(List<Integer> values) {
            addCriterion("News_menuID not in", values, "newsMenuid");
            return (Criteria) this;
        }

        public Criteria andNewsMenuidBetween(Integer value1, Integer value2) {
            addCriterion("News_menuID between", value1, value2, "newsMenuid");
            return (Criteria) this;
        }

        public Criteria andNewsMenuidNotBetween(Integer value1, Integer value2) {
            addCriterion("News_menuID not between", value1, value2, "newsMenuid");
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