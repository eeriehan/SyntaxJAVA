package SYNTAX_JAVA.class14_Methods02;

public class MethodsTask06_PrimeNot {
    /*Write a method to return whether given number is prime or not?*/
    boolean isPrime(int num) {
        boolean isPrime = true;
        if (num > 1) {

            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        } else {
            isPrime = false;
        }

        return isPrime;
    }

    public static void main(String[] args) {
        MethodsTask06_PrimeNot task6 = new MethodsTask06_PrimeNot();
        System.out.println(task6.isPrime(12));
        System.out.println(task6.isPrime(5));
    }
}

