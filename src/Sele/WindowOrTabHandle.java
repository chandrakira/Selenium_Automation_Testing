package Sele;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowOrTabHandle {
	public static void main(String[] args) throws Exception {
		System.setProperty("WebDriver.ChromeDriver.driver", "./Resources/chromedriver.exe/");
		//WINDOW HANDLE
		WebDriver driver=new ChromeDriver();
//		String parentwindowhandle=driver.getWindowHandle();
//		System.out.println(parentwindowhandle+driver.getTitle());
//		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
//		driver.findElement(By.id("newWindowBtn")).click();
//		Set<String>windowhandles=driver.getWindowHandles();
//		for (String windowhandle : windowhandles) {
//			if(!windowhandle.equals(parentwindowhandle)) {
//				driver.switchTo().window(windowhandle);
//				driver.findElement(By.id("firstName")).sendKeys("kiran");
//			}
//		}
//		driver.switchTo().window(parentwindowhandle);
//		driver.findElement(By.id("name")).sendKeys("kiran");
		
		//TAB HANDLE
		String parentwindowhandle=driver.getWindowHandle();
		System.out.println(parentwindowhandle+driver.getTitle());
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.findElement(By.id("newTabBtn")).click();
		Set<String>windowhandles=driver.getWindowHandles();
		for (String windowhandle : windowhandles) {
			if(!windowhandle.equals(parentwindowhandle)) {
				driver.switchTo().window(windowhandle);
				driver.findElement(By.id("alertBox"));
				driver.switchTo().alert().accept();
			}
		}
		driver.switchTo().window(parentwindowhandle);
		driver.findElement(By.id("name")).sendKeys("kiran");
	}
}
