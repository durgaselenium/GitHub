package demo.github;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GithubDemo {

	public static void main(String[] args) {
	
	System.out.println("Welcome to GithubWorld");	
		
	File file = new File("./Drivers/chromedriver.exe");
	System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	System.out.println(driver.getTitle());
	
	driver.quit();
		
		
	}

}
