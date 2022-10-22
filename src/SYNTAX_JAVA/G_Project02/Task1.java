package SYNTAX_JAVA.G_Project02;

public class Task1 {
    /*
    Create an Interface 'Shape' with undefined methods as calculateArea and calculate parameter.
    Create 2 classes Circle & Square that implements functionality defined in the Shape Interface.
    Test your code.
    */
    public static void main(String[] args) {
        Shape[] math = {    //create single array with matching name of 'interface shape' to call each obj/class
                new circle(10), new square(5)
        };
        for (Shape mathObj : math) {
            mathObj.calculateArea();
            mathObj.CalculateParameter();
        }
    }
}

interface Shape {   //Q:Create an Interface 'Shape' with undefined methods as calculateArea and calculate parameter
    void calculateArea();
    void CalculateParameter();
}

class circle implements Shape { //Q:Create 2 classes Circle & Square
    double radius;

    circle(double radius) {
    this.radius = radius;
    }

    @Override
    public void calculateArea() {
        System.out.println("the area of circle: " + ((radius * radius) * Math.PI));   // PI * (r * r) = AreaOfCircle
    }

    @Override
    public void CalculateParameter() {
        System.out.println("parameter of circle: " + (2 * Math.PI * radius));   // parameter = 2 * PI * r
    }
}

class square implements Shape { //Q:Create 2 classes Circle & Square


    int length;

    square(int length) {
        this.length = length;
    }

    @Override
    public void calculateArea() {
        System.out.println("the area of square: " + (length * 2));
    }

    @Override
    public void CalculateParameter() {
        System.out.println("the perimeter of square: " + (length * 4));
    }
}