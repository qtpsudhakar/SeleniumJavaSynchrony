package com.java.oops;

public class Employee {

    private int age = 30; //20 - 60
    private String empName;

    Employee(String empName){ //constructor
        this.empName = empName;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age) {
        if (age>60){
            System.out.println("Employee age must be less than or equal 60");
        }else if (age<20){
            System.out.println("Employee age must be greater than or equal 20");
        }else {
            this.age = age;
            System.out.println("employee age updated:"+this.age);
        }
    }
}
