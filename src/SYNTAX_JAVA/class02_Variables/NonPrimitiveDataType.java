package com.syntax.class02_Variables;

import javax.xml.crypto.dsig.CanonicalizationMethod;

public class NonPrimitiveDataType {

    public static void main(String[] args) {

        String name = "Han ";
        String lastName = "Jo ";
        String grade = "9";
        String city = "Haymarket ";
        String state = "Verginia ";
        String phonenumber = "703_703_7037";

        System.out.println("My name is " + name);
        System.out.println("I'm " + grade + "th grade student.");
        System.out.println("I live in " + city + "in " + state);
        System.out.println("And my phone number is " + phonenumber);

        city = "San diago ";
        state = "Cali ";
        phonenumber = "333_333_3333";
        grade = "11";

        System.out.println("My name is " + name + "and I moved to new city " + city + "in " + state);
        System.out.println("My new phone number is " + phonenumber);
		
			
			
		
		
		/*
			b)   Change student’s city, state, phone number and grade. And print those updated values:
			Example:
			My name is  and I moved to new city and new state. My new phone number is*/
        ;
    }

}
