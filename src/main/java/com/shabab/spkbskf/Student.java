package com.shabab.spkbskf;

import com.shabab.spkbskf.validation.NationalityValidation;

public class Student {

    private int age;




    private int nationality;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNationality() {
        return nationality;
    }

    public void setNationality(int nationality) {
        this.nationality = nationality;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", nationality=" + nationality +
                '}';


    }
}
