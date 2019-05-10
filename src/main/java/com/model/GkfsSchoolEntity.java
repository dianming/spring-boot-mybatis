package com.model;

import java.util.Date;

public class GkfsSchoolEntity {
    private Integer id;

    private String subject;

    private String batch;

    private String schoolLocation;

    private Date entryDate;

    private Double lowestScore;

    private Double batchLine;

    private Double planCount;

    private Double chineseScore;

    private Double mathScore;

    private Double foreignScore;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject == null ? null : subject.trim();
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch == null ? null : batch.trim();
    }

    public String getSchoolLocation() {
        return schoolLocation;
    }

    public void setSchoolLocation(String schoolLocation) {
        this.schoolLocation = schoolLocation == null ? null : schoolLocation.trim();
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public Double getLowestScore() {
        return lowestScore;
    }

    public void setLowestScore(Double lowestScore) {
        this.lowestScore = lowestScore;
    }

    public Double getBatchLine() {
        return batchLine;
    }

    public void setBatchLine(Double batchLine) {
        this.batchLine = batchLine;
    }

    public Double getPlanCount() {
        return planCount;
    }

    public void setPlanCount(Double planCount) {
        this.planCount = planCount;
    }

    public Double getChineseScore() {
        return chineseScore;
    }

    public void setChineseScore(Double chineseScore) {
        this.chineseScore = chineseScore;
    }

    public Double getMathScore() {
        return mathScore;
    }

    public void setMathScore(Double mathScore) {
        this.mathScore = mathScore;
    }

    public Double getForeignScore() {
        return foreignScore;
    }

    public void setForeignScore(Double foreignScore) {
        this.foreignScore = foreignScore;
    }
}