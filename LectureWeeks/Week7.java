//Monday JDBC
//Publisher.java

//1 Short Form
//import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Publisher { 
	private int publisherId;
	private String PublisherName;
	private String PublisherAddress;
	
	public Publisher(int publisherId, String publisherName, String publisherAddress) {
		this.publisherId = publisherId;
		PublisherName = publisherName;
		PublisherAddress = publisherAddress;
	}

	public int getPublisherId() {
		return publisherId;
	}

	public void setPublisherId(int publisherId) {
		this.publisherId = publisherId;
	}

	public String getPublisherName() {
		return PublisherName;
	}

	public void setPublisherName(String publisherName) {
		PublisherName = publisherName;
	}

	public String getPublisherAddress() {
		return PublisherAddress;
	}

	public void setPublisherAddress(String publisherAddress) {
		PublisherAddress = publisherAddress;
	}

	@Override
	public String toString() {
		return "Publisher [publisherId=" + publisherId + ", PublisherName=" + PublisherName + ", PublisherAddress="
				+ PublisherAddress + "]";
	}
	
	//Returns List
	public static List<Publisher> loadAllPublisher(){
		List<Publisher> lst = new ArrayList<>();
		/*
		 * Load the JDBC Driver
		 * Create a connection to our DB
		 * Create/Execute a prepared query
		 * Process the result
		 * Clean ups
		 */
		String DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://cse.unl.edu/wliew?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String user = "wliew";
		String password = "2YpZTDKT";
		
		
		//*1  Load the JDBC Driver		
		Class.forName(DRIVER_CLASS).newInstance();	
				

		//2	*Create a connection to our DB		
		Connection conn = DriverManager.getConnection(url, user, password);;
	
		//3a * Create a query		
		String query = "select * from "
				+ "Publisher2;";
		
		//3b * Execute a prepared query (Prepare statement execute JDBC)	
		PreparedStatement pre = conn.prepareStatement(query); //Input (Place query)
		ResultSet rs = pre.executeQuery();//Output (Fetch the output from SQL)
			
		//4 *  Process the result
		while(rs.next()){
			int pubID = rs.getInt("pubId");
			String pubName = rs.getString("pubName");
			String pubAddress = rs.getString("pubAddress");
				
			Publisher p  = new Publisher(pubID, pubName, pubAddress);
				
			lst.add(p);
					
		}
			
		//5 * Close connection and clean up			
		rs.close();
		pre.close();
		conn.close();
				
		return lst;
	}
	
}






