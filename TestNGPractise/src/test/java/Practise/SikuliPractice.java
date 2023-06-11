package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.sikuli.script.FindFailed;
//import org.sikuli.script.Pattern;
//import org.sikuli.script.Screen;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SikuliPractice {



	@Test
	public void test() throws InterruptedException
	{
		
		
		WebDriver driver;
		
		

		WebDriverManager.chromedriver().setup();
		
	

		driver  = new ChromeDriver();
		
		System.out.println("Hello Google2");
		

		driver.get("https://www.leafground.com/file.xhtml");
		
		
	

		WebElement filebtn =  driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt89\"]/span[1]"));

		filebtn.click();
		
//		String imageFilepath = "Users/localuser/Desktop/";
//		
//		String inputFilepath = "Users/localuser/Desktop/";
//		
//		Screen s = new Screen();
//		
//		Pattern Selectfilebtn = new Pattern(imageFilepath+"FileSearchBox.png"); 
//		
//		Pattern openbtn = new Pattern(imageFilepath+"OpenBtn.png");
//		
//		Thread.sleep(2000);
//		
//		s.wait(Selectfilebtn, 20);
//		
//		s.type(Selectfilebtn, inputFilepath+"ZscallerExceptionScreenshot.png");
//		
//		s.click(openbtn);
		
		

		




	}

}
