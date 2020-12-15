/******************************************************************************
Episode 6: Calculations with Instance Variables

*******************************************************************************/
//1 
public class Main{
	
	public static void main (String[] args){
	
	aircraft cessna172 = new aircraft();
	aircraft piperSaratoga = new aircraft();
	
	double cessna172Endurance;
	double piperEndurance;
	
	//object.variable(Soft copy)
	cessna172.passengers=4;
	cessna172.cruiseSpeed=140;
	cessna172.fuelCapacity=50.0;
	cessna172.fuelBurnRate=2.0;
	
	piperSaratoga.fuelCapacity=455.5;
	piperSaratoga.fuelBurnRate=5.5;
	
	System.out.println("Cessna 172 passengers:" + cessna172.passengers);
	System.out.println("Cessna 172 passengers:" + cessna172.cruiseSpeed + "gph");
	
	cessna172Endurance= cessna172.fuelCapacity/cessna172.fuelBurnRate;
	System.out.println("Cessna 172 stay aloft for :" + cessna172Endurance +"(Endurance)");
	
	piperEndurance= piperSaratoga.fuelCapacity/piperSaratoga.fuelBurnRate;
	System.out.println("PiperSaratoga stay aloft for :" + piperEndurance + "(Endurance)");
	
	
	
	}
}

class aircraft{	
	int passengers;
	int cruiseSpeed;
	double fuelCapacity;
	double fuelBurnRate;
}