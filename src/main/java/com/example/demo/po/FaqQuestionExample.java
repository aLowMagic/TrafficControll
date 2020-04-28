package com.example.demo.po;

import java.util.ArrayList;
import java.util.List;

public class FaqQuestionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FaqQuestionExample() {
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

        public Criteria andFAQTITLEIsNull() {
            addCriterion("FAQTITLE is null");
            return (Criteria) this;
        }

        public Criteria andFAQTITLEIsNotNull() {
            addCriterion("FAQTITLE is not null");
            return (Criteria) this;
        }

        public Criteria andFAQTITLEEqualTo(String value) {
            addCriterion("FAQTITLE =", value, "FAQTITLE");
            return (Criteria) this;
        }

        public Criteria andFAQTITLENotEqualTo(String value) {
            addCriterion("FAQTITLE <>", value, "FAQTITLE");
            return (Criteria) this;
        }

        public Criteria andFAQTITLEGreaterThan(String value) {
            addCriterion("FAQTITLE >", value, "FAQTITLE");
            return (Criteria) this;
        }

        public Criteria andFAQTITLEGreaterThanOrEqualTo(String value) {
            addCriterion("FAQTITLE >=", value, "FAQTITLE");
            return (Criteria) this;
        }

        public Criteria andFAQTITLELessThan(String value) {
            addCriterion("FAQTITLE <", value, "FAQTITLE");
            return (Criteria) this;
        }

        public Criteria andFAQTITLELessThanOrEqualTo(String value) {
            addCriterion("FAQTITLE <=", value, "FAQTITLE");
            return (Criteria) this;
        }

        public Criteria andFAQTITLELike(String value) {
            addCriterion("FAQTITLE like", value, "FAQTITLE");
            return (Criteria) this;
        }

        public Criteria andFAQTITLENotLike(String value) {
            addCriterion("FAQTITLE not like", value, "FAQTITLE");
            return (Criteria) this;
        }

        public Criteria andFAQTITLEIn(List<String> values) {
            addCriterion("FAQTITLE in", values, "FAQTITLE");
            return (Criteria) this;
        }

        public Criteria andFAQTITLENotIn(List<String> values) {
            addCriterion("FAQTITLE not in", values, "FAQTITLE");
            return (Criteria) this;
        }

        public Criteria andFAQTITLEBetween(String value1, String value2) {
            addCriterion("FAQTITLE between", value1, value2, "FAQTITLE");
            return (Criteria) this;
        }

        public Criteria andFAQTITLENotBetween(String value1, String value2) {
            addCriterion("FAQTITLE not between", value1, value2, "FAQTITLE");
            return (Criteria) this;
        }

        public Criteria andFAQKEYWORDSIsNull() {
            addCriterion("FAQKEYWORDS is null");
            return (Criteria) this;
        }

        public Criteria andFAQKEYWORDSIsNotNull() {
            addCriterion("FAQKEYWORDS is not null");
            return (Criteria) this;
        }

        public Criteria andFAQKEYWORDSEqualTo(String value) {
            addCriterion("FAQKEYWORDS =", value, "FAQKEYWORDS");
            return (Criteria) this;
        }

        public Criteria andFAQKEYWORDSNotEqualTo(String value) {
            addCriterion("FAQKEYWORDS <>", value, "FAQKEYWORDS");
            return (Criteria) this;
        }

        public Criteria andFAQKEYWORDSGreaterThan(String value) {
            addCriterion("FAQKEYWORDS >", value, "FAQKEYWORDS");
            return (Criteria) this;
        }

        public Criteria andFAQKEYWORDSGreaterThanOrEqualTo(String value) {
            addCriterion("FAQKEYWORDS >=", value, "FAQKEYWORDS");
            return (Criteria) this;
        }

        public Criteria andFAQKEYWORDSLessThan(String value) {
            addCriterion("FAQKEYWORDS <", value, "FAQKEYWORDS");
            return (Criteria) this;
        }

        public Criteria andFAQKEYWORDSLessThanOrEqualTo(String value) {
            addCriterion("FAQKEYWORDS <=", value, "FAQKEYWORDS");
            return (Criteria) this;
        }

