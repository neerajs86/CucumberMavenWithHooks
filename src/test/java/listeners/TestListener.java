package listeners;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {
	
	private static final Logger loggers = LogManager.getLogger(TestListener.class);
	
	@Override
	public void onStart(ITestContext context) {
		loggers.info("Test suite started");
	}
	
	@Override
	public void onFinish(ITestContext context) {
		loggers.info("Test suite completed");
	}
	
	@Override
	public void onTestStart(ITestResult result) {
		loggers.info(result.getMethod().getMethodName());
		loggers.info(result.getMethod().getDescription());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		loggers.info(result.getMethod().getMethodName());
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		loggers.info(result.getMethod().getMethodName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		loggers.error(result.getMethod().getMethodName());
	}
	
}
