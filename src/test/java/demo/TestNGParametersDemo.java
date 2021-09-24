package demo;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParametersDemo {
	@Test 
	@Parameters({"myname"})
	public void test1(@Optional("sravani") String name) {
		System.out.println("name is : "+name);
	}

}
