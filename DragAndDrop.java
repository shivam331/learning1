package com.qait.automation.maven_one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public WebDriver driver;
	public DragAndDrop(WebDriver driver) {
		this.driver = driver;
	}
	public void page_action() {
		 WebElement drag_me = driver.findElement(By.cssSelector("div#dragbox"));
		 WebElement drop_box = driver.findElement(By.cssSelector("div#dropbox"));
		// System.out.println(drag_me.getAttribute("style[1]"));
		 
		 //Using Action class for drag and drop.		
         Actions act=new Actions(driver);					

	//Dragged and dropped.		
         act.dragAndDrop(drag_me, drop_box).build().perform();
         driver.findElement(By.linkText("Proceed")).click();
	}

}
