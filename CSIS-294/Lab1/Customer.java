package Lab1;

//- Two class-level instance variables.
	//- One for the customer name.
	//- One for the array of item prices.
//- One method.
		//- A method called printDetails.
		//- No input or output for this method. It simply traverses the array and prints out each value and the total.
  
public class Customer {
	String name;
	double[] prices;
	
	Customer(String Name, double[] Prices){
	
		name = Name;			//member variables
		prices = Prices;
			
	}
	
	public void printDetails(String name, int count) {
		
		double total = 0.0; 
		int increm = 1;
		
		System.out.println("\nGreat, here is your customer's purchase details:\n");
		System.out.println("Name:" + name);

		for(int i = 0; i < count; i++){
			System.out.println("Item #" + increm + ":   " + prices[i]);
			//total = total + prices[i];
			total += prices[i];
			increm++;
		}
		System.out.println("****************");
		System.out.printf("Total:    %.2f",total);
		
	}
}
	


