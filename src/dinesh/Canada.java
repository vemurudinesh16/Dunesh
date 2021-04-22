package dinesh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Canada {
	
	public WebDriver driver;
	
	public void openurl() {
		
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vemurn\\Downloads\\new testing files\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/Canada");
	}
	
	

	public static void main(String[] args) {
		Canada result = new Canada();
		result.openurl();
		
	 

	}

}
