package SYNTAX_JAVA.class11_Object;

public class Example02Dogs {

    // [STATE]
    // -attributes / properties / fields
    String name;
    String color;
    String breed;
    double weight;
    int age;

    // These are the behaviors of a dog
    // also called as Methods, Function in Java.
    void bark() {
        System.out.println("Barking......");
    }

    void sleep() {
        System.out.println("Dog is sleeping........");
    }

    public static void main(String[] args) {
        // creating objects from a class
        Example02Dogs dog1 = new Example02Dogs();
        // new ExampleDogs(); <- it creates an object of class ExampleDogs
        // creating behavior from a class
        dog1.bark();
        dog1.sleep();
        //
    }
}
