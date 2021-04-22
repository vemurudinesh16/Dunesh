package dinesh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Icici {
	
	
	public WebDriver driver;
	
	public void openurl() {			
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vemurn\\Downloads\\new testing files\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.icicibank.com/Personal-Banking/insta-banking/internet-banking/index.page");
	}
	
	
	

	public static void main(String[] args) {
		
		Icici result = new Icici();
		result.openurl();

	}

}
