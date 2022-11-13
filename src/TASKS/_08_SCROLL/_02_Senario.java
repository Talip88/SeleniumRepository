package TASKS._08_SCROLL;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _02_Senario extends BaseDriver {
    @Test
    public void Test1(){

       //Senaryo
       // 1- https://www.youtube.com/ adresine gidiniz
       // 2- "Selenium" kelimesi ile video aratınız.
       // 3- Listelenen sonuçlarda 80 videoaya kadar lsiteyi uzatınız.
       // 4- Son videonun title ını yazdırınız.

        driver.get("https://www.youtube.com/");
        WebElement search=driver.findElement(By.cssSelector("input[id='search']"));
        search.sendKeys("Selenium");
        List<WebElement> videolar= driver.findElements(By.cssSelector("h3[class*='style-scope']>[id='video-title']"));
        System.out.println("videolar.size() = " + videolar.size());

        do {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0, 1000)");
            videolar = driver.findElements(By.cssSelector("h3[class*='style-scope']>[id='video-title']"));
        }while (videolar.size()<80);
        System.out.println(videolar.size());
        System.out.println(videolar.get(79).getText());
        driverBekleKapat();
        }
    }
