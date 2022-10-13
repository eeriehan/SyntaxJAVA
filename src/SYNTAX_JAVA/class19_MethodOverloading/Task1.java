package SYNTAX_JAVA.class19_MethodOverloading;

public class Task1 {
    /*Create 1 class in which create a methods that will calculate the area
    (volume in case of box) ofRectangle, Square, Box Use separate class to test your code
     */
    public static void main(String[] args) {
        AreaManager areaManager = new AreaManager();
        areaManager.calculateArea(10);
        areaManager.calculateArea(10,20);
        areaManager.calculateVolume(10,20,30);
    }
}
class AreaManager{
    void calculateArea(double length, double width){        //Rectangle
        System.out.println(length*width);
    }
    void calculateArea(double length){              //Square
        System.out.println(length*length);
    }
    void calculateVolume(double length, double width, double height){              //Box
        System.out.println(length*width*height);
    }
}
