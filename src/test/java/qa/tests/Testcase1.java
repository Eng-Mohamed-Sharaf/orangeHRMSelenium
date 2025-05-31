package qa.tests;

import org.testng.annotations.Test;
import base.BaseTest;
import pageEvents.LoginPageEvents;

public class Testcase1 extends BaseTest {

    LoginPageEvents loginPage = new LoginPageEvents();

    @Test
    public void sampleMethodForEnteringCredentials() {
        logger.info(browserName + " - Verifying Login Page is loaded");
        loginPage.verifyIfLoginPageIsLoaded();

        logger.info(browserName + " - Entering login credentials");
        loginPage.enterCredentials("rmishra@gmail.com", "12345");
    }
}
