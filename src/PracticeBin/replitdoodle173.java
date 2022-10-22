package PracticeBin;

public class replitdoodle173 {
    public static void main(String[] args) {
        Tea obj01 = new lemonTea("??");
        Tea obj02 = new chaiTea("what now?");
        obj01.addSugar();
        obj02.addSugar();
    }
}
abstract class Tea{
    String teaType;
    Tea(String teaType){
        this.teaType=teaType;
    }
    abstract void addSugar() ;
}
class lemonTea extends Tea{
    lemonTea(String teaType) {
        super(teaType);
    }
    @Override
    void addSugar(){
        System.out.println("For Lemon Tea we need 2 spoons of sugar");
    }
}
class chaiTea extends Tea{
    chaiTea(String teaType) {
        super(teaType);
    }
    @Override
    void addSugar(){
        System.out.println("For Chai Tea we need 1 spoon of sugar");
    }
}
/*# Abstraction
Create a Super Class Tea that will have:
- instance variable teaType;
- constructor that will initialize
- unimplemented method addSugar(),
Create 2 subclasses of Tea as Lemon Tea and Chai Tea.
In main class create an object of 2 Child and assign them to Parent reference type.
Execute method addSugar from both classes.
**Expected Output:**

For Lemon Tea we need 2 spoons of sugar
For Chai Tea we need 1 spoon of sugar*/