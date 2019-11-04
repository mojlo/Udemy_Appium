import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {

	 

    public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException {

           // TODO Auto-generated method stub

          

           File appDir = new File("src");


       //    File app = new File(appDir, "soehnle_ui1.0.apk");
           File app = new File(appDir, "General-Store.apk");
           

        DesiredCapabilities dc=new DesiredCapabilities();

        dc.setCapability("platformName", "Android");

        dc.setCapability("platformVersion", "7.0");

        dc.setCapability("deviceName", "NeerajEmulator");

        dc.setCapability("app", "C:\\Users\\This Pc\\Downloads\\General-Store.apk");

        dc.setCapability("newCommandTimeout", 120);

        dc.setCapability("automatorName", "UiAutomator2");

//      dc.setCapability("appPackage", "de.soehnle.connect");

//      dc.setCapability("appActivity", "HomeActivity");

     AndroidDriver<AndroidElement> driver=new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), dc);

           return driver;

    }
}








/*
public class Base {

	public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException {
		// TODO Auto-generated method stub
		File f=new File("src");
		File fs=new File(f,"ApiDemos-debug.apk");
		
		DesiredCapabilities dc=new DesiredCapabilities();
	//	dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
	//	dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
	//	dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,9.0);
		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"NeerajEmulator");
		dc.setCapability(MobileCapabilityType.APP,fs.getAbsolutePath());
		AndroidDriver<AndroidElement> driver=new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),dc);
return driver ;

	}

}
*/