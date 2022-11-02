package PracticeBin;

public class replitDoodle177 implements Functions {
    public double adding(double fistNumber, double SecondNumber) {
        System.out.println("Rsult is ::: "+(fistNumber + SecondNumber));
        return 0;    }
    public double subtracting(double fistNumber, double SecondNumber) {
        System.out.println("Rsult is ::: "+(fistNumber - SecondNumber));
        return 0;    }
    public double multiply(double fistNumber, double SecondNumber) {
        System.out.println("Rsult is ::: "+(fistNumber * SecondNumber));
        return 0;    }
    public double dividing(double fistNumber, double SecondNumber) {
        System.out.println("Rsult is ::: "+(fistNumber / SecondNumber));
        return 0;
    }
    @Override
    public void display() {

    }
    public static void main(String[] args) {
        Functions obj1 = new replitDoodle177();
        double firstNumber = 100.00;
        double secondNumber = 20.00;
        obj1.adding(firstNumber,secondNumber);
        obj1.subtracting(firstNumber,secondNumber);
        obj1.multiply(firstNumber,secondNumber);
        obj1.dividing(firstNumber,secondNumber);
    }
}
interface Outputs {
    void display();
}
interface Functions extends Outputs {
    double adding(double fistNumber, double SecondNumber);
    double subtracting(double fistNumber, double SecondNumber);
    double multiply(double fistNumber, double SecondNumber);
    double dividing(double fistNumber, double SecondNumber);
}

