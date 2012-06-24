package com.hedgehog.domain;

import java.util.ArrayList;
import java.util.List;

public class biz_templetExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public biz_templetExample() {
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

        public Criteria andTempletidIsNull() {
            addCriterion("TempletID is null");
            return (Criteria) this;
        }

        public Criteria andTempletidIsNotNull() {
            addCriterion("TempletID is not null");
            return (Criteria) this;
        }

        public Criteria andTempletidEqualTo(Integer value) {
            addCriterion("TempletID =", value, "templetid");
            return (Criteria) this;
        }

        public Criteria andTempletidNotEqualTo(Integer value) {
            addCriterion("TempletID <>", value, "templetid");
            return (Criteria) this;
        }

        public Criteria andTempletidGreaterThan(Integer value) {
            addCriterion("TempletID >", value, "templetid");
            return (Criteria) this;
        }

        public Criteria andTempletidGreaterThanOrEqualTo(Integer value) {
            addCriterion("TempletID >=", value, "templetid");
            return (Criteria) this;
        }

        public Criteria andTempletidLessThan(Integer value) {
            addCriterion("TempletID <", value, "templetid");
            return (Criteria) this;
        }

        public Criteria andTempletidLessThanOrEqualTo(Integer value) {
            addCriterion("TempletID <=", value, "templetid");
            return (Criteria) this;
        }

        public Criteria andTempletidIn(List<Integer> values) {
            addCriterion("TempletID in", values, "templetid");
            return (Criteria) this;
        }

        public Criteria andTempletidNotIn(List<Integer> values) {
            addCriterion("TempletID not in", values, "templetid");
            return (Criteria) this;
        }

        public Criteria andTempletidBetween(Integer value1, Integer value2) {
            addCriterion("TempletID between", value1, value2, "templetid");
            return (Criteria) this;
        }

        public Criteria andTempletidNotBetween(Integer value1, Integer value2) {
            addCriterion("TempletID not between", value1, value2, "templetid");
            return (Criteria) this;
        }

        public Criteria andTempletTypeIsNull() {
            addCriterion("Templet_Type is null");
            return (Criteria) this;
        }

        public Criteria andTempletTypeIsNotNull() {
            addCriterion("Templet_Type is not null");
            return (Criteria) this;
        }

        public Criteria andTempletTypeEqualTo(Integer value) {
            addCriterion("Templet_Type =", value, "templetType");
            return (Criteria) this;
        }

        public Criteria andTempletTypeNotEqualTo(Integer value) {
            addCriterion("Templet_Type <>", value, "templetType");
            return (Criteria) this;
        }

        public Criteria andTempletTypeGreaterThan(Integer value) {
            addCriterion("Templet_Type >", value, "templetType");
            return (Criteria) this;
        }

