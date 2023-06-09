package Practise;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testNG_parameters {
	
	
	@Test
	@Parameters({"Name" , "Job", "Address"})
	
	public void params(String value,String job,String address)
	{
		System.out.println("The name is :"+value);
		System.out.println("The job is : "+job);
		System.out.println("The Adress is : "+address);
		
	}

}
