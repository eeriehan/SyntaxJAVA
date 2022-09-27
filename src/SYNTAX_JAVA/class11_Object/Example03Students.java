package com.syntax.class11_Object;

public class Example03Students {

    String name;
    String id;
    int age;
    double weight;
    char gender;

    void study() {
        System.out.println("Student is studying");
    }

    void deleteMessages() {
        System.out.println("Deleting messeage from Discord");
    }

    void eat() {
        System.out.println("Eating pizzzzzzzzzzzzzzzzzzzzzzzzzzza...");
    }

    public static void main(String[] args) {
        // new ExampleStudents(); => Creates the object of Student class
        Example03Students FraidoonObject = new Example03Students();
        FraidoonObject.name = "Fraidoon";
        FraidoonObject.id = "123";
        FraidoonObject.age = 22;

        System.out.println(FraidoonObject.name);
        System.out.println(FraidoonObject.weight);
        FraidoonObject.deleteMessages();

        Example03Students student2 = new Example03Students();
        student2.name = "Asma";
        student2.id = "student";
        student2.age = 16;
        student2.weight = 105;
        student2.gender = 'F';
        System.out.println(student2.name);
        student2.eat();

    }
}
