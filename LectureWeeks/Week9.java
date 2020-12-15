//Monday
Main function
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
		One.insertAtEnd(150);
		System.out.println(One);

	}
	
//1 Insert At the End


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
	

	public void insertAtEnd(T item) {
		if (this.size==0) {
			this.insertAtStart(item);
			return;
		}
		
		Node<T> curr = this.head;
	//	while(curr!=null) {
		while(curr.getNext()!=null) {
			curr=curr.getNext();//stops at the value after the element
		}
		Node <T> newEnd = new Node<T>(item);//create a Node for the item
		curr.setNext(newEnd);//make it point to the last Node ( we had the second last as curr already)
		this.size++;
		
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
		T item = this.head.getItem();
		this.head = this.head.getNext();
		this.size--;
		return item;
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
		One.insertAtEnd(150);
		System.out.println(One);

	}
	
	
}



//2 Retrieving Node from A Specific Index
	public Node<T> retrieveNodeAtIndex(int index) {

		if (index < 0 || index > this.size) {
			throw new IndexOutOfBoundsException("Index is not valid!!");
		}

		Node<T> curr = this.head;

		for (int i = 0; i < index; i++) {
			curr = curr.getNext();
		}
		return curr;
	}

	//Retrieving Item from A Specific Index
	public T retrieveItemAtIndex(int index) {
		return retrieveNodeAtIndex(index).getItem();
	}

//For Number 2
public static void main(String[] args) {
		MyLinkedList<Integer> One = new MyLinkedList<>();
		One.insertAtStart(5);
		One.insertAtStart(15);
		One.insertAtStart(25);
		One.insertAtStart(35);
		One.insertAtEnd(150);
	
		System.out.println(One);
		//System.out.println(One.getCount());
		System.out.println(One.getSize());
		System.out.println(One.toString());

		One.removeFromStart();

//		System.out.println(One);
		
		
		System.out.println(One.retrieveItemAtIndex(0));
		System.out.println(One.retrieveItemAtIndex(2));
		System.out.println(One.retrieveItemAtIndex(One.size-1));
		
		
		

	}
	
	
}

35,25,15,5,150,
4
35,25,15,5,150,
//remove from start become
25,15,5,150,
25 //index 0
5//index 2
150 //Retrieve last (size -1)



//3 Remove At Index
	//Remove At Index
	public T removeAtIndex(int index) {
		if (this.head==null) {
			throw new IllegalArgumentException("No Element To Remove!");
		}
		if (index==0) {
			System.out.println("It is Empty therefore remove From Start");
			return this.removeFromStart();
				
		}
		
	//	Node <T> curr = this.retrieveNodeAtIndex(index);
		Node <T> prev = this.retrieveNodeAtIndex(index-1);
		Node <T> curr = prev.getNext();

		
		prev.setNext(curr.getNext());
		this.size -- ;
		return curr.getItem();
	}

public static void main(String[] args) {
		MyLinkedList<Integer> One = new MyLinkedList<>();
		One.insertAtStart(5);
		One.insertAtStart(15);
		One.insertAtStart(25);
		One.insertAtStart(35);
		One.insertAtEnd(150);
	
		System.out.println(One);
		//System.out.println(One.getCount());
		System.out.println(One.getSize());
		System.out.println(One.toString());
		

		System.out.println(One.removeAtIndex(0));
	

	}
	
	
	
}
Output:
35,25,15,5,150,
5
35,25,15,5,150,
It is Empty
35














Insert At the End

public void insertAtEnd(T item) {
	if (this.size==0) {
			this.insertAtStart(item);
			return;
		}
		Node<T> curr = this.head;
	//	while(curr!=null) {
		while(curr.getNext()!=null) {
			curr=curr.getNext();//stops at the value after the element
		}
		Node <T> newEnd = new Node<T>(item);//create a Node for the item
		curr.setNext(newEnd);//make it point to the last Node ( we had the second last as curr already)
		
		
}

Retrieving Node from A Specific Index
	public Node<T> retrieveNodeAtIndex(int index) {

		if (index < 0 || index > this.size) {
			throw new IndexOutOfBoundsException("Index is not valid!!");
		}

		Node<T> curr = this.head;

		for (int i = 0; i < index; i++) {
			curr = curr.getNext();
		}
		return curr;
	}


Retrieving Item from A Specific Index
	public T retrieveItemAtIndex(int index) {
		return retrieveNodeAtIndex(index).getItem();
	}




Remove At Index
	public T removeAtIndex(int index) {
		if (this.head==null) {
			throw new IllegalArgumentException("No Element To Remove!");
		}
		Node <T> curr = this.retrieveNodeAtIndex(index);
		Node <T> prev = this.retrieveNodeAtIndex(index-1);
		prev.setNext(curr.getNext());
		this.size -- ;
		return curr.getItem();
	}






















