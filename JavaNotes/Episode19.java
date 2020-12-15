/******************************************************************************
Episode 19: Constructors (Makes Objects)

*******************************************************************************/
//0
//Main.java

public class Main{
	public static void main (String[] args){
		//Shirt() is the default constructor
		Shirt s= new Shirt();//Prints Inside constructor
		
		s.putOn();//Prints Shirt is on
	
	}
}

//Shirt.java
public class Shirt{
	//Attribute//Properties
	private String color;
	private char size;

	Shirt(){
		System.out.println("Inside constructor!");
	}

	
	//Things the shirt can do (Methods)
	public static void putOn(){
		System.out.println("Shirt is on!");
	}
	
	public static void putOff(){
		System.out.println("Shirt is off!");
	}
	

}
//Inside a constructor
//Shirt is on


//1 Normal Way
Main.java

public class Main{
	public static void main (String[] args){
		//Shirt() is the default constructor
		//s object we created is now White and M
		Shirt s= new Shirt();//Prints Inside Constructor
			
    	s.setColor("White");
		s.setSize('M');
		s.putOn();//Shirt is on
		
		System.out.println(s.color);//White
		System.out.println(s.size);//M
	
	}
}

//Shirt.java 
public class Shirt{
	//Attribute//Properties
	public static String color;
	public static char size;

	Shirt(){
		System.out.println("Inside constructor!");
	}

	
	//Things the shirt can do (Methods)
	public static void putOn(){
		System.out.println("Shirt is on!");
	}
	
	public static void putOff(){
		System.out.println("Shirt is off!");
	}
	
	
	public static void setColor (String newColor){
	    color= newColor;
	}
    public void setSize(char size){
    	this.size=size;
    }

}

//2 Use constructor as a shortcut


public class Main{
	
	public static void main (String[] args){
		
		Shirt s= new Shirt("White",'M');//s object we created is now White and M

		System.out.println(s.color);
		System.out.println(s.size);
	
	}
}


public class Shirt{
	//Attribute//Properties
	public static String color;
	public static char size;

	//Constructor created
	Shirt(String newColor,char newSize){
		this.color=newColor;
		this.size=newSize;
	}

	
	//Things the shirt can do (Methods)
	public static void putOn(){
		System.out.println("Shirt is on!");
	}
	
	public static void putOff(){
		System.out.println("Shirt is off!");
	}
	
	
	public static void setColor (String newColor){
	    color= newColor;
	}
    public static void setSize(char newSize){
    	size=newSize;
    }

}


