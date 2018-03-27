package Lab4;

public class LinkedList {
	
		Node headNode = new Node();

		public Node addNewNode(int xPosition,int yPosition){
		
		//adds MSP to the linked list
		Node oNewNode = new Node();
		oNewNode.setxPosition(xPosition);
		oNewNode.setyPosition(yPosition);
		
		//point next node to the current head node 
		oNewNode.setNextNode(headNode);
		
		//then assign this new node to the head node variable
		headNode = oNewNode;
		return headNode;
	}
		public Node removeHeadNode(){
		    headNode = headNode.nextNode;
		    
		    return headNode;

	}

}
