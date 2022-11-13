package Selenium_Css_Xpath_Odev.Soru_02_;

import Utils.BaseStaticDriver;
import Utils.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.junit.Assert;

public class demoApplitoolsCom extends BaseStaticDriver {
    /*2-
     1) Bu siteye gidin. -> https://demo.applitools.com/
     2) Username kısmına "ttechno@gmail.com" girin.
     3) Password kısmına "techno123." girin.
     4) "Sign in" buttonunan tıklayınız.
     5) "Your nearest branch closes in: 30m 5s" yazısının göründüğünü doğrulayınız.*/
    public static void main(String[] args) {
        driver.get("https://demo.applitools.com/");
        //WebElement username = driver.findElement(By.cssSelector("input#username"));
        WebElement username = driver.findElement(By.xpath("//input[@class='form-control' and @id='username']"));
        username.sendKeys("ttechno@gmail.com");
        MyFunc.Bekle(2);

        //WebElement password = driver.findElement(By.cssSelector("input.form-control#password"));
        WebElement password = driver.findElement(By.xpath("//input[@class='form-control' and @id='password']"));
        password.sendKeys("techno123.");
        MyFunc.Bekle(2);

        //WebElement logIn = driver.findElement(By.cssSelector("a.btn.btn-primary"));
        WebElement logIn = driver.findElement(By.xpath("//a[text()='Sign in']"));
        logIn.click();
        MyFunc.Bekle(2);
       // WebElement time = driver.findElement(By.cssSelector("h6#time"));
        WebElement time = driver.findElement(By.xpath("//*[@id='time']"));

        Assert.assertTrue(time.getText().contains("Your nearest branch closes in: 30m 5s"));


        driverBekleKapat();
    }
    }

