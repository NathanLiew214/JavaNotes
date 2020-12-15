
/******************************************************************************
Episode 21: Polymorphism

*******************************************************************************/
//0 Print Bird

class Bird {
	public void sing() {	
		System.out.println("tweet tweet tweet");
	}
}

public class Main{
	public static void main (String [] args) {
		Bird  b=new Bird();
		b.sing();
			
	}
}

Output: tweet tweet tweet                                                                                            
                      

//1 Robin and Pelican
//We can see it priotise its own method its called polymorphism
class Bird {
	public void sing() {	
		System.out.println("tweet tweet tweet");
	}
}

class Robin extends Bird{
    @Override
	public void sing() {	
		System.out.println("tweetdldeee dee");
	}
}

class Pelican extends Bird{
    @Override
	public void sing() {	
		System.out.println("KWAHH");
	}
}

public class Main{
	public static void main (String [] args) {
		Bird  b=new Bird();
		b.sing();
		Robin r = new Robin();
		r.sing();
		Pelican b=new Pelican();
		b.sing();
			
			
	}
}

Output:
tweet tweet tweet    
tweetdldeee dee 
KWAH
			 


//2 Polymorphism Array
apple.java
class apple{
	public static void main (String[] args) {
		
		food bucky[]=new food [2];
		bucky[0]=new nasilemak();
		bucky[1]=new roticanai();
		
		for (int x=0;x<2;x++) {
			bucky[x].eat();
		}
	}
}

nasilemak.java
public class nasilemak extends food {
	void eat(){
	System.out.println("This nasilemak is great(Called Eat Method)");
	}
}

roticanai.java
public class roticanai extends food{
	void eat(){
		System.out.println("This roticanai is great(Called Eat Method)");
	}
}

food.java
public class food {
	void eat() {
		System.out.println("This food is great(Called Eat Method)");
	}

}
























