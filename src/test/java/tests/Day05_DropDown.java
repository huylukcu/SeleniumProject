package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class Day05_DropDown {
        WebDriver driver;

        @Before
        public void setUp() {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
            driver.manage().window().maximize();
            driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");
        }
        @Test
        public void selectByIndexTest(){
        //**Select Option 1 by index from the dropdown
        //1. locate the dropdown
            WebElement dropdown = driver.findElement(By.id("dropdown"));
        //2. Create Select object cause dropdown is in the select tag. this is for only dropdowns
            Select select = new Select(dropdown);
        //3. Select any option using the select object
            select.selectByIndex(1); // index starts at 0
        }
        //**Create method selectByVisibleTextTest Select Option 2 by visible text
        @Test
        public void selectByVisibleTextTest(){
            WebElement dropdown = driver.findElement(By.id("dropdown"));
            Select select = new Select(dropdown);
            select.selectByVisibleText("Option 2");
        }
        //**Create method selectByValueTest Select Option 1 value
        @Test
        public void selectByValueTest() throws InterruptedException {
            WebElement dropdown = driver.findElement(By.id("dropdown"));
            Select select = new Select(dropdown);
            Thread.sleep(3000);//HARD WAIT. WAITS 3 SECONDS
            select.selectByValue("1");
            Thread.sleep(3000);
            select.selectByValue("2");
            Thread.sleep(3000);
            select.selectByValue("1");
            Thread.sleep(3000);
            select.selectByValue("2");
        }
        //**Create method printAllTest Print all dropdown value
        @Test
        public void printAllTest(){
            WebElement dropdown = driver.findElement(By.id("dropdown"));
            Select select = new Select(dropdown);
        //getOptions(); returns all of the dropdown options
            List<WebElement> allOptions = select.getOptions();
            for (WebElement eachOption : allOptions){
        //getText() returns the TEXT of the webelements as STRING
                System.out.println(eachOption.getText());
            }
        //**Verify the dropdown has Option 2 text
            boolean isOption2Exist=false;
            for (WebElement eachOption : allOptions){
                if (eachOption.getText().equals("gadhstdhdrtyjh")){
                    isOption2Exist=true;
                }
            }
//        fails if Option 2 is not in the dropdown
//        pass if Option 2 is in the dropdown
            Assert.assertTrue(isOption2Exist);
        }

//6.Create method printFirstSelectedOptionTest Print first selected option
//7.Find the size of the dropdown, Print "Expected Is Not Equal Actual" if there are not 3 elements in the
        @After
        public void tearDown() {
            driver.quit();
        }

    }