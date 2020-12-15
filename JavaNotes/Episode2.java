/******************************************************************************

Episode 2a: Functions (Basic)

*******************************************************************************/
public class Main{
	public static void main(String[] args) {
	    print();//recognize function and go down 
	    //whole line become Hello World
	    
	}

	//Have to print in main
	public static void print(){
	    System.out.println("Hello World!");  
	
   }
}

/******************************************************************************

Episode 2b: Functions (Passing a string into the function)

*******************************************************************************/
public class Main{
	public static void main(String[] args) {
	    print("Hello");//Recognize and then pass the string 
	    
	}

    //Take an argument String
	public static void print(String myString){
	    System.out.println(myString);  //print the pass string
	    //since it's void it return automatically
	
   }
}
    


    
/******************************************************************************

Episode 2c: Calling %d in java

*******************************************************************************/
	
public class Main  {
	
	public static void main(String[] args){
		System.out.println("Program starts");
		printFirstName();
		printLastName();
		addNames();
		System.out.println("Program ends");	
	}

	public static void printFirstName(){
		System.out.println("My first name is Nathan");
	}
 
 	public static void printLastName(){
		System.out.println("My last name is Liew");
	}
 
 	public static void addNames(){
 		int nathan=6;
 		int liew =4;
 		int sum= nathan + liew;
 		System.out.println("The numbers of letters in your full name is "+ sum);	
 	}


}


/******************************************************************************

Episode 3d: Returning varible
*******************************************************************************/
public class Main{
	
	public static void main(String[] args){
		int num1=11;
		int answer = multNumbers(num1);
		System.out.println("When we multiple num1 with 10 we get: "+ answer);//110
	
		int num2 =7;
		System.out.println("When we multiple num2 with 10 we get "+ multNumbers(num2));//70
	
		System.out.println("The added answer for num1 and num2 is "+ addNumbers(num1,num2));//11 +7
		System.out.println("The added answer for 110 and num2 "+ addNumbers(answer,num2));//110+7
		
		boolean statement = equalNumbers (num1,num2);//11,7
		System.out.println("num1 is equal to num2 " + statement);
		
	}
	
	public static int multNumbers (int a){
		int b = a* 10;	
		return b; 
	}
	
	public static int addNumbers (int x, int y){
		int ans = x+y;	
		return ans; 
	}
	
	public static boolean equalNumbers(int r,int t){
		if (r==t){
			return true;
		}else{
			return false;
		
		}
	}
 	
}


/******************************************************************************

Episode 3e: Using boolean
*******************************************************************************/
public class Main{
	
	public static void main(String[] args){
		int num1=11;
		int num2 =7;
		
		int answer1 = multNumbers(num1);
		System.out.println("When we multiply num1 by 10 we get:  "+ answer1);//11*10=110
		
		int answer2 = addNumbers(num1,num2);
		System.out.println("When we add num1 and num2 we get: "+ answer2);//11+7=18
	
	    boolean answer3 = equalNumbers(num1,num2);
		System.out.println("num1 and num2 are equal: "+ answer3);//11 and 7
	}
		
	public static int multNumbers (int a){
		
		return (a*10);
		//int b = a* 10;	
		//return b; 
	}
	
	public static int addNumbers (int x, int y){
		int ans = x+y;	
		return ans; 
	}
	
	public static boolean equalNumbers(int r,int t){
		if (r==t){
			return true;
		}else{
			return false;
		
		}
	}
 	
}

		
		
		
/******************************************************************************

Episode 3f: Functions (Calling a function in a function & returning variable)

*******************************************************************************/
public class Main{
	public static void main(String[] args) {
	    print("Hello " + myName() ); //calling first function myName
	    //called second function print	    
	}
	
    //Take an argument String
	public static void print(String myString){
	    System.out.println(myString); //prints Hello Mary and return back up	
   }
   
   //Declared a string
	public static String myName(){
	    String name= "Mary";
	    return name;
    }
  
} 










   
      