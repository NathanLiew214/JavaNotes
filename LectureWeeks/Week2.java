//Monday (Loops)
//1 Loops (global variable and domestic variable)
public class Main{
	public static void main (String[] args){
		for (int i=0; i<5; i++){
			System.out.println("Hi");//5 Hi printed ,0,1,2,3,4 (5 in total)
		}
		System.out.println(i);//i will be invalid here
	}
}


//2 Loops (global variable and domestic variable)
public class Main{
	public static void main (String[] args){
		int i; //global declaration
		for (i=0; i=<5; i++){//(6 in total)
			System.out.println("Hi");
		}
		System.out.println(i);//i=6 here
	}
}

//3 Nested Loops in Java
public class Main{
	public static void main (String[] args){
		int i,j; //global declaration
		for (i=0; i<5; i++){
			for (j=0; j<3; j++){
				System.out.println("Hi");//Total printed = 15 5 rows 3 columns
		}
		System.out.println(i);//i=5
	}
}

//4 While loops
public class Main{
	public static void main (String[] args){
		int z=9;
		while(z>5){
			System.out.println(z);	//infinite loop keep printing 9 ( it is always larger than 9)
			break;//this is needed to break the loop
		}		
	}
}

//5 While loops decrementation
public class Main{
	public static void main (String[] args){
		int z=9;
		while(z>5){
			System.out.println(z);	//infinite loop keep printing 9 ( it is always larger than 9)
			z--;//9,8,7,6
		}		
	}
}

//6 Array
public class Main{
	public static void main (String[] args){
		//int ar[5]={1,2,3,4,5};//cannot put size
		//int ar[]= new int [5]; better way
		int ar[]={1,2,3,4,5};//this also works
		int i,j;
		for (i=0; i<5; i++){
		System.out.println(ar[i]);
		
		}
	}
}

//7 using sizeofarray

public class Main{
	public static void main (String[] args){
		int i,j;
		int ar[]={1,2,3,4,5};
		//Original
		for (i=0; i<ar.length; i++){
		System.out.println(ar[i]);		
		}
	}
}

//8 shorter form called collection
public class Main{
	public static void main (String[] args){
		int i,j;
		int ar[]={1,2,3,4,5};
		
		//New method: Collection
		for (int number:ar){
		System.out.println(number);	
		}
	}
}
//9 Comparison
	for (i=0; i<ar.length; i++){
		System.out.println(ar[i]);		
	}
	(same as)
	//declare number as collection: ar, print number
	for (int number:ar){
		System.out.println(number);	
	}

//10 Dynamic Allocation in Java and C comparison
In C
(Stack)
int p[4];
//Heap
int *ptr = (int *)malloc(sizeof(int)*4);
//Transition
int *ptr = malloc[4];--> int* ptr = malloc(sizeof(int)*4)--> int *ptr = (int *)malloc(sizeof(int)*4);

In Java
//Stack
int ar[]={1,2,3,4,5};//size cannot be set
//Heap
int ar[]= new int [5];



//11 Using other variable types
int ar[]= new int [100];
String coursename [] = new String[100];
courseNames[0]="CSE156";
	
		
//12 Garbage Values in Java is 0 , there will not be random values like c
public class Main{
	public static void main (String[] args){
		String courseNames[]= new String [7];
		courseNames[0]="CSE156";
		
		int num[]= new int [9];
		num[0]=10;
		num[5]=4;
		
		for(int number:num){
		System.out.println(number);	
		}
	}
}

//13 Combining (Garbage values for String data type is null)
public class Main{
	public static void main (String[] args){
		String courseNames[]= new String [7];
		courseNames[0]="CSE156";
		
		int num[]= new int [9];
		num[0]=10;
		num[5]=4;
		
		for(int number:num){
		    System.out.println(number);	
		}
		System.out.println("\n");	
		
		// String data type is used
		for(String arr:courseNames){
	        System.out.println(arr);	
		}
	}
}

//Wednesday (Array List)
//1 Two Dimensional Array
public class Main{
	public static void main (String[] args){
		int num[][]= new int [9][9];
		
	}
}


//2 List Array
public class Main{
	public static void main (String[] args){
		List<Integer> 1st = new ArrayList<Integer>();
		1st.add(1);
		1st.add(2);
		1st.add(3);
		System.out.println(1st);// [1,2,3,4]	
		
	}
}
	
//3 Add add a certain place
public class Main{
	public static void main (String[] args){
		List<Integer> 1st = new ArrayList<Integer>();
		1st.add(1);
		1st.add(2);
		1st.add(3);
		System.out.println(1st);// [1,2,3,4]
		1st.add(0,5);///add 5 on the first array [0]
		System.out.println(1st);//[5,1,2,3,4]
		1st.remove(1);
		System.out.println(1st);//[5,2,3,4]	
		
	}
}

//4 Loop through the Array List
public class Main{
	public static void main (String[] args){
		List<Integer> 1st = new ArrayList<Integer>();
		1st.add(1);
		1st.add(2);
		1st.add(3);
		System.out.println(1st);// [1,2,3,4]
		
		for (int i=0; i <1st.size();i++){
			Systerm.out.println(1st.get(i));
		}
		
	}
}

//5 Other format to loop through
public class Main{
	public static void main (String[] args){
		List<Integer> 1st = new ArrayList<Integer>();
		1st.add(1);
		1st.add(2);
		1st.add(3);
		System.out.println(1st);// [1,2,3,4]
		
		for (Integer item:1st){
			System.out.println(item);

		}
		
	}
}


}

