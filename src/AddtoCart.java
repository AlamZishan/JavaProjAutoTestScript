import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddtoCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mindsdet122\\Maven Project\\webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.urbanladder.com");
		System.out.println(driver.getTitle());
		Thread.sleep(100l);
		driver.findElement(By.xpath("//input[@class='typeahead tt-input']")).sendKeys("Bedsheets");
		driver.findElement(By.xpath("//span[@class='search-icon icofont-search']")).click();
		
		driver.findElement(By.xpath("(//img[@class='product-img-default'])[1]")).click();
		ArrayList<String> newtabs = new ArrayList<String>(driver.getWindowHandles());
		Thread.sleep(2000l);
		driver.switchTo().window(newtabs.get(0));
		Thread.sleep(3000l);
		driver.findElement(By.xpath("(//button[@id='add-to-cart-button'])[1]")).click();

	}

}
