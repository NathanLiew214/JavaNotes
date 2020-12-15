//Monday
//1 Went through JAR Files

//2  Use Circle toString to return value

Main.java
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1=new Circle (3.14);
		System.out.println(c1);
	}

}


Circle.java
public class Circle {
	private double radius;
	//this is Called by main
	public Circle(double radius) {
		this.radius = radius;
	}
	
	//This is used to print as return
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	
	
}


//3 After extending with inheritance of GeometricObject
Main.java
public class Main {

	public static void main(String[] args) {
		Circle c1=new Circle (3.14,"Yellow","The Date");//#1
		System.out.println(c1);
	}

}


Circle.java
public class Circle extends GeometricObject{

	private double radius;
	//this is taken
	/*public Circle(double radius) {
		this.radius = radius;
	}*/
	//Lecture
	//Since Circle is being called which extends to Geometric Objet
	//You need to create the constructor of Geometric Object as well
	public Circle(double radius, String colorName, String date) {//#2
	super("White", true,"Dateyo");
	this.radius = radius;//#6
	System.out.println(super.date);//#7//Dateyo
	}

	//This is used to print
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]"; //#8 returns Circle [radius=3.14]
	}	
	
}

GeometricObject.java
public class GeometricObject {
	
	public String ColorFilled;
	protected boolean isFilled;
	public String date;


	public GeometricObject(String colorFilled, boolean isFilled, String date) {
		ColorFilled = colorFilled;
		this.isFilled = isFilled;
		this.date = date;
		System.out.println("In super Constructor");//#4
		System.out.println(isFilled);//#5  //true
	}
	
}


Output:
In super Constructor //In the Geometric Construcor 
true				//System.out.println(isFilled);Geometric 
Dateyo				//System.out.println(super.date); Use super to call back Geometric Date
Circle [radius=3.14]//return String for Circle


//Wednesday
//1 Private used, and super()
Main.java
public class Main {

	public static void main(String[] args) {
		
		Circle c1=new Circle (3.14,"Yellow",true);
		System.out.println(c1);
		GeometricObject g1 =new GeometricObject("Pink",true);
		System.out.println(g1);
	}

}

Geometric Object
public class GeometricObject {
	//private added here
	private String ColorFilled;
	protected boolean isFilled;
	

	public GeometricObject(String colorFilled, boolean isFilled) {
		ColorFilled = colorFilled;
		this.isFilled = isFilled;			
	}


	@Override
	public String toString() {
		return "GeometricObject [ColorFilled=" + ColorFilled + ", isFilled=" + isFilled + "]";
	}
	//getters
	public String getColorFilled() {
		return ColorFilled;
	}
	
	//setters
	public void setColorFilled(String colorFilled) {
		ColorFilled = colorFilled;
	}
	public boolean isFilled() {
		return isFilled;
	}	
	public void setFilled(boolean isFilled) {
		this.isFilled = isFilled;
	}	
	
}

Circle.java
public class Circle extends GeometricObject{
	
	private double radius;	
	public Circle(double radius,String colorFilled, boolean isFilled) {
	super(colorFilled, isFilled);	
	//super("White", true);	will be replaced once called
	this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", ColorFilled=" + getColorFilled() + ", isFilled=" + isFilled + 
				 "]";
	}


//2 Use of Polymorphism
//Polymorphism is useful for abstract method and interface
//Overloading of Constructors
//Geometric and Circle being called
public class Main {
	public static void main(String[] args) {	
		
		
		//Overloading
		//Even though only 2 argument we already passed the third in super, different from //1
		Circle c1=new Circle (3.14,"Yellow");
		System.out.println(c1);
		
		GeometricObject g1 =new GeometricObject("Pink",true);
		System.out.println(g1);
		
		GeometricObject g2 =new Circle(4,"blue");
		System.out.println(g1);
	}
}



public class Circle extends GeometricObject{

	private double radius;
	public Circle(double radius,String colorFilled) {
	super(colorFilled, true);	
	//super("White", true);	
	this.radius = radius;
	
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", ColorFilled=" + getColorFilled()+ ", isFilled=" + isFilled + 
				 "]";
	}	
}


Geometric Object
public class GeometricObject {
	private String ColorFilled;
	protected boolean isFilled;
	

