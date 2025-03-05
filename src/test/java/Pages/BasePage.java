package Pages;

import Utilities.DriverSetup;
import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.ByteArrayInputStream;
import java.time.Duration;

public class BasePage extends DriverSetup {

    public WebElement getElement(By locator) throws InterruptedException{
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(15));
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
//        return getDriver().findElement(locator);
    }

    public void clickOnElement(By locator){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

    public void writeOnElement(By locator, String text) throws InterruptedException {
        getElement(locator).sendKeys(text);
    }

    public String getElementText(By locator) throws InterruptedException {
        return getElement(locator).getText();
    }

    public String getAttributeText(By locator , String attributeName) throws InterruptedException {
        return getElement(locator).getDomAttribute(attributeName);
    }
    public boolean getDisplayStatus(By locator) throws InterruptedException {
        return getElement(locator).isDisplayed();
    }

    public boolean getSelectedStatus(By locator) throws InterruptedException{
        return getElement(locator).isSelected();
    }

    public boolean getEnableStatus(By locator) throws InterruptedException{
        return getElement(locator).isEnabled();
    }

    public void loadAWebPage(String url){
        getDriver().get(url);
    }

    public void addScreenShoot(String name){
        Allure.addAttachment(name, new ByteArrayInputStream(((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.BYTES)));
    }
}
