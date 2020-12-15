//1 Adjusting Arrays
import java.util.Arrays;

public class MyArrayList {
	
	
	private static final int SIZE = 5;
	private int arr[];
	private int size;//current number of element in the list
	
	//Constructor
	public MyArrayList() {
		//ArraySIZE(arr.length)=5  //size=0	
		this.arr = new int [SIZE];
		//Number of Elements
		this.size=0;
	}
	
	//adding element
	public void addElementToStart (int item){
	//i starts from 0, five elements =4, this.size=4
	//when 5=5, out of bound
	
		if (this.arr.length==this.size) {
			//create new array with double the size
			this.arr=Arrays.copyOf(this.arr,this.arr.length+SIZE);
		}		
		arr[size]=item;
		this.size ++;

	}

	public String toString() {
		return Arrays.toString(arr);
		
	}
	
	
	public static void main(String args[]) {
		
		MyArrayList One = new MyArrayList();
		//5 is arraySize of MyArrayList, but i is the size for elements to go through which you can set
		//usually we do < MyArrayList.size
		//changing <5 to <6 will cause error, extra value(25) but no more space
		
		for (int i=0; i<5;i++) {	
			//0 to 4 (*5)[0,1,2,3,4]--> [0,5,10,15,20]
			
			One.addElementToStart (i*5);
			
		}	

		System.out.println(One.toString());
	
	}
	
}

//2


//Friday
//1 insert at Start
Node.java

public class Node <T> {
	private T item;
	private Node <T> next;
	
	public Node(T item) {
		this.item = item;
		this.next = null;
	}

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}
	
	public boolean hasNext() {
		return this.next!=null;
	}

}

MyLinkedList.java

public class MyLinkedList <T> {
	private Node <T> head;
	public MyLinkedList() {
		this.head = null;
		
	}
	public void insertAtStart (T item) {
		Node <T> temp = new Node <T> (item);//1: create node for the item
		temp.setNext(this.head);// 2 connect head to the rest of the list
		this.head = temp;//3: (pointing the head) for temp node
		// you cannot switch 2 and 3 because once you point head of temp node,the rest of the big node is unreachable
		//therefore connect first before you move your head
	}
	
	

	public int getCount() {
		if(this.head==null) {
			return 0;
			
		}
		int count =1;
		Node <T> curr = this.head; //Cursor point the first  (head)
		while (curr.hasNext()) {
			count ++;
			curr=curr.getNext();
			
		}
		return count;
		
	}
	
	
	public static void main(String[] args) {
	MyLinkedList <Integer> One = new MyLinkedList<>();
	One.insertAtStart(5);
	One.insertAtStart(15);
	One.insertAtStart(25);
	One.insertAtStart(35);
	
	System.out.println(One.getCount());
	
	}
	
	
}

//2 Using getSize()

public class MyLinkedList <T> {
	

	private Node <T> head;
	private int size;
	
	
	public MyLinkedList() {
		this.head = null;
		this.size=0;
		
	}
	public void insertAtStart (T item) {
		Node <T> temp = new Node <T> (item);//1: create node for the item
		temp.setNext(this.head);// 2 connect head to the rest of the list
		this.head = temp;//3: (pointing the head) for temp node
		this.size++;
		// you cannot switch 2 and 3 because once you point head of temp node,the rest of the big node is unreachable
		//therefore connect first before you move your head
	}
	
	
	public int getSize() {	
		return this.size;
	}

	public int getCount() {
		if(this.head==null) {
			return 0;
			
		}
		int count =1;
		Node <T> curr = this.head; //Cursor point the first  (head)
		while (curr.hasNext()) {
			count ++;
			curr=curr.getNext();
			
		}
		return count;
		
	}
	
	
	public static void main(String[] args) {
	MyLinkedList <Integer> One = new MyLinkedList<>();
	One.insertAtStart(5);
	One.insertAtStart(15);
	One.insertAtStart(25);
	One.insertAtStart(35);
	
	System.out.println(One.getCount());
	System.out.println(One.getSize());
	
	}
	
//3 toString Method

public class MyLinkedList <T> {
	

	private Node <T> head;
	private int size;
	
	
	public MyLinkedList() {
		this.head = null;
		this.size=0;
		
	}
	public void insertAtStart (T item) {
		Node <T> temp = new Node <T> (item);//1: create node for the item
		temp.setNext(this.head);// 2 connect head to the rest of the list
		this.head = temp;//3: (pointing the head) for temp node
		this.size++;
		// you cannot switch 2 and 3 because once you point head of temp node,the rest of the big node is unreachable
		//therefore connect first before you move your head
	}
	
	
	public int getSize() {	
		return this.size;
	}

