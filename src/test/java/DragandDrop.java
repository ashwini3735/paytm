import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.get("https://dhtmlx.com/docs/products/dhtmlxTree/");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		WebElement e1 = driver.findElement(By.xpath("//span[text()='Bestsellers']/.."));
		WebElement e2 = driver.findElement(By.xpath("//li[text()='Zend Framework in Action']/.."));
		a.click(e1).perform();
		Thread.sleep(5000);
		driver.quit();
	}

}
