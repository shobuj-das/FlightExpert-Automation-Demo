package Pages;

import Utilities.DriverSetup;
import io.cucumber.java.sl.In;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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

    public String getText(By locator) throws InterruptedException {
        return getElement(locator).getText();
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
}
