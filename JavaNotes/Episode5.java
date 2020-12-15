/******************************************************************************
Episode 5 Storing Values in Variables of an Object via Soft Copy

*******************************************************************************/
//1 
public class Main{
	
	public static void main (String[] args){
	
	aircraft cessna172 = new aircraft();
	aircraft piperSaratoga = new aircraft();
	//object.variable(Soft copy)
	cessna172.passengers=4;
	cessna172.cruiseSpeed=140;
	cessna172.fuelCapacity=56.5;
	cessna172.fuelBurnRate=9.5;
	
	System.out.println("Cessna 172 passengers:" + cessna172.passengers);
	System.out.println("Cessna 172 passengers:" + cessna172.cruiseSpeed + "gph");
	
	 piperSaratoga.fuelCapacity=455.5;
	 piperSaratoga.fuelBurnRate=5.5;
	
	}
}

class aircraft{	
	int passengers;
	int cruiseSpeed;
	double fuelCapacity;
	double fuelBurnRate;
}