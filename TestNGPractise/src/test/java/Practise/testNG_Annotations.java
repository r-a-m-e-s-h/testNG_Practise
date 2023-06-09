package Practise;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNG_Annotations {
	
	
	
	@BeforeSuite
	public void one()
	{
		System.out.println(" Im the 1st ");
	}
	@BeforeTest
	public void two()
	{
		System.out.println(" Im the 2nd ");
	}
	@BeforeClass
	public void three()
	{
		System.out.println(" Im the 3rd ");
	}
	@BeforeMethod
	public void four()
	{
		System.out.println(" Im the 4th ");
	}
	@Test
	public void five()
	{
		System.out.println(" im the 5th ");
	}
	@AfterMethod
	public void six()
	{
		System.out.println(" Im the 6th ");
	}
	@AfterClass
	public void Seven()
	{
		System.out.println(" Im the 7th ");
	}
	@AfterTest
	public void eight()
	{
		System.out.println(" Im the 8th ");
	}
	@AfterSuite
	public void nine()
	{
		System.out.println(" Im the 9th ");
	}
	
	
	
	

}
