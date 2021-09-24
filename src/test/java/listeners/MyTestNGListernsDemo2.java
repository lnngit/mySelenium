package listeners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class MyTestNGListernsDemo2 {
	
	@Test
	public void test4() {
		System.out.println("i am in test4 ");
	}
	@Test
	public void test5() {
		System.out.println("i am in test5 ");
		
	}
	@Test
	public void test6() {
		System.out.println("i am in test6 ");
		throw new SkipException("this test skipped");
	}

}
