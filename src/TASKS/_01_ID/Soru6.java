package TASKS._01_ID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Soru6 {
    public static void main(String[] args) {
        //6-Bu siteye gidiniz.  https://testpages.herokuapp.com/styled/index.html
        //Fake Alerts'e tıklayınız.
        //Show modal dialog buttonuna tıklayınız.
        //Ok'a tıklayınız.
        //Alert kapanmalıdır.

        System.setProperty ("webdriver.chrome.direver", "drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://testpages.herokuapp.com/styled/index.html");

        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            throw new RuntimeException (e);
        }

        WebElement fakeAlert=driver.findElement(By.id("fakealerttest"));
        fakeAlert.click();

        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }

        WebElement showModalDialog =driver.findElement(By.id("modaldialog"));
        showModalDialog.click();
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }

        WebElement ok=driver.findElement(By.id("dialog-ok"));
        ok.click();

        try{
            Thread.sleep(8000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }


        driver.quit();



    }
}
