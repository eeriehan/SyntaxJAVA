package PracticeBin;

class replitDoodle175 implements FirstInterface, SecondInterface {

    public void firstMethod() {
        System.out.println("First Method implementing multiple Inheritance");
    }

    public void secondMethod() {
        System.out.println("Second Method implementing multiple Inheritance");
    }


    public static void main(String[] args) {
        replitDoodle175 aa = new replitDoodle175();
        aa.firstMethod();
        aa.secondMethod();
    }
}

interface FirstInterface {
    void firstMethod();
}

interface SecondInterface {
    void secondMethod();
}