	public int getCount() {
		if(this.head==null) {
			return 0;
			
		}
		int count =1;
		Node <T> curr = this.head; //Cursor point the first  (head)
		while (curr.hasNext()) {
			count ++;
			curr=curr.getNext();
			
		}
		return count;	
	}
	
	
	@Override
	public String toString() {
		if (this.head ==null){
		return "Empty List!!";
		}
		StringBuilder sb = new StringBuilder();
		Node <T> curr = this.head;
		while (curr!=null) {
			sb.append(curr.getItem().toString() + ",");
			curr=curr.getNext();
		}
			
		return sb.toString();
	}
	public static void main(String[] args) {
	MyLinkedList <Integer> One = new MyLinkedList<>();
	One.insertAtStart(5);
	One.insertAtStart(15);
	One.insertAtStart(25);
	One.insertAtStart(35);
	
	System.out.println(One);
	System.out.println(One.getCount());
	System.out.println(One.getSize());
	
	}
}

35,25,15,5, (5 was added first and 35 add last)
4
4


//4 remove from Start

public class MyLinkedList<T> {

	private Node<T> head;
	private int size;

	public MyLinkedList() {
		this.head = null;
		this.size = 0;

	}

	public void insertAtStart(T item) {

		Node<T> temp = new Node<T>(item);// 1: create node for the item
		temp.setNext(this.head);// 2 connect head to the rest of the list
		this.head = temp;// 3: (pointing the head) for temp node
		this.size++;
		// you cannot switch 2 and 3 because once you point head of temp node,the rest
		// of the big node is unreachable
		// therefore connect first before you move your head
	}

	public int getSize() {
		return this.size;
	}

	public int getCount() {
		if (this.head == null) {
			return 0;

		}
		int count = 1;
		Node<T> curr = this.head; // Cursor point the first (head)
		while (curr.hasNext()) {
			count++;
			curr = curr.getNext();

		}
		return count;
	}

	public boolean empty() {
		return this.size == 0;
	}

	public T removeFromStart() {
		if (this.empty()) {
			throw new IllegalStateException("You are removing from an empty list!!");
		}
		T item = this.head.getItem(); // T item to get the whole item (current element)
		this.head = this.head.getNext();//move the head from current to the next item
		this.size--;//reduce the size by 1
		return item;//return it
	}

	@Override
	public String toString() {
		if (this.head == null) {
			return "Empty List!!";
		}

		StringBuilder sb = new StringBuilder();
		Node<T> curr = this.head;
		while (curr != null) {
			sb.append(curr.getItem().toString() + ",");
			curr = curr.getNext();
		}

		return sb.toString();
	}

	public static void main(String[] args) {
		MyLinkedList<Integer> One = new MyLinkedList<>();
		One.insertAtStart(5);
		One.insertAtStart(15);
		One.insertAtStart(25);
		One.insertAtStart(35);

		System.out.println(One);
		System.out.println(One.getCount());
		System.out.println(One.getSize());

		One.removeFromStart();

		System.out.println(One);

	}



//Summarise for Friday

Insert from Start
	public void insertAtStart(T item) {

		Node<T> temp = new Node<T>(item);// 1: create node for the item
		temp.setNext(this.head);// 2 connect head to the rest of the list
		this.head = temp;// 3: (pointing the head) for temp node
		this.size++;
		// you cannot switch 2 and 3 because once you point head of temp node,the rest
		// of the big node is unreachable
		// therefore connect first before you move your head
	}

Remove from Start	
	public boolean empty() {
		return this.size == 0;
	}

	public T removeFromStart() {
		if (this.empty()) {
			throw new IllegalStateException("You are removing from an empty list!!");
		}
		T item = this.head.getItem();
		this.head = this.head.getNext();
		this.size--;
		return item;
	}
	
To String (,not removedyet)
	
@Override
	public String toString() {
		if (this.head == null) {
			return "Empty List!!";
		}

		StringBuilder sb = new StringBuilder();
		Node<T> curr = this.head;
		while (curr != null) {
			sb.append(curr.getItem().toString() + ",");
			curr = curr.getNext();
		}

		return sb.toString();
	}
	
	