	public GeometricObject(String colorFilled, boolean isFilled) {
		ColorFilled = colorFilled;
		this.isFilled = isFilled;			
	}


	@Override
	public String toString() {
		return "GeometricObject [ColorFilled=" + ColorFilled + ", isFilled=" + isFilled + "]";
	}
	public String getColorFilled() {
		return ColorFilled;
	}

	public void setColorFilled(String colorFilled) {
		ColorFilled = colorFilled;
	}
	public boolean isFilled() {
		return isFilled;
	}	
	public void setFilled(boolean isFilled) {
		this.isFilled = isFilled;
	}	
	
}
Output:
Circle [radius=3.14, ColorFilled=Yellow, isFilled=true]
GeometricObject [ColorFilled=Pink, isFilled=true]
Circle [radius=4.0, ColorFilled=blue, isFilled=true]


//3 Calling Constructors

public class Faculty extends Employee {
	public static void main (String[] args) {
		new Faculty();
		
	}
	public Faculty() {
		System.out.println("4. Performs Faculty Task.");
	}
}		
		
class Employee extends Person	{
	public Employee() {
		this("2. Invoke Employee's overload constructor");
		System.out.println("3. Performs Employee Task.");
	}
	public Employee (String s) {
		System.out.println(s);
	}
	
}
		
 class Person{
	 public Person() {
		 System.out.println("1. Performs Person's Task.");
	 }
	
}

Output:1,2,3,4

//4 This wont work without a default
public class Apple extends Fruit{
	public static void main(String[] args) {
		new Apple();
	}	
}
//No Fruit Default.Won't work
class Fruit{
	public Fruit(String name) {
		System.out.println("Fruit Constructor is callled")
	}
	
}


//5 Override
@Override
Used when repeating the same function with same number of argument

Overload
Used when its the same function but differnt number of argument
Ex: Constructor

abstract(CLASSES) also restrict the creation of objects from super class
public class Geometric (into)public abstract class Geometric

GeometricObject g1 =new GeometricObject("Pink",true); (ERROR!)
GeometricObject g2 =new Circle(4,"blue"); (AVAILABLE)

abstract(METHOD) forces all the subclasses to have at least one of the method
you can only call abstract method in an abstract class

//6 abstract method

//abstract class allows you to call abstract method
public abstract class GeometricObject {
	
	private String ColorFilled;
	protected boolean isFilled;
	

	public GeometricObject(String colorFilled, boolean isFilled) {
		super();
		ColorFilled = colorFilled;
		this.isFilled = isFilled;
			
	}
	//Abstract Area(abstract method only allowed in abstract class)
	public abstract double getArea();
	
}


public class Rectangle extends GeometricObject {

	private double length;
	private double width;
	
	
	public Rectangle(double length, double width) {
		super("Blue",true);
		this.length = length;
		this.width = width;
	}
	//Force rectangle to have the function
	public double getArea() {
		return length*width;
	}
			
}
	
//7 
/*Reason why in an abstract class you still have constructors is because
you can call  them in the subclasses*/


//8 Example for Interface ( Not fully sure)
Edible.java(Interface)
public interface Edible {
	public String howToEat();
}

Fruit.java
abstract class Fruit implements Edible{

}

class Orange extends Fruit {

	@Override
	public String howToEat() {	
		return "Make Orange Juice";
	}

}

class Apple extends Fruit {

	@Override
	public String howToEat() {	
		return "Make Apple Cider";
	}

}

Animal.java
abstract class Animal {
	private double weight;
	
	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	public abstract String sound();
}


class Chicken extends Animal implements Edible {

	@Override
	public String howToEat() {
		return "Chicken : Fry it";
	}

	@Override
	public String sound() {
		return "Chicken : Cock -a -doodle doo";
	}

}


class Tiger extends Animal {

	@Override
	public String sound() {
		return "Tiger: ROAR";
	}

}






public class TestEdible {

