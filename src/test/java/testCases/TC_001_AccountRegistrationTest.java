package testCases;



import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.AccountRegisterPage;
import PageObjects.HomePage;
import testBase.BaseClass;

public class TC_001_AccountRegistrationTest extends BaseClass {
	@Test(groups= {"Regression","Master"})
	public void test_account_Registration()
	{
		logger.debug("application logs......");
		logger.info("***  Starting TC_001_AccountRegistrationTest ***");
		try
		{
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		logger.info("Clicked on My account link");
		hp.clickRegister();
		logger.info("Clicked on Register link");
		AccountRegisterPage reg=new AccountRegisterPage(driver);
		logger.info("Providing customer data");
		reg.setFirstName(randomeString().toUpperCase());		
		reg.setLastName(randomeString().toUpperCase());
		reg.setEmail(randomeString()+"@gmail.com");		
		String password=randomeNumber();
		reg.setPassword(password);	
		reg.setPrivacyPolicy();		
		reg.clickContinue();
		logger.info("Clicked on continue");				
		String confirmMessage=reg.getConfirmationMsg();
		logger.info("Clicked on continue");
		Assert.assertEquals(confirmMessage,"Your Account Has Been Created!");
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		logger.info("***  Finished TC_001_AccountRegistrationTest ***");
	}
}
