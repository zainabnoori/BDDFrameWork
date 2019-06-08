package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class testEnvironmentObject {
	public testEnvironmentObject(WebDriver driver) {
		PageFactory.initElements(driver, this);
	
//	•    Create a new class in pageObjects package
//	•    Name the class testEnvironmentObjects
//	•    Get My account webelment
//	•    Get Login webelemnt
//	•    Get Register webelement
//	•    Create three methods to click on Myaccount, Login, and Register
//	•    Then get webelment for email field, password field, and and loging buton
	
	
		// @By annotation
		// @FindBy annotation

	}



	@FindBy(how = How.XPATH, using = "(//a[text() = 'test environment']")
	private WebElement testEnvironment;
	@FindBy(how = How.XPATH, using = "(//a[title() = 'My Account']")
	private WebElement myAccount;
	@FindBy(how = How.XPATH, using = "(//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")
	private WebElement loginButton;
	@FindBy(how = How.XPATH, using = "(//a[text() = 'Register'])[2]")
	private WebElement registerButton;
	
	@FindBy(how = How.XPATH, using = "(//a[text() = 'E-Mail'])")
	private WebElement emailButton;
	@FindBy(how = How.XPATH, using = "(//a[text() = 'Password'])")
	private WebElement passwordButton;



	public void clickOnLogin() {
		loginButton.click();
	}

}
