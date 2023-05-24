package com.example.AOP;

import org.springframework.stereotype.Component;

import java.util.NoSuchElementException;

@Component
public class Student {

    private String name = "Rohan";
    private int age = 1;

    public void study(){
        System.out.println("I am student and I study a lot");
        return;
    }

    public Student getStudent(){
        if(1>2){
            return new Student();
        }else{
            throw new NoSuchElementException("No element Found");
        }

    }

    @Override
    public String toString() {
        return "Student Name " + getName() + " Student Age: " + getAge();
    }

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public int getAge() {return age;}

    public void setAge(int age) {this.age = age;}

}
