package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {
    public static void main(String[] args) throws InterruptedException {

        // Set Driver Path
        // Create chrome driver object
        // Maximize the window
        // Open google home page https://www.google.com/
        // Wait for 3 seconds
        // Go to the "https://techproeducation.com/"
        // Get the title and URL of the page
        // Check if the title contains the word "Bootcamps" print console "Title contains Bootcamps" or "Title does not contain Bootcamps"
        // Check if the URL contains the word "Courses" print console "URL contains Courses" or "URL does not contain Courses"
        // Then go to "https://medunna.com/"
        // Get the title and check if it contains the word "MEDUNNA" and print "Title contains MEDUNNA" or "Title does not contain MEDUNNA"
        // Back to the previous webpage
        // Refresh the page
        // Navigate to forward
        // Wait for 3 seconds
        // Close the browser

        // Set Driver Path
        System.setProperty("webdriver.chrome.driver", "./src/resources/drivers/chromedriver");

        // Create chrome driver object
        WebDriver driver = new ChromeDriver();

        // Maximize the window
        driver.manage().window().maximize();

        // Open google home page https://www.google.com/
        driver.get("https://www.google.com/");

        //Wait for 3 secs
        Thread.sleep(2000);

        // Go to the "https://techproeducation.com/"
        driver.get("https://techproeducation.com/");

        //
        String techProTitle = driver.getTitle();
        String techProUrl = driver.getCurrentUrl();



    }
}