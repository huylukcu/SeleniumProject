package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_TitleVerification {
    //getPageSource() returns page source code as a string
    //We might use this to verify if a certain text exist in the entire page
    //Note that pageSource is not used a lot to do assertions
    //Because it is too general and can lead false result
    //TEST CASE:
    //Test if amazon contains “Registry” on the homepage
    // Create a new class : GetPageSource

    public static void main(String[] args) {
//        1.Create a new class: VerifyTitleTest
//        2.Navigate to techproeducation homepage
//        3.Verify if google title is “Techpro Education | Online It Courses & Bootcamps”


        System.setProperty("webdriver.chrome.driver", "./src/resources/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.techproeducation.com");
        //get the title

        String actualTitle = driver.getTitle();
        String expectedTitle = "Techpro Education | Online It Courses & Bootcamps";

        //Verify if page title is “Techpro Education | Online It Courses & Bootcamps”

        if(actualTitle.equals(expectedTitle)) {
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("actualTitle :"+actualTitle);
            System.out.println("but expectedTitle :" + expectedTitle);
        }
        //driver.quit();

        //Manual testing to verify page title:
        //go to title --> right click--> inspect --> scroll down--> find <title> --> take screenshot



    }
}
