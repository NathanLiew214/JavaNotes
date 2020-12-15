//Monday 
//1  Change format of String to Integer
public class Main{
	public static void main (String[] args){
		//System.out.print(HelloWorld.fact(4));
		
		//int x="123";
		int x= Integer.parseInt("123");
		System.out.print(x);
		
	}
}

//2 If it has no number (Error)
public class Main{
	public static void main (String[] args){
		
		int x= Integer.parseInt("txt"); not converted
		System.out.print(x);
		
	}
}

//3 try catch //General Exception
public class Main{
	public static void main (String[] args){
		try
		{
		int x= Integer.parseInt("txt"); not converted
		System.out.print(x);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}	
//4	NumberFormatException //try { } catch (NumberFormatException e) { }
public class Main{
	public static void main (String[] args){
		try
		{
		int x= Integer.parseInt("txt"); //not converted //Numbers Format Exception
		System.out.print(x);
		}
		catch (NumberFormatException e)
		{
			System.out.print("Hi from exception");
			e.printStackTrace();
		}
//5 Arithmetic Exception
public class Main{
	public static void main (String[] args){
		try
		{
		int z=4/0;//(Arithmetic Exception)
		int x= Integer.parseInt("txt"); not converted
		System.out.print(x);
		}
		catch (Exception e)
		{	
			System.out.print("Hi from General Exception");
			e.printStackTrace();
		}	
		catch (NumberFormatException e)//will not catch
		{
			System.out.print("Hi from Numbers Format Exception");
			e.printStackTrace();
		}
		catch (Arithmetic Exception e)//will not catch
		{
			System.out.print("Hi from Arithmetic Format Exception");
			e.printStackTrace();
		}	
	}
}	
//6 Finally Block (Always Run)
public class Main{
	public static void main (String[] args){
		try
		{
		int x= Integer.parseInt("txt"); not converted
		System.out.print(x);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}	
		finally{
			System.out.print("Hi from finally block");
		}	
	}
}	
				
//7 Finally Block Testing	
	public class Main{
	public static void main (String[] args){
		try
		{
		int z=4/1;//(Arithmetic Exception)
		int x= Integer.parseInt("txt"); not converted
		System.out.print(x);
		}
		catch (Exception e)
		{	
			System.out.print("Hi from General Exception");
			e.printStackTrace();
		}	
		catch (NumberFormatException e)//will not catch
		{
			System.out.print("Hi from Numbers Format Exception");
			e.printStackTrace();
		}
		catch (Arithmetic Exception e)//will not catch
		{
			System.out.print("Hi from Arithmetic Format Exception");
			e.printStackTrace();
		}
		finally{
			System.out.print("Hi from finally block");
		}	
	}
}	

//8 Reading from File 
// Types: Character by Character //Or by Byte(Image)
public class Main{
	public static void main (String[] args){
	Scanner s = new Scanner (new File("mm.txt"));
	}
}

//9 FileNotFoundException	
public class Main{
	public static void main (String[] args)throw FileNotFoundException{
	Scanner s = new Scanner (new File("mm.txt"));
	}
}

//10 FileNotFoundException using catch method
public class Main{
	public static void main (String[] args){
		try{
			Scanner s = new Scanner (new File("mm.txt"));
		}catch (FileNotFundException e){		
			e.printStackTrace
		}		
		
	}
	
}

//11 Reading a file
public class Main{
	public static void main (String[] args){
		try{
			Scanner s = new Scanner (new File("mm.txt"));
			String Line1=s.nextLine();
			System.out.print(Line1);
			String Line2=s.nextLine();
			System.out.print(Line2);
			String Line3=s.nextLine();
			System.out.print(Line3);
			String Line4=s.nextLine();
			System.out.print(Line4);		
		}catch (FileNotFundException e){		
			e.printStackTrace();//Output: Hi FromFile123
		}		
		
	}
	
}
//Right click on project folder > new > file
mmm.txt
1.Hi
2.From
3.File
4.123

//12 Combine
import java.io.File;
import java.util.Scanner;

public class Main{
	public static void main (String[] args){
		try{
			Scanner s = new Scanner (new File("mm.txt"));
			while(s.hasNext()){
				String Line=s.nextLine();
				System.out.print(Line);		
			}	
		}catch (FileNotFoundException e){		
			e.printStackTrace();//Output: Hi FromFile123
		}		
		
	}	
}

//13 Wrting on file

public class Main{
	public static void main (String[] args){
		try{	
			File file1= new File("mmm.txt");
			PrintWriter pt = new PrintWriter(file1)
			pt.println("Hello from the print writer");
			pt.close();	
			
		}catch (FileNotFundException e){		
			e.printStackTrace();//Output: Hi FromFile123
		}		
		
	}	
}


//14 Overwrite


//Wednesday(DONE)
//Searching and Sorting
//1 Print ArrayList
import java.util.Arrays;
import java.util.List;

public class Sort {

	public static void main(String[] args) {
		List<Integer> list1 =Arrays.asList(6,3,7,9,1);
		System.out.println(list1);
	}

}

//2 Sort using Collections.sort(list1)
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort {

	public static void main(String[] args) {
		List<Integer> list1 =Arrays.asList(6,3,7,9,1);
		System.out.println(list1);
		
		Collections.sort(list1);
		System.out.println(list1);//[1, 3, 6, 7, 9]

	}

}

//3 Comparator is created to compare in descending order
//0=equal 1=more than -1=less than
//add unimplemented method

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1 =Arrays.asList(6,3,7,9,1);
		System.out.println(list1);
		
		Collections.sort(list1);
		System.out.println(list1);
		
		//0=equal 1=more than -1=less than
		Comparator<Integer>Desc=new Comparator<Integer>() {

			@Override
			public int compare(Integer x, Integer y) {
				// TODO Auto-generated method stub
				return 0;
			}
			
		};
	}

}

//4 Create a Desc Comparator and Sort using the comparator

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1 =Arrays.asList(6,3,7,9,1);
		System.out.println(list1);//[6, 3, 7, 9, 1]
		
		Collections.sort(list1);
		System.out.println(list1);//[1, 3, 6, 7, 9]

		
		//0=equal 1=more than -1=less than
		Comparator<Integer>Desc=new Comparator<Integer>() {

			@Override
			public int compare(Integer x, Integer y) {
				// TODO Auto-generated method stub
				if(x>y) {
					return -1;
				}else if(y>x){
					return 1;
				}
				return 0;
			}
			
		};
		
		Collections.sort(list1,Desc);
		System.out.println(list1);//[9, 7, 6, 3, 1]
	}

}

