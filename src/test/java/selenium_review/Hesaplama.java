package selenium_review;

import org.junit.Test;
import utilities.TestBase;

public class Hesaplama extends TestBase {
    // ...Practice 4...
    // Navigate to  https://testpages.herokuapp.com/styled/index.html
    // Click on  Calculator under Micro Apps
    // Type any number in the first input
    // Type any number in the second input
    // Click on Calculate
    // Get the result
    // Verify the result
    // Print the result
    // Close the browser by using @After annotation
   /* @Test
        public void test(){
        @Test
        public void test2(){
            // Navigate to  https://testpages.herokuapp.com/styled/index.html
            driver.get("https://testpages.herokuapp.com/styled/index.html");

            // Click on  Calculator under Micro Apps
            driver.findElement(By.id("calculatetest")).click();

            // Type any number in the first input
            driver.findElement(By.id("number1")).sendKeys("6");

            // Type any number in the second input
            driver.findElement(By.id("number2")).sendKeys("4");

            // Click on Calculate
            driver.findElement(By.id("calculate")).click();

            // Get the result
            String result = driver.findElement(By.id("answer")).getText();//String contener a koyacagiz gelen veriyi

            // Assert the result
            assertEquals("10", result);

            // Print the result
            System.out.println("result = "+ result);



        }
        @Test
        public void divisionTest(){
            // Navigate to  https://testpages.herokuapp.com/styled/index.html
            driver.get("https://testpages.herokuapp.com/styled/index.html");

            // Click on  Calculator under Micro Apps
            driver.findElement(By.id("calculatetest")).click();

            //Select divide  operation//****
            WebElement functionDropDown = driver.findElement(By.id("function"));
            new Select(functionDropDown).selectByVisibleText("divide");

            // Type any number in the first input
            driver.findElement(By.id("number1")).sendKeys("6");

            // Type any number in the second input
            driver.findElement(By.id("number2")).sendKeys("2");

            // Click on Calculate
            driver.findElement(By.id("calculate")).click();

            // Get the result
            String result = driver.findElement(By.id("answer")).getText();//String contener a koyacagiz gelen veriyi

            // Assert the result
            Assert.assertEquals("3", result);

            // Print the result
            System.out.println("result = "+ result);


        }

*/

}
