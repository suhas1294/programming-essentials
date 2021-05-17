package linkedList;

public class DoubleCircularLinkedListMain {

	public static void main(String[] args) {
		DoubleCircularLinkedList list = new DoubleCircularLinkedList();
		list.createDoubleLinkedList(5);
		list.insertInLinkedList(10, 1);
		list.insertInLinkedList(20, 2);
		list.insertInLinkedList(30, 2);
		list.insertInLinkedList(40, 1);
		
		System.out.println("List Now: ");
		list.traverseLinkedList();
		
		list.traverseLinkedListInReverseOrder();
		list.printHeadUsingTail();
		
		
		System.out.println("\nSearching the node having value 40: ");
		list.searchNode(40);
		
		System.out.println("\nSearching the node having value 200: ");
		list.searchNode(200);
		
		
		System.out.println("\n\nDeleting the node having location = 0: ");
		System.out.println("Before Deletion...");
		list.traverseLinkedList();
		list.deletionOfNode(0);
		System.out.println("After Deletion...");
		list.traverseLinkedList();
		
		System.out.println("\n\nDeleting the node having location = 3: ");
		System.out.println("Before Deletion...");
		list.traverseLinkedList();
		list.deletionOfNode(3);
		System.out.println("After Deletion...");
		list.traverseLinkedList();

		System.out.println("\n\nDeleting the node having location = 20: ");
		System.out.println("Before Deletion...");
		list.traverseLinkedList();
		list.deletionOfNode(20);
		System.out.println("After Deletion...");
		list.traverseLinkedList();
		
				
		list.deleteLinkedList();
		list.traverseLinkedList();
		
	}

}
