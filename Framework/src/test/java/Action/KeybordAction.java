package Action;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeybordAction {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://facebook.com");
		
		   Actions action = new Actions(driver);
		   //action.sendKeys(Keys.ENTER).perform();
		   //action.sendKeys(Keys.TAB).perform();
		   //action.sendKeys("kishortalele95@gmail.com").sendKeys(Keys.TAB).build().perform();
		   action.sendKeys("kishortalele952gmail.com");
		   
		   action.sendKeys(Keys.TAB)
		   .pause(Duration.ofSeconds(1))
		   .sendKeys("9960307653")
		   .pause(Duration.ofSeconds(1))
		   .sendKeys(Keys.ENTER)
		   .pause(Duration.ofSeconds(1))
		   .build().perform();



	}

}
