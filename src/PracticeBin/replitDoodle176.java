package PracticeBin;


public class replitDoodle176 implements ChildInterface {
    public static void main(String[] istilldontunderstand) {
        ChildInterface aa= new replitDoodle176();
        aa.parentMethod();
        aa.childMethod();
    }
    public void parentMethod() {
        System.out.println("Parent Method-welcome to Syntax");
    }
    public void childMethod() {
        System.out.println("Child Method-hello Syntax");
    }
}
interface ParentInterface {
    void parentMethod();
}

interface ChildInterface extends ParentInterface {
    void childMethod();
}

