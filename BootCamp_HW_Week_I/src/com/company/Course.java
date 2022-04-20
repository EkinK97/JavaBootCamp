package com.company;

import java.util.*;

public class Course {
    private String courseName;
    private student[] students = new student[0]; //student list
    private int capacity = 40;
    private int numberOfStudent =0;

    public Course(String name) {
        this.courseName = name;
        this.capacity = 40;
    }

    public Course(String name, int capacity) {
        this.courseName = name;
        this.capacity = capacity;
    }

    public String getCourseName() {
        return courseName;
    }

    public student[] getStudents() {
        return students;
    }

    public int getNumberOfStudent() {
        return numberOfStudent;
    }
    //TODO Same student can't be added to list **Can same name and surname but can't have same number!
    //Student cannot add if limit of class exceed
    public boolean addStudent(student students){
        if(getNumberOfStudent() < this.capacity){
            for (int i = 0; i < this.students.length; i++) {
                if (this.students[i].getId() == students.getId()) {  //student checked in list
                    System.out.println("Student already exist!");
                    return false;
                }else {
                    this.students[getNumberOfStudent()]=students;
                    System.out.println(students.toString()+" Successfully added to course");
                    this.numberOfStudent++;
                    return true;
                }
            }
        }
        System.out.println("Capacity of course exceed");
        return false;
    }
    //TODO delete student from array with student id ** names may same!!
    //TODO Array operations/linkedlist transformations!!



    public boolean dropStudent(student students) {
        List<student> std = new LinkedList<student>(Arrays.asList());
        for(int i = 0 ; i < this.students.length; i++ ){
            if(this.students[i].getId() == students.getId()){
                std.remove(i);
                System.out.println(students.getName() +" Successfully dropped");
                return true;
            }else{
                System.out.println("Student cannot found!");
            }
        }
        return false;
    }
    //TODO class size can be increased by 5 (any limitation for it?)
    // in call we can increase it
    public void increaseCapacity(){
        this.capacity += 5; //must exceed before the operation
        System.out.println("Maximum capacity increased by 5...");
    }
    //TODO compare students according to their gpa's
    //TODO bubble sort algorithm may useful
    public student getBestStudent(){
        for (int i = 0; i < this.students.length; i++){
            //TODO Loop must compare all student in list and store most high one sorting algorithm may use
            for(int j = i + 1; j < this.students.length; j++){
                if(this.students[i].getGpa() > students[j].getGpa()){
                    student compstd = students[i];
                    students[i] = students[j];
                    students[j] = compstd;
                }
            }
        }
        return students[students.length - 1];
    }
    //TODO find youngest student
    //TODO bubble sort algorithm may useful
    public student getYoungestStudent(){
        for (int i = 0; i < students.length; i++){
            for(int j = i+1; j < students.length; j++){
                if (students[i].getData().getDateOfBirth().isAfter(students[j].getData().getDateOfBirth())){
                    student youngest = students[i];
                    students[i] = students[j];
                    students[j] = youngest;
                }
            }

        }
        return students[students.length - 1];
    }
    //TODO clear all student from list **list may set 0 directly
    public void clearStudent() {
        this.students = new student[0];
        numberOfStudent = 0;
    }
    //TODO list all student
    public void list(){
        if (numberOfStudent != 0){
            for (student list : students){
                System.out.println("Name :"+ list.getName());
                System.out.println("ID :" + list.getId());
            }
        }else{
            System.out.println("There is no student in this class!");
        }
    }
}
