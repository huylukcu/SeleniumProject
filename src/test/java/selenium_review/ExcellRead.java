package selenium_review;

import org.apache.poi.ss.usermodel.*;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcellRead {
    public static void main(String[] args) throws IOException {
        String path = "./src/test/java/resources/Capitals.xlsx";
        FileInputStream inputStream = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(inputStream);
        Sheet sheet = workbook.getSheet("Sheet1");

        System.out.println(workbook.getSheet("Sheet1").getRow(4).getCell(0));
//        Row row = sheet.getRow(0);
//        Cell cell = row.getCell(0);
//        System.out.println(cell);
//
//        Cell r1c2 = row.getCell(1);
//        System.out.println(r1c2.toString());
//
//        Cell a = row.getCell(0);
    }}
