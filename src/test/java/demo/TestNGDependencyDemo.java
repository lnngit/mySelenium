package demo;

import org.testng.annotations.Test;

public class TestNGDependencyDemo {
	@Test(dependsOnGroups ={"sanity1"} )
	public void test1() {
		System.out.println("i am in test1");
	}
	@Test(groups = { "sanity1"})
	public void test2() {
		System.out.println("i am in test2");
	}
	@Test(groups= {"sanity2"})
	public void test3() {
		System.out.println("i am in test3");
	}

}