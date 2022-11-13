package TASKS._08_SCROLL;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

//Senaryo
//1) https://demoqa.com/dynamic-properties adresine gidin
//2) “Will enable 5 seconds” butonunun enable olmasini bekleyin
//3) “Will enable 5 seconds” butonunun enable oldugunu test edin
public class _05_Senario extends BaseDriver {
    @Test
    public void Test(){

        driver.get("https://demoqa.com/dynamic-properties");

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("visibleAfter")));

        driverBekleKapat();

    }
}
