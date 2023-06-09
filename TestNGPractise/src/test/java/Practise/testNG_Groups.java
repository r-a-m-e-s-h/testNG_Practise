package Practise;

import org.testng.annotations.Test;

public class testNG_Groups {
	
	
	
	@Test(groups = "Lenovo")
	public void Lenovotest1()
	{
		System.out.println(" Lenovo1 testing ");
		
	}
	
	@Test(groups = "Lenovo")
	public void Lenovotest2()
	{
		System.out.println(" Lenovo2 testing ");
		
	}
	
	@Test(groups="Apple")
	public void Appletest1()
	{
		System.out.println(" Appple1 testing ");
		
	}
	@Test(groups="Apple")
	public void Appletest2()
	{
		System.out.println(" Appple2 testing ");
	}
	
	@Test(groups="Nokia")
	public void Nokiatest1()
	{
		System.out.println(" Nokia1 testing ");
	}
	@Test(groups="Nokia")
	public void Nokiatest2()
	{
		System.out.println(" Nokia testing ");
	}


}
