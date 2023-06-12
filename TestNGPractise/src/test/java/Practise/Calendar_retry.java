package Practise;

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

public class Calendar_retry {



	@Test
	public void test() throws IOException {

		String month = "April 2025";

		String day = "21";

		WebDriver driver;

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://phptravels.net/");

		WebElement date_btn = driver.findElement(By.xpath("//*[@id=\"departure\"]"));
		date_btn.click();


		while(true)
		{
			WebElement text = driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[8]/div[1]/table/thead/tr[1]/th[2]"));
			String shownTxt = text.getText();
			
			if (shownTxt.equals(month))
			{
				
				break;
				
			}
			else {
				
					WebElement nxt_btn = driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[8]/div[1]/table/thead/tr[1]/th[3]"));
					nxt_btn.click();
				}

		}
		
		WebElement desired_date = driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[8]/div[1]/table/tbody/tr/td[contains(text(),'21')]"));
		desired_date.click();
		
		
		TakesScreenshot ss = (TakesScreenshot)driver;
		
		File src = ss.getScreenshotAs(OutputType.FILE);
		File dest = new File("/Users/localuser/Desktop/SampleScreenshot1.png");
		FileUtils.copyFile(src, dest);
		
		


	}

}
