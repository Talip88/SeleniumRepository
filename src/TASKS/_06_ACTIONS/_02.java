package TASKS._06_ACTIONS;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

//Ödev 2 : http://dhtmlgoodies.com/scripts/drag-drop-nodes/drag-drop-nodes.html
//buradaki bütün öğrencileri bütün kutucukları doldurana kadar atınız.
public class _02 extends BaseDriver {
    public static void main(String[] args) throws InterruptedException {

        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-nodes/drag-drop-nodes.html");

        Actions actions = new Actions(driver);

        List<WebElement> students = driver.findElements(By.xpath("//ul[@id='allItems']//li"));

        List<WebElement> teams = driver.findElements(By.cssSelector("div[id='dhtmlgoodies_mainContainer']>div>ul"));


        for (WebElement st:students){
            for (WebElement te: teams){
                actions.clickAndHold(st).build().perform();
                Thread.sleep(150);
                actions.moveToElement(te).release().build().perform();
                Thread.sleep(150);
                if (te.getText().contains(st.getText())){

                    break;
                }

            }
        }
       driverBekleKapat();


    }
}
