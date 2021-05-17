package linkedList;

import node.SingleNode;

public class SingleCircularLinkedList {
	private SingleNode head;
	private SingleNode tail;
	private int size;// denotes size of list

	
	SingleNode createSingleLinkedList(int nodeValue) {
		head = new SingleNode();
		SingleNode node = new SingleNode();
		node.setValue(nodeValue);
		node.setNext(node);
		head = node;
		tail = node;
		size = 1;// size =1
		return head;
	}

	public SingleNode getHead() {
		return head;
	}

	public void setHead(SingleNode head) {
		this.head = head;
	}

	public SingleNode getTail() {
		return tail;
	}

	public void setTail(SingleNode tail) {
		this.tail = tail;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	void insertInLinkedList(int nodeValue, int location) {
		SingleNode node = new SingleNode();
		node.setValue(nodeValue);
		System.out.println("Inserting new node at location: " + location);
		if (!existsLinkedList()) {
			System.out.println("The linked list does not exist!!");
			return; // Linked List does not exists
		} else if (location == 0) {// insert at first position
			node.setNext(head);
			head = node;
			tail.setNext(node); // update tail
		} else if (location >= size) {// insert at last position
			tail.setNext(node);
			tail = node; // to keep track of last node
			tail.setNext(head); // update tail to circularly point head
		} else // insert at specified location
		{
			SingleNode tempNode = head;
			int index = 0;
			while (index < location - 1) {// loop till we reach specified node
				tempNode = tempNode.getNext();
				index++;
			}// insert new node after tempNode
			node.setNext(tempNode.getNext());
			tempNode.setNext(node);			
		}
		size++;
	}

	public boolean existsLinkedList() {
		// if head is not null retrun true otherwise return false
		return head != null;
	}
	

	// Traverse Linked List
	void traverseLinkedList() {
		if (existsLinkedList()) {
			SingleNode tempNode = head;
			for (int i = 0; i < size; i++) {

				System.out.print(tempNode.getValue());
				if (i != size - 1) {
					System.out.print(" -> ");
				}
				tempNode = tempNode.getNext();
			}
			System.out.println("\n");
		}else {
			System.out.println("\nLinked List does not exists !");
		}
	}
	
	
	// Traverse Linked List
	void printHeadUsingTail() {
		if (existsLinkedList()) {
			System.out.println("Printing Tail...");
			System.out.println(tail.getValue());
			
			System.out.println("Printing Head using Head reference...");
			System.out.println(head.getValue());
			
			System.out.println("Printing Head using Tail reference...");
			System.out.println(tail.getNext().getValue());
			
		}else{
			System.out.println("Linked List does not exists");
		}
	}

	
	//Delete linked list
	void deleteLinkedList() {
		System.out.println("\n\nDeleting Linked List...");
		head = null;
		if(tail == null) {
			System.out.println("Linked List is already deleted, nothing to delete !");
			return;
		}else {
			tail.setNext(null);
			tail = null;
			System.out.println("Linked List deleted successfully !");
		}
	}
	
	
	//Search given value in Linked List
	boolean searchNode(int nodeValue) {
		if (existsLinkedList()) {
			SingleNode tempNode = head;
			for (int i = 0; i < size; i++) {

				// System.out.print(tempNode.value);
				if (tempNode.getValue() == nodeValue) {
					System.out.print("Found the node at location: "+i);
					return true;
				}
				tempNode = tempNode.getNext();
			}
		}
		System.out.print("Node not found!! ");

		return false;
	}

	public void deletionOfNode(int location) {
		if (!existsLinkedList()) {
			System.out.println("The linked list does not exist!!");// Linked List does not exists
			return;
		} else if (location == 0) { // we want to delete first element
			head = head.getNext();
			tail.setNext(head);
			setSize(getSize()-1);
			if(getSize() == 0) { // if there are no more nodes in this list
				tail = null;
			}	
		}else if (location >= getSize()){ //If location is not in range or equal, then delete last node
			SingleNode tempNode = head;
			for (int i = 0; i < size - 1; i++) {
				tempNode = tempNode.getNext(); //temp node points to 2nd last node
			}
			if (tempNode == head) { //if this is the only element in the list
				tail = head = null;
				setSize(getSize()-1);
				return;
			}
			tempNode.setNext(head); 
			tail= tempNode;
			setSize(getSize()-1);
			
		}else { //if any inside node is to be deleted
			SingleNode tempNode = head;
			for (int i = 0; i < location - 1; i++) {
				tempNode = tempNode.getNext(); // we need to traverse till we find the location
			}	
			tempNode.setNext(tempNode.getNext().getNext()); // delete the required node
			setSize(getSize()-1);
		}//end of else	
		
	}//end of method

}//end of class
