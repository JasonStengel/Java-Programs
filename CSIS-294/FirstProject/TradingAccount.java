package FirstProject;
public class TradingAccount extends Account {
	
	
	float Balance = 1000;
	StockPosition[] oStock = new StockPosition[3];
	
	//Car Truck = new Car();
	 TradingAccount(){
	 StockPosition Apple = new StockPosition();
		Apple.stockSymbol = "APPL";
		Apple.shareCount = 0;
	StockPosition Ford = new StockPosition();
		Ford.stockSymbol = "F";
		Ford.shareCount = 0;
	StockPosition Microsoft = new StockPosition();
		Microsoft.stockSymbol = "MSFT";
		Microsoft.shareCount = 0;
	
	
		oStock[0] = Apple;
		oStock[1] = Ford;
		oStock[2] = Microsoft;
	
	}
	
}
