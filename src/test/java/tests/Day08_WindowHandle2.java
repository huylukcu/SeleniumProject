package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WindowType;
import utilities.TestBase;

    public class Day08_WindowHandle2 extends TestBase {
        @Test
        public void newWindowTest() throws InterruptedException {
            //open techproeducation on window 1
            driver.get("https://www.techproeducation.com");
            String techProTitle = driver.getTitle();
            Assert.assertTrue(techProTitle.contains("Techpro Education"));
            String techProHandle = driver.getWindowHandle();//getting window 1 id
            Thread.sleep(5000);

            //open amazon on a new window 2
            driver.switchTo().newWindow(WindowType.WINDOW);//creates a new window and switches to that window automatically
            driver.get("https://www.amazon.com");
            String amazonTitle = driver.getTitle();
            Assert.assertTrue(amazonTitle.contains("Amazon"));
            String amazonHandle = driver.getWindowHandle();//getting window 2 id

            //open linkedin on a new window 3
            Thread.sleep(5000);
            driver.switchTo().newWindow(WindowType.WINDOW);//creates a new window and switches to that window automatically
            driver.get("https://www.linkedin.com");
            String linkedinTitle = driver.getTitle();
            Assert.assertTrue(linkedinTitle.contains("LinkedIn"));
            String linkedinHandle = driver.getWindowHandle();//getting window 3 id
            Thread.sleep(3000);

            //switch back to Tecpro
            driver.switchTo().window(techProHandle);
            System.out.println("TechPro : " + driver.getCurrentUrl());
            Thread.sleep(3000);

            //Switch back to Amazon
            driver.switchTo().window(amazonHandle);
            System.out.println("Amazon : " +driver.getCurrentUrl());

            Thread.sleep(3000);
            //Switching back to Linkedin
            driver.switchTo().window(linkedinHandle);
            System.out.println("Linkedin : "+driver.getCurrentUrl());
        }
    }

        git /*
         Multiple windows
         The multiple windows may open when there is a link that opens in a new TAB or WINDOWS
         We use windowHandle to get the current window id, windowHandles to get all open windows ids
         We use set of list to get all window ids and switch to the desired window using loop and if condition
        /*

