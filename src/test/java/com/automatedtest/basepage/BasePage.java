package com.automatedtest.basepage;

import com.automatedtest.infrastructure.driver.Tools;
import com.automatedtest.infrastructure.driver.Setup;
import org.openqa.selenium.WebDriver;

public class BasePage {

    protected WebDriver driver;
    protected Tools tools;

    public BasePage() {
        this.driver = Setup.driver;
        this.tools = new Tools(this.driver);
    }
}
