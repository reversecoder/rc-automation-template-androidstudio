package com.reversecoder.automation.androidstudio;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * @author Md. Rashadul Alam
 */

public class PlayStoreTest {

    WebDriver driver;

    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "353358060251001");
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "Android");
        capabilities.setCapability(CapabilityType.VERSION, "5.0.2");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appPackage", "com.android.vending");
        capabilities.setCapability("appActivity", "com.google.android.finsky.activities.MainActivity");
        driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @Test
    public void TestPlayStore() throws Exception {
        Thread.sleep(3000);
        driver.findElement(By.id("com.android.vending:id/positive_button")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("com.android.vending:id/navigation_button")).click();
        Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @After
    public void End() {
        driver.quit();
    }
}

