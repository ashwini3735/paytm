import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActiononMyntra {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.get("https://dhtmlx.com");
		driver.
		 WebElement women = driver.findElement(By.xpath("//a[@data-group='women']"));
		Actions a = new Actions(driver);
		a.
		Thread.sleep(6000);
		driver.quit();
		
		
	}

}
