package Practises.practice03;

import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

import static org.junit.Assert.assertEquals;

public class Q02_FileUpload extends TestBase {
    @Test
    public void test() {

            //Go to "https://cgi-lib.berkeley.edu/ex/fup.html"
           driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
            //Type "My File" into "Notes about the file" input
            driver.findElement(By.name("note")).sendKeys("My File");
            //Select the file to upload
            //Click "Choose File" button
            driver.findElement(By.name("upfile")).sendKeys("/Users/hyry/Desktop/test");

            //Click on "Press" button
            driver.findElement(By.xpath("//input[@type='submit']")).click();

            //Assert that "Your notes on the file were" equals "My File"
            String note = driver.findElement(By.xpath("//blockquote")).getText();
            assertEquals("My File", note);

            //Assert that file Content contains "Hello, I am uploaded file"
            String fileContent = driver.findElement(By.xpath("//pre")).getText();
           // assertTrue(fileContent.contains("Hello, I am uploaded file"));
        }
    }