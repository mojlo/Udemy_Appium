import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Ecommerce extends Base{
	public static void main(String[] args)throws MalformedURLException, InterruptedException {

        // TODO Auto-generated method stub

       

AndroidDriver<AndroidElement> driver=capabilities();

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Neeraj");
driver.hideKeyboard();
driver.findElement(By.xpath("//*[@text='Female']")).click();
//driver.findElement(By.id("om.androidsample.generalstore:id/radioFemale")).click();

driver.findElement(By.id("android:id/text1")).click();
driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Antarctica\"));");
driver.findElement(By.xpath("//android.widget.TextView[@text='Antarctica']")).click();
driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
// for toast message check
String toastmassegae =driver.findElement(By.xpath("//android.widget.Toast[1]")).getAttribute("name");

System.out.println(toastmassegae);
Assert.assertEquals("enter the name",toastmassegae);
}
}
