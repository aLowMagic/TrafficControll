package com.example.demo.po;

import java.util.ArrayList;
import java.util.List;

public class FaqClassifyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FaqClassifyExample() {
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

        public Criteria andFAQCLASSIFYIDIsNull() {
            addCriterion("FAQCLASSIFYID is null");
            return (Criteria) this;
        }

        public Criteria andFAQCLASSIFYIDIsNotNull() {
            addCriterion("FAQCLASSIFYID is not null");
            return (Criteria) this;
        }

        public Criteria andFAQCLASSIFYIDEqualTo(String value) {
            addCriterion("FAQCLASSIFYID =", value, "FAQCLASSIFYID");
            return (Criteria) this;
        }

        public Criteria andFAQCLASSIFYIDNotEqualTo(String value) {
            addCriterion("FAQCLASSIFYID <>", value, "FAQCLASSIFYID");
            return (Criteria) this;
        }

        public Criteria andFAQCLASSIFYIDGreaterThan(String value) {
            addCriterion("FAQCLASSIFYID >", value, "FAQCLASSIFYID");
            return (Criteria) this;
        }

        public Criteria andFAQCLASSIFYIDGreaterThanOrEqualTo(String value) {
            addCriterion("FAQCLASSIFYID >=", value, "FAQCLASSIFYID");
            return (Criteria) this;
        }

        public Criteria andFAQCLASSIFYIDLessThan(String value) {
            addCriterion("FAQCLASSIFYID <", value, "FAQCLASSIFYID");
            return (Criteria) this;
        }

        public Criteria andFAQCLASSIFYIDLessThanOrEqualTo(String value) {
            addCriterion("FAQCLASSIFYID <=", value, "FAQCLASSIFYID");
            return (Criteria) this;
        }

        public Criteria andFAQCLASSIFYIDLike(String value) {
            addCriterion("FAQCLASSIFYID like", value, "FAQCLASSIFYID");
            return (Criteria) this;
        }

        public Criteria andFAQCLASSIFYIDNotLike(String value) {
            addCriterion("FAQCLASSIFYID not like", value, "FAQCLASSIFYID");
            return (Criteria) this;
        }

        public Criteria andFAQCLASSIFYIDIn(List<String> values) {
            addCriterion("FAQCLASSIFYID in", values, "FAQCLASSIFYID");
            return (Criteria) this;
        }

        public Criteria andFAQCLASSIFYIDNotIn(List<String> values) {
            addCriterion("FAQCLASSIFYID not in", values, "FAQCLASSIFYID");
            return (Criteria) this;
        }

        public Criteria andFAQCLASSIFYIDBetween(String value1, String value2) {
            addCriterion("FAQCLASSIFYID between", value1, value2, "FAQCLASSIFYID");
            return (Criteria) this;
        }

        public Criteria andFAQCLASSIFYIDNotBetween(String value1, String value2) {
            addCriterion("FAQCLASSIFYID not between", value1, value2, "FAQCLASSIFYID");
            return (Criteria) this;
        }

        public Criteria andFAQCLASSIFYNAMEIsNull() {
            addCriterion("FAQCLASSIFYNAME is null");
            return (Criteria) this;
        }

        public Criteria andFAQCLASSIFYNAMEIsNotNull() {
            addCriterion("FAQCLASSIFYNAME is not null");
            return (Criteria) this;
        }

        public Criteria andFAQCLASSIFYNAMEEqualTo(String value) {
            addCriterion("FAQCLASSIFYNAME =", value, "FAQCLASSIFYNAME");
            return (Criteria) this;
        }

        public Criteria andFAQCLASSIFYNAMENotEqualTo(String value) {
            addCriterion("FAQCLASSIFYNAME <>", value, "FAQCLASSIFYNAME");
            return (Criteria) this;
        }

        public Criteria andFAQCLASSIFYNAMEGreaterThan(String value) {
            addCriterion("FAQCLASSIFYNAME >", value, "FAQCLASSIFYNAME");
            return (Criteria) this;
        }

