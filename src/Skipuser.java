import java.net.MalformedURLException;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

 

public class Skipuser extends Base{

public static void main(String[] args)throws MalformedURLException, InterruptedException {

                                // TODO Auto-generated method stub

                               

  AndroidDriver<AndroidElement> driver=capabilities();

  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  
  driver.findElementByXPath("//android.widget.Button[@text='Skip registration']").click();
  driver.findElementByXPath("//android.widget.EditText[@text='Name']").sendKeys("Mario");
  driver.findElementByXPath("//android.widget.LinearLayout[@index='3']").click();
  driver.findElementByXPath("//android.widget.EditText[@text='Date of birth']").click();
//  UiSelector().scrollable(true).instance(0)).scrollIntoView
//  (new UiSelector().textMatches(\"" + containedText + "\").instance(0))"));     
  driver.findElementByXPath("//android.widget.Button[@text='Continue']").click();
 // driver.findElementById("3").click();
  driver.findElement(By.className("android.widget.CheckBox")).click();
  driver.findElementByXPath("//android.widget.Button[@text='Continue']").click();
  driver.findElementByXPath("//android.widget.Button[@text='ALLOW']").click();
  driver.findElementByXPath("//android.support.v7.widget.RecyclerView[@index='0']").click();

}
}
