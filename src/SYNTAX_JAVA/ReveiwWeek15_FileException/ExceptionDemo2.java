package SYNTAX_JAVA.ReveiwWeek15_FileException;

import utils.ExcelReader;

import java.io.IOException;

public class ExceptionDemo2 {
    public static void main(String[] args) throws IOException { //throws <-- not good. always use try/catch
        ExcelReader.read("adsfasdfasd"); // shoud we throw or throw? when no try/catch block
    }
}
/*
* try{
* ExcelReader.read("dkajasdfl");}
* catch (IOException e){
* sout("Please contact our support team at support@Syntax.com");
* }
* */
