package PageObjects;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountRegisterPage extends BasePage {
	
	public AccountRegisterPage(WebDriver driver)
	{
	super(driver);	
	}
	//Elements
	@FindBy(xpath="//input[@id='input-firstname']") 
	WebElement txtFirstname;
	@FindBy(xpath="//input[@id='input-lastname']")
	WebElement txtLastname;
	@FindBy(name = "email")
	WebElement txtEmail;
	@FindBy(xpath="//input[@id='input-password']")
	WebElement txtPassword;
	@FindBy(xpath="//input[@name='agree']")
	WebElement chkdPolicy;
	@FindBy(xpath="//button[text()='Continue']")
	WebElement btnContinue;
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirmation;
	
	//Actions
	
	public void setFirstName(String fname)
	{
		txtFirstname.sendKeys(fname);
	}
	
	public void setLastName(String lname)
	{
		txtLastname.sendKeys(lname);
	}
    
	public void setEmail(String email)
	{
		txtEmail.sendKeys(email);
	}
	
	public void setPassword(String pswd)
	{
		txtPassword.sendKeys(pswd);
	}
	
	//WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(15));
	//mywait.until(ExpectedConditions.elementToBeClickable(chkdPolicy)).click();

	
	public void setPrivacyPolicy() {
		chkdPolicy.click();
	}
	
	public void clickContinue()
	{
		//sol1 
		btnContinue.click();
		
		//sol2 
		//btnContinue.submit();
		
		//sol3
		//Actions act=new Actions(driver);
		//act.moveToElement(btnContinue).click().perform();
					
		//sol4
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("arguments[0].click();", btnContinue);
		
		//Sol5
		//btnContinue.sendKeys(Keys.RETURN);
		
		//Sol6  
		//WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//mywait.until(ExpectedConditions.elementToBeClickable(btnContinue)).click();
	}
	public String getConfirmationMsg()
	{
		try
		{
		return(msgConfirmation.getText());
		}
		catch(Exception e)
		{
		return(e.getMessage());	
		}
	}
	
}

