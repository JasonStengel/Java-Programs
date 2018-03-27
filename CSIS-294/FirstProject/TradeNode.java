package FirstProject;
public class TradeNode {
	String stockSymbol;
	int shareCount;
	boolean buy;
	TradeNode nextTradeNode;
	
	
	public String getstockSymbol(){
		return stockSymbol;
	}
	public void setstockSymbol(String stockSymbol){
	this.stockSymbol = stockSymbol;
	}
	public int getshareCount(){
		return shareCount;
	}
	public void setshareCount(int shareCount){
	this.shareCount = shareCount;
	}
	public boolean getbuy(){
		return buy;
	}
	public void setbuy(boolean buy){
	this.buy = buy;
	}
	public TradeNode getnextTradeNode(){
		return nextTradeNode;
	}
	public void setnextTradeNode(TradeNode nextTradeNode){
	this.nextTradeNode = nextTradeNode;
	
	
	}
	
	
	
	
	
	
	
	
	
	
	

}
