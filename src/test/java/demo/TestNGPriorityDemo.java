package demo;

import org.testng.annotations.Test;

public class TestNGPriorityDemo {
	@Test
	public void one() {
		System.out.println("this is test 1 ");
	}
	@Test(priority=1)
	public void two() {
		System.out.println("this is test 2 ");
	}
	@Test(priority=1)
	public void three() {
		System.out.println("this is test 3 ");
	}
	}
		
	
