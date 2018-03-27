package Week4LinkedList;

public class LinkedList {

	public static void main(String[] args) {
		
		node oHeadNode;
		
		oHeadNode = new node();
		oHeadNode.setAirportID("ATL");
		
		//adds MSP to the linked list
		node oNewNode = new node();
		oNewNode.setAirportID("MSP");
		
		//point next node to the current head node 
		oNewNode.setNextNode(oHeadNode);
		
		//then assign this new node to the head node variable
		oHeadNode = oNewNode;
		
		System.out.println("Head Node: "+oHeadNode.getAirportID());
		System.out.println("Second Node:"+oHeadNode.getNextNode().getAirportID());
		
		oHeadNode = addNewNode("LAX", oHeadNode);
		
		System.out.println("\nNew Head Node: "+oHeadNode.getAirportID());
		System.out.println("New Second Node: "+oHeadNode.getNextNode().getAirportID());
		System.out.println("New Third Node: "+oHeadNode.getNextNode().getNextNode().getAirportID());
	
	}
	public static node addNewNode(String sAirport, node oHeadNode){
		
		//adds MSP to the linked list
		node oNewNode = new node();
		oNewNode.setAirportID(sAirport);
		
		//point next node to the current head node 
		oNewNode.setNextNode(oHeadNode);
		
		//then assign this new node to the head node variable
		oHeadNode = oNewNode;
	
		return oHeadNode;
		
	}

}
