/******************************************************************************
Episode 23: Abstract Class and Methods & Interface

*******************************************************************************/
//0 Initially everything runs well
AbstractTutorial.java
class Dog {
	String breed;
	
	public void bark() {
		System.out.println("Bark!");
	}

}

public class AbstractTutorial{
	public static void main(String[] args) {
		Dog d= new Dog();
		d.bark();
	}
}



//1 abstract class called
//abstract(CLASSES) restrict the creation of objects from that class/superclass
//an abstract class helps make regular classes

AbstractTutorial.java
//abstract added
abstract class Dog {
	String breed;
	
	public void bark() {
		System.out.println("Bark!");
	}

}

public class AbstractTutorial{
	public static void main(String[] args) {
		// NOT AVAILABLE ANYMORE
		Dog d= new Dog();
			d.bark();
	}
}

//1.1 To make it work
AbstractTutorial.java
abstract class Dog {
	String breed;
	
	public void bark() {
		System.out.println("Bark!");
	}

}
//create a new class Chihuahua extends Dog
class Chihuahua extends Dog{
}

public class AbstractTutorial{
	public static void main(String[] args) {
	//Call Chihuahua here
		Chihuahua c= new Chihuahua();
			c.bark();
			c.breed;//null
	}
}


//2 Abstract method
AbstractTutorial.java
abstract class Dog {
	String breed;
	
	public void bark() {
		System.out.println("Bark!");
	}
	
	// You cannot add method inside poop here
	//Forces all the subclasses to have poop
	public abstract void poop();
	

}
//NOT AVAILABLE
//poop method needs to be here since it extends a super class which contains abstract method
class Chihuahua extends Dog{
}

public class AbstractTutorial{
	public static void main(String[] args) {
	
		Chihuahua c= new Chihuahua();
			c.bark();
	}
}




//2.2 Done and it all works
AbstractTutorial.java
abstract class Dog {
	
	//All the dog will bark the same 
	//But poop differently
	//But you cannot create a class with this
	public void bark() {
		System.out.println("Bark!");
	}
	
	public abstract void poop();
}

class Chihuahua extends Dog{
	
	//Poop method created
	public void poop() {
		System.out.println("Dog pooped!");	
	}
}

public class AbstractTutorial{
	public static void main(String[] args) {
		Chihuahua c= new Chihuahua();
			c.bark();
			c.poop();
	}
}



//3 Interface 
AbstractTutorial.java
interface DogInterface {
	void poop();
	//it is the same as
	//(SAME!)
	//public abstract void poop();

	// you cannot use anything that is not abstract therefore the body of the method that is empty
	
	//(WONT WORK!!)
	public void bark() {
		System.out.println("Bark!");
	}
		
}

//(IMPLEMENTS SHOULD BE USED INSRETEAD!!)
class Chihuahua extends DogInterface{
	@Override
	public void poop() {
		System.out.println("Dog pooped!");	
	}

	@Override
	public void bark() {
		System.out.println("Bark!");
		
	}
}

public class AbstractTutorial{
	public static void main(String[] args) {
	
		Chihuahua c= new Chihuahua();
			c.bark();
			c.poop();
	}
}


//3.3 Correct Interface
AbstractTutorial.java
interface DogInterface {

	void bark();
	void poop();

}

class Chihuahua implements DogInterface{
	@Override
	public void poop() {
		System.out.println("Dog pooped!");	
	}

	@Override
	public void bark() {
		System.out.println("Bark!");
		
	}
}

public class AbstractTutorial{
	public static void main(String[] args) {
	
		Chihuahua c= new Chihuahua();
			c.bark();
			c.poop();
	}
}

//4 Another example of interface
interface WaterBottleInterface {
	String color="Blue";
	void fillUp();
	void pourOut();
	
}

public class InterfaceExample implements WaterBottleInterface {
	public static void main (String[] args) {
		System.out.println(color);
		InterfaceExample ex = new InterfaceExample();
		ex.fillUp();
	}

	@Override
	public void fillUp() {
		System.out.println("It is fillled!");	
	}

	@Override
	public void pourOut() {
		System.out.println("It is poured out!");
		
	}
}

//5  Method in Interface and Abstract Classes relation to Classes
public interface Edible {
	public String howToEat();
}

//Since Fruit is implemented by Edible, it needs to have String howToEat
//Unless it is also an abstract class, it does not have the method in Edible
(NOT AVAILABLE!!)
class Fruit implements Edible{
	public String howToEat(){
	//TODO: something eneeded
	}
}


//5.1 To solve it
public interface Edible {
	public String howToEat();
}

//abstract classes can prevent force Method
abstract class Fruit implements Edible{
	
}

//5.2 All Combine
Edible.java  (Interface)
public interface Edible {
	public String howToEat();
}



Animal.java
abstract class Animal {
	public abstract String sound();
}

class Chicken extends Animal implements Edible {
	@Override
	public String howToEat() {
		// TODO Auto-generated method stub
		return "Chicken : Fry it";
	}
	@Override
	public String sound() {
		// TODO Auto-generated method stub
		return "Chicken : Cock -a -doodle doo";
	}

}
public class Tiger extends Animal {

	@Override
	public String sound() {
		// TODO Auto-generated method stub
		return null;
	}
}


Fruits.java
abstract class Fruit implements Edible{

}
class Orange extends Fruit {

	@Override
	public String howToEat() {
		// TODO Auto-generated method stub
		return null;
	}
}

class Apple extends Fruit {

	@Override
	public String howToEat() {
		// TODO Auto-generated method stub
		return null;
	}
}