	public static void main(String[] args) {
		Object[] objects = {new Tiger(), new Chicken (), new Apple()}	;
		for (int i=0; i<objects.length; i++) {
			if (objects[i]instanceof Edible) {
				System.out.println(((Edible)objects[i]).howToEat());		
			}
			if (objects[i]instanceof Animal) {
				System.out.println(((Animal)objects[i]).sound());		
			}
		}
	}
}	

Output:
Tiger: ROAR
Chicken : Fry it
Chicken : Cock -a -doodle doo
Make Apple Cider

//FRIDAY
//1 Abstract and Polymorphism

//abstract class added here
public abstract class GeometricObject {	
	private String ColorFilled;
	protected boolean isFilled;
	
	public GeometricObject(String colorFilled, boolean isFilled) {
		super();
		ColorFilled = colorFilled;
		this.isFilled = isFilled;			
	}
	
	@Override
	public String toString() {
		return "GeometricObject [ColorFilled=" + ColorFilled + ", isFilled=" + isFilled + "]";
	}

	public String getColorFilled() {
		return ColorFilled;
	}
	
	
	public void setColorFilled(String colorFilled) {
		ColorFilled = colorFilled;
	}
		
	public boolean isFilled() {
		return isFilled;
	}

	public void setFilled(boolean isFilled) {
		this.isFilled = isFilled;
	}	
	
	public void print() {
		System.out.println("Hello from Superclass");
	}
	//abstract method added here
	public abstract double getArea();	
}


Circle.java
public class Circle extends GeometricObject{

	private double radius;
	
	public Circle(double radius,String colorFilled) {
	//Fixed isFilled
	super(colorFilled, true);	
	this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", ColorFilled=" +getColorFilled()+ ", isFilled=" + isFilled + 
				 "]";
	}

	@Override
	public void print() {
		System.out.println("Hello from Circle");
	}
	//forced abstract method in Circle
	@Override
	public double getArea() {
		return radius;
	}
}


Main.java
public class Main {
	public static void main(String[] args) {
		Circle c1=new Circle (3.14,"Yellow");
		System.out.println(c1);
		
		//This no longer work, can no longer create a class usingGeometric Object
		//(NOT WORKING!)	
		***********************************
		GeometricObject g1 =new GeometricObject("Pink",true);
		System.out.println(g1);	
		***********************************
		
		//Good thing about calling the super class is we can easily print out all the 
		//Geometric objects at once
		//Solved using Polymorphism
		GeometricObject g2 =new Circle(4,"blue");
		System.out.println(g2);
		
		//Same output
		Circle c2 =new Circle(4,"blue");
		System.out.println(c2);
					
	}

}

Output:
Circle [radius=3.14, ColorFilled=Yellow, isFilled=true]
Circle [radius=4.0, ColorFilled=blue, isFilled=true]
Circle [radius=4.0, ColorFilled=blue, isFilled=true]


//2 Using final
// EVERYTHING WILL COMPLAIN, NO LONGRER ABLE TO EXTEND
Geometric.java
public abstract final class GeometricObject {
	
	public String ColorFilled;
	public boolean isFilled;
	

	public GeometricObject(String colorFilled, boolean isFilled) {
		super();
		ColorFilled = colorFilled;
		this.isFilled = isFilled;
			
	}
	
	@Override
	public String toString() {
		return "GeometricObject [ColorFilled=" + ColorFilled + ", isFilled=" + isFilled + "]";
	}

	
	public abstract double getArea();
	
}
Main.java
public class Main {
	public static void main(String[] args) {
		Circle c1=new Circle (3.14,"Yellow");
		System.out.println(c1);

		//This no longer work after Geometric Object is instantiate with final
		//(NO LONGER WORK!)	
		***********************************
		GeometricObject g2 =new Circle(4,"blue");
		System.out.println(g2);
		***********************************		
		//Same output
		Circle c2 =new Circle(4,"blue");
		System.out.println(c2);
					
	}

}
Circle.java
//CAN NO LONGER BE USED
//NO EXTENDING
//NO SUPERCLASS
//NO MORE OVERRIDING
//NO MORE ABSTRSACT METHOFD
public class Circle extends GeometricObject{

	private double radius;
	
	public Circle(double radius,String colorFilled) {
	//Fixed isFilled
	super(colorFilled, true);	
	this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	
}


//3 Start of Polymorphism
//Using polymorphism to print everything out together
//Since theres only toString for Geometric and Circle and Rectangle
//Square will use the toString of its parent class
import java.util.ArrayList;
import java.util.List;

public class GeometricObject {
	public static void main(String[] args) {
		
		List<GeometricObject> One = new ArrayList<GeometricObject>();
		One.add(new Circle(1,"Black"));
		One.add(new Rectangle(1,2));
		One.add(new Square(1));
		One.add(new GeometricObject(null,false));
		
		printObject(One);
		
	}

