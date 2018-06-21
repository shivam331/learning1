package com.qait.automation.maven_one;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Cookie_page {
	public WebDriver driver;
	public Cookie_page(WebDriver driver) {
		this.driver = driver;
	}
	public void page_action() {
		
		driver.findElement(By.linkText("Generate Token")).click();
		 WebElement token = driver.findElement(By.id("token"));
		 String value = token.getText();
		 value = value.replace("Token: ", "");
		System.out.println(value);
		Cookie ck = new Cookie("Token", value);
		driver.manage().addCookie(ck);
		driver.findElement(By.linkText("Proceed")).click();
	}

}
