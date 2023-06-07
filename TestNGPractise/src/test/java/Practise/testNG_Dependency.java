package Practise;

import org.testng.annotations.Test;

public class testNG_Dependency {
	
	
	@Test(enabled=false)
	public void highSchool()
	{

		System.out.println("High school");
	}

	@Test(dependsOnMethods = "highSchool")
	public void higherSecondary()
	{
		System.out.println("Hgher secondary ");

	}
	
	@Test(dependsOnMethods = "higherSecondary")
	public void collage()
	{

		System.out.println("collge ");
	}

}
