package SYNTAX_JAVA.class14_Methods02;

public class MethodsTask04_Hello {
    void sayHello(String country) {
        switch (country) {
            case "USA" -> System.out.println("Hello");
            case "India" -> System.out.println("Namasute");
            case "Turkiye" -> System.out.println("Merhaba");
            case "Pakistan" -> System.out.println("AOA");
            case "Korea" -> System.out.println("An nyung ha seo yo");
        }
    }
    public static void main(String[] args) {

    }
}
//Create a method that will say Hello in different language based on the
// country that will passed when method is executed