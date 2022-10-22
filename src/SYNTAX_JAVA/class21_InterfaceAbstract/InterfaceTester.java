package SYNTAX_JAVA.class21_InterfaceAbstract;

public class InterfaceTester {
    public static void main(String[] args) {
        IDataBase iDataBase=new IBM();
        iDataBase.openDatabase();
        iDataBase.readData();
        iDataBase.writeData();

    }
}