package PageObjects;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class MyAccountPage extends BasePage{
	
	public MyAccountPage(WebDriver driver) {
		super(driver);

}
@FindBy(xpath="//h2[text()='My Account']")  // MyAccount Page heading
WebElement headingMsg;

@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Logout']")
WebElement lnkLogout;


//Action
public boolean isMyAccountPageExists()     // MyAccount Page heading display status

{
	try
	{
	return(headingMsg.isDisplayed());
	}
	catch(Exception e)
	{
		return (false);
	}
}

public void clickLogout() {
	lnkLogout.click();

}
	
}