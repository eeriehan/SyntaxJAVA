package SYNTAX_JAVA.class18_This;
public class HwTask03_Teachers {
    String name;
    String subject;
    int experience;
    HwTask03_Teachers(String name, String subject, int experience) {
        this.name = name;
        this.subject = subject;
        this.experience = experience;
    }
    void printTeacherInfo() {
        System.out.println("name: " + name + " subject: " + subject + " Exp(years): " + experience+" ");
    }
}
class MathTeacher extends HwTask03_Teachers {
    boolean onlineClass;
    MathTeacher(String name, String subject, int experience, boolean onlineClass) {
        super(name, subject, experience);
        this.onlineClass=onlineClass;
    }
    void onlineClassInfo() {
        if(onlineClass){
        System.out.println("Online Class(T/F): "+ onlineClass);
        }else {
            System.out.println("Online Class(T/F): "+ onlineClass);
        }
}
static class ChemistryTeacher extends MathTeacher {
    String afterSchoolActivity;
    ChemistryTeacher(String name, String subject, int experience, boolean onlineClass) {
        super(name, subject, experience, onlineClass);
        this.afterSchoolActivity=afterSchoolActivity;
    }
}
    public static void main(String[] args) {
        ChemistryTeacher obj3 = new ChemistryTeacher("NEO","CHEM",99, true);
        obj3.printTeacherInfo();
        obj3.onlineClassInfo();
        HwTask03_Teachers obj2 = new HwTask03_Teachers("Steve Steven","Algebra",7);
        obj2.printTeacherInfo();
        MathTeacher obj1 = new MathTeacher("Steve Steven","Algebra",7, true);
        obj1.printTeacherInfo();
        obj1.onlineClassInfo();
    }
}



 /*    class MathTeacher extends HwTask03_Teachers {
        boolean onlineClass;

        MathTeacher(String name, String subject, boolean masterDegree, boolean onlineClass) {
            super(name, subject, masterDegree);
            this.onlineClass = onlineClass;
        }}


        class ChemistryTeacher extends MathTeacher {
            boolean labCertified;

        ChemistryTeacher(String name, String subject, boolean masterDegree, boolean onlineClass, boolean labCertified) {
            super(name, subject, masterDegree, onlineClass);
            this.labCertified = labCertified;
        }}

            public class PianoTeacher extends ChemistryTeacher {
                boolean hasPiano;

                PianoTeacher(String name, String subject, boolean masterDegree, boolean onlineClass, boolean hasPiano) {
                    super(name, subject, masterDegree, onlineClass, hasPiano);
                    this.hasPiano = hasPiano;
                }}

        public printTeacherInfo() {
            System.out.println("name: " + name + " subject: " + subject + " Master(T/F): " + masterDegree +
                    " Online Class(T/F): "+ onlineClass + " Lab Certified: " + labCertified);
        }

        }


    public static void main(String[] args) {
        MathTeacher obj1 = new MathTeacher("P.Smith","Math",true, false,);
        MathTeacher.printTeacherInfo();
        ChemistryTeacher obj2 = new ChemistryTeacher();
        obj2.printTeacherInfo();
        PianoTeacher obj3 = new PianoTeacher();
        obj3.printTeacherInfo();
    }
}*/


/*Write a Java program called Teacher.  Identify features and behaviour of that Class.
Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher that would have it
their own features and behaviour. Test all 4 classes
 */
