package com.automatedtest.features.basepage;

import com.automatedtest.features.infrastructure.driver.Tools;
import com.automatedtest.features.infrastructure.driver.Setup;
import org.openqa.selenium.WebDriver;

public class BasePage {

    protected WebDriver driver;
    protected Tools tools;

    public BasePage() {
        this.driver = Setup.driver;
        this.tools = new Tools(this.driver);
    }
}
