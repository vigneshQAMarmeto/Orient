package Mermeto.Test_orient;

import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Homepage {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://shop.orientelectric.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[@class='header__icon header__icon--account icon--account link focus-inset']")).click();
		driver.findElement(By.xpath("//input[@id=\"mobileNumber\"]")).sendKeys("8870188214");
		driver.findElement(By.xpath("//input[@id=\"mobile-number--checkbox\"]")).click();
		
		driver.findElement(By.xpath("//button[@class=\"submit_button button button--primary full--width\"]")).click();		Thread.sleep(20000);
		driver.findElement(By.xpath("//button[@id=\"OTP_submit_button\"]")).click();
		Thread.sleep(2000);
		if (driver.findElement(By.xpath("//a[@class=\"header__heading-link logoimage link link--text focus-inset\"]")).isDisplayed()) {
			System.out.println("Login successfull");

		} else {
			System.out.println("Issue in login");

		}
		ChromeOptions options = new ChromeOptions();
		driver.navigate().refresh();
		driver.findElement(By.xpath("//a[@class=\"header__heading-link logoimage link link--text focus-inset\"]")).click();
		options.addArguments("--disable-notifications");

		WebElement close = driver.findElement(By.xpath("//p[@class=\"closeBtn\"]"));
		close.click();

		Actions fans = new Actions(driver);

		WebElement hoverfan = driver.findElement(By.linkText("Fans"));

		fans.moveToElement(hoverfan).perform();

		if (driver.findElement(By.xpath("//span[text()='Ceiling Fans ']")).isDisplayed()) {
			System.out.println("Ceiling fan is verified and I am about to click");

		} else {
			System.out.println("Hover Failed");

		}

		driver.findElement(By.xpath("//span[text()='Ceiling Fans ']")).click();
		WebElement smallappliances = driver.findElement(By.xpath("//a[text()='Small Appliances']"));
		fans.moveToElement(smallappliances).perform();
		if(driver.findElement(By.xpath("//a[text()='Small Appliances']")).isDisplayed())
		{
			System.out.println("Small appliances is verified and I am about to click");
		} else {
			System.out.println("Not verified");
		}
		driver.findElement(By.xpath("//span[text()='Induction Cooktop ']")).click();
		
		if(driver.findElement(By.xpath("//a[@class=\"header__heading-link logoimage link link--text focus-inset\"]")).isDisplayed())
		{
			System.out.println("Homepage about to be displayed now");
			
		}else {
			System.out.println("Error in fetching homepage");
		
		}
		driver.findElement(By.xpath("//a[@class=\"header__heading-link logoimage link link--text focus-inset\"]")).click();
		driver.findElement(By.xpath("//button[@id=\"slick-slide-control00\"]")).click();
		driver.findElement(By.xpath("//img[@src='//shop.orientelectric.com/cdn/shop/files/3200x1000_5e68113a-fad0-4dd9-8ad7-797eb271fbb6.jpg?v=1704715346&width=1500']")).click();
		if(driver.findElement(By.xpath("//p[text()='Storage Water Heaters']")).isDisplayed())
		{
			System.out.println("Header banner is displayed successfully");
		}else {
			System.out.println("There are some error");
		}
		driver.findElement(By.xpath("//a[@class=\"header__heading-link logoimage link link--text focus-inset\"]")).click();

		WebElement category = driver.findElement(By.xpath("//h4[text()='Fans']"));
		category.click();
		if(driver.findElement(By.xpath("//h2[contains(text(),'Shop By Category')]")).isDisplayed())
		{
			System.out.println("Shop By category section is displayed successfully");
		}
		else {
			System.out.println("Error in fetching shop by category");
		}
		driver.navigate().back();
		WebElement getstarted = driver.findElement(By.xpath("//a[@class=\"button quiz__button button--primary\"]"));
		fans.moveToElement(getstarted, 10, 20).build().perform();
		WebElement Fansguide = driver.findElement(By.xpath("//img[@data-src=\"//shop.orientelectric.com/cdn/shop/files/Group_221701_small.png?v=1676269615\"]"));
		Fansguide.click();
		Thread.sleep(2000);
		driver.get("https://shop.orientelectric.com/pages/buying-guide-fans");
		String fansguide = driver.getTitle();
		System.out.println(fansguide);
		driver.findElement(By.xpath("(//img[@class='header__heading-logo'])[2]")).click();

//		driver.findElement(By.xpath("//a[@class=\"header__heading-link logoimage link link--text focus-inset\"]")).click();
//		WebElement AIrcoolinguide = driver.findElement(By.xpath("//a[@href=\"/pages/air-coolers-buying-guide\"][1]"));
//		fans.moveToElement(AIrcoolinguide, 10,20).build().perform();
//		AIrcoolinguide.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)");
		WebElement Limited = driver.findElement(By.xpath("(//div[@class='card-wrapper product-card-wrapper'])[7]"));
		//fans.moveToElement(Limited, 10, 20).build().perform();
		Limited.click();
		WebElement pincode = driver.findElement(By.xpath("//input[@id=\"pincodeInput\"]"));
		pincode.sendKeys("560012");
		WebElement submit = driver.findElement(By.xpath("//button[@class=\"pincode-bar__submit submit_button button\"]"));
		submit.click();
		WebElement buynow = driver.findElement(By.xpath("//span[text()='Buy Now']"));
		buynow.click();
		Thread.sleep(2000);
		WebElement checkout = driver.findElement(By.xpath("//a[@class='button button_primary button--primary']"));
		checkout.click();
		Thread.sleep(2000);
		driver.get("https://shop.orientelectric.com/56851660962/checkouts/65346f9471d4c90daebb989fd37af613");
		String checkoutinfo = driver.getTitle();
		System.out.println(checkoutinfo);
		driver.findElement(By.xpath("//span[text()='Continue to payment']")).click();
		driver.findElement(By.xpath("//span[text()='Complete order'][1]")).click();
		
		
		
		
		
		
		
		
		
		
		
//		if(driver.findElement(By.xpath("//img[@data-src=\"//shop.orientelectric.com/cdn/shop/files/Group_221702_small.png?v=1676269810\"]")).isDisplayed())
//		{
//			System.out.println("Air cooler guide is displayed");
//		}
//		else {
//			System.out.println("Error in fetching air cooler guide");
//			}
		
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].scrollIntoview();", Fansguide);


		
		
//	WebElement submenufans = driver.findElement(By.xpath("//a[@href=\"/collections/ceiling-fans\"]"));
//	fans.moveToElement(submenufans).perform();
//	submenufans.click();
		// driver.switchTo();

//	try {	
//	WebElement button = 	driver.findElement(By.xpath("//img[@class=\"header__heading-logo\"]"));
//	button.click();
//	}
//	catch (org.openqa.selenium.StaleElementReferenceException) {
//	
//	WebElement button1 = driver.findElement(By.xpath("//a[@class=\"header__heading-link logoimage link link--text focus-inset\"]"));
//	button1.click();}

//	WebElement Fans = 	driver.findElement(By.linkText("Fans"));
//	Actions action = new Actions(driver);
//	action.moveToElement(Fans);*/
	}
}
