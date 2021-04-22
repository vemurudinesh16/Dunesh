package dinesh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {
	
	public WebDriver driver;
	
	public void openurl() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vemurn\\Downloads\\new testing files\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://gmail.com");

    	
    }
    public void compose() {
    	
    }
    public void logout() {
    	
    }
    
    
	public static void main(String[] args) {
		Gmail result = new Gmail();
		result.openurl();
		

 

	}

}
