 package Lab4;
 import java.util.Random;
import java.util.Scanner;

 public class GameGrid {
	 
	int iUserRow = 0;
	int iUserCol = 0;

      void run(){
    	 //instance variables 
         int[][] aiGrid = new int[10][10];
         Random oRand = new Random();
         int iRandNumber;
         int iWallChance = 0;
         Scanner input = new Scanner(System.in);
         String userInput = "" ;
         int iUserRow = 0;
         int iUserCol = 0;
         LinkedList List = new LinkedList();
         int count = 0;

         //asks the user to set the difficulty
         System.out.println("what would you like the difficulty to be:");
         System.out.println("  1) for Easy");
         System.out.println("  2) for Medium");
         System.out.println("  3) for Hard");
         iWallChance = input.nextInt();
         
         //if(iWallChance < 1 || iWallChance > 3 )
         
         //moves to each position in the array
         for(int x = 0; x < aiGrid.length; x++ ){
             for(int y = 0 ; y < aiGrid[x].length; y++){
            	 
            	 //fills it with either a 0 or 1            
                 iRandNumber = oRand.nextInt(10);
         if(iRandNumber < iWallChance){
             aiGrid[x][y] = 1;
                 }
             else{
                aiGrid[x][y] = 0;    
             }
            //setting the top corner to 0 so it isn't an instant loss
            aiGrid[0][0] = 0;
            aiGrid[1][0] = 0;
            aiGrid[0][1] = 0;

               }
             }
         
         //While statement for moving through the GameBoard      
         while(iUserRow < 9 && iUserCol < 9){
           	System.out.printf("Type d to move down or r to move right:");
           	userInput = input.next();
        	 
        	//checks for user move  	
        	if(userInput.equals("d")){
        		++iUserRow;//if they enter d it moves down a row 
        	}//if
        	
        	if(userInput.equals("r")){
        		++iUserCol;//if they enter r it moves over 1 column
        	}//if
 
        
        	//calls the addNewNode method from the list LinkedList class
        		List.addNewNode(iUserRow,iUserCol);
        	
        	
        	if(aiGrid[iUserRow][iUserCol] == 1){   //checks if the current index is = to 1
        		break;
        		}//if
         }//while
         
         while(List.headNode != null){ 											//while loop check if the list is empty
        	aiGrid[List.headNode.xPosition][List.headNode.yPosition] = 4;      //changes each index you passed through to a 4
        	

        	 List.removeHeadNode();	 //calls the removeHeadNode Method and removes the current head node 
        	 count++;
         }
         
        if(iUserRow == 9 || iUserCol == 9){
			   System.out.printf("\n\ncongrats you won with %d moves\n", count-1 ); //if you reach the side or bottom it prints  you win				   	
			   System.out.println("Here is the Gameboard:");   //prints the GameBoard for the user
			   System.out.println("The 4's mark the path you took:");
			     
			//prints the array to the user   
			    for(int x = 0; x < aiGrid.length; x++ ){
			      for(int y = 0 ; y < aiGrid[x].length; y++){
			        System.out.print(aiGrid[x][y]);
			      }//for loop
			        System.out.println("");
			    }//for loop
        }//if
    	   else{
    	       System.out.printf("\n\nGame over in %d moves", count-1); //if it is 1 it prints game over to the screen
    	       System.out.println("\nHere is the GameBoard:");   //prints the GameBoard for the user    	    	
    	       System.out.println("The 4's mark the path you took:");
    	    	    
    	    	//prints the array to the user    
    	    	  for(int x = 0; x < aiGrid.length; x++ ){
    	    	    for(int y = 0 ; y < aiGrid[x].length; y++){
    	    	       System.out.print(aiGrid[x][y]);
    	    	    }//for loop
    	    	       System.out.println("");
    	    	  }//for loop
    	    	     
		   }//else
        		input.close();
        		
      }//run method
      		
 }//GameGrid class

 
 