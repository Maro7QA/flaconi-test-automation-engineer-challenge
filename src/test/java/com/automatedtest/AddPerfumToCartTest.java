package com.automatedtest;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/com/automatedtest/Add_perfum_to_cart.feature"},
        strict = false, plugin = {"pretty",
        "json:target/cucumber_json_reports/user-journey.json",
        "html:target/user-journey-html"},
        glue = {"com.automatedtest.infrastructure.driver",
                "com.automatedtest.userjourney"})

public class AddPerfumToCart {
}
