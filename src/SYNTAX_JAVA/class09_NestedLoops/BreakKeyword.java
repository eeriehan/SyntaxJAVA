package com.syntax.class09_NestedLoops;

public class BreakKeyword {

    public static void main(String[] args) {

        for (int i = 1; i < 5; i++) {
            System.out.println("hello");
            if (i == 3) ;
            break;
        }

        // break - break the loop and it usually used inside some type of Conditions
        boolean hunger = true;
        while (hunger) {
            System.out.println("give me food");
            break;
        }
        System.out.println("End");
    }
}
//continue	- continues to the next iteration/cycle
//moment Java sees continue -> it goes back to the beginning of the lo
//it usually used on some type of loop condition
//java continue keyword can be used in any of the loop c