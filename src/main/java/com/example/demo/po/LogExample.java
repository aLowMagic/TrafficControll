package com.example.demo.po;

import java.util.ArrayList;
import java.util.List;

public class LogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LogExample() {
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

        public Criteria andLOGIDIsNull() {
            addCriterion("LOGID is null");
            return (Criteria) this;
        }

        public Criteria andLOGIDIsNotNull() {
            addCriterion("LOGID is not null");
            return (Criteria) this;
        }

        public Criteria andLOGIDEqualTo(String value) {
            addCriterion("LOGID =", value, "LOGID");
            return (Criteria) this;
        }

        public Criteria andLOGIDNotEqualTo(String value) {
            addCriterion("LOGID <>", value, "LOGID");
            return (Criteria) this;
        }

        public Criteria andLOGIDGreaterThan(String value) {
            addCriterion("LOGID >", value, "LOGID");
            return (Criteria) this;
        }

        public Criteria andLOGIDGreaterThanOrEqualTo(String value) {
            addCriterion("LOGID >=", value, "LOGID");
            return (Criteria) this;
        }

        public Criteria andLOGIDLessThan(String value) {
            addCriterion("LOGID <", value, "LOGID");
            return (Criteria) this;
        }

        public Criteria andLOGIDLessThanOrEqualTo(String value) {
            addCriterion("LOGID <=", value, "LOGID");
            return (Criteria) this;
        }

        public Criteria andLOGIDLike(String value) {
            addCriterion("LOGID like", value, "LOGID");
            return (Criteria) this;
        }

        public Criteria andLOGIDNotLike(String value) {
            addCriterion("LOGID not like", value, "LOGID");
            return (Criteria) this;
        }

        public Criteria andLOGIDIn(List<String> values) {
            addCriterion("LOGID in", values, "LOGID");
            return (Criteria) this;
        }

        public Criteria andLOGIDNotIn(List<String> values) {
            addCriterion("LOGID not in", values, "LOGID");
            return (Criteria) this;
        }

        public Criteria andLOGIDBetween(String value1, String value2) {
            addCriterion("LOGID between", value1, value2, "LOGID");
            return (Criteria) this;
        }

