package com.mmc.app.platform.Models;

import java.util.List;

public class LeadGeneration {
    private Student student;
    private  String createdBy;
    private String instituteId;
    private String stageId;
    private String statusId;
    private String sourceId;
    private String allocatedTo;
    private String createDate;
    private String remarks;
    private List<LeadFollowUp> leadFolUp;

    public  LeadGeneration(){}

    public LeadGeneration(Student student, String createdBy, String instituteId, String stageId, String statusId, String sourceId, String allocatedTo, String createDate, String remarks, List<LeadFollowUp> leadFolUp) {
        this.student = student;
        this.createdBy = createdBy;
        this.instituteId = instituteId;
        this.stageId = stageId;
        this.statusId = statusId;
        this.sourceId = sourceId;
        this.allocatedTo = allocatedTo;
        this.createDate = createDate;
        this.remarks = remarks;
        this.leadFolUp = leadFolUp;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getInstituteId() {
        return instituteId;
    }

    public void setInstituteId(String instituteId) {
        this.instituteId = instituteId;
    }

    public String getStageId() {
        return stageId;
    }

    public void setStageId(String stageId) {
        this.stageId = stageId;
    }

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public String getAllocatedTo() {
        return allocatedTo;
    }

    public void setAllocatedTo(String allocatedTo) {
        this.allocatedTo = allocatedTo;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public List<LeadFollowUp> getLeadFolUp() {
        return leadFolUp;
    }

    public void setLeadFolUp(List<LeadFollowUp> leadFolUp) {
        this.leadFolUp = leadFolUp;
    }

    @Override
    public String toString() {
        return "LeadGeneration{" +
                "student=" + student +
                ", createdBy='" + createdBy + '\'' +
                ", instituteId='" + instituteId + '\'' +
                ", stageId='" + stageId + '\'' +
                ", statusId='" + statusId + '\'' +
                ", sourceId='" + sourceId + '\'' +
                ", allocatedTo='" + allocatedTo + '\'' +
                ", createDate='" + createDate + '\'' +
                ", remarks='" + remarks + '\'' +
                ", leadFolUp=" + leadFolUp +
                '}';
    }
}