        public Criteria andFAQCLASSIFYNAMEGreaterThanOrEqualTo(String value) {
            addCriterion("FAQCLASSIFYNAME >=", value, "FAQCLASSIFYNAME");
            return (Criteria) this;
        }

        public Criteria andFAQCLASSIFYNAMELessThan(String value) {
            addCriterion("FAQCLASSIFYNAME <", value, "FAQCLASSIFYNAME");
            return (Criteria) this;
        }

        public Criteria andFAQCLASSIFYNAMELessThanOrEqualTo(String value) {
            addCriterion("FAQCLASSIFYNAME <=", value, "FAQCLASSIFYNAME");
            return (Criteria) this;
        }

        public Criteria andFAQCLASSIFYNAMELike(String value) {
            addCriterion("FAQCLASSIFYNAME like", value, "FAQCLASSIFYNAME");
            return (Criteria) this;
        }

        public Criteria andFAQCLASSIFYNAMENotLike(String value) {
            addCriterion("FAQCLASSIFYNAME not like", value, "FAQCLASSIFYNAME");
            return (Criteria) this;
        }

        public Criteria andFAQCLASSIFYNAMEIn(List<String> values) {
            addCriterion("FAQCLASSIFYNAME in", values, "FAQCLASSIFYNAME");
            return (Criteria) this;
        }

        public Criteria andFAQCLASSIFYNAMENotIn(List<String> values) {
            addCriterion("FAQCLASSIFYNAME not in", values, "FAQCLASSIFYNAME");
            return (Criteria) this;
        }

        public Criteria andFAQCLASSIFYNAMEBetween(String value1, String value2) {
            addCriterion("FAQCLASSIFYNAME between", value1, value2, "FAQCLASSIFYNAME");
            return (Criteria) this;
        }

        public Criteria andFAQCLASSIFYNAMENotBetween(String value1, String value2) {
            addCriterion("FAQCLASSIFYNAME not between", value1, value2, "FAQCLASSIFYNAME");
            return (Criteria) this;
        }

        public Criteria andFAQPARENTIDIsNull() {
            addCriterion("FAQPARENTID is null");
            return (Criteria) this;
        }

        public Criteria andFAQPARENTIDIsNotNull() {
            addCriterion("FAQPARENTID is not null");
            return (Criteria) this;
        }

        public Criteria andFAQPARENTIDEqualTo(String value) {
            addCriterion("FAQPARENTID =", value, "FAQPARENTID");
            return (Criteria) this;
        }

        public Criteria andFAQPARENTIDNotEqualTo(String value) {
            addCriterion("FAQPARENTID <>", value, "FAQPARENTID");
            return (Criteria) this;
        }

        public Criteria andFAQPARENTIDGreaterThan(String value) {
            addCriterion("FAQPARENTID >", value, "FAQPARENTID");
            return (Criteria) this;
        }

        public Criteria andFAQPARENTIDGreaterThanOrEqualTo(String value) {
            addCriterion("FAQPARENTID >=", value, "FAQPARENTID");
            return (Criteria) this;
        }

        public Criteria andFAQPARENTIDLessThan(String value) {
            addCriterion("FAQPARENTID <", value, "FAQPARENTID");
            return (Criteria) this;
        }

        public Criteria andFAQPARENTIDLessThanOrEqualTo(String value) {
            addCriterion("FAQPARENTID <=", value, "FAQPARENTID");
            return (Criteria) this;
        }

        public Criteria andFAQPARENTIDLike(String value) {
            addCriterion("FAQPARENTID like", value, "FAQPARENTID");
            return (Criteria) this;
        }

        public Criteria andFAQPARENTIDNotLike(String value) {
            addCriterion("FAQPARENTID not like", value, "FAQPARENTID");
            return (Criteria) this;
        }

