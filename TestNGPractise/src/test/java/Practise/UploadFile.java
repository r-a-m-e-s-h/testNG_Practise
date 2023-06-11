package Practise;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadFile {



	@Test
	public void upload() throws AWTException, InterruptedException
	{

		WebDriver driver;

		WebDriverManager.edgedriver().setup();
		
		driver = new  EdgeDriver();
		
		driver.manage().window().maximize();

		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.leafground.com/file.xhtml");
		

		Thread.sleep(2000);
		
		WebElement filebtn =  driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt89\"]/span[1]"));
		
		filebtn.click();
		
		
		
		Thread.sleep(2000);
		
		String filepath = "/Users/localuser/Desktop/FileSearchBox.png";
		
		
		
		StringSelection selection  =  new StringSelection(filepath);
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		
		Robot robot = new Robot();
		
//		robot.keyPress(KeyEvent.VK_META);
//		
//		robot.keyPress(KeyEvent.VK_TAB);
//
//		robot.keyRelease(KeyEvent.VK_META);
//
//		robot.keyRelease(KeyEvent.VK_TAB);
//
//		robot.delay(500);
//		
//		//Open Goto window
//
//		robot.keyPress(KeyEvent.VK_META);
//
//		robot.keyPress(KeyEvent.VK_SHIFT);
//
//		robot.keyPress(KeyEvent.VK_G);
//
//		robot.keyRelease(KeyEvent.VK_META);
//
//		robot.keyRelease(KeyEvent.VK_SHIFT);
//
//		robot.keyRelease(KeyEvent.VK_G);
//
//		//Paste the clipboards value
//
//		robot.keyPress(KeyEvent.VK_META);
//
//		robot.keyPress(KeyEvent.VK_V);
//
//		robot.keyRelease(KeyEvent.VK_META);
//
//		robot.keyRelease(KeyEvent.VK_V);
//		
//		//Press Enter key to close the Goto window and Upload window
//
//		robot.keyPress(KeyEvent.VK_ENTER);
//
//		robot.keyRelease(KeyEvent.VK_ENTER);
//
//		robot.delay(500);
//
//		robot.keyPress(KeyEvent.VK_ENTER);
//
//		robot.keyRelease(KeyEvent.VK_ENTER);
		
	
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(5000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
		
//		
		
		//driver.quit();
		
		


	}





}
