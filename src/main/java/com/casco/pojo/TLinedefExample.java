package com.casco.pojo;

import java.util.ArrayList;
import java.util.List;

public class TLinedefExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public TLinedefExample() {
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

        public Criteria andCkflagIsNull() {
            addCriterion("ckFlag is null");
            return (Criteria) this;
        }

        public Criteria andCkflagIsNotNull() {
            addCriterion("ckFlag is not null");
            return (Criteria) this;
        }

        public Criteria andCkflagEqualTo(Integer value) {
            addCriterion("ckFlag =", value, "ckflag");
            return (Criteria) this;
        }

        public Criteria andCkflagNotEqualTo(Integer value) {
            addCriterion("ckFlag <>", value, "ckflag");
            return (Criteria) this;
        }

        public Criteria andCkflagGreaterThan(Integer value) {
            addCriterion("ckFlag >", value, "ckflag");
            return (Criteria) this;
        }

        public Criteria andCkflagGreaterThanOrEqualTo(Integer value) {
            addCriterion("ckFlag >=", value, "ckflag");
            return (Criteria) this;
        }

        public Criteria andCkflagLessThan(Integer value) {
            addCriterion("ckFlag <", value, "ckflag");
            return (Criteria) this;
        }

        public Criteria andCkflagLessThanOrEqualTo(Integer value) {
            addCriterion("ckFlag <=", value, "ckflag");
            return (Criteria) this;
        }

        public Criteria andCkflagIn(List<Integer> values) {
            addCriterion("ckFlag in", values, "ckflag");
            return (Criteria) this;
        }

        public Criteria andCkflagNotIn(List<Integer> values) {
            addCriterion("ckFlag not in", values, "ckflag");
            return (Criteria) this;
        }

        public Criteria andCkflagBetween(Integer value1, Integer value2) {
            addCriterion("ckFlag between", value1, value2, "ckflag");
            return (Criteria) this;
        }

        public Criteria andCkflagNotBetween(Integer value1, Integer value2) {
            addCriterion("ckFlag not between", value1, value2, "ckflag");
            return (Criteria) this;
        }

        public Criteria andFromstaIsNull() {
            addCriterion("fromSta is null");
            return (Criteria) this;
        }

        public Criteria andFromstaIsNotNull() {
            addCriterion("fromSta is not null");
            return (Criteria) this;
        }

        public Criteria andFromstaEqualTo(Integer value) {
            addCriterion("fromSta =", value, "fromsta");
            return (Criteria) this;
        }

        public Criteria andFromstaNotEqualTo(Integer value) {
            addCriterion("fromSta <>", value, "fromsta");
            return (Criteria) this;
        }

        public Criteria andFromstaGreaterThan(Integer value) {
            addCriterion("fromSta >", value, "fromsta");
            return (Criteria) this;
        }

        public Criteria andFromstaGreaterThanOrEqualTo(Integer value) {
            addCriterion("fromSta >=", value, "fromsta");
            return (Criteria) this;
        }

        public Criteria andFromstaLessThan(Integer value) {
            addCriterion("fromSta <", value, "fromsta");
            return (Criteria) this;
        }

        public Criteria andFromstaLessThanOrEqualTo(Integer value) {
            addCriterion("fromSta <=", value, "fromsta");
            return (Criteria) this;
        }

        public Criteria andFromstaIn(List<Integer> values) {
            addCriterion("fromSta in", values, "fromsta");
            return (Criteria) this;
        }

        public Criteria andFromstaNotIn(List<Integer> values) {
            addCriterion("fromSta not in", values, "fromsta");
            return (Criteria) this;
        }

        public Criteria andFromstaBetween(Integer value1, Integer value2) {
            addCriterion("fromSta between", value1, value2, "fromsta");
            return (Criteria) this;
        }

        public Criteria andFromstaNotBetween(Integer value1, Integer value2) {
            addCriterion("fromSta not between", value1, value2, "fromsta");
            return (Criteria) this;
        }

        public Criteria andTostaIsNull() {
            addCriterion("toSta is null");
            return (Criteria) this;
        }

        public Criteria andTostaIsNotNull() {
            addCriterion("toSta is not null");
            return (Criteria) this;
        }

        public Criteria andTostaEqualTo(Integer value) {
            addCriterion("toSta =", value, "tosta");
            return (Criteria) this;
        }

        public Criteria andTostaNotEqualTo(Integer value) {
            addCriterion("toSta <>", value, "tosta");
            return (Criteria) this;
        }

        public Criteria andTostaGreaterThan(Integer value) {
            addCriterion("toSta >", value, "tosta");
            return (Criteria) this;
        }

        public Criteria andTostaGreaterThanOrEqualTo(Integer value) {
            addCriterion("toSta >=", value, "tosta");
            return (Criteria) this;
        }

        public Criteria andTostaLessThan(Integer value) {
            addCriterion("toSta <", value, "tosta");
            return (Criteria) this;
        }

        public Criteria andTostaLessThanOrEqualTo(Integer value) {
            addCriterion("toSta <=", value, "tosta");
            return (Criteria) this;
        }

        public Criteria andTostaIn(List<Integer> values) {
            addCriterion("toSta in", values, "tosta");
            return (Criteria) this;
        }

        public Criteria andTostaNotIn(List<Integer> values) {
            addCriterion("toSta not in", values, "tosta");
            return (Criteria) this;
        }

        public Criteria andTostaBetween(Integer value1, Integer value2) {
            addCriterion("toSta between", value1, value2, "tosta");
            return (Criteria) this;
        }

        public Criteria andTostaNotBetween(Integer value1, Integer value2) {
            addCriterion("toSta not between", value1, value2, "tosta");
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