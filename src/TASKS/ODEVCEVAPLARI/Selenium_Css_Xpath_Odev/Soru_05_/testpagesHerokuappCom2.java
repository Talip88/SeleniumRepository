package Selenium_Css_Xpath_Odev.Soru_05_;

import Utils.BaseStaticDriver;
import Utils.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class testpagesHerokuappCom2 extends BaseStaticDriver {  /*    5-
    Bu websitesine gidiniz.  [https://testpages.herokuapp.com/styled/index.html]
    Fake Alerts' tıklayınız.
    Show Alert Box'a tıklayınız.
    Ok'a tıklayınız.
    Alert kapanmalıdır.*/
    public static void main(String[] args) {
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        //WebElement fakealerttest = driver.findElement(By.cssSelector("a#fakealerttest"));
        WebElement fakealerttest = driver.findElement(By.xpath("//a[text()='Fake Alerts']"));
        fakealerttest.click();
        MyFunc.Bekle(2);

        //WebElement fakealert = driver.findElement(By.cssSelector("input.styled-click-button[value='Show alert box']"));
        WebElement fakealert = driver.findElement(By.xpath("//input[@onclick='show_alert()']"));
        fakealert.click();
        MyFunc.Bekle(2);
       // WebElement dialogOk = driver.findElement(By.cssSelector("button#dialog-ok"));
        WebElement dialogOk = driver.findElement(By.xpath("//button[@class='dialog-button']"));
        dialogOk.click();

        driverBekleKapat();
    }
}
