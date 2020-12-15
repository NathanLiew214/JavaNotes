/******************************************************************************
Episode 7:Calling a Method in a Class (Object.Methods)

*******************************************************************************/
//1 
public class Main{
	
	public static void main (String[] args){
		
	//double cessna172Endurance;
	//double piperEndurance;
		
	aircraft cessna172 = new aircraft();
	aircraft piperSaratoga = new aircraft();
	
	//object.variable(Soft copy)
	cessna172.passengers=4;
	cessna172.cruiseSpeed=140;
	cessna172.fuelCapacity=50.0;
	cessna172.fuelBurnRate=2.0;
	
	piperSaratoga.fuelCapacity=455.5;
	piperSaratoga.fuelBurnRate=5.5;
	
	
	//Combining these two
	/* cessna172Endurance= cessna172.fuelCapacity/cessna172.fuelBurnRate;
		System.out.println("Cessna 172 stay aloft for :" + cessna172Endurance +"(Endurance)");
	
		piperEndurance= piperSaratoga.fuelCapacity/piperSaratoga.fuelBurnRate;
		System.out.println("PiperSaratoga stay aloft for :" + piperEndurance + "(Endurance)");
	*/
	
	//object.methods
	System.out.println("Cessna 172");
	cessna172.calculateEndurance();
	System.out.println("\nPiperSaratoga");
	piperSaratoga.calculateEndurance();
	
		
	
	}
}

class aircraft{	
	int passengers;
	int cruiseSpeed;
	double fuelCapacity;
	double fuelBurnRate;

	//Method to calculate aircraft endurance
	void calculateEndurance(){
		double endurance= fuelCapacity/fuelBurnRate;
		System.out.println("The endurance is :"+ endurance + "hours");
	}
}



















