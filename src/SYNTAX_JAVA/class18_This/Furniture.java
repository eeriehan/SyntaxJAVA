package SYNTAX_JAVA.class18_This;

public class Furniture {
    String color = "green";
}

class Chair extends Furniture {
    String color = "Red";

    void printColor() {
        String color = "Black";
        System.out.println(color); //prints the local variable
        System.out.println(this.color); // prints the instance variable from same clas
        System.out.println(super.color); // prints the instance variable of parent
//Break till 1:47
    }
}
class TestChair {
    public static void main(String[] args) {
        Chair chair = new Chair();
        chair.printColor();
    }
}
