package SYNTAX_JAVA.class16_AccessModifiers;

public class ExampleDog01 {
    private String name;
    private String breed;
    private String color;
    private int age;
    private double weight;

    ExampleDog01(String dogName,String dogBreed,String dogColor,int dogAge,double dogWeight){
        name=dogName;
        breed=dogBreed;
        color=dogColor;
        if(dogAge>30){
            System.out.println("Please enter a valid value");
        }else {
            age=dogAge;
        }
}
}
