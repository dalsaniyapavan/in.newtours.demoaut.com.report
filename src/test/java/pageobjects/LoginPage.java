package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class LoginPage {
	public WebDriver driver;

	//page #52 from rana's pdf
	@FindBy(how = How.NAME, using = "userName")
	@CacheLookup
	WebElement userName;

	@FindBy(name="password")
	WebElement password;

	@FindBy(name="login")
	WebElement login;

	public LoginPage(WebDriver driver){
		this.driver = driver;
		//This initElements method will create  all WebElements
		PageFactory.initElements(driver, this);
	}
	
	public void setUserName (String strUserName)
	{
		//System.out.println("Call LOGIN PAGE:"+ strUserName);
		userName.sendKeys(strUserName);
	}
	public void setPassword(String strPassword)
	{
		password.sendKeys(strPassword);
	}
	public void clickLogin()
	{
		login.click();
	}
	/*private static ExtentReports reports;

	String Current_dir = System.getProperty("user.dir");
	//System.out.println(Current_dir);
	reports = new ExtentReports(Current_dir+"\\Extent_Reports\\Testresults.html",true);

	//Declare Start test name
	ExtentTest test = reports.startTest("Verify Home page"); 
	test.log(LogStatus.PASS,"Browser is open and window is Maximimzed.");
	reports.endTest(test); 
*/
}
