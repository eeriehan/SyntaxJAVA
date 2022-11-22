package SYNTAX_JAVA.class24_CollectionFramework;

import java.util.ArrayList;

public class hw01_insuranceTester {
    public static void main(String[] args) {
        /*
        Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour as
        getQuote and cancelInsurance. Create 3 subclasses Car, Pet, Health. Car class has it’s own attribute as
        carModel and Class Pet has petType attribute. Create 3 objects of the sub classes and store them in ArrayList.
        Using for loop/advanced for loop/ iterator access all methods of the class.
         */
        ArrayList<hw01_Insurance> insurances=new ArrayList<>();
        insurances.add(new Car("Adam","Tesla Model s"));
        insurances.add(new Pet("Geico","Dog"));
        insurances.add(new Health("State life"));
        System.out.println(insurances);


        for (hw01_Insurance i:insurances
        ) {
            i.getQuote();
            i.cancelInsurance();
        }
    }

}