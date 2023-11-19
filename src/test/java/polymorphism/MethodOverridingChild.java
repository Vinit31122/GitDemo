package polymorphism;

public class MethodOverridingChild extends MethodOverridingParent {
	
	public static void main(String[] args) {
		MethodOverridingChild mrc= new MethodOverridingChild();
		mrc.audioSystem();
	}
	
	public void audioSystem() {
		System.out.println("child audio system");
	}
}
