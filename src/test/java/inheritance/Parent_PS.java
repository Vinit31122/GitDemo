package inheritance;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Parent_PS {

	public void printName() {
		System.out.println("Vinit Bhawsar");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("I am beforeMethod");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("I am afterMethod");
	}
}
