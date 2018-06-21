package com.qait.automation.maven_one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class home_page {
	public WebDriver driver;
	public home_page(WebDriver driver) {
		this.driver = driver;
	}
	private WebElement findPageElement() {
		return driver.findElement(By.linkText("Basic Course"));
	}
	
	public void home_page_action() {
		findPageElement().click();
	}

}
