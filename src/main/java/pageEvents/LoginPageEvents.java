package pageEvents;

import org.testng.Assert;
import org.openqa.selenium.WebElement;
import pageObjects.LoginPageElements;
import utils.ElementFetch;

public class LoginPageEvents {

    ElementFetch ele = new ElementFetch();

    public void verifyIfLoginPageIsLoaded() {
        int size = ele.getWebElements(LoginPageElements.LOGIN_BUTTON).size();
        System.out.println("Login page loaded: " + (size > 0));
        Assert.assertTrue(size > 0, "Login button not found on the login page.");
    }

    public void enterCredentials(String user, String password) {
        WebElement userField = ele.getWebElement(LoginPageElements.USER_FIELD);
        WebElement passwordField = ele.getWebElement(LoginPageElements.PASSWORD_FIELD);

        System.out.println("Entering username: " + user);
        userField.clear();
        userField.sendKeys(user);

        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public void clickLoginButton() {
        ele.getWebElement(LoginPageElements.LOGIN_BUTTON).click();
        System.out.println("Login Button Pressed.");

    }
}
