package pageObjects;

import org.openqa.selenium.By;

public final class DashboardPageElements {
    public static final By DASHBOARD_HEADER = By.xpath("//h6[normalize-space()='Dashboard']");

    private DashboardPageElements() {
        // Prevent instantiation
    }
}
