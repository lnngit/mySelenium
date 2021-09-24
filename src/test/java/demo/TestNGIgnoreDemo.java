package demo;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
//@Ignore
public class TestNGIgnoreDemo {
	@Test
	//@Ignore
	public void test1() {
		System.out.println("i am inside test1");
	}
	@Test
	public void test2() {
		System.out.println("i am inside test2");
	}

}
