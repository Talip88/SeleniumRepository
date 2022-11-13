package Mentoring;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CSSSelector extends BaseDriver {
    @Test

    public void Test1 (){

        driver.get("https://accounts.lambdatest.com/register");

        //CSS=(HTML tag (#) (Value of the ID attribute)
        WebElement passwordInput=driver.findElement(By.cssSelector("input#userpassword"));
        passwordInput.sendKeys("Hello");

        //CSS=(HTML tag) (.) (Value of Class Attribute)
        WebElement submitButton= driver.findElement(By.cssSelector("button.submit-btn"));

        //css=(HTML Page) [Attribute='Value']
        WebElement phoneInput=driver.findElement(By.cssSelector("input[name='phone']"));

        //css=(HTML tag>)(.) (Class attribute value) ([attribute=Value of Attribute])
        WebElement submitButtonRegister=driver.findElement(By.cssSelector("button.submit-btn[data-callback='onSubmit']"));

        //CSS=(HTML tag)([attribute^=start of the string])
        WebElement emailInput=driver.findElement(By.cssSelector("input[name^='em']"));

        //CSS=(HTML tag)([attribute$=end of the string])
        WebElement emailInput2=driver.findElement(By.cssSelector("input[name$='ail']"));

        //CSS=(HTML tag)([attribute*=partial string])
        WebElement emailInput3=driver.findElement(By.cssSelector("input[class*='control']"));

        //--------------------------------Child-Sibling---------------------------------------------------------------

        WebElement fullNameInput=driver.findElement(By.cssSelector((".for>div input")));
        fullNameInput.sendKeys("Merhaba");
        driverBekleKapat();


        //---> .form div input     ---> Xpath:  //form//div/input  //CSS de
        //---> .form > div > input ---> Xpath:  //form//div/input
        //---> .form + div         ---> Xpath:  //form//following-sibling::div
    }
}
