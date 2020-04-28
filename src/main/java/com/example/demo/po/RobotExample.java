package com.example.demo.po;

import java.util.ArrayList;
import java.util.List;

public class RobotExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RobotExample() {
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

        public Criteria andROBOTIDIsNull() {
            addCriterion("ROBOTID is null");
            return (Criteria) this;
        }

        public Criteria andROBOTIDIsNotNull() {
            addCriterion("ROBOTID is not null");
            return (Criteria) this;
        }

        public Criteria andROBOTIDEqualTo(String value) {
            addCriterion("ROBOTID =", value, "ROBOTID");
            return (Criteria) this;
        }

        public Criteria andROBOTIDNotEqualTo(String value) {
            addCriterion("ROBOTID <>", value, "ROBOTID");
            return (Criteria) this;
        }

        public Criteria andROBOTIDGreaterThan(String value) {
            addCriterion("ROBOTID >", value, "ROBOTID");
            return (Criteria) this;
        }

        public Criteria andROBOTIDGreaterThanOrEqualTo(String value) {
            addCriterion("ROBOTID >=", value, "ROBOTID");
            return (Criteria) this;
        }

        public Criteria andROBOTIDLessThan(String value) {
            addCriterion("ROBOTID <", value, "ROBOTID");
            return (Criteria) this;
        }

        public Criteria andROBOTIDLessThanOrEqualTo(String value) {
            addCriterion("ROBOTID <=", value, "ROBOTID");
            return (Criteria) this;
        }

        public Criteria andROBOTIDLike(String value) {
            addCriterion("ROBOTID like", value, "ROBOTID");
            return (Criteria) this;
        }

        public Criteria andROBOTIDNotLike(String value) {
            addCriterion("ROBOTID not like", value, "ROBOTID");
            return (Criteria) this;
        }

        public Criteria andROBOTIDIn(List<String> values) {
            addCriterion("ROBOTID in", values, "ROBOTID");
            return (Criteria) this;
        }

        public Criteria andROBOTIDNotIn(List<String> values) {
            addCriterion("ROBOTID not in", values, "ROBOTID");
            return (Criteria) this;
        }

        public Criteria andROBOTIDBetween(String value1, String value2) {
            addCriterion("ROBOTID between", value1, value2, "ROBOTID");
            return (Criteria) this;
        }

        public Criteria andROBOTIDNotBetween(String value1, String value2) {
            addCriterion("ROBOTID not between", value1, value2, "ROBOTID");
            return (Criteria) this;
        }

        public Criteria andROBOTNAMEIsNull() {
            addCriterion("ROBOTNAME is null");
            return (Criteria) this;
        }

