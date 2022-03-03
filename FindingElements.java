package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;



public class FindingElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
			driver.get("https://www.amazon.in");
			driver.findElement(By.className("nav-search-field"));
			driver.findElement(By.cssSelector("#nav-hamburger-menu"));
			driver.findElement(By.id("nav-cart-count"));
			driver.findElement(By.linkText("Mobiles"));
			driver.findElement(By.partialLinkText("Mo"));
			driver.findElement(By.tagName("input"));
			driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[5]"));
			
			WebElement text = driver.findElement(By.id("twotabsearchtextbox"));
			Actions builder = new Actions(driver);
			Action sentActions = builder
					.moveToElement(text)
					.click()
					.keyDown(text, Keys.SHIFT)
					.sendKeys(text, "Samsung")
					.keyUp(text, Keys.SHIFT)
					.doubleClick()
					//.contextClick()
					.build();
					sentActions.perform();
			
		//	driver.close();
			System.out.println("Test Passed");
	}
	

}