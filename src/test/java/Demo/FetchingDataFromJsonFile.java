//package Demo;
//
//
//public class FetchingDataFromJsonFile {
//
//	public static void main(String[] args) throws Throwable {
//		
//		File file = new File("./src/test/resources/VTiger.json");
//		
////		ObjectMapper obj	=  new   ObjectMapper();
////		
////			JsonNode data = obj.readTree(file);
////			
////		String BROWSER = data.get("browser").asText();
////		
////		String URL = data.get("url").asText();
////
////		String USERNAME =data.get("username").asText();
////		
////		String PASSWORD =data.get("password").asText();
////		
////		WebDriver driver;
////
////		if (BROWSER.equalsIgnoreCase("chrome")) {
////			driver = new ChromeDriver();
////		} else if (BROWSER.equalsIgnoreCase("firefox")) {
////			driver = new FirefoxDriver();
////		} else if (BROWSER.equalsIgnoreCase("edge")) {
////			driver = new EdgeDriver();
////		} else {
////			driver = new ChromeDriver();
////		}
////		
////		driver.get(URL);		
////		driver.findElement(By.name("user_name")).sendKeys(USERNAME);
////		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
////		driver.findElement(By.id("submitButton")).click();
////		
//		
//	}
//
//}
