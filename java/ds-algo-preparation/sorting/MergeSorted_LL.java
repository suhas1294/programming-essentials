Node sortedMerge(Node headA, Node headB) 
{ 
	Node dummyNode = new Node(0); 
	Node tail = dummyNode; 
	while(true){ 
		if(headA == null){ 
			tail.next = headB; 
			break; 
		} 
		if(headB == null){ 
			tail.next = headA; 
			break; 
		}
		if(headA.data <= headB.data){ 
			tail.next = headA; 
			headA = headA.next; 
		}else{ 
			tail.next = headB; 
			headB = headB.next; 
		}
		tail = tail.next; 
	}
	return dummyNode.next; 
}