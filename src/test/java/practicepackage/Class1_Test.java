package practicepackage;

import org.testng.annotations.Test;

public class Class1_Test {
    @Test(groups = "smoketest")
	public void Test1()
	{
		System.out.println("----Test1-----");
	}
    @Test(groups = "regressiontest")
	public void Test2()
	{
		System.out.println("----Test2-----");
	}
}
