package com.casco.pojo;

import java.util.ArrayList;
import java.util.List;

public class TStationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public TStationExample() {
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

        public Criteria andConsoleidIsNull() {
            addCriterion("consoleId is null");
            return (Criteria) this;
        }

        public Criteria andConsoleidIsNotNull() {
            addCriterion("consoleId is not null");
            return (Criteria) this;
        }

        public Criteria andConsoleidEqualTo(Integer value) {
            addCriterion("consoleId =", value, "consoleid");
            return (Criteria) this;
        }

        public Criteria andConsoleidNotEqualTo(Integer value) {
            addCriterion("consoleId <>", value, "consoleid");
            return (Criteria) this;
        }

        public Criteria andConsoleidGreaterThan(Integer value) {
            addCriterion("consoleId >", value, "consoleid");
            return (Criteria) this;
        }

        public Criteria andConsoleidGreaterThanOrEqualTo(Integer value) {
            addCriterion("consoleId >=", value, "consoleid");
            return (Criteria) this;
        }

        public Criteria andConsoleidLessThan(Integer value) {
            addCriterion("consoleId <", value, "consoleid");
            return (Criteria) this;
        }

        public Criteria andConsoleidLessThanOrEqualTo(Integer value) {
            addCriterion("consoleId <=", value, "consoleid");
            return (Criteria) this;
        }

        public Criteria andConsoleidIn(List<Integer> values) {
            addCriterion("consoleId in", values, "consoleid");
            return (Criteria) this;
        }

        public Criteria andConsoleidNotIn(List<Integer> values) {
            addCriterion("consoleId not in", values, "consoleid");
            return (Criteria) this;
        }

        public Criteria andConsoleidBetween(Integer value1, Integer value2) {
            addCriterion("consoleId between", value1, value2, "consoleid");
            return (Criteria) this;
        }

        public Criteria andConsoleidNotBetween(Integer value1, Integer value2) {
            addCriterion("consoleId not between", value1, value2, "consoleid");
            return (Criteria) this;
        }

        public Criteria andStaionnameIsNull() {
            addCriterion("staionName is null");
            return (Criteria) this;
        }

        public Criteria andStaionnameIsNotNull() {
            addCriterion("staionName is not null");
            return (Criteria) this;
        }

        public Criteria andStaionnameEqualTo(String value) {
            addCriterion("staionName =", value, "staionname");
            return (Criteria) this;
        }

        public Criteria andStaionnameNotEqualTo(String value) {
            addCriterion("staionName <>", value, "staionname");
            return (Criteria) this;
        }

        public Criteria andStaionnameGreaterThan(String value) {
            addCriterion("staionName >", value, "staionname");
            return (Criteria) this;
        }

        public Criteria andStaionnameGreaterThanOrEqualTo(String value) {
            addCriterion("staionName >=", value, "staionname");
            return (Criteria) this;
        }

        public Criteria andStaionnameLessThan(String value) {
            addCriterion("staionName <", value, "staionname");
            return (Criteria) this;
        }

        public Criteria andStaionnameLessThanOrEqualTo(String value) {
            addCriterion("staionName <=", value, "staionname");
            return (Criteria) this;
        }

        public Criteria andStaionnameLike(String value) {
            addCriterion("staionName like", value, "staionname");
            return (Criteria) this;
        }

        public Criteria andStaionnameNotLike(String value) {
            addCriterion("staionName not like", value, "staionname");
            return (Criteria) this;
        }

        public Criteria andStaionnameIn(List<String> values) {
            addCriterion("staionName in", values, "staionname");
            return (Criteria) this;
        }

        public Criteria andStaionnameNotIn(List<String> values) {
            addCriterion("staionName not in", values, "staionname");
            return (Criteria) this;
        }

        public Criteria andStaionnameBetween(String value1, String value2) {
            addCriterion("staionName between", value1, value2, "staionname");
            return (Criteria) this;
        }

        public Criteria andStaionnameNotBetween(String value1, String value2) {
            addCriterion("staionName not between", value1, value2, "staionname");
            return (Criteria) this;
        }

        public Criteria andConsolenameIsNull() {
            addCriterion("consoleName is null");
            return (Criteria) this;
        }

        public Criteria andConsolenameIsNotNull() {
            addCriterion("consoleName is not null");
            return (Criteria) this;
        }

        public Criteria andConsolenameEqualTo(String value) {
            addCriterion("consoleName =", value, "consolename");
            return (Criteria) this;
        }

        public Criteria andConsolenameNotEqualTo(String value) {
            addCriterion("consoleName <>", value, "consolename");
            return (Criteria) this;
        }

        public Criteria andConsolenameGreaterThan(String value) {
            addCriterion("consoleName >", value, "consolename");
            return (Criteria) this;
        }

        public Criteria andConsolenameGreaterThanOrEqualTo(String value) {
            addCriterion("consoleName >=", value, "consolename");
            return (Criteria) this;
        }

        public Criteria andConsolenameLessThan(String value) {
            addCriterion("consoleName <", value, "consolename");
            return (Criteria) this;
        }

        public Criteria andConsolenameLessThanOrEqualTo(String value) {
            addCriterion("consoleName <=", value, "consolename");
            return (Criteria) this;
        }

        public Criteria andConsolenameLike(String value) {
            addCriterion("consoleName like", value, "consolename");
            return (Criteria) this;
        }

        public Criteria andConsolenameNotLike(String value) {
            addCriterion("consoleName not like", value, "consolename");
            return (Criteria) this;
        }

        public Criteria andConsolenameIn(List<String> values) {
            addCriterion("consoleName in", values, "consolename");
            return (Criteria) this;
        }

        public Criteria andConsolenameNotIn(List<String> values) {
            addCriterion("consoleName not in", values, "consolename");
            return (Criteria) this;
        }

        public Criteria andConsolenameBetween(String value1, String value2) {
            addCriterion("consoleName between", value1, value2, "consolename");
            return (Criteria) this;
        }

        public Criteria andConsolenameNotBetween(String value1, String value2) {
            addCriterion("consoleName not between", value1, value2, "consolename");
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