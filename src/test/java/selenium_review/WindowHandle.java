package selenium_review;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WindowType;
import utilities.TestBase;

import static java.awt.SystemColor.window;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class WindowHandle extends TestBase {
    // Open 3 new windows and verify their titles --

    @Test
    public void newWindowTest() throws InterruptedException {
        // Open "https://www.techproeducation.com" on window 1
        driver.get("https://techproeducation.com/");
        //Get the title of the page
        String techproTitle = driver.getTitle();

        //Verify that title contains "Techpro Education"
        Assert.assertTrue(techproTitle.contains("Techpro"));
        //Open "https://www.amazon.com" on a NEW window 2
        driver.get("https://amazon.com/");

        //Get the title of the page
        String amaoznTitle = driver.getTitle();
        // Verify that title contains "Amazon"
        Assert.assertTrue(amaoznTitle.contains("Amazon"));
        //Open "https://www.linkedin.com" on a NEW window 3
        driver.get("https://www.linkedin.com");
        // Get the title of the page
        String linkedTitle = driver.getTitle();
        //Verify that title contains "LinkedIn"
        Assert.assertTrue(linkedTitle.contains("LinkedIn"));

        //Switch back to Techpro
        Thread.sleep(3000);
        driver.switchTo().window(techProHandle)

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