        public Criteria andTempletTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("Templet_Type >=", value, "templetType");
            return (Criteria) this;
        }

        public Criteria andTempletTypeLessThan(Integer value) {
            addCriterion("Templet_Type <", value, "templetType");
            return (Criteria) this;
        }

        public Criteria andTempletTypeLessThanOrEqualTo(Integer value) {
            addCriterion("Templet_Type <=", value, "templetType");
            return (Criteria) this;
        }

        public Criteria andTempletTypeIn(List<Integer> values) {
            addCriterion("Templet_Type in", values, "templetType");
            return (Criteria) this;
        }

        public Criteria andTempletTypeNotIn(List<Integer> values) {
            addCriterion("Templet_Type not in", values, "templetType");
            return (Criteria) this;
        }

        public Criteria andTempletTypeBetween(Integer value1, Integer value2) {
            addCriterion("Templet_Type between", value1, value2, "templetType");
            return (Criteria) this;
        }

        public Criteria andTempletTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("Templet_Type not between", value1, value2, "templetType");
            return (Criteria) this;
        }

        public Criteria andTempletNameIsNull() {
            addCriterion("Templet_Name is null");
            return (Criteria) this;
        }

        public Criteria andTempletNameIsNotNull() {
            addCriterion("Templet_Name is not null");
            return (Criteria) this;
        }

        public Criteria andTempletNameEqualTo(String value) {
            addCriterion("Templet_Name =", value, "templetName");
            return (Criteria) this;
        }

        public Criteria andTempletNameNotEqualTo(String value) {
            addCriterion("Templet_Name <>", value, "templetName");
            return (Criteria) this;
        }

        public Criteria andTempletNameGreaterThan(String value) {
            addCriterion("Templet_Name >", value, "templetName");
            return (Criteria) this;
        }

        public Criteria andTempletNameGreaterThanOrEqualTo(String value) {
            addCriterion("Templet_Name >=", value, "templetName");
            return (Criteria) this;
        }

        public Criteria andTempletNameLessThan(String value) {
            addCriterion("Templet_Name <", value, "templetName");
            return (Criteria) this;
        }

        public Criteria andTempletNameLessThanOrEqualTo(String value) {
            addCriterion("Templet_Name <=", value, "templetName");
            return (Criteria) this;
        }

        public Criteria andTempletNameLike(String value) {
            addCriterion("Templet_Name like", value, "templetName");
            return (Criteria) this;
        }

        public Criteria andTempletNameNotLike(String value) {
            addCriterion("Templet_Name not like", value, "templetName");
            return (Criteria) this;
        }

        public Criteria andTempletNameIn(List<String> values) {
            addCriterion("Templet_Name in", values, "templetName");
            return (Criteria) this;
        }

        public Criteria andTempletNameNotIn(List<String> values) {
            addCriterion("Templet_Name not in", values, "templetName");
            return (Criteria) this;
        }

        public Criteria andTempletNameBetween(String value1, String value2) {
            addCriterion("Templet_Name between", value1, value2, "templetName");
            return (Criteria) this;
        }

        public Criteria andTempletNameNotBetween(String value1, String value2) {
            addCriterion("Templet_Name not between", value1, value2, "templetName");
            return (Criteria) this;
        }

        public Criteria andTempletCodeIsNull() {
            addCriterion("Templet_Code is null");
            return (Criteria) this;
        }

        public Criteria andTempletCodeIsNotNull() {
            addCriterion("Templet_Code is not null");
            return (Criteria) this;
        }

        public Criteria andTempletCodeEqualTo(String value) {
            addCriterion("Templet_Code =", value, "templetCode");
            return (Criteria) this;
        }

        public Criteria andTempletCodeNotEqualTo(String value) {
            addCriterion("Templet_Code <>", value, "templetCode");
            return (Criteria) this;
        }

        public Criteria andTempletCodeGreaterThan(String value) {
            addCriterion("Templet_Code >", value, "templetCode");
            return (Criteria) this;
        }

        public Criteria andTempletCodeGreaterThanOrEqualTo(String value) {
            addCriterion("Templet_Code >=", value, "templetCode");
            return (Criteria) this;
        }

        public Criteria andTempletCodeLessThan(String value) {
            addCriterion("Templet_Code <", value, "templetCode");
            return (Criteria) this;
        }

        public Criteria andTempletCodeLessThanOrEqualTo(String value) {
            addCriterion("Templet_Code <=", value, "templetCode");
            return (Criteria) this;
        }

        public Criteria andTempletCodeLike(String value) {
            addCriterion("Templet_Code like", value, "templetCode");
            return (Criteria) this;
        }

        public Criteria andTempletCodeNotLike(String value) {
            addCriterion("Templet_Code not like", value, "templetCode");
            return (Criteria) this;
        }

        public Criteria andTempletCodeIn(List<String> values) {
            addCriterion("Templet_Code in", values, "templetCode");
            return (Criteria) this;
        }

        public Criteria andTempletCodeNotIn(List<String> values) {
            addCriterion("Templet_Code not in", values, "templetCode");
            return (Criteria) this;
        }

        public Criteria andTempletCodeBetween(String value1, String value2) {
            addCriterion("Templet_Code between", value1, value2, "templetCode");
            return (Criteria) this;
        }

        public Criteria andTempletCodeNotBetween(String value1, String value2) {
            addCriterion("Templet_Code not between", value1, value2, "templetCode");
            return (Criteria) this;
        }

        public Criteria andTempletIntroIsNull() {
            addCriterion("Templet_Intro is null");
            return (Criteria) this;
        }

        public Criteria andTempletIntroIsNotNull() {
            addCriterion("Templet_Intro is not null");
            return (Criteria) this;
        }

        public Criteria andTempletIntroEqualTo(String value) {
            addCriterion("Templet_Intro =", value, "templetIntro");
            return (Criteria) this;
        }

        public Criteria andTempletIntroNotEqualTo(String value) {
            addCriterion("Templet_Intro <>", value, "templetIntro");
            return (Criteria) this;
        }

        public Criteria andTempletIntroGreaterThan(String value) {
            addCriterion("Templet_Intro >", value, "templetIntro");
            return (Criteria) this;
        }

        public Criteria andTempletIntroGreaterThanOrEqualTo(String value) {
            addCriterion("Templet_Intro >=", value, "templetIntro");
            return (Criteria) this;
        }

        public Criteria andTempletIntroLessThan(String value) {
            addCriterion("Templet_Intro <", value, "templetIntro");
            return (Criteria) this;
        }

        public Criteria andTempletIntroLessThanOrEqualTo(String value) {
            addCriterion("Templet_Intro <=", value, "templetIntro");
            return (Criteria) this;
        }

        public Criteria andTempletIntroLike(String value) {
            addCriterion("Templet_Intro like", value, "templetIntro");
            return (Criteria) this;
        }

        public Criteria andTempletIntroNotLike(String value) {
            addCriterion("Templet_Intro not like", value, "templetIntro");
            return (Criteria) this;
        }

        public Criteria andTempletIntroIn(List<String> values) {
            addCriterion("Templet_Intro in", values, "templetIntro");
            return (Criteria) this;
        }

        public Criteria andTempletIntroNotIn(List<String> values) {
            addCriterion("Templet_Intro not in", values, "templetIntro");
            return (Criteria) this;
        }

        public Criteria andTempletIntroBetween(String value1, String value2) {
            addCriterion("Templet_Intro between", value1, value2, "templetIntro");
            return (Criteria) this;
        }

        public Criteria andTempletIntroNotBetween(String value1, String value2) {
            addCriterion("Templet_Intro not between", value1, value2, "templetIntro");
            return (Criteria) this;
        }

        public Criteria andTempletThumbsIsNull() {
            addCriterion("Templet_Thumbs is null");
            return (Criteria) this;
        }

        public Criteria andTempletThumbsIsNotNull() {
            addCriterion("Templet_Thumbs is not null");
            return (Criteria) this;
        }

        public Criteria andTempletThumbsEqualTo(String value) {
            addCriterion("Templet_Thumbs =", value, "templetThumbs");
            return (Criteria) this;
        }

        public Criteria andTempletThumbsNotEqualTo(String value) {
            addCriterion("Templet_Thumbs <>", value, "templetThumbs");
            return (Criteria) this;
        }

        public Criteria andTempletThumbsGreaterThan(String value) {
            addCriterion("Templet_Thumbs >", value, "templetThumbs");
            return (Criteria) this;
        }

        public Criteria andTempletThumbsGreaterThanOrEqualTo(String value) {
            addCriterion("Templet_Thumbs >=", value, "templetThumbs");
            return (Criteria) this;
        }

        public Criteria andTempletThumbsLessThan(String value) {
            addCriterion("Templet_Thumbs <", value, "templetThumbs");
            return (Criteria) this;
        }

        public Criteria andTempletThumbsLessThanOrEqualTo(String value) {
            addCriterion("Templet_Thumbs <=", value, "templetThumbs");
            return (Criteria) this;
        }

        public Criteria andTempletThumbsLike(String value) {
            addCriterion("Templet_Thumbs like", value, "templetThumbs");
            return (Criteria) this;
        }

        public Criteria andTempletThumbsNotLike(String value) {
            addCriterion("Templet_Thumbs not like", value, "templetThumbs");
            return (Criteria) this;
        }

        public Criteria andTempletThumbsIn(List<String> values) {
            addCriterion("Templet_Thumbs in", values, "templetThumbs");
            return (Criteria) this;
        }

        public Criteria andTempletThumbsNotIn(List<String> values) {
            addCriterion("Templet_Thumbs not in", values, "templetThumbs");
            return (Criteria) this;
        }

        public Criteria andTempletThumbsBetween(String value1, String value2) {
            addCriterion("Templet_Thumbs between", value1, value2, "templetThumbs");
            return (Criteria) this;
        }

        public Criteria andTempletThumbsNotBetween(String value1, String value2) {
            addCriterion("Templet_Thumbs not between", value1, value2, "templetThumbs");
            return (Criteria) this;
        }

        public Criteria andTempletMemberIsNull() {
            addCriterion("Templet_member is null");
            return (Criteria) this;
        }

        public Criteria andTempletMemberIsNotNull() {
            addCriterion("Templet_member is not null");
            return (Criteria) this;
        }

        public Criteria andTempletMemberEqualTo(Byte value) {
            addCriterion("Templet_member =", value, "templetMember");
            return (Criteria) this;
        }

        public Criteria andTempletMemberNotEqualTo(Byte value) {
            addCriterion("Templet_member <>", value, "templetMember");
            return (Criteria) this;
        }

        public Criteria andTempletMemberGreaterThan(Byte value) {
            addCriterion("Templet_member >", value, "templetMember");
            return (Criteria) this;
        }

        public Criteria andTempletMemberGreaterThanOrEqualTo(Byte value) {
            addCriterion("Templet_member >=", value, "templetMember");
            return (Criteria) this;
        }

        public Criteria andTempletMemberLessThan(Byte value) {
            addCriterion("Templet_member <", value, "templetMember");
            return (Criteria) this;
        }

        public Criteria andTempletMemberLessThanOrEqualTo(Byte value) {
            addCriterion("Templet_member <=", value, "templetMember");
            return (Criteria) this;
        }

        public Criteria andTempletMemberIn(List<Byte> values) {
            addCriterion("Templet_member in", values, "templetMember");
            return (Criteria) this;
        }

        public Criteria andTempletMemberNotIn(List<Byte> values) {
            addCriterion("Templet_member not in", values, "templetMember");
            return (Criteria) this;
        }

        public Criteria andTempletMemberBetween(Byte value1, Byte value2) {
            addCriterion("Templet_member between", value1, value2, "templetMember");
            return (Criteria) this;
        }

        public Criteria andTempletMemberNotBetween(Byte value1, Byte value2) {
            addCriterion("Templet_member not between", value1, value2, "templetMember");
            return (Criteria) this;
        }

        public Criteria andTempletVoteIsNull() {
            addCriterion("Templet_vote is null");
            return (Criteria) this;
        }

        public Criteria andTempletVoteIsNotNull() {
            addCriterion("Templet_vote is not null");
            return (Criteria) this;
        }

        public Criteria andTempletVoteEqualTo(Byte value) {
            addCriterion("Templet_vote =", value, "templetVote");
            return (Criteria) this;
        }

        public Criteria andTempletVoteNotEqualTo(Byte value) {
            addCriterion("Templet_vote <>", value, "templetVote");
            return (Criteria) this;
        }

        public Criteria andTempletVoteGreaterThan(Byte value) {
            addCriterion("Templet_vote >", value, "templetVote");
            return (Criteria) this;
        }

        public Criteria andTempletVoteGreaterThanOrEqualTo(Byte value) {
            addCriterion("Templet_vote >=", value, "templetVote");
            return (Criteria) this;
        }

        public Criteria andTempletVoteLessThan(Byte value) {
            addCriterion("Templet_vote <", value, "templetVote");
            return (Criteria) this;
        }

        public Criteria andTempletVoteLessThanOrEqualTo(Byte value) {
            addCriterion("Templet_vote <=", value, "templetVote");
            return (Criteria) this;
        }

        public Criteria andTempletVoteIn(List<Byte> values) {
            addCriterion("Templet_vote in", values, "templetVote");
            return (Criteria) this;
        }

        public Criteria andTempletVoteNotIn(List<Byte> values) {
            addCriterion("Templet_vote not in", values, "templetVote");
            return (Criteria) this;
        }

        public Criteria andTempletVoteBetween(Byte value1, Byte value2) {
            addCriterion("Templet_vote between", value1, value2, "templetVote");
            return (Criteria) this;
        }

        public Criteria andTempletVoteNotBetween(Byte value1, Byte value2) {
            addCriterion("Templet_vote not between", value1, value2, "templetVote");
            return (Criteria) this;
        }

        public Criteria andTempletLinkIsNull() {
            addCriterion("Templet_link is null");
            return (Criteria) this;
        }

        public Criteria andTempletLinkIsNotNull() {
            addCriterion("Templet_link is not null");
            return (Criteria) this;
        }

        public Criteria andTempletLinkEqualTo(Byte value) {
            addCriterion("Templet_link =", value, "templetLink");
            return (Criteria) this;
        }

        public Criteria andTempletLinkNotEqualTo(Byte value) {
            addCriterion("Templet_link <>", value, "templetLink");
            return (Criteria) this;
        }

        public Criteria andTempletLinkGreaterThan(Byte value) {
            addCriterion("Templet_link >", value, "templetLink");
            return (Criteria) this;
        }

        public Criteria andTempletLinkGreaterThanOrEqualTo(Byte value) {
            addCriterion("Templet_link >=", value, "templetLink");
            return (Criteria) this;
        }

        public Criteria andTempletLinkLessThan(Byte value) {
            addCriterion("Templet_link <", value, "templetLink");
            return (Criteria) this;
        }

        public Criteria andTempletLinkLessThanOrEqualTo(Byte value) {
            addCriterion("Templet_link <=", value, "templetLink");
            return (Criteria) this;
        }

        public Criteria andTempletLinkIn(List<Byte> values) {
            addCriterion("Templet_link in", values, "templetLink");
            return (Criteria) this;
        }

        public Criteria andTempletLinkNotIn(List<Byte> values) {
            addCriterion("Templet_link not in", values, "templetLink");
            return (Criteria) this;
        }

        public Criteria andTempletLinkBetween(Byte value1, Byte value2) {
            addCriterion("Templet_link between", value1, value2, "templetLink");
            return (Criteria) this;
        }

        public Criteria andTempletLinkNotBetween(Byte value1, Byte value2) {
            addCriterion("Templet_link not between", value1, value2, "templetLink");
            return (Criteria) this;
        }

        public Criteria andTempletServerIsNull() {
            addCriterion("Templet_server is null");
            return (Criteria) this;
        }

        public Criteria andTempletServerIsNotNull() {
            addCriterion("Templet_server is not null");
            return (Criteria) this;
        }

        public Criteria andTempletServerEqualTo(String value) {
            addCriterion("Templet_server =", value, "templetServer");
            return (Criteria) this;
        }

        public Criteria andTempletServerNotEqualTo(String value) {
            addCriterion("Templet_server <>", value, "templetServer");
            return (Criteria) this;
        }

        public Criteria andTempletServerGreaterThan(String value) {
            addCriterion("Templet_server >", value, "templetServer");
            return (Criteria) this;
        }

        public Criteria andTempletServerGreaterThanOrEqualTo(String value) {
            addCriterion("Templet_server >=", value, "templetServer");
            return (Criteria) this;
        }

        public Criteria andTempletServerLessThan(String value) {
            addCriterion("Templet_server <", value, "templetServer");
            return (Criteria) this;
        }

        public Criteria andTempletServerLessThanOrEqualTo(String value) {
            addCriterion("Templet_server <=", value, "templetServer");
            return (Criteria) this;
        }

        public Criteria andTempletServerLike(String value) {
            addCriterion("Templet_server like", value, "templetServer");
            return (Criteria) this;
        }

        public Criteria andTempletServerNotLike(String value) {
            addCriterion("Templet_server not like", value, "templetServer");
            return (Criteria) this;
        }

        public Criteria andTempletServerIn(List<String> values) {
            addCriterion("Templet_server in", values, "templetServer");
            return (Criteria) this;
        }

        public Criteria andTempletServerNotIn(List<String> values) {
            addCriterion("Templet_server not in", values, "templetServer");
            return (Criteria) this;
        }

        public Criteria andTempletServerBetween(String value1, String value2) {
            addCriterion("Templet_server between", value1, value2, "templetServer");
            return (Criteria) this;
        }

        public Criteria andTempletServerNotBetween(String value1, String value2) {
            addCriterion("Templet_server not between", value1, value2, "templetServer");
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