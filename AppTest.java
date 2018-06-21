package com.qait.automation.maven_one;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;





public class AppTest 
    
{
	public WebDriver driver;
    public AppTest( String testName )
    {
        
    }
    
    @Test(priority=1)
    public void openApp() {
    driver.get("http://10.0.1.86/tatoc");
    }
    @Test(dependsOnMethods= {"openApp"})
    public void homepage() {
    	home_page home = new home_page(driver);
    	home.home_page_action();
    	 //Assert.assertTrue(3>5);
    	
    }
    @Test(dependsOnMethods= {"homepage"})
    public void grid_gate() {
    	grid_gate gate = new grid_gate(driver);
    	gate.page_action();
    	// Assert.assertTrue(3<5);
    }
    
    @Test(dependsOnMethods= {"grid_gate"})
    public void dungeon() {
    	dungeon_page dungeon = new dungeon_page(driver);
    	dungeon.page_action();
    }
    
    @Test(dependsOnMethods= {"dungeon"})
    public void drag() {
    	DragAndDrop drag = new DragAndDrop(driver);
    	drag.page_action();
    }
    
    @Test(dependsOnMethods= {"drag"})
    public void windows() {
    	WindowsPage window = new WindowsPage(driver);
    	window.page_action();
    }
    @Test(dependsOnMethods= {"windows"})
    public void cookie() {
    	Cookie_page cookie = new Cookie_page(driver);
    	cookie.page_action();
		
    }
    
    
    
    @BeforeTest
    public void beforeTest() {
    	String exePath = "C:\\Users\\Shivamjaiswal\\Downloads\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
    	 driver = new ChromeDriver();
    }
    
    @AfterTest
    public void afterTest() {
    //driver.close();
    }
}
 
