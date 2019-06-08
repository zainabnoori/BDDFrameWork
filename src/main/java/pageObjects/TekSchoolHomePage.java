package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class TekSchoolHomePage {

	public TekSchoolHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);

		// @By annotation
		// @FindBy annotation

	}

	@FindBy(how = How.XPATH, using = "(//a[text() = 'login'])[2]")
	private WebElement loginButton;

	@FindBy(how = How.XPATH, using = "(//a[text() = 'test environment']")
	private WebElement testEnvironment;
	@FindBy(how = How.XPATH, using = "(//a[text() = 'My Account']")
	private WebElement myAccount;

	public void clickOnLogin() {
		loginButton.click();
	}

}
