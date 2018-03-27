package project1;

public class GlobalWarmingTest {

	public static void main(String[] args) {
		//local variables
		int result;
		
		//creating object and calling quiz class
		GlobalWarming test = new GlobalWarming("Bill");
	    
		//Call quiz in GlobalWarming and return # of correct answers
		result = test.quiz(); 
	    
		//switch statement to output grade of test
		switch(result){
		
		case 10 :
			System.out.print("Excellent you got ten right");
			break;
		case 9 :
			System.out.print("Very Good you got nine right");
			break;
		case 8 :
			System.out.print("Very Good you got eight right");
			break;
		case 7 :
			System.out.print("Good Job you got seven right");
			break;
		case 6 :
			System.out.print("Time to brush up on your knowledge of Global Warming 6/10");
			break;
		case 5 :
			System.out.print("Time to brush up on your knowledge of Global Warming 5/10");
			break;
		case 4 :
			System.out.print("Time to brush up on your knowledge of Global Warming 4/10");
			break;
		case 3 :
			System.out.print("Time to brush up on your knowledge of Global Warming 3/10");
			break;
		case 2 :
			System.out.print("Time to brush up on your knowledge of Global Warming 2/10");
			break;
		case 1 :
			System.out.print("Time to brush up on your knowledge of Global Warming 1/10");
			break;
		case 0 :
			System.out.print("Time to brush up on your knowledge of Global Warming 0/10");
			break;
			
		}//End of switch	  
		
	}//end of method main
	
}//end class GlobalWarmingTest 
