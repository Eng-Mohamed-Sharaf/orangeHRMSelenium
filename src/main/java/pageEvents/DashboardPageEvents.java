package pageEvents;

import org.testng.Assert;
import pageObjects.DashboardPageElements;
import utils.ElementFetch;

public class DashboardPageEvents {
    ElementFetch ele = new ElementFetch();

    public void VerifyIfDashboardPageIsLoaded(){
        int size = ele.getWebElements(DashboardPageElements.DASHBOARD_HEADER).size();
        System.out.println("Dashboard Page loaded: " + (size > 0));
        Assert.assertTrue(size > 0, "Dashboard Page not loaded.");
    }
}
