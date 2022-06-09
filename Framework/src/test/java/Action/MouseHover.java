package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		driver.findElement(By.id("txtUsername")).clear();
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        
	    driver.findElement(By.id("txtPassword")).clear();
	    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	    
	    driver.findElement(By.id("btnLogin")).click();
	     
	    WebElement viewAdminModule =  driver.findElement(By.id("menu_admin_viewAdminModule"));
	    WebElement UserManagement = driver.findElement(By.id("menu_admin_UserManagement"));
	    WebElement viewSystemUsers = driver.findElement(By.id("menu_admin_viewSystemUsers"));
	    
	    
	    Actions action =  new Actions(driver);
	    
	    action.moveToElement(viewAdminModule);
	    action.moveToElement(UserManagement);
	    action.moveToElement(viewSystemUsers);
	    action.click().build().perform();
	    
	    
	    
	   

	}

}
