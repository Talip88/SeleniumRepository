package TASKS._04_XPATH;

import Utility.BaseDriver;
import Utility.MyFunc;
import javafx.scene.web.WebEngine;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverListener;

// 1) Bu siteye gidin. ->  http://demoqa.com/text-box
//
//    2) Full Name kısmına "Automation" girin.
//
//    3) Email kısmına "Testing@gmail.com" girin.
//
//    4) Current Address kısmına "Testing Current Address" girin.
//
//    5) Permanent Address kısmına "Testing Permanent Address" girin.
//
//    6) Submit butonuna tıklayınız.
//
//    7) Full Name'in, "Automation"ı içinde bulundurduğunu doğrulayın.
//
//    8) Email'in, "Testing"ı içinde bulundurduğunu doğrulayın.
public class _01 extends BaseDriver {
    @Test
    public void Test1(){

        driver.get("http://demoqa.com/text-box");
        WebElement fullName=driver.findElement(By.xpath("//input[@id='userName']"));
        fullName.sendKeys("Automation");

        WebElement email=driver.findElement(By.xpath("//*[@id='userEmail']"));
        email.sendKeys("Testing@gmail.com");
        MyFunc.Bekle(1);

        WebElement currentAddress=driver.findElement(By.xpath("//*[@id='currentAddress']"));
        currentAddress.sendKeys("Testing Current Address");
        MyFunc.Bekle(1);

        WebElement permanentAddress=driver.findElement(By.xpath("//*[@id='permanentAddress']"));
        permanentAddress.sendKeys("Testing Permanent Address");
        MyFunc.Bekle(1);


        JavascriptExecutor js=(JavascriptExecutor)driver;

        js.executeScript("window.scrollBy(0,250)", "");

        WebElement submitButton=driver.findElement(By.xpath("//*[@class='btn btn-primary']"));
        submitButton.click();
        MyFunc.Bekle(1);

        Assert.assertTrue(fullName.getText().contains("Automation"));
        Assert.assertTrue(email.getText().contains("Testing@gmail.com"));
        driverBekleKapat();





    }
}
