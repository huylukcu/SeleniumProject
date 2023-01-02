package selenium_review;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

public class C_WebTables extends TestBase {
    @Test
    public void printTableData() {
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/");
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();

        WebElement orderTable = driver.findElement(By.id("ctl00_MainContent_orderGrid"));
        int rowSize = orderTable.findElements(By.tagName("tr")).size();
        System.out.println(rowSize);

        List<WebElement> rows = orderTable.findElements(By.tagName("tr"));
        for (WebElement row : rows) {
            List<WebElement> columns = row.findElements(By.tagName("td"));
            for (WebElement column : columns) {
                System.out.print(column.getText() + " | ");
            }
            System.out.println();
            System.out.println("=======================");

        }
    }}
