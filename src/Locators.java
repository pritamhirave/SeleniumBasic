import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://en-gb.facebook.com/");
			driver.findElement(By.id("email")).sendKeys("This is my first code ");
			driver.findElement(By.name("pass")).sendKeys("12345");
			driver.findElement(By.linkText("Forgotten password?")).click();
			driver.findElement(By.name("email")).sendKeys("1234567890");
	}
	//*[@id="pass"]

}
