/******************************************************************************
Episode 14: File IO

*******************************************************************************/
//1 Print Singe Line
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main{
	public static void main (String[] args){
		try{
			Scanner s = new Scanner (new File("mm.txt"));
			String Line1=s.nextLine();
			System.out.println(Line1);
			String Line2=s.nextLine();
			System.out.println(Line2);
			
		}catch (FileNotFoundException e){		
			e.printStackTrace();//Output: Hi FromFile123
		}		
		
	}
	
}
mm.txt
water instanceof
fnff
2233 (Not Printed)
fndjnfe(not Printed)


//2 Print All Lines
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main{
	public static void main (String[] args){
	   try{ 
	        File file= new File("mm.txt");
			Scanner s  = new Scanner (file);
			while(s.hasNext()){
				String Line=s.nextLine();
				System.out.println(Line);		
			}	
		}catch (FileNotFoundException e){		
			e.printStackTrace();//Output: Hi FromFile123
		}		
		
	}	
}

mm.txt
dhuhahds
dasdasd
dasdasd

StringIndexOutOfBoundsExceptio

//3 Scan Next Word
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main{
	public static void main (String[] args){
		try{
			Scanner s = new Scanner (new File("mm.txt"));
			String Argument1=s.next();
			System.out.println(Argument1);
			String Argument2=s.next();
			System.out.println(Argument2);
			
		}catch (FileNotFoundException e){		
			e.printStackTrace();//Output: Hi FromFile123
		}		
		
	}
	
}

//4 PrintWriter
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Baseball {

	public static void main(String args[]) {
		
		String fileName = "data/mlb_nl_2011.txt";
		Scanner s = null;
		try {
			s = new Scanner(new File(fileName));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		Team teams[] = new Team[16];

		//TODO: read in and process the data file, create teams and add them to the array
		for(int i=0; i<teams.length;i++) {
			String name=s.next();
			Integer win = Integer.parseInt(s.next());
			Integer loss = Integer.parseInt(s.next());
			
			teams[i]=new Team(name,win,loss);
			
			
		}

		
		System.out.println("Teams: ");
		for(Team t : teams) {
			System.out.println(t);
		}

		Arrays.sort(teams, new Comparator<Team>() {
			@Override
			public int compare(Team a, Team b) {
				return b.getWinPercentage().compareTo(a.getWinPercentage());
			}
			
		});
		
		System.out.println("\n\nSorted Teams: ");
		for(Team t : teams) {
			System.out.println(t);
		}
		
		//TODO: output the team array to a file as specified
		try{	
			File file1= new File("data/result.txt");
			PrintWriter pt = new PrintWriter(file1);
			
			//for(i=0;i<teams.length,i++) {
			for(Team t:teams) {
				String name=t.getName();
				Double rate =t.getWinPercentage()*100;
				pt.printf("%s %.2f\n",name,rate);						
			}
			
			pt.close();	
			
		}catch (FileNotFoundException e){		
			e.printStackTrace();
		}		
	
		
		
	}
	
}




//5 All
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;
import java.lang.Math; 

public class Main{
	public static void main (String[] args){
		try{
			Scanner s = new Scanner (new File("mm.txt"));
		   
	            String[] argument = new String[5];
			    for (int i=0;i<argument.length;i++){
    			    String Argument=s.next();
    			    argument[i]=Argument;
			    }
	    
			File file1= new File("result.txt");
			PrintWriter pt = new PrintWriter(file1);
			
			int atomicNumber = Integer.parseInt(argument[0]);
            String elementName = argument[1];
            String elementSymbol =argument[2];
            double halfLife=  Double.parseDouble(argument[3]);
            double initialMass =Double.parseDouble(argument[4]);
		
            pt.printf("%s (%d-%s)\n",elementName,atomicNumber,elementSymbol); 
            pt.println("Elapsed Years   Amount"); 
            pt.println("-------------------------"); 
            
            int y=0;
            double r=10;
            
            while(y>=0){
                while (r>5){
                    double x=y/halfLife;
                    double c =Math.exp(-0.693);
                    r= initialMass * Math.pow(c, x);
                    pt.printf("%d \t\t %.2f g\n",y,r); 
                    y++;
                 }
                 break;
            }
			
			pt.close();	
		           
    	}catch (FileNotFoundException e){		
        	e.printStackTrace();
        }
		
	}
	
}
