package com.cucumber.automation.core;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/com/cucumber/automation/features"},
				glue= {"com.cucumber.automation.stepdefinitions"},
				plugin = {"pretty",
							"html:target/cucumber-htmlreport",
							"json:target/cucumber-report.json",
							"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport.html"},
				monochrome = false,
				dryRun = false)
public class RunMyFeatureTest {
	
	
	
}