//5 Searching function
//Sequential VS Binary Search [(Faster) (Sorted first) (log n)]
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1 =Arrays.asList(6,3,7,9,1);
		System.out.println(list1);
		
		Collections.sort(list1);
		System.out.println(list1);
		
		
		int t=Collections.binarySearch(list1,7);
		System.out.println(t);//[1, 3, 6, 7, 9]/3
	}
	

}

//6 If you use Desc you need to provide key fr binary search
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1 =Arrays.asList(6,3,7,9,1);
		System.out.println(list1);
		
		Collections.sort(list1);
		System.out.println(list1);
		
		//0=equal 1=more than -1=less than
		Comparator<Integer>Desc=new Comparator<Integer>() {

			@Override
			public int compare(Integer x, Integer y) {
				// TODO Auto-generated method stub
				if(x>y) {
					return -1;
				}else if(y>x){
					return 1;
				}
				return 0;
			}
			
		};
		
		Collections.sort(list1,Desc);
		System.out.println(list1);
		
		int t=Collections.binarySearch(list1,7,Desc);
		System.out.println(t);//[9, 7, 6, 3, 1]//1
	}
	

}

//7 Using contains
//Use back ascending (Number 5)
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1 =Arrays.asList(6,3,7,9,1);
		System.out.println(list1);
		
		Collections.sort(list1);
		System.out.println(list1);
		
		
		int t=Collections.binarySearch(list1,7);
		System.out.println(t);//[1, 3, 6, 7, 9]//in array number 3
		
		boolean b=list1.contains(9);
		System.out.println(b);//true
			
	}
	
}

