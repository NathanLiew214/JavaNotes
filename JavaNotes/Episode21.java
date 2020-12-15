/******************************************************************************
Episode 21: Superclass

*******************************************************************************/
//1 Car knows Vehicles max speed (Car knows everything in the vehicle)
Vehicle.java
public class Vehicle {
	int maxSpeed=120;

}

class Car extends Vehicle{
		
}


class Main {

	public static void main (String[] args) {	
		Car c= new Car();
		System.out.println(c.maxSpeed);//120 is printed as Car knows the Vehicle maxSpeed
		
	}
}
	
//2 When car has its own max speed its own variable is printed
Vehicle.java
public class Vehicle {
	int maxSpeed=120;//Vehicle max speed

}
class Car extends Vehicle{
	int maxSpeed=100;//Car max speed

}
class Main {

	public static void main (String[] args) {	
		Car c= new Car();
		System.out.println(c.maxSpeed);//100 is printed as Car has its own max speed
		//this is calling int
	}
}

same as



public class Vehicle {
	
	int maxSpeed=120;	
}

class Car extends Vehicle{
	int maxSpeed=100;
	
	public void display() {
		System.out.println(maxSpeed);
	}
}

class Main{	
	public static void main(String[] args) {
		Car c= new Car();
		c.display();
		//there is a display method in Car 
		//call the object to call it
		//this is calling method
	}
}

//output 100

//3 This wont work. Super must be called inside of the Car class. (Skip)
Vehicle.java
public class Vehicle {
	int maxSpeed=120;//Vehicle max speed

}

class Car extends Vehicle{
	int maxSpeed=100;//Car max speed

}


class Main {

	public static void main (String[] args) {	
		Car c= new Car();
		//System.out.println(super.maxSpeed);//Not available
		
	}
}
	
	
	
	
//4 In order to print back the vehicle's maxSpeed, super(); is needed
//Variable printed by creating a display method
 class Vehicle {
	int maxSpeed=120;

}

class Car extends Vehicle{
	int maxSpeed=100;
	public void display() {
		System.out.println(super.maxSpeed);//120 will be printed
	}
}


class Main {

	public static void main (String[] args) {	
		Car c= new Car();
		c.display();//Call display
		
	}
}
	

	
//5 New Example (With Method instead of variable)
//Can be used for same variable or method
public class Vehicle {
	//Method
	public void vroom() {
		System.out.println("Vroom vroom");
	}
	
}

class Car extends Vehicle{
	//Method
	public void vroom() {
		System.out.println("SKURRTTT");
	}
	

}

class Main {

	public static void main (String[] args) {	
		Car c= new Car();
		c.vroom();
		
	}
}

Output:
SKURRTTT
	
//6 Call the super method in class(NOT MAIN)
public class Vehicle {
	public void vroom() {
		System.out.println("Vroom vroom");
	}
	
}

class Car extends Vehicle{
	public void vroom() {
		//System.out.println("SKURRTTT");
		super.vroom();
	}
	

}


class Main {

	public static void main (String[] args) {	
		Car c= new Car();
		c.vroom();
	}
}
	

Output:
Vroom vroom		
	
	
	
	
//7 Constructor Ex 1	
	
public class Vehicle {
	Vehicle(){
		System.out.println("Vehicle constructor");
	}
}

class Car extends Vehicle{
	
	Car(){
		//super(); //Same output (calling vehicle constructor)
		System.out.println("Car constructor");
	}
}


class Main {
	
	public static void main (String[] args) {	
		Car c= new Car();

	}
}

Output:
Vehicle constructor
Car constructor

//7 Still Calls Vehicle	
//Vehicle constructor created after Car object being made
public class Vehicle {
	Vehicle(){
		System.out.println("Vehicle constructor");
	}
}

class Car extends Vehicle{	
}

class Main {
	
	public static void main (String[] args) {	
		Car c= new Car();

	}
}
	
Output:
Vehicle constructor



public class Vehicle {
	
	int maxSpeed;
	Vehicle(){
		System.out.println("Vehicle constructor");
	}
	
	//Passing a vehicle constructor with a max speed
	Vehicle(int maxSpeed){
		System.out.println("Vehicle constructor with/speed");
		this.maxSpeed= maxSpeed;
		//in the vehicle class, we previously have max speed, we want to set it
		//to something else, so this maxSpeed in the vehicle is equal to the new 
		//maxSpeed
	}
	
	
}

class Car extends Vehicle{
	
	Car(){
		super();//Has to be above
		System.out.println("Car constructor");
	}
}


class Main {
	
	public static void main (String[] args) {	
		Car c= new Car();
		Vehicle a= new Vehicle(111);//Created
		System.out.println(a.maxSpeed);


	}
}
Output:
Vehicle constructor
Car constructor
Vehicle constructor with/speed
111
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	