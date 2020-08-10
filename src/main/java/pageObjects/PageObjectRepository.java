package pageObjects;


import java.io.IOException;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class PageObjectRepository extends BasePage{
	
	
	
	
	
	
	public PageObjectRepository() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	@FindBy(id="registerLink")
	private WebElement registerLink;
	
	@FindBy(xpath ="//button[span[span[contains(text(), 'Proceed as Vendor')]]]")
	WebElement proceedAsVendorButton;
	
	@FindBy(xpath = "//h2[contains(text(), 'Welcome to Marketcube.io')]")
	WebElement registerPageHeader;
	
	@FindBy(xpath = "//label[contains(text(), 'Email')]")
	WebElement emailLabel;
	
	@FindBy(xpath = "//label[text()='Password']")
	WebElement passwordLabel;
	
	@FindBy(xpath = "//label[text()='Confirm Password']")
	WebElement confirmPasswordLabel;
	
	@FindBy(id = "registerButton")
	WebElement registerButton;
	
	@FindBy(id = "emailError")
	WebElement emailErrorMessage;
	
	@FindBy(id = "password")
	WebElement passwordEditbox;

	@FindBy(id = "confirmPassword")
	WebElement confirmPasswordEditbox;
	
	@FindBy(id = "passwordError")
	WebElement passwordErrorMessage;
	
	@FindBy(id = "confirmPasswordError")
	WebElement confirmPasswordErrorMessage;
	
	@FindBy(id = "email")
	WebElement emailEditbox;
	
	@FindBy(xpath = "//p[contains(text() , 'Please accept policy and terms of use to register')]")
	WebElement policyAndTermsWarningMessage;
	
	@FindBy(id = "agreeCheckbox")
	WebElement policyAndTermsAgreeCheckbox;
	
	@FindBy(xpath = "//h2[contains(text(), 'Log in to your MarketCube Dashboard')]")
	WebElement loginPageHeader;

	@FindBy(id = "identifierId")
	WebElement gmailUsernameEditBox;
	
	@FindBy(xpath ="//button[span[contains(text(), 'Next')]]")
	WebElement gmailNextButton;
	
	@FindBy(name = "password")
	WebElement gmailPasswordEditBox;
	
	@FindBy(xpath ="//span[span[contains(text(),'More')]]")
	WebElement gmailMoreOption;
	
	@FindBy(xpath = "//a[contains(text(), 'Spam')]")
	WebElement gmailSpamOption;
	
	@FindBy(xpath = "//div[span[span[@name='Marketplace']]]")
	WebElement gmailMarketPlaceMail;
	
	@FindBy(xpath = "//a[contains(text(),'Verify Email')]")
	WebElement gmailVerifyEmail;
	
	@FindBy(xpath = "//button[span[span[contains(text(),'Login')]]]")
	WebElement loginButton;
	
	@FindBy(xpath = "//h1[contains(text(),'Good Day')]")
	WebElement homePageHeader;	
	
	
	
	public void gotoProceed() throws InterruptedException, IOException {
		waitAndClickElement(registerLink);
		waitAndClickElement(proceedAsVendorButton);
		
	}
	
	public String getTextOfregisterPageHeader() {		
		return getText(registerPageHeader);
	}
	public String getTextOfEmailError() {
		
		return getText(emailErrorMessage);
	}
	public String getTextOfPasswordError() {
		return getText(passwordErrorMessage);
	}
	public String getTextOConfirmPasswordError() {
		return getText(confirmPasswordErrorMessage);
	}
	public String getTextOfemailLabel() {
		return getText(emailLabel);
	}
	public String getTextOfpasswordLabel() {
		return getText(passwordLabel);
	}
	public String getTextOfconfirmPasswordLabel() {
		return getText(confirmPasswordLabel);
	}
	public void clickRegisterButton() throws InterruptedException, IOException {
		waitAndClickElement(registerButton);
	}
	
	public void mandatoryValidationForRegistration() throws InterruptedException, IOException {
		waitAndClickElement(emailEditbox);
		waitAndClickElement(registerButton);
		waitAndClickElement(passwordEditbox);
		waitAndClickElement(registerButton);
		waitAndClickElement(confirmPasswordEditbox);
		waitAndClickElement(registerButton);
	}
	public void registerWithData(String email, String pwd) throws Exception {
		sendKeysToWebElement(emailEditbox, email);		
		sendKeysToWebElement(passwordEditbox, pwd);
		sendKeysToWebElement(confirmPasswordEditbox, pwd);
		waitAndClickElement(policyAndTermsAgreeCheckbox);
		waitAndClickElement(registerButton);		
	}
	/*public boolean isPolicyDisplayed() {
		return commonUtils.isElementDisplayed(policyAndTermsWarningMessage);
		
	}*/
	public void checkAcceptPolicyAndClickRegister() throws InterruptedException, IOException {
		waitAndClickElement(policyAndTermsAgreeCheckbox);
		waitAndClickElement(registerButton);
	}
//	public String getTextOfDashboard() {
//		commonUtils.waitForElementInVisible(loginPageHeader);
//		return commonUtils.getText(loginPageHeader);		
//	}
	public void loginToGmail(String email, String pwd) throws Exception {
		sendKeysToWebElement(gmailUsernameEditBox, email);
		waitAndClickElement(gmailNextButton);
		Thread.sleep(5000);
		sendKeysToWebElement(gmailPasswordEditBox, pwd);
		waitAndClickElement(gmailNextButton);
	}
	public void verifymail() throws InterruptedException, IOException {
		Thread.sleep(5000);
		waitAndClickElement(gmailMoreOption);
		Thread.sleep(5000);
		waitAndClickElement(gmailSpamOption);
		Thread.sleep(5000);
		waitAndClickElement(gmailMarketPlaceMail);
		Thread.sleep(5000);
		waitAndClickElement(gmailVerifyEmail);
		Thread.sleep(5000);
		
	}
	public void loginToApplication(String email, String pwd) throws Exception{
		sendKeysToWebElement(emailEditbox, email);
		sendKeysToWebElement(passwordEditbox, pwd);
		waitAndClickElement(loginButton);
		}
    public String getTextOfHome() {
	
		return getText(homePageHeader);		
	}
}
