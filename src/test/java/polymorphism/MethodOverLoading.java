package polymorphism;

import practice.AccessModifiers;

public class MethodOverLoading {

	public static void main(String[] args) {
		MethodOverLoading ml = new MethodOverLoading();
		ml.getdata(1);
		ml.getdata("Java");
		ml.getdata(2, 3);
	}

	public void getdata(int a) {
		System.out.println(a);
	}

	public void getdata(int a, int b) {
		System.out.println(a);
		System.out.println(b);
	}

	public void getdata(String a) {
		System.out.println(a);
	}
}
