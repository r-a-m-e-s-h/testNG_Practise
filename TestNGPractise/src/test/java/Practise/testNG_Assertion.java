package Practise;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class testNG_Assertion {
	
	@Test
	public void test1()
	{
		String one = "HGello";
		
		String two = "twoooo";
				
		//Assert.assertNotEquals(one, two);
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(one, two);
		
		System.out.println(" soft Assert checked");
		
	}

}
