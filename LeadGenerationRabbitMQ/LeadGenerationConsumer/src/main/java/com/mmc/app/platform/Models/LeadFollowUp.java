package com.mmc.app.platform.Models;

public class LeadFollowUp {
    private String leadId;
    private String folUpDate;
    private String folUpTime;
    private String comments;

    public LeadFollowUp() {
    }

    public LeadFollowUp(String leadId, String folUpDate, String folUpTime, String comments) {
        this.leadId = leadId;
        this.folUpDate = folUpDate;
        this.folUpTime = folUpTime;
        this.comments = comments;
    }

    public String getLeadId() {
        return leadId;
    }

    public void setLeadId(String leadId) {
        this.leadId = leadId;
    }

    public String getFolUpDate() {
        return folUpDate;
    }

    public void setFolUpDate(String folUpDate) {
        this.folUpDate = folUpDate;
    }

    public String getFolUpTime() {
        return folUpTime;
    }

    public void setFolUpTime(String folUpTime) {
        this.folUpTime = folUpTime;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "LeadFollowUp{" +
                "leadId='" + leadId + '\'' +
                ", folUpDate='" + folUpDate + '\'' +
                ", folUpTime='" + folUpTime + '\'' +
                ", Comments='" + comments + '\'' +
                '}';
    }
}
