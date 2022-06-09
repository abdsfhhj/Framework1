package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		WebElement Oslo = driver.findElement(By.id("box1"));
		WebElement Norway = driver.findElement(By.id("box101"));
		
		WebElement Madrid = driver.findElement(By.id("box7"));
		WebElement Spain = driver.findElement(By.id("box107"));
		
		WebElement Rome = driver.findElement(By.id("box6"));
		WebElement Italy = driver.findElement(By.id("box106"));
		
		WebElement Stockholm = driver.findElement(By.id("box2"));
		WebElement Sweden = driver.findElement(By.id("box102"));
		
		WebElement Copenhagen = driver.findElement(By.id("box4"));
		WebElement Denmark = driver.findElement(By.id("box104"));
		
		WebElement Washington = driver.findElement(By.id("box3"));
		WebElement UnitedStates = driver.findElement(By.id("box103"));
		
		WebElement Seoul = driver.findElement(By.id("box5"));
		WebElement SouthKorea = driver.findElement(By.id("box105"));
		
		Actions action = new Actions(driver); 
		
		action.dragAndDrop(Oslo, Norway).build().perform();
		action.dragAndDrop(Madrid, Spain).build().perform();
		action.dragAndDrop(Rome, Italy).build().perform();
		action.dragAndDrop(Stockholm, Sweden).build().perform();
		action.dragAndDrop(Copenhagen, Denmark).build().perform();
		action.dragAndDrop(Washington, UnitedStates).build().perform();
		action.dragAndDrop(Seoul, SouthKorea).build().perform();
		//driver.quit();
		

	}

}
