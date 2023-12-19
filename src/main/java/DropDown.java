import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class DropDown {
	
	public static void main (String[]args) {
		WebDriver driver = new ChromeDriver();
		driver.get ("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement dropdown = driver.findElement(By.xpath("//select[@name='url']"));
		
		Select se1 = new Select (dropdown);
		
		se1.selectByIndex(10);
		 se1.selectByValue("search-alias-Books");
		
		
				
	}

}
