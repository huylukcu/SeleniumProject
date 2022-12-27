package selenium_review;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

import java.util.List;


public class Q02 extends TestBase {
   /*  1. Amazon.com
       2. DropDown select books.(All yazan yerde)
         kategorilerin hepsini konsola yazdiralim
       3. Arama kutusuna Harry potter yazalım ve arama yapalim.
       4. Sonuc sayisini ekrana yazdiralim.
       5. Sonucların Les Miserables i icerdigini assert edelim
    */
   @Test
    public void amazonDropdown(){

        driver.get("https://www.amazon.com/");

        WebElement dropdown=driver.findElement(By.id("searchDropdownBox"));
        Select select=new Select(dropdown);

        // Kategorilerin hepsini konsola yazdiralim..
        List<WebElement> dropdownAll=select.getOptions();
        int item=1;

        for (WebElement e:dropdownAll
        ) {
            System.out.println( item + ". dropdown: " + e.getText() + " ");
            item++;

        // Arama kutusuna Les Miserables yazalım ve arama yapalim.
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Harry Potter" + Keys.ENTER);

        // Sonuc sayisini ekrana yazdiralim.
        // Sonucların Harry Potter i icerdigini assert edelim.

        WebElement resultText=driver.findElement(By.xpath("//span[.='1-16 of over 60,000 results for']"));
        String result=resultText.getText();
        String resultArr[]=result.split(" ");
        String textResult=resultArr[3];
        System.out.println( "Bulunan sonuç sayısı: " + textResult );

        String actualContain=driver.getTitle();
        String expectedContain="Harry Potter";
        Assert.assertTrue("Actual Page doesnt content 'Harry Potter'",actualContain.contains(expectedContain));
    }
}}


