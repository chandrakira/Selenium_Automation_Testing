package Sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frames {
	public static void main(String[] args) throws Exception {
		System.setProperty("WebDriver.ChromeDriver.driver", "./Resources/chromedriver.exe/");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.findElement(By.id("name")).sendKeys("kiranreddy");
		Thread.sleep(3000);
		driver.switchTo().frame("frm1");
		Select coursename= new Select(driver.findElement(By.id("course")));
		coursename.selectByValue("python");
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("reddy");
		driver.switchTo().frame("frm2");
		WebElement checkbox= driver.findElement(By.id("hindichbx"));
		checkbox.click();
		Thread.sleep(5000);



		driver.close();
	}
}
