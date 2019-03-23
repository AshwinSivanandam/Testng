package basics;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Main2 {
	
	@Test(groups="fsm")
	public void f()
	{
		Reporter.log("f() of Main2", true);
	}
	
	@Test(groups="re")
	public void g()
	{
		Reporter.log("g() of Main2", true);
	}
	
	@Test(groups= {"hsm","re"})
	public void h()
	{
		Reporter.log("h() of Main2", true);
	}
	
	@Test(groups= {"ism","re"})
	public void i()
	{
		Reporter.log("i() of Main2", true);
	}
	
	@Test(groups="re")
	public void j()
	{
		Reporter.log("j() of Main2", true);
	}

}
