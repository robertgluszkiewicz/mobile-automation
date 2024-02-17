package com.robertgluszkiewicz.carina.demo;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.robertgluszkiewicz.carina.demo.gui.pages.android.HomePage;
import com.robertgluszkiewicz.carina.demo.gui.pages.common.SalePageBase;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.utils.mobile.IMobileUtils;

public class HomePageTest implements IAbstractTest, IMobileUtils {
    private HomePage homePage;
    @BeforeMethod
    public void beforeMethod(){
        homePage = new HomePage(getDriver());
        homePage.open();
    }

    @Test
    public void testOpenHomePage() {
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
    }

    @Test
    public void testOpenSalePage() {
        SalePageBase salePage = homePage.openSalePage();
        assertTrue(salePage.isPageOpened(),"Sale page is not opened");
    }


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
