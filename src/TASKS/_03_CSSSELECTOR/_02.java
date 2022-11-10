package TASKS._03_CSSSELECTOR;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//2-
//1) Bu siteye gidin. -> https://demo.applitools.com/

//2) Username kısmına "ttechno@gmail.com" girin.

//3) Password kısmına "techno123." girin.

//4) "Sign in" buttonunan tıklayınız.

//5) "Your nearest branch closes in: 30m 5s" yazısının göründüğünü doğrulayınız.

public class _02 extends BaseDriver {
    @Test
    public void Test2(){
        driver.get("https://demo.applitools.com/");
        MyFunc.Bekle(1);
        WebElement userName1=driver.findElement(By.cssSelector("input[id*='username']"));
        userName1.sendKeys("ttechno@gmail.com");
        MyFunc.Bekle(1);
        WebElement password=driver.findElement(By.cssSelector("[id*='password']"));
        MyFunc.Bekle(1);
        password.sendKeys("techno123.");
        WebElement Sign=driver.findElement(By.cssSelector("a[id*='log-in']"));
        Sign.click();

        WebElement s=driver.findElement(By.cssSelector("[id*='time']"));
        Assert.assertTrue(s.getText().contains("Your nearest branch closes in: 30m 5s"));

        driverBekleKapat();



    }
}
