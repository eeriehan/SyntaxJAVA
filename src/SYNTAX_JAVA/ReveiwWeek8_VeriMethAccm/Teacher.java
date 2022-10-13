package SYNTAX_JAVA.ReveiwWeek8_VeriMethAccm;

public class Teacher {

    String name, lastName;  //instance variable
    int experience; //instance variable
    String subject;
    double salary;

    static String school;   //static bcz all teacher share same school.

    /*how to create a constructor
     * 1.    constructor name = classname
     * 2.    no return  type not even void*/

//SC to constructor - hold on right click -> generate -> constructor -> select all
//    public Teacher(String name, String lastName, int experience, String subject, double salary) {
//        this.name = name;
//        this.lastName = lastName;
//        this.experience = experience;
//        this.subject = subject;
//        this.salary = salary;
//    }

    //using below constructor we initialize instance variables
    Teacher(String fName, String lName) {
        name = fName;
        lastName = lName;
    }
    /**
     * when you create a constructor Compiler is not going to create a default constructor
     */
    void print(){
        System.out.println(name+" "+lastName);
    }


}
