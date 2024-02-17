package com.robertgluszkiewicz.carina.demo.gui.pages.common;

import org.openqa.selenium.WebDriver;

import com.zebrunner.carina.webdriver.decorator.PageOpeningStrategy;
import com.zebrunner.carina.webdriver.gui.AbstractPage;

public abstract class HomePageBase extends AbstractPage {

    public HomePageBase(WebDriver driver) {
        super(driver);
    }

    @Override
    public void open() {
        super.open();
    }

    public abstract SalePageBase openSalePage();

}
