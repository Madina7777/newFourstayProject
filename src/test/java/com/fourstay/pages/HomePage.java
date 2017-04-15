package com.fourstay.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fourstay.utilities.Driver;
import com.fourstay.utilities.Page;

public class HomePage {
	// page object class
	// it holds all the web elements ad the main actions from that page
	private WebDriver driver;

	public HomePage() {
		this.driver = Driver.getInstance();
		PageFactory.initElements(driver, this);
	}

	// @FindBy annotation locates the elements by the locators provide in the
	// paranthesis

	// css, id, name, tagName, className, linktext, partialLinkTest, xpath
	@FindBy(css = "li[data-target='#modal-login']")
	public WebElement loginLink;

	@FindBy(id = "email")
	public WebElement email;

	@FindBy(id = "key")
	public WebElement password;

	@FindBy(id = "btn-login")
	public WebElement loginBtn;

	@FindBy(css = "a.btn-facebook")
	public WebElement facebookSignIn;

	@FindBy(css = "a.btn-google-plus")
	public WebElement googleSignIn;

	@FindBy(css = "li[data-target='#modal-signup']")
	public WebElement signUplink;

	@FindBy(id = "FirstName")
	public WebElement firstName;

	@FindBy(id = "LastName")
	public WebElement lastName;

	@FindBy(css = "#modal-signup #email")
	public WebElement emailSignUp;

	@FindBy(css = "#modal-signup #key")
	public WebElement passwordSignUp;
	
	@FindBy(id = "btn-signup")
	public WebElement signUp;
	
	@FindBy (id = "guest")
	public WebElement guestRbt;

	// public WebElement getEmail(){
	// if (login dialog is open)
	// return find element by id1
	// else
	// retur find element id2
	// }

	// *[@id='model-signup']//*[@id='email']
	public void login(String userName, String userPassword) {
		loginLink.click();
		email.sendKeys(userName);
		Page.sleep(1000);
		password.sendKeys(userPassword);
		Page.sleep(1000);
		loginBtn.click();
		Page.sleep(1000);
	}
}
