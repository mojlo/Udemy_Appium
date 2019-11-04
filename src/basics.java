import java.net.MalformedURLException;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

 

public class basics extends Base{

public static void main(String[] args)throws MalformedURLException, InterruptedException {

                                // TODO Auto-generated method stub

                               

  AndroidDriver<AndroidElement> driver=capabilities();

  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    //     driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();

       //  driver.findElementByXPath("//android.widget.Button[@text=['Login']").click();
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
      
      
        /* code skip registration */
  
  /*
       driver.findElementByXPath("//android.widget.Button[@text='Skip registration']").click();
   
       
       driver.findElementByXPath("//android.widget.EditText[@text='Name']").sendKeys("Mario");
       driver.findElementByXPath("//android.widget.LinearLayout[@index='3']").click();
       driver.findElementByXPath("//android.widget.EditText[@text='Date of birth']").click();
       UiSelector().scrollable(true).instance(0)).scrollIntoView
       (new UiSelector().textMatches(\"" + containedText + "\").instance(0))"));     
       driver.findElementByXPath("//android.widget.Button[@text='Continue']").click();
      // driver.findElementById("3").click();
       driver.findElement(By.className("android.widget.CheckBox")).click();
       driver.findElementByXPath("//android.widget.Button[@text='Continue']").click();
       driver.findElementByXPath("//android.widget.Button[@text='ALLOW']").click();
       driver.findElementByXPath("//android.support.v7.widget.RecyclerView[@index='0']").click();
      */
    
      
      
       /* for registration page  */

      /*    

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

          
*/
         
       
       
       
       /* code for onboarding tracker 300 */
       
     //  driver.findElementByXPath("//android.widget.Button[@text='Skip registration']").click();
       
   //    driver.findElement(By.className(" android.widget.ImageView[3]")).click();


                }

 

}