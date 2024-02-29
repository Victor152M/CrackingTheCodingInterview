package cracking.thecoding.interview.chapter2.linked.lists;
import cracking.thecoding.interview.chapter2.linked.lists.
CreatingLinkedList.Node;

//2.2
//Try to understand this!
//Another solution
//We are trying to mimic passing values by reference in Java
public class returnKthToLastWrapper {
	class Index{
		public int value = 0;
	}
	Node kthToLast(Node head, int k) {
		Index index = new Index();
		return kthToLast(head, k, index);
	}
	
	Node kthToLast(Node head, int k, Index index) {
		if (head == null) {
			return null;
		}
		Node node = kthToLast(head.next, k, index);
		index.value = index.value + 1;
		if (index.value == k) {
			return head;
		}
		return node;
	}
}
