import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MouseHover {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.in");
        driver.manage().window().maximize();
        
        WebElement ele = driver.findElement(By.xpath("//a[@href ='https:www.amazon.in"))
	    setTimeout(function(){debugger;},5000);	
	}

}
