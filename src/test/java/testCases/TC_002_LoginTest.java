package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC_002_LoginTest extends BaseClass {
	
	@Test(groups= {"Sanity","Master"})
	public void ltest_Login()
	{
		logger.info("***  Starting TC_002_LoginTest ***");
		try {
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		LoginPage lp=new LoginPage(driver);
		lp.setEmail(rb.getString("email"));
		lp.setPassword(rb.getString("password"));
		lp.clickLogin();
		MyAccountPage map= new MyAccountPage(driver);
		boolean targetpage=map.isMyAccountPageExists();
		Assert.assertEquals(targetpage, true);
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		logger.info(" Finished TC_002_LoginTest");
		
		
	}

}
