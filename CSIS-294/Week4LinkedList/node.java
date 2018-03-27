package Week4LinkedList;

public class node {
	
	private String airportID;
	private node nextNode;
	
	public String getAirportID(){
		return airportID;
	}
	public void setAirportID(String sAirportID){
	this.airportID = sAirportID;
	}
	public node getNextNode(){
		return nextNode;
	}
	public void setNextNode(node oNextNode){
	this.nextNode = oNextNode;
	}
}
