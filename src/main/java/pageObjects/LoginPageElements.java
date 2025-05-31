package pageObjects;

import org.openqa.selenium.By;

public interface LoginPageElements {
    By LOGIN_BUTTON = By.xpath("//div[@class='ui fluid large blue submit button']");
    By EMAIL_FIELD = By.xpath("//input[@placeholder='Email']");
    By PASSWORD_FIELD = By.xpath("//input[@placeholder='Password']");
}
