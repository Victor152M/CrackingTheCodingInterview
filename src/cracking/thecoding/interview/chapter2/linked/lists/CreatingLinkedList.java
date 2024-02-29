package cracking.thecoding.interview.chapter2.linked.lists;

public class CreatingLinkedList {
	// The code below implements a basic singly liked list
	// There is a difference between a singly and a doubly linked list
	public class Node {
		Node next = null;
		int data;
		
		public Node(int d) {
			data = d;
		}
		
		// remember that variables/methods with the "static" keyword 
		// are class variables/methods. The rest are instance var/methods.
		void appendToTail(int d) {
			Node end = new Node(d);
			Node n = this;
			while (n.next != null) {
				n = n.next;
			}
			n.next = end;
		}
	}
	
	//Deleting a Node form a singly linked list
	Node deleteNode(Node head, int d) {
		Node n = head;
		
		if (n.data == d) {
			return head.next; //moved head
		}
		
		while (n.next != null) {
			if (n.next.data == d) {
				n.next = n.next.next;
				return head; // head did not change
			}
			n = n.next;
		}
		return head;
	}
	
}
