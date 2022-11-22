package PracticeBin;

public class R180 {
    public static void main(String[] args) {
        EncapsulationDemo obj1 = new EncapsulationDemo();

    }
}

class EncapulationDemo {
    private String empName="John";

    private int empAge=30;

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }
}