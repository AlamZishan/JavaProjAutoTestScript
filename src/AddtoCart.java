import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddtoCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdrive.chrome.driver", "C:\\Users\\mindsdet122\\Maven Project\\webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.urbanladder.com");
		System.out.println(driver.getTitle());

	}

}
