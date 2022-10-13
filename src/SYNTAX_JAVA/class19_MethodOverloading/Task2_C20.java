package SYNTAX_JAVA.class19_MethodOverloading;

public class Task2_C20 {
    /*Write program: Shape class has a constructor that takes the radius
    and has a subclass as  circle class. In circle class
    create a method to calculate the area of circle. Test your code
     */
    public static void main(String[] args) {
        Circle obj1 = new Circle(6);
        obj1.calculateArea();
    }
}
class Shape {
    double radius;
    Shape(double radius) {
        this.radius = radius;
    }
}
class Circle extends Shape {
    Circle(double radius) {
        super(radius);
    }
    void calculateArea() {
        System.out.println(Math.PI * Math.pow(radius, 2));
    }
}
