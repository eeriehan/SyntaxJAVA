package SYNTAX_JAVA.class21_InterfaceAbstract;


public class DataBaseTester {
    public static void main(String[] args) {
        DataBase dataBase=new Oracle();
        dataBase.openDatabase();
        dataBase.readData();
        dataBase.writeData();
        dataBase.closeDatabase();
    }
}