package SYNTAX_JAVA.class15_TypesVariable;

public class TOVtask03_Person {

    private String password="pass123";
    double salary=1000;

    public String name="Roman";

    public static void main(String[] args) {
        TOVtask03_Person person1=new TOVtask03_Person();
        System.out.println(person1.password);
        System.out.println(person1.salary);
        Bank bank=new Bank();

    }
}

class Bank{

}

