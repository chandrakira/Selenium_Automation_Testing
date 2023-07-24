package Sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver.ChromeDriver.driver", "./Resources/chromedriver.exe/");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		WebElement radio=driver.findElement(By.id("malerb"));
		Thread.sleep(3000);
		radio.click();
		WebElement check=driver.findElement(By.id("englishchbx"));
		check.click();
		Thread.sleep(2000);
		if(check.isSelected()) {
			check.click();
			
		}
		Thread.sleep(3000);
		WebElement button=driver.findElement(By.id("registerbtn"));
		button.click();
		Thread.sleep(3000);
		
		driver.quit();
}

}
