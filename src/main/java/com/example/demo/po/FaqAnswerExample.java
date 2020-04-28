package com.example.demo.po;

import java.util.ArrayList;
import java.util.List;

public class FaqAnswerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FaqAnswerExample() {
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

        public Criteria andFAQANSWERIDIsNull() {
            addCriterion("FAQANSWERID is null");
            return (Criteria) this;
        }

        public Criteria andFAQANSWERIDIsNotNull() {
            addCriterion("FAQANSWERID is not null");
            return (Criteria) this;
        }

        public Criteria andFAQANSWERIDEqualTo(String value) {
            addCriterion("FAQANSWERID =", value, "FAQANSWERID");
            return (Criteria) this;
        }

        public Criteria andFAQANSWERIDNotEqualTo(String value) {
            addCriterion("FAQANSWERID <>", value, "FAQANSWERID");
            return (Criteria) this;
        }

        public Criteria andFAQANSWERIDGreaterThan(String value) {
            addCriterion("FAQANSWERID >", value, "FAQANSWERID");
            return (Criteria) this;
        }

        public Criteria andFAQANSWERIDGreaterThanOrEqualTo(String value) {
            addCriterion("FAQANSWERID >=", value, "FAQANSWERID");
            return (Criteria) this;
        }

        public Criteria andFAQANSWERIDLessThan(String value) {
            addCriterion("FAQANSWERID <", value, "FAQANSWERID");
            return (Criteria) this;
        }

        public Criteria andFAQANSWERIDLessThanOrEqualTo(String value) {
            addCriterion("FAQANSWERID <=", value, "FAQANSWERID");
            return (Criteria) this;
        }

        public Criteria andFAQANSWERIDLike(String value) {
            addCriterion("FAQANSWERID like", value, "FAQANSWERID");
            return (Criteria) this;
        }

        public Criteria andFAQANSWERIDNotLike(String value) {
            addCriterion("FAQANSWERID not like", value, "FAQANSWERID");
            return (Criteria) this;
        }

        public Criteria andFAQANSWERIDIn(List<String> values) {
            addCriterion("FAQANSWERID in", values, "FAQANSWERID");
            return (Criteria) this;
        }

        public Criteria andFAQANSWERIDNotIn(List<String> values) {
            addCriterion("FAQANSWERID not in", values, "FAQANSWERID");
            return (Criteria) this;
        }

        public Criteria andFAQANSWERIDBetween(String value1, String value2) {
            addCriterion("FAQANSWERID between", value1, value2, "FAQANSWERID");
            return (Criteria) this;
        }

        public Criteria andFAQANSWERIDNotBetween(String value1, String value2) {
            addCriterion("FAQANSWERID not between", value1, value2, "FAQANSWERID");
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