package PracticeBin;

public interface Task1 {
    /*
1. Create an Interface 'Shape' with undefined
methods as calculateArea and
calculate Perimiter. Create 2 classes Circle &
Square that implements functionality defined in
the Shape Interface. Test your code.
     */

    public void calculateArea(double a);

    public void calculatePerimeter(double b);

    class Circle implements Task1 {

        public void calculateArea(double a) {
            System.out.println(" Area of a circle is : " + (3.14 * a * a));
        }

        public void calculatePerimeter(double b) {
            System.out.println(" Area of a circle is : " + (3.14 * 2 * b));
        }
    }

    class Square implements Task1 {

        public void calculateArea(double c) {
            System.out.println(" Area of a circle is : " + (3.14 * c * c));
        }

        public void calculatePerimeter(double d) {

            System.out.println(" Area of a circle is : " + (d * 4));
        }

        public static void main(String[] args) {

            Task1 circle = new Circle();
            circle.calculateArea(20);
            circle.calculatePerimeter(30);
            Task1 square = new Square();
            square.calculateArea(15);
            square.calculatePerimeter(15);
        }
    }

}