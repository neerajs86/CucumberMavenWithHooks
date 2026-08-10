package retryAnalyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
	
	private static int count = 1;
	private final static int maxRetry = 2;
	
	public boolean retry(ITestResult result) {
		if(count < maxRetry) {
			count++;
			return true;
		} else {
			return false;
		}
	}

}
