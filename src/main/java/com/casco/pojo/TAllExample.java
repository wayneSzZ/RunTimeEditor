package com.casco.pojo;

import java.util.ArrayList;
import java.util.List;

public class TAllExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public TAllExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
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

        public Criteria andAbsnameIsNull() {
            addCriterion("absName is null");
            return (Criteria) this;
        }

        public Criteria andAbsnameIsNotNull() {
            addCriterion("absName is not null");
            return (Criteria) this;
        }

        public Criteria andAbsnameEqualTo(String value) {
            addCriterion("absName =", value, "absname");
            return (Criteria) this;
        }

        public Criteria andAbsnameNotEqualTo(String value) {
            addCriterion("absName <>", value, "absname");
            return (Criteria) this;
        }

        public Criteria andAbsnameGreaterThan(String value) {
            addCriterion("absName >", value, "absname");
            return (Criteria) this;
        }

        public Criteria andAbsnameGreaterThanOrEqualTo(String value) {
            addCriterion("absName >=", value, "absname");
            return (Criteria) this;
        }

        public Criteria andAbsnameLessThan(String value) {
            addCriterion("absName <", value, "absname");
            return (Criteria) this;
        }

        public Criteria andAbsnameLessThanOrEqualTo(String value) {
            addCriterion("absName <=", value, "absname");
            return (Criteria) this;
        }

        public Criteria andAbsnameLike(String value) {
            addCriterion("absName like", value, "absname");
            return (Criteria) this;
        }

        public Criteria andAbsnameNotLike(String value) {
            addCriterion("absName not like", value, "absname");
            return (Criteria) this;
        }

        public Criteria andAbsnameIn(List<String> values) {
            addCriterion("absName in", values, "absname");
            return (Criteria) this;
        }

        public Criteria andAbsnameNotIn(List<String> values) {
            addCriterion("absName not in", values, "absname");
            return (Criteria) this;
        }

        public Criteria andAbsnameBetween(String value1, String value2) {
            addCriterion("absName between", value1, value2, "absname");
            return (Criteria) this;
        }

        public Criteria andAbsnameNotBetween(String value1, String value2) {
            addCriterion("absName not between", value1, value2, "absname");
            return (Criteria) this;
        }

        public Criteria andAbsdirectionIsNull() {
            addCriterion("absDirection is null");
            return (Criteria) this;
        }

        public Criteria andAbsdirectionIsNotNull() {
            addCriterion("absDirection is not null");
            return (Criteria) this;
        }

        public Criteria andAbsdirectionEqualTo(Integer value) {
            addCriterion("absDirection =", value, "absdirection");
            return (Criteria) this;
        }

        public Criteria andAbsdirectionNotEqualTo(Integer value) {
            addCriterion("absDirection <>", value, "absdirection");
            return (Criteria) this;
        }

        public Criteria andAbsdirectionGreaterThan(Integer value) {
            addCriterion("absDirection >", value, "absdirection");
            return (Criteria) this;
        }

        public Criteria andAbsdirectionGreaterThanOrEqualTo(Integer value) {
            addCriterion("absDirection >=", value, "absdirection");
            return (Criteria) this;
        }

        public Criteria andAbsdirectionLessThan(Integer value) {
            addCriterion("absDirection <", value, "absdirection");
            return (Criteria) this;
        }

        public Criteria andAbsdirectionLessThanOrEqualTo(Integer value) {
            addCriterion("absDirection <=", value, "absdirection");
            return (Criteria) this;
        }

        public Criteria andAbsdirectionIn(List<Integer> values) {
            addCriterion("absDirection in", values, "absdirection");
            return (Criteria) this;
        }

        public Criteria andAbsdirectionNotIn(List<Integer> values) {
            addCriterion("absDirection not in", values, "absdirection");
            return (Criteria) this;
        }

        public Criteria andAbsdirectionBetween(Integer value1, Integer value2) {
            addCriterion("absDirection between", value1, value2, "absdirection");
            return (Criteria) this;
        }

        public Criteria andAbsdirectionNotBetween(Integer value1, Integer value2) {
            addCriterion("absDirection not between", value1, value2, "absdirection");
            return (Criteria) this;
        }

        public Criteria andFromstaidIsNull() {
            addCriterion("fromStaId is null");
            return (Criteria) this;
        }

        public Criteria andFromstaidIsNotNull() {
            addCriterion("fromStaId is not null");
            return (Criteria) this;
        }

        public Criteria andFromstaidEqualTo(Integer value) {
            addCriterion("fromStaId =", value, "fromstaid");
            return (Criteria) this;
        }

        public Criteria andFromstaidNotEqualTo(Integer value) {
            addCriterion("fromStaId <>", value, "fromstaid");
            return (Criteria) this;
        }

        public Criteria andFromstaidGreaterThan(Integer value) {
            addCriterion("fromStaId >", value, "fromstaid");
            return (Criteria) this;
        }

        public Criteria andFromstaidGreaterThanOrEqualTo(Integer value) {
            addCriterion("fromStaId >=", value, "fromstaid");
            return (Criteria) this;
        }

        public Criteria andFromstaidLessThan(Integer value) {
            addCriterion("fromStaId <", value, "fromstaid");
            return (Criteria) this;
        }

        public Criteria andFromstaidLessThanOrEqualTo(Integer value) {
            addCriterion("fromStaId <=", value, "fromstaid");
            return (Criteria) this;
        }

        public Criteria andFromstaidIn(List<Integer> values) {
            addCriterion("fromStaId in", values, "fromstaid");
            return (Criteria) this;
        }

        public Criteria andFromstaidNotIn(List<Integer> values) {
            addCriterion("fromStaId not in", values, "fromstaid");
            return (Criteria) this;
        }

        public Criteria andFromstaidBetween(Integer value1, Integer value2) {
            addCriterion("fromStaId between", value1, value2, "fromstaid");
            return (Criteria) this;
        }

        public Criteria andFromstaidNotBetween(Integer value1, Integer value2) {
            addCriterion("fromStaId not between", value1, value2, "fromstaid");
            return (Criteria) this;
        }

        public Criteria andFromstanameIsNull() {
            addCriterion("fromStaName is null");
            return (Criteria) this;
        }

        public Criteria andFromstanameIsNotNull() {
            addCriterion("fromStaName is not null");
            return (Criteria) this;
        }

        public Criteria andFromstanameEqualTo(String value) {
            addCriterion("fromStaName =", value, "fromstaname");
            return (Criteria) this;
        }

        public Criteria andFromstanameNotEqualTo(String value) {
            addCriterion("fromStaName <>", value, "fromstaname");
            return (Criteria) this;
        }

        public Criteria andFromstanameGreaterThan(String value) {
            addCriterion("fromStaName >", value, "fromstaname");
            return (Criteria) this;
        }

        public Criteria andFromstanameGreaterThanOrEqualTo(String value) {
            addCriterion("fromStaName >=", value, "fromstaname");
            return (Criteria) this;
        }

        public Criteria andFromstanameLessThan(String value) {
            addCriterion("fromStaName <", value, "fromstaname");
            return (Criteria) this;
        }

        public Criteria andFromstanameLessThanOrEqualTo(String value) {
            addCriterion("fromStaName <=", value, "fromstaname");
            return (Criteria) this;
        }

        public Criteria andFromstanameLike(String value) {
            addCriterion("fromStaName like", value, "fromstaname");
            return (Criteria) this;
        }

        public Criteria andFromstanameNotLike(String value) {
            addCriterion("fromStaName not like", value, "fromstaname");
            return (Criteria) this;
        }

        public Criteria andFromstanameIn(List<String> values) {
            addCriterion("fromStaName in", values, "fromstaname");
            return (Criteria) this;
        }

        public Criteria andFromstanameNotIn(List<String> values) {
            addCriterion("fromStaName not in", values, "fromstaname");
            return (Criteria) this;
        }

        public Criteria andFromstanameBetween(String value1, String value2) {
            addCriterion("fromStaName between", value1, value2, "fromstaname");
            return (Criteria) this;
        }

        public Criteria andFromstanameNotBetween(String value1, String value2) {
            addCriterion("fromStaName not between", value1, value2, "fromstaname");
            return (Criteria) this;
        }

        public Criteria andInentryIsNull() {
            addCriterion("inEntry is null");
            return (Criteria) this;
        }

        public Criteria andInentryIsNotNull() {
            addCriterion("inEntry is not null");
            return (Criteria) this;
        }

        public Criteria andInentryEqualTo(Integer value) {
            addCriterion("inEntry =", value, "inentry");
            return (Criteria) this;
        }

        public Criteria andInentryNotEqualTo(Integer value) {
            addCriterion("inEntry <>", value, "inentry");
            return (Criteria) this;
        }

        public Criteria andInentryGreaterThan(Integer value) {
            addCriterion("inEntry >", value, "inentry");
            return (Criteria) this;
        }

        public Criteria andInentryGreaterThanOrEqualTo(Integer value) {
            addCriterion("inEntry >=", value, "inentry");
            return (Criteria) this;
        }

        public Criteria andInentryLessThan(Integer value) {
            addCriterion("inEntry <", value, "inentry");
            return (Criteria) this;
        }

        public Criteria andInentryLessThanOrEqualTo(Integer value) {
            addCriterion("inEntry <=", value, "inentry");
            return (Criteria) this;
        }

        public Criteria andInentryIn(List<Integer> values) {
            addCriterion("inEntry in", values, "inentry");
            return (Criteria) this;
        }

        public Criteria andInentryNotIn(List<Integer> values) {
            addCriterion("inEntry not in", values, "inentry");
            return (Criteria) this;
        }

        public Criteria andInentryBetween(Integer value1, Integer value2) {
            addCriterion("inEntry between", value1, value2, "inentry");
            return (Criteria) this;
        }

        public Criteria andInentryNotBetween(Integer value1, Integer value2) {
            addCriterion("inEntry not between", value1, value2, "inentry");
            return (Criteria) this;
        }

        public Criteria andTostaidIsNull() {
            addCriterion("toStaId is null");
            return (Criteria) this;
        }

        public Criteria andTostaidIsNotNull() {
            addCriterion("toStaId is not null");
            return (Criteria) this;
        }

        public Criteria andTostaidEqualTo(Integer value) {
            addCriterion("toStaId =", value, "tostaid");
            return (Criteria) this;
        }

        public Criteria andTostaidNotEqualTo(Integer value) {
            addCriterion("toStaId <>", value, "tostaid");
            return (Criteria) this;
        }

        public Criteria andTostaidGreaterThan(Integer value) {
            addCriterion("toStaId >", value, "tostaid");
            return (Criteria) this;
        }

        public Criteria andTostaidGreaterThanOrEqualTo(Integer value) {
            addCriterion("toStaId >=", value, "tostaid");
            return (Criteria) this;
        }

        public Criteria andTostaidLessThan(Integer value) {
            addCriterion("toStaId <", value, "tostaid");
            return (Criteria) this;
        }

        public Criteria andTostaidLessThanOrEqualTo(Integer value) {
            addCriterion("toStaId <=", value, "tostaid");
            return (Criteria) this;
        }

        public Criteria andTostaidIn(List<Integer> values) {
            addCriterion("toStaId in", values, "tostaid");
            return (Criteria) this;
        }

        public Criteria andTostaidNotIn(List<Integer> values) {
            addCriterion("toStaId not in", values, "tostaid");
            return (Criteria) this;
        }

        public Criteria andTostaidBetween(Integer value1, Integer value2) {
            addCriterion("toStaId between", value1, value2, "tostaid");
            return (Criteria) this;
        }

        public Criteria andTostaidNotBetween(Integer value1, Integer value2) {
            addCriterion("toStaId not between", value1, value2, "tostaid");
            return (Criteria) this;
        }

        public Criteria andTostanameIsNull() {
            addCriterion("toStaName is null");
            return (Criteria) this;
        }

        public Criteria andTostanameIsNotNull() {
            addCriterion("toStaName is not null");
            return (Criteria) this;
        }

        public Criteria andTostanameEqualTo(String value) {
            addCriterion("toStaName =", value, "tostaname");
            return (Criteria) this;
        }

        public Criteria andTostanameNotEqualTo(String value) {
            addCriterion("toStaName <>", value, "tostaname");
            return (Criteria) this;
        }

        public Criteria andTostanameGreaterThan(String value) {
            addCriterion("toStaName >", value, "tostaname");
            return (Criteria) this;
        }

        public Criteria andTostanameGreaterThanOrEqualTo(String value) {
            addCriterion("toStaName >=", value, "tostaname");
            return (Criteria) this;
        }

        public Criteria andTostanameLessThan(String value) {
            addCriterion("toStaName <", value, "tostaname");
            return (Criteria) this;
        }

        public Criteria andTostanameLessThanOrEqualTo(String value) {
            addCriterion("toStaName <=", value, "tostaname");
            return (Criteria) this;
        }

        public Criteria andTostanameLike(String value) {
            addCriterion("toStaName like", value, "tostaname");
            return (Criteria) this;
        }

        public Criteria andTostanameNotLike(String value) {
            addCriterion("toStaName not like", value, "tostaname");
            return (Criteria) this;
        }

        public Criteria andTostanameIn(List<String> values) {
            addCriterion("toStaName in", values, "tostaname");
            return (Criteria) this;
        }

        public Criteria andTostanameNotIn(List<String> values) {
            addCriterion("toStaName not in", values, "tostaname");
            return (Criteria) this;
        }

        public Criteria andTostanameBetween(String value1, String value2) {
            addCriterion("toStaName between", value1, value2, "tostaname");
            return (Criteria) this;
        }

        public Criteria andTostanameNotBetween(String value1, String value2) {
            addCriterion("toStaName not between", value1, value2, "tostaname");
            return (Criteria) this;
        }

        public Criteria andOutentryIsNull() {
            addCriterion("outEntry is null");
            return (Criteria) this;
        }

        public Criteria andOutentryIsNotNull() {
            addCriterion("outEntry is not null");
            return (Criteria) this;
        }

        public Criteria andOutentryEqualTo(Integer value) {
            addCriterion("outEntry =", value, "outentry");
            return (Criteria) this;
        }

        public Criteria andOutentryNotEqualTo(Integer value) {
            addCriterion("outEntry <>", value, "outentry");
            return (Criteria) this;
        }

        public Criteria andOutentryGreaterThan(Integer value) {
            addCriterion("outEntry >", value, "outentry");
            return (Criteria) this;
        }

        public Criteria andOutentryGreaterThanOrEqualTo(Integer value) {
            addCriterion("outEntry >=", value, "outentry");
            return (Criteria) this;
        }

        public Criteria andOutentryLessThan(Integer value) {
            addCriterion("outEntry <", value, "outentry");
            return (Criteria) this;
        }

        public Criteria andOutentryLessThanOrEqualTo(Integer value) {
            addCriterion("outEntry <=", value, "outentry");
            return (Criteria) this;
        }

        public Criteria andOutentryIn(List<Integer> values) {
            addCriterion("outEntry in", values, "outentry");
            return (Criteria) this;
        }

        public Criteria andOutentryNotIn(List<Integer> values) {
            addCriterion("outEntry not in", values, "outentry");
            return (Criteria) this;
        }

        public Criteria andOutentryBetween(Integer value1, Integer value2) {
            addCriterion("outEntry between", value1, value2, "outentry");
            return (Criteria) this;
        }

        public Criteria andOutentryNotBetween(Integer value1, Integer value2) {
            addCriterion("outEntry not between", value1, value2, "outentry");
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

        public Criteria andRuntimedirectionIsNull() {
            addCriterion("runTimeDirection is null");
            return (Criteria) this;
        }

        public Criteria andRuntimedirectionIsNotNull() {
            addCriterion("runTimeDirection is not null");
            return (Criteria) this;
        }

        public Criteria andRuntimedirectionEqualTo(Integer value) {
            addCriterion("runTimeDirection =", value, "runtimedirection");
            return (Criteria) this;
        }

        public Criteria andRuntimedirectionNotEqualTo(Integer value) {
            addCriterion("runTimeDirection <>", value, "runtimedirection");
            return (Criteria) this;
        }

        public Criteria andRuntimedirectionGreaterThan(Integer value) {
            addCriterion("runTimeDirection >", value, "runtimedirection");
            return (Criteria) this;
        }

        public Criteria andRuntimedirectionGreaterThanOrEqualTo(Integer value) {
            addCriterion("runTimeDirection >=", value, "runtimedirection");
            return (Criteria) this;
        }

        public Criteria andRuntimedirectionLessThan(Integer value) {
            addCriterion("runTimeDirection <", value, "runtimedirection");
            return (Criteria) this;
        }

        public Criteria andRuntimedirectionLessThanOrEqualTo(Integer value) {
            addCriterion("runTimeDirection <=", value, "runtimedirection");
            return (Criteria) this;
        }

        public Criteria andRuntimedirectionIn(List<Integer> values) {
            addCriterion("runTimeDirection in", values, "runtimedirection");
            return (Criteria) this;
        }

        public Criteria andRuntimedirectionNotIn(List<Integer> values) {
            addCriterion("runTimeDirection not in", values, "runtimedirection");
            return (Criteria) this;
        }

        public Criteria andRuntimedirectionBetween(Integer value1, Integer value2) {
            addCriterion("runTimeDirection between", value1, value2, "runtimedirection");
            return (Criteria) this;
        }

        public Criteria andRuntimedirectionNotBetween(Integer value1, Integer value2) {
            addCriterion("runTimeDirection not between", value1, value2, "runtimedirection");
            return (Criteria) this;
        }

        public Criteria andTraintypeIsNull() {
            addCriterion("trainType is null");
            return (Criteria) this;
        }

        public Criteria andTraintypeIsNotNull() {
            addCriterion("trainType is not null");
            return (Criteria) this;
        }

        public Criteria andTraintypeEqualTo(Integer value) {
            addCriterion("trainType =", value, "traintype");
            return (Criteria) this;
        }

        public Criteria andTraintypeNotEqualTo(Integer value) {
            addCriterion("trainType <>", value, "traintype");
            return (Criteria) this;
        }

        public Criteria andTraintypeGreaterThan(Integer value) {
            addCriterion("trainType >", value, "traintype");
            return (Criteria) this;
        }

        public Criteria andTraintypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("trainType >=", value, "traintype");
            return (Criteria) this;
        }

        public Criteria andTraintypeLessThan(Integer value) {
            addCriterion("trainType <", value, "traintype");
            return (Criteria) this;
        }

        public Criteria andTraintypeLessThanOrEqualTo(Integer value) {
            addCriterion("trainType <=", value, "traintype");
            return (Criteria) this;
        }

        public Criteria andTraintypeIn(List<Integer> values) {
            addCriterion("trainType in", values, "traintype");
            return (Criteria) this;
        }

        public Criteria andTraintypeNotIn(List<Integer> values) {
            addCriterion("trainType not in", values, "traintype");
            return (Criteria) this;
        }

        public Criteria andTraintypeBetween(Integer value1, Integer value2) {
            addCriterion("trainType between", value1, value2, "traintype");
            return (Criteria) this;
        }

        public Criteria andTraintypeNotBetween(Integer value1, Integer value2) {
            addCriterion("trainType not between", value1, value2, "traintype");
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