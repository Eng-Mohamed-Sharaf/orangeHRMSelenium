package utils;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

/**
 * Automatically retries a failed test one time.
 */
public class RetryAnalyzer implements IRetryAnalyzer {

    private int count = 0;
    private final int retryCount = 1;  // Number of times to retry

    @Override
    public boolean retry(ITestResult result) {
        if (count < retryCount) {
            count++;
            return true;  // Retry the test
        }
        return false;     // Do not retry
    }
}
