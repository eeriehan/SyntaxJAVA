package SYNTAX_JAVA.class16_TypesVariable2;

public class Task1_Tester {
    public static void main(String[] args) {
        Task1 task = new Task1();
        int[] array = {10, 10, 20, 30};
        System.out.println(task.sumArray(array));
        System.out.println((int)task.sumArray(array));
    }
}