//2 JDBC Complete for Showing Tables
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Publisher { 
	private int publisherId;
	private String PublisherName;
	private String PublisherAddress;
	
	public Publisher(int publisherId, String publisherName, String publisherAddress) {
		this.publisherId = publisherId;
		PublisherName = publisherName;
		PublisherAddress = publisherAddress;
	}

	public int getPublisherId() {
		return publisherId;
	}

	public void setPublisherId(int publisherId) {
		this.publisherId = publisherId;
	}

	public String getPublisherName() {
		return PublisherName;
	}

	public void setPublisherName(String publisherName) {
		PublisherName = publisherName;
	}

	public String getPublisherAddress() {
		return PublisherAddress;
	}

	public void setPublisherAddress(String publisherAddress) {
		PublisherAddress = publisherAddress;
	}

	@Override
	public String toString() {
		return "Publisher [publisherId=" + publisherId + ", PublisherName=" + PublisherName + ", PublisherAddress="
				+ PublisherAddress + "]";
	}
	
	//Returns List
	public static List<Publisher> loadAllPublisher(){
		List<Publisher> lst = new ArrayList<>();
		/*
		 * Load the JDBC Driver
		 * Create a connection to our DB
		 * Create/Execute a prepared query
		 * Process the result
		 * Clean ups
		 */
		String DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://cse.unl.edu/wliew?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String user = "wliew";
		String password = "2YpZTDKT";
		
		
		
	
		//*1  Load the JDBC Driver	
		//Class.forName(DRIVER_CLASS).newInstance();
		
		try {
			Class.forName(DRIVER_CLASS).newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
	//	Newer Version
	/*	 try {
			Class.forName(DRIVER_CLASS).getDeclaredConstructor().newInstance();
		} catch (InstantiationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IllegalArgumentException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (InvocationTargetException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (NoSuchMethodException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SecurityException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}*/
		

		//2	*Create a connection to our DB
		//Connection conn = DriverManager.getConnection(url, user, password);

		Connection conn=null;
		try {
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
		

		
		//3* Create a query	and Execute a prepared query 
		String query = "select * from "
				+ "Publisher2;";
	
		//PreparedStatement pre = conn.prepareStatement(query);
		//ResultSet rs = pre.executeQuery();
		
		PreparedStatement pre=null;
		ResultSet rs=null;
		
		try {
			pre = conn.prepareStatement(query);
			rs = pre.executeQuery();
		
		//4 *  Process the result	
			//rs.next moves from 1 to 2 to 3
			//while continues that
			//print out pubId,pubName and pubAddress (1),2,3,4
			while(rs.next()){
				//you can either use table name or index for getInt
				int pubID = rs.getInt("pubId");
				String pubName = rs.getString("pubName");
				String pubAddress = rs.getString("pubAddress");
				
				//add to p and print out in demo
				Publisher p  = new Publisher(pubID, pubName, pubAddress);	
				lst.add(p);
					
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//5 * Close connection and clean up	
		//rs.close();
		//pre.close();
		//conn.close();
				
		try {
			if(rs != null && !rs.isClosed()){
				rs.close();
			}
			if(pre != null && !pre.isClosed()){
				pre.close();
			}
			if(conn != null && !conn.isClosed()){
				conn.close();
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return lst;
	}
	
}

//Demo.java
import java.util.List;

public class Demo {

	public static void main(String[] args) {
			List<Publisher> lst = Publisher.loadAllPublisher();
			for(Publisher p: lst) {
					System.out.println(p);	
			}	
	}

}


//Wednesday JDBC 2 (Insert Publisher)
//1 Inserting Data

//Demo.java

import java.util.List;

public class Demo {

	public static void main(String[] args) {
			Publisher ph = new Publisher(0,"aaaa","ccc");
			ph.insertPublisher();
			
	}

}

//Publisher.java

import java.util.ArrayList;
import java.util.List;
import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Publisher { 
	private int publisherId;
	private String PublisherName;
	private String PublisherAddress;
	
	public Publisher(int publisherId, String publisherName, String publisherAddress) {
		this.publisherId = publisherId;
		PublisherName = publisherName;
		PublisherAddress = publisherAddress;
	}

	public int getPublisherId() {
		return publisherId;
	}

	public void setPublisherId(int publisherId) {
		this.publisherId = publisherId;
	}

	public String getPublisherName() {
		return PublisherName;
	}

	public void setPublisherName(String publisherName) {
		PublisherName = publisherName;
	}

	public String getPublisherAddress() {
		return PublisherAddress;
	}

	public void setPublisherAddress(String publisherAddress) {
		PublisherAddress = publisherAddress;
	}

	@Override
	public String toString() {
		return "Publisher [publisherId=" + publisherId + ", PublisherName=" + PublisherName + ", PublisherAddress="
				+ PublisherAddress + "]";
	}
	
	
	public void insertPublisher () {
		
		String DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://cse.unl.edu/wliew?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String user = "wliew";
		String password = "2YpZTDKT";
		
		
		//*1  Load the JDBC Driver
		
		//Class.forName(DRIVER_CLASS).newInstance();
		//or Class.forName(DRIVER_CLASS).getDeclaredConstructor().newInstance(); (NEW VERSION)
		
		 try {
			Class.forName(DRIVER_CLASS).getDeclaredConstructor().newInstance();
		} catch (InstantiationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IllegalArgumentException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (InvocationTargetException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (NoSuchMethodException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SecurityException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
				
		
		//2	*Create a connection to our DB
		//Connection conn = DriverManager.getConnection(url, user, password);

		Connection conn=null;
		try {
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
	
		//3* Create a query	and Execute a prepared query  ( No returns)
		//String query = "insert into Publisher2 (pubName) values ('FROM JDBC');";
		//String query = "insert into Publisher2 (pubName,pubAddress) values ('New JDBC Name','Addresss');";
		 String query = "insert into Publisher2 (pubName,pubAddress) values ('Pearson',  '1234 " + "Hello ST Lincoln,NE'  );";
	
		//PreparedStatement pre = conn.prepareStatement(query);
		PreparedStatement pre=null;
		
		
		try {
			pre = conn.prepareStatement(query);
			pre.executeUpdate();//to update query for update ,delete,etc
		
		//4 *  Process the result	(Non to Read)
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

				
		//5 * Close connection and clean up	
		//pre.close();
		//conn.close();
				
		try {

			if(pre != null && !pre.isClosed()){
				pre.close();
			}
			if(conn != null && !conn.isClosed()){
				conn.close();
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}
	
		
}

//2 Data inserting from the user
	
	//#METHOD 1 
		//Using Concatenation (Not Suggested)
		(Works)
		String query = "insert into Publisher2 (pubName,pubAddress) values ('"+ PublisherName +
		" ', '" + PublisherAddress +"');";
 
		Example of SQL Injection Attack
		// User can delete your table
		Publisher ph = new Publisher(0,"aaaa","ccc");
		change to Publisher ph = new Publisher(0,"aaaa","ccc');drop table platform ;-- ");


//#METHOD 2

	//3* Create a query	and Execute a prepared query  ( No returns)
	String query = "insert into Publisher2 (pubName,pubAddress) values (?,?);";
		 
		//PreparedStatement pre = conn.prepareStatement(query);
		//Prepare statement store values of input data
		//? set Publisher Name, ? set Publisher Address
		PreparedStatement pre=null;	
		try {
			pre = conn.prepareStatement(query);
			pre.setString(1, PublisherName);
			pre.setString(2, PublisherAddress);
			pre.executeUpdate();//to update query for update ,delete,etc
		
		//4 *  Process the result	(Non to Read)
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

Explain for Method 2
public void insertPublisher () {
		
		String DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://cse.unl.edu/wliew?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String user = "wliew";
		String password = "2YpZTDKT";
		
		
		//*1  Load the JDBC Driver
		
		//Class.forName(DRIVER_CLASS).newInstance();
		//or Class.forName(DRIVER_CLASS).getDeclaredConstructor().newInstance(); (NEW VERSION)
		
		 try {
			Class.forName(DRIVER_CLASS).getDeclaredConstructor().newInstance();
		} catch (InstantiationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IllegalArgumentException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (InvocationTargetException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (NoSuchMethodException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SecurityException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
				
		
		//2	*Create a connection to our DB
		//Connection conn = DriverManager.getConnection(url, user, password);

		Connection conn=null;
		try {
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
	
		


		//3* Create a query	and Execute a prepared query  ( No returns)
		String query = "insert into Publisher2 (pubName,pubAddress) values (?,?);";
		 
		//PreparedStatement pre = conn.prepareStatement(query);
		PreparedStatement pre=null;	
		try {
			pre = conn.prepareStatement(query);
			pre.setString(1, PublisherName);
			pre.setString(2, PublisherAddress);
			pre.executeUpdate();//to update query for update ,delete,etc
		
		//4 *  Process the result	(Non to Read)
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}





				
		//5 * Close connection and clean up	
		//pre.close();
		//conn.close();
				
		try {

			if(pre != null && !pre.isClosed()){
				pre.close();
			}
			if(conn != null && !conn.isClosed()){
				conn.close();
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}
	
		
}




//3 How to set primary key in JDBC
	// setting primary key (Composition Relationship)
public class Publisher { 
	
	//FIELDS
	private int publisherId;
	private String PublisherName;
	private String PublisherAddress;
	private List <Book>PublisherBooks;// You have to create a Book Class which links to this
	
}


//4 Overall JDBC Combine
Demo.Java
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			List<Publisher> lst = Publisher.loadAllPublisher();
			for(Publisher p: lst) {
					System.out.println(p);	
			}
			Publisher ph = new Publisher(0,"bbb","ddd");
			ph.insertPublisher();
			
	}

}

Publisher.java
import java.util.ArrayList;
import java.util.List;
import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Publisher { 
	private int publisherId;
	private String PublisherName;
	private String PublisherAddress;
	//## 3 setting primary key (Composition Relationship)
	//private List <Book>PublisherBooks;
	
	public Publisher(int publisherId, String publisherName, String publisherAddress) {
		this.publisherId = publisherId;
		PublisherName = publisherName;
		PublisherAddress = publisherAddress;
		
	}

	public int getPublisherId() {
		return publisherId;
	}

	public void setPublisherId(int publisherId) {
		this.publisherId = publisherId;
	}

	public String getPublisherName() {
		return PublisherName;
	}

	public void setPublisherName(String publisherName) {
		PublisherName = publisherName;
	}

	public String getPublisherAddress() {
		return PublisherAddress;
	}

	public void setPublisherAddress(String publisherAddress) {
		PublisherAddress = publisherAddress;
	}

	@Override
	public String toString() {
		return "Publisher [publisherId=" + publisherId + ", PublisherName=" + PublisherName + ", PublisherAddress="
				+ PublisherAddress + "]";
	}
	

	//** 1  Show tables
	
	public static List<Publisher> loadAllPublisher(){
		List<Publisher> lst = new ArrayList<>();
		/*
		 * Load the JDBC Driver
		 * Create a connection to our DB
		 * Create/Execute a prepared query
		 * Process the result
		 * Clean ups
		 */
		String DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://cse.unl.edu/wliew?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String user = "wliew";
		String password = "2YpZTDKT";
		
		
		
	
		//##1  Load the JDBC Driver
		
		//Class.forName(DRIVER_CLASS).newInstance();
		//or Class.forName(DRIVER_CLASS).getDeclaredConstructor().newInstance(); (NEW VERSION)
		
		 try {
			Class.forName(DRIVER_CLASS).getDeclaredConstructor().newInstance();
		} catch (InstantiationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IllegalArgumentException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (InvocationTargetException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (NoSuchMethodException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SecurityException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
				
		
		//2	*Create a connection to our DB
		//Connection conn = DriverManager.getConnection(url, user, password);

		Connection conn=null;
		try {
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
		

		
		//3* Create a query	and Execute a prepared query 
		//Try to reduce number of data you extract
		String query = "select * from "
				+ "Publisher2;";
	
		//PreparedStatement pre = conn.prepareStatement(query);
		//ResultSet rs = pre.executeQuery();
		
		PreparedStatement pre=null;
		ResultSet rs=null;
		
		try {
			pre = conn.prepareStatement(query);
			rs = pre.executeQuery();
		
		//4 *  Process the result	
			while(rs.next()){
				//you can either use table name or index for getInt
				int pubID = rs.getInt("pubId");
				String pubName = rs.getString("pubName");
				String pubAddress = rs.getString("pubAddress");
				
				Publisher p  = new Publisher(pubID, pubName, pubAddress);	
				lst.add(p);
					
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//5 * Close connection and clean up
	
		//rs.close();
		//pre.close();
		//conn.close();	
		
		try {
			if(rs != null && !rs.isClosed()){
				rs.close();
			}
			if(pre != null && !pre.isClosed()){
				pre.close();
			}
			if(conn != null && !conn.isClosed()){
				conn.close();
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

		return lst;
	}
	
	
	//## 2 Insert Data
	
	public void insertPublisher () {
		
		String DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://cse.unl.edu/wliew?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String user = "wliew";
		String password = "2YpZTDKT";
		
		
		//*1  Load the JDBC Driver
		
		//Class.forName(DRIVER_CLASS).newInstance();
		//or Class.forName(DRIVER_CLASS).getDeclaredConstructor().newInstance(); (NEW VERSION)
		
		 try {
			Class.forName(DRIVER_CLASS).getDeclaredConstructor().newInstance();
		} catch (InstantiationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IllegalArgumentException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (InvocationTargetException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (NoSuchMethodException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SecurityException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
				
		
		//2	*Create a connection to our DB
		//Connection conn = DriverManager.getConnection(url, user, password);

		Connection conn=null;
		try {
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
	
		//3* Create a query	and Execute a prepared query  ( No returns)
		 String query = "insert into Publisher2 (pubName,pubAddress) values (?,?);";
		 
		 //PreparedStatement pre = conn.prepareStatement(query);
		 PreparedStatement pre=null;
		
		
		try {
			pre = conn.prepareStatement(query);
			pre.setString(1, PublisherName);
			pre.setString(2, PublisherAddress);
			pre.executeUpdate();//to update query for update ,delete,etc
			
			//4 *  Process the result	 (None)
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
				
		//5 * Close connection and clean up
	
		try {

			if(pre != null && !pre.isClosed()){
				pre.close();
			}
			if(conn != null && !conn.isClosed()){
				conn.close();
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}
	
		
}



// 5 Good Library log4j





