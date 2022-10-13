package SYNTAX_JAVA.class18_This;
public class HwTask01_02_ABCinherits {
    static class A_mugCup {
        static String name;
        static double price;
        static char size;
        A_mugCup(String name, double price, char size, boolean hasHandle) {
            this.name = name;
            this.price = price;
            this.size = size;
        }
        static void printF() {
            System.out.println("clearance Sale: " + name + " $" + price + " " + size + " size ONLY");
        }}
    static class B_blueBrown extends A_mugCup {
        boolean hasHandle;
        B_blueBrown(String name, double price, char size, boolean hasHandle) {
            super(name, price, size, hasHandle);
            this.hasHandle = hasHandle;
            printF();
        }}
    static class C_ivoryWhite extends B_blueBrown {
        boolean returnedItem;
        C_ivoryWhite(String name, double price, char size, boolean returnedItem) {
            super(name, price, size, returnedItem);
            this.returnedItem = returnedItem;
        }}
    public static void main(String[] args) {
        B_blueBrown bBB = new B_blueBrown("IvWh12233", 19.99, 'M', true);
        bBB.printF();
    }}
/**
 * Write program for multilevel inheritance where class C inherits from
 * class B and Class B inherits from Class A.
 * Write program to inherit class A that has method printF
 * which is static and call or reuse that method into class B
 * i dont know what im doing in this task....
 */
