package com.syntax.class11_Object;

public class Example06ThisPerson {

    String name;
    int id;
    double weight;
    boolean isFunny;
    boolean losingHairs;
    double height;

    void study() {
        if (name.equals("Anna")) {
            System.out.println("I STUDY HARD");
        } else if (name.equals("Roman")) {
            System.out.println("I WILL KEEP ON DELETING MSG AND WILL NOT LET ANYONE STUDY");
        } else {
            System.out.println("Fuck!!! i do study but things don't make any fucking sense.");
        }
    }

    public static void main(String[] args) {
        Example06ThisPerson person1 = new Example06ThisPerson();
        person1.name = "Anna";
        person1.study();

        person1.name = "Roman";
        person1.study();

        person1.name = "Zina";
        person1.study();

    }
}
