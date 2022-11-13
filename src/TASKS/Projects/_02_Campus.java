package TASKS.Projects;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class _02_Campus extends BaseDriver {
    @Test
    public void Test1(){

//1---Verify the Syllabus button clickable****************************************************************************

        driver.get("https://campus.techno.study/");
        MyFunc.Bekle(1);
        WebElement cookies=driver.findElement(By.xpath("//*[text()='Accept all cookies']"));
        cookies.click();
        MyFunc.Bekle(1);
        WebElement fullName=driver.findElement(By.xpath("//*[@id='mat-input-0']"));
        MyFunc.Bekle(1);
        String name="talip_colak";
        MyFunc.Bekle(1);
        fullName.sendKeys(name);
        MyFunc.Bekle(1);
        WebElement password=driver.findElement(By.xpath("//*[@id='mat-input-1']"));
        MyFunc.Bekle(1);
        password.sendKeys("KiOGD5DU");
        MyFunc.Bekle(1);
        WebElement loginButton=driver.findElement(By.xpath("" +
                "//*[@class='mat-focus-indicator " +
                "submit-button mat-button " +
                "mat-flat-button mat-button-base mat-accent']"));
        MyFunc.Bekle(1);
        loginButton.click();
        MyFunc.Bekle(1);
        //WebElement syllabusButton=driver.findElement(B));
        MyFunc.Bekle(1);
       // syllabusButton.click();
        MyFunc.Bekle(1);
        WebElement close=driver.findElement(By.cssSelector("#mat-dialog-1 > syllabus-content-dialog > ms-dialog > ms-dialog-buttons > " +
                "mat-dialog-actions > ms-close-button > button > span.mat-button-wrapper > fa-icon > svg"));
        MyFunc.Bekle(1);
        close.click();
        MyFunc.Bekle(1);

//2---Verify the Details button clickable. All the information about the course should be visible.****************************************************************************

        WebElement details=driver.findElement(By.cssSelector("#container-3 > courses > ms-browse > div > " +
                "mat-grid-list > div > mat-grid-tile:nth-child(1) > " +
                "div > mat-card > mat-card-footer > div:nth-child(1) > button > span.mat-button-wrapper"));
        details.click();
        MyFunc.Bekle(1);
        WebElement Courses=driver.findElement(By.cssSelector("body > app > student-layout > div > student-toolbar-horizontal > " +
                "mat-toolbar > div > div:nth-child(1) > div > div:nth-child(3) > div > " +
                "button.mat-focus-indicator.mat-button.mat-button-base.mat-button-wrapper.mat-button-checked > " +
                "span.mat-button-wrapper > span"));
        MyFunc.Bekle(1);
        Courses.click();
        MyFunc.Bekle(1);

//3--- All the course assigned on the homepage should be displayed.****************************************************************************

        WebElement Assignments=driver.findElement(By.xpath("/html/body/app/student-layout/div/student-toolbar-" +
                "horizontal/mat-toolbar/div/div[1]/div/div[3]/div/button[4]/span[1]/span"));
        MyFunc.Bekle(1);
        Assignments.click();
        MyFunc.Bekle(1);
        WebElement assignmentDetail=driver.findElement(By.cssSelector("#container-3 > ms-assignment-panel-student > div > div > div > " +
                "div.ps > div:nth-child(1) > div > div:nth-child(3) > div > div > div:nth-child(2) > ms-icon-button:nth-child(1) > button"));
        MyFunc.Bekle(1);
        assignmentDetail.click();
        MyFunc.Bekle(1);
        WebElement Courses2=driver.findElement(By.cssSelector("body > app > student-layout > div > student-toolbar-horizontal > " +
                "mat-toolbar > div > div:nth-child(1) > div > div:nth-child(3) > div > " +
                "button.mat-focus-indicator.mat-button.mat-button-base.mat-button-wrapper.mat-button-checked > " +
                "span.mat-button-wrapper > span"));
        MyFunc.Bekle(1);
        Courses2.click();
        MyFunc.Bekle(1);

//4---  All students should be able to message the teacher****************************************************************************

        WebElement messages=driver.findElement(By.xpath("//*[@class='ng-fa-icon nav-link-icon']//*[@data-icon='message-lines']"));
        messages.click();
        MyFunc.Bekle(1);
        WebElement contacts=driver.findElement(By.xpath("//*[@class='ng-fa-icon ng-star-inserted']//*[@class='svg-inline--fa fa-users']"));
        contacts.click();
        MyFunc.Bekle(1);
        WebElement searchName=driver.findElement(By.xpath("//*[@id=ms-text-field-0]//input[@class]"));
        searchName.sendKeys(Keys.TAB);
        searchName.sendKeys(Keys.TAB);
        searchName.sendKeys(Keys.TAB);
        searchName.sendKeys("Talip");
        MyFunc.Bekle(1);
        WebElement clickOnName=driver.findElement(By.xpath("//*[text()='Talip ÇOLAK']"));
        clickOnName.click();
        MyFunc.Bekle(1);
        WebElement text=driver.findElement(By.id("mat-input-3"));
        text.sendKeys("Hi, this is an automated text!!");
        MyFunc.Bekle(1);
        WebElement submitText=driver.findElement(By.xpath("//*[@id=mat-dialog-1]/discussion-dialog/ms-dialog/ms-dialog-buttons/mat-dialog-actions/ams-comment-box/div/div/div/div[1]/div[3]/ms-icon-button"));
        submitText.click();
        MyFunc.Bekle(1);


//5-The Website must be able to be displayed in the selected language****************************************************

        WebElement account=driver.findElement(By.xpath("//span[@class='mat-button-wrapper']//*[@fxlayout='row']"));
        account.click();
        MyFunc.Bekle(1);
        WebElement language=driver.findElement(By.xpath("//*[text()='Language']"));
        language.click();
        MyFunc.Bekle(1);
        WebElement turkish=driver.findElement(By.xpath("//*[text()=' Türkçe ']"));
        turkish.click();
        MyFunc.Bekle(1);
        WebElement controlText=driver.findElement(By.xpath("//*[text()=' Merhaba, username ! ']"));
        Assert.assertTrue("Language not changed to Turkish ",controlText.getText().contains("Merhaba, username !"));
        MyFunc.Bekle(1);

// 6-The student should be able to change and save the password .**************************************************

         WebElement submit = driver.findElement(By.xpath("//*[@id='login-form']/div[2]/form/button"));
         submit.click();
        MyFunc.Bekle(1);
         WebElement accountt = driver.findElement(By.xpath("//span[@class='mat-button-wrapper']//*[@fxlayout='row']"));
         accountt.click();
        MyFunc.Bekle(1);
         WebElement changePassword=driver.findElement(By.xpath("//*[text()='Change Password']"));
         changePassword.click();
        MyFunc.Bekle(1);
         WebElement current=driver.findElement(By.xpath("//input[@type='password' and @placeholder='Current Password']"));
         current.sendKeys("password");
        MyFunc.Bekle(1);
         WebElement newPassword=driver.findElement(By.xpath("//input[@type='password' and @placeholder='New Password']"));
         newPassword.sendKeys("newPassword");
        MyFunc.Bekle(1);
         WebElement newPasswordRetry=driver.findElement(By.xpath("//input[@type='password' and @placeholder='New Password (Retry)']"));
         newPasswordRetry.sendKeys("newPassword");
        MyFunc.Bekle(1);
         WebElement change=driver.findElement(By.xpath("//*[text()=' Change Password ']"));
         change.click();
         WebElement userName2 = driver.findElement(By.id("mat-input-0"));
         userName2.sendKeys("username");
        MyFunc.Bekle(1);
         WebElement newPasswordcheck = driver.findElement(By.id("mat-input-1"));
         newPasswordcheck.sendKeys("newPassword");
        MyFunc.Bekle(1);
         WebElement rememberMe=driver.findElement(By.xpath("//*[text()=' Remember Me ']"));
         rememberMe.click();
         rememberMe.click();
        MyFunc.Bekle(1);
         WebElement submitAgain = driver.findElement(By.xpath("//*[@id='login-form']/div[2]/form/button"));
         submitAgain.click();
        MyFunc.Bekle(1);

//7-LOGOUT*************************************************************************************************************

         WebElement userPage = driver.findElement(By.cssSelector(" div > div:nth-child(2) > button"));
         userPage.click();

        MyFunc.Bekle(1);

         WebElement logOut = driver.findElement(By.cssSelector("#mat-menu-panel-0 > div > button:nth-child(7) > span"));
         logOut.click();



        //PASSWORD CHANGE************************************************************


         // WebElement passwordLogin=driver.findElement(By.xpath("//*[@id='mat-input-1']"));
        //passwordLogin.sendKeys(password);

        //MyFunction.Bekle(1);


      //WebElement login=driver.findElement(By.cssSelector("form > button > span.mat-button-wrapper"));
      //login.click();

      ////MyFunction.Bekle(1);

      //WebElement userPage=driver.findElement(By.cssSelector(" div > div:nth-child(2) > button"));
      //userPage.click();

      ////MyFunction.Bekle(1);

      //WebElement changePassword=driver.findElement(By.cssSelector("#mat-menu-panel-0 > div > button:nth-child(5)"));
      //changePassword.click();

      ////MyFunction.Bekle(1);

      //WebElement currentpassword=driver.findElement(By.cssSelector("#mat-input-2"));
      //currentpassword.sendKeys(password);

      ////MyFunction.Bekle(1);

      //WebElement newPassword=driver.findElement(By.cssSelector("#mat-input-3"));
      //newPassword.sendKeys(password2);

      ////MyFunction.Bekle(1);
      //WebElement newPasswordAgain=driver.findElement(By.cssSelector("#mat-input-4"));
      //newPasswordAgain.sendKeys(password2);

      ////MyFunction.Bekle(1);

      //WebElement changePasswordButton=driver.findElement(By.cssSelector("#mat-dialog-1 > password-dialog > div > mat-dialog-actions > button"));
      //changePasswordButton.click();
    }
}
