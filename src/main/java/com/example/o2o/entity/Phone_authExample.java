package com.example.o2o.entity;

import java.util.ArrayList;
import java.util.List;

public class Phone_authExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Phone_authExample() {
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

        public Criteria andPhoneAuthIdIsNull() {
            addCriterion("phone_auth_id is null");
            return (Criteria) this;
        }

        public Criteria andPhoneAuthIdIsNotNull() {
            addCriterion("phone_auth_id is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneAuthIdEqualTo(Integer value) {
            addCriterion("phone_auth_id =", value, "phoneAuthId");
            return (Criteria) this;
        }

        public Criteria andPhoneAuthIdNotEqualTo(Integer value) {
            addCriterion("phone_auth_id <>", value, "phoneAuthId");
            return (Criteria) this;
        }

        public Criteria andPhoneAuthIdGreaterThan(Integer value) {
            addCriterion("phone_auth_id >", value, "phoneAuthId");
            return (Criteria) this;
        }

        public Criteria andPhoneAuthIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("phone_auth_id >=", value, "phoneAuthId");
            return (Criteria) this;
        }

        public Criteria andPhoneAuthIdLessThan(Integer value) {
            addCriterion("phone_auth_id <", value, "phoneAuthId");
            return (Criteria) this;
        }

        public Criteria andPhoneAuthIdLessThanOrEqualTo(Integer value) {
            addCriterion("phone_auth_id <=", value, "phoneAuthId");
            return (Criteria) this;
        }

        public Criteria andPhoneAuthIdIn(List<Integer> values) {
            addCriterion("phone_auth_id in", values, "phoneAuthId");
            return (Criteria) this;
        }

        public Criteria andPhoneAuthIdNotIn(List<Integer> values) {
            addCriterion("phone_auth_id not in", values, "phoneAuthId");
            return (Criteria) this;
        }

        public Criteria andPhoneAuthIdBetween(Integer value1, Integer value2) {
            addCriterion("phone_auth_id between", value1, value2, "phoneAuthId");
            return (Criteria) this;
        }

        public Criteria andPhoneAuthIdNotBetween(Integer value1, Integer value2) {
            addCriterion("phone_auth_id not between", value1, value2, "phoneAuthId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andAuthNumberIsNull() {
            addCriterion("auth_number is null");
            return (Criteria) this;
        }

        public Criteria andAuthNumberIsNotNull() {
            addCriterion("auth_number is not null");
            return (Criteria) this;
        }

        public Criteria andAuthNumberEqualTo(String value) {
            addCriterion("auth_number =", value, "authNumber");
            return (Criteria) this;
        }

        public Criteria andAuthNumberNotEqualTo(String value) {
            addCriterion("auth_number <>", value, "authNumber");
            return (Criteria) this;
        }

        public Criteria andAuthNumberGreaterThan(String value) {
            addCriterion("auth_number >", value, "authNumber");
            return (Criteria) this;
        }

        public Criteria andAuthNumberGreaterThanOrEqualTo(String value) {
            addCriterion("auth_number >=", value, "authNumber");
            return (Criteria) this;
        }

        public Criteria andAuthNumberLessThan(String value) {
            addCriterion("auth_number <", value, "authNumber");
            return (Criteria) this;
        }

        public Criteria andAuthNumberLessThanOrEqualTo(String value) {
            addCriterion("auth_number <=", value, "authNumber");
            return (Criteria) this;
        }

        public Criteria andAuthNumberLike(String value) {
            addCriterion("auth_number like", value, "authNumber");
            return (Criteria) this;
        }

        public Criteria andAuthNumberNotLike(String value) {
            addCriterion("auth_number not like", value, "authNumber");
            return (Criteria) this;
        }

        public Criteria andAuthNumberIn(List<String> values) {
            addCriterion("auth_number in", values, "authNumber");
            return (Criteria) this;
        }

        public Criteria andAuthNumberNotIn(List<String> values) {
            addCriterion("auth_number not in", values, "authNumber");
            return (Criteria) this;
        }

        public Criteria andAuthNumberBetween(String value1, String value2) {
            addCriterion("auth_number between", value1, value2, "authNumber");
            return (Criteria) this;
        }

        public Criteria andAuthNumberNotBetween(String value1, String value2) {
            addCriterion("auth_number not between", value1, value2, "authNumber");
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