//6 Comparison for Stack Heap Type and Array List Type
    //A //Stack Array (array.length) && //Heap Array
    int ar[]={1,2,3,4,5};//size restricted
    int num[]= new int [9];
    
	for (i=0; i<ar.length; i++){
		System.out.println(ar[i]);		
	}

	//declare number as collection: ar, print number
	for (int number:ar){
		System.out.println(number);	
	}
	
	VS
	
	//B Array List (Link List) (1st.size())//not size restricted 
	for (int i=0; i <1st.size();i++){
			Systerm.out.println(1st.get(i));
	}
	
	for (Integer item:1st){
		System.out.println(item);
	}
	
//7 Sets
// They are unique and unordered, the number are not in order
public class Main{
	public static void main (String[] args){	
		//sets (Import Sets and will add sets library)
		Set<String> CourseNames= new Hashset<String>();
		CourseNames.add("CSE156");
		CourseNames.add("CSE310");
		CourseNames.add("CSE451");	
	    
		System.out.println(CourseNames);
	}
}//Output [CSCE155,CSCE156,CSCE310,CSCE451] // Not in Order


//8 Won't Work (Add, Remove, Duplicate, No Loop Through)(Call the Name to Remove)
public class Main{
	public static void main (String[] args){	
		//sets (Import Sets and will add sets library)
		Set<String> CourseNames= new Hashset<String>();
		CourseNames.add("CSE156");
		CourseNames.add("CSE310");
		CourseNames.add("CSE451");	
	    
	    //Won't Work (add or removing)
		CourseNames.add(2,"CSE222");	//(Will not work)
		Coursename.remove(0)// ( Will not work) ( need to specify the name)	
		CourseNames.add("CSE156");//It will not repeat, no duplicate	
		for(int i=0,i<CourseName.size(),i++){// loops to iterate won't work 
			System.out.println(CourseNames.get(i));
		}
		
		
		
		//Call to Remove
		CourseNames.remove("CSE156");
		//Use the Hash Loop
		(String name:CourseNames){ // All loops to iterate won't work 
		System.out.println(name);
		}
		
		System.out.println(CourseNames);
	}
}

//9 Combining Sets
{1,2,4} {2,5,6} Union Operation Required
{1,2,4,5,6}


//Friday (Using Sets)






