package com.reversecoder.automation.androidstudio;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 * @author Md. Rashadul Alam
 */

public class PlayStoreTest {

    WebDriver driver;

    @Before
    public void setUp() throws MalformedURLException {
        // Created object of DesiredCapabilities class.
        DesiredCapabilities capabilities = new DesiredCapabilities();

        // Set android deviceName desired capability. Set your device name.
        capabilities.setCapability("deviceName", "353358060251001");

        // Set BROWSER_NAME desired capability. It's Android in our case here.
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "Android");

        // Set android VERSION desired capability. Set your mobile device's OS version.
        capabilities.setCapability(CapabilityType.VERSION, "5.0.2");

        // Set android platformName desired capability. It's Android in our case here.
        capabilities.setCapability("platformName", "Android");

        // Set android appPackage desired capability. It is
        // com.android.calculator2 for calculator application.
        // Set your application's appPackage if you are using any other app.
//        capabilities.setCapability("appPackage", "com.android.settings");
//        capabilities.setCapability("appPackage", "com.android.vending");
        capabilities.setCapability("appPackage", "com.android.vending");

        // Set android appActivity desired capability. It is
        // com.android.calculator2.Calculator for calculator application.
        // Set your application's appPackage if you are using any other app.
//        capabilities.setCapability("appActivity", "com.android.settings.Settings");
//        capabilities.setCapability("appActivity", "com.google.android.finsky.activities.MainActivity");
        capabilities.setCapability("appActivity", "com.google.android.finsky.activities.MainActivity");

        // Created object of RemoteWebDriver will all set capabilities.
        // Set appium server address and port number in URL string.
        // It will launch calculator app in android device.
        driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);


    }

    @Test
    public void TestMyApps() throws Exception{

        // Click on DELETE/CLR button to clear result text box before running test.
        Thread.sleep(3000);
        driver.findElement(By.id("com.android.vending:id/positive_button")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("com.android.vending:id/navigation_button")).click();
        Thread.sleep(1000);
//        driver.findElement(By.tagName("My apps & games")).click();
//        Thread.sleep(3000);
//
//        // Click on number 2 button.
//        driver.findElement(By.name("7")).click();
//
//        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    }

    @After
    public void End() {
        driver.quit();
    }
}

