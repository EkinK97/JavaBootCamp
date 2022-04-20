package com.company;

import java.time.LocalDate;

public class student extends PersonalData {
//     - String:name
//        - long:id
//        - double:gpa
//        - PersonalData:pd
//        + Student(String,long,double,PersonalData)
//        + getName():String
//        + getID():long
//        + getGPA():double
//        + getPersonalData():PersonalData
//        + toString():String
    private String name;
    private long id;
    private double gpa;
    private PersonalData data;

    public student(String name, long id, double gpa, PersonalData data) {
        super();
        this.name = name;
        this.id = id;
        this.gpa = gpa;
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public double getGpa() {
        return gpa;
    }

    public PersonalData getData() {
        return data; //object
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + this.name + '\'' +
                ", id=" + this.id +
                ", gpa=" + this.gpa +
                ", data=" + this.data +
                '}';
    }

}
