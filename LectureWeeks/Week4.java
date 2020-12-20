//Monday
//1 get NUID when private

public class StudentDemo {
	public static void main (String[] args){
		//class  //object	
		Student st1=new Student("012423","Mike",85.9,72.3,88.2);
		Student st2=new Student("444","John", 44.1, 34.2, 56.2);
	
		//System.out.println(st1.NUID);//Unable to get when private	
		System.out.println(st1.getNUID());
				
	}
}

public class Student {
	//Attribute
	private String NUID;
	String name;
	double CourseGrade1;
	double CourseGrade2;
	double CourseGrade3;
	
	//Constructor
	//Same name as the class name
	//It is already created for you
	//Default constructor
	public Student(	String NUID,String name,double CourseGrade1,double CourseGrade2 ,double CourseGrade3) {
		this.NUID=NUID;
		this.name=name;
		this.CourseGrade1=CourseGrade1;
		this.CourseGrade2=CourseGrade2;
		this.CourseGrade3=CourseGrade3;
		
	}

	public String getNUID() {
		return NUID;
	}

}



//2 Set
//StingDemo.java
public class StudentDemo {
	public static void main (String[] args){
		//class  //object	
		Student st1=new Student("012423","Mike",85.9,72.3,88.2);
		Student st2=new Student("444","John", 44.1, 34.2, 56.2);
	
	
		
		System.out.println(st1.getNUID());
		
		System.out.println(st1.getCourseGrade1());
		
		st1.setCourseGrade1(42.3);
		System.out.println(st1.getCourseGrade1());// When using get must print
		
		//st1.setCourseGrade1(100.3);
		//System.out.println(st1.getCourseGrade1());//Error
				
	}
}


//Student.java

public class Student {
	//Attribute
	private String NUID;
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

	public String getNUID() {
		return NUID;
	}

	public void setCourseGrade1(double grade) {
		if(grade<0 || grade>100) {
			throw new RuntimeException ("Grades not valid!");
		}
		CourseGrade1=grade;
	}

	public double getCourseGrade1() {
		return CourseGrade1;
	}
		
}

//3 Printing all the get set and get functions
//StudentDemo.java
public class StudentDemo {
	public static void main (String[] args){
		//class  //object	
		Student st1=new Student("012423","Mike",85.9,72.3,88.2);
		Student st2=new Student("444","John", 44.1, 34.2, 56.2);
	
	
		
		System.out.println(st1.getNUID());
		
		System.out.println(st1.getCourseGrade1());
		
		st2.setCourseGrade2(42.3);
		System.out.println(st2.getCourseGrade2());
		
	}
}

//Student.java
public class Student {
	//Attribute
	private String NUID;
	private String name;
	private double CourseGrade1;
	private double CourseGrade2;
	private double CourseGrade3;
	
	//Constructor

	
	public Student(	String NUID,String name,double CourseGrade1	,double CourseGrade2 ,double CourseGrade3) {
		this.NUID=NUID;
		this.name=name;
		this.CourseGrade1=CourseGrade1;
		this.CourseGrade2=CourseGrade2;
		this.CourseGrade3=CourseGrade3;
		
	}

	public String getNUID() {
		return NUID;
	}
	
	
	public double getCourseGrade1() {
		return CourseGrade1;
	}
	
