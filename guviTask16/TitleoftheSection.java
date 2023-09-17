package guviTask16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TitleoftheSection {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
        WebElement searchInput = driver.findElement(By.name("search"));
        searchInput.sendKeys("artificial intelligence");
        searchInput.submit();
        WebElement historySection = driver.findElement(By.linkText("History"));
        historySection.click();

        String sectionTitle = driver.getTitle();

      System.out.println("Title of the History section: " + sectionTitle);
      driver.quit();



	}

}
