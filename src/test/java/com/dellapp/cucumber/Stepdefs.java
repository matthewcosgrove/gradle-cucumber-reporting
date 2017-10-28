package com.dellapp.cucumber;

import cucumber.api.java8.En;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Stepdefs implements En {

    private static final Logger logger = LoggerFactory
            .getLogger(Stepdefs.class);

    public Stepdefs() {
        Given("^the json has been posted$", () -> {
            logger.info("TODO:");
        });

        When("^I make a GET request$", () -> {
            logger.info("TODO:");
        });
        Then("^the json contains an expected field$", () -> {
            logger.info("TODO:");
        });
        Then("^something else", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new cucumber.api.PendingException();
        });

    }
}
