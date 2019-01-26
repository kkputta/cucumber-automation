package com.cucumber.automation.stepdefinitions;

import java.io.File;
import java.sql.Time;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepDef {
	
	public WebDriver driver;
	public String uname;
	public String pass;
	
	@Given("^User need to be on Facebook Login Page$")
	public void userNeedToBeOnFacebookLoginPage() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+File.separator+"src/test/resources/drivers/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	
	
	@When("^Enter the \"([^\"]*)\" username$")
	public void enterTheCredentialsOnLoginpage(String uname) {
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys(uname);
		
	}
	
	@And("^Enter the \"([^\"]*)\" password$")
	public void loadUsernameAndPassword(String pass) {
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys(pass);
	}
	
	@Then("^click the login button$")
	public void clickTheLoginButton() {
		try {
			Thread.sleep(60);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id='u_0_2']")).click();
	}
	
	@And("^Check the user launch on login page$")
	public void checkTheUserLaunchOnLoginPage() {
		String text = driver.findElement(By.xpath("//*[text()='Log in to Facebook']")).getText();
		Assert.assertEquals(text, "Log in to Facebook");
		driver.quit();
	}

}
