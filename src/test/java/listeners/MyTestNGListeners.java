package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyTestNGListeners implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println(result.getName() + "-->onTestStart(ITestResult result)");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println(result.getName() + "-->onTestSuccess(ITestResult result)");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName() + "-->onTestFailure(ITestResult result)");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getName() + "-->onTestSkipped(ITestResult result)");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println(result.getName() + "-->onTestFailedButWithinSuccessPercentage(ITestResult result)");
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println(result.getName() + "-->onTestFailedWithTimeout(ITestResult result)");
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println(context.getName() + "-->onStart(ITestContext context)");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println(context.getName() + "-->onFinish(ITestContext context)");
	}
}
