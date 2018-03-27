 package Project3;
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

         //asks the user to set the difficulty
         System.out.println("what would you like the difficulty to be:");
         System.out.println("  1) for Easy");
         System.out.println("  2) for Medium");
         System.out.println("  3) for Hard");
         iWallChance = input.nextInt();
                
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
         while(iUserRow <= 9 || iUserCol <= 9){
    	   //checking to see if the user has reached either side of the GameBoard 	   
    	   if(iUserRow < 9 && iUserCol < 9){
        	System.out.printf("Type d to move down or r to move right:");
        	userInput = input.next();
        	
        	//checks for user move  	
        	if(userInput.equals("d")){
        		iUserRow++;//if they enter d it moves down a row 
        	}//if
        	else{
        		iUserCol++;//if they enter r it moves over 1 column
        		}//else
        	
        	//checking if the index in the array is 1 0r 0
        	if(aiGrid[iUserRow][iUserCol] == 1){
        		aiGrid[iUserRow][iUserCol] = 4;//sets the place they were last at to 4 so they no where they got to
        		System.out.println("Game over"); //if it is 1 it prints game over to the screen
        	    System.out.println("Here is the GameBoard:");   //prints the GameBoard for the user
        	    System.out.println("The 4 marks your final location:");
        	     for(int x = 0; x < aiGrid.length; x++ ){
        	         for(int y = 0 ; y < aiGrid[x].length; y++){
        	        	System.out.print(aiGrid[x][y]);
        	           }//for loop
        	           	System.out.println("");
        	       }//for loop
        		break;
        	}//if
    	   }//if
    	   	else{
    	   		aiGrid[iUserRow][iUserCol] = 4;//sets the place they were last at to 4 so they no where they got to
    		   System.out.println("congrats you win"); //if you reach the side or bottom it prints  you win
    		   		//prints the GameBoard for the user
    		   System.out.println("Here is the Gameboard:");   //prints the GameBoard for the user
          	   System.out.println("The 4 marks your final position:");
    		    for(int x = 0; x < aiGrid.length; x++ ){
    		      for(int y = 0 ; y < aiGrid[x].length; y++){
    		        System.out.print(aiGrid[x][y]);
    		           }//for loop
    		        System.out.println("");
    		       }//for loop
    		break;
    	
    	   			}//else 
        		}//while 
         		input.close();
       		}//run method
        }//GameGrid class
 
 