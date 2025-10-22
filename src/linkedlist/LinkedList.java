package linkedlist;

public class LinkedList {
	Node head = null;
	
	// Insert at Begin
	public void insertAtBegin(int data) {
		Node node = new Node(data,null);
		
		if(head == null) {
			head = node;
		}
		else {
			node.next = head;
			head = node;
		}
	}
	
	// Insert at given Position
	public void insertAtPos(int data, int pos) {
		Node node = new Node(data,null);
		
		if(head == null) {
			System.out.println("List is empty!");
		}
		else {
			if(pos == 1) {
				insertAtBegin(data);
			}
			else {
				Node tNode = head;
				for(int i = 0; i < (pos - 2) ; i++) {
					if(tNode == null) {
						System.out.println("Invalid Position! ");
						return ;
					}
					tNode = tNode.next;
				}
				if(tNode == null) {
					System.out.println("Invalid Position! ");
					return ;
				}
				node.next = tNode.next;
				tNode.next = node;
			}
			
		}
		
	}
	
	//insert at End 
	public void insertAtEnd(int data) {
		Node node = new Node(data,null);
		
		if(head == null) {
			head = node;
		}
		else {
			Node tNode = head;
			while(tNode.next != null) {
				tNode = tNode.next;
			}
			tNode.next = node;
		}
		
	}
	
	// Delete from Begin
	public int deleteBegin() {
		if(head == null) {
			//System.out.println("List is Empty!");
			return -1;
		}
		else {
			//System.out.println("Deleted element : " + head.data);
			int returnVal = head.data;
			head = head.next;
			return returnVal;
		}
	}
	
	// Delete from given position
	public int deleteFromPos(int pos) {
		if(head == null) {
			System.out.println("List is Empty!");
			return -1;
		}
		else {
			Node node = head;
			for(int i = 0 ; i <= pos - 2 ; i++) {
				node = node.next;
			}
			if(node == null) {
				System.out.println("Invalid Position!");
				return -1;
			}
			System.out.println("Deleted Element : " + node.next.data);
			int returnVal = node.next.data;
			node.next = node.next.next;
			return returnVal;
		}
	}
	
	// Delete Specific Element
	public int deleteElement(int ele) {
		if(head == null) {
			System.out.println("List is empty");
			return -1;
		}
		if(head.data == ele) {
			head = head.next;
			return head.data;
		}
		Node node = head;
		Node target = null;
		while(node != null) {
			if(node.data == ele) {
				target = node;
				break;
			}
			node = node.next;
		}
		if(target == null) {
			System.out.println(ele + " not found in the list ");
			return -1;
		}
		node = head;
		while(node != null && node.next != target) {
			node = node.next ;
		}
		
		System.out.println("deleting element : " + target.data);
		int returnVal = target.data;
		node.next = node.next.next;
		return returnVal;
	}
	
	// Delete from End
	public int deleteEnd() {
		if(head == null) {
			System.out.println("List is Empty!");
			return -1;
		}
		if(head.next == null) {
			head = null;
			return -1;
		}
		Node node = head;
		while(node.next.next != null) {
			node = node.next;
		}
		System.out.println("Deleting Node: " + node.next.data);
		int returnVal = node.next.data;
		node.next = node.next.next;
		return returnVal;
		
	}
	
	// Traverse 
	public void displayList() {
		Node node = head;
		
		if(node == null) {
			System.out.println("List is empty : head -> null\n");
		}
		else {
			System.out.print("head -> ");
			while(node.next != null) {
				System.out.print(node.data+" -> ");
				node = node.next;
				
			}
			System.out.print(node.data+" -> null\n");
		}
		
	}
}
