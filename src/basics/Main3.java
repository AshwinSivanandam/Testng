package basics;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Main3 {
	
	@Test(groups="fsm")
	public void k()
	{
		Reporter.log("k() of Main3", true);
	}
	
	@Test(groups="re")
	public void l()
	{
		Reporter.log("l() of Main3", true);
	}
	
	@Test(groups= {"hsm","re"})
	public void m()
	{
		Reporter.log("m() of Main3", true);
	}
	
	@Test(groups= {"ism","re"})
	public void n()
	{
		Reporter.log("n() of Main3", true);
	}
	
	@Test(groups="re")
	public void o()
	{
		Reporter.log("o() of Main3", true);
	}

}
