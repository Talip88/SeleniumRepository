package TASKS._04_XPATH;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02 extends BaseDriver {
    //1) Bu siteye gidin. -> https://demo.applitools.com/
    //2) Username kısmına "ttechno@gmail.com" girin.
    //3) Password kısmına "techno123." girin.
    //4) "Sign in" buttonunan tıklayınız.
    //5) "Your nearest branch closes in: 30m 5s" yazısının göründüğünü doğrulayınız.
    @Test
    public void Test2(){

        driver.get("https://demo.applitools.com/");
        WebElement userName=driver.findElement(By.xpath("//*[@id='username']"));
        userName.sendKeys("ttechno@gmail.com");
        MyFunc.Bekle(1);

        WebElement password=driver.findElement(By.xpath("//*[@placeholder='Enter your password']"));
        password.sendKeys("techno123.");
        MyFunc.Bekle(1);


        WebElement sign=driver.findElement(By.xpath("//*[@id='log-in']"));
        sign.click();

        WebElement control=driver.findElement(By.xpath("//*[@id='time']"));
        Assert.assertTrue(control.getText().contains("Your nearest branch closes in: 30m 5s"));

        driverBekleKapat();

    }
}
