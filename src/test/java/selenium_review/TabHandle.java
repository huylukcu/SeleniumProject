package selenium_review;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import utilities.TestBase;

import static org.openqa.selenium.Keys.ENTER;

public class TabHandle extends TestBase {
    @Test
    public void test1() throws InterruptedException {
        driver.get("https://www.amazon.com/");
        String newpage = driver.getWindowHandle();

        String item = "dyson";
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(item + ENTER);
        driver.switchTo().newWindow(WindowType.TAB);
        Thread.sleep(3000);

        driver.get("https://www.amazon.com/");
        String item1 = "sun glasses";
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(item1 + ENTER);
        Thread.sleep(3000);

        driver.switchTo().newWindow(WindowType.TAB);





    }

}
