package Practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testNG_ParallelExecution {
	
	WebDriver driver;
	Long startTime,endTime;
	
	
	@Test
	public void google()
	{
		Long startTime = System.currentTimeMillis();
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		System.out.println(" Google opened ");
		driver.quit();
		
		Long endTime = System.currentTimeMillis();
		Long tot_time = startTime-endTime;
		System.out.println("The Total time taken for Google is : "+tot_time);
		
	}

	@Test
	public void Bing()
	{
		Long startTime = System.currentTimeMillis();
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.bing.com");
		System.out.println(" Bing opened ");
		driver.quit();
		
		Long endTime = System.currentTimeMillis();
		Long tot_time = startTime-endTime;
		System.out.println("The Total time taken for Bing is : "+tot_time);
		
	}

	@Test
	public void Yahoo()
	{
		Long startTime = System.currentTimeMillis();
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.yahoo.com");
		System.out.println(" Yahoo opened ");
		driver.quit();
		
		Long endTime = System.currentTimeMillis();
		Long tot_time = startTime-endTime;
		System.out.println("The Total time taken for Yahoo is : "+tot_time);
		
	}

}
