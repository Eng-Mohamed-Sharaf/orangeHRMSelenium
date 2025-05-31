package qa.tests;

import org.testng.annotations.Test;
import base.BaseTest;
import pageEvents.DashboardPageEvents;
import pageEvents.LoginPageEvents;

public class Testcase1 extends BaseTest {

    LoginPageEvents loginPage = new LoginPageEvents();
    DashboardPageEvents dashboardPage = new DashboardPageEvents();

    @Test
    public void sampleMethodForEnteringCredentials() {
        logger.info(browserName + " - Verifying Login Page is loaded");
        loginPage.verifyIfLoginPageIsLoaded();

        logger.info(browserName + " - Entering login credentials");
        loginPage.enterCredentials("Admin", "admin123");
        loginPage.clickLoginButton();

        logger.info(browserName + " - Verifying Dashboard Page is loaded");
        dashboardPage.VerifyIfDashboardPageIsLoaded();


    }
}
