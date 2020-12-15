/******************************************************************************
Episode 13: Command Line Argument

*******************************************************************************/
//1 water 1 2


public class Main
{
	public static void main(String[] args) {
	    
		System.out.println(args[0]);//water
		System.out.println(args[1]);//1 
		System.out.println(args[2]);//2
				
				
	}
}

//2
//38 Strontium Sr 28.9 10
import java.lang.Math; 
  
class Main{ 
    
    public static void main(String args[]) { 
       int atomicNumber = Integer.parseInt(args[0]);
       String elementName = args[1];
       String elementSymbol =args[2];
       double halfLife=  Double.parseDouble(args[3]);
       double initialMass =Double.parseDouble(args[4]);
        
        int y=0;
        double r=10;
        System.out.printf("%s (%d-%s)\n",elementName,atomicNumber,elementSymbol); 
        System.out.println("Elapsed Years   Amount"); 
        System.out.println("-------------------------"); 
        
        while(y>=0){
            while (r>5){
                double x=y/halfLife;
                double c =Math.exp(-0.693);
                r= initialMass * Math.pow(c, x);
                System.out.printf("%d \t\t %.2f g\n",y,r); 
                y++;
             }
             break;
        }
        
    }
  
} 
