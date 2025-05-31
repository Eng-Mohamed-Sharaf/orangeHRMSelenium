package pageEvents;

import org.testng.Assert;
import org.openqa.selenium.WebElement;
import pageObjects.LoginPageElements;
import utils.ElementFetch;

public class LoginPageEvents {

    ElementFetch ele = new ElementFetch();

    public void verifyIfLoginPageIsLoaded() {
        int size = ele.getWebElements(LoginPageElements.LOGIN_BUTTON).size();
        Assert.assertTrue(size > 0, "Login button not found on the login page.");
    }

    public void enterCredentials(String email, String password) {
        WebElement emailField = ele.getWebElement(LoginPageElements.EMAIL_FIELD);
        WebElement passwordField = ele.getWebElement(LoginPageElements.PASSWORD_FIELD);

        emailField.clear();
        emailField.sendKeys(email);

        passwordField.clear();
        passwordField.sendKeys(password);
    }
}