	public void setCourseGrade1(double CourseGrade1) {
		if( CourseGrade1<0 ||  CourseGrade1>100) {
			throw new RuntimeException ("Grades not valid!");
		}
		this.CourseGrade1=CourseGrade1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCourseGrade2() {
		return CourseGrade2;
	}

	public void setCourseGrade2(double CourseGrade2) {
		if( CourseGrade2<0 ||  CourseGrade2>100) {
			throw new RuntimeException ("Grades not valid!");
		}
		this.CourseGrade2 = CourseGrade2;
	}

	public double getCourseGrade3() {
		return CourseGrade3;
	}

	public void setCourseGrade3(double CourseGrade3) {
		if( CourseGrade3<0 ||  CourseGrade3>100) {
			throw new RuntimeException ("Grades not valid!");
		}
		this.CourseGrade3 = CourseGrade3;
	
	}

	
	
}


//4 to string method is to print all at once, 
//dont have to keep using set
//StudentDemo.java

public class StudentDemo {
	public static void main (String[] args){
		//class  //object	
		Student st1=new Student("012423","Mike",85.9,72.3,88.2);
		Student st2=new Student("444","John", 44.1, 34.2, 56.2);
	
	
	
		System.out.println(st1.toString());
		System.out.println(st2.toString());
		
	}
}


//Student.java
public class Student {
	//Attribute
	private String NUID;
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

	
	@Override
	public String toString() {
		return "Student[NUID=" + NUID + ",name=" + name + ",CourseGrade1=" + CourseGrade1
				+ ",CourseGrade2" + CourseGrade2+  ",CourseGrade3=" + CourseGrade3 + "]";
	}
	

}

	
//Wednesday
//1 Object in another object
// Calling Student that contains Course Constructor
StudenDemo.java
public class StudentDemo {
	public static void main (String[] args){
		//class  //object	
		
		Student st1=new Student ();//Call Student Once
		Student st2=new Student ();//Call Student Twice
		Student st3=new Student("012423","Mike",85.9,72.3,88.2);//Not being called
		
	
	}
}


Student.java
public class Student {

	private String NUID;
	String name;
	double CourseGrade1;
	double CourseGrade2;
	double CourseGrade3;

	
//With 5 variable Constructor	
	public Student(	String NUID,String name,double CourseGrade1	,double CourseGrade2 ,double CourseGrade3) {
		this.NUID=NUID;
		this.name=name;
		this.CourseGrade1=CourseGrade1;
		this.CourseGrade2=CourseGrade2;
		this.CourseGrade3=CourseGrade3;
		
	}
	
	private Course c1;
	private Course c2;
	private Course c3;
	
	
	
//Default 
	public Student() {
		System.out.println("Student Constructor");//Student Constructor
		NUID="";
		name="";
		CourseGrade1=0.00;
		CourseGrade2=0.00;
		CourseGrade3=0.00;
		c1=new Course();//Course Constructor		
		c2=new Course();//Course Constructor		
		c3=new Course();//Course Constructor		
	}
	
Course.java
public class Course{
	private String courseID;
	private String courseName;
	private String courseDesc;
	
	
	public Course() {
		System.out.println("Course Constructor");
				
	}
	
}

	
	
(Output)	
Student Constructor
Course Constructor
Course Constructor
Course Constructor
Student Constructor
Course Constructor
Course Constructor
Course Constructor


//2  Constructor is the same as SET (Setting)
//toString is the same as GET (printing)

public class StudentDemo {
	public static void main (String[] args){
		//class  //object	
		
		
		Student st3=new Student("012423","Mike",85.9,72.3,88.2);
		Course c1= new Course("CSE156","CSEII","JAVA");
		Course c2= new Course("CSE123","CSEI","C");
		Course c3= new Course("CSE444","CSEIII","Phyton");
		
		Student st4=new Student("012423","Mike",85.9,72.3,88.2,c1,c2,c3);
		
		System.out.println(st4);
	}
}


Student.java
public class Student {
	//Attribute
	private String NUID;
	String name;
	double CourseGrade1;
	double CourseGrade2;
	double CourseGrade3;
	
	//Constructor
	//Same name as the class name
	//It is already created for you
	//Default constructor
	
	private Course c1;
	private Course c2;
	private Course c3;
	
	

	public Student() {
		NUID="";
		name="";
		CourseGrade1=0.00;
		CourseGrade2=0.00;
		CourseGrade3=0.00;
		c1=new Course();		
		c2=new Course();		
		c3=new Course();		
	}
	
	
	
