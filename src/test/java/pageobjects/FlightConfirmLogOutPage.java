package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FlightConfirmLogOutPage {
	public WebDriver driver;

	@FindBy(how = How.XPATH, using = "(//a[contains(@href, 'mercurysignoff.php')])")
	@CacheLookup
	WebElement SignOff;

	public FlightConfirmLogOutPage(WebDriver driver){
		this.driver = driver;
		//This initElements method will create  all WebElements
		PageFactory.initElements(driver, this);
	}
/*
	public void clickSignOff()
	{
		SignOff.click();
	}*/
	public void BrowserClose()
	{
		driver.quit();
		driver.close();

	}
}
