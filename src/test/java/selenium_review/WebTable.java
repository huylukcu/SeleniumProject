package selenium_review;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

public class WebTable extends TestBase {
    @Test
    public void rowNum () {
        /*
          1. Go to “https://demoqa.com/webtables”
          2. Print all the department names in Header
          3. Print all the data in Department column
          4. Print the Header of the 3rd column
          5. Print all the table data
          6. Print the number of cells  in table
          7. Print the number of rows in table
          8. Print the number of columns in table
          9. Print all the 3rd column data in table
         10. Print the "Salary" of whose "First Name" is "Cierra"
         11. Create a method with 2 parameters(row number and column number) in the class that returns the data of a specific cell
     */
        // 1. Go to “https://demoqa.com/webtables”
        driver.get("https://demoqa.com/webtables");
        // 2. Print all the department names in Header
        List<WebElement> listOfHead = driver.findElements(By.xpath("//div[@class='rt-th rt-resizable-header -cursor-pointer']"));
        for (WebElement each : listOfHead) {
            System.out.println(each.getText());
        }
//        //3. Print all the data in Department column
//        driver.findElement(By.("//"))
//        @Test
//        public void test() {
//            // 1. Go to “https://demoqa.com/webtables”
//            driver.get("https://demoqa.com/webtables");
//
//            //      2. Print all the department names in Header
//            List<WebElement> listOfHeaderElements = driver.findElements(By.xpath("//div[@class='rt-th rt-resizable-header -cursor-pointer']"));
//
//            for (WebElement eachElement : listOfHeaderElements) {
//                System.out.println("Header Elements " + eachElement.getText());
//            }
//            //     3. Print all the data in Department column
//            List <WebElement> departmentsList = driver.findElements(By.xpath("//div[@class='rt-tr-group']//div[@class='rt-td'][6]"));
//            for(WebElement eachElement : departmentsList){
//                System.out.println(eachElement.getText());
//            }
//
//            //      4. Print the Header of the 3rd column
//            WebElement headerOf3rdColumn = driver.findElement(By.xpath("(//div[@class='rt-th rt-resizable-header -cursor-pointer'])[3]"));
//            System.out.println("Header of the 3rd column : " + headerOf3rdColumn.getText());
//
//            //OR
//            System.out.println("Header of the 3rd column : " + listOfHeaderElements.get(2).getText());
//
//            //      5. Print all the table data
//            WebElement allTableData = driver.findElement(By.xpath("//div[@class='rt-tbody']"));
//            System.out.println(allTableData.getText());
//
//            //      6. Print the number of cells in table
//            List<WebElement> allCells = driver.findElements(By.xpath("//div[@class='rt-tbody']//div[@class='rt-td']"));
//            System.out.println("Number of cell data : " + allCells.size());
//
//            //    7. Print the number of rows in table
//            List<WebElement> allRows = driver.findElements(By.xpath("//div[@class='rt-tbody']//div[@class='rt-tr-group']"));
//            System.out.println("Number of rows : " + allRows.size());
//
//            //    8. Print the number of columns in table
//             }
    }}
