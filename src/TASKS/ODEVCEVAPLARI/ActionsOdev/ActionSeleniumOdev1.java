//package ActionsOdev;
//
//import Utils.BaseStaticDriver;
//import Utils.MyFunc;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Action;
//import org.openqa.selenium.interactions.Actions;
//
//import java.util.List;
//// Ödev : 1  http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html
//// buradaki ülke ve şehirleri findElements ile topluca bularak bir döngü ile bütün şehirleri doğru ülkere dağıtınız.
//
//
//
//public class ActionSeleniumOdev1 extends BaseStaticDriver {
//    public static void main(String[] args) {
//        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html");
//        Actions actions=new Actions(driver);
//
//        List<WebElement> cities=driver.findElements(By.cssSelector("div[id='answerDiv']>div"));
//        List<WebElement> destBoxes=driver.findElements(By.cssSelector("div[class='destinationBox']"));
//
//        for (WebElement citie : cities) {
//            for (WebElement destBox : destBoxes) {
//                actions.clickAndHold(citie).perform();
//                MyFunc.Bekle(1);
//                actions.moveToElement(destBox) .release().perform();
//
//                if (citie.getAttribute("class").equals("correctAnswer"))
//                    break;
//            }
//
//        }
//
//
//        driverBekleKapat();
//
//

