package Pages;

import org.openqa.selenium.By;

public class SigninPage extends BasePage{

    // ----- input field locators
    public By emailField = By.xpath("//input[@id='email']");
    public By passwordField = By.xpath("//input[@id='password']");

    // -- button and checkbox
    public By signinButton = By.xpath("//button[@type='submit']");
    public By checkBox = By.xpath("//input[@id='remember-me']");
    public By eyeButton = By.xpath("(//*[name()='svg'][@class='svg-inline--fa fa-eye-slash cursor-pointer'])[1]");
    public By forgetPassword = By.xpath("//button[normalize-space()='Forgot Password?']");
    public By closeButton = By.className("btn-close");
//    public By createAccount = By.xpath("//button[text()='Create an Account']");
    public By createAccount = By.cssSelector(".login.text-decoration-none.text-clr-red.bg-transparent.border-0");
    public By facebookButton = By.xpath("//div[normalize-space()='Facebook']");
    public By googleButton = By.xpath("//span[normalize-space()='Google']");


    // --- error messages
    public By emailErrorMgs = By.xpath("//input[@name='email']/following-sibling::div[@class='invalid-feedback']");
    public By passwordErrorMgs = By.xpath("//input[@name='password']/following-sibling::div[@class='invalid-feedback']");

    public By signInFailedErrorMgs = By.xpath("//div[starts-with(@class,'form-check')]/following-sibling::p[starts-with(@class,'text-danger')]");
//        public By signInFailedErrorMgs = By.xpath("(//p[@class='text-danger fs-14 fw-bold '])[1]");
    // --- labels
    public By checkBoxLabel = By.xpath("//label[normalize-space()='Remember me']");
 //   public By maskPassword = By.xpath("(//*[name()='svg'][@class='svg-inline--fa fa-eye cursor-pointer'])[1]");

    public By pageTitle = By.xpath("//h3[normalize-space()='Sign In']");
    public By passwordAsterisk = By.cssSelector("div[class='password form-group mb-4'] span[class='text-danger']");
    public By emailAsterisk = By.cssSelector("label[for='email'] span[class='text-danger']");
    public By emailFieldLabel = By.xpath("//label[@for='email']");
    public By passwordFieldLabel = By.cssSelector("div[class='password form-group mb-4'] label[class='form-label fs-18 text-clr-purple-light fw-normal']");


}
