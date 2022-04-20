package com.company;

import java.time.LocalDate;

public class PersonalData  {
//      - java.time.LocalDate:birthDate
//        - String:address
//        - long:ssn
//        + PersonalData(java.time.LocalDate,long)
//        + PersonalData(int,int,int,long)
//        + getBirthDate():java.time.LocalDate
//        + getAddress():String
//        + getSSN():long
//        + setAddress(String):void
    private LocalDate dateOfBirth;
    private String address;
    private long ssn;

    public PersonalData() {
        super();
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.ssn = ssn;
    }

    public PersonalData(int year, int month, int day, long ssn) {
        super();
        this.dateOfBirth = LocalDate.of(year, month, day);
        this.ssn = ssn;

    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getSsn() {
        return ssn;
    }
}
