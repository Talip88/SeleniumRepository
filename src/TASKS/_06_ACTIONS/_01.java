package TASKS._06_ACTIONS;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

//Ödev 1 : http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html
//         buradaki ülke ve şehirleri findElements ile topluca bularak bir döngü ile bütün şehirleri doğru ülkere dağıtınız.
public class _01 extends BaseDriver {
        @Test

        public void Test1() throws InterruptedException {

        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html");
        Actions actions=new Actions(driver);

        List<WebElement> countries=driver.findElements(By.xpath("//*[@id='questionDiv']/div[@class='destinationBox']"));
        List<WebElement> capitals=driver.findElements(By.cssSelector("div[id=answerDiv]>div"));

        for (WebElement cap:capitals){
            for (WebElement c:countries){
                actions.clickAndHold(cap).build().perform();
                Thread.sleep(150);
                actions.moveToElement(c).release().build().perform(); Thread.sleep(150);
                Thread.sleep(150);
                if (cap.getCssValue("background-color").equals("rgba(0, 128, 0, 1)")){
                    countries.remove(c);
                    break;
                }
            }

        }

        driverBekleKapat();

    }
}
















     // driver.get("http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html");
     // Actions actions =new Actions(driver);
     // List<WebElement>countries=driver.findElements(By.xpath("//div[@class='dragDropSmallBox']"));

     // ArrayList<String> ulkeler=new ArrayList<>();
     // ArrayList<String>cities=new ArrayList<>();

     // for (WebElement e:countries) {

     //     if(e.getAttribute("id").contains("q")){
     //         ulkeler.add(e.getAttribute("id"));
     //     }else cities.add(e.getAttribute("id"));

     // }

     // for (int i = 0; i <ulkeler.size() ; i++) {
     //     for (int j = 0; j <cities.size() ; j++) {
     //         WebElement sehirler=driver.findElement(By.id(cities.get(i)));
     //         WebElement ulkelerr=driver.findElement(By.xpath("//div[@id='"+ulkeler.get(j)+"']//following-sibling::div"));

     //         Action aksiyon=actions.clickAndHold(sehirler).build();
     //         aksiyon.perform();
     //         Thread.sleep(150);

     //         aksiyon=actions.moveToElement(ulkelerr).release().build();
     //         aksiyon.perform();

     //         if(sehirler.getCssValue("background").contains("rgb(0, 128, 0)")){

     //             break;
     //         }

     //     }

     // }
