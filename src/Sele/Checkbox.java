package Sele;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Checkbox {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver.ChromeDriver.driver", "./Resources/chromedriver.exe/");
		
		WebDriver driver=new ChromeDriver();
	
		
		/*driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		WebElement colors=driver.findElement(By.name("color"));
		Select sel=new Select(colors);
		sel.selectByValue("Red");
		sel.selectByVisibleText("Yellow");*/

		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		Thread.sleep(3000);
		WebElement selectmul=driver.findElement(By.id("ide"));
		System.out.println(selectmul.getText());
		Select selectmuloptions= new Select(selectmul);
		selectmuloptions.selectByIndex(1);
		Thread.sleep(2000);
		selectmuloptions.selectByValue("ij");
		Thread.sleep(2000);
		selectmuloptions.deselectByVisibleText("NetBeans");
		List<WebElement> selectedoptions = selectmuloptions.getAllSelectedOptions();
		for (WebElement selectedoption: selectedoptions) {
			System.out.println(selectedoption.getText());
		}
		driver.quit();
	}

}
