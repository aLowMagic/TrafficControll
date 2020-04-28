package com.example.demo.po;

import java.util.ArrayList;
import java.util.List;

public class CommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommentExample() {
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

        public Criteria andCOMMENTIDIsNull() {
            addCriterion("COMMENTID is null");
            return (Criteria) this;
        }

        public Criteria andCOMMENTIDIsNotNull() {
            addCriterion("COMMENTID is not null");
            return (Criteria) this;
        }

        public Criteria andCOMMENTIDEqualTo(String value) {
            addCriterion("COMMENTID =", value, "COMMENTID");
            return (Criteria) this;
        }

        public Criteria andCOMMENTIDNotEqualTo(String value) {
            addCriterion("COMMENTID <>", value, "COMMENTID");
            return (Criteria) this;
        }

        public Criteria andCOMMENTIDGreaterThan(String value) {
            addCriterion("COMMENTID >", value, "COMMENTID");
            return (Criteria) this;
        }

        public Criteria andCOMMENTIDGreaterThanOrEqualTo(String value) {
            addCriterion("COMMENTID >=", value, "COMMENTID");
            return (Criteria) this;
        }

        public Criteria andCOMMENTIDLessThan(String value) {
            addCriterion("COMMENTID <", value, "COMMENTID");
            return (Criteria) this;
        }

        public Criteria andCOMMENTIDLessThanOrEqualTo(String value) {
            addCriterion("COMMENTID <=", value, "COMMENTID");
            return (Criteria) this;
        }

        public Criteria andCOMMENTIDLike(String value) {
            addCriterion("COMMENTID like", value, "COMMENTID");
            return (Criteria) this;
        }

        public Criteria andCOMMENTIDNotLike(String value) {
            addCriterion("COMMENTID not like", value, "COMMENTID");
            return (Criteria) this;
        }

        public Criteria andCOMMENTIDIn(List<String> values) {
            addCriterion("COMMENTID in", values, "COMMENTID");
            return (Criteria) this;
        }

        public Criteria andCOMMENTIDNotIn(List<String> values) {
            addCriterion("COMMENTID not in", values, "COMMENTID");
            return (Criteria) this;
        }

        public Criteria andCOMMENTIDBetween(String value1, String value2) {
            addCriterion("COMMENTID between", value1, value2, "COMMENTID");
            return (Criteria) this;
        }

