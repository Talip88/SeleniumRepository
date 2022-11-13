package TASKS._08_SCROLL;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _04_Senario extends BaseDriver {
// Senaryo
//1) https://demoqa.com/browser-windows adresine gidin
//2) Alerts’e tiklayin
//3) On button click, alert will appear after 5 seconds karsisindaki click me butonuna basin
//4) Allert’in gorunur olmasini bekleyin
//5) Allert uzerindeki yazinin “This alert appeared after 5 seconds” oldugunu test edin
//6) Ok diyerek alerti kapatin
    @Test
    public void Test(){

        driver.get("https://demoqa.com/browser-windows");
        WebElement alerts=driver.findElement(By.xpath("//span[text()='Alerts']"));
        alerts.click();
        MyFunc.Bekle(2);
        WebElement onButtonClick=driver.findElement(By.id("timerAlertButton"));
        onButtonClick.click();
        WebDriverWait alertWait = new WebDriverWait(driver,Duration.ofSeconds(5));
        alertWait.until(ExpectedConditions.alertIsPresent());
        MyFunc.Bekle(2);
        driver.switchTo().alert().accept();

    }
}