        public Criteria andFAQKEYWORDSLike(String value) {
            addCriterion("FAQKEYWORDS like", value, "FAQKEYWORDS");
            return (Criteria) this;
        }

        public Criteria andFAQKEYWORDSNotLike(String value) {
            addCriterion("FAQKEYWORDS not like", value, "FAQKEYWORDS");
            return (Criteria) this;
        }

        public Criteria andFAQKEYWORDSIn(List<String> values) {
            addCriterion("FAQKEYWORDS in", values, "FAQKEYWORDS");
            return (Criteria) this;
        }

        public Criteria andFAQKEYWORDSNotIn(List<String> values) {
            addCriterion("FAQKEYWORDS not in", values, "FAQKEYWORDS");
            return (Criteria) this;
        }

        public Criteria andFAQKEYWORDSBetween(String value1, String value2) {
            addCriterion("FAQKEYWORDS between", value1, value2, "FAQKEYWORDS");
            return (Criteria) this;
        }

        public Criteria andFAQKEYWORDSNotBetween(String value1, String value2) {
            addCriterion("FAQKEYWORDS not between", value1, value2, "FAQKEYWORDS");
            return (Criteria) this;
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

        public Criteria andCOLLECTIONIsNull() {
            addCriterion("COLLECTION is null");
            return (Criteria) this;
        }

        public Criteria andCOLLECTIONIsNotNull() {
            addCriterion("COLLECTION is not null");
            return (Criteria) this;
        }

        public Criteria andCOLLECTIONEqualTo(String value) {
            addCriterion("COLLECTION =", value, "COLLECTION");
            return (Criteria) this;
        }

        public Criteria andCOLLECTIONNotEqualTo(String value) {
            addCriterion("COLLECTION <>", value, "COLLECTION");
            return (Criteria) this;
        }

        public Criteria andCOLLECTIONGreaterThan(String value) {
            addCriterion("COLLECTION >", value, "COLLECTION");
            return (Criteria) this;
        }

        public Criteria andCOLLECTIONGreaterThanOrEqualTo(String value) {
            addCriterion("COLLECTION >=", value, "COLLECTION");
            return (Criteria) this;
        }

        public Criteria andCOLLECTIONLessThan(String value) {
            addCriterion("COLLECTION <", value, "COLLECTION");
            return (Criteria) this;
        }

        public Criteria andCOLLECTIONLessThanOrEqualTo(String value) {
            addCriterion("COLLECTION <=", value, "COLLECTION");
            return (Criteria) this;
        }

        public Criteria andCOLLECTIONLike(String value) {
            addCriterion("COLLECTION like", value, "COLLECTION");
            return (Criteria) this;
        }

        public Criteria andCOLLECTIONNotLike(String value) {
            addCriterion("COLLECTION not like", value, "COLLECTION");
            return (Criteria) this;
        }

        public Criteria andCOLLECTIONIn(List<String> values) {
            addCriterion("COLLECTION in", values, "COLLECTION");
            return (Criteria) this;
        }

        public Criteria andCOLLECTIONNotIn(List<String> values) {
            addCriterion("COLLECTION not in", values, "COLLECTION");
            return (Criteria) this;
        }

        public Criteria andCOLLECTIONBetween(String value1, String value2) {
            addCriterion("COLLECTION between", value1, value2, "COLLECTION");
            return (Criteria) this;
        }

        public Criteria andCOLLECTIONNotBetween(String value1, String value2) {
            addCriterion("COLLECTION not between", value1, value2, "COLLECTION");
            return (Criteria) this;
        }

        public Criteria andSCANIsNull() {
            addCriterion("SCAN is null");
            return (Criteria) this;
        }

        public Criteria andSCANIsNotNull() {
            addCriterion("SCAN is not null");
            return (Criteria) this;
        }

        public Criteria andSCANEqualTo(String value) {
            addCriterion("SCAN =", value, "SCAN");
            return (Criteria) this;
        }

        public Criteria andSCANNotEqualTo(String value) {
            addCriterion("SCAN <>", value, "SCAN");
            return (Criteria) this;
        }

        public Criteria andSCANGreaterThan(String value) {
            addCriterion("SCAN >", value, "SCAN");
            return (Criteria) this;
        }

        public Criteria andSCANGreaterThanOrEqualTo(String value) {
            addCriterion("SCAN >=", value, "SCAN");
            return (Criteria) this;
        }

        public Criteria andSCANLessThan(String value) {
            addCriterion("SCAN <", value, "SCAN");
            return (Criteria) this;
        }

        public Criteria andSCANLessThanOrEqualTo(String value) {
            addCriterion("SCAN <=", value, "SCAN");
            return (Criteria) this;
        }

        public Criteria andSCANLike(String value) {
            addCriterion("SCAN like", value, "SCAN");
            return (Criteria) this;
        }

        public Criteria andSCANNotLike(String value) {
            addCriterion("SCAN not like", value, "SCAN");
            return (Criteria) this;
        }

        public Criteria andSCANIn(List<String> values) {
            addCriterion("SCAN in", values, "SCAN");
            return (Criteria) this;
        }

        public Criteria andSCANNotIn(List<String> values) {
            addCriterion("SCAN not in", values, "SCAN");
            return (Criteria) this;
        }

        public Criteria andSCANBetween(String value1, String value2) {
            addCriterion("SCAN between", value1, value2, "SCAN");
            return (Criteria) this;
        }

        public Criteria andSCANNotBetween(String value1, String value2) {
            addCriterion("SCAN not between", value1, value2, "SCAN");
            return (Criteria) this;
        }

        public Criteria andMODIFYTIMEIsNull() {
            addCriterion("MODIFYTIME is null");
            return (Criteria) this;
        }

        public Criteria andMODIFYTIMEIsNotNull() {
            addCriterion("MODIFYTIME is not null");
            return (Criteria) this;
        }

        public Criteria andMODIFYTIMEEqualTo(String value) {
            addCriterion("MODIFYTIME =", value, "MODIFYTIME");
            return (Criteria) this;
        }

        public Criteria andMODIFYTIMENotEqualTo(String value) {
            addCriterion("MODIFYTIME <>", value, "MODIFYTIME");
            return (Criteria) this;
        }

        public Criteria andMODIFYTIMEGreaterThan(String value) {
            addCriterion("MODIFYTIME >", value, "MODIFYTIME");
            return (Criteria) this;
        }

        public Criteria andMODIFYTIMEGreaterThanOrEqualTo(String value) {
            addCriterion("MODIFYTIME >=", value, "MODIFYTIME");
            return (Criteria) this;
        }

        public Criteria andMODIFYTIMELessThan(String value) {
            addCriterion("MODIFYTIME <", value, "MODIFYTIME");
            return (Criteria) this;
        }

        public Criteria andMODIFYTIMELessThanOrEqualTo(String value) {
            addCriterion("MODIFYTIME <=", value, "MODIFYTIME");
            return (Criteria) this;
        }

        public Criteria andMODIFYTIMELike(String value) {
            addCriterion("MODIFYTIME like", value, "MODIFYTIME");
            return (Criteria) this;
        }

        public Criteria andMODIFYTIMENotLike(String value) {
            addCriterion("MODIFYTIME not like", value, "MODIFYTIME");
            return (Criteria) this;
        }

        public Criteria andMODIFYTIMEIn(List<String> values) {
            addCriterion("MODIFYTIME in", values, "MODIFYTIME");
            return (Criteria) this;
        }

        public Criteria andMODIFYTIMENotIn(List<String> values) {
            addCriterion("MODIFYTIME not in", values, "MODIFYTIME");
            return (Criteria) this;
        }

        public Criteria andMODIFYTIMEBetween(String value1, String value2) {
            addCriterion("MODIFYTIME between", value1, value2, "MODIFYTIME");
            return (Criteria) this;
        }

        public Criteria andMODIFYTIMENotBetween(String value1, String value2) {
            addCriterion("MODIFYTIME not between", value1, value2, "MODIFYTIME");
            return (Criteria) this;
        }

        public Criteria andMODIFYNUMBERIsNull() {
            addCriterion("MODIFYNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andMODIFYNUMBERIsNotNull() {
            addCriterion("MODIFYNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andMODIFYNUMBEREqualTo(String value) {
            addCriterion("MODIFYNUMBER =", value, "MODIFYNUMBER");
            return (Criteria) this;
        }

        public Criteria andMODIFYNUMBERNotEqualTo(String value) {
            addCriterion("MODIFYNUMBER <>", value, "MODIFYNUMBER");
            return (Criteria) this;
        }

        public Criteria andMODIFYNUMBERGreaterThan(String value) {
            addCriterion("MODIFYNUMBER >", value, "MODIFYNUMBER");
            return (Criteria) this;
        }

        public Criteria andMODIFYNUMBERGreaterThanOrEqualTo(String value) {
            addCriterion("MODIFYNUMBER >=", value, "MODIFYNUMBER");
            return (Criteria) this;
        }

        public Criteria andMODIFYNUMBERLessThan(String value) {
            addCriterion("MODIFYNUMBER <", value, "MODIFYNUMBER");
            return (Criteria) this;
        }

        public Criteria andMODIFYNUMBERLessThanOrEqualTo(String value) {
            addCriterion("MODIFYNUMBER <=", value, "MODIFYNUMBER");
            return (Criteria) this;
        }

        public Criteria andMODIFYNUMBERLike(String value) {
            addCriterion("MODIFYNUMBER like", value, "MODIFYNUMBER");
            return (Criteria) this;
        }

        public Criteria andMODIFYNUMBERNotLike(String value) {
            addCriterion("MODIFYNUMBER not like", value, "MODIFYNUMBER");
            return (Criteria) this;
        }

        public Criteria andMODIFYNUMBERIn(List<String> values) {
            addCriterion("MODIFYNUMBER in", values, "MODIFYNUMBER");
            return (Criteria) this;
        }

        public Criteria andMODIFYNUMBERNotIn(List<String> values) {
            addCriterion("MODIFYNUMBER not in", values, "MODIFYNUMBER");
            return (Criteria) this;
        }

        public Criteria andMODIFYNUMBERBetween(String value1, String value2) {
            addCriterion("MODIFYNUMBER between", value1, value2, "MODIFYNUMBER");
            return (Criteria) this;
        }

        public Criteria andMODIFYNUMBERNotBetween(String value1, String value2) {
            addCriterion("MODIFYNUMBER not between", value1, value2, "MODIFYNUMBER");
            return (Criteria) this;
        }

        public Criteria andFAQSTATEIsNull() {
            addCriterion("FAQSTATE is null");
            return (Criteria) this;
        }

        public Criteria andFAQSTATEIsNotNull() {
            addCriterion("FAQSTATE is not null");
            return (Criteria) this;
        }

        public Criteria andFAQSTATEEqualTo(Integer value) {
            addCriterion("FAQSTATE =", value, "FAQSTATE");
            return (Criteria) this;
        }

        public Criteria andFAQSTATENotEqualTo(Integer value) {
            addCriterion("FAQSTATE <>", value, "FAQSTATE");
            return (Criteria) this;
        }

        public Criteria andFAQSTATEGreaterThan(Integer value) {
            addCriterion("FAQSTATE >", value, "FAQSTATE");
            return (Criteria) this;
        }

        public Criteria andFAQSTATEGreaterThanOrEqualTo(Integer value) {
            addCriterion("FAQSTATE >=", value, "FAQSTATE");
            return (Criteria) this;
        }

        public Criteria andFAQSTATELessThan(Integer value) {
            addCriterion("FAQSTATE <", value, "FAQSTATE");
            return (Criteria) this;
        }

        public Criteria andFAQSTATELessThanOrEqualTo(Integer value) {
            addCriterion("FAQSTATE <=", value, "FAQSTATE");
            return (Criteria) this;
        }

        public Criteria andFAQSTATEIn(List<Integer> values) {
            addCriterion("FAQSTATE in", values, "FAQSTATE");
            return (Criteria) this;
        }

        public Criteria andFAQSTATENotIn(List<Integer> values) {
            addCriterion("FAQSTATE not in", values, "FAQSTATE");
            return (Criteria) this;
        }

        public Criteria andFAQSTATEBetween(Integer value1, Integer value2) {
            addCriterion("FAQSTATE between", value1, value2, "FAQSTATE");
            return (Criteria) this;
        }

        public Criteria andFAQSTATENotBetween(Integer value1, Integer value2) {
            addCriterion("FAQSTATE not between", value1, value2, "FAQSTATE");
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