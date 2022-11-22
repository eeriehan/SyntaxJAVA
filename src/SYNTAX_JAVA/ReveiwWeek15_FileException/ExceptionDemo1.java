package SYNTAX_JAVA.ReveiwWeek15_FileException;

public class ExceptionDemo1 {
    public static void main(String[] args) throws AgeNotAllowed {
        int age=15;

        if(age<18){
            throw new AgeNotAllowed("You should not be here");
        }
    }
}