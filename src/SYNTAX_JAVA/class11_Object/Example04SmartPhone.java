package com.syntax.class11_Object;

public class Example04SmartPhone {

    String make;
    String model;
    String color;
    int storage;
    double size;
    boolean cheap;

    void call() {
        System.out.println("calling........");
    }

    void takePicture() {
        System.out.println("Taking pictures");
    }

    public static void main(String[] args) {

        // Name of Class variable name = new NameOfClass();
        Example04SmartPhone iphone = new Example04SmartPhone();

        iphone.make = "Apple";
        iphone.model = "Iphone 14 Pro Max";
        iphone.color = "Black";
        iphone.storage = 128;
        iphone.size = 14.8;
        iphone.cheap = false;

        System.out.println("Make " + iphone.make + " model " + iphone.model);
        iphone.call();

        System.out.println("***************************************************");

        Example04SmartPhone samsungMobile = new Example04SmartPhone();
        samsungMobile.make = "Samsung";
        samsungMobile.model = "Galaxy S23 Ultra";
        samsungMobile.color = "Purple";
        samsungMobile.storage = 256;
        samsungMobile.size = 15;
        samsungMobile.cheap = false;

        System.out.println(iphone.make);
        System.out.println(samsungMobile.make);

    }

}
