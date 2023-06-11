package Practise;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class calendarPractise {
	
	
	@Test
	public void calendar() throws InterruptedException, AWTException, IOException
	{
		
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
		driver.get("https://phptravels.net/");
		
		String month = "March 2024";
		String day = "21";
		
		
		WebElement cal = driver.findElement(By.xpath("//*[@id=\"departure\"]"));
		cal.click();
		
		
		while(true)
		{
			String dateShown = driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[8]/div[1]/table/thead/tr[1]/th[2]")).getText();
			
			if(dateShown.equals(month))
			{
				break;
			}
			else
			{
				WebElement nxt_btn = driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[8]/div[1]/table/thead/tr[1]/th[3]"));
				nxt_btn.click();
				
			}
		}
		
		WebElement desired_date = driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[8]/div[1]/table/tbody/tr/td[contains(text(),"+day+")]"));
		desired_date.click();
		
		TakesScreenshot screenShot = (TakesScreenshot)driver;
		File src = screenShot.getScreenshotAs(OutputType.FILE);
		File dest = new File("/Users/localuser/Desktop/SampleScreenshot.png");
		FileUtils.copyFile(src, dest);
		
			
		System.out.println("The page title is : "+ driver.getTitle());
		
		
		driver.quit();
		
		
	}

}
