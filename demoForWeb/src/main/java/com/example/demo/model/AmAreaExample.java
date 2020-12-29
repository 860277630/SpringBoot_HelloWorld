package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

public class AmAreaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AmAreaExample() {
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

        public Criteria andAreaIdIsNull() {
            addCriterion("area_id is null");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNotNull() {
            addCriterion("area_id is not null");
            return (Criteria) this;
        }

        public Criteria andAreaIdEqualTo(String value) {
            addCriterion("area_id =", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotEqualTo(String value) {
            addCriterion("area_id <>", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThan(String value) {
            addCriterion("area_id >", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThanOrEqualTo(String value) {
            addCriterion("area_id >=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThan(String value) {
            addCriterion("area_id <", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThanOrEqualTo(String value) {
            addCriterion("area_id <=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLike(String value) {
            addCriterion("area_id like", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotLike(String value) {
            addCriterion("area_id not like", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdIn(List<String> values) {
            addCriterion("area_id in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotIn(List<String> values) {
            addCriterion("area_id not in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdBetween(String value1, String value2) {
            addCriterion("area_id between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotBetween(String value1, String value2) {
            addCriterion("area_id not between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaParentIdIsNull() {
            addCriterion("area_parent_id is null");
            return (Criteria) this;
        }

        public Criteria andAreaParentIdIsNotNull() {
            addCriterion("area_parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andAreaParentIdEqualTo(String value) {
            addCriterion("area_parent_id =", value, "areaParentId");
            return (Criteria) this;
        }

        public Criteria andAreaParentIdNotEqualTo(String value) {
            addCriterion("area_parent_id <>", value, "areaParentId");
            return (Criteria) this;
        }

        public Criteria andAreaParentIdGreaterThan(String value) {
            addCriterion("area_parent_id >", value, "areaParentId");
            return (Criteria) this;
        }

        public Criteria andAreaParentIdGreaterThanOrEqualTo(String value) {
            addCriterion("area_parent_id >=", value, "areaParentId");
            return (Criteria) this;
        }

        public Criteria andAreaParentIdLessThan(String value) {
            addCriterion("area_parent_id <", value, "areaParentId");
            return (Criteria) this;
        }

        public Criteria andAreaParentIdLessThanOrEqualTo(String value) {
            addCriterion("area_parent_id <=", value, "areaParentId");
            return (Criteria) this;
        }

        public Criteria andAreaParentIdLike(String value) {
            addCriterion("area_parent_id like", value, "areaParentId");
            return (Criteria) this;
        }

        public Criteria andAreaParentIdNotLike(String value) {
            addCriterion("area_parent_id not like", value, "areaParentId");
            return (Criteria) this;
        }

        public Criteria andAreaParentIdIn(List<String> values) {
            addCriterion("area_parent_id in", values, "areaParentId");
            return (Criteria) this;
        }

        public Criteria andAreaParentIdNotIn(List<String> values) {
            addCriterion("area_parent_id not in", values, "areaParentId");
            return (Criteria) this;
        }

        public Criteria andAreaParentIdBetween(String value1, String value2) {
            addCriterion("area_parent_id between", value1, value2, "areaParentId");
            return (Criteria) this;
        }

        public Criteria andAreaParentIdNotBetween(String value1, String value2) {
            addCriterion("area_parent_id not between", value1, value2, "areaParentId");
            return (Criteria) this;
        }

        public Criteria andAreaNameIsNull() {
            addCriterion("area_name is null");
            return (Criteria) this;
        }

        public Criteria andAreaNameIsNotNull() {
            addCriterion("area_name is not null");
            return (Criteria) this;
        }

        public Criteria andAreaNameEqualTo(String value) {
            addCriterion("area_name =", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotEqualTo(String value) {
            addCriterion("area_name <>", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameGreaterThan(String value) {
            addCriterion("area_name >", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameGreaterThanOrEqualTo(String value) {
            addCriterion("area_name >=", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLessThan(String value) {
            addCriterion("area_name <", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLessThanOrEqualTo(String value) {
            addCriterion("area_name <=", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLike(String value) {
            addCriterion("area_name like", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotLike(String value) {
            addCriterion("area_name not like", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameIn(List<String> values) {
            addCriterion("area_name in", values, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotIn(List<String> values) {
            addCriterion("area_name not in", values, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameBetween(String value1, String value2) {
            addCriterion("area_name between", value1, value2, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotBetween(String value1, String value2) {
            addCriterion("area_name not between", value1, value2, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIsNull() {
            addCriterion("area_code is null");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIsNotNull() {
            addCriterion("area_code is not null");
            return (Criteria) this;
        }

        public Criteria andAreaCodeEqualTo(String value) {
            addCriterion("area_code =", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotEqualTo(String value) {
            addCriterion("area_code <>", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeGreaterThan(String value) {
            addCriterion("area_code >", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeGreaterThanOrEqualTo(String value) {
            addCriterion("area_code >=", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLessThan(String value) {
            addCriterion("area_code <", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLessThanOrEqualTo(String value) {
            addCriterion("area_code <=", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLike(String value) {
            addCriterion("area_code like", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotLike(String value) {
            addCriterion("area_code not like", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIn(List<String> values) {
            addCriterion("area_code in", values, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotIn(List<String> values) {
            addCriterion("area_code not in", values, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeBetween(String value1, String value2) {
            addCriterion("area_code between", value1, value2, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotBetween(String value1, String value2) {
            addCriterion("area_code not between", value1, value2, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaLevelIsNull() {
            addCriterion("area_level is null");
            return (Criteria) this;
        }

        public Criteria andAreaLevelIsNotNull() {
            addCriterion("area_level is not null");
            return (Criteria) this;
        }

        public Criteria andAreaLevelEqualTo(Byte value) {
            addCriterion("area_level =", value, "areaLevel");
            return (Criteria) this;
        }

        public Criteria andAreaLevelNotEqualTo(Byte value) {
            addCriterion("area_level <>", value, "areaLevel");
            return (Criteria) this;
        }

        public Criteria andAreaLevelGreaterThan(Byte value) {
            addCriterion("area_level >", value, "areaLevel");
            return (Criteria) this;
        }

        public Criteria andAreaLevelGreaterThanOrEqualTo(Byte value) {
            addCriterion("area_level >=", value, "areaLevel");
            return (Criteria) this;
        }

        public Criteria andAreaLevelLessThan(Byte value) {
            addCriterion("area_level <", value, "areaLevel");
            return (Criteria) this;
        }

        public Criteria andAreaLevelLessThanOrEqualTo(Byte value) {
            addCriterion("area_level <=", value, "areaLevel");
            return (Criteria) this;
        }

        public Criteria andAreaLevelIn(List<Byte> values) {
            addCriterion("area_level in", values, "areaLevel");
            return (Criteria) this;
        }

        public Criteria andAreaLevelNotIn(List<Byte> values) {
            addCriterion("area_level not in", values, "areaLevel");
            return (Criteria) this;
        }

        public Criteria andAreaLevelBetween(Byte value1, Byte value2) {
            addCriterion("area_level between", value1, value2, "areaLevel");
            return (Criteria) this;
        }

        public Criteria andAreaLevelNotBetween(Byte value1, Byte value2) {
            addCriterion("area_level not between", value1, value2, "areaLevel");
            return (Criteria) this;
        }

        public Criteria andAreaSeqIsNull() {
            addCriterion("area_seq is null");
            return (Criteria) this;
        }

        public Criteria andAreaSeqIsNotNull() {
            addCriterion("area_seq is not null");
            return (Criteria) this;
        }

        public Criteria andAreaSeqEqualTo(Byte value) {
            addCriterion("area_seq =", value, "areaSeq");
            return (Criteria) this;
        }

        public Criteria andAreaSeqNotEqualTo(Byte value) {
            addCriterion("area_seq <>", value, "areaSeq");
            return (Criteria) this;
        }

        public Criteria andAreaSeqGreaterThan(Byte value) {
            addCriterion("area_seq >", value, "areaSeq");
            return (Criteria) this;
        }

        public Criteria andAreaSeqGreaterThanOrEqualTo(Byte value) {
            addCriterion("area_seq >=", value, "areaSeq");
            return (Criteria) this;
        }

        public Criteria andAreaSeqLessThan(Byte value) {
            addCriterion("area_seq <", value, "areaSeq");
            return (Criteria) this;
        }

        public Criteria andAreaSeqLessThanOrEqualTo(Byte value) {
            addCriterion("area_seq <=", value, "areaSeq");
            return (Criteria) this;
        }

        public Criteria andAreaSeqIn(List<Byte> values) {
            addCriterion("area_seq in", values, "areaSeq");
            return (Criteria) this;
        }

        public Criteria andAreaSeqNotIn(List<Byte> values) {
            addCriterion("area_seq not in", values, "areaSeq");
            return (Criteria) this;
        }

        public Criteria andAreaSeqBetween(Byte value1, Byte value2) {
            addCriterion("area_seq between", value1, value2, "areaSeq");
            return (Criteria) this;
        }

        public Criteria andAreaSeqNotBetween(Byte value1, Byte value2) {
            addCriterion("area_seq not between", value1, value2, "areaSeq");
            return (Criteria) this;
        }

        public Criteria andAreaLeafIsNull() {
            addCriterion("area_leaf is null");
            return (Criteria) this;
        }

        public Criteria andAreaLeafIsNotNull() {
            addCriterion("area_leaf is not null");
            return (Criteria) this;
        }

        public Criteria andAreaLeafEqualTo(Byte value) {
            addCriterion("area_leaf =", value, "areaLeaf");
            return (Criteria) this;
        }

        public Criteria andAreaLeafNotEqualTo(Byte value) {
            addCriterion("area_leaf <>", value, "areaLeaf");
            return (Criteria) this;
        }

        public Criteria andAreaLeafGreaterThan(Byte value) {
            addCriterion("area_leaf >", value, "areaLeaf");
            return (Criteria) this;
        }

        public Criteria andAreaLeafGreaterThanOrEqualTo(Byte value) {
            addCriterion("area_leaf >=", value, "areaLeaf");
            return (Criteria) this;
        }

        public Criteria andAreaLeafLessThan(Byte value) {
            addCriterion("area_leaf <", value, "areaLeaf");
            return (Criteria) this;
        }

        public Criteria andAreaLeafLessThanOrEqualTo(Byte value) {
            addCriterion("area_leaf <=", value, "areaLeaf");
            return (Criteria) this;
        }

        public Criteria andAreaLeafIn(List<Byte> values) {
            addCriterion("area_leaf in", values, "areaLeaf");
            return (Criteria) this;
        }

        public Criteria andAreaLeafNotIn(List<Byte> values) {
            addCriterion("area_leaf not in", values, "areaLeaf");
            return (Criteria) this;
        }

        public Criteria andAreaLeafBetween(Byte value1, Byte value2) {
            addCriterion("area_leaf between", value1, value2, "areaLeaf");
            return (Criteria) this;
        }

        public Criteria andAreaLeafNotBetween(Byte value1, Byte value2) {
            addCriterion("area_leaf not between", value1, value2, "areaLeaf");
            return (Criteria) this;
        }

        public Criteria andAreaStateIsNull() {
            addCriterion("area_state is null");
            return (Criteria) this;
        }

        public Criteria andAreaStateIsNotNull() {
            addCriterion("area_state is not null");
            return (Criteria) this;
        }

        public Criteria andAreaStateEqualTo(Byte value) {
            addCriterion("area_state =", value, "areaState");
            return (Criteria) this;
        }

        public Criteria andAreaStateNotEqualTo(Byte value) {
            addCriterion("area_state <>", value, "areaState");
            return (Criteria) this;
        }

        public Criteria andAreaStateGreaterThan(Byte value) {
            addCriterion("area_state >", value, "areaState");
            return (Criteria) this;
        }

        public Criteria andAreaStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("area_state >=", value, "areaState");
            return (Criteria) this;
        }

        public Criteria andAreaStateLessThan(Byte value) {
            addCriterion("area_state <", value, "areaState");
            return (Criteria) this;
        }

        public Criteria andAreaStateLessThanOrEqualTo(Byte value) {
            addCriterion("area_state <=", value, "areaState");
            return (Criteria) this;
        }

        public Criteria andAreaStateIn(List<Byte> values) {
            addCriterion("area_state in", values, "areaState");
            return (Criteria) this;
        }

        public Criteria andAreaStateNotIn(List<Byte> values) {
            addCriterion("area_state not in", values, "areaState");
            return (Criteria) this;
        }

        public Criteria andAreaStateBetween(Byte value1, Byte value2) {
            addCriterion("area_state between", value1, value2, "areaState");
            return (Criteria) this;
        }

        public Criteria andAreaStateNotBetween(Byte value1, Byte value2) {
            addCriterion("area_state not between", value1, value2, "areaState");
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