        public Criteria andLOGIDNotBetween(String value1, String value2) {
            addCriterion("LOGID not between", value1, value2, "LOGID");
            return (Criteria) this;
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

        public Criteria andLOGMETHODIsNull() {
            addCriterion("LOGMETHOD is null");
            return (Criteria) this;
        }

        public Criteria andLOGMETHODIsNotNull() {
            addCriterion("LOGMETHOD is not null");
            return (Criteria) this;
        }

        public Criteria andLOGMETHODEqualTo(String value) {
            addCriterion("LOGMETHOD =", value, "LOGMETHOD");
            return (Criteria) this;
        }

        public Criteria andLOGMETHODNotEqualTo(String value) {
            addCriterion("LOGMETHOD <>", value, "LOGMETHOD");
            return (Criteria) this;
        }

        public Criteria andLOGMETHODGreaterThan(String value) {
            addCriterion("LOGMETHOD >", value, "LOGMETHOD");
            return (Criteria) this;
        }

        public Criteria andLOGMETHODGreaterThanOrEqualTo(String value) {
            addCriterion("LOGMETHOD >=", value, "LOGMETHOD");
            return (Criteria) this;
        }

        public Criteria andLOGMETHODLessThan(String value) {
            addCriterion("LOGMETHOD <", value, "LOGMETHOD");
            return (Criteria) this;
        }

        public Criteria andLOGMETHODLessThanOrEqualTo(String value) {
            addCriterion("LOGMETHOD <=", value, "LOGMETHOD");
            return (Criteria) this;
        }

        public Criteria andLOGMETHODLike(String value) {
            addCriterion("LOGMETHOD like", value, "LOGMETHOD");
            return (Criteria) this;
        }

        public Criteria andLOGMETHODNotLike(String value) {
            addCriterion("LOGMETHOD not like", value, "LOGMETHOD");
            return (Criteria) this;
        }

        public Criteria andLOGMETHODIn(List<String> values) {
            addCriterion("LOGMETHOD in", values, "LOGMETHOD");
            return (Criteria) this;
        }

        public Criteria andLOGMETHODNotIn(List<String> values) {
            addCriterion("LOGMETHOD not in", values, "LOGMETHOD");
            return (Criteria) this;
        }

        public Criteria andLOGMETHODBetween(String value1, String value2) {
            addCriterion("LOGMETHOD between", value1, value2, "LOGMETHOD");
            return (Criteria) this;
        }

        public Criteria andLOGMETHODNotBetween(String value1, String value2) {
            addCriterion("LOGMETHOD not between", value1, value2, "LOGMETHOD");
            return (Criteria) this;
        }

        public Criteria andLOGTIMEIsNull() {
            addCriterion("LOGTIME is null");
            return (Criteria) this;
        }

        public Criteria andLOGTIMEIsNotNull() {
            addCriterion("LOGTIME is not null");
            return (Criteria) this;
        }

        public Criteria andLOGTIMEEqualTo(String value) {
            addCriterion("LOGTIME =", value, "LOGTIME");
            return (Criteria) this;
        }

        public Criteria andLOGTIMENotEqualTo(String value) {
            addCriterion("LOGTIME <>", value, "LOGTIME");
            return (Criteria) this;
        }

        public Criteria andLOGTIMEGreaterThan(String value) {
            addCriterion("LOGTIME >", value, "LOGTIME");
            return (Criteria) this;
        }

        public Criteria andLOGTIMEGreaterThanOrEqualTo(String value) {
            addCriterion("LOGTIME >=", value, "LOGTIME");
            return (Criteria) this;
        }

        public Criteria andLOGTIMELessThan(String value) {
            addCriterion("LOGTIME <", value, "LOGTIME");
            return (Criteria) this;
        }

        public Criteria andLOGTIMELessThanOrEqualTo(String value) {
            addCriterion("LOGTIME <=", value, "LOGTIME");
            return (Criteria) this;
        }

        public Criteria andLOGTIMELike(String value) {
            addCriterion("LOGTIME like", value, "LOGTIME");
            return (Criteria) this;
        }

        public Criteria andLOGTIMENotLike(String value) {
            addCriterion("LOGTIME not like", value, "LOGTIME");
            return (Criteria) this;
        }

        public Criteria andLOGTIMEIn(List<String> values) {
            addCriterion("LOGTIME in", values, "LOGTIME");
            return (Criteria) this;
        }

        public Criteria andLOGTIMENotIn(List<String> values) {
            addCriterion("LOGTIME not in", values, "LOGTIME");
            return (Criteria) this;
        }

        public Criteria andLOGTIMEBetween(String value1, String value2) {
            addCriterion("LOGTIME between", value1, value2, "LOGTIME");
            return (Criteria) this;
        }

        public Criteria andLOGTIMENotBetween(String value1, String value2) {
            addCriterion("LOGTIME not between", value1, value2, "LOGTIME");
            return (Criteria) this;
        }

        public Criteria andOPERATIONIsNull() {
            addCriterion("OPERATION is null");
            return (Criteria) this;
        }

        public Criteria andOPERATIONIsNotNull() {
            addCriterion("OPERATION is not null");
            return (Criteria) this;
        }

        public Criteria andOPERATIONEqualTo(String value) {
            addCriterion("OPERATION =", value, "OPERATION");
            return (Criteria) this;
        }

        public Criteria andOPERATIONNotEqualTo(String value) {
            addCriterion("OPERATION <>", value, "OPERATION");
            return (Criteria) this;
        }

        public Criteria andOPERATIONGreaterThan(String value) {
            addCriterion("OPERATION >", value, "OPERATION");
            return (Criteria) this;
        }

        public Criteria andOPERATIONGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATION >=", value, "OPERATION");
            return (Criteria) this;
        }

        public Criteria andOPERATIONLessThan(String value) {
            addCriterion("OPERATION <", value, "OPERATION");
            return (Criteria) this;
        }

        public Criteria andOPERATIONLessThanOrEqualTo(String value) {
            addCriterion("OPERATION <=", value, "OPERATION");
            return (Criteria) this;
        }

        public Criteria andOPERATIONLike(String value) {
            addCriterion("OPERATION like", value, "OPERATION");
            return (Criteria) this;
        }

        public Criteria andOPERATIONNotLike(String value) {
            addCriterion("OPERATION not like", value, "OPERATION");
            return (Criteria) this;
        }

        public Criteria andOPERATIONIn(List<String> values) {
            addCriterion("OPERATION in", values, "OPERATION");
            return (Criteria) this;
        }