        public Criteria andROBOTNAMEIsNotNull() {
            addCriterion("ROBOTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andROBOTNAMEEqualTo(String value) {
            addCriterion("ROBOTNAME =", value, "ROBOTNAME");
            return (Criteria) this;
        }

        public Criteria andROBOTNAMENotEqualTo(String value) {
            addCriterion("ROBOTNAME <>", value, "ROBOTNAME");
            return (Criteria) this;
        }

        public Criteria andROBOTNAMEGreaterThan(String value) {
            addCriterion("ROBOTNAME >", value, "ROBOTNAME");
            return (Criteria) this;
        }

        public Criteria andROBOTNAMEGreaterThanOrEqualTo(String value) {
            addCriterion("ROBOTNAME >=", value, "ROBOTNAME");
            return (Criteria) this;
        }

        public Criteria andROBOTNAMELessThan(String value) {
            addCriterion("ROBOTNAME <", value, "ROBOTNAME");
            return (Criteria) this;
        }

        public Criteria andROBOTNAMELessThanOrEqualTo(String value) {
            addCriterion("ROBOTNAME <=", value, "ROBOTNAME");
            return (Criteria) this;
        }

        public Criteria andROBOTNAMELike(String value) {
            addCriterion("ROBOTNAME like", value, "ROBOTNAME");
            return (Criteria) this;
        }

        public Criteria andROBOTNAMENotLike(String value) {
            addCriterion("ROBOTNAME not like", value, "ROBOTNAME");
            return (Criteria) this;
        }

        public Criteria andROBOTNAMEIn(List<String> values) {
            addCriterion("ROBOTNAME in", values, "ROBOTNAME");
            return (Criteria) this;
        }

        public Criteria andROBOTNAMENotIn(List<String> values) {
            addCriterion("ROBOTNAME not in", values, "ROBOTNAME");
            return (Criteria) this;
        }

        public Criteria andROBOTNAMEBetween(String value1, String value2) {
            addCriterion("ROBOTNAME between", value1, value2, "ROBOTNAME");
            return (Criteria) this;
        }

        public Criteria andROBOTNAMENotBetween(String value1, String value2) {
            addCriterion("ROBOTNAME not between", value1, value2, "ROBOTNAME");
            return (Criteria) this;
        }

        public Criteria andROBOTIMAGEIsNull() {
            addCriterion("ROBOTIMAGE is null");
            return (Criteria) this;
        }

        public Criteria andROBOTIMAGEIsNotNull() {
            addCriterion("ROBOTIMAGE is not null");
            return (Criteria) this;
        }

        public Criteria andROBOTIMAGEEqualTo(String value) {
            addCriterion("ROBOTIMAGE =", value, "ROBOTIMAGE");
            return (Criteria) this;
        }

        public Criteria andROBOTIMAGENotEqualTo(String value) {
            addCriterion("ROBOTIMAGE <>", value, "ROBOTIMAGE");
            return (Criteria) this;
        }

        public Criteria andROBOTIMAGEGreaterThan(String value) {
            addCriterion("ROBOTIMAGE >", value, "ROBOTIMAGE");
            return (Criteria) this;
        }

        public Criteria andROBOTIMAGEGreaterThanOrEqualTo(String value) {
            addCriterion("ROBOTIMAGE >=", value, "ROBOTIMAGE");
            return (Criteria) this;
        }

        public Criteria andROBOTIMAGELessThan(String value) {
            addCriterion("ROBOTIMAGE <", value, "ROBOTIMAGE");
            return (Criteria) this;
        }

        public Criteria andROBOTIMAGELessThanOrEqualTo(String value) {
            addCriterion("ROBOTIMAGE <=", value, "ROBOTIMAGE");
            return (Criteria) this;
        }

        public Criteria andROBOTIMAGELike(String value) {
            addCriterion("ROBOTIMAGE like", value, "ROBOTIMAGE");
            return (Criteria) this;
        }

        public Criteria andROBOTIMAGENotLike(String value) {
            addCriterion("ROBOTIMAGE not like", value, "ROBOTIMAGE");
            return (Criteria) this;
        }

        public Criteria andROBOTIMAGEIn(List<String> values) {
            addCriterion("ROBOTIMAGE in", values, "ROBOTIMAGE");
            return (Criteria) this;
        }

        public Criteria andROBOTIMAGENotIn(List<String> values) {
            addCriterion("ROBOTIMAGE not in", values, "ROBOTIMAGE");
            return (Criteria) this;
        }

        public Criteria andROBOTIMAGEBetween(String value1, String value2) {
            addCriterion("ROBOTIMAGE between", value1, value2, "ROBOTIMAGE");
            return (Criteria) this;
        }

        public Criteria andROBOTIMAGENotBetween(String value1, String value2) {
            addCriterion("ROBOTIMAGE not between", value1, value2, "ROBOTIMAGE");
            return (Criteria) this;
        }

        public Criteria andROBOTINTRODUCTIONIsNull() {
            addCriterion("ROBOTINTRODUCTION is null");
            return (Criteria) this;
        }

        public Criteria andROBOTINTRODUCTIONIsNotNull() {
            addCriterion("ROBOTINTRODUCTION is not null");
            return (Criteria) this;
        }

        public Criteria andROBOTINTRODUCTIONEqualTo(String value) {
            addCriterion("ROBOTINTRODUCTION =", value, "ROBOTINTRODUCTION");
            return (Criteria) this;
        }

        public Criteria andROBOTINTRODUCTIONNotEqualTo(String value) {
            addCriterion("ROBOTINTRODUCTION <>", value, "ROBOTINTRODUCTION");
            return (Criteria) this;
        }

        public Criteria andROBOTINTRODUCTIONGreaterThan(String value) {
            addCriterion("ROBOTINTRODUCTION >", value, "ROBOTINTRODUCTION");
            return (Criteria) this;
        }

        public Criteria andROBOTINTRODUCTIONGreaterThanOrEqualTo(String value) {
            addCriterion("ROBOTINTRODUCTION >=", value, "ROBOTINTRODUCTION");
            return (Criteria) this;
        }

        public Criteria andROBOTINTRODUCTIONLessThan(String value) {
            addCriterion("ROBOTINTRODUCTION <", value, "ROBOTINTRODUCTION");
            return (Criteria) this;
        }

        public Criteria andROBOTINTRODUCTIONLessThanOrEqualTo(String value) {
            addCriterion("ROBOTINTRODUCTION <=", value, "ROBOTINTRODUCTION");
            return (Criteria) this;
        }

        public Criteria andROBOTINTRODUCTIONLike(String value) {
            addCriterion("ROBOTINTRODUCTION like", value, "ROBOTINTRODUCTION");
            return (Criteria) this;
        }

        public Criteria andROBOTINTRODUCTIONNotLike(String value) {
            addCriterion("ROBOTINTRODUCTION not like", value, "ROBOTINTRODUCTION");
            return (Criteria) this;
        }

        public Criteria andROBOTINTRODUCTIONIn(List<String> values) {
            addCriterion("ROBOTINTRODUCTION in", values, "ROBOTINTRODUCTION");
            return (Criteria) this;
        }

        public Criteria andROBOTINTRODUCTIONNotIn(List<String> values) {
            addCriterion("ROBOTINTRODUCTION not in", values, "ROBOTINTRODUCTION");
            return (Criteria) this;
        }

        public Criteria andROBOTINTRODUCTIONBetween(String value1, String value2) {
            addCriterion("ROBOTINTRODUCTION between", value1, value2, "ROBOTINTRODUCTION");
            return (Criteria) this;
        }

        public Criteria andROBOTINTRODUCTIONNotBetween(String value1, String value2) {
            addCriterion("ROBOTINTRODUCTION not between", value1, value2, "ROBOTINTRODUCTION");
            return (Criteria) this;
        }

        public Criteria andROBOTWELCOMEIsNull() {
            addCriterion("ROBOTWELCOME is null");
            return (Criteria) this;
        }

        public Criteria andROBOTWELCOMEIsNotNull() {
            addCriterion("ROBOTWELCOME is not null");
            return (Criteria) this;
        }

        public Criteria andROBOTWELCOMEEqualTo(String value) {
            addCriterion("ROBOTWELCOME =", value, "ROBOTWELCOME");
            return (Criteria) this;
        }

        public Criteria andROBOTWELCOMENotEqualTo(String value) {
            addCriterion("ROBOTWELCOME <>", value, "ROBOTWELCOME");
            return (Criteria) this;
        }

        public Criteria andROBOTWELCOMEGreaterThan(String value) {
            addCriterion("ROBOTWELCOME >", value, "ROBOTWELCOME");
            return (Criteria) this;
        }

        public Criteria andROBOTWELCOMEGreaterThanOrEqualTo(String value) {
            addCriterion("ROBOTWELCOME >=", value, "ROBOTWELCOME");
            return (Criteria) this;
        }

        public Criteria andROBOTWELCOMELessThan(String value) {
            addCriterion("ROBOTWELCOME <", value, "ROBOTWELCOME");
            return (Criteria) this;
        }

        public Criteria andROBOTWELCOMELessThanOrEqualTo(String value) {
            addCriterion("ROBOTWELCOME <=", value, "ROBOTWELCOME");
            return (Criteria) this;
        }

        public Criteria andROBOTWELCOMELike(String value) {
            addCriterion("ROBOTWELCOME like", value, "ROBOTWELCOME");
            return (Criteria) this;
        }

        public Criteria andROBOTWELCOMENotLike(String value) {
            addCriterion("ROBOTWELCOME not like", value, "ROBOTWELCOME");
            return (Criteria) this;
        }

        public Criteria andROBOTWELCOMEIn(List<String> values) {
            addCriterion("ROBOTWELCOME in", values, "ROBOTWELCOME");
            return (Criteria) this;
        }

        public Criteria andROBOTWELCOMENotIn(List<String> values) {
            addCriterion("ROBOTWELCOME not in", values, "ROBOTWELCOME");
            return (Criteria) this;
        }

        public Criteria andROBOTWELCOMEBetween(String value1, String value2) {
            addCriterion("ROBOTWELCOME between", value1, value2, "ROBOTWELCOME");
            return (Criteria) this;
        }

        public Criteria andROBOTWELCOMENotBetween(String value1, String value2) {
            addCriterion("ROBOTWELCOME not between", value1, value2, "ROBOTWELCOME");
            return (Criteria) this;
        }

        public Criteria andROBOTNOKNOWIsNull() {
            addCriterion("ROBOTNOKNOW is null");
            return (Criteria) this;
        }

        public Criteria andROBOTNOKNOWIsNotNull() {
            addCriterion("ROBOTNOKNOW is not null");
            return (Criteria) this;
        }

        public Criteria andROBOTNOKNOWEqualTo(String value) {
            addCriterion("ROBOTNOKNOW =", value, "ROBOTNOKNOW");
            return (Criteria) this;
        }

        public Criteria andROBOTNOKNOWNotEqualTo(String value) {
            addCriterion("ROBOTNOKNOW <>", value, "ROBOTNOKNOW");
            return (Criteria) this;
        }

        public Criteria andROBOTNOKNOWGreaterThan(String value) {
            addCriterion("ROBOTNOKNOW >", value, "ROBOTNOKNOW");
            return (Criteria) this;
        }

        public Criteria andROBOTNOKNOWGreaterThanOrEqualTo(String value) {
            addCriterion("ROBOTNOKNOW >=", value, "ROBOTNOKNOW");
            return (Criteria) this;
        }

        public Criteria andROBOTNOKNOWLessThan(String value) {
            addCriterion("ROBOTNOKNOW <", value, "ROBOTNOKNOW");
            return (Criteria) this;
        }

        public Criteria andROBOTNOKNOWLessThanOrEqualTo(String value) {
            addCriterion("ROBOTNOKNOW <=", value, "ROBOTNOKNOW");
            return (Criteria) this;
        }

        public Criteria andROBOTNOKNOWLike(String value) {
            addCriterion("ROBOTNOKNOW like", value, "ROBOTNOKNOW");
            return (Criteria) this;
        }

        public Criteria andROBOTNOKNOWNotLike(String value) {
            addCriterion("ROBOTNOKNOW not like", value, "ROBOTNOKNOW");
            return (Criteria) this;
        }

        public Criteria andROBOTNOKNOWIn(List<String> values) {
            addCriterion("ROBOTNOKNOW in", values, "ROBOTNOKNOW");
            return (Criteria) this;
        }

        public Criteria andROBOTNOKNOWNotIn(List<String> values) {
            addCriterion("ROBOTNOKNOW not in", values, "ROBOTNOKNOW");
            return (Criteria) this;
        }

        public Criteria andROBOTNOKNOWBetween(String value1, String value2) {
            addCriterion("ROBOTNOKNOW between", value1, value2, "ROBOTNOKNOW");
            return (Criteria) this;
        }

        public Criteria andROBOTNOKNOWNotBetween(String value1, String value2) {
            addCriterion("ROBOTNOKNOW not between", value1, value2, "ROBOTNOKNOW");
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