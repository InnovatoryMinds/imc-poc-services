package com.mmc.app.platform.Models;

public class Student {
    private  String StudentName;
    private  String stuTypeId;
    private Address address;
    private Contact contact;
    private String birthday;

    public Student() {
    }

    public Student(String studentName, String stuTypeId, Address address, Contact contact, String birthday) {
        StudentName = studentName;
        this.stuTypeId = stuTypeId;
        this.address = address;
        this.contact = contact;
        this.birthday = birthday;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public String getStuTypeId() {
        return stuTypeId;
    }

    public void setStuTypeId(String stuTypeId) {
        this.stuTypeId = stuTypeId;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Student{" +
                "StudentName='" + StudentName + '\'' +
                ", stuTypeId='" + stuTypeId + '\'' +
                ", address=" + address +
                ", contact=" + contact +
                ", birthday='" + birthday + '\'' +
                '}';
    }
}
