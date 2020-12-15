/******************************************************************************
Episode 20: Inheritance(Generic)

*******************************************************************************/
Main.java
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mouse2 m2=new Mouse2 ();
		m2.leftClick();
		m2.rightClick();
		m2.scrollUp();
		m2.scrollDown();
		m2.connect();

	}

}
Mouse.java

public class Mouse {
	
	public static void leftClick() {
		System.out.println("Click");
	}
	
	public static void rightClick() {
		System.out.println("Click");
	}
	
	public static void scrollUp() {
		System.out.println("Scrolled Up");
	}
	public static void scrollDown() {
		System.out.println("Scrolled Down");
	}

}

Mouse1.java

public class Mouse1  extends Mouse{
	public static void setColor(String color) {
		System.out.println("color");
		
	}
}
Mouse2.java

public class Mouse2  extends Mouse {
	
	public static void connect() {
		System.out.println("Bluetooth Connected");
	}

}

Mouse3.java

public class Mouse3 extends Mouse{
	
	boolean ambidextrous =true;
}