	private static void printObject(List<GeometricObject> array) {
		for (GeometricObject x:array) {
			System.out.println(x);
		}
		
	}

}

Circle.java
public class Circle extends GeometricObject{

	public double radius;
	public Circle(double radius,String colorFilled) {
	super(colorFilled, true);	
	//super("White", true);	
	this.radius = radius;
	
	}
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", ColorFilled=" +ColorFilled+ ", isFilled=" + isFilled + 
				 "]";
	}
}



public class Rectangle extends GeometricObject {

	private double length;
	private double width;
	
	
	public Rectangle(double length, double width) {
		super("Blue",true);
		this.length = length;
		this.width = width;
	}
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + ", ColorFilled=" + ColorFilled + ", isFilled="
				+ isFilled + "]";
	}

				
}

//has no ToString Method
public class Square extends GeometricObject{

	private double length;

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public Square(double length) {
		super("Green",false);
		this.length = length;
	}

}

Circle [radius=1.0, ColorFilled=Black, isFilled=true]
Rectangle [length=1.0, width=2.0, ColorFilled=Blue, isFilled=true]
GeometricObject [ColorFilled=Green, isFilled=false]
GeometricObject [ColorFilled=null, isFilled=false]

//4 Other type of list (.intValue()) convert Integer to int 
Demo.java
import java.util.ArrayList;
import java.util.List;

class Demo{
	public static void main(String[] args) {
	List<Integer> listName = new ArrayList<Integer>();
	Integer i = 6;
	int t=4;
	int r=t+i.intValue();
	System.out.println(r);
	
	listName.add(200);
	listName.add(i);
	listName.add(new Integer(11));
	listName.add(new Integer(5));
	listName.add(new Integer(41));
	
	System.out.println(getMax(listName));	
	}


//5 Other type of list (find Max)
Demo.java
import java.util.ArrayList;
import java.util.List;

class Demo{
	public static void main(String[] args) {
	List<Integer> listName = new ArrayList<Integer>();
	
	Integer i = 6;

	listName.add(200);
	listName.add(i);
	listName.add(new Integer(11));
	listName.add(new Integer(5));
	listName.add(new Integer(41));
	
	System.out.println(getMax(listName));	
	}

	private static Integer getMax(List<Integer> listName) {
		Integer Max=listName.get(0);
		for (Integer i:listName) {
			if (i.intValue()>Max.intValue()) {
				Max=i;
			}
				
		}
		
		return Max;
	}
}
10
200


//5 Sets are unordered
//to get the first one use.next()
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Demo{
	public static void main(String[] args) {
	Set<Integer> listName = new HashSet<Integer>();
	
	Integer i = 6;
	int t=4;
	int r=t+i.intValue();
	System.out.println(r);
	
	listName.add(i);
	listName.add(200);
	listName.add(new Integer(11));
	listName.add(new Integer(5));
	listName.add(new Integer(41));
	
	System.out.println(getMax(listName));
	
		
	}

	private static Integer getMax(Set<Integer> listName) {
		//Integer Max=listName.get(0);//get position (0) (WONT WORK)
		//.iterator().next () to get the first one
		Integer Max=listName.iterator().next();
		for (Integer i:listName) {
			if (m.intValue()>Max.intValue()) {
				Max=i;
			}
				
		}
		
		return Max;
	}
}

//6 Combine repition (using polymorphism)
//Since set and integer has the same superclass
Demo.java
import java.util.ArrayList;
import java.util.List;

class Demo{
	public static void main(String[] args) {
	//Repeated
	List<Integer> intArray = new ArrayList<Integer>();
	Set<Integer> setArray = new HashSet<Integer>();
	
	intArray.add(200);
	intArray.add(new Integer(11));
	intArray.add(new Integer(5));
	intArray.add(new Integer(41));
	
	setArray.add(200);
	setArray.add(new Integer(11));
	setArray.add(new Integer(5));
	setArray.add(new Integer(41));
	
	System.out.println(getMax(intArray );	
	System.out.println(getMax(setArray));
	}

//Both return Integer
//But the input is different
	private static Integer getMax(List<Integer> listName) {
		Integer Max=listName.get(0);
		for (Integer i:listName) {
			if (i.intValue()>Max.intValue()) {
				Max=i;
			}
				
		}
		
		return Max;
	}
}

