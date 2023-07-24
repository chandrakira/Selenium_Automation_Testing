package Sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementProperties {
	public static void main(String[] args) throws Exception {
		System.setProperty("WebDriver.ChromeDriver.driver", "./Resources/chromedriver.exe/");
		WebDriver driver=new ChromeDriver();
		driver.get("https://github.com/login");
//		System.out.println(driver.findElement(By.id("login_field")).getTagName());
//		System.out.println(driver.findElement(By.name("commit")).getAttribute("type"));
//		WebElement usernametxt=driver.findElement(By.id("login_field"));
//		usernametxt.sendKeys("kiranreddy");
//		System.out.println(usernametxt.getAttribute("value"));
		System.out.println(driver.findElement(By.id("login_field")).getText());
//		System.out.println(driver.findElement(By.name("commit")).getCssValue("background-color"));
		driver.quit();
	}

}
