package SYNTAX_JAVA.class28_FileHandling;

import utils.ExcelReader;

import java.io.IOException;

public class ReadingExcelFileDemo2 {

    public static void main(String[] args) throws IOException {

        var excelData = ExcelReader.read("Data/TestAsgar.xlsx");
        System.out.println(excelData);

    }
}