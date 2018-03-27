//gives the user a quiz on assorted global warming questions and grades them on it
package project1;
import java.util.Scanner;

	public class GlobalWarming {
		Scanner input = new Scanner(System.in);
		
		//Declare Instance Variable
		private String name;
		int result;
	
		//Declare Methods
		GlobalWarming(){
			name = null;
		}
		//setting/getting the string variable 
		public GlobalWarming(String name){
				setFirstName (name);
			}

			public void setFirstName (String name) {
					this.name = name;
			}
		
			public String getFirstName() {
				return name;
			}
			
		//start of the method quiz
		 int quiz() {
			 
			int Answer;
			result = 0;
			 
			System.out.print("Answer each question with the number corresponding to the most "+ "right answer\n\n");
			
			
			//Question 1
			System.out.print("What animal does decreasing amounts of fish in Antartic waters affect the most?___\n");
			System.out.printf("1)Dogs\n2)Penguins\n3)Whales\n4)Polar Bears\n");
			Answer = input.nextInt();
			if(Answer == 2)
				result = result + 1;
			
						
			//Question 2	
			System.out.print("How does receading Antartic ice affect polar bears?___\n");
			System.out.printf("1)Smaller seal Hunting Ground\n2)Warmer\n3)safer\n4)easier to hunt\n");
			Answer = input.nextInt();
			
			if(Answer == 1)
				result = result + 1;
			
			
			//Question 3
		    System.out.print("How do greenhouse gases affect the planet?___\n");
			System.out.printf("1)traps heat in the atmothphere\n2)breaks down the ozone\n3)the gases make the planet hotter\n4)kills animals\n");
			Answer = input.nextInt();
				
			if(Answer == 1)
				result = result + 1;
			
				
			//Question 4
			System.out.print("What is the main cause of global warming?___\n");
			System.out.printf("1)natural causes\n2)seaweed\n3)greenhouse gases\n4)volcanoes\n");
			Answer = input.nextInt();
					
			if(Answer == 3)
				result = result + 1;
			
			//Question 5
			System.out.print("Which country currently emits the most greenhouse gases?___\n");
			System.out.printf("1United States\n2)Russia\n3)England\n4)China\n");
			Answer = input.nextInt();
					
			if(Answer == 4)
				result = result + 1;
			
			//Question 6
			System.out.print("How long does it take carbon dioxide in the enviorment to dissipate?\n");
			System.out.printf("1)1\n2)1000\n3)100\n4)25\n");
			Answer = input.nextInt();
					
			if(Answer == 3)
				result = result + 1;
			
			//Question 7
			System.out.print("Which of these compounds makes up the majority of greenhouse gas?___\n");
			System.out.printf("\n1)Methane\n2)Carbon Dioxide\n3)Nitrous Oxide\n4)Fluorinated Gases\n");
			Answer = input.nextInt();
					
			if(Answer == 2)
				result = result + 1;
			
			//Question 8
			System.out.print("How do contrails of planes and jets affect the environment?___\n");
			System.out.printf("1)Trap Heat\n2)Cool planet\n3)Absorb Heat\n4)Reflect Heat\n");
			Answer = input.nextInt();
					
			if(Answer == 1)
				result = result + 1;
			
			//Question 9
			System.out.print("Wht Can be done to help slow global warming?___\n");
			System.out.printf("1)hybrid cars\n2)car pooling\n3)reduce greenhouse emissions\n4)reduce pollution\n");
			Answer = input.nextInt();		
			if(Answer == 3)
				result = result + 1;
			
			//Question 10
			System.out.print("What type of weather will be affected by global warming?___\n");
			System.out.printf("1)rain\n2)snow\n3)hurricanes\n4)wind\n");
			Answer = input.nextInt();
					
			if(Answer == 3)
				result = result + 1;
	
			return result;
				
	}//end of method quiz
	
}//end class GlobalWarming

