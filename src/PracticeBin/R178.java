package PracticeBin;

public class R178 {
    public static void main(String[] args) {
        EncapsulationDemo obj1 = new EncapsulationDemo();
        obj1.getInfo("John", 30);

    }
}
class EncapsulationDemo {
    private String empName;
    private int empAge;

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

    void getInfo(String empName, int empAge) {
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee Age: " + empAge);
    }
}
