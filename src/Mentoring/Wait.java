package Mentoring;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Wait extends BaseDriver {

    @Test
    public void Test1(){

        driver.get("https://demos.telerik.com/aspnet-ajax/ajaxloadingpanel/functionality/explicit-show-hide/defaultcs.aspx");

        //Declare a WebDriver wait

        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));

        //Get the selected date text before AJAX call

        String selectedDate=driver.findElement(By.cssSelector("[id=ctl00_ContentPlaceholder1_Label1]")).getText().trim();

        //Print selectedDateTextBeforeAjaxCall to the console

        System.out.println("selectedDateBeforeAjaxCall="+selectedDate);

        //Find 3.rd Day on the Calendar

        WebElement thirddayOfMonth=driver.findElement(By.xpath("//a[text()='3']"));

        thirddayOfMonth.click();

        //Wait Until invisibility of Loader

        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".raDiv")));

        //Wait until visibility of selected date

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[id=ctl00_ContentPlaceholder1_Label1]")));

        //Get the selected date text after AJAX call

        String selectedDateTextAfterAjaxCall=driver.findElement((By.cssSelector("[id=ctl00_ContentPlaceholder1_Label1]"))).getText().trim();

        //Print selectedDateTextAfterAjaxCall to the  console

        System.out.println("selectedDateTextAfterAjaxCall="+selectedDateTextAfterAjaxCall);

        //Check the actual and expected result

        Assert.assertEquals("Wednesday,August 3,2022", selectedDateTextAfterAjaxCall);





    }
}
