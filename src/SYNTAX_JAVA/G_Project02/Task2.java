package SYNTAX_JAVA.G_Project02;

    /*
    We have to calculate the average of marks obtained in three subjects by student A and by student B.
    Create class 'Marks' with an 'abstract method-getPercentage'
    that will be returning the 'average percentage of marks.'

    Provide implementation of abstract method in classes 'A' and 'B'.
    The constructor of student A, takes the marks in three subjects as its parameters
    and the marks in four subjects  as its parameters for student B. Test your code
   */
public class Task2 {
    public static void main(String[] args) {
        Marks[] averageGradeList = {new studentA(96, 76, 83),
                new studentB(73, 77, 97, 100)};
        for (Marks gradeOf : averageGradeList) {
            System.out.println("average: " + gradeOf.getPercentage());
        }
    }
}

abstract class Marks {
    abstract double getPercentage();
}

class studentA extends Marks {
    double gradeMath;
    double gradeHistory;
    double gradeEnglish;

    studentA(double gradeMath, double gradeHistory, double gradeEnglish) {
        this.gradeMath = gradeMath;
        this.gradeHistory = gradeHistory;
        this.gradeEnglish = gradeEnglish;
    }

    @Override
    double getPercentage() {
        return (gradeMath + gradeHistory + gradeEnglish) / 3;
    }
}

class studentB extends Marks {
    double gradeMath;   // variables in class is not same variable as in studentA
    double gradeHistory;
    double gradeEnglish;
    double gradeArt;

    studentB(double gradeMath, double gradeHistory, double gradeEnglish, double gradeArt) {
        this.gradeMath = gradeMath;     //not super, because not extending variables from parent class/constructor
        this.gradeHistory = gradeHistory;
        this.gradeEnglish = gradeEnglish;
        this.gradeArt = gradeArt;
    }

    @Override
    double getPercentage() {
        return (gradeMath + gradeHistory + gradeEnglish + gradeArt) / 4;
    }
}
