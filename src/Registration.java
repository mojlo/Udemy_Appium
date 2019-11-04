import java.net.MalformedURLException;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

 

public class Registration extends Base{

public static void main(String[] args)throws MalformedURLException, InterruptedException {

                                // TODO Auto-generated method stub

                               

  AndroidDriver<AndroidElement> driver=capabilities();

  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  
  
  driver.findElementById("de.soehnle.connect:id/registrationButton").click();

  driver.findElementById( "de.soehnle.connect:id/nameEditText").sendKeys("Neeraj");

  driver.findElementById( "de.soehnle.connect:id/maleGender").click();
 
//    driver.findElementByXPath("//android.widget.EditText[@index='1']").click();
  driver.findElementByXPath("//android.widget.EditText[@text='Date of birth']").click();
//  driver.findElementByXPath("//android.widget.Button[@text='Continue']").click();
  driver.findElementByXPath("//android.widget.Button[@index='1']").click();
//   driver.findElementById( "de.soehnle.connect:id/birthEditText").click();

  driver.findElementById("de.soehnle.connect:id/edittext_mail").sendKeys("Neerajsingh151+11@gmail.com");

  driver.findElementById("de.soehnle.connect:id/edittext_password").sendKeys("Neeraj12345");

  driver.findElementById("de.soehnle.connect:id/edittext_repeat_password").sendKeys("Neeraj12345");
  driver.findElement(By.className("android.widget.CheckBox")).click();
  driver.findElementById("de.soehnle.connect:id/login_button").click();



}
}

