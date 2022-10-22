package PracticeBin;

public class replitdoodle150 {
}
class R150OtherWayHierarchical {
    String name;
    String lastName;
    int age;
    R150OtherWayHierarchical(String name, String lastName, int age){
        this.name=name;
        this.lastName=lastName;
        this.age=age;
    }
}
class Employee3 extends R150OtherWayHierarchical {
    int salary;
    Employee3(String name,String lastName,int age,int salary){
        super(name,lastName,age);
        this.salary=salary;
    }
    void printEmployee(){
        System.out.println(name+" "+lastName+" "+age+" "+salary);
    }
}
class Student3 extends R150OtherWayHierarchical {
    int grade;
    Student3(String name,String lastName,int age,int grade){
        super(name,lastName,age);
        this.grade=grade;

    }
    void printStudent(){
        System.out.println(name+" "+lastName+" "+age+" "+grade);
    }
}
class Retiree3 extends R150OtherWayHierarchical {
    String seniorActivity;
    Retiree3(String name,String lastName,int age,String seniorActivity){
        super(name,lastName,age);
        this.seniorActivity=seniorActivity;
    }
    void printRetiree(){
        System.out.println(name+" "+lastName+" "+age+" "+seniorActivity);
    }
}
class MainReplit150{
    public static void main(String[] args){
        new Employee3("Joe","Smith",35,35000).printEmployee();
        new Student3("Adam","Smith",15,10).printStudent();
        new Retiree3("Frank","Smith",15,"tour").printRetiree();
    }
}
/*1. Create four classes (Person, Employee, Student, Retiree)
* Have properties

For Person: name(String)
For Person: lastName(String)
For Person: age(int)
For Employee: salary(int)
For Student: grade(int)
For Retiree: seniorActivity(String)

At Employee, Student, Retiree Class have a print method in each that prints the properties in line as shown in the output

Create multilevel inheritance: Person --> Employee --> Student --> Retiree

From your Main class create objects of the Employee, Student and Retiree classes and call the print method.

**Expected Output:**
Joe Smith 35 35000
Adam Smith 15 10
Frank Smith 15 tour                     */
