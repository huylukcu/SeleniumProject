package selenium_review;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class JSExecutor extends TestBase {
    @Test
    public void scroll() {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.get("https://www.amazon.com/");
        WebElement element = driver.findElement(By.className("navFooterColHead"));

        js.executeScript("arguments[0].scrollIntoView(true)", element);

    }
    @Test
    public void scrol(){
        driver.get("https://techproeducation.com/");

       // Scroll into "WE OFFER"
        WebElement element = driver.findElement(By.xpath("//*[.='we offer']"));
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("arguments[0].scrollIntoView(true)",element);

        //Scroll into "LMS LOGIN"
        js1.executeScript("arguments[0].scrollIntoView(true)");

        //Scroll into "WHY US"

        //Scroll back up to "Enroll Free"

        //Scroll all the way down

        //Scroll all the way up

        //Take a screenshot of each step




    }
}
