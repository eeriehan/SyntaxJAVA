package com.syntax.class06_SwitchCases;

import java.util.Scanner;

public class hW01 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What country??");
        String country = scan.nextLine();
        String lang = null;

        switch (country) {
            case "america":
                lang = "english";
                break;
            case "korea":
                lang = "korean";
                break;
            case "japan":
                lang = "japanese";
                break;
        }

        System.out.println("you are from " + country + " and your language is " + lang);


    }

}
/*Ask user to enter their country and capture it. Once values are captured print which language user speaks.*/