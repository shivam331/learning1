package learning;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class selenium_basic {
	public static void main(String args[]) {
		String exePath = "C:\\Users\\Shivamjaiswal\\Downloads\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.get("http://10.0.1.86/tatoc");
		driver.findElement(By.linkText("Basic Course")).click();
		
		driver.findElement(By.className("greenbox")).click();
		
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
		 
		 
		 WebElement drag_me = driver.findElement(By.cssSelector("div#dragbox"));
		 WebElement drop_box = driver.findElement(By.cssSelector("div#dropbox"));
		// System.out.println(drag_me.getAttribute("style[1]"));
		 
		 //Using Action class for drag and drop.		
         Actions act=new Actions(driver);					

	//Dragged and dropped.		
         act.dragAndDrop(drag_me, drop_box).build().perform();
         driver.findElement(By.linkText("Proceed")).click();
         
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
