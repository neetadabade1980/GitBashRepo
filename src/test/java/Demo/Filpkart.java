package Demo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Filpkart {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.amazon.in");
		
		driver.findElement(By.name("q")).sendKeys("iphones");
		
		driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();
		
		List<WebElement> List	=driver.findElements(By.xpath("//div[text()='₹64,400']"));
		
		for (int i = 0; i < List.size(); i++) {
			
								
			System.out.println(List.get(i).getText());
			
			}
		
		//<div class="Nx9bqj _4b5DiR">₹64,400</div>
		

	}
		
	}


