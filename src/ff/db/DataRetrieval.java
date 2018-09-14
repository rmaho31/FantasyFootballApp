package ff.db;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DataRetrieval {
	
	public static void main(String[] args) {
		retrievePlayerInfo();
	}
	
	public static void retrievePlayerInfo() {
		// declaration and instantiation of objects/variables
		System.setProperty("webdriver.chrome.driver", "F:/Python_Workspace/TestScraper/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
        String baseUrl = "http://google.com";

        // launch Chrome and direct it to the Base URL
        driver.get(baseUrl);
        
        driver.manage().window().maximize();

	}
}
