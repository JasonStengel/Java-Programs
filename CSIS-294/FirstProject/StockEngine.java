package FirstProject;
import java.util.Random;

public class StockEngine {
	Random oRand = new Random();
	Stock[] oStocks = new Stock[3];
	int Trend = 70;
	StockEngine(){	
	Random oRand = new Random();	
	Stock oStock1 = new Stock();
		oStock1.stockSymbol ="APPL";
		oStock1.pricePerShare = (oRand.nextInt(101));
		oStock1.lastMoveUp = true;
	Stock oStock2 = new Stock();
		oStock2.stockSymbol ="F";
		oStock2.pricePerShare = (oRand.nextInt(101));
		oStock2.lastMoveUp = true;
	Stock oStock3 = new Stock();
		oStock3.stockSymbol ="MSFT";
		oStock3.pricePerShare = (oRand.nextInt(101));
		oStock3.lastMoveUp = true;	
	oStocks[0] = oStock1;
	oStocks[1] = oStock2;
	oStocks[2] = oStock3;
	}	
	void cycleTurn(){
		int change;
	for(int x = 0; x < oStocks.length; x++){		
		if(oStocks[x].lastMoveUp = true){
			change = oRand.nextInt(100);
			if(change < 60)
			  oStocks[x].pricePerShare = oStocks[x].pricePerShare + 3; 
			else
			  oStocks[x].pricePerShare = oStocks[x].pricePerShare - 3;
			  oStocks[x].lastMoveUp = false;			
		}//if
		else{
			change = oRand.nextInt(10);
			if(change < 60)
			  oStocks[x].pricePerShare = oStocks[x].pricePerShare + 3;
			else
			  oStocks[x].pricePerShare = oStocks[x].pricePerShare - 3;
			  oStocks[x].lastMoveUp = true;
	  }//else			
	}//for
	change = oRand.nextInt(10);
	System.out.println(change);
	for(int x = 0; x < oStocks.length; x++){
		System.out.println("stock Symbol:" + oStocks[x].stockSymbol +"\n" + "current price" + oStocks[x].pricePerShare +"\n");	
	}	
  }//method
}//class 
	

