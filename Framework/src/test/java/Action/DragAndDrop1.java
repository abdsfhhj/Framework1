package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		 
		WebElement Washington = driver.findElement(By.id("box3"));
		WebElement UnitedStates = driver.findElement(By.id("box103"));
		
		Actions action = new Actions(driver);
		
		action.dragAndDrop(Washington, UnitedStates).build().perform();
		

	}

}
