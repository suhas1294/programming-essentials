// detect loop in linked list
detectLoop(){
	temp = head;
	Set<Node> nodes = new HashSet();
	while(temp.next != null){
		if(nodes.contains(temp)){
			return "loop detected"
		}
		nodes.add(temp);
	}
}