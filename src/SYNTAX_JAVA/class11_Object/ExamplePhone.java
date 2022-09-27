package SYNTAX_JAVA.class11_Object;

public class ExamplePhone {
    //Create 3 objects of it: iphone, pixel, samsung with specific attributes and behaviors.

    String make;
    String model;
    String color;
    int year;
    int storage;

    void makeCall() {
        System.out.println("Making a call using " + model);
    }

    void takePictures() {
        System.out.println("Taking picture with " + model);
    }

    void broseInternet() {
        System.out.println("Browsing the internet using " + model);
    }
}
