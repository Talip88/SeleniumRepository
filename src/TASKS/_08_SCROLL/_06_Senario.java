package TASKS._08_SCROLL;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _06_Senario extends BaseDriver {
    @Test
    public void Test(){

        //https://demoqa.com/dynamic-properties adresine gidin
        //1) “Visible After 5 seconds” butonunun gorunur olmasini bekleyin
        //2) “Visible After 5 seconds” butonunun gorunur oldugunu test edin

        driver.get("https://demoqa.com/dynamic-properties");

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(11));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[id='visibleAfter']")));
        WebElement visible=driver.findElement(By.cssSelector("[id='visibleAfter']"));
        Assert.assertTrue("Görünür mü?=", visible.getText().contains("Visible"));


    }
}
