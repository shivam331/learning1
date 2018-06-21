package com.qait.automation.maven_one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WindowsPage {
	public WebDriver driver;
	public WindowsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void page_action() {
		driver.findElement(By.linkText("Launch Popup Window")).click();
        //First Get parent window,means current window handle
        String parentWindow=driver.getWindowHandle();
        
        for(String handle:driver.getWindowHandles())
        {
        System.out.println(handle);
        driver.switchTo().window(handle);

    }
        
         driver.findElement(By.id("name")).sendKeys("shivam");
		 driver.findElement(By.id("submit")).click(); 
		 //Go back to Parent window
        driver.switchTo().window(parentWindow);
		 driver.findElement(By.linkText("Proceed")).click();
	}
	
}
