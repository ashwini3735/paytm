import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flyittickatebook {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.get("https://paytm.com/");
		driver.manage().window().maximize();
		Actions actions = new Actions(driver);
		WebElement flighttiketbutton = driver.findElement(By.xpath("(//div[@class='_2EGQY'])[2]"));
		actions.moveToElement(flighttiketbutton).click().perform();
	WebElement	fromtextbox = driver.findElement(By.xpath("//span[text()='DEL']"));
	
	fromtextbox.click();
	WebElement from = driver.findElement(By.id("text-box"));
	 from.clear();
	Thread.sleep(2000);
	actions.moveToElement(from).sendKeys("Bagloure");
		driver.quit();

	}

}
