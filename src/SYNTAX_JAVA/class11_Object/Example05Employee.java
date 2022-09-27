package com.syntax.class11_Object;

public class Example05Employee {

    String name;
    String id;
    String department;
    String shift;
    double salary;

    void work() {
        System.out.println(name + " is working on shift " + shift);
    }

    void takeLeaves() {
        System.out.println(name + " is going to leave " + shift);
    }

    public static void main(String[] args) {
        Example05Employee emp1 = new Example05Employee();
        emp1.name = "john";
        emp1.id = "syn123";
        emp1.department = "IT";
        emp1.shift = "Evening";
        emp1.salary = 200000;
        emp1.work();

        Example05Employee emp2 = new Example05Employee();
        emp2.name = "Cindy";
        emp2.id = "syn003";
        emp2.department = "HR";
        emp2.shift = "Morning";
        emp2.salary = 150000;
        emp2.takeLeaves();

    }

}
