package com.casco.pojo;

import java.util.ArrayList;
import java.util.List;

public class TRuntimeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public TRuntimeExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
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

        public Criteria andTidIsNull() {
            addCriterion("tid is null");
            return (Criteria) this;
        }

        public Criteria andTidIsNotNull() {
            addCriterion("tid is not null");
            return (Criteria) this;
        }

        public Criteria andTidEqualTo(Integer value) {
            addCriterion("tid =", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotEqualTo(Integer value) {
            addCriterion("tid <>", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThan(Integer value) {
            addCriterion("tid >", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThanOrEqualTo(Integer value) {
            addCriterion("tid >=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThan(Integer value) {
            addCriterion("tid <", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThanOrEqualTo(Integer value) {
            addCriterion("tid <=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidIn(List<Integer> values) {
            addCriterion("tid in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotIn(List<Integer> values) {
            addCriterion("tid not in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidBetween(Integer value1, Integer value2) {
            addCriterion("tid between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotBetween(Integer value1, Integer value2) {
            addCriterion("tid not between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andAbsnumberIsNull() {
            addCriterion("absNumber is null");
            return (Criteria) this;
        }

        public Criteria andAbsnumberIsNotNull() {
            addCriterion("absNumber is not null");
            return (Criteria) this;
        }

        public Criteria andAbsnumberEqualTo(Integer value) {
            addCriterion("absNumber =", value, "absnumber");
            return (Criteria) this;
        }

        public Criteria andAbsnumberNotEqualTo(Integer value) {
            addCriterion("absNumber <>", value, "absnumber");
            return (Criteria) this;
        }

        public Criteria andAbsnumberGreaterThan(Integer value) {
            addCriterion("absNumber >", value, "absnumber");
            return (Criteria) this;
        }

        public Criteria andAbsnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("absNumber >=", value, "absnumber");
            return (Criteria) this;
        }

        public Criteria andAbsnumberLessThan(Integer value) {
            addCriterion("absNumber <", value, "absnumber");
            return (Criteria) this;
        }

        public Criteria andAbsnumberLessThanOrEqualTo(Integer value) {
            addCriterion("absNumber <=", value, "absnumber");
            return (Criteria) this;
        }

        public Criteria andAbsnumberIn(List<Integer> values) {
            addCriterion("absNumber in", values, "absnumber");
            return (Criteria) this;
        }

        public Criteria andAbsnumberNotIn(List<Integer> values) {
            addCriterion("absNumber not in", values, "absnumber");
            return (Criteria) this;
        }

        public Criteria andAbsnumberBetween(Integer value1, Integer value2) {
            addCriterion("absNumber between", value1, value2, "absnumber");
            return (Criteria) this;
        }

        public Criteria andAbsnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("absNumber not between", value1, value2, "absnumber");
            return (Criteria) this;
        }

        public Criteria andDirectionIsNull() {
            addCriterion("direction is null");
            return (Criteria) this;
        }

        public Criteria andDirectionIsNotNull() {
            addCriterion("direction is not null");
            return (Criteria) this;
        }

        public Criteria andDirectionEqualTo(Integer value) {
            addCriterion("direction =", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionNotEqualTo(Integer value) {
            addCriterion("direction <>", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionGreaterThan(Integer value) {
            addCriterion("direction >", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionGreaterThanOrEqualTo(Integer value) {
            addCriterion("direction >=", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionLessThan(Integer value) {
            addCriterion("direction <", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionLessThanOrEqualTo(Integer value) {
            addCriterion("direction <=", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionIn(List<Integer> values) {
            addCriterion("direction in", values, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionNotIn(List<Integer> values) {
            addCriterion("direction not in", values, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionBetween(Integer value1, Integer value2) {
            addCriterion("direction between", value1, value2, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionNotBetween(Integer value1, Integer value2) {
            addCriterion("direction not between", value1, value2, "direction");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andStoptimeIsNull() {
            addCriterion("stopTime is null");
            return (Criteria) this;
        }

        public Criteria andStoptimeIsNotNull() {
            addCriterion("stopTime is not null");
            return (Criteria) this;
        }

        public Criteria andStoptimeEqualTo(String value) {
            addCriterion("stopTime =", value, "stoptime");
            return (Criteria) this;
        }

        public Criteria andStoptimeNotEqualTo(String value) {
            addCriterion("stopTime <>", value, "stoptime");
            return (Criteria) this;
        }

        public Criteria andStoptimeGreaterThan(String value) {
            addCriterion("stopTime >", value, "stoptime");
            return (Criteria) this;
        }

        public Criteria andStoptimeGreaterThanOrEqualTo(String value) {
            addCriterion("stopTime >=", value, "stoptime");
            return (Criteria) this;
        }

        public Criteria andStoptimeLessThan(String value) {
            addCriterion("stopTime <", value, "stoptime");
            return (Criteria) this;
        }

        public Criteria andStoptimeLessThanOrEqualTo(String value) {
            addCriterion("stopTime <=", value, "stoptime");
            return (Criteria) this;
        }

        public Criteria andStoptimeLike(String value) {
            addCriterion("stopTime like", value, "stoptime");
            return (Criteria) this;
        }

        public Criteria andStoptimeNotLike(String value) {
            addCriterion("stopTime not like", value, "stoptime");
            return (Criteria) this;
        }

        public Criteria andStoptimeIn(List<String> values) {
            addCriterion("stopTime in", values, "stoptime");
            return (Criteria) this;
        }

        public Criteria andStoptimeNotIn(List<String> values) {
            addCriterion("stopTime not in", values, "stoptime");
            return (Criteria) this;
        }

        public Criteria andStoptimeBetween(String value1, String value2) {
            addCriterion("stopTime between", value1, value2, "stoptime");
            return (Criteria) this;
        }

        public Criteria andStoptimeNotBetween(String value1, String value2) {
            addCriterion("stopTime not between", value1, value2, "stoptime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("startTime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("startTime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(String value) {
            addCriterion("startTime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(String value) {
            addCriterion("startTime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(String value) {
            addCriterion("startTime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(String value) {
            addCriterion("startTime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(String value) {
            addCriterion("startTime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(String value) {
            addCriterion("startTime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLike(String value) {
            addCriterion("startTime like", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotLike(String value) {
            addCriterion("startTime not like", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<String> values) {
            addCriterion("startTime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<String> values) {
            addCriterion("startTime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(String value1, String value2) {
            addCriterion("startTime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(String value1, String value2) {
            addCriterion("startTime not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andRuntimeIsNull() {
            addCriterion("runTime is null");
            return (Criteria) this;
        }

        public Criteria andRuntimeIsNotNull() {
            addCriterion("runTime is not null");
            return (Criteria) this;
        }

        public Criteria andRuntimeEqualTo(String value) {
            addCriterion("runTime =", value, "runtime");
            return (Criteria) this;
        }

        public Criteria andRuntimeNotEqualTo(String value) {
            addCriterion("runTime <>", value, "runtime");
            return (Criteria) this;
        }

        public Criteria andRuntimeGreaterThan(String value) {
            addCriterion("runTime >", value, "runtime");
            return (Criteria) this;
        }

        public Criteria andRuntimeGreaterThanOrEqualTo(String value) {
            addCriterion("runTime >=", value, "runtime");
            return (Criteria) this;
        }

        public Criteria andRuntimeLessThan(String value) {
            addCriterion("runTime <", value, "runtime");
            return (Criteria) this;
        }

        public Criteria andRuntimeLessThanOrEqualTo(String value) {
            addCriterion("runTime <=", value, "runtime");
            return (Criteria) this;
        }

        public Criteria andRuntimeLike(String value) {
            addCriterion("runTime like", value, "runtime");
            return (Criteria) this;
        }

        public Criteria andRuntimeNotLike(String value) {
            addCriterion("runTime not like", value, "runtime");
            return (Criteria) this;
        }

        public Criteria andRuntimeIn(List<String> values) {
            addCriterion("runTime in", values, "runtime");
            return (Criteria) this;
        }

        public Criteria andRuntimeNotIn(List<String> values) {
            addCriterion("runTime not in", values, "runtime");
            return (Criteria) this;
        }

        public Criteria andRuntimeBetween(String value1, String value2) {
            addCriterion("runTime between", value1, value2, "runtime");
            return (Criteria) this;
        }

        public Criteria andRuntimeNotBetween(String value1, String value2) {
            addCriterion("runTime not between", value1, value2, "runtime");
            return (Criteria) this;
        }
    }

    /**
     */
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