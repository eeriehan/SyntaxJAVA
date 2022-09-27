package com.syntax.class10_Arrays;

public class TwoDArrayDemo1 {

    public static void main(String[] args) {
        String[][] countries = {

                {"Usa", "Canada"}, // 1 array with index 0
                {"Peru", "Brazil", "Colombia", "Ecuador"}, // 2 array with index 1
                {"Ethiopia", "Egypt", "Kenya"},
                {"Germany", "Turkiye", "Moldova", "Ukraine"},
                {"Kazakhstan", "Afghanistan", "Korea"}

        };

        System.out.println(countries.length); // 5 - total # of arrays or rows
        int elementOf1Array = countries[0].length;
        System.out.println("# of elements frome 1 Array: " + elementOf1Array);

        int elementOf2Array = countries[1].length;
        System.out.println("# of elements frome 2 Array: " + elementOf2Array);
        System.out.println();

        System.out.println("--> Getting all values for 2D Arrays <--");
        System.out.println();

        for (int row = 0; row < countries.length; row++) {
            System.out.println();
            for (int col = 0; col < countries[row].length; col++) {

                System.out.print(countries[row][col] + " ");

            }

            System.out.println();

            String[][] arr = {
                    {"Yusuf", "Hamza", "Adam", "John"},
                    {"A", "B", "C", "D"}
            };
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.println(arr[i][j]);
                }
            }
        }

    }


}

