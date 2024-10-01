package com.deff;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class step1_insta {
	
	WebDriver driver;
	@Given("user is on login page")
	public void user_is_on_login_page() {
		WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.instagram.com/accounts/login/");
        driver.manage().window().maximize();
	}

	@When("user enters valid username {string}")
	public void user_enters_valid_username(String string) {
		 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("abhishek@567");
	}

	@When("user enters valid password {string}")
	public void user_enters_valid_password(String string) {
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("987654321");
	}

	@Then("clicks on submit")
	public void clicks_on_submit() {
		driver.findElement(By.xpath("//div//button[@type='submit']")).click();
	}


}
