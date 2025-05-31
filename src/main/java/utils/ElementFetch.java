package utils;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import base.BaseTest;

public class ElementFetch {

    public WebElement getWebElement(By locator) {
        return BaseTest.getDriver().findElement(locator);
    }

    public List<WebElement> getWebElements(By locator) {
        return BaseTest.getDriver().findElements(locator);
    }
}
