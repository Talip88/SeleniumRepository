package TASKS._08_SCROLL;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _07_Senario extends BaseDriver {
    @Test
    public void Test(){
       //https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        //1) “Add Element” butona basin
        //2) “Delete” butonu gorunur oluncaya kadar bekleyin
        //3) “Delete” butonunun gorunur oldugunu test edin
        //4) Delete butonuna basarak butonu silin
        //5) Delete butonunun gorunmedigini test edin


        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        WebElement add=driver.findElement(By.xpath("//*[text()='Add Element']"));
        add.click();

        WebElement delete=driver.findElement(By.xpath("//*[text()='Delete']"));
        WebDriverWait bekle = new WebDriverWait(driver, Duration.ofSeconds(8));

        bekle.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Delete']")));

        WebElement element=driver.findElement(By.cssSelector("div[id='elements']"));

        Assert.assertTrue(element.getText().contains("Delete"));

        delete.click();

        Assert.assertNull(element.getText());

        driverBekleKapat();









    }
}
