package Mermeto.Test_orient;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Footer extends Homepage {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://shop.orientelectric.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();

	Actions fans = new Actions(driver);
	
	Thread.sleep(4000);
	WebElement close = driver.findElement(By.xpath("//p[@class=\"closeBtn\"]"));
	close.click();
	WebElement getstarted = driver.findElement(By.xpath("//a[@class=\"button quiz__button button--primary\"]"));
	fans.moveToElement(getstarted, 10, 20).build().perform();
	ChromeOptions options = new ChromeOptions();

	options.addArguments("--disable-notifications");

	driver.findElement(By.xpath("//li[@data-title=\"table-fans\"]")).click();
	driver.get("https://shop.orientelectric.com/collections/table-fans");
	String title = driver.getTitle();
	System.out.println(title);
	driver.navigate().back();
	driver.findElement(By.xpath("//li[@data-title=\"stand-fans\"]")).click();
	driver.get("https://shop.orientelectric.com/collections/stand-fans");
	String standfans = driver.getTitle();
	System.out.println(standfans);
	driver.navigate().back();
	driver.findElement(By.xpath("//li[@data-title='desert-cooler']")).click();
	driver.get("https://shop.orientelectric.com/collections/desert-coolers");
	String desertcoolers = driver.getTitle();
	System.out.println(desertcoolers);
	
	
	
	}
	}
