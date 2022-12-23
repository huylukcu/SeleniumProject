package selenium_review;

import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class AmazonCard extends TestBase {
    @Test
    public void test() throws InterruptedException {
        //2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");
        //3. Click on 'Products' button
        driver.findElement(By.xpath("//a[@href='/products']")).click();
        Thread.sleep(2000);
        //4. Verify user is navigated to ALL PRODUCTS page successfully
        //5. Enter product name in search input and click search button
        //6. Verify 'SEARCHED PRODUCTS' is visible
        //7. Verify all the products related to search are visible
        //8. Add those products to cart
        //9. Click 'Cart' button and verify that products are visible in cart
        //10. Click 'Signup / Login' button and submit login details
        //11. Again, go to Cart page
        // 12. Verify that those products are visible in cart after login as well
    }
}