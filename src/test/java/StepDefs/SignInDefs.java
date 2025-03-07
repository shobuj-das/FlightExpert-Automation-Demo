package StepDefs;

import Pages.HomePage;
import Pages.SigninPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

import static Utilities.DriverSetup.getDriver;

public class SignInDefs {
    HomePage homePage = new HomePage();
    SigninPage signinPage = new SigninPage();
    WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(30));
    SoftAssert softAssert = new SoftAssert();
    @Given("User should be on the sign in page")
    public void userShouldBeOnTheSignInPage() {
        getDriver().get(homePage.homepageUrl);
        signinPage.clickOnElement(homePage.signin);
    }

    @When("user enter valid username and password")
    public void userEnterValidUsernameAndPassword() throws InterruptedException {
        signinPage.writeOnElement(signinPage.emailField, "shobuj@yopmail.com");
        signinPage.writeOnElement(signinPage.passwordField, "shobuj1234");
    }

//    @And("User click on eye button beside password")
//    public void userClickOnEyeButtonBesidePassword() throws InterruptedException {
//        signinPage.clickOnElement(signinPage.maskPassword);
//        Thread.sleep(2000);
//    }

    @And("User click on the sign in button")
    public void userClickOnTheSignInButton() throws InterruptedException {
        signinPage.clickOnElement(signinPage.signinButton);
        Thread.sleep(1000);
    }

    @Then("User should be on the home page")
    public void userShouldBeOnTheHomePage() throws InterruptedException{
        Assert.assertEquals(getDriver().getCurrentUrl(), homePage.homepageUrl);
        Assert.assertTrue(signinPage.getDisplayStatus(homePage.profile));
        signinPage.addScreenShoot("Home Page after sign in");
    }


    @When("user enter valid email")
    public void userEnterValidEmail() throws InterruptedException {
        signinPage.writeOnElement(signinPage.emailField, "shobuj1111@yopmail.com");
        Thread.sleep(2000);
    }

    @And("user enter invalid password")
    public void userEnterInvalidPassword() throws InterruptedException{
        signinPage.writeOnElement(signinPage.passwordField, "incorrectPass");
    }

    @Then("Error message should be displayed")
    public void errorMessageShouldBeDisplayed() throws InterruptedException {
        Assert.assertEquals(signinPage.getElementText(signinPage.errorMgs),"The provided credentials are incorrect.");
    }


    @Then("Sign in page should be appeared after clicking button")
    public void signInPageShouldBeAppearedAfterClickingButton() throws InterruptedException{
        Assert.assertEquals(signinPage.getElementText(signinPage.pageTitle), "Sign In");
        Assert.assertTrue(signinPage.getDisplayStatus(signinPage.signinButton));
    }

    @And("Email field should be present")
    public void emailFieldShouldBePresent() throws InterruptedException{
        wait.until(ExpectedConditions.presenceOfElementLocated(signinPage.emailField));
        Assert.assertTrue(signinPage.getDisplayStatus(signinPage.emailField));
    }

    @And("Password field should be present")
    public void passwordFieldShouldBePresent() throws InterruptedException{
        wait.until(ExpectedConditions.presenceOfElementLocated(signinPage.passwordField));
        Assert.assertTrue(signinPage.getDisplayStatus(signinPage.passwordField));
    }

    @And("Mandatory fields are labeled with asterisk sign")
    public void mandatoryFieldsAreLabeledWithAsteriskSign() throws InterruptedException{
        wait.until(ExpectedConditions.presenceOfElementLocated(signinPage.emailAsterisk));
        Assert.assertTrue(signinPage.getDisplayStatus(signinPage.emailAsterisk));

        wait.until(ExpectedConditions.presenceOfElementLocated(signinPage.passwordAstesirk));
        Assert.assertTrue(signinPage.getDisplayStatus(signinPage.passwordAstesirk));
    }

    @And("Email field labeled as {string} on sign in page")
    public void emailFieldLabeledAsOnSignInPage(String arg0) throws InterruptedException {
//        Assert.assertEquals(signinPage.getElementText(signinPage.emailFieldLabel), arg0);
        softAssert.assertEquals(signinPage.getElementText(signinPage.emailFieldLabel),arg0);
//        softAssert.assertAll();
    }

    @And("Password field labeled as {string} on the sign in page")
    public void passwordFieldLabeledAsOnTheSignInPage(String arg0) throws InterruptedException{
//        Assert.assertEquals(signinPage.getElementText(signinPage.passwordFieldLabel), arg0);
        softAssert.assertEquals(signinPage.getElementText(signinPage.passwordFieldLabel), arg0);
//        softAssert.assertAll();
    }

    @And("Validate all assertion")
    public void validateAllAssertion() {
        softAssert.assertAll();
    }

    @And("Sign in page labeled as {string}")
    public void signInPageLabeledAs(String arg0) throws InterruptedException {
        softAssert.assertEquals(signinPage.getElementText(signinPage.pageTitle),arg0);
    }

    @And("Email field is labeled with placeholder text {string}")
    public void emailFieldIsLabeledWithPlaceholderText(String arg0) throws InterruptedException{
        softAssert.assertEquals(signinPage.getAttributeText(signinPage.emailField,"placeholder"),arg0);
    }

    @And("Password field is labeled with placeholder text {string}")
    public void passwordFieldIsLabeledWithPlaceholderText(String arg0) throws InterruptedException {
        softAssert.assertEquals(signinPage.getAttributeText(signinPage.passwordField, "placeholder"),arg0);
    }

    @And("Eye icon is present in the password field")
    public void eyeIconIsPresentInThePasswordField() throws InterruptedException{
        softAssert.assertTrue(signinPage.getDisplayStatus(signinPage.eyeButton));
    }

    @And("Close button is present on the sign in page")
    public void closeButtonIsPresentOnTheSignInPage() throws InterruptedException{
        softAssert.assertTrue(signinPage.getDisplayStatus(signinPage.closeButton));
    }

    @And("Checkbox is present on the sign in page")
    public void checkboxIsPresentOnTheSignInPage() throws InterruptedException{
        softAssert.assertTrue(signinPage.getDisplayStatus(signinPage.checkBox));
    }

    @And("Checkbox is labeled as {string}")
    public void checkboxIsLabeledAs(String arg0) throws InterruptedException{
        softAssert.assertEquals(signinPage.getElementText(signinPage.checkBoxLabel),arg0);
    }

    @And("Checkbox is checked by default")
    public void checkboxIsCheckedByDefault() throws InterruptedException{
        wait.until(ExpectedConditions.elementToBeClickable(signinPage.checkBox));
        softAssert.assertTrue(signinPage.getSelectedStatus(signinPage.checkBox));
    }

    @And("Forget password link text is present")
    public void forgetPasswordLinkTextIsPresent() throws InterruptedException{
        softAssert.assertTrue(signinPage.getDisplayStatus(signinPage.forgetPassword));
        softAssert.assertEquals(signinPage.getElementText(signinPage.forgetPassword),"Forgot Password?");
    }

    @And("Sign in button is present")
    public void signInButtonIsPresent() throws InterruptedException{
        softAssert.assertTrue(signinPage.getEnableStatus(signinPage.signinButton));
    }

    @And("Sign in with Facebook button is present")
    public void signInWithFacebookButtonIsPresent() throws InterruptedException{
        softAssert.assertTrue(signinPage.getEnableStatus(signinPage.facebookButton));
    }

    @And("Sign in with Google button is present")
    public void signInWithGoogleButtonIsPresent() throws InterruptedException{
        softAssert.assertTrue(signinPage.getEnableStatus(signinPage.googleButton));
    }

    @And("Create an account link text is present")
    public void createAnAccountLinkTextIsPresent() throws InterruptedException{
        softAssert.assertTrue(signinPage.getDisplayStatus(signinPage.createAccount));
    }

    @And("Sign in button colour is matched with design document")
    public void signInButtonColourIsMatchedWithDesignDocument() throws InterruptedException{

    }

    @And("Checkbox colour is matched with design document")
    public void checkboxColourIsMatchedWithDesignDocument() {

    }

    @When("User enters {string} in the email field")
    public void userEntersInTheEmailField(String arg0) throws InterruptedException{
        wait.until(ExpectedConditions.presenceOfElementLocated(signinPage.emailField));
        signinPage.writeOnElement(signinPage.emailField,arg0);
    }

    @And("User enters {string} in the password field")
    public void userEntersInThePasswordField(String arg0) throws InterruptedException{
        wait.until(ExpectedConditions.presenceOfElementLocated(signinPage.passwordField));
        signinPage.writeOnElement(signinPage.passwordField,arg0);
    }

    @Then("User should see {string} {string} {string} error message")
    public void userShouldSeeErrorMessage(String emailErrorMgs, String passwordErrorMgs, String signInErrorMgs) throws InterruptedException{
        SoftAssert sf = new SoftAssert();

        if(!emailErrorMgs.isEmpty()){
            sf.assertEquals(signinPage.getElementText(signinPage.emailErrorMgs),emailErrorMgs);
            signinPage.addScreenShoot("Email field error message");
        }
        if(!passwordErrorMgs.isEmpty()){
            sf.assertEquals(signinPage.getElementText(signinPage.passwordErrorMgs),passwordErrorMgs);
        }
        if(!signInErrorMgs.isEmpty()){
            sf.assertEquals(signinPage.getElementText(signinPage.signInFailedErrorMgs),signInErrorMgs);
        }

        sf.assertAll();
    }
}
