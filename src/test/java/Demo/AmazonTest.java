package Demo;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonTest {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.name("q")).sendKeys("iphones");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
				
		
        WebElement priceFilter = driver.findElement(By.xpath("//span[text()='₹50,000 – ₹70,000']"));
        priceFilter.click();

        // Wait for the filtered results to load
        Thread.sleep(3000);

        // Get the list of iPhones and their prices
        List<WebElement> iphoneNames = driver.findElements(By.cssSelector("span.a-size-medium.a-color-base.a-text-normal"));
        List<WebElement> iphonePrices = driver.findElements(By.cssSelector("span.a-price-whole"));

        // Print the names and prices of iPhones under ₹70,000
        System.out.println("iPhones under ₹70,000:");
        for (int i = 0; i < iphoneNames.size() && i < iphonePrices.size(); i++) {
            String name = iphoneNames.get(i).getText();
            String price = iphonePrices.get(i).getText().replace(",", ""); // Remove commas from the price
            int priceValue = Integer.parseInt(price);

            if (priceValue < 70000) {
                System.out.println("Name: " + name + ", Price: ₹" + priceValue);
            }
		
		
		
		
         }
     
		
		
	}
	
		
		


}
