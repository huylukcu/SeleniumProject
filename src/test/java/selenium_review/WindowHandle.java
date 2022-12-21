package selenium_review;

import org.junit.Test;
import org.openqa.selenium.WindowType;
import utilities.TestBase;

import static org.junit.Assert.assertTrue;

public class WindowHandle extends TestBase {
    // Open 3 new windows and verify their titles --

    @Test
    public void newWindowTest() {
        // Open "https://www.techproeducation.com" on window 1
        driver.get("https://techproeducation.com/");
        //Get the title of the page
        String techpro = driver.getTitle();
        //Verify that title contains "Techpro Education"
        assertTrue(techpro.contains("Techpro Education"));
        String amazonHandle = driver.getWindowHandle();
        //Open "https://www.amazon.com" on a NEW window 2
        driver.switchTo().newWindow(WindowType.WINDOW);
        //Get the title of the page
        driver.get("https://amazon.com/");
        // Verify that title contains "Amazon"
        String amazontitle = driver.getTitle();
        assertTrue(amazontitle.contains("Amazon"));
        //Open "https://www.linkedin.com" on a NEW window 3
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://linkedin.com/");
        // Get the title of the page
        String linkedn = driver.getTitle();
        //Verify that title contains "LinkedIn"
        assertTrue(linkedn.contains("LinkedIn"));

        //Switch back to Techpro

//    Switch back to Amazon
//    And
//    Switch back to Linkedin
//   */
    }

    @Test
    public void tabHandleTest() {
        // Open "https://www.techproeducation.com" on window 1
        driver.get("https://techproeducation.com/");
        //Get the title of the page
        String techpro = driver.getTitle();
        //Verify that title contains "Techpro Education"
        assertTrue(techpro.contains("Techpro Education"));
        String amazonHandle = driver.getWindowHandle();
        //Open "https://www.amazon.com" on a NEW window 2
        driver.switchTo().newWindow(WindowType.WINDOW);
        //Get the title of the page
        driver.get("https://amazon.com/");
        // Verify that title contains "Amazon"
        String amazontitle = driver.getTitle();
        assertTrue(amazontitle.contains("Amazon"));
        //Open "https://www.linkedin.com" on a NEW window 3
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://linkedin.com/");
        // Get the title of the page
        String linkedn = driver.getTitle();
        //Verify that title contains "LinkedIn"
        assertTrue(linkedn.contains("LinkedIn"));


//    Switch back to Amazon
//    And
//    Switch back to Linkedin
//   */
    }
}