package com.syntax.G_Project01Task01;

public class CodingTask8 {

    public static void main(String[] args) {

        int i = 0;
        int j = 1;
        int k;
        int a;
        System.out.println(i);
        System.out.println(j);
        for (a = 2; a < 10; a++) { // repeat 8times.
            k = i + j;
            System.out.println(k);
            i = j;
            j = k;
        }

    }
}
//			System.out.println(i);
//			k = i + j;
//			System.out.println(j);
//			i = j + k;
//			System.out.println(k);
//			j = k + i;
//						

//	}

/*
 * How do you find the Fibonacci sequence? Add the first term (1) and 0.
 *
 * Remember, to find any given number in the Fibonacci sequence, you simply add
 * the two previous numbers in the sequence. To create the sequence, you should
 * think of 0 coming before 1 (the first term), so 1 + 0 = 1. 0, 1, 1, 2, 3, 5,
 * 8, 13,21,34,......55,89,144,233, 377, 610, 987, 1597, 2584
 */