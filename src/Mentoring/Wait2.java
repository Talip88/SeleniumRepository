package Mentoring;

import Utility.BaseDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Wait2 extends BaseDriver {

    public static void main(String[] args) {

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://demoqa.com/dynamic-properties");

        //Bazı elemanlar DOM'da olmasına rağmen ENABLE değildir.

        WebElement element=driver.findElement(By.cssSelector("#enableAfter"));
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();

        //Bazı elementler belirli koşullar oluşana kadar DOM'da bulunmazlar

        WebElement element1=driver.findElement(By.cssSelector("#visibleAfter"));
        wait.until(ExpectedConditions.visibilityOf(element1)).click();

        driver.navigate().to("https://demoqa.com/alerts");

        //Alert varsa ona geçiş yapmadan önce bekleyebiliriz
        driver.findElement(By.id("timeAlertButton")).click();
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();

        driver.navigate().to("https://demoqa.com/frames");

        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("frame1")));
        Assert.assertEquals(driver.findElement(By.id("sampleHeading")).getText(),"This is a sample page");

        driver.switchTo().defaultContent();
        driver.navigate().to("https://demoqa.com/checkbox");

        driver.findElement(By.xpath("//button[@aria-label='Toggle']")).click();
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@type='checkbox']")));

        List<WebElement> checkboxes=driver.findElements(By.xpath("//*[@class='rct-title']"));
        for (WebElement e:checkboxes)
            System.out.println(e.getText());
        
    }

}
