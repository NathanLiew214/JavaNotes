/******************************************************************************
Episode 15: Concatenation

*******************************************************************************/
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.ArrayIndexOutOfBoundsException;
import java.util.Scanner;

public class Affine{
    
	public static void main(String[] args) {
        Scanner s = null;
        try{
            s = new Scanner(new File(args[0]));
        }catch (Exception e){		
        	e.printStackTrace();
        }
        
       String result="";
       
       System.out.println(s.next());	
       while(s.hasNext()) {
    	   //System.out.println(s.next());	
    	   result =result + s.next();
    	   //System.out.println(s.next());	
    	  // System.out.println(result);	
		}
		s.close();
		//System.out.println(result);	

	}
}
input.txt

df13051a3d36cd28 ea4fbfe9cd0cbfcdeae92fea
0c13ea051328cdeab1b8133d36eabf13051a3d36
cd282fea36e2b10ceab12f3628130c130559eae9
2feab1b8133d36ea36cdfecd2fbf131acd2f4c

s.next()=df13051a3d36cd28
s.nextLine()=df13051a3d36cd28 ea4fbfe9cd0cbfcdeae92fea