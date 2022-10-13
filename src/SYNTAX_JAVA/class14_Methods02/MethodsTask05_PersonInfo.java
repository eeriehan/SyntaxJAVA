package SYNTAX_JAVA.class14_Methods02;

public class MethodsTask05_PersonInfo {

    static String createEmail(String firstName, String lastName, String emailType) {
        return (firstName + lastName + "@" + emailType + ".com").toLowerCase();

    }

    public static void main(String[] args) {
        MethodsTask05_PersonInfo task5 = new MethodsTask05_PersonInfo();
        String fullEmail = MethodsTask05_PersonInfo.createEmail("jogn", "snow", "gmail");
        System.out.println(fullEmail);

    }
}
//Create a method:  createEmail().
//Based on values of users first name, last name and email type, your method
//should return complete email address.
// ex. createEmail(John, Snow, gamil)-->jognsnow@gmail.com