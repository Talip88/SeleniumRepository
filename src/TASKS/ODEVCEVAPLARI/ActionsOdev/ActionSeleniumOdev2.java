//ackage ActionsOdev;

//mport Utils.BaseStaticDriver;
//mport Utils.MyFunc;
//mport org.openqa.selenium.By;
//mport org.openqa.selenium.WebElement;
//mport org.openqa.selenium.interactions.Action;
//mport org.openqa.selenium.interactions.Actions;

//mport java.util.List;
///Ödev 2 : http://dhtmlgoodies.com/scripts/drag-drop-nodes/drag-drop-nodes.html
///         buradaki bütün öğrencileri bütün kutucukları doldurana kadar atınız.

//ublic class ActionSeleniumOdev2 extends BaseStaticDriver {
//   public static void main(String[] args) {
//       driver.get(" http://dhtmlgoodies.com/scripts/drag-drop-nodes/drag-drop-nodes.html");
//       Actions actions=new Actions(driver);

//       List<WebElement> students=driver.findElements(By.cssSelector("[id^='node']"));
//       List<WebElement> boxes=driver.findElements(By.cssSelector("[id^='box']"));

//       for (WebElement student:students){
//           for (WebElement box:boxes){

//               actions.clickAndHold(student).build().perform();
//               MyFunc.Bekle(1);
//               actions.moveToElement(box).release().build().perform();

//           }
//       }
//       driverBekleKapat();
//   }
//
