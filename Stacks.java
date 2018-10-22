package dataStructures;

public class Stacks {

	private class Node {
		private Node next;
		private int data;
		
		public Node(Node _n, int _data) {
			setNext(_n);
			setData(_data);
		}

		private Node getNext() {
			return next;
		}

		private void setNext(Node next) {
			this.next = next;
		}

		private int getData() {
			return data;
		}

		private void setData(int data) {
			this.data = data;
		}
	}

	private Node root;
	
	public Stacks() {
		root = null;
	}
	
	public void push(int val) {
		Node p = new Node(root, val);
		root = p;
	}
	
	public void pop() {
		if(root == null) {
			System.out.println("Stack is empty ,,,");
			return;
		}
		else {
			root = root.getNext();
		}
	}
	
	public void display() {
		Node p = root;
		System.out.print("Stack is: ");
		while(p!= null) {
			System.out.print(p.getData() + " ");
			p = p.getNext();
		}
		System.out.println("");
	}
	
	public void stackTop() {
		System.out.println("Stacktop is: " + root.getData());
	}
	
	public void stackLen() {
		int len = 0;
		Node p = root;
		while(p!=null) {
			len++;
			p = p.getNext();
		}
		System.out.println("Stack length is: " + len);
	}
	
	public boolean isEmpty() {
		return root == null;
	}
}
