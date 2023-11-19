package parameterized_constructor;

import org.testng.annotations.Test;

public class TestClass {
	
	@Test
	public void test1() {
		
		int a=3;
		CommonMethods cm=new CommonMethods(a);  //invoking parameterized constructor and sending argument
		System.out.println(cm.increment());
		System.out.println(cm.decrement());
		System.out.println(cm.multiplyTwo());
	}
}
