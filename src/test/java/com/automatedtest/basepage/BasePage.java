package com.automatedtest.basepage;

import com.automatedtest.infrastructure.driver.Tools;
import com.automatedtest.infrastructure.driver.Setup;
import org.openqa.selenium.WebDriver;

// Utility class to initiate the driver and the tool objects in order to pass them to all the page classes

public class BasePage {

    protected WebDriver driver;
    protected Tools tools;

    public BasePage() {
        this.driver = Setup.driver;
        this.tools = new Tools(this.driver);
    }
}