        public Criteria andFAQPARENTIDIn(List<String> values) {
            addCriterion("FAQPARENTID in", values, "FAQPARENTID");
            return (Criteria) this;
        }

        public Criteria andFAQPARENTIDNotIn(List<String> values) {
            addCriterion("FAQPARENTID not in", values, "FAQPARENTID");
            return (Criteria) this;
        }

        public Criteria andFAQPARENTIDBetween(String value1, String value2) {
            addCriterion("FAQPARENTID between", value1, value2, "FAQPARENTID");
            return (Criteria) this;
        }

        public Criteria andFAQPARENTIDNotBetween(String value1, String value2) {
            addCriterion("FAQPARENTID not between", value1, value2, "FAQPARENTID");
            return (Criteria) this;
        }

        public Criteria andFAQCLASSIFYIMAGEIsNull() {
            addCriterion("FAQCLASSIFYIMAGE is null");
            return (Criteria) this;
        }

        public Criteria andFAQCLASSIFYIMAGEIsNotNull() {
            addCriterion("FAQCLASSIFYIMAGE is not null");
            return (Criteria) this;
        }

        public Criteria andFAQCLASSIFYIMAGEEqualTo(String value) {
            addCriterion("FAQCLASSIFYIMAGE =", value, "FAQCLASSIFYIMAGE");
            return (Criteria) this;
        }

        public Criteria andFAQCLASSIFYIMAGENotEqualTo(String value) {
            addCriterion("FAQCLASSIFYIMAGE <>", value, "FAQCLASSIFYIMAGE");
            return (Criteria) this;
        }

        public Criteria andFAQCLASSIFYIMAGEGreaterThan(String value) {
            addCriterion("FAQCLASSIFYIMAGE >", value, "FAQCLASSIFYIMAGE");
            return (Criteria) this;
        }

        public Criteria andFAQCLASSIFYIMAGEGreaterThanOrEqualTo(String value) {
            addCriterion("FAQCLASSIFYIMAGE >=", value, "FAQCLASSIFYIMAGE");
            return (Criteria) this;
        }

        public Criteria andFAQCLASSIFYIMAGELessThan(String value) {
            addCriterion("FAQCLASSIFYIMAGE <", value, "FAQCLASSIFYIMAGE");
            return (Criteria) this;
        }

        public Criteria andFAQCLASSIFYIMAGELessThanOrEqualTo(String value) {
            addCriterion("FAQCLASSIFYIMAGE <=", value, "FAQCLASSIFYIMAGE");
            return (Criteria) this;
        }

        public Criteria andFAQCLASSIFYIMAGELike(String value) {
            addCriterion("FAQCLASSIFYIMAGE like", value, "FAQCLASSIFYIMAGE");
            return (Criteria) this;
        }

        public Criteria andFAQCLASSIFYIMAGENotLike(String value) {
            addCriterion("FAQCLASSIFYIMAGE not like", value, "FAQCLASSIFYIMAGE");
            return (Criteria) this;
        }

        public Criteria andFAQCLASSIFYIMAGEIn(List<String> values) {
            addCriterion("FAQCLASSIFYIMAGE in", values, "FAQCLASSIFYIMAGE");
            return (Criteria) this;
        }

        public Criteria andFAQCLASSIFYIMAGENotIn(List<String> values) {
            addCriterion("FAQCLASSIFYIMAGE not in", values, "FAQCLASSIFYIMAGE");
            return (Criteria) this;
        }

        public Criteria andFAQCLASSIFYIMAGEBetween(String value1, String value2) {
            addCriterion("FAQCLASSIFYIMAGE between", value1, value2, "FAQCLASSIFYIMAGE");
            return (Criteria) this;
        }

        public Criteria andFAQCLASSIFYIMAGENotBetween(String value1, String value2) {
            addCriterion("FAQCLASSIFYIMAGE not between", value1, value2, "FAQCLASSIFYIMAGE");
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