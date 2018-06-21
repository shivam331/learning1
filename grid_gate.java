package com.qait.automation.maven_one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class grid_gate {

	public WebDriver driver;
	public grid_gate(WebDriver driver) {
		this.driver = driver;
	}
	private WebElement findPageElement() {
		return driver.findElement(By.className("greenbox"));
	}
	
	public void page_action() {
		findPageElement().click();
	}
}
