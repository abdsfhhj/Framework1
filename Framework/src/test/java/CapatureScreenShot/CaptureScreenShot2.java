package CapatureScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureScreenShot2 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
		
		captureScreenShot(driver, "facebook_login");
		
		driver.findElement(By.name("email")).sendKeys("vasant@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("vasant@223$");
		
		captureScreenShot(driver, "facebook_login1");
		
		driver.findElement(By.name("login")).click();
		
		captureScreenShot(driver, "facebook_login2");
			
		Thread.sleep(5000);
		driver.quit();
	}
	
	public static void captureScreenShot(WebDriver driver, String screenshotname) throws IOException {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("C:\\Users\\user\\eclipse-workspace\\demo2\\Framework\\CaptureScreenshot"+screenshotname+System.currentTimeMillis()+"png"));
	}
	

}
