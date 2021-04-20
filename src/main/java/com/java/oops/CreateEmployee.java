package com.java.oops;

public class CreateEmployee {
    public static void main(String[] args) {
        Employee emp1 = new Employee("demo");

        System.out.println(emp1.getAge());
        emp1.setAge(61);
        System.out.println(emp1.getAge());
        emp1.setAge(19);
        System.out.println(emp1.getAge());
        emp1.setAge(35);
        System.out.println(emp1.getAge());
    }
}
