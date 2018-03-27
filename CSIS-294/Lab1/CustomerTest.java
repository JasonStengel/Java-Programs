package Lab1;
import java.util.Scanner;

public class CustomerTest {

	public static void main(String[] args) {
		
//	    - This class will have only the main method and drive the conversation.
//	    - It will instantiate the Customer class.
//	    - It will ask the questions you see in the above dialog, get answers, and fill in values in Customer class instance.
//	    - First, it will exit if the customer doesn't enter "y" or "yes" in the first question.
//	    - Second, it will fill in the name.
//	    - Third, it will fill the array with values inputted from user.
//	    	- The number of items the user will enter is based on a question (see above dialog), so the array length is established at run time.  Therefore, the entry of items requires a loop of n times, where n is the number the user entered.
//	    	- You can either use a while loop or for loop here.
//	    - It will then call the method listed above in the Customer class to print out details.
		
		String name = "";
		int count = 0;
		double[] adItems;
		final int MAX_ARRAY = 10;
		adItems = new double[MAX_ARRAY];
		
		Customer test = new Customer(name, adItems);			// It will instantiate the Customer class.
		//open scanner instance for input
        Scanner input = new Scanner(System.in);					
		
		boolean answer = true;									
		
		System.out.println("Create a customer (True / False:) " );
		answer = input.nextBoolean();

		if(!answer){											//if false, close all
			input.close();										//close scanner
			System.out.println("This program will exit!" );
		}
		else{													//if true, complete questions and print
			System.out.println("What is the customer name?: ");
			name = input.next();
			
			System.out.println("How many items is the customer buying?: ");
			count = input.nextInt();

			
			for(int r=0; r < count; r++ ){
				System.out.printf("Enter a value for item #%d: ", r+1);
				adItems[r] = input.nextDouble();
				}
			answer = false;
			//close scanner
			input.close();										
			//call printDetails method in Customer class to print detail
			test.printDetails(name, count);						
		}
	}  //main
}




/**** Output example
Create a customer (True / False:) 
true
What is the customer name?: 
Ronaldo
How many items is the customer buying?: 
5
Enter a value for item #1: 5
Enter a value for item #2: 4
Enter a value for item #3: 3
Enter a value for item #4: 2
Enter a value for item #5: 1

Great, here is your customer's purchase details:

Name:Ronaldo
Item #1:   5.0
Item #2:   4.0
Item #3:   3.0
Item #4:   2.0
Item #5:   1.0
****************
Total:    15.00
 ****/
