package selenium_review;

import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class Q07 extends TestBase {
    @Test
    public void test(){
        driver.get("http://zero.webappsecurity.com/login.html");
        driver.findElement(By.id("user_login")).sendKeys("username");
        driver.findElement(By.id("user_password")).sendKeys("password");
        driver.findElement(By.name("submit")).click();


    }
}
