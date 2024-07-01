package com.ssmE.label.pojo;

public class Student {
    private  String name;
    private  String gender;

//    constructor

    public Student(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }


    //getter and setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
