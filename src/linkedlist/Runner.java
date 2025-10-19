package linkedlist;

public class Runner {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
//		list.insertAtBegin(10);
//		list.insertAtBegin(20);
//		list.insertAtBegin(30);
//		list.displayList();
//		list.insertAtBegin(90);
//		list.displayList();
		
//		list.insertAtEnd(10);
//		list.insertAtEnd(20);
//		list.insertAtEnd(30);
		list.displayList();
		
//		list.insertAtPos(15, 2);
//		list.insertAtPos(5, 1);
//		list.insertAtPos(25, 5);
//		list.insertAtPos(35, 7);
		list.displayList();
//		list.insertAtPos(90, 9);
//		list.displayList();
		
		list.deleteEnd();
		list.displayList();
		
	}

}
