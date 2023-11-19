package parameterized_constructor;

public class CommonMethods extends Multpily_Utility_Class {

	// int b is class variable and scope is throughout the whole class
	int b;

	// parameterized constructor having same name as class and only 1 argument
	public CommonMethods(int c) {

		super(c); // invoking parent class constructor using super keyword
					// super keyword should be first line in child constructor

		// int c is instance variable and scope is limited to constructor block.
		this.b = c; // this keyword can be use to call current class variables.
	}

	public int increment() {
		b++;
		return b;
	}

	public int decrement() {
		b--;
		return b;
	}
}
