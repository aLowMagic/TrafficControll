package com.example.demo.po;

import java.util.ArrayList;
import java.util.List;

public class ShareExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShareExample() {
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

        public Criteria andSHAREIDIsNull() {
            addCriterion("SHAREID is null");
            return (Criteria) this;
        }

        public Criteria andSHAREIDIsNotNull() {
            addCriterion("SHAREID is not null");
            return (Criteria) this;
        }

        public Criteria andSHAREIDEqualTo(String value) {
            addCriterion("SHAREID =", value, "SHAREID");
            return (Criteria) this;
        }

        public Criteria andSHAREIDNotEqualTo(String value) {
            addCriterion("SHAREID <>", value, "SHAREID");
            return (Criteria) this;
        }

        public Criteria andSHAREIDGreaterThan(String value) {
            addCriterion("SHAREID >", value, "SHAREID");
            return (Criteria) this;
        }

        public Criteria andSHAREIDGreaterThanOrEqualTo(String value) {
            addCriterion("SHAREID >=", value, "SHAREID");
            return (Criteria) this;
        }

        public Criteria andSHAREIDLessThan(String value) {
            addCriterion("SHAREID <", value, "SHAREID");
            return (Criteria) this;
        }

        public Criteria andSHAREIDLessThanOrEqualTo(String value) {
            addCriterion("SHAREID <=", value, "SHAREID");
            return (Criteria) this;
        }

        public Criteria andSHAREIDLike(String value) {
            addCriterion("SHAREID like", value, "SHAREID");
            return (Criteria) this;
        }

        public Criteria andSHAREIDNotLike(String value) {
            addCriterion("SHAREID not like", value, "SHAREID");
            return (Criteria) this;
        }

        public Criteria andSHAREIDIn(List<String> values) {
            addCriterion("SHAREID in", values, "SHAREID");
            return (Criteria) this;
        }

        public Criteria andSHAREIDNotIn(List<String> values) {
            addCriterion("SHAREID not in", values, "SHAREID");
            return (Criteria) this;
        }

        public Criteria andSHAREIDBetween(String value1, String value2) {
            addCriterion("SHAREID between", value1, value2, "SHAREID");
            return (Criteria) this;
        }

