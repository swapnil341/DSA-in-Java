import linkedlist.LinkedList;

// Stack implementation using LinkedList
public class StackUsingLinkedList {
	LinkedList list = new LinkedList();
	
	
	public void push(int data) {
		list.insertAtBegin(data);
	}
	
	public int pop() {
		return list.deleteBegin();
	}
	
	public int peek() {
		int ele = this.pop();
		this.push(ele);
		return ele;
	}
}
