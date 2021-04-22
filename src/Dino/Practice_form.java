package Dino;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_form {
	
	public WebDriver driver;
	
	
	public void openurl() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vemurn\\Downloads\\new testing files\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
	}

	public void name() {
		driver.findElement(By.id("firstName")).sendKeys("Dinesh");
		driver.findElement(By.id("lastName")).sendKeys("Naidu");
		
	}
	
	public void email() {
		driver.findElement(By.id("userEmail")).sendKeys("vemurudinesh16@gmail.com");
		
	}
	
	public void gender() {
		driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label")).click();
		
	}
	
	public void mobilenumber() {
		driver.findElement(By.id("userNumber")).sendKeys("9025309666");
		
	}
	
	public void DOB() {
		driver.findElement(By.id("dateOfBirthInput")).click();
		
	}
	
	public void subject() {

		
	}
	
	public void hobbies() {
		
	}
	
	public void picture() {
		
	}
	
	public void currentaddress() {
		
	}
	
	public void stateandcity() {
		
	}
	
	public static void main(String[] args) {
		Practice_form result = new Practice_form();
		result.openurl();
		result.name();
		result.email();
		result.gender();
		result.mobilenumber();
	}
		

	}

