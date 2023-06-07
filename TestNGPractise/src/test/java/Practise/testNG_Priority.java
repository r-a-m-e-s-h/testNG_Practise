package Practise;

import org.testng.annotations.Test;

public class testNG_Priority {
	
	
	
	
	@Test(priority = 1)
	public void test1()
	{

		System.out.println("sample1");
	}

	@Test(priority = 2)
	public void test2()
	{
		System.out.println("sample2");

	}
	@Test(priority=0)
	public void test3()
	{

		System.out.println("sample3");
	}

	@Test(priority=-1)
	public void test4()
	{
		System.out.println("sample4");

	}
	@Test(priority=-2)
	public void test5()
	{

		System.out.println("sample5");
	}

	@Test
	public void test6()
	{
		System.out.println("sample6");

	}
	
	
	@Test
	public void alpha()
	{
		System.out.println("hello world");
	}
	
	@Test 
	public void aalpha()
	{
		System.out.println("2nd hello");
	}
	
	

}
