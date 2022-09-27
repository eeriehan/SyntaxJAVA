package SYNTAX_JAVA.class11_Object;

public class ExamplePhoneTester {
    public static void main(String[] args) {

        ExamplePhone iphone = new ExamplePhone();
        iphone.make = "Apple";
        iphone.model = "Iphone 14 Pro Max";
        iphone.storage = 128;
        iphone.makeCall();

        //new Phone() => To Create the object
        ExamplePhone samsungPhone = new ExamplePhone();
        //Samsung Mobile S22 Ultra 2022
        samsungPhone.model = "S22 Ultra";
        samsungPhone.make = "Samsung Mobile";
        samsungPhone.year = 2022;
        samsungPhone.makeCall();


    }


}
