package com.dellapp.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"com.dellapp.cucumber"},
        features = {"classpath:"},
        plugin = {"json:build/cucumber/cucumber.json"}
)
public class CucumberRunner {
}
