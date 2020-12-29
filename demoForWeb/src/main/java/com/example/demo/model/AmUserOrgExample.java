package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

public class AmUserOrgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AmUserOrgExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNull() {
            addCriterion("org_id is null");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNotNull() {
            addCriterion("org_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrgIdEqualTo(String value) {
            addCriterion("org_id =", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotEqualTo(String value) {
            addCriterion("org_id <>", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThan(String value) {
            addCriterion("org_id >", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThanOrEqualTo(String value) {
            addCriterion("org_id >=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThan(String value) {
            addCriterion("org_id <", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThanOrEqualTo(String value) {
            addCriterion("org_id <=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLike(String value) {
            addCriterion("org_id like", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotLike(String value) {
            addCriterion("org_id not like", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdIn(List<String> values) {
            addCriterion("org_id in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotIn(List<String> values) {
            addCriterion("org_id not in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdBetween(String value1, String value2) {
            addCriterion("org_id between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotBetween(String value1, String value2) {
            addCriterion("org_id not between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andUserStateIdIsNull() {
            addCriterion("user_state_id is null");
            return (Criteria) this;
        }

        public Criteria andUserStateIdIsNotNull() {
            addCriterion("user_state_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserStateIdEqualTo(Byte value) {
            addCriterion("user_state_id =", value, "userStateId");
            return (Criteria) this;
        }

        public Criteria andUserStateIdNotEqualTo(Byte value) {
            addCriterion("user_state_id <>", value, "userStateId");
            return (Criteria) this;
        }

        public Criteria andUserStateIdGreaterThan(Byte value) {
            addCriterion("user_state_id >", value, "userStateId");
            return (Criteria) this;
        }

        public Criteria andUserStateIdGreaterThanOrEqualTo(Byte value) {
            addCriterion("user_state_id >=", value, "userStateId");
            return (Criteria) this;
        }

        public Criteria andUserStateIdLessThan(Byte value) {
            addCriterion("user_state_id <", value, "userStateId");
            return (Criteria) this;
        }

        public Criteria andUserStateIdLessThanOrEqualTo(Byte value) {
            addCriterion("user_state_id <=", value, "userStateId");
            return (Criteria) this;
        }

        public Criteria andUserStateIdIn(List<Byte> values) {
            addCriterion("user_state_id in", values, "userStateId");
            return (Criteria) this;
        }

        public Criteria andUserStateIdNotIn(List<Byte> values) {
            addCriterion("user_state_id not in", values, "userStateId");
            return (Criteria) this;
        }

        public Criteria andUserStateIdBetween(Byte value1, Byte value2) {
            addCriterion("user_state_id between", value1, value2, "userStateId");
            return (Criteria) this;
        }

        public Criteria andUserStateIdNotBetween(Byte value1, Byte value2) {
            addCriterion("user_state_id not between", value1, value2, "userStateId");
            return (Criteria) this;
        }

        public Criteria andUserInsuredIdIsNull() {
            addCriterion("user_insured_id is null");
            return (Criteria) this;
        }

        public Criteria andUserInsuredIdIsNotNull() {
            addCriterion("user_insured_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserInsuredIdEqualTo(Byte value) {
            addCriterion("user_insured_id =", value, "userInsuredId");
            return (Criteria) this;
        }

        public Criteria andUserInsuredIdNotEqualTo(Byte value) {
            addCriterion("user_insured_id <>", value, "userInsuredId");
            return (Criteria) this;
        }

        public Criteria andUserInsuredIdGreaterThan(Byte value) {
            addCriterion("user_insured_id >", value, "userInsuredId");
            return (Criteria) this;
        }

        public Criteria andUserInsuredIdGreaterThanOrEqualTo(Byte value) {
            addCriterion("user_insured_id >=", value, "userInsuredId");
            return (Criteria) this;
        }

        public Criteria andUserInsuredIdLessThan(Byte value) {
            addCriterion("user_insured_id <", value, "userInsuredId");
            return (Criteria) this;
        }

        public Criteria andUserInsuredIdLessThanOrEqualTo(Byte value) {
            addCriterion("user_insured_id <=", value, "userInsuredId");
            return (Criteria) this;
        }

        public Criteria andUserInsuredIdIn(List<Byte> values) {
            addCriterion("user_insured_id in", values, "userInsuredId");
            return (Criteria) this;
        }

        public Criteria andUserInsuredIdNotIn(List<Byte> values) {
            addCriterion("user_insured_id not in", values, "userInsuredId");
            return (Criteria) this;
        }

        public Criteria andUserInsuredIdBetween(Byte value1, Byte value2) {
            addCriterion("user_insured_id between", value1, value2, "userInsuredId");
            return (Criteria) this;
        }

        public Criteria andUserInsuredIdNotBetween(Byte value1, Byte value2) {
            addCriterion("user_insured_id not between", value1, value2, "userInsuredId");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeIsNull() {
            addCriterion("user_create_time is null");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeIsNotNull() {
            addCriterion("user_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeEqualTo(String value) {
            addCriterion("user_create_time =", value, "userCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeNotEqualTo(String value) {
            addCriterion("user_create_time <>", value, "userCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeGreaterThan(String value) {
            addCriterion("user_create_time >", value, "userCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("user_create_time >=", value, "userCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeLessThan(String value) {
            addCriterion("user_create_time <", value, "userCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("user_create_time <=", value, "userCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeLike(String value) {
            addCriterion("user_create_time like", value, "userCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeNotLike(String value) {
            addCriterion("user_create_time not like", value, "userCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeIn(List<String> values) {
            addCriterion("user_create_time in", values, "userCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeNotIn(List<String> values) {
            addCriterion("user_create_time not in", values, "userCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeBetween(String value1, String value2) {
            addCriterion("user_create_time between", value1, value2, "userCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeNotBetween(String value1, String value2) {
            addCriterion("user_create_time not between", value1, value2, "userCreateTime");
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