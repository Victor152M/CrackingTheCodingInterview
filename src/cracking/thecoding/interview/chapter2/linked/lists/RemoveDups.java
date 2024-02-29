package cracking.thecoding.interview.chapter2.linked.lists;
import java.util.HashSet;
import cracking.thecoding.interview.chapter2.linked.lists.
CreatingLinkedList.Node;

//2.1
public class RemoveDups {
	// with a buffer
	void removeDuplicates(Node n) {
		HashSet<Integer> set = new HashSet<Integer>();
		Node previous = null;
		while (n != null) {
			if (set.contains(n.data)) {
				previous.next = n.next;
			} else {
				set.add(n.data);
				previous = n;
			}
			n = n.next;
		}
	}
	
	//no buffer
	void removeDupsNoBuffer(Node head) {
		Node current = head;
		while (current != null) {
			//Remove all future nodes that have the same value
			Node runner = current;
			while (runner.next != null) {
				if (runner.next.data == current.data) {
					runner.next = runner.next.next;
				} else {
					runner = runner.next;
				}
			}
			current = current.next;
		}
	}
}
