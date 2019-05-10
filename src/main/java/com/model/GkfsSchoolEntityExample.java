package com.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class GkfsSchoolEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GkfsSchoolEntityExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andSubjectIsNull() {
            addCriterion("subject is null");
            return (Criteria) this;
        }

        public Criteria andSubjectIsNotNull() {
            addCriterion("subject is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectEqualTo(String value) {
            addCriterion("subject =", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotEqualTo(String value) {
            addCriterion("subject <>", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectGreaterThan(String value) {
            addCriterion("subject >", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectGreaterThanOrEqualTo(String value) {
            addCriterion("subject >=", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLessThan(String value) {
            addCriterion("subject <", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLessThanOrEqualTo(String value) {
            addCriterion("subject <=", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLike(String value) {
            addCriterion("subject like", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotLike(String value) {
            addCriterion("subject not like", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectIn(List<String> values) {
            addCriterion("subject in", values, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotIn(List<String> values) {
            addCriterion("subject not in", values, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectBetween(String value1, String value2) {
            addCriterion("subject between", value1, value2, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotBetween(String value1, String value2) {
            addCriterion("subject not between", value1, value2, "subject");
            return (Criteria) this;
        }

        public Criteria andBatchIsNull() {
            addCriterion("batch is null");
            return (Criteria) this;
        }

        public Criteria andBatchIsNotNull() {
            addCriterion("batch is not null");
            return (Criteria) this;
        }

        public Criteria andBatchEqualTo(String value) {
            addCriterion("batch =", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchNotEqualTo(String value) {
            addCriterion("batch <>", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchGreaterThan(String value) {
            addCriterion("batch >", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchGreaterThanOrEqualTo(String value) {
            addCriterion("batch >=", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchLessThan(String value) {
            addCriterion("batch <", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchLessThanOrEqualTo(String value) {
            addCriterion("batch <=", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchLike(String value) {
            addCriterion("batch like", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchNotLike(String value) {
            addCriterion("batch not like", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchIn(List<String> values) {
            addCriterion("batch in", values, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchNotIn(List<String> values) {
            addCriterion("batch not in", values, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchBetween(String value1, String value2) {
            addCriterion("batch between", value1, value2, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchNotBetween(String value1, String value2) {
            addCriterion("batch not between", value1, value2, "batch");
            return (Criteria) this;
        }

        public Criteria andSchoolLocationIsNull() {
            addCriterion("school_location is null");
            return (Criteria) this;
        }

        public Criteria andSchoolLocationIsNotNull() {
            addCriterion("school_location is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolLocationEqualTo(String value) {
            addCriterion("school_location =", value, "schoolLocation");
            return (Criteria) this;
        }

        public Criteria andSchoolLocationNotEqualTo(String value) {
            addCriterion("school_location <>", value, "schoolLocation");
            return (Criteria) this;
        }

        public Criteria andSchoolLocationGreaterThan(String value) {
            addCriterion("school_location >", value, "schoolLocation");
            return (Criteria) this;
        }

        public Criteria andSchoolLocationGreaterThanOrEqualTo(String value) {
            addCriterion("school_location >=", value, "schoolLocation");
            return (Criteria) this;
        }

        public Criteria andSchoolLocationLessThan(String value) {
            addCriterion("school_location <", value, "schoolLocation");
            return (Criteria) this;
        }

        public Criteria andSchoolLocationLessThanOrEqualTo(String value) {
            addCriterion("school_location <=", value, "schoolLocation");
            return (Criteria) this;
        }

        public Criteria andSchoolLocationLike(String value) {
            addCriterion("school_location like", value, "schoolLocation");
            return (Criteria) this;
        }

        public Criteria andSchoolLocationNotLike(String value) {
            addCriterion("school_location not like", value, "schoolLocation");
            return (Criteria) this;
        }

        public Criteria andSchoolLocationIn(List<String> values) {
            addCriterion("school_location in", values, "schoolLocation");
            return (Criteria) this;
        }

        public Criteria andSchoolLocationNotIn(List<String> values) {
            addCriterion("school_location not in", values, "schoolLocation");
            return (Criteria) this;
        }

        public Criteria andSchoolLocationBetween(String value1, String value2) {
            addCriterion("school_location between", value1, value2, "schoolLocation");
            return (Criteria) this;
        }

        public Criteria andSchoolLocationNotBetween(String value1, String value2) {
            addCriterion("school_location not between", value1, value2, "schoolLocation");
            return (Criteria) this;
        }

        public Criteria andEntryDateIsNull() {
            addCriterion("entry_date is null");
            return (Criteria) this;
        }

        public Criteria andEntryDateIsNotNull() {
            addCriterion("entry_date is not null");
            return (Criteria) this;
        }

        public Criteria andEntryDateEqualTo(Date value) {
            addCriterionForJDBCDate("entry_date =", value, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("entry_date <>", value, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateGreaterThan(Date value) {
            addCriterionForJDBCDate("entry_date >", value, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("entry_date >=", value, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateLessThan(Date value) {
            addCriterionForJDBCDate("entry_date <", value, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("entry_date <=", value, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateIn(List<Date> values) {
            addCriterionForJDBCDate("entry_date in", values, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("entry_date not in", values, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("entry_date between", value1, value2, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("entry_date not between", value1, value2, "entryDate");
            return (Criteria) this;
        }

        public Criteria andLowestScoreIsNull() {
            addCriterion("lowest_score is null");
            return (Criteria) this;
        }

        public Criteria andLowestScoreIsNotNull() {
            addCriterion("lowest_score is not null");
            return (Criteria) this;
        }

        public Criteria andLowestScoreEqualTo(Double value) {
            addCriterion("lowest_score =", value, "lowestScore");
            return (Criteria) this;
        }

        public Criteria andLowestScoreNotEqualTo(Double value) {
            addCriterion("lowest_score <>", value, "lowestScore");
            return (Criteria) this;
        }

        public Criteria andLowestScoreGreaterThan(Double value) {
            addCriterion("lowest_score >", value, "lowestScore");
            return (Criteria) this;
        }

        public Criteria andLowestScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("lowest_score >=", value, "lowestScore");
            return (Criteria) this;
        }

        public Criteria andLowestScoreLessThan(Double value) {
            addCriterion("lowest_score <", value, "lowestScore");
            return (Criteria) this;
        }

        public Criteria andLowestScoreLessThanOrEqualTo(Double value) {
            addCriterion("lowest_score <=", value, "lowestScore");
            return (Criteria) this;
        }

        public Criteria andLowestScoreIn(List<Double> values) {
            addCriterion("lowest_score in", values, "lowestScore");
            return (Criteria) this;
        }

        public Criteria andLowestScoreNotIn(List<Double> values) {
            addCriterion("lowest_score not in", values, "lowestScore");
            return (Criteria) this;
        }

        public Criteria andLowestScoreBetween(Double value1, Double value2) {
            addCriterion("lowest_score between", value1, value2, "lowestScore");
            return (Criteria) this;
        }

        public Criteria andLowestScoreNotBetween(Double value1, Double value2) {
            addCriterion("lowest_score not between", value1, value2, "lowestScore");
            return (Criteria) this;
        }

        public Criteria andBatchLineIsNull() {
            addCriterion("batch_line is null");
            return (Criteria) this;
        }

        public Criteria andBatchLineIsNotNull() {
            addCriterion("batch_line is not null");
            return (Criteria) this;
        }

        public Criteria andBatchLineEqualTo(Double value) {
            addCriterion("batch_line =", value, "batchLine");
            return (Criteria) this;
        }

        public Criteria andBatchLineNotEqualTo(Double value) {
            addCriterion("batch_line <>", value, "batchLine");
            return (Criteria) this;
        }

        public Criteria andBatchLineGreaterThan(Double value) {
            addCriterion("batch_line >", value, "batchLine");
            return (Criteria) this;
        }

        public Criteria andBatchLineGreaterThanOrEqualTo(Double value) {
            addCriterion("batch_line >=", value, "batchLine");
            return (Criteria) this;
        }

        public Criteria andBatchLineLessThan(Double value) {
            addCriterion("batch_line <", value, "batchLine");
            return (Criteria) this;
        }

        public Criteria andBatchLineLessThanOrEqualTo(Double value) {
            addCriterion("batch_line <=", value, "batchLine");
            return (Criteria) this;
        }

        public Criteria andBatchLineIn(List<Double> values) {
            addCriterion("batch_line in", values, "batchLine");
            return (Criteria) this;
        }

        public Criteria andBatchLineNotIn(List<Double> values) {
            addCriterion("batch_line not in", values, "batchLine");
            return (Criteria) this;
        }

        public Criteria andBatchLineBetween(Double value1, Double value2) {
            addCriterion("batch_line between", value1, value2, "batchLine");
            return (Criteria) this;
        }

        public Criteria andBatchLineNotBetween(Double value1, Double value2) {
            addCriterion("batch_line not between", value1, value2, "batchLine");
            return (Criteria) this;
        }

        public Criteria andPlanCountIsNull() {
            addCriterion("plan_count is null");
            return (Criteria) this;
        }

        public Criteria andPlanCountIsNotNull() {
            addCriterion("plan_count is not null");
            return (Criteria) this;
        }

        public Criteria andPlanCountEqualTo(Double value) {
            addCriterion("plan_count =", value, "planCount");
            return (Criteria) this;
        }

        public Criteria andPlanCountNotEqualTo(Double value) {
            addCriterion("plan_count <>", value, "planCount");
            return (Criteria) this;
        }

        public Criteria andPlanCountGreaterThan(Double value) {
            addCriterion("plan_count >", value, "planCount");
            return (Criteria) this;
        }

        public Criteria andPlanCountGreaterThanOrEqualTo(Double value) {
            addCriterion("plan_count >=", value, "planCount");
            return (Criteria) this;
        }

        public Criteria andPlanCountLessThan(Double value) {
            addCriterion("plan_count <", value, "planCount");
            return (Criteria) this;
        }

        public Criteria andPlanCountLessThanOrEqualTo(Double value) {
            addCriterion("plan_count <=", value, "planCount");
            return (Criteria) this;
        }

        public Criteria andPlanCountIn(List<Double> values) {
            addCriterion("plan_count in", values, "planCount");
            return (Criteria) this;
        }

        public Criteria andPlanCountNotIn(List<Double> values) {
            addCriterion("plan_count not in", values, "planCount");
            return (Criteria) this;
        }

        public Criteria andPlanCountBetween(Double value1, Double value2) {
            addCriterion("plan_count between", value1, value2, "planCount");
            return (Criteria) this;
        }

        public Criteria andPlanCountNotBetween(Double value1, Double value2) {
            addCriterion("plan_count not between", value1, value2, "planCount");
            return (Criteria) this;
        }

        public Criteria andChineseScoreIsNull() {
            addCriterion("chinese_score is null");
            return (Criteria) this;
        }

        public Criteria andChineseScoreIsNotNull() {
            addCriterion("chinese_score is not null");
            return (Criteria) this;
        }

        public Criteria andChineseScoreEqualTo(Double value) {
            addCriterion("chinese_score =", value, "chineseScore");
            return (Criteria) this;
        }

        public Criteria andChineseScoreNotEqualTo(Double value) {
            addCriterion("chinese_score <>", value, "chineseScore");
            return (Criteria) this;
        }

        public Criteria andChineseScoreGreaterThan(Double value) {
            addCriterion("chinese_score >", value, "chineseScore");
            return (Criteria) this;
        }

        public Criteria andChineseScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("chinese_score >=", value, "chineseScore");
            return (Criteria) this;
        }

        public Criteria andChineseScoreLessThan(Double value) {
            addCriterion("chinese_score <", value, "chineseScore");
            return (Criteria) this;
        }

        public Criteria andChineseScoreLessThanOrEqualTo(Double value) {
            addCriterion("chinese_score <=", value, "chineseScore");
            return (Criteria) this;
        }

        public Criteria andChineseScoreIn(List<Double> values) {
            addCriterion("chinese_score in", values, "chineseScore");
            return (Criteria) this;
        }

        public Criteria andChineseScoreNotIn(List<Double> values) {
            addCriterion("chinese_score not in", values, "chineseScore");
            return (Criteria) this;
        }

        public Criteria andChineseScoreBetween(Double value1, Double value2) {
            addCriterion("chinese_score between", value1, value2, "chineseScore");
            return (Criteria) this;
        }

        public Criteria andChineseScoreNotBetween(Double value1, Double value2) {
            addCriterion("chinese_score not between", value1, value2, "chineseScore");
            return (Criteria) this;
        }

        public Criteria andMathScoreIsNull() {
            addCriterion("math_score is null");
            return (Criteria) this;
        }

        public Criteria andMathScoreIsNotNull() {
            addCriterion("math_score is not null");
            return (Criteria) this;
        }

        public Criteria andMathScoreEqualTo(Double value) {
            addCriterion("math_score =", value, "mathScore");
            return (Criteria) this;
        }

        public Criteria andMathScoreNotEqualTo(Double value) {
            addCriterion("math_score <>", value, "mathScore");
            return (Criteria) this;
        }

        public Criteria andMathScoreGreaterThan(Double value) {
            addCriterion("math_score >", value, "mathScore");
            return (Criteria) this;
        }

        public Criteria andMathScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("math_score >=", value, "mathScore");
            return (Criteria) this;
        }

        public Criteria andMathScoreLessThan(Double value) {
            addCriterion("math_score <", value, "mathScore");
            return (Criteria) this;
        }

        public Criteria andMathScoreLessThanOrEqualTo(Double value) {
            addCriterion("math_score <=", value, "mathScore");
            return (Criteria) this;
        }

        public Criteria andMathScoreIn(List<Double> values) {
            addCriterion("math_score in", values, "mathScore");
            return (Criteria) this;
        }

        public Criteria andMathScoreNotIn(List<Double> values) {
            addCriterion("math_score not in", values, "mathScore");
            return (Criteria) this;
        }

        public Criteria andMathScoreBetween(Double value1, Double value2) {
            addCriterion("math_score between", value1, value2, "mathScore");
            return (Criteria) this;
        }

        public Criteria andMathScoreNotBetween(Double value1, Double value2) {
            addCriterion("math_score not between", value1, value2, "mathScore");
            return (Criteria) this;
        }

        public Criteria andForeignScoreIsNull() {
            addCriterion("foreign_score is null");
            return (Criteria) this;
        }

        public Criteria andForeignScoreIsNotNull() {
            addCriterion("foreign_score is not null");
            return (Criteria) this;
        }

        public Criteria andForeignScoreEqualTo(Double value) {
            addCriterion("foreign_score =", value, "foreignScore");
            return (Criteria) this;
        }

        public Criteria andForeignScoreNotEqualTo(Double value) {
            addCriterion("foreign_score <>", value, "foreignScore");
            return (Criteria) this;
        }

        public Criteria andForeignScoreGreaterThan(Double value) {
            addCriterion("foreign_score >", value, "foreignScore");
            return (Criteria) this;
        }

        public Criteria andForeignScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("foreign_score >=", value, "foreignScore");
            return (Criteria) this;
        }

        public Criteria andForeignScoreLessThan(Double value) {
            addCriterion("foreign_score <", value, "foreignScore");
            return (Criteria) this;
        }

        public Criteria andForeignScoreLessThanOrEqualTo(Double value) {
            addCriterion("foreign_score <=", value, "foreignScore");
            return (Criteria) this;
        }

        public Criteria andForeignScoreIn(List<Double> values) {
            addCriterion("foreign_score in", values, "foreignScore");
            return (Criteria) this;
        }

        public Criteria andForeignScoreNotIn(List<Double> values) {
            addCriterion("foreign_score not in", values, "foreignScore");
            return (Criteria) this;
        }

        public Criteria andForeignScoreBetween(Double value1, Double value2) {
            addCriterion("foreign_score between", value1, value2, "foreignScore");
            return (Criteria) this;
        }

        public Criteria andForeignScoreNotBetween(Double value1, Double value2) {
            addCriterion("foreign_score not between", value1, value2, "foreignScore");
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