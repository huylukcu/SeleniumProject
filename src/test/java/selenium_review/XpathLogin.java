package selenium_review;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class XpathLogin {
    WebDriver driver;
    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();//
        driver = new ChromeDriver();//create driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); //15 mins wait in case needed
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fsign%2Fs%3Fk%3Dsign%2Bin%26ref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
    }
    @Test
    public void logTest() throws InterruptedException {
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("hayuycu@gmail.com");
        driver.findElement(By.xpath("//input[@name='metadata1']"));
    }
}
