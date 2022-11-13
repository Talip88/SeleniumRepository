package TASKS._08_SCROLL;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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


    }
}
