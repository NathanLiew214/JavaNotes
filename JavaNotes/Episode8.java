/******************************************************************************
Episode 8:Returning a value in Methods
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
	
	piperSaratoga.fuelCapacity=455.5;
	piperSaratoga.fuelBurnRate=5.5;
	
	
    //System.out.println("Cessna 172");
    //cessna172.calculateEndurance();
	//System.out.println("PiperSaratoga");
	
	//new variable= object.Methods
	double pipe=piperSaratoga.calculateEndurance();
	
	System.out.println("The endurance is :"+ cessna172.calculateEndurance()+ "hours");
	System.out.println("The endurance is :"+ pipe+ "hours");
		
	
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
}



