package Mermeto.Test_orient;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class plp extends Homepage {

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
		Thread.sleep(4000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)");
		driver.findElement(By.xpath("//button[@class='usf-c-select__input-value usf-btn']")).click();
		driver.findElement(By.xpath("//button[@data-value='title']")).click();
		if (driver.findElement(By.xpath("//button[@data-value='title']")).isDisplayed()) {
			System.out.println("Title in ascending is displayed");
		}
		else {
			System.out.println("error");
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='usf-c-select__input-value usf-btn']")).click();
		driver.findElement(By.xpath("//button[@data-value='-title']")).click();
		if(driver.findElement(By.xpath("//button[@data-value='-title']")).isDisplayed()) {
			System.out.println("Title in descending is displayed");
		}
		else {
			System.out.println("error in descending");
		}
		
		
		
		
		
		
		//WebElement inputfrom = driver.findElement(By.xpath("//div[@style='left: 100%; border-color: rgb(49, 56, 65); z-index: 2;']"));
/*		inputfrom.click();
//		inputfrom.clear();
//		inputfrom.sendKeys("1000");
		WebElement inputto = driver.findElement(By.xpath("//div[@style='left: 77.9551%; border-color: rgb(49, 56, 65); z-index: 2;']"));
		fans.clickAndHold(inputfrom)
		.release(inputto).build().perform();
//		inputto.click();
//		inputto.clear();
//		inputto.sendKeys("2300");*/
		
	}

}
