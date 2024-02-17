package com.robertgluszkiewicz.carina.demo.gui.pages.common;

import org.openqa.selenium.WebDriver;

import com.zebrunner.carina.webdriver.gui.AbstractPage;

public abstract class SalePageBase extends AbstractPage {
    public SalePageBase(WebDriver driver) {
        super(driver);
        this.setPageURL("/sale.html");
    }

    @Override
    public void open() {
        super.open();
    }
}
