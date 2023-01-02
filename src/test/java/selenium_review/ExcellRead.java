package selenium_review;

import org.apache.poi.ss.usermodel.*;
import org.junit.Assert;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcellRead {
    public static void main(String[] args) throws IOException {
        String path = "./src/test/java/resources/Capitals.xlsx";
        FileInputStream inputStream = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(inputStream);
        Sheet sheet1 = workbook.getSheet("Sheet1");
        Row row1 = sheet1.getRow(0);

        Cell cell1 = row1.getCell(0);
        System.out.println(cell1);

        String cell1data = cell1.toString();
        System.out.println(cell1);
        //go to 7.row 2.cell
        Row row7 = sheet1.getRow(6);
        Cell R7C2 = row7.getCell(1);
        System.out.println(R7C2);

        String R2C1 = sheet1.getRow(1).getCell(0).toString();
        System.out.println(R2C1);
        Assert.assertEquals("USA",R2C1);

        String R3C2 = sheet1.getRow(2).getCell(1).toString();
        System.out.println(R3C2);
        Assert.assertEquals("Paris",R3C2);

        int num = sheet1.getLastRowNum()+1;
        System.out.println(num);

        int pyscicalNum = sheet1.getPhysicalNumberOfRows();
        System.out.println(pyscicalNum);




    }
}