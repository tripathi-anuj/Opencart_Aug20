package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement txt_Email;
	@FindBy(xpath="//input[@id='input-password']")
	WebElement txt_Password;
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement btn_Login;
	
	//Action
	
	public void setEmail(String email)
	{
		txt_Email.sendKeys(email);
	}
	
	public void setPassword(String pswd)
	{
		txt_Password.sendKeys(pswd);
	}
	
	public void clickLogin()
	{
		btn_Login.click();
	}
}
