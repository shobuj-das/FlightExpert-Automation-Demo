package StepDefs;

import Pages.HomePage;
import Pages.SigninPage;
import Pages.SignupPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.ro.Si;
import org.testng.asserts.SoftAssert;

import static Utilities.DriverSetup.getDriver;

public class SignUpDefs {
    SigninPage signinPage = new SigninPage();
    SignupPage signupPage = new SignupPage();
    SoftAssert softAssert = new SoftAssert();
    HomePage homePage = new HomePage();

    @Given("User should be on the sign up page")
    public void userShouldBeOnTheSignUpPage() throws InterruptedException {
//        getDriver().get(homePage.homepageUrl);
        signupPage.loadAWebPage(homePage.homepageUrl);

        signupPage.clickOnElement(homePage.signin);
        signupPage.clickOnElement(signinPage.createAccount);
    }

    @Then("The title {string} present on the page")
    public void theTitlePresentOnThePage(String arg0) throws InterruptedException {
        softAssert.assertEquals(signupPage.getElementText(signupPage.signupPageTitle),arg0);
    }

    @And("Close button is present on the sign up page")
    public void closeButtonIsPresentOnTheSignUpPage() throws InterruptedException {
        softAssert.assertTrue(signupPage.getDisplayStatus(signupPage.closeButton));
    }

    @And("All fields required to sign up are present")
    public void allFieldsRequiredToSignUpArePresent() throws InterruptedException{
        softAssert.assertTrue(signupPage.getDisplayStatus(signupPage.firstNameField));
        softAssert.assertTrue(signupPage.getDisplayStatus(signupPage.lastNameField));
        softAssert.assertTrue(signupPage.getDisplayStatus(signupPage.emailField));
        softAssert.assertTrue(signupPage.getDisplayStatus(signupPage.phoneNumberField));
        softAssert.assertTrue(signupPage.getDisplayStatus(signupPage.passwordField));
        softAssert.assertTrue(signupPage.getDisplayStatus(signupPage.confirmPasswordField));
    }

    @And("Eye icon is present in password and confirm password field")
    public void eyeIconIsPresentInPasswordAndConfirmPasswordField() throws InterruptedException{
        softAssert.assertTrue(signupPage.getDisplayStatus(signupPage.passwordEyeIcon));
        softAssert.assertTrue(signupPage.getDisplayStatus(signupPage.confirmPasswordEyeIcon));
    }

    @And("Password enter by user shown in black circle")
    public void passwordEnterByUserShownInBlackCircle() throws InterruptedException{
        signupPage.writeOnElement(signupPage.passwordField, "pass12345");
        signinPage.writeOnElement(signupPage.confirmPasswordField, "conPass1234");

        softAssert.assertEquals(signupPage.getAttributeText(signupPage.passwordField, "type"),"password");
        softAssert.assertEquals(signupPage.getAttributeText(signupPage.confirmPasswordField, "type"),"password");

        signupPage.addScreenShoot("Password Encrypted");
        signupPage.clearInputText(signupPage.passwordField);
    }

    @And("Clicking on the eye button displays the password")
    public void clickingOnTheEyeButtonDisplaysThePassword() throws InterruptedException {
        signupPage.writeOnElement(signupPage.passwordField, "pass12345");
        signupPage.writeOnElement(signupPage.confirmPasswordField, "conPass1234");

        signupPage.clickOnElement(signupPage.passwordEyeIcon);
        signupPage.clickOnElement(signupPage.confirmPasswordEyeIcon);

        signupPage.addScreenShoot("Password in plain text after clicking eye button");
        softAssert.assertEquals(signupPage.getAttributeText(signupPage.passwordField, "type"),"text");
        softAssert.assertEquals(signupPage.getAttributeText(signupPage.confirmPasswordField, "type"),"text");
        signupPage.clearInputText(signupPage.passwordField);
    }

    @And("Assert all the errors")
    public void assertAllTheErrors() {
        softAssert.assertAll();
    }

    @Given("Display Sign up page")
    public void displaySignUpPage() throws InterruptedException{
//        getDriver().get(homePage.homepageUrl);
//        Thread.sleep(2000);
//        signupPage.clickOnElement(homePage.signin);
//        Thread.sleep(2000);
//        signupPage.clickOnElement(signinPage.createAccount);
//        Thread.sleep(3000);

        getDriver().get(homePage.homepageUrl);
        Thread.sleep(2000);
        signinPage.clickOnElement(homePage.signin);
        Thread.sleep(2000);
        signinPage.clickOnElement(signinPage.createAccount);
    }

    @Then("User see the sign up button")
    public void userSeeTheSignUpButton() throws InterruptedException{
        softAssert.assertTrue(signupPage.getDisplayStatus(signupPage.signupButton));
    }

//    @Given("Display Sign up page")
//    public void display_sign_up_page()throws InterruptedException {
//        getDriver().get(homePage.homepageUrl);
//        Thread.sleep(2000);
//        signupPage.clickOnElement(homePage.signin);
//        Thread.sleep(2000);
//        signupPage.clickOnElement(signinPage.createAccount);
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("User see the sign up button")
//    public void user_see_the_sign_up_button() throws InterruptedException{
//        softAssert.assertTrue(signupPage.getDisplayStatus(signupPage.signupButton));
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
}
