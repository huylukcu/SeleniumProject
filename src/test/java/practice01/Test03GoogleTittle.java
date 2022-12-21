package practice01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Test03GoogleTittle {

   /* Then create 3 different test methods using the following names. And Go to google. 
    titleTest =>Verify if google title = “Google” 
    imageTest => Verify if google image displays or not 
    gmailLinkTest => Verify if the Gmail link is displayed or not
    Close the browser after each test
    */
   WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
    }
    @Test
    public void googleTitle(){
        //get the title
        String actualTitle = driver.getTitle();//Return type String,actual data seleniumda gelir
        String expectedTitle = "Google"; //expected data userstory den gelir,web page de olandir
        //verify bu sayfa dogru sayfa mi
        if(actualTitle.equals(expectedTitle)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("Actual Title "+ actualTitle);
            System.out.println("Expected Title "+ expectedTitle);
        }
    }
        @Test
           public void googleImg() {
        }}