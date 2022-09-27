package com.syntax.class08_Loops;

import java.util.Scanner;

public class jobWithWhileLoop {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String answer;

        System.out.println("Did you get a job?");
        answer = scan.nextLine();

        while (!answer.equals("yes")) {
            System.out.println("did you get a job?");
            answer = scan.nextLine();

        }

        String answerDo;

        do {
            System.out.println("Did you get a job?");
            answerDo = scan.nextLine();

        } while (!answerDo.equals("yes"));

        System.out.println("Congrats");
    }
}


