package Generic_Utilities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class BaseClass {

	public WebDriver driver;

	
		@BeforeSuite
		public void beforeSuite() {
			System.out.println("DataBase Connection");
		}

		@BeforeTest
		public void beforeTest() {
			System.out.println("Parallel Exceution ");
		}

		
		@BeforeClass
			
		public void beforeClass() throws Throwable {
			
			
		}

//		
		public void beforeMethod() throws Throwable {
			
			
		}

		
		public void afterMethod() {
			
		}

		public void afterClass() {
			
			driver.quit();
			
			System.out.println("close the browser");
		}

		
		public void afterTest() {
			
			System.out.println("close parallel execution");
		}

		

		
		public void afterSuite() {
			
			System.out.println("Close the DataBase");
		}
		
		
		
		
}
