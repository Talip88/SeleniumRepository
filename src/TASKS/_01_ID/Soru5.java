package TASKS._01_ID;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Soru5 {
    public static void main(String[] args) {
        //5-//Bu websitesine gidiniz.  [https://testpages.herokuapp.com/styled/index.html]
        //Fake Alerts' tıklayınız.
        //Show Alert Box'a tıklayınız.
        //Ok'a tıklayınız.
        //Alert kapanmalıdır.


        System.setProperty ("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get ("https://testpages.herokuapp.com/styled/index.html");

        MyFunc.Bekle(2);
        WebElement fakealerttest=driver.findElement(By.id("fakealerttest"));
        fakealerttest.click();
        MyFunc.Bekle(2);

        WebElement showAlert=driver.findElement(By.id("fakealert"));
        showAlert.click();
        MyFunc.Bekle(2);

        WebElement dialogBox=driver.findElement(By.id("dialog-ok"));
        dialogBox.click();
        MyFunc.Bekle(2);

        MyFunc.Bekle(8);
        driver.quit();





    }
}
