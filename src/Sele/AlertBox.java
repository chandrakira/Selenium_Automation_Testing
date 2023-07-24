package Sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBox {
	public static void main(String[] args) throws Exception {
		System.setProperty("WebDriver.ChromeDriver.driver", "./Resources/chromedriver.exe/");
		
		WebDriver driver=new ChromeDriver();
//      ALERT BOX		
//	    driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
//		System.out.println(driver.findElement(By.id("output")).getText());
//		driver.findElement(By.id("alertBox")).click();
//		Thread.sleep(3000);
//		driver.switchTo().alert().accept();
//		Thread.sleep(3000);
//		System.out.println(driver.findElement(By.id("output")).getText());
//		Thread.sleep(3000);
//		driver.quit();

//		CONFIRM BOX
//		
//		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
//		System.out.println(driver.findElement(By.id("output")).getText());
//		driver.findElement(By.id("confirmBox")).click();
//		Thread.sleep(3000);
//		driver.switchTo().alert().accept();
//		driver.switchTo().alert().dismiss();
		
//		Thread.sleep(3000);
//		System.out.println(driver.findElement(By.id("output")).getText());
//		Thread.sleep(3000);
//		driver.quit();
		
//		PROMPT BOX
		
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		System.out.println(driver.findElement(By.id("output")).getText());
		driver.findElement(By.id("promptBox")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().sendKeys("kiranreddy");
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		System.out.println(driver.findElement(By.id("output")).getText());
		Thread.sleep(3000);
		driver.quit();
	}
}
