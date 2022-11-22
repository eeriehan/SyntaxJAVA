package SYNTAX_JAVA.class27_ExelFiles;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExelTest {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\hanjo\\Desktop\\syntaxBatch14\\WpsSaves\\Test.xlsx";
        FileInputStream fileInputStream = new FileInputStream((path));
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook((path));
        Sheet sheet = xssfWorkbook.getSheet("Sheet1");
        Row row = sheet.getRow(0);
        System.out.println(row.getCell(0));

    }
}