//8 Using indexOF

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1 =Arrays.asList(6,3,7,9,1);
		System.out.println(list1);
		
		Collections.sort(list1);
		System.out.println(list1);
		
		//0=equal 1=more than -1=less than
		Comparator<Integer>Desc=new Comparator<Integer>() {

			@Override
			public int compare(Integer x, Integer y) {
				// TODO Auto-generated method stub
				if(x>y) {
					return -1;
				}else if(y>x){
					return 1;
				}
				return 0;
			}
			
		};
	
		
		int t=Collections.binarySearch(list1,7);
		System.out.println(t);
		
		int r=list1.indexOf(7);
		System.out.println(r);//indexOf uses sequential 
		//works even with descending or unsorted
		
	}	

}

//Friday
//1 Introduction to classes

public class Student {
	//Attribute
	String NUID;
	String name;
	double CourseGrade1;
	double CourseGrade2;
	double CourseGrade3;
	
	//Constructor
	//Same name as the class name
	//It is already created for you
	//Default constructor
	public Student() {
		NUID="";//if you put 442 it will always set ass 442 first (st1.NUID)
		name="";
		CourseGrade1=00.0;
		CourseGrade2=00.0;
		CourseGrade3=00.0;
		
	}
	
}

public class StudentDemo {
	public static void main (String[] args){
		//class  //object	
		Student st1=new Student();
		st1.NUID = "012423";
		st1.name="Mike";
		st1.CourseGrade1 = 85.9;
		st1.CourseGrade2 = 72.3;
		st1.CourseGrade3 = 88.2;
		
	
		Student st2=new Student();
		st2.NUID = "011323";
		st2.name="John";
		st2.CourseGrade1 = 44.1;
		st2.CourseGrade2 = 34.2;
		st2.CourseGrade3 = 56.2;
		
		
		Student st3=new Student();
		st3.NUID = "042423";
		st3.name="Wendy";
		st3.CourseGrade1 = 90.1;
		st3.CourseGrade2 = 93.2;
		st3.CourseGrade3 = 91.2;
		
		
		System.out.println(st1.NUID);
		System.out.println(st1.name);
				
	}
}

//2 Pass in argument to Student for the ease of creating a constructor

//Student Demo
public class Main {
	public static void main (String[] args){
		//class  //object	
		Student st1=new Student("012423","Mike",85.9,72.3,88.2);
		Student st2=new Student("444","John", 44.1, 34.2, 56.2);
	
		
	  //Can no longer be used	
	/*	Student st3=new Student();
		st3.NUID = "042423";
		st3.name="Wendy";
		st3.CourseGrade1 = 90.1;
		st3.CourseGrade2 = 93.2;
		st3.CourseGrade3 = 91.2;*/
		
		
		System.out.println(st1.NUID);
		System.out.println(st1.name);
				
	}
}

//Student.java
public class Student {
	//Attribute
	String NUID;
	String name;
	double CourseGrade1;
	double CourseGrade2;
	double CourseGrade3;
	
	//Constructor
	//Same name as the class name
	//It is already created for you
	//Default constructor
	public Student(	String NUID,String name,double CourseGrade1	,double CourseGrade2 ,double CourseGrade3) {
		this.NUID=NUID;
		this.name=name;
		this.CourseGrade1=CourseGrade1;
		this.CourseGrade2=CourseGrade2;
		this.CourseGrade3=CourseGrade3;
		
	}
	
}

