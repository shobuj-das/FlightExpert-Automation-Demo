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
    public int w2 = 2000;
    @Given("User should be on the sign in page")
    public void userShouldBeOnTheSignInPage() throws InterruptedException{
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
    public void userShouldBeOnTheHomePage() {
//        softAssert.assertEquals(getDriver().getCurrentUrl(), "https://flightexpert.com/");

        Assert.assertEquals(getDriver().getCurrentUrl(), "https://flightexpert.com/");

        signinPage.addScreenShoot("Home Page after successful sign in");
    }

    @Then("Sign in page should be appeared after clicking button")
    public void signInPageShouldBeAppearedAfterClickingButton() throws InterruptedException{
//        softAssert.assertEquals(signinPage.getElementText(signinPage.pageTitle), "Sign In");
//        softAssert.assertTrue(signinPage.getDisplayStatus(signinPage.signinButton));

        Assert.assertEquals(signinPage.getElementText(signinPage.pageTitle), "Sign In");
        Assert.assertTrue(signinPage.getDisplayStatus(signinPage.signinButton));
    }

    @And("Email field should be present")
    public void emailFieldShouldBePresent() throws InterruptedException{
        wait.until(ExpectedConditions.presenceOfElementLocated(signinPage.emailField));
//        softAssert.assertTrue(signinPage.getDisplayStatus(signinPage.emailField));
        Assert.assertTrue(signinPage.getDisplayStatus(signinPage.emailField));
    }

    @And("Password field should be present")
    public void passwordFieldShouldBePresent() throws InterruptedException{
        wait.until(ExpectedConditions.presenceOfElementLocated(signinPage.passwordField));
//        softAssert.assertTrue(signinPage.getDisplayStatus(signinPage.passwordField));
        Assert.assertTrue(signinPage.getDisplayStatus(signinPage.passwordField));
    }

    @And("Mandatory fields are labeled with asterisk sign")
    public void mandatoryFieldsAreLabeledWithAsteriskSign() throws InterruptedException{
        wait.until(ExpectedConditions.presenceOfElementLocated(signinPage.emailAsterisk));
//        softAssert.assertTrue(signinPage.getDisplayStatus(signinPage.emailAsterisk));
        Assert.assertTrue(signinPage.getDisplayStatus(signinPage.emailAsterisk));

        wait.until(ExpectedConditions.presenceOfElementLocated(signinPage.passwordAsterisk));
//        softAssert.assertTrue(signinPage.getDisplayStatus(signinPage.passwordAsterisk));
        Assert.assertTrue(signinPage.getDisplayStatus(signinPage.passwordAsterisk));
    }

    @And("Email field labeled as {string} on sign in page")
    public void emailFieldLabeledAsOnSignInPage(String arg0) throws InterruptedException {
        Assert.assertEquals(signinPage.getElementText(signinPage.emailFieldLabel), arg0);
//        softAssert.assertEquals(signinPage.getElementText(signinPage.emailFieldLabel),arg0);
    }

    @And("Password field labeled as {string} on the sign in page")
    public void passwordFieldLabeledAsOnTheSignInPage(String arg0) throws InterruptedException{
        Assert.assertEquals(signinPage.getElementText(signinPage.passwordFieldLabel), arg0);
//        softAssert.assertEquals(signinPage.getElementText(signinPage.passwordFieldLabel), arg0);
//        softAssert.assertAll();
    }

    @And("Validate all assertion")
    public void validateAllAssertion() {
        softAssert.assertAll();
    }

    @And("Sign in page labeled as {string}")
    public void signInPageLabeledAs(String arg0) throws InterruptedException {
        Assert.assertEquals(signinPage.getElementText(signinPage.pageTitle),arg0);
//        softAssert.assertEquals(signinPage.getElementText(signinPage.pageTitle),arg0);
    }

    @And("Email field is labeled with placeholder text {string}")
    public void emailFieldIsLabeledWithPlaceholderText(String arg0) throws InterruptedException{
//        softAssert.assertEquals(signinPage.getAttributeText(signinPage.emailField,"placeholder"),arg0);
        Assert.assertEquals(signinPage.getAttributeText(signinPage.emailField,"placeholder"),arg0);
    }

    @And("Password field is labeled with placeholder text {string}")
    public void passwordFieldIsLabeledWithPlaceholderText(String arg0) throws InterruptedException {
//        softAssert.assertEquals(signinPage.getAttributeText(signinPage.passwordField, "placeholder"),arg0);
        Assert.assertEquals(signinPage.getAttributeText(signinPage.passwordField, "placeholder"),arg0);
    }

    @And("Eye icon is present in the password field")
    public void eyeIconIsPresentInThePasswordField() throws InterruptedException{
//        softAssert.assertTrue(signinPage.getDisplayStatus(signinPage.eyeButton));
       Assert.assertTrue(signinPage.getDisplayStatus(signinPage.eyeButton));
    }

    @And("Close button is present on the sign in page")
    public void closeButtonIsPresentOnTheSignInPage() throws InterruptedException{
//        softAssert.assertTrue(signinPage.getDisplayStatus(signinPage.closeButton));
        Assert.assertTrue(signinPage.getDisplayStatus(signinPage.closeButton));
    }

    @And("Checkbox is present on the sign in page")
    public void checkboxIsPresentOnTheSignInPage() throws InterruptedException{
//        softAssert.assertTrue(signinPage.getDisplayStatus(signinPage.checkBox));
        Assert.assertTrue(signinPage.getDisplayStatus(signinPage.checkBox));
    }

    @And("Checkbox is labeled as {string}")
    public void checkboxIsLabeledAs(String arg0) throws InterruptedException{
        Assert.assertEquals(signinPage.getElementText(signinPage.checkBoxLabel),arg0);
//        softAssert.assertEquals(signinPage.getElementText(signinPage.checkBoxLabel),arg0);
    }

    @And("Checkbox is checked by default")
    public void checkboxIsCheckedByDefault() throws InterruptedException{
        wait.until(ExpectedConditions.elementToBeClickable(signinPage.checkBox));
//        softAssert.assertTrue(signinPage.getSelectedStatus(signinPage.checkBox));
        Assert.assertTrue(signinPage.getSelectedStatus(signinPage.checkBox));
    }

    @And("Forget password link text is present")
    public void forgetPasswordLinkTextIsPresent() throws InterruptedException{
//        softAssert.assertTrue(signinPage.getDisplayStatus(signinPage.forgetPassword));
//        softAssert.assertEquals(signinPage.getElementText(signinPage.forgetPassword),"Forgot Password?");

        Assert.assertTrue(signinPage.getDisplayStatus(signinPage.forgetPassword));
        Assert.assertEquals(signinPage.getElementText(signinPage.forgetPassword),"Forgot Password?");
    }

    @And("Sign in button is present")
    public void signInButtonIsPresent() throws InterruptedException{
//        softAssert.assertTrue(signinPage.getEnableStatus(signinPage.signinButton));
//        Assert.assertTrue(signinPage.getEnableStatus(signinPage.signinButton));
        Assert.assertTrue(signinPage.getDisplayStatus(signinPage.signinButton));
    }

    @And("Sign in with Facebook button is present")
    public void signInWithFacebookButtonIsPresent() throws InterruptedException{
//        softAssert.assertTrue(signinPage.getEnableStatus(signinPage.facebookButton));
//        Assert.assertTrue(signinPage.getEnableStatus(signinPage.facebookButton));
        Assert.assertTrue(signinPage.getDisplayStatus(signinPage.facebookButton));
    }

    @And("Sign in with Google button is present")
    public void signInWithGoogleButtonIsPresent() throws InterruptedException{
//        softAssert.assertTrue(signinPage.getEnableStatus(signinPage.googleButton));
//        Assert.assertTrue(signinPage.getEnableStatus(signinPage.googleButton));
        Assert.assertTrue(signinPage.getDisplayStatus(signinPage.googleButton));
    }

    @And("Create an account link text is present")
    public void createAnAccountLinkTextIsPresent() throws InterruptedException{
//        softAssert.assertTrue(signinPage.getDisplayStatus(signinPage.createAccount));
//        softAssert.assertTrue(signinPage.getEnableStatus(signinPage.createAccount));

        Assert.assertTrue(signinPage.getDisplayStatus(signinPage.createAccount));
        Assert.assertTrue(signinPage.getEnableStatus(signinPage.createAccount));
    }

    @And("Sign in button colour is matched with design document")
    public void signInButtonColourIsMatchedWithDesignDocument(){

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
//            sf.assertEquals(signinPage.getElementText(signinPage.emailErrorMgs),emailErrorMgs);
            Assert.assertEquals(signinPage.getElementText(signinPage.emailErrorMgs),emailErrorMgs);
            signinPage.addScreenShoot("Email field error message");
        }
        if(!passwordErrorMgs.isEmpty()){
//            sf.assertEquals(signinPage.getElementText(signinPage.passwordErrorMgs),passwordErrorMgs);
            Assert.assertEquals(signinPage.getElementText(signinPage.passwordErrorMgs),passwordErrorMgs);
            signinPage.addScreenShoot("Password field error message");
        }
        if(!signInErrorMgs.isEmpty()){
//            sf.assertEquals(signinPage.getElementText(signinPage.signInFailedErrorMgs),signInErrorMgs);
            Assert.assertEquals(signinPage.getElementText(signinPage.signInFailedErrorMgs),signInErrorMgs);
            signinPage.addScreenShoot("Sign in field error message");
        }
        sf.assertAll();
    }

    @When("User enter credentials to the email and password field")
    public void userEnterCredentialsToTheEmailAndPasswordField() throws InterruptedException{
        signinPage.writeOnElement(signinPage.emailField, "testmail@mail.com");
        signinPage.writeOnElement(signinPage.passwordField, "password12");
    }

    @Then("Credentials should remain in the email and password fields")
    public void credentialsShouldRemainInTheEmailAndPasswordFields() throws InterruptedException {
        Assert.assertEquals(signinPage.getAttributeText(signinPage.emailField, "value"), "testmail@mail.com");
        Assert.assertEquals(signinPage.getAttributeText(signinPage.passwordField, "value"), "password12");
    }

    @Then("Checkbox should be checked by default")
    public void checkboxShouldBeCheckedByDefault() throws InterruptedException{
        Assert.assertTrue(signinPage.getSelectedStatus(signinPage.checkBox));
    }

    @And("User clicks on the checkbox")
    public void userClicksOnTheCheckbox() throws InterruptedException{
        signinPage.clickOnElement(signinPage.checkBox);
        Thread.sleep(w2);
    }

    @Then("Password should be in plain text format")
    public void passwordShouldBeInPlainTextFormat() throws InterruptedException{
        Assert.assertEquals(signinPage.getAttributeText(signinPage.passwordField, "type"), "text");
    }

    @Then("The checkbox should be unchecked")
    public void theCheckboxShouldBeUnchecked() throws InterruptedException {
        Assert.assertFalse(signinPage.getSelectedStatus(signinPage.checkBox));
    }

    @Then("The checkbox should be checked")
    public void theCheckboxShouldBeChecked() throws InterruptedException{
        Assert.assertTrue(signinPage.getSelectedStatus(signinPage.checkBox));
    }

    @And("User should see the profile option on home page")
    public void userShouldSeeTheProfileOptionOnHomePage() throws InterruptedException{
        Assert.assertTrue(signinPage.getDisplayStatus(homePage.profile));
    }

    @And("Sign in button is clickable")
    public void signInButtonIsClickable() throws InterruptedException {
        Assert.assertTrue(signinPage.getEnableStatus(signinPage.signinButton));
    }

    @And("Sign in button is labeled as {string}")
    public void signInButtonIsLabeledAs(String arg0) throws InterruptedException {
        Assert.assertEquals(signinPage.getElementText(signinPage.signinButton),arg0);
    }

    @And("Sign in button color is red")
    public void signInButtonColorIsRed() throws InterruptedException{
//        System.out.println(getDriver().findElement(signinPage.signinButton).getCssValue("background-color"));
        Assert.assertEquals(signinPage.getElementCssValue(signinPage.signinButton,"background-color"),"rgba(235, 25, 51, 1)", "button colour not matched");
    }

    @And("Sing in button colour changed when hover over the button")
    public void singInButtonColourChangedWhenHoverOverTheButton() throws InterruptedException {
        signinPage.hoverOnElement(signinPage.signinButton);
        String actualCssValue = signinPage.getElementCssValue(signinPage.signinButton, "background-color");
        Assert.assertEquals(actualCssValue, "rgba(47, 5, 10, 1)","Colour didn't match");
    }

    @And("Sign in button colour is {string} after hover")
    public void signInButtonColourIsAfterHover(String arg0) throws InterruptedException {
        Assert.assertEquals(signinPage.getElementCssValue(signinPage.signinButton, "background-color"),arg0);
    }
}
