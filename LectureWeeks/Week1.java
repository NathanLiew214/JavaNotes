

//1 Using Argument 
public class HelloWorld {
	// @param args (anything)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(args[0]);

	}
}

//2 Different Printing Formats
public class Main {
	public static void main(String[] args){
		String FName="Nate";
		String LName= "Liew";
		
		int x=10;
		int y= 5;	
		//must use printf for this format println does not work here
		System.out.printf("Number %d Number %d\n",x,y);
		//println or print
		System.out.println(FName+ x + "Liew"+y);	
		
	}
}
//3 Combine the String
public class Main {
	public static void main(String[] args){
		
		String a = "11"
		String b = "12"
		System.out.printf(a+b);
		//output= 1112		
	}
}

//4 If and Else Statement for same numbers

public class Main {
	
	public static void main(String[] args){
				
		String a = "11";
		String b = "12";
		
		if (a==b){
			System.out.println("It is equal");
		}else{
			System.out.println("It is not equal");	
		}	
	}
}

//5 Comparing Strings with == has some cons to it

//String b = new String ("Hi");
//(Class object)= (new Class (object))
// a new class is created for that particular string for that object
//String is a class here , since it's a different string, prints not equal
		
public class Main {
	
	public static void main(String[] args){
				
		String a = "Hi";
		//String b = "Hi";
		String b = new String ("Hi");
		
		if (a==b){
			System.out.println("It is equal");
		}else{
			System.out.println("It is not equal");	
		}	
	}
}

//6 Better way to compare to Strings, using a class associated with a method
// if it is 0 it is a true statement
public class Main {
	
	public static void main(String[] args){
				
		String a = "Hi";
		String b = new String ("Hi");
		
		if (a.compareTo(b)==0){
			System.out.println("It is equal");
		}else{
			System.out.println("It is not equal");	
		}	
	}
}



//7 Comparing a non zero value , either negative or postive
public class Main {
	
	public static void main(String[] args){
				
		String a = "Hi";
		String b = new String ("Hiz"); // b is bigger than a, since a smaller, result = -1
		int result = a.compareTo(b);
		// a comes before b mean a is smaller
		//a comes after b mean a is bigger
		if (result==0){
			System.out.println("It is equal");
		}else if(result>0){
			System.out.println("a is bigger than b");	
		}else if (result<0){
			System.out.println("b is bigger than a");	// this is printed (Hi)[last box is zero] [z contains a value]
		
		}	
	}
}
//8 Check the value
public class Main {
	
	public static void main(String[] args){
				
		String a = "Hiz";
		String b = new String ("Hi");
		int result = a.compareTo(b);
		
		if (result==0){
			System.out.println("It is equal");
		}else if(result>0){
			System.out.println(result +a +b);	//this prints and will be 1, Hiz Hi, a is bigger
		}else if (result<0){
			System.out.println(result +b +a);	
		
		}	
	}
}

//9 Comparing Values ( will not work as values is represented by strings)

public class Main {
	
	public static void main(String[] args){
				
		String a = "9";
		String b = new String ("100");
		int result = a.compareTo(b);
		
		if (result==0){
			System.out.println("It is equal");
		}else if(result>0){
			System.out.println("a is bigger than b");	// It shows a is bigger than b compared 1 vs 9
		}else if (result<0){
			System.out.println("b is bigger than a");	
		}	
	}
}

//10 Converting strings to int variable
// To compare number you have to use int
public class Main {
	
	public static void main(String[] args){
				
		String a = "9";
		String b = new String ("100");
		
		System.out.println(a+b);//Concatenated (9100) with Strings
		
		int a1 = Integer.parseInt(a);
		int b1= Integer.parseInt(b);
		
		
		System.out.println(a1+b1);//(109) as output with int
		
	}
		
}


//11 Going through other calculation
public class Main {
	
	public static void main(String[] args){
				
		String a = "9";
		String b = new String ("100");		
		
		int a1 = Integer.parseInt(a);
		int b1= Integer.parseInt(b);
		
		
		System.out.println(a1+b1);//(109) as output with int
		System.out.println(a1+b1);//91
		System.out.println(a1*b1);//900
		System.out.println(a1/b1);//9/100 = 0.09
		System.out.println(b1%a1);//Remainder sometimes called MOD, 11 with remainder 1		
		
		//System.out.println(a1^b1);this does not work in java
	}
		
}

//13 && and || same as C  (AND and OR)
public class Main {
	
		public static void main(String[] args){
			
			//String a = "4";		
			String a = "9";
			String b = new String ("100");		
			
			int a1 = Integer.parseInt(a);
			int b1= Integer.parseInt(b);
			
			// you cannot compared String ** Remember to use int format
			if (a1!=b1 && a1==9){
			System.out.println("both condition satisfied");	
			}else{
			System.out.println("at least one condition unsatisfied");	
			}
		}
			
	}


//14 Dealing with power or other calculation methods from library
public class Main {
	
	public static void main(String[] args){
				
		String a = "9";
		String b = new String ("100");		
		
		int a1 = Integer.parseInt(a);
		int b1= Integer.parseInt(b);
		
		//this does not work in java (109 printed which is wrong)
		//System.out.println(a1^b1);
		// Better way
		System.out.println(Math.power(a1,b1));
	}
		
}

//15 If Statements with no brackets
public class Main {
	
	public static void main(String[] args){
				
		String a = "9";
		String b = new String ("9");		
		
		int a1 = Integer.parseInt(a);
		int b1= Integer.parseInt(b);
		
		if (a1<4)
		System.out.println(Math.pow(a1,b1));
		System.out.println(a1/b1);// this line does not belong to the if statement, still prints 1
		
	}
		
}


VS
//Better way

public class Main {
	
	public static void main(String[] args){
				
		String a = "9";
		String b = new String ("9");		
		
		int a1 = Integer.parseInt(a);
		int b1= Integer.parseInt(b);
		//args[3]= "34"
		// double halfLife=  Double.parseDouble(args[3]);
		
		if (a1<4){
			System.out.println(Math.pow(a1,b1));
			System.out.println(a1/b1);
		}else{
			System.out.println("Not executed");
		}
	}
		
}









