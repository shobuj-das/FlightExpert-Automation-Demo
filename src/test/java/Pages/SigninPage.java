package Pages;

import org.openqa.selenium.By;

public class SigninPage extends BasePage{

    // locators
    public By emailField = By.xpath("//input[@id='email']");
    public By emailErrorMgs = By.className("invalid-feedback");
    public By passwordField = By.xpath("//input[@id='password']");
    public By signinButton = By.xpath("//button[@type='submit']");
    public By rememberMe = By.xpath("//input[@id='remember-me']");
 //   public By maskPassword = By.xpath("(//*[name()='svg'][@class='svg-inline--fa fa-eye cursor-pointer'])[1]");
    public By errorMgs = By.xpath("//p[@class='text-danger fs-14 fw-bold ']");

}