        public Criteria andCOMMENTIDNotBetween(String value1, String value2) {
            addCriterion("COMMENTID not between", value1, value2, "COMMENTID");
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

        public Criteria andCOMMENTCONTENTIsNull() {
            addCriterion("COMMENTCONTENT is null");
            return (Criteria) this;
        }

        public Criteria andCOMMENTCONTENTIsNotNull() {
            addCriterion("COMMENTCONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andCOMMENTCONTENTEqualTo(String value) {
            addCriterion("COMMENTCONTENT =", value, "COMMENTCONTENT");
            return (Criteria) this;
        }

        public Criteria andCOMMENTCONTENTNotEqualTo(String value) {
            addCriterion("COMMENTCONTENT <>", value, "COMMENTCONTENT");
            return (Criteria) this;
        }

        public Criteria andCOMMENTCONTENTGreaterThan(String value) {
            addCriterion("COMMENTCONTENT >", value, "COMMENTCONTENT");
            return (Criteria) this;
        }

        public Criteria andCOMMENTCONTENTGreaterThanOrEqualTo(String value) {
            addCriterion("COMMENTCONTENT >=", value, "COMMENTCONTENT");
            return (Criteria) this;
        }

        public Criteria andCOMMENTCONTENTLessThan(String value) {
            addCriterion("COMMENTCONTENT <", value, "COMMENTCONTENT");
            return (Criteria) this;
        }

        public Criteria andCOMMENTCONTENTLessThanOrEqualTo(String value) {
            addCriterion("COMMENTCONTENT <=", value, "COMMENTCONTENT");
            return (Criteria) this;
        }

        public Criteria andCOMMENTCONTENTLike(String value) {
            addCriterion("COMMENTCONTENT like", value, "COMMENTCONTENT");
            return (Criteria) this;
        }

        public Criteria andCOMMENTCONTENTNotLike(String value) {
            addCriterion("COMMENTCONTENT not like", value, "COMMENTCONTENT");
            return (Criteria) this;
        }

        public Criteria andCOMMENTCONTENTIn(List<String> values) {
            addCriterion("COMMENTCONTENT in", values, "COMMENTCONTENT");
            return (Criteria) this;
        }

        public Criteria andCOMMENTCONTENTNotIn(List<String> values) {
            addCriterion("COMMENTCONTENT not in", values, "COMMENTCONTENT");
            return (Criteria) this;
        }

        public Criteria andCOMMENTCONTENTBetween(String value1, String value2) {
            addCriterion("COMMENTCONTENT between", value1, value2, "COMMENTCONTENT");
            return (Criteria) this;
        }

        public Criteria andCOMMENTCONTENTNotBetween(String value1, String value2) {
            addCriterion("COMMENTCONTENT not between", value1, value2, "COMMENTCONTENT");
            return (Criteria) this;
        }

        public Criteria andCOMMENTTIMEIsNull() {
            addCriterion("COMMENTTIME is null");
            return (Criteria) this;
        }

        public Criteria andCOMMENTTIMEIsNotNull() {
            addCriterion("COMMENTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andCOMMENTTIMEEqualTo(String value) {
            addCriterion("COMMENTTIME =", value, "COMMENTTIME");
            return (Criteria) this;
        }

        public Criteria andCOMMENTTIMENotEqualTo(String value) {
            addCriterion("COMMENTTIME <>", value, "COMMENTTIME");
            return (Criteria) this;
        }

        public Criteria andCOMMENTTIMEGreaterThan(String value) {
            addCriterion("COMMENTTIME >", value, "COMMENTTIME");
            return (Criteria) this;
        }

        public Criteria andCOMMENTTIMEGreaterThanOrEqualTo(String value) {
            addCriterion("COMMENTTIME >=", value, "COMMENTTIME");
            return (Criteria) this;
        }

        public Criteria andCOMMENTTIMELessThan(String value) {
            addCriterion("COMMENTTIME <", value, "COMMENTTIME");
            return (Criteria) this;
        }

        public Criteria andCOMMENTTIMELessThanOrEqualTo(String value) {
            addCriterion("COMMENTTIME <=", value, "COMMENTTIME");
            return (Criteria) this;
        }

        public Criteria andCOMMENTTIMELike(String value) {
            addCriterion("COMMENTTIME like", value, "COMMENTTIME");
            return (Criteria) this;
        }

        public Criteria andCOMMENTTIMENotLike(String value) {
            addCriterion("COMMENTTIME not like", value, "COMMENTTIME");
            return (Criteria) this;
        }

        public Criteria andCOMMENTTIMEIn(List<String> values) {
            addCriterion("COMMENTTIME in", values, "COMMENTTIME");
            return (Criteria) this;
        }

        public Criteria andCOMMENTTIMENotIn(List<String> values) {
            addCriterion("COMMENTTIME not in", values, "COMMENTTIME");
            return (Criteria) this;
        }

        public Criteria andCOMMENTTIMEBetween(String value1, String value2) {
            addCriterion("COMMENTTIME between", value1, value2, "COMMENTTIME");
            return (Criteria) this;
        }

        public Criteria andCOMMENTTIMENotBetween(String value1, String value2) {
            addCriterion("COMMENTTIME not between", value1, value2, "COMMENTTIME");
            return (Criteria) this;
        }

        public Criteria andCOMMENTPARENTIDIsNull() {
            addCriterion("COMMENTPARENTID is null");
            return (Criteria) this;
        }

        public Criteria andCOMMENTPARENTIDIsNotNull() {
            addCriterion("COMMENTPARENTID is not null");
            return (Criteria) this;
        }

        public Criteria andCOMMENTPARENTIDEqualTo(String value) {
            addCriterion("COMMENTPARENTID =", value, "COMMENTPARENTID");
            return (Criteria) this;
        }

        public Criteria andCOMMENTPARENTIDNotEqualTo(String value) {
            addCriterion("COMMENTPARENTID <>", value, "COMMENTPARENTID");
            return (Criteria) this;
        }

        public Criteria andCOMMENTPARENTIDGreaterThan(String value) {
            addCriterion("COMMENTPARENTID >", value, "COMMENTPARENTID");
            return (Criteria) this;
        }

        public Criteria andCOMMENTPARENTIDGreaterThanOrEqualTo(String value) {
            addCriterion("COMMENTPARENTID >=", value, "COMMENTPARENTID");
            return (Criteria) this;
        }

        public Criteria andCOMMENTPARENTIDLessThan(String value) {
            addCriterion("COMMENTPARENTID <", value, "COMMENTPARENTID");
            return (Criteria) this;
        }

        public Criteria andCOMMENTPARENTIDLessThanOrEqualTo(String value) {
            addCriterion("COMMENTPARENTID <=", value, "COMMENTPARENTID");
            return (Criteria) this;
        }

        public Criteria andCOMMENTPARENTIDLike(String value) {
            addCriterion("COMMENTPARENTID like", value, "COMMENTPARENTID");
            return (Criteria) this;
        }

        public Criteria andCOMMENTPARENTIDNotLike(String value) {
            addCriterion("COMMENTPARENTID not like", value, "COMMENTPARENTID");
            return (Criteria) this;
        }

        public Criteria andCOMMENTPARENTIDIn(List<String> values) {
            addCriterion("COMMENTPARENTID in", values, "COMMENTPARENTID");
            return (Criteria) this;
        }

        public Criteria andCOMMENTPARENTIDNotIn(List<String> values) {
            addCriterion("COMMENTPARENTID not in", values, "COMMENTPARENTID");
            return (Criteria) this;
        }

        public Criteria andCOMMENTPARENTIDBetween(String value1, String value2) {
            addCriterion("COMMENTPARENTID between", value1, value2, "COMMENTPARENTID");
            return (Criteria) this;
        }

        public Criteria andCOMMENTPARENTIDNotBetween(String value1, String value2) {
            addCriterion("COMMENTPARENTID not between", value1, value2, "COMMENTPARENTID");
            return (Criteria) this;
        }

        public Criteria andTOUSERIDIsNull() {
            addCriterion("TOUSERID is null");
            return (Criteria) this;
        }

        public Criteria andTOUSERIDIsNotNull() {
            addCriterion("TOUSERID is not null");
            return (Criteria) this;
        }

        public Criteria andTOUSERIDEqualTo(String value) {
            addCriterion("TOUSERID =", value, "TOUSERID");
            return (Criteria) this;
        }

        public Criteria andTOUSERIDNotEqualTo(String value) {
            addCriterion("TOUSERID <>", value, "TOUSERID");
            return (Criteria) this;
        }

        public Criteria andTOUSERIDGreaterThan(String value) {
            addCriterion("TOUSERID >", value, "TOUSERID");
            return (Criteria) this;
        }

        public Criteria andTOUSERIDGreaterThanOrEqualTo(String value) {
            addCriterion("TOUSERID >=", value, "TOUSERID");
            return (Criteria) this;
        }

        public Criteria andTOUSERIDLessThan(String value) {
            addCriterion("TOUSERID <", value, "TOUSERID");
            return (Criteria) this;
        }

        public Criteria andTOUSERIDLessThanOrEqualTo(String value) {
            addCriterion("TOUSERID <=", value, "TOUSERID");
            return (Criteria) this;
        }

        public Criteria andTOUSERIDLike(String value) {
            addCriterion("TOUSERID like", value, "TOUSERID");
            return (Criteria) this;
        }

        public Criteria andTOUSERIDNotLike(String value) {
            addCriterion("TOUSERID not like", value, "TOUSERID");
            return (Criteria) this;
        }

        public Criteria andTOUSERIDIn(List<String> values) {
            addCriterion("TOUSERID in", values, "TOUSERID");
            return (Criteria) this;
        }

        public Criteria andTOUSERIDNotIn(List<String> values) {
            addCriterion("TOUSERID not in", values, "TOUSERID");
            return (Criteria) this;
        }

        public Criteria andTOUSERIDBetween(String value1, String value2) {
            addCriterion("TOUSERID between", value1, value2, "TOUSERID");
            return (Criteria) this;
        }

        public Criteria andTOUSERIDNotBetween(String value1, String value2) {
            addCriterion("TOUSERID not between", value1, value2, "TOUSERID");
            return (Criteria) this;
        }

        public Criteria andISNOTICEIsNull() {
            addCriterion("ISNOTICE is null");
            return (Criteria) this;
        }

        public Criteria andISNOTICEIsNotNull() {
            addCriterion("ISNOTICE is not null");
            return (Criteria) this;
        }

        public Criteria andISNOTICEEqualTo(Integer value) {
            addCriterion("ISNOTICE =", value, "ISNOTICE");
            return (Criteria) this;
        }

        public Criteria andISNOTICENotEqualTo(Integer value) {
            addCriterion("ISNOTICE <>", value, "ISNOTICE");
            return (Criteria) this;
        }

        public Criteria andISNOTICEGreaterThan(Integer value) {
            addCriterion("ISNOTICE >", value, "ISNOTICE");
            return (Criteria) this;
        }

        public Criteria andISNOTICEGreaterThanOrEqualTo(Integer value) {
            addCriterion("ISNOTICE >=", value, "ISNOTICE");
            return (Criteria) this;
        }

        public Criteria andISNOTICELessThan(Integer value) {
            addCriterion("ISNOTICE <", value, "ISNOTICE");
            return (Criteria) this;
        }

        public Criteria andISNOTICELessThanOrEqualTo(Integer value) {
            addCriterion("ISNOTICE <=", value, "ISNOTICE");
            return (Criteria) this;
        }

        public Criteria andISNOTICEIn(List<Integer> values) {
            addCriterion("ISNOTICE in", values, "ISNOTICE");
            return (Criteria) this;
        }

        public Criteria andISNOTICENotIn(List<Integer> values) {
            addCriterion("ISNOTICE not in", values, "ISNOTICE");
            return (Criteria) this;
        }

        public Criteria andISNOTICEBetween(Integer value1, Integer value2) {
            addCriterion("ISNOTICE between", value1, value2, "ISNOTICE");
            return (Criteria) this;
        }

        public Criteria andISNOTICENotBetween(Integer value1, Integer value2) {
            addCriterion("ISNOTICE not between", value1, value2, "ISNOTICE");
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