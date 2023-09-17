package guviTask16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintCurrentURL {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
	    driver.manage().window().maximize();

		driver.get("https://www.google.com/");
		 System.out.println("Current URL: " + driver.getCurrentUrl());
		 driver.navigate().refresh();
		 driver.quit();
	}

}
