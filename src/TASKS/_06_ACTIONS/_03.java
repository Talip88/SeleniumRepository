package TASKS._06_ACTIONS;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

//Ödev 3: http://dhtmlgoodies.com/scripts/drag-drop-nodes-quiz/drag-drop-nodes-quiz.html
//         buradaki bütün şehirleri bütün ülkere doğru şekilde topluca dağıtınız.
public class _03 extends BaseDriver {
    @Test

    public void Test1 () throws InterruptedException {

        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-nodes-quiz/drag-drop-nodes-quiz.html");

        Actions actions = new Actions(driver);

        List<WebElement> cities = driver.findElements(By.xpath("//ul[@id='allItems']//li"));

        List<WebElement> countries = driver.findElements(By.cssSelector("div[id='dhtmlgoodies_mainContainer']>div>ul"));

        for (WebElement cit:cities){
            for (WebElement cont:countries){
                actions.clickAndHold(cit).build().perform();

                Thread.sleep(150);

                try{
                    actions.moveToElement(cont).release().build().perform();
                    Thread.sleep(150);
                    driver.switchTo().alert().accept();
                }
                catch (Exception e){
                }
                actions.moveToElement(cont).release().build().perform();


                Thread.sleep(150);

                if (cit.getAttribute("class").equals("correctAnswer")){
                    Thread.sleep(150);

                    break;
                }
            }
        }
        driverBekleKapat();

    }
}

                    //2.YOL

    //              for (WebElement x:capitals){
    //              for(WebElement y: countries){
    //              WebElement cap=driver.findElement(By.id(x.getAttribute("id")));
    //              WebElement count=driver.findElement (By.id(y.getAttribute("id")));
    //              Action ıslem=actions.dragAndDrop(cap,count).buıld(); ıslem.perform();
    //              WebElement findColor=driver.findElement(By.id(x.getAttribute("id"));
    //              String searchcolor=findColorçgetCSSValue("background-color");

    //              if(searchColor.equalsIgnoreCase("rgba(0,250,0,1)"))
    //              {break;}
    //
    //                 }
    //                   }