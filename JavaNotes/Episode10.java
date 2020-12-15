/******************************************************************************
Episode 10: Exceptions

*******************************************************************************/
//1 ArrayIndexOutOfBoundException
public class Main{
	public static void main(String[] args){
		int a[]={4,5,1};
		System.out.println(a[3]);
	
	}
 }
 //2 Using try catch (General exception)
 public class Main{
	public static void main(String[] args){
		try{
			int a[]={4,5,1};
			System.out.println(a[3]);
		}catch(Exception e){
			System.out.println("An exception happend!")
		}
	}
 }
  
//3 Take in Integer 
import java.util.Scanner

 public class Main{
	public static void main(String[] args){
		Scanner scan= new Scanner(System.in);
		System.out.println("What's your favourite number?");
		
		try{
			//get the next integer that the user enter
			//nextInt()take in number
			int n= scan.nextInt()
			System.out.println(n);	
		}catch(Exception e){
			System.out.println("Sorry please enter a number");
		}
	}
 }
 //4 Exception ( Array Out Of Bound & NULL)

 //try to call the second block which null and out of bound
 public class Main{
	public static void main(String[] args){
		Scanner scan= new Scanner(System.in);
		System.out.println("What's your favourite number?");
		
		try{
			
			int a[]=null;	
			System.out.println(a[1]);					
		
		}catch(NullPointerException e){		
			
			System.out.println("Your array is null");
		}
	}
 }
 
 
 
//5  Solution with Combine Exception
public class Main{
	public static void main(String[] args){
		Scanner scan= new Scanner(System.in);
		System.out.println("What's your favourite number?");
		
		try{
			int a[]=null;
			System.out.println(a[1]);							
		}catch(NullPointerException e){				
			System.out.println("Your array is null");		
		}catch(ArrayIndexOutOFBoundsException e){	
			System.out.println("Your array is out of bounds!");	
		}catch(Exception e){
			System.out.println("Something went wrong!")		
		}
 	}
 }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 