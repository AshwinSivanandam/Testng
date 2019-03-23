package basics;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Main1 {
	
	@Test(groups= {"asm","re"})
	public void a()
	{
		Reporter.log("a() of Main1", true);
	}
	
	@Test(groups="bsm")
	public void b()
	{
		Reporter.log("b() of Main1", true);
	}
	
	@Test(groups="re")
	public void c()
	{
		Reporter.log("c() of Main1", true);
	}
	
	@Test(groups="re")
	public void d()
	{
		Reporter.log("d() of Main1", true);
	}
	
	@Test(groups= {"re","se"})
	public void e()
	{
		Reporter.log("e() of Main1", true);
	}
	
	

}
