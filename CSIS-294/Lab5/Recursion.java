package Lab5;

import java.util.Arrays;
import java.util.Random;

public class Recursion {
	//randomly fill an array with numbers
	//pick a target number randomly from array 
	//search array using binary search to find index
	// for target number
	
	public void runRecursiveTest(){		
//******************************************************************************************		
		int iTotalNumbers = 10;
		String[] asString = new String[iTotalNumbers];		
		String iTargetString;
		Random oRand = new Random();
		long lStartTime;
		long lEndTime;
		long lElapsed;		
//******************************************************************************************		
		//filled the array with strings 
		asString[0] = "Frank";
		asString[1] = "Lima";
		asString[2] = "Joe";
		asString[3] = "Cassandra";
		asString[4] = "Mark";
		asString[5] = "Charlie";
		asString[6] = "Delta";
		asString[7] = "Zulu";
		asString[8] = "Jason";
		asString[9] = "George";
//******************************************************************************************		
		//pick a random index from the array 
		iTargetString = asString[oRand.nextInt(iTotalNumbers)];
		
		//sorts the array
		Arrays.sort(asString);
//******************************************************************************************		
		//search array using binary search to find index
		// for index of target number
		//get start time in nano seconds
		lStartTime = System.nanoTime();
		int indexFound = findIndexBinarySearch(asString, 0, iTotalNumbers - 1, iTargetString);
		//gets the end time in nano seconds
		lEndTime = System.nanoTime();
		//get the time it took for the method to run
		lElapsed = lEndTime - lStartTime;
		//prints the index and the target string
		System.out.println("Binary Search Time:" + lElapsed); 
		System.out.println("Index:" + indexFound + "\nTarget String: " + iTargetString);
//******************************************************************************************
	
		
//******************************************************************************************		
		//get start time in nano seconds
		lStartTime = System.nanoTime();
		indexFound = findNumberTraditionalSearch(asString, iTargetString);
		//get end time in nano seconds
		lEndTime = System.nanoTime();
		//get the time it took for the method to run
		lElapsed = lEndTime - lStartTime;
		//prints the index and the target string
		System.out.println("\nTradional Search Time:" + lElapsed);	 
		System.out.println("Index:" + indexFound + "\nTarget String: " + iTargetString);	 
//******************************************************************************************			
	}
	
//******************************************************************************************	
	//binary search function
	private int findIndexBinarySearch(String[] asString, int iLow, int iHigh, String iTargetString){
		
		//gets the middle index of the array
		int iMiddle = (iHigh + iLow) / 2;
		
		//if target number at middle index.
		if(iTargetString.equals(asString[iMiddle])){
			return iMiddle;
		}
		//if the target number is greater than the middle
		else if(iTargetString.compareTo(asString[iMiddle]) > 0){
			return findIndexBinarySearch(asString, iMiddle + 1,iHigh, iTargetString);	
		}
		else{
			//if the number is less than the middle
			return findIndexBinarySearch(asString, iLow,iMiddle - 1, iTargetString);
		}
	}
//******************************************************************************************	
		
	
//******************************************************************************************		
	//does a standard search
	private int findNumberTraditionalSearch(String[] asString, String iTargetString){
		
		//checks every index in the array one by one
		for(int x = 0; x < asString.length; x++){
			if(iTargetString.equals(asString[x])){
				return x;
					
				}		
			}
		return - 1;
		
		}
//******************************************************************************************	
	}

	

