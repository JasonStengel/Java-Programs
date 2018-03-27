package FirstProject;
import java.util.Scanner;
public class StockMarketSim {
	TradingAccount tradingAccount;
	TradeQueue tradeQueue;
	StockEngine stockEngine;
	Scanner input = new Scanner(System.in);
	String sChoice;
	int iChoice;
	boolean bChoice;
	String sBuy;
	Boolean loop = true;
	
	void start(){
		tradingAccount = new TradingAccount();
		tradeQueue = new TradeQueue();
		stockEngine = new StockEngine();
		
		runUI();
		
	}
	public void runUI(){
		System.out.println("Current Balence: "+ tradingAccount.Balance);

		while(loop){
			System.out.println("which stocks do you want to buy or sell?");
		for(int x = 0; x < 3; x++){
			System.out.println("Stock Symbol: " + ": "  + stockEngine.oStocks[x].stockSymbol +"\nPrice:"+stockEngine.oStocks[x].pricePerShare);
		}
				sChoice = stockEngine.oStocks[input.nextInt() - 1].stockSymbol;
			System.out.println("how many shares?");
				iChoice = input.nextInt();
			System.out.println("buy or sell?");
				sBuy = input.next();
			if(sBuy.equals("buy")){
				bChoice = true;
			}
			else{
				bChoice = false;
			}		
		 System.out.println("do you want to buy or sell any others? true or false");
		 loop = input.nextBoolean();
			tradeQueue.enqueue(sChoice,iChoice,bChoice);
			stockEngine.cycleTurn();	
		}
			processTrades();
	}
		void processTrades(){
	     while(tradeQueue.headTradeNode != null ){
			tradeQueue.dequeue();
			if( tradeQueue.oTemp.buy == true){
				if(tradeQueue.oTemp.stockSymbol.equals("APPL")){
					tradingAccount.oStock[0].shareCount = tradingAccount.oStock[0].shareCount + tradeQueue.oTemp.shareCount;
					tradingAccount.Balance = tradingAccount.Balance - stockEngine.oStocks[0].pricePerShare * tradeQueue.oTemp.shareCount;
				}
				else if(tradeQueue.oTemp.stockSymbol.equals("F")){
					tradingAccount.oStock[1].shareCount = tradingAccount.oStock[1].shareCount + tradeQueue.oTemp.shareCount;
					tradingAccount.Balance = tradingAccount.Balance - stockEngine.oStocks[1].pricePerShare * tradeQueue.oTemp.shareCount;	
				}		
				else{
					tradingAccount.oStock[2].shareCount = tradingAccount.oStock[2].shareCount + tradeQueue.oTemp.shareCount;
					tradingAccount.Balance = tradingAccount.Balance - stockEngine.oStocks[2].pricePerShare * tradeQueue.oTemp.shareCount;
				}			
			}
			else{
				if(tradeQueue.oTemp.stockSymbol == "APPL"){
					tradingAccount.oStock[0].shareCount = tradingAccount.oStock[0].shareCount - tradeQueue.oTemp.shareCount;
					tradingAccount.Balance = tradingAccount.Balance + stockEngine.oStocks[0].pricePerShare * tradeQueue.oTemp.shareCount;
				}
				else if(tradeQueue.oTemp.stockSymbol == "F"){
					tradingAccount.oStock[1].shareCount = tradingAccount.oStock[1].shareCount - tradeQueue.oTemp.shareCount;
					tradingAccount.Balance = tradingAccount.Balance + stockEngine.oStocks[1].pricePerShare * tradeQueue.oTemp.shareCount;	
				}		
				else{
					tradingAccount.oStock[2].shareCount = tradingAccount.oStock[2].shareCount - tradeQueue.oTemp.shareCount;
					tradingAccount.Balance = tradingAccount.Balance + stockEngine.oStocks[2].pricePerShare * tradeQueue.oTemp.shareCount;
				}	
			}
//			System.out.println("you current balance is: \n" + tradingAccount.Balance );
//			for(int x = 0; x < 3; x++){
//				System.out.println("You currently own :" +tradingAccount.oStock[x].stockSymbol + " with " + tradingAccount.oStock[x].shareCount + " shares");	
//	  }	
	}
	     	System.out.println("you current balance is: " + tradingAccount.Balance + "\n" );
			for(int x = 0; x < 3; x++){
				System.out.println("You currently own :" +tradingAccount.oStock[x].stockSymbol + " with " + tradingAccount.oStock[x].shareCount + " shares");	
	  }	
  }	
}

