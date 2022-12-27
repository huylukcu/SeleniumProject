package selenium_review;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

public class Q01 extends TestBase {

        // 1) Open the browser
        //2) Enter the URL “http://practice.automationtesting.in/”
        //3) Click on Shop Menu
        //4) Now click on Home menu button
        //5) Test whether the Home page has Three Sliders only
        //6) The Home page must contains only three sliders

        @Test
        public void test1() {
            //3) Click on Shop
            driver.findElement(By.xpath("//a[text()='Shop'"));

            //3) Click on Shop Menu
            driver.findElement(By.xpath("//a[text()='Shop']")).click();

            //4) Now click on Home menu button
            driver.findElement(By.xpath("(//a[@href='http://practice.automationtesting.in'])[2]")).click();

            //5) Test whether the Home page has Three Sliders only
            //6) The Home page must contains only three sliders

            int expectedSliders=3;
            int actualSliders;

            List<WebElement> sliders= driver.findElements(By.className("row_inner_wrapper"));
            actualSliders=sliders.size();

            Assert.assertTrue(expectedSliders==actualSliders);

        }
}
