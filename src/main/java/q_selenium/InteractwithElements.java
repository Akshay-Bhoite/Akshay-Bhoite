package q_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;





public class InteractwithElements {
	

public static void main (String[] args) throws InterruptedException{
		
          WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.manage().window ().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement (By.id("email")).sendKeys("Akshay");
		driver.findElement (By.id("pass")).sendKeys("123");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("login")).click();
			

}
}