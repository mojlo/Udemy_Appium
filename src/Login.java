import java.net.MalformedURLException;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

 

public class Login extends Base{

public static void main(String[] args)throws MalformedURLException, InterruptedException {

                                // TODO Auto-generated method stub

                               

  AndroidDriver<AndroidElement> driver=capabilities();

  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

/* code for login directly 
 /*
  * 
  */
     driver.findElementById("de.soehnle.connect:id/loginButton").click();
     driver.findElement(By.className("android.widget.EditText")).sendKeys("Neerajsingh151+11@gmail.com");

      driver.findElementById("de.soehnle.connect:id/ed_password").sendKeys("Neeraj12345");
      driver.findElementById("de.soehnle.connect:id/login_btn").click();
      driver.findElementById("com.android.packageinstaller:id/permission_allow_button").click();
      driver.findElementById("de.soehnle.connect:id/largeLabel").click();
      
}
}
