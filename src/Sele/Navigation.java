package Sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.ChromeDriver.driver", "./Resources/chromedriver.exe/");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);

		driver.findElement(By.id("APjFqb")).sendKeys("instagram.com");
		Thread.sleep(2000);

		driver.findElement(By.id("APjFqb")).submit();
		Thread.sleep(2000);

		//NAVIGATE T0 
		//NAVIGATE REFRESH
		//NAVIGATE BACK
		//NAVIGATE FORWARD
		driver.navigate().to("https://www.instagram.com/");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[1]/div/label/input")).sendKeys("thetectpc");
		Thread.sleep(2000);

		driver.navigate().refresh();
		Thread.sleep(2000);

		driver.navigate().back();
		Thread.sleep(2000);

		driver.navigate().forward();
		Thread.sleep(2000);

		driver.close();
	}
}
