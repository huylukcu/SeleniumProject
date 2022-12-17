package selenium_review;

public class MyXpathNote {
    /*
   CONTAINS:
   <input id = "u_0_c">
   anyinput elements whose id contains "u_0_"

        xpath =====>//input[contains(@id, 'u_0_')
        css   =====> input[id*='u_0_']

       Question: how to locate the elements?
       -inspect the element on the page and analyze the html
       -analyze the html and see if it has the attributes used by selenium
         ID:    driver.findElement(By.id (" "));      //*[@id="u_0_c"]
         NAME:  driver.findElement(By.Name(" "))
         CLASS:
         LINKTEXT: driver.findElement(By.linkText("Support")

       Question:
        **if the element is link, before we look for id,name,class we have to try with LINKTEXT or PARTIALLINKTEXT


     */


     *

     /
     */



       -





     */


}
