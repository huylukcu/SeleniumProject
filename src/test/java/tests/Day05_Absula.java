package tests;

public class Day05_Absula {
    /*
     1)How many locators are there?
            * ---8 locator.
     2)What are they?
            * ---id, name, className, linkText, tagName, partialLinkText, xpath, css
     3)Which one do you prefer? Why?
            ---My answer :
           -First If there is an ID I use id, cause id is unique and faster
           -If there is no id then I use name if there is a unique name
           -I also sometime create dynamic xpath. Because some elements do not have stable attributes like id and name. And I can write xpath for any element.
           -I sometimes even use css selector instead of xpath. But i personally use xpath more than css.
      4)What is difference between absolute xpath and relative xpath?
           -Absolute xpath we start from the parent and go child elements one by one
           -Absolute xpath use /
            * -Absolute xpath may easily be broken when a new element is added on the page
        * -For this reason we should never use absolute xpath. In fact, my team don't let QA's use absolute xpath.
            * --Relative xpath we don't start from parent and go child one by one. We go straight to the element
            * --Relative xpath use //
            * --Relative xpath is very reliable It doesn't easy brake, because absolute xpath doesn't dependent on other element
            * --I use absolute xpath in my framework when to locate the elements
     5)What is the difference between xpath and css selector?
            * -First xpath and css are similar. Both are helpful and there are different ways to create xpath or css
            -Syntax is a little different.
            -in xpath we use // and @, but in css we don't
            -css is a little faster than xpath(way less than 1 second). xpath does navigation in the html that takes a little bit time
           --there are more ways to write xpath. For example, dynamic xpath has contains, starts-with, ends-with functions
    */

}
