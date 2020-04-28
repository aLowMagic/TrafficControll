package com.example.demo.po;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andUSERIDIsNull() {
            addCriterion("USERID is null");
            return (Criteria) this;
        }

        public Criteria andUSERIDIsNotNull() {
            addCriterion("USERID is not null");
            return (Criteria) this;
        }

        public Criteria andUSERIDEqualTo(String value) {
            addCriterion("USERID =", value, "USERID");
            return (Criteria) this;
        }

        public Criteria andUSERIDNotEqualTo(String value) {
            addCriterion("USERID <>", value, "USERID");
            return (Criteria) this;
        }

        public Criteria andUSERIDGreaterThan(String value) {
            addCriterion("USERID >", value, "USERID");
            return (Criteria) this;
        }

        public Criteria andUSERIDGreaterThanOrEqualTo(String value) {
            addCriterion("USERID >=", value, "USERID");
            return (Criteria) this;
        }

        public Criteria andUSERIDLessThan(String value) {
            addCriterion("USERID <", value, "USERID");
            return (Criteria) this;
        }

        public Criteria andUSERIDLessThanOrEqualTo(String value) {
            addCriterion("USERID <=", value, "USERID");
            return (Criteria) this;
        }

        public Criteria andUSERIDLike(String value) {
            addCriterion("USERID like", value, "USERID");
            return (Criteria) this;
        }

        public Criteria andUSERIDNotLike(String value) {
            addCriterion("USERID not like", value, "USERID");
            return (Criteria) this;
        }

        public Criteria andUSERIDIn(List<String> values) {
            addCriterion("USERID in", values, "USERID");
            return (Criteria) this;
        }

        public Criteria andUSERIDNotIn(List<String> values) {
            addCriterion("USERID not in", values, "USERID");
            return (Criteria) this;
        }

        public Criteria andUSERIDBetween(String value1, String value2) {
            addCriterion("USERID between", value1, value2, "USERID");
            return (Criteria) this;
        }

        public Criteria andUSERIDNotBetween(String value1, String value2) {
            addCriterion("USERID not between", value1, value2, "USERID");
            return (Criteria) this;
        }

        public Criteria andUSERNAMEIsNull() {
            addCriterion("USERNAME is null");
            return (Criteria) this;
        }

        public Criteria andUSERNAMEIsNotNull() {
            addCriterion("USERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andUSERNAMEEqualTo(String value) {
            addCriterion("USERNAME =", value, "USERNAME");
            return (Criteria) this;
        }

        public Criteria andUSERNAMENotEqualTo(String value) {
            addCriterion("USERNAME <>", value, "USERNAME");
            return (Criteria) this;
        }

        public Criteria andUSERNAMEGreaterThan(String value) {
            addCriterion("USERNAME >", value, "USERNAME");
            return (Criteria) this;
        }

        public Criteria andUSERNAMEGreaterThanOrEqualTo(String value) {
            addCriterion("USERNAME >=", value, "USERNAME");
            return (Criteria) this;
        }

        public Criteria andUSERNAMELessThan(String value) {
            addCriterion("USERNAME <", value, "USERNAME");
            return (Criteria) this;
        }

        public Criteria andUSERNAMELessThanOrEqualTo(String value) {
            addCriterion("USERNAME <=", value, "USERNAME");
            return (Criteria) this;
        }

        public Criteria andUSERNAMELike(String value) {
            addCriterion("USERNAME like", value, "USERNAME");
            return (Criteria) this;
        }

        public Criteria andUSERNAMENotLike(String value) {
            addCriterion("USERNAME not like", value, "USERNAME");
            return (Criteria) this;
        }

        public Criteria andUSERNAMEIn(List<String> values) {
            addCriterion("USERNAME in", values, "USERNAME");
            return (Criteria) this;
        }

        public Criteria andUSERNAMENotIn(List<String> values) {
            addCriterion("USERNAME not in", values, "USERNAME");
            return (Criteria) this;
        }

        public Criteria andUSERNAMEBetween(String value1, String value2) {
            addCriterion("USERNAME between", value1, value2, "USERNAME");
            return (Criteria) this;
        }

        public Criteria andUSERNAMENotBetween(String value1, String value2) {
            addCriterion("USERNAME not between", value1, value2, "USERNAME");
            return (Criteria) this;
        }

        public Criteria andUSERPASSWORDIsNull() {
            addCriterion("USERPASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andUSERPASSWORDIsNotNull() {
            addCriterion("USERPASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andUSERPASSWORDEqualTo(String value) {
            addCriterion("USERPASSWORD =", value, "USERPASSWORD");
            return (Criteria) this;
        }

        public Criteria andUSERPASSWORDNotEqualTo(String value) {
            addCriterion("USERPASSWORD <>", value, "USERPASSWORD");
            return (Criteria) this;
        }

        public Criteria andUSERPASSWORDGreaterThan(String value) {
            addCriterion("USERPASSWORD >", value, "USERPASSWORD");
            return (Criteria) this;
        }

        public Criteria andUSERPASSWORDGreaterThanOrEqualTo(String value) {
            addCriterion("USERPASSWORD >=", value, "USERPASSWORD");
            return (Criteria) this;
        }

        public Criteria andUSERPASSWORDLessThan(String value) {
            addCriterion("USERPASSWORD <", value, "USERPASSWORD");
            return (Criteria) this;
        }

        public Criteria andUSERPASSWORDLessThanOrEqualTo(String value) {
            addCriterion("USERPASSWORD <=", value, "USERPASSWORD");
            return (Criteria) this;
        }

        public Criteria andUSERPASSWORDLike(String value) {
            addCriterion("USERPASSWORD like", value, "USERPASSWORD");
            return (Criteria) this;
        }

        public Criteria andUSERPASSWORDNotLike(String value) {
            addCriterion("USERPASSWORD not like", value, "USERPASSWORD");
            return (Criteria) this;
        }

        public Criteria andUSERPASSWORDIn(List<String> values) {
            addCriterion("USERPASSWORD in", values, "USERPASSWORD");
            return (Criteria) this;
        }

        public Criteria andUSERPASSWORDNotIn(List<String> values) {
            addCriterion("USERPASSWORD not in", values, "USERPASSWORD");
            return (Criteria) this;
        }

        public Criteria andUSERPASSWORDBetween(String value1, String value2) {
            addCriterion("USERPASSWORD between", value1, value2, "USERPASSWORD");
            return (Criteria) this;
        }

        public Criteria andUSERPASSWORDNotBetween(String value1, String value2) {
            addCriterion("USERPASSWORD not between", value1, value2, "USERPASSWORD");
            return (Criteria) this;
        }

        public Criteria andUSEREMAILIsNull() {
            addCriterion("USEREMAIL is null");
            return (Criteria) this;
        }

        public Criteria andUSEREMAILIsNotNull() {
            addCriterion("USEREMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andUSEREMAILEqualTo(String value) {
            addCriterion("USEREMAIL =", value, "USEREMAIL");
            return (Criteria) this;
        }

        public Criteria andUSEREMAILNotEqualTo(String value) {
            addCriterion("USEREMAIL <>", value, "USEREMAIL");
            return (Criteria) this;
        }

        public Criteria andUSEREMAILGreaterThan(String value) {
            addCriterion("USEREMAIL >", value, "USEREMAIL");
            return (Criteria) this;
        }

        public Criteria andUSEREMAILGreaterThanOrEqualTo(String value) {
            addCriterion("USEREMAIL >=", value, "USEREMAIL");
            return (Criteria) this;
        }

        public Criteria andUSEREMAILLessThan(String value) {
            addCriterion("USEREMAIL <", value, "USEREMAIL");
            return (Criteria) this;
        }

        public Criteria andUSEREMAILLessThanOrEqualTo(String value) {
            addCriterion("USEREMAIL <=", value, "USEREMAIL");
            return (Criteria) this;
        }

        public Criteria andUSEREMAILLike(String value) {
            addCriterion("USEREMAIL like", value, "USEREMAIL");
            return (Criteria) this;
        }

        public Criteria andUSEREMAILNotLike(String value) {
            addCriterion("USEREMAIL not like", value, "USEREMAIL");
            return (Criteria) this;
        }

        public Criteria andUSEREMAILIn(List<String> values) {
            addCriterion("USEREMAIL in", values, "USEREMAIL");
            return (Criteria) this;
        }

        public Criteria andUSEREMAILNotIn(List<String> values) {
            addCriterion("USEREMAIL not in", values, "USEREMAIL");
            return (Criteria) this;
        }

        public Criteria andUSEREMAILBetween(String value1, String value2) {
            addCriterion("USEREMAIL between", value1, value2, "USEREMAIL");
            return (Criteria) this;
        }

        public Criteria andUSEREMAILNotBetween(String value1, String value2) {
            addCriterion("USEREMAIL not between", value1, value2, "USEREMAIL");
            return (Criteria) this;
        }

        public Criteria andGENDERIsNull() {
            addCriterion("GENDER is null");
            return (Criteria) this;
        }

        public Criteria andGENDERIsNotNull() {
            addCriterion("GENDER is not null");
            return (Criteria) this;
        }

        public Criteria andGENDEREqualTo(String value) {
            addCriterion("GENDER =", value, "GENDER");
            return (Criteria) this;
        }

        public Criteria andGENDERNotEqualTo(String value) {
            addCriterion("GENDER <>", value, "GENDER");
            return (Criteria) this;
        }

        public Criteria andGENDERGreaterThan(String value) {
            addCriterion("GENDER >", value, "GENDER");
            return (Criteria) this;
        }

        public Criteria andGENDERGreaterThanOrEqualTo(String value) {
            addCriterion("GENDER >=", value, "GENDER");
            return (Criteria) this;
        }

        public Criteria andGENDERLessThan(String value) {
            addCriterion("GENDER <", value, "GENDER");
            return (Criteria) this;
        }

        public Criteria andGENDERLessThanOrEqualTo(String value) {
            addCriterion("GENDER <=", value, "GENDER");
            return (Criteria) this;
        }

        public Criteria andGENDERLike(String value) {
            addCriterion("GENDER like", value, "GENDER");
            return (Criteria) this;
        }

        public Criteria andGENDERNotLike(String value) {
            addCriterion("GENDER not like", value, "GENDER");
            return (Criteria) this;
        }

        public Criteria andGENDERIn(List<String> values) {
            addCriterion("GENDER in", values, "GENDER");
            return (Criteria) this;
        }

        public Criteria andGENDERNotIn(List<String> values) {
            addCriterion("GENDER not in", values, "GENDER");
            return (Criteria) this;
        }

        public Criteria andGENDERBetween(String value1, String value2) {
            addCriterion("GENDER between", value1, value2, "GENDER");
            return (Criteria) this;
        }

        public Criteria andGENDERNotBetween(String value1, String value2) {
            addCriterion("GENDER not between", value1, value2, "GENDER");
            return (Criteria) this;
        }

        public Criteria andUSERBIRTHDAYIsNull() {
            addCriterion("USERBIRTHDAY is null");
            return (Criteria) this;
        }

        public Criteria andUSERBIRTHDAYIsNotNull() {
            addCriterion("USERBIRTHDAY is not null");
            return (Criteria) this;
        }

        public Criteria andUSERBIRTHDAYEqualTo(String value) {
            addCriterion("USERBIRTHDAY =", value, "USERBIRTHDAY");
            return (Criteria) this;
        }

        public Criteria andUSERBIRTHDAYNotEqualTo(String value) {
            addCriterion("USERBIRTHDAY <>", value, "USERBIRTHDAY");
            return (Criteria) this;
        }

        public Criteria andUSERBIRTHDAYGreaterThan(String value) {
            addCriterion("USERBIRTHDAY >", value, "USERBIRTHDAY");
            return (Criteria) this;
        }

        public Criteria andUSERBIRTHDAYGreaterThanOrEqualTo(String value) {
            addCriterion("USERBIRTHDAY >=", value, "USERBIRTHDAY");
            return (Criteria) this;
        }

        public Criteria andUSERBIRTHDAYLessThan(String value) {
            addCriterion("USERBIRTHDAY <", value, "USERBIRTHDAY");
            return (Criteria) this;
        }

        public Criteria andUSERBIRTHDAYLessThanOrEqualTo(String value) {
            addCriterion("USERBIRTHDAY <=", value, "USERBIRTHDAY");
            return (Criteria) this;
        }

        public Criteria andUSERBIRTHDAYLike(String value) {
            addCriterion("USERBIRTHDAY like", value, "USERBIRTHDAY");
            return (Criteria) this;
        }

        public Criteria andUSERBIRTHDAYNotLike(String value) {
            addCriterion("USERBIRTHDAY not like", value, "USERBIRTHDAY");
            return (Criteria) this;
        }

        public Criteria andUSERBIRTHDAYIn(List<String> values) {
            addCriterion("USERBIRTHDAY in", values, "USERBIRTHDAY");
            return (Criteria) this;
        }

        public Criteria andUSERBIRTHDAYNotIn(List<String> values) {
            addCriterion("USERBIRTHDAY not in", values, "USERBIRTHDAY");
            return (Criteria) this;
        }

        public Criteria andUSERBIRTHDAYBetween(String value1, String value2) {
            addCriterion("USERBIRTHDAY between", value1, value2, "USERBIRTHDAY");
            return (Criteria) this;
        }

        public Criteria andUSERBIRTHDAYNotBetween(String value1, String value2) {
            addCriterion("USERBIRTHDAY not between", value1, value2, "USERBIRTHDAY");
            return (Criteria) this;
        }

        public Criteria andUSERADDRESSIsNull() {
            addCriterion("USERADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andUSERADDRESSIsNotNull() {
            addCriterion("USERADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andUSERADDRESSEqualTo(String value) {
            addCriterion("USERADDRESS =", value, "USERADDRESS");
            return (Criteria) this;
        }

        public Criteria andUSERADDRESSNotEqualTo(String value) {
            addCriterion("USERADDRESS <>", value, "USERADDRESS");
            return (Criteria) this;
        }

        public Criteria andUSERADDRESSGreaterThan(String value) {
            addCriterion("USERADDRESS >", value, "USERADDRESS");
            return (Criteria) this;
        }

        public Criteria andUSERADDRESSGreaterThanOrEqualTo(String value) {
            addCriterion("USERADDRESS >=", value, "USERADDRESS");
            return (Criteria) this;
        }

        public Criteria andUSERADDRESSLessThan(String value) {
            addCriterion("USERADDRESS <", value, "USERADDRESS");
            return (Criteria) this;
        }

        public Criteria andUSERADDRESSLessThanOrEqualTo(String value) {
            addCriterion("USERADDRESS <=", value, "USERADDRESS");
            return (Criteria) this;
        }

        public Criteria andUSERADDRESSLike(String value) {
            addCriterion("USERADDRESS like", value, "USERADDRESS");
            return (Criteria) this;
        }

        public Criteria andUSERADDRESSNotLike(String value) {
            addCriterion("USERADDRESS not like", value, "USERADDRESS");
            return (Criteria) this;
        }

        public Criteria andUSERADDRESSIn(List<String> values) {
            addCriterion("USERADDRESS in", values, "USERADDRESS");
            return (Criteria) this;
        }

        public Criteria andUSERADDRESSNotIn(List<String> values) {
            addCriterion("USERADDRESS not in", values, "USERADDRESS");
            return (Criteria) this;
        }

        public Criteria andUSERADDRESSBetween(String value1, String value2) {
            addCriterion("USERADDRESS between", value1, value2, "USERADDRESS");
            return (Criteria) this;
        }

        public Criteria andUSERADDRESSNotBetween(String value1, String value2) {
            addCriterion("USERADDRESS not between", value1, value2, "USERADDRESS");
            return (Criteria) this;
        }

        public Criteria andUSERSIGNATUREIsNull() {
            addCriterion("USERSIGNATURE is null");
            return (Criteria) this;
        }

        public Criteria andUSERSIGNATUREIsNotNull() {
            addCriterion("USERSIGNATURE is not null");
            return (Criteria) this;
        }

        public Criteria andUSERSIGNATUREEqualTo(String value) {
            addCriterion("USERSIGNATURE =", value, "USERSIGNATURE");
            return (Criteria) this;
        }

        public Criteria andUSERSIGNATURENotEqualTo(String value) {
            addCriterion("USERSIGNATURE <>", value, "USERSIGNATURE");
            return (Criteria) this;
        }

        public Criteria andUSERSIGNATUREGreaterThan(String value) {
            addCriterion("USERSIGNATURE >", value, "USERSIGNATURE");
            return (Criteria) this;
        }

        public Criteria andUSERSIGNATUREGreaterThanOrEqualTo(String value) {
            addCriterion("USERSIGNATURE >=", value, "USERSIGNATURE");
            return (Criteria) this;
        }

        public Criteria andUSERSIGNATURELessThan(String value) {
            addCriterion("USERSIGNATURE <", value, "USERSIGNATURE");
            return (Criteria) this;
        }

        public Criteria andUSERSIGNATURELessThanOrEqualTo(String value) {
            addCriterion("USERSIGNATURE <=", value, "USERSIGNATURE");
            return (Criteria) this;
        }

        public Criteria andUSERSIGNATURELike(String value) {
            addCriterion("USERSIGNATURE like", value, "USERSIGNATURE");
            return (Criteria) this;
        }

        public Criteria andUSERSIGNATURENotLike(String value) {
            addCriterion("USERSIGNATURE not like", value, "USERSIGNATURE");
            return (Criteria) this;
        }

        public Criteria andUSERSIGNATUREIn(List<String> values) {
            addCriterion("USERSIGNATURE in", values, "USERSIGNATURE");
            return (Criteria) this;
        }

        public Criteria andUSERSIGNATURENotIn(List<String> values) {
            addCriterion("USERSIGNATURE not in", values, "USERSIGNATURE");
            return (Criteria) this;
        }

        public Criteria andUSERSIGNATUREBetween(String value1, String value2) {
            addCriterion("USERSIGNATURE between", value1, value2, "USERSIGNATURE");
            return (Criteria) this;
        }

        public Criteria andUSERSIGNATURENotBetween(String value1, String value2) {
            addCriterion("USERSIGNATURE not between", value1, value2, "USERSIGNATURE");
            return (Criteria) this;
        }

        public Criteria andCREATETIMEIsNull() {
            addCriterion("CREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andCREATETIMEIsNotNull() {
            addCriterion("CREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andCREATETIMEEqualTo(String value) {
            addCriterion("CREATETIME =", value, "CREATETIME");
            return (Criteria) this;
        }

        public Criteria andCREATETIMENotEqualTo(String value) {
            addCriterion("CREATETIME <>", value, "CREATETIME");
            return (Criteria) this;
        }

        public Criteria andCREATETIMEGreaterThan(String value) {
            addCriterion("CREATETIME >", value, "CREATETIME");
            return (Criteria) this;
        }

        public Criteria andCREATETIMEGreaterThanOrEqualTo(String value) {
            addCriterion("CREATETIME >=", value, "CREATETIME");
            return (Criteria) this;
        }

        public Criteria andCREATETIMELessThan(String value) {
            addCriterion("CREATETIME <", value, "CREATETIME");
            return (Criteria) this;
        }

        public Criteria andCREATETIMELessThanOrEqualTo(String value) {
            addCriterion("CREATETIME <=", value, "CREATETIME");
            return (Criteria) this;
        }

        public Criteria andCREATETIMELike(String value) {
            addCriterion("CREATETIME like", value, "CREATETIME");
            return (Criteria) this;
        }

        public Criteria andCREATETIMENotLike(String value) {
            addCriterion("CREATETIME not like", value, "CREATETIME");
            return (Criteria) this;
        }

        public Criteria andCREATETIMEIn(List<String> values) {
            addCriterion("CREATETIME in", values, "CREATETIME");
            return (Criteria) this;
        }

        public Criteria andCREATETIMENotIn(List<String> values) {
            addCriterion("CREATETIME not in", values, "CREATETIME");
            return (Criteria) this;
        }

        public Criteria andCREATETIMEBetween(String value1, String value2) {
            addCriterion("CREATETIME between", value1, value2, "CREATETIME");
            return (Criteria) this;
        }

        public Criteria andCREATETIMENotBetween(String value1, String value2) {
            addCriterion("CREATETIME not between", value1, value2, "CREATETIME");
            return (Criteria) this;
        }

        public Criteria andROLEIDIsNull() {
            addCriterion("ROLEID is null");
            return (Criteria) this;
        }

        public Criteria andROLEIDIsNotNull() {
            addCriterion("ROLEID is not null");
            return (Criteria) this;
        }

        public Criteria andROLEIDEqualTo(String value) {
            addCriterion("ROLEID =", value, "ROLEID");
            return (Criteria) this;
        }

        public Criteria andROLEIDNotEqualTo(String value) {
            addCriterion("ROLEID <>", value, "ROLEID");
            return (Criteria) this;
        }

        public Criteria andROLEIDGreaterThan(String value) {
            addCriterion("ROLEID >", value, "ROLEID");
            return (Criteria) this;
        }

        public Criteria andROLEIDGreaterThanOrEqualTo(String value) {
            addCriterion("ROLEID >=", value, "ROLEID");
            return (Criteria) this;
        }

        public Criteria andROLEIDLessThan(String value) {
            addCriterion("ROLEID <", value, "ROLEID");
            return (Criteria) this;
        }

        public Criteria andROLEIDLessThanOrEqualTo(String value) {
            addCriterion("ROLEID <=", value, "ROLEID");
            return (Criteria) this;
        }

        public Criteria andROLEIDLike(String value) {
            addCriterion("ROLEID like", value, "ROLEID");
            return (Criteria) this;
        }

        public Criteria andROLEIDNotLike(String value) {
            addCriterion("ROLEID not like", value, "ROLEID");
            return (Criteria) this;
        }

        public Criteria andROLEIDIn(List<String> values) {
            addCriterion("ROLEID in", values, "ROLEID");
            return (Criteria) this;
        }

        public Criteria andROLEIDNotIn(List<String> values) {
            addCriterion("ROLEID not in", values, "ROLEID");
            return (Criteria) this;
        }

        public Criteria andROLEIDBetween(String value1, String value2) {
            addCriterion("ROLEID between", value1, value2, "ROLEID");
            return (Criteria) this;
        }

        public Criteria andROLEIDNotBetween(String value1, String value2) {
            addCriterion("ROLEID not between", value1, value2, "ROLEID");
            return (Criteria) this;
        }

        public Criteria andAVATARIsNull() {
            addCriterion("AVATAR is null");
            return (Criteria) this;
        }

        public Criteria andAVATARIsNotNull() {
            addCriterion("AVATAR is not null");
            return (Criteria) this;
        }

        public Criteria andAVATAREqualTo(String value) {
            addCriterion("AVATAR =", value, "AVATAR");
            return (Criteria) this;
        }

        public Criteria andAVATARNotEqualTo(String value) {
            addCriterion("AVATAR <>", value, "AVATAR");
            return (Criteria) this;
        }

        public Criteria andAVATARGreaterThan(String value) {
            addCriterion("AVATAR >", value, "AVATAR");
            return (Criteria) this;
        }

        public Criteria andAVATARGreaterThanOrEqualTo(String value) {
            addCriterion("AVATAR >=", value, "AVATAR");
            return (Criteria) this;
        }

        public Criteria andAVATARLessThan(String value) {
            addCriterion("AVATAR <", value, "AVATAR");
            return (Criteria) this;
        }

        public Criteria andAVATARLessThanOrEqualTo(String value) {
            addCriterion("AVATAR <=", value, "AVATAR");
            return (Criteria) this;
        }

        public Criteria andAVATARLike(String value) {
            addCriterion("AVATAR like", value, "AVATAR");
            return (Criteria) this;
        }

        public Criteria andAVATARNotLike(String value) {
            addCriterion("AVATAR not like", value, "AVATAR");
            return (Criteria) this;
        }

        public Criteria andAVATARIn(List<String> values) {
            addCriterion("AVATAR in", values, "AVATAR");
            return (Criteria) this;
        }

        public Criteria andAVATARNotIn(List<String> values) {
            addCriterion("AVATAR not in", values, "AVATAR");
            return (Criteria) this;
        }

        public Criteria andAVATARBetween(String value1, String value2) {
            addCriterion("AVATAR between", value1, value2, "AVATAR");
            return (Criteria) this;
        }

        public Criteria andAVATARNotBetween(String value1, String value2) {
            addCriterion("AVATAR not between", value1, value2, "AVATAR");
            return (Criteria) this;
        }

        public Criteria andUSERSTATEIsNull() {
            addCriterion("USERSTATE is null");
            return (Criteria) this;
        }

        public Criteria andUSERSTATEIsNotNull() {
            addCriterion("USERSTATE is not null");
            return (Criteria) this;
        }

        public Criteria andUSERSTATEEqualTo(Integer value) {
            addCriterion("USERSTATE =", value, "USERSTATE");
            return (Criteria) this;
        }

        public Criteria andUSERSTATENotEqualTo(Integer value) {
            addCriterion("USERSTATE <>", value, "USERSTATE");
            return (Criteria) this;
        }

        public Criteria andUSERSTATEGreaterThan(Integer value) {
            addCriterion("USERSTATE >", value, "USERSTATE");
            return (Criteria) this;
        }

        public Criteria andUSERSTATEGreaterThanOrEqualTo(Integer value) {
            addCriterion("USERSTATE >=", value, "USERSTATE");
            return (Criteria) this;
        }

        public Criteria andUSERSTATELessThan(Integer value) {
            addCriterion("USERSTATE <", value, "USERSTATE");
            return (Criteria) this;
        }

        public Criteria andUSERSTATELessThanOrEqualTo(Integer value) {
            addCriterion("USERSTATE <=", value, "USERSTATE");
            return (Criteria) this;
        }

        public Criteria andUSERSTATEIn(List<Integer> values) {
            addCriterion("USERSTATE in", values, "USERSTATE");
            return (Criteria) this;
        }

        public Criteria andUSERSTATENotIn(List<Integer> values) {
            addCriterion("USERSTATE not in", values, "USERSTATE");
            return (Criteria) this;
        }

        public Criteria andUSERSTATEBetween(Integer value1, Integer value2) {
            addCriterion("USERSTATE between", value1, value2, "USERSTATE");
            return (Criteria) this;
        }

        public Criteria andUSERSTATENotBetween(Integer value1, Integer value2) {
            addCriterion("USERSTATE not between", value1, value2, "USERSTATE");
            return (Criteria) this;
        }

        public Criteria andVERIFICATIONCODEIsNull() {
            addCriterion("VERIFICATIONCODE is null");
            return (Criteria) this;
        }

        public Criteria andVERIFICATIONCODEIsNotNull() {
            addCriterion("VERIFICATIONCODE is not null");
            return (Criteria) this;
        }

        public Criteria andVERIFICATIONCODEEqualTo(String value) {
            addCriterion("VERIFICATIONCODE =", value, "VERIFICATIONCODE");
            return (Criteria) this;
        }

        public Criteria andVERIFICATIONCODENotEqualTo(String value) {
            addCriterion("VERIFICATIONCODE <>", value, "VERIFICATIONCODE");
            return (Criteria) this;
        }

        public Criteria andVERIFICATIONCODEGreaterThan(String value) {
            addCriterion("VERIFICATIONCODE >", value, "VERIFICATIONCODE");
            return (Criteria) this;
        }

        public Criteria andVERIFICATIONCODEGreaterThanOrEqualTo(String value) {
            addCriterion("VERIFICATIONCODE >=", value, "VERIFICATIONCODE");
            return (Criteria) this;
        }

        public Criteria andVERIFICATIONCODELessThan(String value) {
            addCriterion("VERIFICATIONCODE <", value, "VERIFICATIONCODE");
            return (Criteria) this;
        }

        public Criteria andVERIFICATIONCODELessThanOrEqualTo(String value) {
            addCriterion("VERIFICATIONCODE <=", value, "VERIFICATIONCODE");
            return (Criteria) this;
        }

        public Criteria andVERIFICATIONCODELike(String value) {
            addCriterion("VERIFICATIONCODE like", value, "VERIFICATIONCODE");
            return (Criteria) this;
        }

        public Criteria andVERIFICATIONCODENotLike(String value) {
            addCriterion("VERIFICATIONCODE not like", value, "VERIFICATIONCODE");
            return (Criteria) this;
        }

        public Criteria andVERIFICATIONCODEIn(List<String> values) {
            addCriterion("VERIFICATIONCODE in", values, "VERIFICATIONCODE");
            return (Criteria) this;
        }

        public Criteria andVERIFICATIONCODENotIn(List<String> values) {
            addCriterion("VERIFICATIONCODE not in", values, "VERIFICATIONCODE");
            return (Criteria) this;
        }

        public Criteria andVERIFICATIONCODEBetween(String value1, String value2) {
            addCriterion("VERIFICATIONCODE between", value1, value2, "VERIFICATIONCODE");
            return (Criteria) this;
        }

        public Criteria andVERIFICATIONCODENotBetween(String value1, String value2) {
            addCriterion("VERIFICATIONCODE not between", value1, value2, "VERIFICATIONCODE");
            return (Criteria) this;
        }

        public Criteria andTIMEREMARKSIsNull() {
            addCriterion("TIMEREMARKS is null");
            return (Criteria) this;
        }

        public Criteria andTIMEREMARKSIsNotNull() {
            addCriterion("TIMEREMARKS is not null");
            return (Criteria) this;
        }

        public Criteria andTIMEREMARKSEqualTo(String value) {
            addCriterion("TIMEREMARKS =", value, "TIMEREMARKS");
            return (Criteria) this;
        }

        public Criteria andTIMEREMARKSNotEqualTo(String value) {
            addCriterion("TIMEREMARKS <>", value, "TIMEREMARKS");
            return (Criteria) this;
        }

        public Criteria andTIMEREMARKSGreaterThan(String value) {
            addCriterion("TIMEREMARKS >", value, "TIMEREMARKS");
            return (Criteria) this;
        }

        public Criteria andTIMEREMARKSGreaterThanOrEqualTo(String value) {
            addCriterion("TIMEREMARKS >=", value, "TIMEREMARKS");
            return (Criteria) this;
        }

        public Criteria andTIMEREMARKSLessThan(String value) {
            addCriterion("TIMEREMARKS <", value, "TIMEREMARKS");
            return (Criteria) this;
        }

        public Criteria andTIMEREMARKSLessThanOrEqualTo(String value) {
            addCriterion("TIMEREMARKS <=", value, "TIMEREMARKS");
            return (Criteria) this;
        }

        public Criteria andTIMEREMARKSLike(String value) {
            addCriterion("TIMEREMARKS like", value, "TIMEREMARKS");
            return (Criteria) this;
        }

        public Criteria andTIMEREMARKSNotLike(String value) {
            addCriterion("TIMEREMARKS not like", value, "TIMEREMARKS");
            return (Criteria) this;
        }

        public Criteria andTIMEREMARKSIn(List<String> values) {
            addCriterion("TIMEREMARKS in", values, "TIMEREMARKS");
            return (Criteria) this;
        }

        public Criteria andTIMEREMARKSNotIn(List<String> values) {
            addCriterion("TIMEREMARKS not in", values, "TIMEREMARKS");
            return (Criteria) this;
        }

        public Criteria andTIMEREMARKSBetween(String value1, String value2) {
            addCriterion("TIMEREMARKS between", value1, value2, "TIMEREMARKS");
            return (Criteria) this;
        }

        public Criteria andTIMEREMARKSNotBetween(String value1, String value2) {
            addCriterion("TIMEREMARKS not between", value1, value2, "TIMEREMARKS");
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