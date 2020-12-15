/******************************************************************************
Episode 16: Array

*******************************************************************************/
//1 Array List Vs Array
public class main{
    
	public static void main(String[] args) {
       	//Array1
       	String[]fruits=new String [4];
       	fruits[0]="Mango";
       	fruits[1]="Strawberry";
       	fruits[2]="Watermelon";
       	
       	Sytem.out.print(fruits[1]);
       	
       	
       	
       	//Array2
       	String fruits[]={"Mango","Strawberry","Watermelon"}
    	Sytem.out.print(fruits[1]);
    
       		
       	
       	//Array List
       	ArrayList fruitList=new ArrayList();
       	fruitList.add("Mango");
       	fruitList.add("Strawberry");
       	fruitList.add("Watermelon");   	
       	fruitList.remove("Strawberry");
       	
       		Sytem.out.print(fruits);
	}

}

