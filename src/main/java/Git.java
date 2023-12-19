import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Git {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://github.com/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("login_field")).sendKeys("Akshay");
		driver.findElement(By.id("password")).sendKeys ("987");
		driver.findElement(By.name("commit")).click();
		
		System.out.println(driver.getTitle());
		
	

	}

}
