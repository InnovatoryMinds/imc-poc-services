package com.mmc.app.platform.Models;

public class Contact {
    private String emailId;
    private String phoneNo;
    private String altPhoneNo;

    public Contact() {
    }

    public Contact(String emailId, String phoneNo, String altPhoneNo) {
        this.emailId = emailId;
        this.phoneNo = phoneNo;
        this.altPhoneNo = altPhoneNo;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getAltPhoneNo() {
        return altPhoneNo;
    }

    public void setAltPhoneNo(String altPhoneNo) {
        this.altPhoneNo = altPhoneNo;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "emailId='" + emailId + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", altPhoneNo='" + altPhoneNo + '\'' +
                '}';
    }
}
