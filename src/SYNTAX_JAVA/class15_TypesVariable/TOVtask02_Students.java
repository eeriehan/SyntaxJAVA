package SYNTAX_JAVA.class15_TypesVariable;

public class TOVtask02_Students {
    /*Create a Class called Students Create three  variables  Name ,
    ID  and  numberOfStudents Create three objects of the Students Class
    Set the value for  studentName , studentID and increment  the numberOfStudents
    for each object Print out  total number of students*/

    String id;
    String name;

    static int numberOfStudent;

    public static void main(String[] args) {
        TOVtask02_Students roman = new TOVtask02_Students();
        roman.id="1";
        roman.name="Ivan";
        TOVtask02_Students.numberOfStudent++;

        TOVtask02_Students sotam = new TOVtask02_Students();
        sotam.id="2";
        sotam.name="Sadam";
        TOVtask02_Students.numberOfStudent++;

        System.out.println(roman.numberOfStudent);
        System.out.println(sotam.numberOfStudent);
    }
}

