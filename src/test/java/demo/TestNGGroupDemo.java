package demo;

import org.testng.annotations.Test;
@Test(groups= {"AllClassTests"})
public class TestNGGroupDemo {

	@Test(groups = {"sanity"})
	public void test1() {
		System.out.println("this is Test1");
	}

	@Test (groups = {"windows.regression"})
	public void test2() {
		System.out.println("this is Test2");
	}

	@Test(groups= {"linux.regession"})
	public void test3() {
		System.out.println("this is Test3");
	}

	@Test
	public void test4() {
		System.out.println("this is Test4");
	}

}