/******************************************************************************
Episode 11: Scanner

*******************************************************************************/
import java.util.Scanner;


public class Scanning{
	public static void main(String[] args){
		Scanner scan= new Scanner(System.in);
		System.out.println("What's your favourite number?");
		
	
			//get the next integer that the user enter
			//nextInt()take in number
			// stop when there is space
			int n= scan.nextInt();
			System.out.println(n);	

		}
}



import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		System.out.println("What's your first name?");
		String name = scan.next();
		
		System.out.println("What's your age?");
		int age = scan.nextInt();
		
		System.out.println("Thank you " + name + ",you are " + age + " years old"); 	
	}

}

import java.util.Scanner;

public class Scanning {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		System.out.println("What's the atomic number of the element?");
		int atomicNumber = scan.nextInt();
		
		System.out.println("What is the element name?");
		String eName = scan.next();
		
		System.out.println("What is the element symbol?");
		String eSymbol = scan.next();
		
		
		System.out.println("What is the half life of the element?");
		double halflife = scan.next();
		
		System.out.println("What is the initial mass of the element?");
		double intialMass = scan.next();
		
		//System.out.println("Combined" + atomicNumber + eName + eSymbol + halflife + intialMass); 	
		
		//Calculation
		/**int x= y/H;
		int r=amount*pow(C,x);
		int C=pow(e,-0.693)**/

		
		
	}

}

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProductsData {
	 public static void main(String[] args) {
		 Scanner s= null;
		 try {
			 s= new Scanner(new File(args[0])); 
		 }catch (FileNotFoundException e) {		
	        	System.out.println("File not found!");
	     }catch (Exception e){		
	        	System.out.println("Something else went wrong!");
	        	e.printStackTrace();
	     }
		
		 while (s.hasNext()) {
			 String Line = s.nextLine();
			 System.out.println(Line);  
		 }
		
			 
	 }
}


//Scan and put in Array
//Example 1
public class PersonsData {
	ArrayList<Person> pers = new ArrayList<Person>();
	
	public ArrayList<Person> readPeople() {
		Scanner s = null;
		try {
			s = new Scanner(new File("data/Persons.dat"));
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		} catch (Exception e) {
			System.out.println("Something else went wrong!");
			e.printStackTrace();
		}
		s.nextLine();
		while (s.hasNext()) {
			String Line = s.nextLine();
			String tokens[] = Line.split(";");
			String personCode = tokens[0];
			
			String name[] = tokens[1].split(",");
			String lastName = name[0];
			String firstName = name[1];
			
			String add[] = tokens[2].split(",");
			Address address = new Address(add[0], add[1], add[2], add[3], add[4]);
			
			
			String emailAddress[] = null;	
			if (tokens.length == 4) {		
				emailAddress = tokens[3].split(",");
			}
			Person p = new Person(personCode, lastName, firstName, address, emailAddress);

			pers.add(p);
		}
		return pers;

	}

}

//Example 2

package asg2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductsData {
	public ArrayList<Product> readProducts() {
		Scanner s = null;
		try {
			s = new Scanner(new File("data/Products.dat"));
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		} catch (Exception e) {
			System.out.println("Something else went wrong!");
			e.printStackTrace();
		}

		ArrayList<Product> product = new ArrayList<Product>();
		s.nextLine();

		while (s.hasNext()) {
			String Line = s.nextLine();
			String tokens[] = Line.split(";");
			Rental forRental = null;
			Repair forRepair = null;
			Concession forConcession = null;
			Towing forTowing = null;

			if (tokens[1].contains("R")) {
				String rental = Line;
				String rent[] = rental.split(";");
				forRental = new Rental(rent[0], rent[1], rent[2], Double.parseDouble(rent[3]),
						Double.parseDouble(rent[4]), Double.parseDouble(rent[5]));
				

			} else if (tokens[1].contains("F")) {
				String repair = Line;
				String rep[] = repair.split(";");
				forRepair = new Repair(rep[0], rep[1], rep[2], Double.parseDouble(rep[3]), Double.parseDouble(rep[4]));
			
			} else if (tokens[1].contains("C")) {
				String concession = Line;
				String conc[] = concession.split(";");
				forConcession = new Concession(conc[0], conc[1], conc[2], Double.parseDouble(conc[3]));
			

			} else if (tokens[1].contains("T")) {
				String towing = Line;
				String tow[] = towing.split(";");
				forTowing = new Towing(tow[0], tow[1], tow[2], Double.parseDouble(tow[3]));
			
			}
			Product p = new Product(forRental, forRepair, forConcession, forTowing);
			
			product.add(p);
		}
		return product;
	}
}
//Example 3
package asg2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CustomersData {
	public Person findPerson(ArrayList<Person> people, String code) {
		for (Person p : people) {
			if (p.getPersonCode().equals(code)) {
				return p;
			}
		}
		return null;

	}

	public ArrayList<Customer> readCustomers(ArrayList<Person> people) {
		Scanner s = null;
		try {
			s = new Scanner(new File("data/Customers.dat"));
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		} catch (Exception e) {
			System.out.println("Something else went wrong!");
			e.printStackTrace();
		}
		ArrayList<Customer> cus = new ArrayList<Customer>();
		s.nextLine();
		while (s.hasNext()) {
			String Line = s.nextLine();
			String tokens[] = Line.split(";");
			String customerCode = tokens[0];
			String customerType = tokens[1];
			String name = tokens[2];
			String primaryContactCode = tokens[3];
			String add[] = tokens[4].split(",");
			Address address = new Address(add[0], add[1], add[2], add[3], add[4]);
			
			Person linkcontact = findPerson(people, primaryContactCode);
			Customer c = new Customer(customerCode, customerType, name, linkcontact, address);
			cus.add(c);
		}
		return cus;

	}
}










