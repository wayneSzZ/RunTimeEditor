package com.casco.pojo;

import java.util.ArrayList;
import java.util.List;

public class TEntryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public TEntryExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andStationidIsNull() {
            addCriterion("stationId is null");
            return (Criteria) this;
        }

        public Criteria andStationidIsNotNull() {
            addCriterion("stationId is not null");
            return (Criteria) this;
        }

        public Criteria andStationidEqualTo(Integer value) {
            addCriterion("stationId =", value, "stationid");
            return (Criteria) this;
        }

        public Criteria andStationidNotEqualTo(Integer value) {
            addCriterion("stationId <>", value, "stationid");
            return (Criteria) this;
        }

        public Criteria andStationidGreaterThan(Integer value) {
            addCriterion("stationId >", value, "stationid");
            return (Criteria) this;
        }

        public Criteria andStationidGreaterThanOrEqualTo(Integer value) {
            addCriterion("stationId >=", value, "stationid");
            return (Criteria) this;
        }

        public Criteria andStationidLessThan(Integer value) {
            addCriterion("stationId <", value, "stationid");
            return (Criteria) this;
        }

        public Criteria andStationidLessThanOrEqualTo(Integer value) {
            addCriterion("stationId <=", value, "stationid");
            return (Criteria) this;
        }

        public Criteria andStationidIn(List<Integer> values) {
            addCriterion("stationId in", values, "stationid");
            return (Criteria) this;
        }

        public Criteria andStationidNotIn(List<Integer> values) {
            addCriterion("stationId not in", values, "stationid");
            return (Criteria) this;
        }

        public Criteria andStationidBetween(Integer value1, Integer value2) {
            addCriterion("stationId between", value1, value2, "stationid");
            return (Criteria) this;
        }

        public Criteria andStationidNotBetween(Integer value1, Integer value2) {
            addCriterion("stationId not between", value1, value2, "stationid");
            return (Criteria) this;
        }

        public Criteria andStationentryIsNull() {
            addCriterion("stationEntry is null");
            return (Criteria) this;
        }

        public Criteria andStationentryIsNotNull() {
            addCriterion("stationEntry is not null");
            return (Criteria) this;
        }

        public Criteria andStationentryEqualTo(Integer value) {
            addCriterion("stationEntry =", value, "stationentry");
            return (Criteria) this;
        }

        public Criteria andStationentryNotEqualTo(Integer value) {
            addCriterion("stationEntry <>", value, "stationentry");
            return (Criteria) this;
        }

        public Criteria andStationentryGreaterThan(Integer value) {
            addCriterion("stationEntry >", value, "stationentry");
            return (Criteria) this;
        }

        public Criteria andStationentryGreaterThanOrEqualTo(Integer value) {
            addCriterion("stationEntry >=", value, "stationentry");
            return (Criteria) this;
        }

        public Criteria andStationentryLessThan(Integer value) {
            addCriterion("stationEntry <", value, "stationentry");
            return (Criteria) this;
        }

        public Criteria andStationentryLessThanOrEqualTo(Integer value) {
            addCriterion("stationEntry <=", value, "stationentry");
            return (Criteria) this;
        }

        public Criteria andStationentryIn(List<Integer> values) {
            addCriterion("stationEntry in", values, "stationentry");
            return (Criteria) this;
        }

        public Criteria andStationentryNotIn(List<Integer> values) {
            addCriterion("stationEntry not in", values, "stationentry");
            return (Criteria) this;
        }

        public Criteria andStationentryBetween(Integer value1, Integer value2) {
            addCriterion("stationEntry between", value1, value2, "stationentry");
            return (Criteria) this;
        }

        public Criteria andStationentryNotBetween(Integer value1, Integer value2) {
            addCriterion("stationEntry not between", value1, value2, "stationentry");
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