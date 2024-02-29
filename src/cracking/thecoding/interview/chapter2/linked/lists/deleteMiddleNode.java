package cracking.thecoding.interview.chapter2.linked.lists;
import cracking.thecoding.interview.chapter2.linked.lists.
CreatingLinkedList.Node;

//2.3
public class deleteMiddleNode {
	boolean deleteANodeInTheMiddle(Node node) {
		if (node == null || node.next == null) {
			return false;
		} 
		Node next = node.next;
		node.data = next.data;
		node.next = next.next;
		return true;
	}
}
