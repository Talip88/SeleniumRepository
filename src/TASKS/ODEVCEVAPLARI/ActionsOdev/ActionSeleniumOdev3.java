//package ActionsOdev;
//
//import Utils.BaseStaticDriver;
//import Utils.MyFunc;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Action;
//import org.openqa.selenium.interactions.Actions;
//
//import java.util.ArrayList;
//import java.util.List;
//
////Ödev 3 : http://dhtmlgoodies.com/scripts/drag-drop-nodes-quiz/drag-drop-nodes-quiz.html
////         buradaki bütün şehirleri bütün ülkere doğru şekilde topluca dağıtınız.
//
//
//public class ActionSeleniumOdev3 extends BaseStaticDriver {
//    public static void main(String[] args) {
//        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-nodes-quiz/drag-drop-nodes-quiz.html");
//        List <WebElement> cities = driver.findElements(By.cssSelector("[id^='node']"));
//        List <WebElement> countries = driver.findElements(By.cssSelector("[id^='box']"));
//
//        Actions actions = new Actions(driver);
//
//        for (WebElement s : cities) {
//            String allCountries = s.getAttribute("groupid");
//            switch (allCountries) {
//                case "box1" : actions.clickAndHold(s).perform();
//                    MyFunc.Bekle(1);
//                    actions.moveToElement(countries.get(0)).release().perform();
//                    break;
//                case "box2" : actions.clickAndHold(s).perform();
//                    MyFunc.Bekle(1);
//                    actions.moveToElement(countries.get(1)).release().perform();
//                    break;
//                case "box3" : actions.clickAndHold(s).perform();
//                    MyFunc.Bekle(1);
//                    actions.moveToElement(countries.get(2)).release().perform();
//                    break;
//                case "box4" : actions.clickAndHold(s).perform();
//                    MyFunc.Bekle(1);
//                    actions.moveToElement(countries.get(3)).release().perform();
//                    break;
//                case "box5" : actions.clickAndHold(s).perform();
//                    MyFunc.Bekle(1);
//                    actions.moveToElement(countries.get(4)).release().perform();
//                    break;
//                case "box6" : actions.clickAndHold(s).perform();
//                    MyFunc.Bekle(1);
//                    actions.moveToElement(countries.get(5)).release().perform();
//                    break;
//                case "box7" : actions.clickAndHold(s).perform();
//                    MyFunc.Bekle(1);
//                    actions.moveToElement(countries.get(6)).release().perform();
//                    break;
//            }
//        }
//        MyFunc.Bekle(1);
//        driver.switchTo().alert().accept();
//        driverBekleKapat();
//    }
//}
//