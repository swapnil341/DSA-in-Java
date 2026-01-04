public class Runner {

	public static void main(String[] args) {
		StackUsingLinkedList stack = new StackUsingLinkedList();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		stack.push(50);
		stack.push(10);
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	
	}

}
