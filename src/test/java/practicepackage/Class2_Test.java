package practicepackage;

import org.testng.annotations.Test;

public class Class2_Test {
	@Test(groups = {"regressiontest","smoketest"})
	public void Test3()
	{
		System.out.println("----Test3-----");
	}
	@Test(groups = "smoketest")
	public void Test2()
	{
		System.out.println("----Test4-----");
	}
}
