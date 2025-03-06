package Pages;

import org.openqa.selenium.By;

public class SigninPage extends BasePage{

    // locators
    public By emailField = By.xpath("//input[@id='email']");
    public By passwordField = By.xpath("//input[@id='password']");
    public By signinButton = By.xpath("//button[@type='submit']");
    public By checkBox = By.xpath("//input[@id='remember-me']");
    public By checkBoxLabel = By.xpath("//label[normalize-space()='Remember me']");
 //   public By maskPassword = By.xpath("(//*[name()='svg'][@class='svg-inline--fa fa-eye cursor-pointer'])[1]");
    public By errorMgs = By.xpath("//p[@class='text-danger fs-14 fw-bold ']");
    public By pageTitle = By.xpath("//h3[normalize-space()='Sign In']");
    public By passwordAstesirk = By.cssSelector("div[class='password form-group mb-4'] span[class='text-danger']");
    public By emailAsterisk = By.cssSelector("label[for='email'] span[class='text-danger']");

    public By eyeButton = By.xpath("(//*[name()='svg'][@class='svg-inline--fa fa-eye-slash cursor-pointer'])[1]");
    public By forgetPassword = By.xpath("//button[normalize-space()='Forgot Password?']");
    public By passwordErrorMgs = By.cssSelector("div[id='show_hide_password'] div div[class='invalid-feedback']");
    public By emailErrorMgs = By.cssSelector("div[class='mb-4 '] div div[class='invalid-feedback']");
    public By signInFailErrorMgs = By.xpath("(//p[@class='text-danger fs-14 fw-bold '])[1]");
    public By emailFieldLabel = By.xpath("//label[@for='email']");
    public By passwordFieldLabel = By.cssSelector("div[class='password form-group mb-4'] label[class='form-label fs-18 text-clr-purple-light fw-normal']");
    public By closeButton = By.className("btn-close");
    public By createAccount = By.xpath("//button[normalize-space()='Create an Account']");
    public By facebookButton = By.xpath("//div[normalize-space()='Facebook']");
    public By googleButton = By.xpath("//span[normalize-space()='Google']");

}
