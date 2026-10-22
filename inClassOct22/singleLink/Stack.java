package singleLink;

public class Stack extends LinkedList{
	public void push(int value) {
		Node newNode = new Node(value);
		newNode.next = this.head;
		this.head = newNode;
	}
	
	public Node pop() {
		Node node = this.head;
		this.head = this.head.next;
		return node;
	}
	public Node peek() {
		return this.head;
	}
	
	public static void main(String[] args) {
		Stack stack = new Stack();
		
		stack.push(30);
		stack.push(20);
		stack.push(10);
		stack.show();
		stack.pop();
		stack.show();
		stack.pop();
		stack.show();



	}

}
