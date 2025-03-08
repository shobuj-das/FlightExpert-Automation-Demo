package Pages;

import org.openqa.selenium.By;

public class SignupPage extends BasePage {

    // -----  input field
    public By firstNameField = By.xpath("//input[@id='first_name']");
    public By lastNameField = By.xpath("//input[@id='last_name']");
    public By emailField = By.xpath("//input[@id='email']");
    public By phoneNumberField = By.xpath("//input[@placeholder='Phone Number*']");
    public By passwordField = By.xpath("//input[@id='password']");
    public By confirmPasswordField = By.xpath("//input[@id='confirmedPassword']");

    // ------- input field label
    public By firstNameLabel= By.xpath("//label[@for='first_name']");
    public By lastNameLabel= By.xpath("//label[@for='last_name']");
    public By emailLabel= By.xpath("//label[@for='email' and @xpath='1']");
    public By phoneNumberLabel= By.xpath("(//label[@for='email'])[2]");
    public By passwordLabel= By.xpath("//div/label[text()='Password ']");
    public By confirmPasswordLabel= By.xpath("//div/label[text()='Confirm Password']");

    // ------ button locators
    public By signupButton = By.xpath("//button[@type='submit']");
    public By loginButton = By.xpath("//button[normalize-space()='Login']");
    public By closeButton = By.xpath("//button[@aria-label='Close']");
    public By passwordEyeIcon = By.cssSelector("div[id='show_hide_password'] div[class='pass-show-hide position-absolute top-4 right-4'] svg path");
    public By confirmPasswordEyeIcon = By.cssSelector("div[id='show_hide_password2'] div[class='pass-show-hide position-absolute top-4 right-4'] svg");

    // ------ Error Messages locators
    public By firstNameErrorMgs = By.xpath("//div[@class='invalid-feedback']/preceding-sibling::input[@name='first_name']");
    public By lastNameErrorMgs = By.xpath("//div[@class='invalid-feedback']/preceding-sibling::input[@name='last_name']");
    public By emailErrorMgs = By.xpath("//div[@class='invalid-feedback']/preceding-sibling::input[@name='email']");
    public By passwordErrorMgs = By.xpath("//div[@class='invalid-feedback']/preceding-sibling::input[@name='password']");
    public By confirmPasswordErrorMgs = By.xpath("//div[@class='invalid-feedback']/preceding-sibling::input[@name='confirmPassword']");
//    public By mobileNumberErrorMgs =


    // ------ Text
    public By signupPageTitle = By.xpath("//h3[normalize-space()='Sign up']");
    public By alreadyHaveAccText = By.className("have-acc text-clr-gray fs-6 fw-normal text-center mb-0");



}
