package com.reversecoder.automation.androidstudio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

/**
 * @author Md. Rashadul Alam
 */

public class AppiumTestNG {

    WebDriver driver;

    @BeforeTest
    public void testCaseSetup() throws Exception {

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "353358060251001");
        cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "4000");
        cap.setCapability("appPackage", "com.android.vending");
        cap.setCapability("appActivity", "com.google.android.finsky.activities.MainActivity");
//        cap.setCapability(MobileCapabilityType.APP, "c://apks//seekbarsample.apk");
        cap.setCapability("noReset", true);
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        Set<String> contexts = ((AndroidDriver)driver).getContextHandles();
        ((AndroidDriver)driver).context("NATIVE");
    }

    @Test
    public void testSeekBar() throws Exception {
//        Thread.sleep(3000);
//        driver.findElement(By.id("com.android.vending:id/positive_button")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.id("com.android.vending:id/navigation_button")).click();
//        Thread.sleep(3000);
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @AfterTest
    public void testCaseTearDown() {
        driver.quit();
    }
}

