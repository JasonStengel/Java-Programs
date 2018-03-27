package FirstProject;

public class TradeQueue {
	TradeNode headTradeNode;
	TradeNode tailTradeNode;
	TradeNode oTemp;
	 TradeNode enqueue(String sStockSymbol, int iPurchaseShareCount, boolean bBuy){	
		
			
			//adds MSP to the linked list
			TradeNode oNode = new TradeNode();
			 oNode.setstockSymbol(sStockSymbol);
			 oNode.setshareCount(iPurchaseShareCount);
			 oNode.setbuy(bBuy);
			
			//point next node to the current head node 
			oNode.setnextTradeNode(headTradeNode);
			
			//then assign this new node to the head node variable
			headTradeNode = oNode;
			return headTradeNode;
 
//		 TradeNode oNode = new TradeNode();
//		 oNode.setstockSymbol(sStockSymbol);
//		 oNode.setshareCount(iPurchaseShareCount);
//		 oNode.setbuy(bBuy);
		 
//		if(headTradeNode == null){
//			headTradeNode = oNode;
//			return headTradeNode;	
//		}	
//	    else{
//	    	oNode.setnextTradeNode(oNode);
//			tailTradeNode = oNode;
//			return tailTradeNode;
//		}
	}
	 public  TradeNode dequeue(){
		 oTemp = headTradeNode;
		 headTradeNode = headTradeNode.nextTradeNode;
		    
		    return oTemp;
	 		 		 
	 }	 
}
