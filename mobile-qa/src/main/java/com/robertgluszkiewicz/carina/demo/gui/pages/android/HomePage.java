package com.robertgluszkiewicz.carina.demo.gui.pages.android;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.robertgluszkiewicz.carina.demo.gui.pages.common.HomePageBase;
import com.robertgluszkiewicz.carina.demo.gui.pages.common.SalePageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.decorator.PageOpeningStrategy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = HomePageBase.class)
public class HomePage extends HomePageBase {
    @FindBy(xpath="//a[@id='ui-id-8']")
    private ExtendedWebElement saleButton;

    public HomePage(WebDriver driver) {
        super(driver);
        setPageOpeningStrategy(PageOpeningStrategy.BY_URL);
        setPageAbsoluteURL("https://magento.softwaretestingboard.com");
    }

    @Override
    public SalePageBase openSalePage() {
        saleButton.click();
        return initPage(driver, SalePageBase.class);
    }
}
