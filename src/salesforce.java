import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class salesforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chrome1\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://login.salesforce.com/?locale=in");
			driver.findElement(By.id("username")).sendKeys("This is my first code ");
			driver.findElement(By.id("password")).sendKeys("12345");
			driver.findElement(By.id("Login")).click();
			System.out.println(driver.findElement(By.id("error")).getText());
	}
	//*[@id="pass"]

}
