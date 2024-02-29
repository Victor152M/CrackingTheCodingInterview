package cracking.thecoding.interview.chapter2.linked.lists;
import cracking.thecoding.interview.chapter2.linked.lists.
CreatingLinkedList.Node;

//2.2
public class ReturnKthToLast {
	//My solution
	int returnKthToLast(Node head, int k) {
		Node initialHead = head;
		Node current = head;
		int length = 1;
		while (current.next != null) {
			length++;
			current = current.next;
		}
		int position = length - k;
		for (int i = 0; i <position; i++) {
			initialHead = initialHead.next;
		}
		return initialHead.data;
	}
	//CTCI recursive solution
	int printKthToLast(Node head, int k) {
		if (head == null) {
			return 0;
		}
		
		// Think about how this actually starts from the end of the list!
		// at max depth: 0 + 1
		// next result: 1 + 1
		int index = printKthToLast(head.next, k) + 1;
		if (index == k) {
			System.out.println(k + "th to last node is " + head.data);
		}
		return index;
	}
}
