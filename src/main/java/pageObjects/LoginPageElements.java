package pageObjects;

import org.openqa.selenium.By;

public final class LoginPageElements {
    public static final By LOGIN_BUTTON = By.xpath("//button[normalize-space()='Login']");
    public static final By USER_FIELD = By.xpath("//input[@placeholder='Username']");
    public static final By PASSWORD_FIELD = By.xpath("//input[@placeholder='Password']");

    private LoginPageElements() {
        // Prevent instantiation
    }
}
