/******************************************************************************
Episode 9:Class Methods with Arguments or Parameters

*******************************************************************************/
//1 
public class Main{
	
	public static void main (String[] args){
		
	aircraft cessna172 = new aircraft();
	aircraft piperSaratoga = new aircraft();
	
	//object.variable(Soft copy)
	cessna172.passengers=4;
	cessna172.cruiseSpeed=140;
	cessna172.fuelCapacity=50.0;
	cessna172.fuelBurnRate=2.0;
	
	piperSaratoga.passengers=8;
	piperSaratoga.cruiseSpeed=210;
	piperSaratoga.fuelCapacity=455.5;
	piperSaratoga.fuelBurnRate=5.5;
	

	System.out.println("For Cessna172 to fly 2.5 hours, it takes "+cessna172.fuelNeeded(2.5)+ " gallons of fuel");
	System.out.println("For PiperSaratoga to fly 3.5 hours, it takes "+piperSaratoga.fuelNeeded(2.5) +" gallons of fuel");
			
	
	}
}

class aircraft{	
	int passengers;
	int cruiseSpeed;
	double fuelCapacity;
	double fuelBurnRate;

	//Method to calculate aircraft endurance
	double calculateEndurance(){
		double endurance= fuelCapacity/fuelBurnRate;
		//System.out.println("The endurance is :"+ endurance + "hours");	
		return endurance;
	}
	
	double fuelNeeded(double time){
		return fuelBurnRate*time;
	}	
	
	/* same as
	double fuelNeeded(double time){
		double fuel= fuelBurnRate*time;
		return fuel;
	}
	*/
	
}

