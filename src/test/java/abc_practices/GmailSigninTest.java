package abc_practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailSigninTest {

	public static void main(String[] args) throws InterruptedException {
		
	//	chormeDriver.exe
		
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/ACER/Desktop/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.google.com/");
		
		 Thread.sleep(2000);
		 driver.findElement(By.id("gb_70")).click();
		 
		 
		 Thread.sleep(20000);
			driver.quit();
		 
	}
	

}

		
		
	

