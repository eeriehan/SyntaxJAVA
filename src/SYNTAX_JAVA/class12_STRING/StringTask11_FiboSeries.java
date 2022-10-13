package SYNTAX_JAVA.class12_STRING;

public class StringTask11_FiboSeries {
    void add(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    void printFiboSeries(int size) {

        int previous = 0;
        int currentNumber = 1;
        int nextNum = 0;
        System.out.println(previous);
        System.out.println(currentNumber);
        for (int i = 0; i < size; i++) {
            nextNum = previous + currentNumber;
            System.out.println(nextNum);
            previous = currentNumber;
            currentNumber = nextNum;
        }
    }

    public static void main(String[] args) {
        StringTask11_FiboSeries obj = new StringTask11_FiboSeries(); // Creating an object of the Math class
        obj.printFiboSeries(5); // this is how we execute the logic present inside the methods
        System.out.println("**");
        obj.printFiboSeries(10);
        obj.add(10, 20);

    }
}

