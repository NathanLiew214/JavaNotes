/******************************************************************************
Episode 17: Tokenisation

*******************************************************************************/
//package unl.cse.library;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PersonsData {
    public static void main(String[] args) {

    	
        // Call the file to read
    	Scanner s = null;
        try{
        s = new Scanner(new File(args[0]));
        }catch (FileNotFoundException e) {		
        	System.out.println("File not found!");
        }catch (Exception e){		
        	System.out.println("Something else went wrong!");
        	e.printStackTrace();
        }
  	   	
        //Read Line by Line
        s.nextLine();
        while(s.hasNext()){
			String Line=s.nextLine();
			String tokens[] = Line.split(";");//4 tokens created(MAIN LINE)
			String personCode=tokens[0];		
			String name[] = tokens[1].split(", ");//String name created split with comas	
			
			Name personName =new Name (name[0],name[1]);//personName object created under Name class, both name are passed
			System.out.println(name[0]);
			personName.setFirstName(name[0]);
    		personName.setLastName(name[1]);			
    		String address[] = tokens[2].split(",");
    		Address personAddress =new Address (address[0],address[1],address[2],address[3],address[4]);
			System.out.println(tokens[2]);	
			if(tokens.length==4) {
    			String emailAdress=tokens[3];
    			System.out.println(tokens[3]);	
   
    		}
 
    	}
	}	
   
          
      
 }   
input file
   
10
abc2;Medrano, Wiktoria;1025 S Street st.,Chichago,IL,60613,USA;therealwiki@gmail.com,wiktoria.m@yahoo.com
biz45;Hart, Fenton;1 Wall Street,New York,NY,10005-0012,USA;fentony@windstream.net
zyx321;Dolan, Ayaana;23450 Cabo San Lucas, Los Cabos, BCS,, Mexico;
j3bdl5;Salazar, Anthony;6700 Vine St,Lincoln,NE,68505,USA;slitherysalazar@hotmail.com
lejnr4;Spooner, Kenan;123 N 1st Street,Compton,CA,90210,USA;kspoons@emailservice.domain,thespoonman@soundgarden.com
zvlnkd;Vang, Alba;521 Adam Street,Omaha,NE,68471,USA;av1834@hotmail.com
zdvker6u;Hayward, Terry;321 Lemon Street,New York,NY,10012,USA;
SKVUZH;Hicks, Isadora;142 Drive, Shanghai,,200012,China;ihicks@shu.edu.cn
123a;Battle, Petra;1 Blue Jays Way, Toronto, ON, M5V 1J1, Canada;danextpm@canada.gov
354fgb;Burns, Darci;1017 BlueJay Way, London, DA, 070708, England 


//Example 2


package unl.cse.library;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class LibraryDemo {
	
	private final static Scanner STDIN = new Scanner(System.in);

	private final Library lib;

    public LibraryDemo() {
    	this.lib = new Library();
    	loadFile();
    }
    
    private void loadFile() {
    	Scanner s = null;
    	try {
			s = new Scanner(new File("data/books.txt"));
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}
    	
    	while(s.hasNext()) {
    		String line = s.nextLine();
    		String tokens[] = line.split(",");
    		String title = tokens[0];
    		String auth[] = tokens[1].split(" ");		
    		Author author = new Author(auth[0],auth[1]);
    		author.setFirstName(auth[0]);
    		author.setLastName(auth[1]);		
    		String isbn = tokens[2];
    		String publishDate = tokens[3];
    		Book b = new Book(title, author, isbn, LocalDate.parse(publishDate));
    	
    		b.setTitle(title);
    		b.setAuthor(author);
    		b.setISBN(isbn);
    		b.setPublishDate(publishDate);
    		lib.addBook(b);
    	}    	
    	s.close();
    }
War and Peace,Leo Tolstoy,978-0199232765,1869-01-01
Data Structures & Problem Solving Using Java,Mark Weiss,0-321-54140-5,2011-03-10
The Naked & The Dead,Norman Mailer,978-0312265052,1948-01-01
Barbary Shore,Norman Mailer,0375700390,1951-01-01
Discrete Mathematics and Its Applications,Kenneth Rosen,9780073229720,1998-12-11
The Adventures of Tom Sawyer,Mark Twain,9780143039563,1876-01-01
Adventures of Huckleberry Finn,Mark Twain,,1885-01-01
American Gods,Neil Gaiman,0-380-97365-0,2002-04-30
The Colour of Magic,Terry Pratchett,0-86140-324-X,1983-01-01
Mort,Terry Pratchett,0-575-04171-4,1987-01-01
The Hitchhiker's Guide to the Galaxy,Douglas Adams,978-0345391803,1979-01-01
Dirk Gently's Holistic Detective Agency,Douglas Adams,0-671-69267-4,1987-05-01










       
        