        public Criteria andOPERATIONNotIn(List<String> values) {
            addCriterion("OPERATION not in", values, "OPERATION");
            return (Criteria) this;
        }

        public Criteria andOPERATIONBetween(String value1, String value2) {
            addCriterion("OPERATION between", value1, value2, "OPERATION");
            return (Criteria) this;
        }

        public Criteria andOPERATIONNotBetween(String value1, String value2) {
            addCriterion("OPERATION not between", value1, value2, "OPERATION");
            return (Criteria) this;
        }

        public Criteria andURLIsNull() {
            addCriterion("URL is null");
            return (Criteria) this;
        }

        public Criteria andURLIsNotNull() {
            addCriterion("URL is not null");
            return (Criteria) this;
        }

        public Criteria andURLEqualTo(String value) {
            addCriterion("URL =", value, "URL");
            return (Criteria) this;
        }

        public Criteria andURLNotEqualTo(String value) {
            addCriterion("URL <>", value, "URL");
            return (Criteria) this;
        }

        public Criteria andURLGreaterThan(String value) {
            addCriterion("URL >", value, "URL");
            return (Criteria) this;
        }

        public Criteria andURLGreaterThanOrEqualTo(String value) {
            addCriterion("URL >=", value, "URL");
            return (Criteria) this;
        }

        public Criteria andURLLessThan(String value) {
            addCriterion("URL <", value, "URL");
            return (Criteria) this;
        }

        public Criteria andURLLessThanOrEqualTo(String value) {
            addCriterion("URL <=", value, "URL");
            return (Criteria) this;
        }

        public Criteria andURLLike(String value) {
            addCriterion("URL like", value, "URL");
            return (Criteria) this;
        }

        public Criteria andURLNotLike(String value) {
            addCriterion("URL not like", value, "URL");
            return (Criteria) this;
        }

        public Criteria andURLIn(List<String> values) {
            addCriterion("URL in", values, "URL");
            return (Criteria) this;
        }

        public Criteria andURLNotIn(List<String> values) {
            addCriterion("URL not in", values, "URL");
            return (Criteria) this;
        }

        public Criteria andURLBetween(String value1, String value2) {
            addCriterion("URL between", value1, value2, "URL");
            return (Criteria) this;
        }

        public Criteria andURLNotBetween(String value1, String value2) {
            addCriterion("URL not between", value1, value2, "URL");
            return (Criteria) this;
        }

        public Criteria andIPIsNull() {
            addCriterion("IP is null");
            return (Criteria) this;
        }

        public Criteria andIPIsNotNull() {
            addCriterion("IP is not null");
            return (Criteria) this;
        }

        public Criteria andIPEqualTo(String value) {
            addCriterion("IP =", value, "IP");
            return (Criteria) this;
        }

        public Criteria andIPNotEqualTo(String value) {
            addCriterion("IP <>", value, "IP");
            return (Criteria) this;
        }

        public Criteria andIPGreaterThan(String value) {
            addCriterion("IP >", value, "IP");
            return (Criteria) this;
        }

        public Criteria andIPGreaterThanOrEqualTo(String value) {
            addCriterion("IP >=", value, "IP");
            return (Criteria) this;
        }

        public Criteria andIPLessThan(String value) {
            addCriterion("IP <", value, "IP");
            return (Criteria) this;
        }

        public Criteria andIPLessThanOrEqualTo(String value) {
            addCriterion("IP <=", value, "IP");
            return (Criteria) this;
        }

        public Criteria andIPLike(String value) {
            addCriterion("IP like", value, "IP");
            return (Criteria) this;
        }

        public Criteria andIPNotLike(String value) {
            addCriterion("IP not like", value, "IP");
            return (Criteria) this;
        }

        public Criteria andIPIn(List<String> values) {
            addCriterion("IP in", values, "IP");
            return (Criteria) this;
        }

        public Criteria andIPNotIn(List<String> values) {
            addCriterion("IP not in", values, "IP");
            return (Criteria) this;
        }

        public Criteria andIPBetween(String value1, String value2) {
            addCriterion("IP between", value1, value2, "IP");
            return (Criteria) this;
        }

        public Criteria andIPNotBetween(String value1, String value2) {
            addCriterion("IP not between", value1, value2, "IP");
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