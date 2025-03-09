package Pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage{
    public String homepageUrl = "https://www.flightexpert.com";

    // locators
    public By signin = By.xpath("//button[normalize-space()='Sign in']");
    public By profile = By.xpath("//div[@class='d-flex']/p[starts-with(@class, 'fw-bold text-dark')]");
    public By flight = By.xpath("//span[@class='tab-options'][normalize-space()='Flight']");
    public By hotel = By.xpath("//span[contains(text(),'Hotel')]");
    public By visa = By.xpath("//span[@class='ms-1 tab-options']");
    public By esim = By.xpath("//button[@id='react-aria2657467692-:r0:-tab-esim']//span[@class='mx-1 py-0']");


}
