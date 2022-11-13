package TASKS.Projects;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CampusLoginTest extends BaseDriver {

    @Test

    public void Test1(){

        driver.get("https://campus.techno.study/");

        MyFunc.Bekle(1);

        WebElement cookies=driver.findElement(By.xpath("//*[text()='Accept all cookies']"));
        cookies.click();

        WebElement fullName=driver.findElement(By.xpath("//*[@id='mat-input-0']"));

        String name="talip_colak";

        fullName.sendKeys(name);

        WebElement password=driver.findElement(By.xpath("//*[@id='mat-input-1']"));

        password.sendKeys("KiOGD5DU");

        WebElement loginButton=driver.findElement(By.xpath("//span[text()='LOGIN']"));
        loginButton.click();

        WebElement control=driver.findElement(By.xpath("//span[text()='Welcome, Talip Çolak !]"));
        Assert.assertTrue(control.getText().contains("Talip"));

        WebElement wait=driver.findElement(By.xpath("//span[text()='SoftSkills Temmuz Batch']"));

        WebDriverWait waitElement = new WebDriverWait(driver,Duration.ofSeconds(13));

        waitElement.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='SoftSkills Temmuz Batch']")));







    }
}