        public Criteria andSHAREIDNotBetween(String value1, String value2) {
            addCriterion("SHAREID not between", value1, value2, "SHAREID");
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

        public Criteria andTIMEIsNull() {
            addCriterion("TIME is null");
            return (Criteria) this;
        }

        public Criteria andTIMEIsNotNull() {
            addCriterion("TIME is not null");
            return (Criteria) this;
        }

        public Criteria andTIMEEqualTo(String value) {
            addCriterion("TIME =", value, "TIME");
            return (Criteria) this;
        }

        public Criteria andTIMENotEqualTo(String value) {
            addCriterion("TIME <>", value, "TIME");
            return (Criteria) this;
        }

        public Criteria andTIMEGreaterThan(String value) {
            addCriterion("TIME >", value, "TIME");
            return (Criteria) this;
        }

        public Criteria andTIMEGreaterThanOrEqualTo(String value) {
            addCriterion("TIME >=", value, "TIME");
            return (Criteria) this;
        }

        public Criteria andTIMELessThan(String value) {
            addCriterion("TIME <", value, "TIME");
            return (Criteria) this;
        }

        public Criteria andTIMELessThanOrEqualTo(String value) {
            addCriterion("TIME <=", value, "TIME");
            return (Criteria) this;
        }

        public Criteria andTIMELike(String value) {
            addCriterion("TIME like", value, "TIME");
            return (Criteria) this;
        }

        public Criteria andTIMENotLike(String value) {
            addCriterion("TIME not like", value, "TIME");
            return (Criteria) this;
        }

        public Criteria andTIMEIn(List<String> values) {
            addCriterion("TIME in", values, "TIME");
            return (Criteria) this;
        }

        public Criteria andTIMENotIn(List<String> values) {
            addCriterion("TIME not in", values, "TIME");
            return (Criteria) this;
        }

        public Criteria andTIMEBetween(String value1, String value2) {
            addCriterion("TIME between", value1, value2, "TIME");
            return (Criteria) this;
        }

        public Criteria andTIMENotBetween(String value1, String value2) {
            addCriterion("TIME not between", value1, value2, "TIME");
            return (Criteria) this;
        }

        public Criteria andFAQQUESTIONIDIsNull() {
            addCriterion("FAQQUESTIONID is null");
            return (Criteria) this;
        }

        public Criteria andFAQQUESTIONIDIsNotNull() {
            addCriterion("FAQQUESTIONID is not null");
            return (Criteria) this;
        }

        public Criteria andFAQQUESTIONIDEqualTo(String value) {
            addCriterion("FAQQUESTIONID =", value, "FAQQUESTIONID");
            return (Criteria) this;
        }

        public Criteria andFAQQUESTIONIDNotEqualTo(String value) {
            addCriterion("FAQQUESTIONID <>", value, "FAQQUESTIONID");
            return (Criteria) this;
        }

        public Criteria andFAQQUESTIONIDGreaterThan(String value) {
            addCriterion("FAQQUESTIONID >", value, "FAQQUESTIONID");
            return (Criteria) this;
        }

        public Criteria andFAQQUESTIONIDGreaterThanOrEqualTo(String value) {
            addCriterion("FAQQUESTIONID >=", value, "FAQQUESTIONID");
            return (Criteria) this;
        }

        public Criteria andFAQQUESTIONIDLessThan(String value) {
            addCriterion("FAQQUESTIONID <", value, "FAQQUESTIONID");
            return (Criteria) this;
        }

        public Criteria andFAQQUESTIONIDLessThanOrEqualTo(String value) {
            addCriterion("FAQQUESTIONID <=", value, "FAQQUESTIONID");
            return (Criteria) this;
        }

        public Criteria andFAQQUESTIONIDLike(String value) {
            addCriterion("FAQQUESTIONID like", value, "FAQQUESTIONID");
            return (Criteria) this;
        }

        public Criteria andFAQQUESTIONIDNotLike(String value) {
            addCriterion("FAQQUESTIONID not like", value, "FAQQUESTIONID");
            return (Criteria) this;
        }

        public Criteria andFAQQUESTIONIDIn(List<String> values) {
            addCriterion("FAQQUESTIONID in", values, "FAQQUESTIONID");
            return (Criteria) this;
        }

        public Criteria andFAQQUESTIONIDNotIn(List<String> values) {
            addCriterion("FAQQUESTIONID not in", values, "FAQQUESTIONID");
            return (Criteria) this;
        }

        public Criteria andFAQQUESTIONIDBetween(String value1, String value2) {
            addCriterion("FAQQUESTIONID between", value1, value2, "FAQQUESTIONID");
            return (Criteria) this;
        }

        public Criteria andFAQQUESTIONIDNotBetween(String value1, String value2) {
            addCriterion("FAQQUESTIONID not between", value1, value2, "FAQQUESTIONID");
            return (Criteria) this;
        }

        public Criteria andCOMMUNITYQUESTIONIDIsNull() {
            addCriterion("COMMUNITYQUESTIONID is null");
            return (Criteria) this;
        }

        public Criteria andCOMMUNITYQUESTIONIDIsNotNull() {
            addCriterion("COMMUNITYQUESTIONID is not null");
            return (Criteria) this;
        }

        public Criteria andCOMMUNITYQUESTIONIDEqualTo(String value) {
            addCriterion("COMMUNITYQUESTIONID =", value, "COMMUNITYQUESTIONID");
            return (Criteria) this;
        }

        public Criteria andCOMMUNITYQUESTIONIDNotEqualTo(String value) {
            addCriterion("COMMUNITYQUESTIONID <>", value, "COMMUNITYQUESTIONID");
            return (Criteria) this;
        }

        public Criteria andCOMMUNITYQUESTIONIDGreaterThan(String value) {
            addCriterion("COMMUNITYQUESTIONID >", value, "COMMUNITYQUESTIONID");
            return (Criteria) this;
        }

        public Criteria andCOMMUNITYQUESTIONIDGreaterThanOrEqualTo(String value) {
            addCriterion("COMMUNITYQUESTIONID >=", value, "COMMUNITYQUESTIONID");
            return (Criteria) this;
        }

        public Criteria andCOMMUNITYQUESTIONIDLessThan(String value) {
            addCriterion("COMMUNITYQUESTIONID <", value, "COMMUNITYQUESTIONID");
            return (Criteria) this;
        }

        public Criteria andCOMMUNITYQUESTIONIDLessThanOrEqualTo(String value) {
            addCriterion("COMMUNITYQUESTIONID <=", value, "COMMUNITYQUESTIONID");
            return (Criteria) this;
        }

        public Criteria andCOMMUNITYQUESTIONIDLike(String value) {
            addCriterion("COMMUNITYQUESTIONID like", value, "COMMUNITYQUESTIONID");
            return (Criteria) this;
        }

        public Criteria andCOMMUNITYQUESTIONIDNotLike(String value) {
            addCriterion("COMMUNITYQUESTIONID not like", value, "COMMUNITYQUESTIONID");
            return (Criteria) this;
        }

        public Criteria andCOMMUNITYQUESTIONIDIn(List<String> values) {
            addCriterion("COMMUNITYQUESTIONID in", values, "COMMUNITYQUESTIONID");
            return (Criteria) this;
        }

        public Criteria andCOMMUNITYQUESTIONIDNotIn(List<String> values) {
            addCriterion("COMMUNITYQUESTIONID not in", values, "COMMUNITYQUESTIONID");
            return (Criteria) this;
        }

        public Criteria andCOMMUNITYQUESTIONIDBetween(String value1, String value2) {
            addCriterion("COMMUNITYQUESTIONID between", value1, value2, "COMMUNITYQUESTIONID");
            return (Criteria) this;
        }

        public Criteria andCOMMUNITYQUESTIONIDNotBetween(String value1, String value2) {
            addCriterion("COMMUNITYQUESTIONID not between", value1, value2, "COMMUNITYQUESTIONID");
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