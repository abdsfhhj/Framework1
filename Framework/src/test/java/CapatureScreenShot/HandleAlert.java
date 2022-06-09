package CapatureScreenShot;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		driver.findElement(By.xpath("//button[text='Click for JS Alert']")).click();

		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		System.out.println(alertText);
		alert.accept();
		
		
		String result = driver.findElement(By.xpath("//p[@id='result']")).getText();

		System.out.println(result);

		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();

		System.out.println(alert.getText());
		
		alert.accept();
		result = driver.findElement(By.xpath("//p[@id='result']")).getText();

		System.out.println(result);

		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		System.out.println(alert.getText());

		alert.sendKeys("Hello !!!");

		alert.accept();
		result = driver.findElement(By.xpath("//p[@id='result']")).getText();

		System.out.println(result);
		
	}

}
