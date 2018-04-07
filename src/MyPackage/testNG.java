package MyPackage;

import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNG {
	@AfterMethod
	public void test_After()
	{
		System.out.println("tast_After");
	}
	@BeforeMethod
	public void test_Before()
	{
		System.out.println("tast_Before");
	}
	@Test(priority=1)
	public void test_a()
	{
		System.out.println("tast_a");
		Assert.assertEquals(true, true);
	}
	@Test(priority=3)
	public void test_b()
	{
		System.out.println("tast_b");
		Assert.assertEquals(true, true);
	}
	@Test(dependsOnMethods= {"test_b","test_a"})
	public void test_A()
	{
		System.out.println("tast_A");
		Assert.assertEquals(true, false);
	}

}
