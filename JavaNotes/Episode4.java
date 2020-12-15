/******************************************************************************
Episode 4: Classes and Object

Class: Vehicle     Object: Mercedes
-Price   			-$50,000
-Speed				-120miles/hour
-Colour             -Green
*******************************************************************************/
//1 
//Exercise 1
// You are a business owner who owns several grocery store
//All of your store sells only apple and oranges
//Create a class called groceryStore with 4 member variable
/**
number of apples sold per year
retail price of each apple
number of oranges sold per year
retail price of each orange
**/


/**3 groceryStore:
Object of the class groceryStore

711Store
familyMartStore
99speedMartStore
**/



public class Main {
	public static void main (String[] args){
	//class     objects
	groceryStore 711Store = new groceryStore(); //creates object of class groceryStore
	groceryStore familyMartStore=new groceryStore();
	groceryStore 99speedMartStore=new groceryStore();

	}

}

//each class has 4 variable
class groceryStore{
	int appleSoldPerYear;
	double retailPriceOfApple;
	
	int orangeSoldPerYear;
	double retailPriceOfOrange;
	
}










public class Main{
	public static void main(String[] args) {
	  
	    Dog dogFido = new Dog("Fido");
	    System.out.println(dogFido.getName());
	}
}	

//Main.java

public class Main
{
	public static void main(String[] args) {
	   //new object = new class
	    Dog dogFido = new Dog("Fido");
	    System.out.println(dogFido.getName());
	}
}	


//Dog.java
public class Dog{
    
    String name= NULL;
    
    //Constructor
    public Dog(String name){
        this.name = name;    
        
    }
    
    public String getName(){
	    return name;    
	}

    
}



    