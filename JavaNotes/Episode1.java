/******************************************************************************

Episode 1: Datatypes, String Concatenation and Comments

*******************************************************************************/
public class Episode2{

	public static void main(String[] args) {
		String myVar = "Hello! ";
		//byte take in -128 to 127
		byte b= 127;
		float f = 1.4f;
		int i = 1234;
		long l = 80343403;
		double d = 9.1234543;
		int i2= i + 5;
		
	    String name;
	    name= "Nathan";
	    
	    //Boolean
	    boolean g = false;
	    g= true;
		
		//Concatenation
		System.out.println(myVar + name);//Hello ! Nathan
		System.out.println(i2);//1234+5=1239
	}
}