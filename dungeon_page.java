package com.qait.automation.maven_one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class dungeon_page {
	public WebDriver driver;
	public dungeon_page(WebDriver driver) {
		this.driver = driver;
	}
	public void page_action() {
		driver.switchTo().frame("main");
		WebElement box1 = driver.findElement(By.id("answer"));
		String box1Color = box1.getAttribute("class");
	
		driver.switchTo().frame("child");
		WebElement box2 = driver.findElement(By.id("answer"));
		String box2Color = box2.getAttribute("class");
		
		System.out.println(box2Color);
		while(!box1Color.equals(box2Color)) {
			 driver.switchTo().parentFrame();
			 driver.findElement(By.linkText("Repaint Box 2")).click();
			 driver.switchTo().frame("child");
			  box2 = driver.findElement(By.id("answer"));
			 box2Color = box2.getAttribute("class");
			// System.out.println(box2Color);
		}
		driver.switchTo().parentFrame();
		 driver.findElement(By.linkText("Proceed")).click();
	}

}