	private static Integer getMax(Set<Integer> listName) {
	
		Integer Max=listName.iterator().next();
		for (Integer i:listName) {
			if (m.intValue()>Max.intValue()) {
				Max=i;
			}
				
		}
		
		return Max;
	}
}
	
	
//7 Result of combining
//But this still cannot handle doubles
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Demo{
	public static void main(String[] args) {
	//Repeated
	List<Integer> listName = new ArrayList<Integer>();
	Set<Integer> setArray = new HashSet<Integer>();
	
	listName.add(200);
	listName.add(new Integer(11));
	listName.add(new Integer(5));
	listName.add(new Integer(41));
	

	setArray.add(new Integer(11));
	setArray.add(new Integer(5));
	setArray.add(new Integer(41));
	
	System.out.println(getMax(listName));	
	System.out.println(getMax(setArray));
	}

	
	private static Integer getMax(Collection <Integer> listName) {
		
		Integer Max=listName.iterator().next();
		for (Integer i:listName) {
			if (i.intValue()>Max.intValue()) {
				Max=i;
			}
				
		}
		
		return Max;
	}
}




//8 In order to handle doubles and integr
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Demo{
	public static void main(String[] args) {
	//Repeated
	
	//#2 One List for Int and OneSet for Double
	
	//List<Integer> listName = new ArrayList<Integer>();
	//Set<Double> setArray = new HashSet<Double>();
	
	//#5 For some reason getMax function do not like to take in Int and Numbers
	//Not sure why here
	List<Number> listName = new ArrayList<Number>();
	Set<Number> setArray = new HashSet<Number>();
	
	listName.add(200);
	listName.add(new Integer(11));
	listName.add(new Integer(5));
	listName.add(new Integer(41));
	

	setArray.add(new Double(11.34));
	setArray.add(4.23);
	setArray.add(new Double(3));
	
	System.out.println(getMax(listName));	
	System.out.println(getMax(setArray));
	}

	//#1 Change Integer to Number
	private static Number getMax(Collection <Number> listName) {
		
		//#3 Use iterator instead of get
		Number Max=listName.iterator().next();
		for (Number i:listName) {
			//#4 Change to double value since it can also take int
			if (i.doubleValue()>Max.doubleValue()) {
				Max=i;
			}
				
		}
		
		return Max;
	}
}

	
//9 Moving up of the class
//This can still work
	private static Object getMax(Collection <Numbers> listName) {
		
		
		Number Max=listName.iterator().next();
		for (Number i:listName) {
			if (i.doubleValue()>Max.doubleValue()) {
				Max=i;
			}
				
		}
		
		return Max;
	}
}
	
//This can no longer work
//Since Object do not contain the iterator function as it is not appropriate
//to compare classs
	private static Object getMax(Collection <Object> listName) {
		
		
		Number Max=listName.iterator().next();
		for (Number i:listName) {
			if (i.doubleValue()>Max.doubleValue()) {
				Max=i;
			}
				
		}
		
		return Max;
	}
}
	
//Conclusion the reason we use polymorphism to a higher class is so that we can 
//ave a wider coverage and reduce repeated codes
//Too general function will lack some of the methods


//10 Highest class
private static <T> getMax(Collection <T> listName) {

private static <?> getMax(Collection <?> listName) {

//For this only classes within the Number type can use this function Ex:(Integer/Double)
private static <T extends Number> getMax(Collection <T extends Number> listName) {
//Will be the same as just
private static <Number> getMax(Collection <Number> listName) {

//11 Using instanceOf to check the parent class ( Not really sure)
//If it is it will print or else it wll not print
		
		GeometricObject g2 =new Circle(4,"blue");
		//instanceOf:this object is a subclass of 
		if (g2 instanceof Circle) {
			Circle c2 =(Circle) new GeometricObject("blue",true);
		}






	