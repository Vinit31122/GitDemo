package abstraction;

public class Child extends Parent{

	public static void main(String[] args) {
		Child c= new Child();
		c.engine();
		c.wing();
		c.aircraftColor();
	}

	@Override
	public void aircraftColor() {
		System.out.println("Colour is red");
	}
}
