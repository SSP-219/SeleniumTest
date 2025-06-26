package Test1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class helloWorld {

	@Test
	public void test() throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://amazon.com");
		
		WebElement searchTxtBox = driver.findElement(By.name("field-keywords"));
		searchTxtBox.sendKeys("Women handbags");
		Thread.sleep(2000);
		
		driver.close();
		
	}

}
