package Sele;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver.ChromeDriver.driver", "./Resources/chromedriver.exe/");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		WebElement dropdown=driver.findElement(By.id("course"));
		Select coursenamedropdown = new Select(dropdown);
		List<WebElement> coursenamedropdownoptions= coursenamedropdown.getOptions();
		for(WebElement option: coursenamedropdownoptions) {
			System.out.println(option.getText());
		}
		coursenamedropdown.selectByIndex(1);
		coursenamedropdown.selectByValue("net");
		coursenamedropdown.selectByVisibleText("Javascript");
		Thread.sleep(2000);
		System.out.println(dropdown.getText());
		driver.quit();
     }


}
