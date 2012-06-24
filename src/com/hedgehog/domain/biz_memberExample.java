package com.hedgehog.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class biz_memberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public biz_memberExample() {
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

        public Criteria andMemberidIsNull() {
            addCriterion("memberID is null");
            return (Criteria) this;
        }

        public Criteria andMemberidIsNotNull() {
            addCriterion("memberID is not null");
            return (Criteria) this;
        }

        public Criteria andMemberidEqualTo(Integer value) {
            addCriterion("memberID =", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidNotEqualTo(Integer value) {
            addCriterion("memberID <>", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidGreaterThan(Integer value) {
            addCriterion("memberID >", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidGreaterThanOrEqualTo(Integer value) {
            addCriterion("memberID >=", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidLessThan(Integer value) {
            addCriterion("memberID <", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidLessThanOrEqualTo(Integer value) {
            addCriterion("memberID <=", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidIn(List<Integer> values) {
            addCriterion("memberID in", values, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidNotIn(List<Integer> values) {
            addCriterion("memberID not in", values, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidBetween(Integer value1, Integer value2) {
            addCriterion("memberID between", value1, value2, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidNotBetween(Integer value1, Integer value2) {
            addCriterion("memberID not between", value1, value2, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberNameIsNull() {
            addCriterion("member_Name is null");
            return (Criteria) this;
        }

        public Criteria andMemberNameIsNotNull() {
            addCriterion("member_Name is not null");
            return (Criteria) this;
        }

        public Criteria andMemberNameEqualTo(String value) {
            addCriterion("member_Name =", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotEqualTo(String value) {
            addCriterion("member_Name <>", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameGreaterThan(String value) {
            addCriterion("member_Name >", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameGreaterThanOrEqualTo(String value) {
            addCriterion("member_Name >=", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameLessThan(String value) {
            addCriterion("member_Name <", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameLessThanOrEqualTo(String value) {
            addCriterion("member_Name <=", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameLike(String value) {
            addCriterion("member_Name like", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotLike(String value) {
            addCriterion("member_Name not like", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameIn(List<String> values) {
            addCriterion("member_Name in", values, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotIn(List<String> values) {
            addCriterion("member_Name not in", values, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameBetween(String value1, String value2) {
            addCriterion("member_Name between", value1, value2, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotBetween(String value1, String value2) {
            addCriterion("member_Name not between", value1, value2, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberPwdIsNull() {
            addCriterion("member_Pwd is null");
            return (Criteria) this;
        }

        public Criteria andMemberPwdIsNotNull() {
            addCriterion("member_Pwd is not null");
            return (Criteria) this;
        }

        public Criteria andMemberPwdEqualTo(String value) {
            addCriterion("member_Pwd =", value, "memberPwd");
            return (Criteria) this;
        }

        public Criteria andMemberPwdNotEqualTo(String value) {
            addCriterion("member_Pwd <>", value, "memberPwd");
            return (Criteria) this;
        }

        public Criteria andMemberPwdGreaterThan(String value) {
            addCriterion("member_Pwd >", value, "memberPwd");
            return (Criteria) this;
        }

        public Criteria andMemberPwdGreaterThanOrEqualTo(String value) {
            addCriterion("member_Pwd >=", value, "memberPwd");
            return (Criteria) this;
        }

        public Criteria andMemberPwdLessThan(String value) {
            addCriterion("member_Pwd <", value, "memberPwd");
            return (Criteria) this;
        }

        public Criteria andMemberPwdLessThanOrEqualTo(String value) {
            addCriterion("member_Pwd <=", value, "memberPwd");
            return (Criteria) this;
        }

        public Criteria andMemberPwdLike(String value) {
            addCriterion("member_Pwd like", value, "memberPwd");
            return (Criteria) this;
        }

        public Criteria andMemberPwdNotLike(String value) {
            addCriterion("member_Pwd not like", value, "memberPwd");
            return (Criteria) this;
        }

        public Criteria andMemberPwdIn(List<String> values) {
            addCriterion("member_Pwd in", values, "memberPwd");
            return (Criteria) this;
        }

        public Criteria andMemberPwdNotIn(List<String> values) {
            addCriterion("member_Pwd not in", values, "memberPwd");
            return (Criteria) this;
        }

        public Criteria andMemberPwdBetween(String value1, String value2) {
            addCriterion("member_Pwd between", value1, value2, "memberPwd");
            return (Criteria) this;
        }

        public Criteria andMemberPwdNotBetween(String value1, String value2) {
            addCriterion("member_Pwd not between", value1, value2, "memberPwd");
            return (Criteria) this;
        }

        public Criteria andMemberRealnameIsNull() {
            addCriterion("member_RealName is null");
            return (Criteria) this;
        }

        public Criteria andMemberRealnameIsNotNull() {
            addCriterion("member_RealName is not null");
            return (Criteria) this;
        }

        public Criteria andMemberRealnameEqualTo(String value) {
            addCriterion("member_RealName =", value, "memberRealname");
            return (Criteria) this;
        }

        public Criteria andMemberRealnameNotEqualTo(String value) {
            addCriterion("member_RealName <>", value, "memberRealname");
            return (Criteria) this;
        }

        public Criteria andMemberRealnameGreaterThan(String value) {
            addCriterion("member_RealName >", value, "memberRealname");
            return (Criteria) this;
        }

        public Criteria andMemberRealnameGreaterThanOrEqualTo(String value) {
            addCriterion("member_RealName >=", value, "memberRealname");
            return (Criteria) this;
        }

        public Criteria andMemberRealnameLessThan(String value) {
            addCriterion("member_RealName <", value, "memberRealname");
            return (Criteria) this;
        }

        public Criteria andMemberRealnameLessThanOrEqualTo(String value) {
            addCriterion("member_RealName <=", value, "memberRealname");
            return (Criteria) this;
        }

        public Criteria andMemberRealnameLike(String value) {
            addCriterion("member_RealName like", value, "memberRealname");
            return (Criteria) this;
        }

        public Criteria andMemberRealnameNotLike(String value) {
            addCriterion("member_RealName not like", value, "memberRealname");
            return (Criteria) this;
        }

        public Criteria andMemberRealnameIn(List<String> values) {
            addCriterion("member_RealName in", values, "memberRealname");
            return (Criteria) this;
        }

        public Criteria andMemberRealnameNotIn(List<String> values) {
            addCriterion("member_RealName not in", values, "memberRealname");
            return (Criteria) this;
        }

        public Criteria andMemberRealnameBetween(String value1, String value2) {
            addCriterion("member_RealName between", value1, value2, "memberRealname");
            return (Criteria) this;
        }

        public Criteria andMemberRealnameNotBetween(String value1, String value2) {
            addCriterion("member_RealName not between", value1, value2, "memberRealname");
            return (Criteria) this;
        }

        public Criteria andMemberTelIsNull() {
            addCriterion("member_Tel is null");
            return (Criteria) this;
        }

        public Criteria andMemberTelIsNotNull() {
            addCriterion("member_Tel is not null");
            return (Criteria) this;
        }

        public Criteria andMemberTelEqualTo(String value) {
            addCriterion("member_Tel =", value, "memberTel");
            return (Criteria) this;
        }

        public Criteria andMemberTelNotEqualTo(String value) {
            addCriterion("member_Tel <>", value, "memberTel");
            return (Criteria) this;
        }

        public Criteria andMemberTelGreaterThan(String value) {
            addCriterion("member_Tel >", value, "memberTel");
            return (Criteria) this;
        }

        public Criteria andMemberTelGreaterThanOrEqualTo(String value) {
            addCriterion("member_Tel >=", value, "memberTel");
            return (Criteria) this;
        }

        public Criteria andMemberTelLessThan(String value) {
            addCriterion("member_Tel <", value, "memberTel");
            return (Criteria) this;
        }

        public Criteria andMemberTelLessThanOrEqualTo(String value) {
            addCriterion("member_Tel <=", value, "memberTel");
            return (Criteria) this;
        }

        public Criteria andMemberTelLike(String value) {
            addCriterion("member_Tel like", value, "memberTel");
            return (Criteria) this;
        }

        public Criteria andMemberTelNotLike(String value) {
            addCriterion("member_Tel not like", value, "memberTel");
            return (Criteria) this;
        }

        public Criteria andMemberTelIn(List<String> values) {
            addCriterion("member_Tel in", values, "memberTel");
            return (Criteria) this;
        }

        public Criteria andMemberTelNotIn(List<String> values) {
            addCriterion("member_Tel not in", values, "memberTel");
            return (Criteria) this;
        }

        public Criteria andMemberTelBetween(String value1, String value2) {
            addCriterion("member_Tel between", value1, value2, "memberTel");
            return (Criteria) this;
        }

        public Criteria andMemberTelNotBetween(String value1, String value2) {
            addCriterion("member_Tel not between", value1, value2, "memberTel");
            return (Criteria) this;
        }

        public Criteria andMemberCnameIsNull() {
            addCriterion("member_CName is null");
            return (Criteria) this;
        }

        public Criteria andMemberCnameIsNotNull() {
            addCriterion("member_CName is not null");
            return (Criteria) this;
        }

        public Criteria andMemberCnameEqualTo(String value) {
            addCriterion("member_CName =", value, "memberCname");
            return (Criteria) this;
        }

        public Criteria andMemberCnameNotEqualTo(String value) {
            addCriterion("member_CName <>", value, "memberCname");
            return (Criteria) this;
        }

        public Criteria andMemberCnameGreaterThan(String value) {
            addCriterion("member_CName >", value, "memberCname");
            return (Criteria) this;
        }

        public Criteria andMemberCnameGreaterThanOrEqualTo(String value) {
            addCriterion("member_CName >=", value, "memberCname");
            return (Criteria) this;
        }

        public Criteria andMemberCnameLessThan(String value) {
            addCriterion("member_CName <", value, "memberCname");
            return (Criteria) this;
        }

        public Criteria andMemberCnameLessThanOrEqualTo(String value) {
            addCriterion("member_CName <=", value, "memberCname");
            return (Criteria) this;
        }

        public Criteria andMemberCnameLike(String value) {
            addCriterion("member_CName like", value, "memberCname");
            return (Criteria) this;
        }

        public Criteria andMemberCnameNotLike(String value) {
            addCriterion("member_CName not like", value, "memberCname");
            return (Criteria) this;
        }

        public Criteria andMemberCnameIn(List<String> values) {
            addCriterion("member_CName in", values, "memberCname");
            return (Criteria) this;
        }

        public Criteria andMemberCnameNotIn(List<String> values) {
            addCriterion("member_CName not in", values, "memberCname");
            return (Criteria) this;
        }

        public Criteria andMemberCnameBetween(String value1, String value2) {
            addCriterion("member_CName between", value1, value2, "memberCname");
            return (Criteria) this;
        }

        public Criteria andMemberCnameNotBetween(String value1, String value2) {
            addCriterion("member_CName not between", value1, value2, "memberCname");
            return (Criteria) this;
        }

        public Criteria andMemberQqIsNull() {
            addCriterion("member_QQ is null");
            return (Criteria) this;
        }

        public Criteria andMemberQqIsNotNull() {
            addCriterion("member_QQ is not null");
            return (Criteria) this;
        }

        public Criteria andMemberQqEqualTo(String value) {
            addCriterion("member_QQ =", value, "memberQq");
            return (Criteria) this;
        }

        public Criteria andMemberQqNotEqualTo(String value) {
            addCriterion("member_QQ <>", value, "memberQq");
            return (Criteria) this;
        }

        public Criteria andMemberQqGreaterThan(String value) {
            addCriterion("member_QQ >", value, "memberQq");
            return (Criteria) this;
        }

        public Criteria andMemberQqGreaterThanOrEqualTo(String value) {
            addCriterion("member_QQ >=", value, "memberQq");
            return (Criteria) this;
        }

        public Criteria andMemberQqLessThan(String value) {
            addCriterion("member_QQ <", value, "memberQq");
            return (Criteria) this;
        }

        public Criteria andMemberQqLessThanOrEqualTo(String value) {
            addCriterion("member_QQ <=", value, "memberQq");
            return (Criteria) this;
        }

        public Criteria andMemberQqLike(String value) {
            addCriterion("member_QQ like", value, "memberQq");
            return (Criteria) this;
        }

        public Criteria andMemberQqNotLike(String value) {
            addCriterion("member_QQ not like", value, "memberQq");
            return (Criteria) this;
        }

        public Criteria andMemberQqIn(List<String> values) {
            addCriterion("member_QQ in", values, "memberQq");
            return (Criteria) this;
        }

        public Criteria andMemberQqNotIn(List<String> values) {
            addCriterion("member_QQ not in", values, "memberQq");
            return (Criteria) this;
        }

        public Criteria andMemberQqBetween(String value1, String value2) {
            addCriterion("member_QQ between", value1, value2, "memberQq");
            return (Criteria) this;
        }

        public Criteria andMemberQqNotBetween(String value1, String value2) {
            addCriterion("member_QQ not between", value1, value2, "memberQq");
            return (Criteria) this;
        }

        public Criteria andMemberEmailIsNull() {
            addCriterion("member_Email is null");
            return (Criteria) this;
        }

        public Criteria andMemberEmailIsNotNull() {
            addCriterion("member_Email is not null");
            return (Criteria) this;
        }

        public Criteria andMemberEmailEqualTo(String value) {
            addCriterion("member_Email =", value, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailNotEqualTo(String value) {
            addCriterion("member_Email <>", value, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailGreaterThan(String value) {
            addCriterion("member_Email >", value, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailGreaterThanOrEqualTo(String value) {
            addCriterion("member_Email >=", value, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailLessThan(String value) {
            addCriterion("member_Email <", value, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailLessThanOrEqualTo(String value) {
            addCriterion("member_Email <=", value, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailLike(String value) {
            addCriterion("member_Email like", value, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailNotLike(String value) {
            addCriterion("member_Email not like", value, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailIn(List<String> values) {
            addCriterion("member_Email in", values, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailNotIn(List<String> values) {
            addCriterion("member_Email not in", values, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailBetween(String value1, String value2) {
            addCriterion("member_Email between", value1, value2, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailNotBetween(String value1, String value2) {
            addCriterion("member_Email not between", value1, value2, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberRankIsNull() {
            addCriterion("member_Rank is null");
            return (Criteria) this;
        }

        public Criteria andMemberRankIsNotNull() {
            addCriterion("member_Rank is not null");
            return (Criteria) this;
        }

        public Criteria andMemberRankEqualTo(Integer value) {
            addCriterion("member_Rank =", value, "memberRank");
            return (Criteria) this;
        }

        public Criteria andMemberRankNotEqualTo(Integer value) {
            addCriterion("member_Rank <>", value, "memberRank");
            return (Criteria) this;
        }

        public Criteria andMemberRankGreaterThan(Integer value) {
            addCriterion("member_Rank >", value, "memberRank");
            return (Criteria) this;
        }

        public Criteria andMemberRankGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_Rank >=", value, "memberRank");
            return (Criteria) this;
        }

        public Criteria andMemberRankLessThan(Integer value) {
            addCriterion("member_Rank <", value, "memberRank");
            return (Criteria) this;
        }

        public Criteria andMemberRankLessThanOrEqualTo(Integer value) {
            addCriterion("member_Rank <=", value, "memberRank");
            return (Criteria) this;
        }

        public Criteria andMemberRankIn(List<Integer> values) {
            addCriterion("member_Rank in", values, "memberRank");
            return (Criteria) this;
        }

        public Criteria andMemberRankNotIn(List<Integer> values) {
            addCriterion("member_Rank not in", values, "memberRank");
            return (Criteria) this;
        }

        public Criteria andMemberRankBetween(Integer value1, Integer value2) {
            addCriterion("member_Rank between", value1, value2, "memberRank");
            return (Criteria) this;
        }

        public Criteria andMemberRankNotBetween(Integer value1, Integer value2) {
            addCriterion("member_Rank not between", value1, value2, "memberRank");
            return (Criteria) this;
        }

        public Criteria andMemberRegdateIsNull() {
            addCriterion("member_RegDate is null");
            return (Criteria) this;
        }

        public Criteria andMemberRegdateIsNotNull() {
            addCriterion("member_RegDate is not null");
            return (Criteria) this;
        }

        public Criteria andMemberRegdateEqualTo(Date value) {
            addCriterion("member_RegDate =", value, "memberRegdate");
            return (Criteria) this;
        }

        public Criteria andMemberRegdateNotEqualTo(Date value) {
            addCriterion("member_RegDate <>", value, "memberRegdate");
            return (Criteria) this;
        }

        public Criteria andMemberRegdateGreaterThan(Date value) {
            addCriterion("member_RegDate >", value, "memberRegdate");
            return (Criteria) this;
        }

        public Criteria andMemberRegdateGreaterThanOrEqualTo(Date value) {
            addCriterion("member_RegDate >=", value, "memberRegdate");
            return (Criteria) this;
        }

        public Criteria andMemberRegdateLessThan(Date value) {
            addCriterion("member_RegDate <", value, "memberRegdate");
            return (Criteria) this;
        }

        public Criteria andMemberRegdateLessThanOrEqualTo(Date value) {
            addCriterion("member_RegDate <=", value, "memberRegdate");
            return (Criteria) this;
        }

        public Criteria andMemberRegdateIn(List<Date> values) {
            addCriterion("member_RegDate in", values, "memberRegdate");
            return (Criteria) this;
        }

        public Criteria andMemberRegdateNotIn(List<Date> values) {
            addCriterion("member_RegDate not in", values, "memberRegdate");
            return (Criteria) this;
        }

        public Criteria andMemberRegdateBetween(Date value1, Date value2) {
            addCriterion("member_RegDate between", value1, value2, "memberRegdate");
            return (Criteria) this;
        }

        public Criteria andMemberRegdateNotBetween(Date value1, Date value2) {
            addCriterion("member_RegDate not between", value1, value2, "memberRegdate");
            return (Criteria) this;
        }

        public Criteria andMemberLockIsNull() {
            addCriterion("member_lock is null");
            return (Criteria) this;
        }

        public Criteria andMemberLockIsNotNull() {
            addCriterion("member_lock is not null");
            return (Criteria) this;
        }

        public Criteria andMemberLockEqualTo(Byte value) {
            addCriterion("member_lock =", value, "memberLock");
            return (Criteria) this;
        }

        public Criteria andMemberLockNotEqualTo(Byte value) {
            addCriterion("member_lock <>", value, "memberLock");
            return (Criteria) this;
        }

        public Criteria andMemberLockGreaterThan(Byte value) {
            addCriterion("member_lock >", value, "memberLock");
            return (Criteria) this;
        }

        public Criteria andMemberLockGreaterThanOrEqualTo(Byte value) {
            addCriterion("member_lock >=", value, "memberLock");
            return (Criteria) this;
        }

        public Criteria andMemberLockLessThan(Byte value) {
            addCriterion("member_lock <", value, "memberLock");
            return (Criteria) this;
        }

        public Criteria andMemberLockLessThanOrEqualTo(Byte value) {
            addCriterion("member_lock <=", value, "memberLock");
            return (Criteria) this;
        }

        public Criteria andMemberLockIn(List<Byte> values) {
            addCriterion("member_lock in", values, "memberLock");
            return (Criteria) this;
        }

        public Criteria andMemberLockNotIn(List<Byte> values) {
            addCriterion("member_lock not in", values, "memberLock");
            return (Criteria) this;
        }

        public Criteria andMemberLockBetween(Byte value1, Byte value2) {
            addCriterion("member_lock between", value1, value2, "memberLock");
            return (Criteria) this;
        }

        public Criteria andMemberLockNotBetween(Byte value1, Byte value2) {
            addCriterion("member_lock not between", value1, value2, "memberLock");
            return (Criteria) this;
        }

        public Criteria andMemberExpireIsNull() {
            addCriterion("member_expire is null");
            return (Criteria) this;
        }

        public Criteria andMemberExpireIsNotNull() {
            addCriterion("member_expire is not null");
            return (Criteria) this;
        }

        public Criteria andMemberExpireEqualTo(Date value) {
            addCriterion("member_expire =", value, "memberExpire");
            return (Criteria) this;
        }

        public Criteria andMemberExpireNotEqualTo(Date value) {
            addCriterion("member_expire <>", value, "memberExpire");
            return (Criteria) this;
        }

        public Criteria andMemberExpireGreaterThan(Date value) {
            addCriterion("member_expire >", value, "memberExpire");
            return (Criteria) this;
        }

        public Criteria andMemberExpireGreaterThanOrEqualTo(Date value) {
            addCriterion("member_expire >=", value, "memberExpire");
            return (Criteria) this;
        }

        public Criteria andMemberExpireLessThan(Date value) {
            addCriterion("member_expire <", value, "memberExpire");
            return (Criteria) this;
        }

        public Criteria andMemberExpireLessThanOrEqualTo(Date value) {
            addCriterion("member_expire <=", value, "memberExpire");
            return (Criteria) this;
        }

        public Criteria andMemberExpireIn(List<Date> values) {
            addCriterion("member_expire in", values, "memberExpire");
            return (Criteria) this;
        }

        public Criteria andMemberExpireNotIn(List<Date> values) {
            addCriterion("member_expire not in", values, "memberExpire");
            return (Criteria) this;
        }

        public Criteria andMemberExpireBetween(Date value1, Date value2) {
            addCriterion("member_expire between", value1, value2, "memberExpire");
            return (Criteria) this;
        }

        public Criteria andMemberExpireNotBetween(Date value1, Date value2) {
            addCriterion("member_expire not between", value1, value2, "memberExpire");
            return (Criteria) this;
        }

        public Criteria andMemberAgentnameIsNull() {
            addCriterion("member_AgentName is null");
            return (Criteria) this;
        }

        public Criteria andMemberAgentnameIsNotNull() {
            addCriterion("member_AgentName is not null");
            return (Criteria) this;
        }

        public Criteria andMemberAgentnameEqualTo(Integer value) {
            addCriterion("member_AgentName =", value, "memberAgentname");
            return (Criteria) this;
        }

        public Criteria andMemberAgentnameNotEqualTo(Integer value) {
            addCriterion("member_AgentName <>", value, "memberAgentname");
            return (Criteria) this;
        }

        public Criteria andMemberAgentnameGreaterThan(Integer value) {
            addCriterion("member_AgentName >", value, "memberAgentname");
            return (Criteria) this;
        }

        public Criteria andMemberAgentnameGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_AgentName >=", value, "memberAgentname");
            return (Criteria) this;
        }

        public Criteria andMemberAgentnameLessThan(Integer value) {
            addCriterion("member_AgentName <", value, "memberAgentname");
            return (Criteria) this;
        }

        public Criteria andMemberAgentnameLessThanOrEqualTo(Integer value) {
            addCriterion("member_AgentName <=", value, "memberAgentname");
            return (Criteria) this;
        }

        public Criteria andMemberAgentnameIn(List<Integer> values) {
            addCriterion("member_AgentName in", values, "memberAgentname");
            return (Criteria) this;
        }

        public Criteria andMemberAgentnameNotIn(List<Integer> values) {
            addCriterion("member_AgentName not in", values, "memberAgentname");
            return (Criteria) this;
        }

        public Criteria andMemberAgentnameBetween(Integer value1, Integer value2) {
            addCriterion("member_AgentName between", value1, value2, "memberAgentname");
            return (Criteria) this;
        }

        public Criteria andMemberAgentnameNotBetween(Integer value1, Integer value2) {
            addCriterion("member_AgentName not between", value1, value2, "memberAgentname");
            return (Criteria) this;
        }

        public Criteria andMemberLandloginIsNull() {
            addCriterion("member_landLogin is null");
            return (Criteria) this;
        }

        public Criteria andMemberLandloginIsNotNull() {
            addCriterion("member_landLogin is not null");
            return (Criteria) this;
        }

        public Criteria andMemberLandloginEqualTo(Date value) {
            addCriterion("member_landLogin =", value, "memberLandlogin");
            return (Criteria) this;
        }

        public Criteria andMemberLandloginNotEqualTo(Date value) {
            addCriterion("member_landLogin <>", value, "memberLandlogin");
            return (Criteria) this;
        }

        public Criteria andMemberLandloginGreaterThan(Date value) {
            addCriterion("member_landLogin >", value, "memberLandlogin");
            return (Criteria) this;
        }

        public Criteria andMemberLandloginGreaterThanOrEqualTo(Date value) {
            addCriterion("member_landLogin >=", value, "memberLandlogin");
            return (Criteria) this;
        }

        public Criteria andMemberLandloginLessThan(Date value) {
            addCriterion("member_landLogin <", value, "memberLandlogin");
            return (Criteria) this;
        }

        public Criteria andMemberLandloginLessThanOrEqualTo(Date value) {
            addCriterion("member_landLogin <=", value, "memberLandlogin");
            return (Criteria) this;
        }

        public Criteria andMemberLandloginIn(List<Date> values) {
            addCriterion("member_landLogin in", values, "memberLandlogin");
            return (Criteria) this;
        }

        public Criteria andMemberLandloginNotIn(List<Date> values) {
            addCriterion("member_landLogin not in", values, "memberLandlogin");
            return (Criteria) this;
        }

        public Criteria andMemberLandloginBetween(Date value1, Date value2) {
            addCriterion("member_landLogin between", value1, value2, "memberLandlogin");
            return (Criteria) this;
        }

        public Criteria andMemberLandloginNotBetween(Date value1, Date value2) {
            addCriterion("member_landLogin not between", value1, value2, "memberLandlogin");
            return (Criteria) this;
        }

        public Criteria andMemberLanguageIsNull() {
            addCriterion("member_language is null");
            return (Criteria) this;
        }

        public Criteria andMemberLanguageIsNotNull() {
            addCriterion("member_language is not null");
            return (Criteria) this;
        }

        public Criteria andMemberLanguageEqualTo(String value) {
            addCriterion("member_language =", value, "memberLanguage");
            return (Criteria) this;
        }

        public Criteria andMemberLanguageNotEqualTo(String value) {
            addCriterion("member_language <>", value, "memberLanguage");
            return (Criteria) this;
        }

        public Criteria andMemberLanguageGreaterThan(String value) {
            addCriterion("member_language >", value, "memberLanguage");
            return (Criteria) this;
        }

        public Criteria andMemberLanguageGreaterThanOrEqualTo(String value) {
            addCriterion("member_language >=", value, "memberLanguage");
            return (Criteria) this;
        }

        public Criteria andMemberLanguageLessThan(String value) {
            addCriterion("member_language <", value, "memberLanguage");
            return (Criteria) this;
        }

        public Criteria andMemberLanguageLessThanOrEqualTo(String value) {
            addCriterion("member_language <=", value, "memberLanguage");
            return (Criteria) this;
        }

        public Criteria andMemberLanguageLike(String value) {
            addCriterion("member_language like", value, "memberLanguage");
            return (Criteria) this;
        }

        public Criteria andMemberLanguageNotLike(String value) {
            addCriterion("member_language not like", value, "memberLanguage");
            return (Criteria) this;
        }

        public Criteria andMemberLanguageIn(List<String> values) {
            addCriterion("member_language in", values, "memberLanguage");
            return (Criteria) this;
        }

        public Criteria andMemberLanguageNotIn(List<String> values) {
            addCriterion("member_language not in", values, "memberLanguage");
            return (Criteria) this;
        }

        public Criteria andMemberLanguageBetween(String value1, String value2) {
            addCriterion("member_language between", value1, value2, "memberLanguage");
            return (Criteria) this;
        }

        public Criteria andMemberLanguageNotBetween(String value1, String value2) {
            addCriterion("member_language not between", value1, value2, "memberLanguage");
            return (Criteria) this;
        }

        public Criteria andMemberLamuIsNull() {
            addCriterion("member_lamu is null");
            return (Criteria) this;
        }

        public Criteria andMemberLamuIsNotNull() {
            addCriterion("member_lamu is not null");
            return (Criteria) this;
        }

        public Criteria andMemberLamuEqualTo(String value) {
            addCriterion("member_lamu =", value, "memberLamu");
            return (Criteria) this;
        }

        public Criteria andMemberLamuNotEqualTo(String value) {
            addCriterion("member_lamu <>", value, "memberLamu");
            return (Criteria) this;
        }

        public Criteria andMemberLamuGreaterThan(String value) {
            addCriterion("member_lamu >", value, "memberLamu");
            return (Criteria) this;
        }

        public Criteria andMemberLamuGreaterThanOrEqualTo(String value) {
            addCriterion("member_lamu >=", value, "memberLamu");
            return (Criteria) this;
        }

        public Criteria andMemberLamuLessThan(String value) {
            addCriterion("member_lamu <", value, "memberLamu");
            return (Criteria) this;
        }

        public Criteria andMemberLamuLessThanOrEqualTo(String value) {
            addCriterion("member_lamu <=", value, "memberLamu");
            return (Criteria) this;
        }

        public Criteria andMemberLamuLike(String value) {
            addCriterion("member_lamu like", value, "memberLamu");
            return (Criteria) this;
        }

        public Criteria andMemberLamuNotLike(String value) {
            addCriterion("member_lamu not like", value, "memberLamu");
            return (Criteria) this;
        }

        public Criteria andMemberLamuIn(List<String> values) {
            addCriterion("member_lamu in", values, "memberLamu");
            return (Criteria) this;
        }

        public Criteria andMemberLamuNotIn(List<String> values) {
            addCriterion("member_lamu not in", values, "memberLamu");
            return (Criteria) this;
        }

        public Criteria andMemberLamuBetween(String value1, String value2) {
            addCriterion("member_lamu between", value1, value2, "memberLamu");
            return (Criteria) this;
        }

        public Criteria andMemberLamuNotBetween(String value1, String value2) {
            addCriterion("member_lamu not between", value1, value2, "memberLamu");
            return (Criteria) this;
        }

        public Criteria andMemberLamucountIsNull() {
            addCriterion("member_lamucount is null");
            return (Criteria) this;
        }

        public Criteria andMemberLamucountIsNotNull() {
            addCriterion("member_lamucount is not null");
            return (Criteria) this;
        }

        public Criteria andMemberLamucountEqualTo(Integer value) {
            addCriterion("member_lamucount =", value, "memberLamucount");
            return (Criteria) this;
        }

        public Criteria andMemberLamucountNotEqualTo(Integer value) {
            addCriterion("member_lamucount <>", value, "memberLamucount");
            return (Criteria) this;
        }

        public Criteria andMemberLamucountGreaterThan(Integer value) {
            addCriterion("member_lamucount >", value, "memberLamucount");
            return (Criteria) this;
        }

        public Criteria andMemberLamucountGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_lamucount >=", value, "memberLamucount");
            return (Criteria) this;
        }

        public Criteria andMemberLamucountLessThan(Integer value) {
            addCriterion("member_lamucount <", value, "memberLamucount");
            return (Criteria) this;
        }

        public Criteria andMemberLamucountLessThanOrEqualTo(Integer value) {
            addCriterion("member_lamucount <=", value, "memberLamucount");
            return (Criteria) this;
        }

        public Criteria andMemberLamucountIn(List<Integer> values) {
            addCriterion("member_lamucount in", values, "memberLamucount");
            return (Criteria) this;
        }

        public Criteria andMemberLamucountNotIn(List<Integer> values) {
            addCriterion("member_lamucount not in", values, "memberLamucount");
            return (Criteria) this;
        }

        public Criteria andMemberLamucountBetween(Integer value1, Integer value2) {
            addCriterion("member_lamucount between", value1, value2, "memberLamucount");
            return (Criteria) this;
        }

        public Criteria andMemberLamucountNotBetween(Integer value1, Integer value2) {
            addCriterion("member_lamucount not between", value1, value2, "memberLamucount");
            return (Criteria) this;
        }

        public Criteria andMemberTempletIsNull() {
            addCriterion("member_templet is null");
            return (Criteria) this;
        }

        public Criteria andMemberTempletIsNotNull() {
            addCriterion("member_templet is not null");
            return (Criteria) this;
        }

        public Criteria andMemberTempletEqualTo(String value) {
            addCriterion("member_templet =", value, "memberTemplet");
            return (Criteria) this;
        }

        public Criteria andMemberTempletNotEqualTo(String value) {
            addCriterion("member_templet <>", value, "memberTemplet");
            return (Criteria) this;
        }

        public Criteria andMemberTempletGreaterThan(String value) {
            addCriterion("member_templet >", value, "memberTemplet");
            return (Criteria) this;
        }

        public Criteria andMemberTempletGreaterThanOrEqualTo(String value) {
            addCriterion("member_templet >=", value, "memberTemplet");
            return (Criteria) this;
        }

        public Criteria andMemberTempletLessThan(String value) {
            addCriterion("member_templet <", value, "memberTemplet");
            return (Criteria) this;
        }

        public Criteria andMemberTempletLessThanOrEqualTo(String value) {
            addCriterion("member_templet <=", value, "memberTemplet");
            return (Criteria) this;
        }

        public Criteria andMemberTempletLike(String value) {
            addCriterion("member_templet like", value, "memberTemplet");
            return (Criteria) this;
        }

        public Criteria andMemberTempletNotLike(String value) {
            addCriterion("member_templet not like", value, "memberTemplet");
            return (Criteria) this;
        }

        public Criteria andMemberTempletIn(List<String> values) {
            addCriterion("member_templet in", values, "memberTemplet");
            return (Criteria) this;
        }

        public Criteria andMemberTempletNotIn(List<String> values) {
            addCriterion("member_templet not in", values, "memberTemplet");
            return (Criteria) this;
        }

        public Criteria andMemberTempletBetween(String value1, String value2) {
            addCriterion("member_templet between", value1, value2, "memberTemplet");
            return (Criteria) this;
        }

        public Criteria andMemberTempletNotBetween(String value1, String value2) {
            addCriterion("member_templet not between", value1, value2, "memberTemplet");
            return (Criteria) this;
        }

        public Criteria andMemberMoneyIsNull() {
            addCriterion("member_money is null");
            return (Criteria) this;
        }

        public Criteria andMemberMoneyIsNotNull() {
            addCriterion("member_money is not null");
            return (Criteria) this;
        }

        public Criteria andMemberMoneyEqualTo(BigDecimal value) {
            addCriterion("member_money =", value, "memberMoney");
            return (Criteria) this;
        }

        public Criteria andMemberMoneyNotEqualTo(BigDecimal value) {
            addCriterion("member_money <>", value, "memberMoney");
            return (Criteria) this;
        }

        public Criteria andMemberMoneyGreaterThan(BigDecimal value) {
            addCriterion("member_money >", value, "memberMoney");
            return (Criteria) this;
        }

        public Criteria andMemberMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("member_money >=", value, "memberMoney");
            return (Criteria) this;
        }

        public Criteria andMemberMoneyLessThan(BigDecimal value) {
            addCriterion("member_money <", value, "memberMoney");
            return (Criteria) this;
        }

        public Criteria andMemberMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("member_money <=", value, "memberMoney");
            return (Criteria) this;
        }

        public Criteria andMemberMoneyIn(List<BigDecimal> values) {
            addCriterion("member_money in", values, "memberMoney");
            return (Criteria) this;
        }

        public Criteria andMemberMoneyNotIn(List<BigDecimal> values) {
            addCriterion("member_money not in", values, "memberMoney");
            return (Criteria) this;
        }

        public Criteria andMemberMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("member_money between", value1, value2, "memberMoney");
            return (Criteria) this;
        }

        public Criteria andMemberMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("member_money not between", value1, value2, "memberMoney");
            return (Criteria) this;
        }

        public Criteria andMemberWebpriceIsNull() {
            addCriterion("member_webprice is null");
            return (Criteria) this;
        }

        public Criteria andMemberWebpriceIsNotNull() {
            addCriterion("member_webprice is not null");
            return (Criteria) this;
        }

        public Criteria andMemberWebpriceEqualTo(BigDecimal value) {
            addCriterion("member_webprice =", value, "memberWebprice");
            return (Criteria) this;
        }

        public Criteria andMemberWebpriceNotEqualTo(BigDecimal value) {
            addCriterion("member_webprice <>", value, "memberWebprice");
            return (Criteria) this;
        }

        public Criteria andMemberWebpriceGreaterThan(BigDecimal value) {
            addCriterion("member_webprice >", value, "memberWebprice");
            return (Criteria) this;
        }

        public Criteria andMemberWebpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("member_webprice >=", value, "memberWebprice");
            return (Criteria) this;
        }

        public Criteria andMemberWebpriceLessThan(BigDecimal value) {
            addCriterion("member_webprice <", value, "memberWebprice");
            return (Criteria) this;
        }

        public Criteria andMemberWebpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("member_webprice <=", value, "memberWebprice");
            return (Criteria) this;
        }

        public Criteria andMemberWebpriceIn(List<BigDecimal> values) {
            addCriterion("member_webprice in", values, "memberWebprice");
            return (Criteria) this;
        }

        public Criteria andMemberWebpriceNotIn(List<BigDecimal> values) {
            addCriterion("member_webprice not in", values, "memberWebprice");
            return (Criteria) this;
        }

        public Criteria andMemberWebpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("member_webprice between", value1, value2, "memberWebprice");
            return (Criteria) this;
        }

        public Criteria andMemberWebpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("member_webprice not between", value1, value2, "memberWebprice");
            return (Criteria) this;
        }

        public Criteria andMemberWebserverIsNull() {
            addCriterion("member_webserver is null");
            return (Criteria) this;
        }

        public Criteria andMemberWebserverIsNotNull() {
            addCriterion("member_webserver is not null");
            return (Criteria) this;
        }

        public Criteria andMemberWebserverEqualTo(String value) {
            addCriterion("member_webserver =", value, "memberWebserver");
            return (Criteria) this;
        }

        public Criteria andMemberWebserverNotEqualTo(String value) {
            addCriterion("member_webserver <>", value, "memberWebserver");
            return (Criteria) this;
        }

        public Criteria andMemberWebserverGreaterThan(String value) {
            addCriterion("member_webserver >", value, "memberWebserver");
            return (Criteria) this;
        }

        public Criteria andMemberWebserverGreaterThanOrEqualTo(String value) {
            addCriterion("member_webserver >=", value, "memberWebserver");
            return (Criteria) this;
        }

        public Criteria andMemberWebserverLessThan(String value) {
            addCriterion("member_webserver <", value, "memberWebserver");
            return (Criteria) this;
        }

        public Criteria andMemberWebserverLessThanOrEqualTo(String value) {
            addCriterion("member_webserver <=", value, "memberWebserver");
            return (Criteria) this;
        }

        public Criteria andMemberWebserverLike(String value) {
            addCriterion("member_webserver like", value, "memberWebserver");
            return (Criteria) this;
        }

        public Criteria andMemberWebserverNotLike(String value) {
            addCriterion("member_webserver not like", value, "memberWebserver");
            return (Criteria) this;
        }

        public Criteria andMemberWebserverIn(List<String> values) {
            addCriterion("member_webserver in", values, "memberWebserver");
            return (Criteria) this;
        }

        public Criteria andMemberWebserverNotIn(List<String> values) {
            addCriterion("member_webserver not in", values, "memberWebserver");
            return (Criteria) this;
        }

        public Criteria andMemberWebserverBetween(String value1, String value2) {
            addCriterion("member_webserver between", value1, value2, "memberWebserver");
            return (Criteria) this;
        }

        public Criteria andMemberWebserverNotBetween(String value1, String value2) {
            addCriterion("member_webserver not between", value1, value2, "memberWebserver");
            return (Criteria) this;
        }

        public Criteria andMemberAdminserverIsNull() {
            addCriterion("member_adminserver is null");
            return (Criteria) this;
        }

        public Criteria andMemberAdminserverIsNotNull() {
            addCriterion("member_adminserver is not null");
            return (Criteria) this;
        }

        public Criteria andMemberAdminserverEqualTo(String value) {
            addCriterion("member_adminserver =", value, "memberAdminserver");
            return (Criteria) this;
        }

        public Criteria andMemberAdminserverNotEqualTo(String value) {
            addCriterion("member_adminserver <>", value, "memberAdminserver");
            return (Criteria) this;
        }

        public Criteria andMemberAdminserverGreaterThan(String value) {
            addCriterion("member_adminserver >", value, "memberAdminserver");
            return (Criteria) this;
        }

        public Criteria andMemberAdminserverGreaterThanOrEqualTo(String value) {
            addCriterion("member_adminserver >=", value, "memberAdminserver");
            return (Criteria) this;
        }

        public Criteria andMemberAdminserverLessThan(String value) {
            addCriterion("member_adminserver <", value, "memberAdminserver");
            return (Criteria) this;
        }

        public Criteria andMemberAdminserverLessThanOrEqualTo(String value) {
            addCriterion("member_adminserver <=", value, "memberAdminserver");
            return (Criteria) this;
        }

        public Criteria andMemberAdminserverLike(String value) {
            addCriterion("member_adminserver like", value, "memberAdminserver");
            return (Criteria) this;
        }

        public Criteria andMemberAdminserverNotLike(String value) {
            addCriterion("member_adminserver not like", value, "memberAdminserver");
            return (Criteria) this;
        }

        public Criteria andMemberAdminserverIn(List<String> values) {
            addCriterion("member_adminserver in", values, "memberAdminserver");
            return (Criteria) this;
        }

        public Criteria andMemberAdminserverNotIn(List<String> values) {
            addCriterion("member_adminserver not in", values, "memberAdminserver");
            return (Criteria) this;
        }

        public Criteria andMemberAdminserverBetween(String value1, String value2) {
            addCriterion("member_adminserver between", value1, value2, "memberAdminserver");
            return (Criteria) this;
        }

        public Criteria andMemberAdminserverNotBetween(String value1, String value2) {
            addCriterion("member_adminserver not between", value1, value2, "memberAdminserver");
            return (Criteria) this;
        }

        public Criteria andMemberTplockIsNull() {
            addCriterion("member_tplock is null");
            return (Criteria) this;
        }

        public Criteria andMemberTplockIsNotNull() {
            addCriterion("member_tplock is not null");
            return (Criteria) this;
        }

        public Criteria andMemberTplockEqualTo(Byte value) {
            addCriterion("member_tplock =", value, "memberTplock");
            return (Criteria) this;
        }

        public Criteria andMemberTplockNotEqualTo(Byte value) {
            addCriterion("member_tplock <>", value, "memberTplock");
            return (Criteria) this;
        }

        public Criteria andMemberTplockGreaterThan(Byte value) {
            addCriterion("member_tplock >", value, "memberTplock");
            return (Criteria) this;
        }

        public Criteria andMemberTplockGreaterThanOrEqualTo(Byte value) {
            addCriterion("member_tplock >=", value, "memberTplock");
            return (Criteria) this;
        }

        public Criteria andMemberTplockLessThan(Byte value) {
            addCriterion("member_tplock <", value, "memberTplock");
            return (Criteria) this;
        }

        public Criteria andMemberTplockLessThanOrEqualTo(Byte value) {
            addCriterion("member_tplock <=", value, "memberTplock");
            return (Criteria) this;
        }

        public Criteria andMemberTplockIn(List<Byte> values) {
            addCriterion("member_tplock in", values, "memberTplock");
            return (Criteria) this;
        }

        public Criteria andMemberTplockNotIn(List<Byte> values) {
            addCriterion("member_tplock not in", values, "memberTplock");
            return (Criteria) this;
        }

        public Criteria andMemberTplockBetween(Byte value1, Byte value2) {
            addCriterion("member_tplock between", value1, value2, "memberTplock");
            return (Criteria) this;
        }

        public Criteria andMemberTplockNotBetween(Byte value1, Byte value2) {
            addCriterion("member_tplock not between", value1, value2, "memberTplock");
            return (Criteria) this;
        }

        public Criteria andMemberPrankIsNull() {
            addCriterion("member_PRank is null");
            return (Criteria) this;
        }

        public Criteria andMemberPrankIsNotNull() {
            addCriterion("member_PRank is not null");
            return (Criteria) this;
        }

        public Criteria andMemberPrankEqualTo(Integer value) {
            addCriterion("member_PRank =", value, "memberPrank");
            return (Criteria) this;
        }

        public Criteria andMemberPrankNotEqualTo(Integer value) {
            addCriterion("member_PRank <>", value, "memberPrank");
            return (Criteria) this;
        }

        public Criteria andMemberPrankGreaterThan(Integer value) {
            addCriterion("member_PRank >", value, "memberPrank");
            return (Criteria) this;
        }

        public Criteria andMemberPrankGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_PRank >=", value, "memberPrank");
            return (Criteria) this;
        }

        public Criteria andMemberPrankLessThan(Integer value) {
            addCriterion("member_PRank <", value, "memberPrank");
            return (Criteria) this;
        }

        public Criteria andMemberPrankLessThanOrEqualTo(Integer value) {
            addCriterion("member_PRank <=", value, "memberPrank");
            return (Criteria) this;
        }

        public Criteria andMemberPrankIn(List<Integer> values) {
            addCriterion("member_PRank in", values, "memberPrank");
            return (Criteria) this;
        }

        public Criteria andMemberPrankNotIn(List<Integer> values) {
            addCriterion("member_PRank not in", values, "memberPrank");
            return (Criteria) this;
        }

        public Criteria andMemberPrankBetween(Integer value1, Integer value2) {
            addCriterion("member_PRank between", value1, value2, "memberPrank");
            return (Criteria) this;
        }

        public Criteria andMemberPrankNotBetween(Integer value1, Integer value2) {
            addCriterion("member_PRank not between", value1, value2, "memberPrank");
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