	public Student(	String NUID,String name,double CourseGrade1	,double CourseGrade2 ,double CourseGrade3) {
		this.NUID=NUID;
		this.name=name;
		this.CourseGrade1=CourseGrade1;
		this.CourseGrade2=CourseGrade2;
		this.CourseGrade3=CourseGrade3;
		
	}
	
	
	

	public Student(String nUID, String name, double courseGrade1, double courseGrade2, double courseGrade3, Course c1,
			Course c2, Course c3) {
		NUID = nUID;
		this.name = name;
		CourseGrade1 = courseGrade1;
		CourseGrade2 = courseGrade2;
		CourseGrade3 = courseGrade3;
		this.c1 = c1;
		this.c2 = c2;
		this.c3 = c3;
	}


	//c1,c32,c3  here prints the whole object
	//to String needed
	@Override
	public String toString() {
		return "Student [NUID=" + NUID + ", name=" + name + ", CourseGrade1=" + CourseGrade1 + ", CourseGrade2="
				+ CourseGrade2 + ", CourseGrade3=" + CourseGrade3 + ", c1=" + c1 + ", c2=" + c2 + ", c3=" + c3 + "]";
	}
		

}
	
public class Course{
	private String courseID;
	private String courseName;
	private String courseDesc;
	
	
	public Course(String  courseID,String  courseName, String  courseDesc) {
		super();
		this.courseID = courseID;
		this.courseName = courseName;
		this.courseDesc = courseDesc;
	}


	public Course() {
				
	}


	/*@Override
	public String toString() {
		return "Course [courseID=" + courseID + ", courseName=" + courseName + ", courseDesc=" + courseDesc + "]";
	}*/
	
		

}

Output1	
Student [NUID=012423, name=Mike, CourseGrade1=85.9, CourseGrade2=72.3, CourseGrade3=88.2, 
c1=Course@7852e922, c2=Course@4e25154f, c3=Course@70dea4e]

Output2
//Remove /**/ add toString in the Course class to print out 
Student [NUID=012423, name=Mike, CourseGrade1=85.9, CourseGrade2=72.3, CourseGrade3=88.2,
c1=Course [courseID=CSE156, courseName=CSEII, courseDesc=JAVA], c2=Course [courseID=CSE123, 
courseName=CSEI, courseDesc=C], c3=Course [courseID=CSE444, courseName=CSEIII, courseDesc=Phyton]]


//3  Shallow Copy of (Course) using C5 
//if you recreate everything and retype it is a deep copy
public class StudentDemo {
	public static void main (String[] args){
		//class  //object	
		
		Course c1= new Course("CSE156","CSEII","JAVA");//$$$$
		Course c2= new Course("CSE123","CSEI","C++");
		Course c3= new Course("CSE444","CSEIII","Phyton");
	
			
		//c1.setCourseID("CSE888");//Add setters to run
		
		Course c5= new Course(c1);//Shallow Copy ^^^^^
		System.out.println(c1);
		System.out.println(c5);
	}
}

Course.java
public class Course{
	private String courseID;
	private  String  courseName;
	private  String  courseDesc;
	
	
/*	public Course() {
		
	}*/
	
	public Course(String  courseID,String  courseName, String  courseDesc) {//$$$
		super();
		this.courseID = courseID;
		this.courseName = courseName;
		this.courseDesc = courseDesc;
	}

	
	//passing in a new course
	// the created c5 will be equal to the c1.courseID ^^^^^^
	public Course(Course a) {
		this.courseID=a.courseID;
		this.courseName = a.courseName;
		this.courseDesc = a.courseDesc;
		
	}


	//Neede to display the content in Course
	@Override
	public String toString() {
		return "Course [courseID=" + courseID + ", courseName=" + courseName + ", courseDesc=" + courseDesc + "]";
	}
	
	
}

Output:c1 and c5 printed
Course [courseID=CSE156, courseName=CSEII, courseDesc=JAVA]
Course [courseID=CSE156, courseName=CSEII, courseDesc=JAVA]


//4 Deep  Copy


//Friday


















































	
	
	
