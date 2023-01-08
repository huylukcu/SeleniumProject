package practices.practice04;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

public class Q01 extends TestBase {
    /*
  Given
    Go to  https://www.saucedemo.com/
  When
    Enter the username  as "standard_user"
  And
    Enter the password as "secret_sauce"
  And
    Click on login button
  And
    Add all products to cart
  And
    Go to cart
  And
    Click on checkout
  And
    Fill your information
  And
    Click on continue
  Then
    Assert that total price is $140.34
  When
    Click on finish
  Then
    Assert that CHECKOUT: COMPLETE!
   */
     @Test
    public void test() {
         //Go to  https://www.saucedemo.com/
         driver.get("https://www.saucedemo.com/");
         //Enter the username  as "standard_user"
         driver.findElement(By.id("user-name")).sendKeys("standard_user");
         //Enter the password as "secret_sauce"
         driver.findElement(By.id("password")).sendKeys("secret_sauce");
         // Click on login button
         driver.findElement(By.id("login-button")).click();
         //Add all products to cart
         List<WebElement> addCart = driver.findElements(By.xpath("//button[.='Add to cart']"));
         for(WebElement w : addCart){
             w.click();
         }

}}
