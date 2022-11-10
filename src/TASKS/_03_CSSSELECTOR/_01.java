package TASKS._03_CSSSELECTOR;

import Utility.BaseDriver;

import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01 extends BaseDriver {
    //1-1) Bu siteye gidin. ->  http://demoqa.com/text-box
    //    2) Full Name kısmına "Automation" girin.
    //    3) Email kısmına "Testing@gmail.com" girin.
    //    4) Current Address kısmına "Testing Current Address" girin.
    //    5) Permanent Address kısmına "Testing Permanent Address" girin.
    //    6) Submit butonuna tıklayınız.
    //    7) Full Name'in, "Automation"ı içinde bulundurduğunu doğrulayın.
    //    8) Email'in, "Testing"ı içinde bulundurduğunu doğrulayın.
    // */
    @Test
    public void Test1()
    {
        driver.get("http://demoqa.com/text-box");
        WebElement fullName=driver.findElement(By.cssSelector("#userName"));
        fullName.sendKeys("Automation");
        MyFunc.Bekle(1);
        WebElement email=driver.findElement(By.cssSelector("input[class*='mr-sm-2 form-control'][type='email']"));
        MyFunc.Bekle(1);
        email.sendKeys("Testing@gmail.com");
        MyFunc.Bekle(1);

        WebElement currentAdress=driver.findElement(By.cssSelector("[id*='currentAddress'][class='form-control']"));
        currentAdress.sendKeys("Testing Current Address");
        MyFunc.Bekle(1);
        WebElement PermanentAddress=driver.findElement(By.cssSelector("[id*='permanentAddress'][class='form-control']"));
        PermanentAddress.sendKeys("Testing Permanent Address");
        MyFunc.Bekle(1);

        WebElement submit=driver.findElement(By.cssSelector("[id*='submit'][class='btn btn-primary']"));
        submit.click();
        MyFunc.Bekle(1);

        Assert.assertTrue(fullName.getText().contains("Automation"));
        Assert.assertTrue(email.getText().contains("Testing@gmail.com"));
        driverBekleKapat();
    }
}
