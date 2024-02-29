package cracking.thecoding.interview.chapter2.linked.lists;
import cracking.thecoding.interview.chapter2.linked.lists.
CreatingLinkedList.Node;

//Chapter 2 Linked Lists
public class Main {

	public static void main(String[] args) {
		//2.1
		CreatingLinkedList outerClass = new CreatingLinkedList();
		CreatingLinkedList.Node linkedList = outerClass.new Node(0);
		linkedList.appendToTail(1); linkedList.appendToTail(1);
		linkedList.appendToTail(3); linkedList.appendToTail(2);
		linkedList.appendToTail(2); linkedList.appendToTail(1);
		
		RemoveDups removeDups = new RemoveDups();
		//removeDups.removeDuplicates(linkedList);
		
		//2.2
		ReturnKthToLast returnKthToLast = new ReturnKthToLast();
		int result = returnKthToLast.returnKthToLast(linkedList, 4);
		System.out.println(result);
	}

}
