/******************************************************************************
Episode 18: Printing

*******************************************************************************/public class Main{
	public static void main (String[] args){
		List<Integer> 1st = new ArrayList<Integer>();
		1st.add(1);
		1st.add(2);
		1st.add(3);
		System.out.println(1st);// [1,2,3,4]
		
		for (int i=0; i <1st.size();i++){
			Systerm.out.println(1st.get(i));
		}
		
	}
}


public class Main{
	public static void main (String[] args){
		List<Integer> 1st = new ArrayList<Integer>();
		1st.add(1);
		1st.add(2);
		1st.add(3);
		System.out.println(1st);// [1,2,3,4]
		
		for (Integer item:1st){
			System.out.println(item);

		}
		
	}
}


/ Comparison for Stack Heap Type and Array List Type
    //A //Stack Array (array.length) && //Heap Array
    int ar[]={1,2,3,4,5};//size restricted
    int num[]= new int [9];
    
	for (i=0; i<ar.length; i++){
		System.out.println(ar[i]);		
	}

	//declare number as collection: ar, print number
	for (int number:ar){
		System.out.println(number);	
	}
	
	VS
	
	//B Array List (Link List) (1st.size())//not size restricted 
	for (int i=0; i <1st.size();i++){
			Systerm.out.println(1st.get(i));
	}
	
	for (Integer item:1st){
		System.ou