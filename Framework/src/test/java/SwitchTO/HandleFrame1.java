package SwitchTO;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleFrame1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/iframe");

		System.out.println(driver.findElement(By.xpath("//a[text()='Elemental Selenium']")).getText());

		List<WebElement> iframes = driver.findElements(By.tagName("iframe"));

		System.out.println("Total number of iframes on the page : " + iframes.size());

		driver.switchTo().frame("mce_0_ifr");

		String para = driver.findElement(By.xpath("//p[text()='Your content goes here.']")).getText();

		System.out.println(para);
		
		driver.switchTo().defaultContent();

		driver.findElement(By.linkText("Elemental Selenium")).click();

	}

}
