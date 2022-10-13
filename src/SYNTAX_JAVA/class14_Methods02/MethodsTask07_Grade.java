package SYNTAX_JAVA.class14_Methods02;

public class MethodsTask07_Grade {
    char getGrade(int score) {
        char grade;
        if (score > 90) {
            grade = 'A';
        } else if (score > 80) {
            grade = 'B';
        } else if (score > 70) {
            grade = 'C';
        } else if (score > 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        return grade;
    }

    public static void main(String[] args) {
        MethodsTask07_Grade task7 = new MethodsTask07_Grade();
        System.out.println(task7.getGrade(81));

    }
}

/*method getGrade. your method should accept the score of a student and return a grade:
 * score > 90 - A
 * score > 80 - B
 * score > 70 - C
 * score > 60 - D*/
