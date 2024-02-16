package com.robertgluszkiewicz.carina.demo.automationexercise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

public class SampleTest {

    @BeforeTest
    @Override
    public WebDriver getDriver() {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("platformName", "ANDROID");
        dc.setCapability("appium:automationName", "uiautomator2");
        dc.setCapability("appium:deviceName", "Pixel 3");
        dc.setCapability("appium:deviceType", "phone");
        dc.setCapability("appium:udid", "emulator-5554");
        dc.setCapability("browserName", "chrome");
        return getDriver("default", dc);
    }
}
