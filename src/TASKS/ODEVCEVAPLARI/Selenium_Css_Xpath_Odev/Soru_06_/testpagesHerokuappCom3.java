package Selenium_Css_Xpath_Odev.Soru_06_;

import Utils.BaseStaticDriver;
import Utils.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class testpagesHerokuappCom3 extends BaseStaticDriver { /*6-
    Bu siteye gidiniz.  https://testpages.herokuapp.com/styled/index.html
    Fake Alerts'e tıklayınız.
    Show modal dialog buttonuna tıklayınız.
    Ok'a tıklayınız.
    Alert kapanmalıdır.*/
    public static void main(String[] args) {

        driver.get("https://testpages.herokuapp.com/styled/index.html");
       // WebElement fakealerttest = driver.findElement(By.cssSelector("a#fakealerttest"));
        WebElement fakealerttest = driver.findElement(By.xpath("//a[text()='Fake Alerts']"));
        fakealerttest.click();
        MyFunc.Bekle(2);

       // WebElement modaldialog = driver.findElement(By.cssSelector("input.styled-click-button#modaldialog"));
        WebElement modaldialog = driver.findElement(By.xpath("//input[@id='modaldialog']"));
        modaldialog.click();
        MyFunc.Bekle(2);

        //WebElement dialogOk = driver.findElement(By.cssSelector("button#dialog-ok"));
        WebElement dialogOk = driver.findElement(By.xpath("//*[@class='dialog-button']"));
        dialogOk.click();

        driverBekleKapat();
    }}
