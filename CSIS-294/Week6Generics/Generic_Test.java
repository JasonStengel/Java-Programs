package Week6Generics;

import java.security.SecureRandom;
public class Generic_Test {

	public static void main(String[] args) {
		Pair<String, Double> oStockPrice;
		
		oStockPrice = new Pair<>("microsoft",89.5 );
		
		String sStockSymbol = oStockPrice.getFirst();
		double dStockPrice = oStockPrice.getSecond();
		
		SecureRandom oRand = new SecureRandom();
		
		chance(true);
		chance(true);
		chance(true);
		chance(true);
		chance(true);
		chance(true);
		
			
		chance(false);
		chance(false);
		chance(false);
		chance(false);
		chance(false);
		chance(false);
		//****************************************************
		
		

	
	}
	public static void chance(boolean lastMoveUp){
			SecureRandom oRand = new SecureRandom();	
		int iStockMoveLimit = 3;
		int iStockMove;
		
		lastMoveUp = true;
		
		int iTrendChance = 70;
		iStockMove = oRand.nextInt(iStockMoveLimit + 1);
		if(oRand.nextInt(100) < iTrendChance){
			//then keep trend	
			if(!lastMoveUp){
				iStockMove = iStockMove * -1;	
			}
		}
			else{
			//change the trend
				if(lastMoveUp){
					iStockMove = iStockMove * -1;
				
			}

       }
		System.out.println("Move" + iStockMove);
		
	
}	
	
	
	
	
}
