package Recursion;

import java.util.Arrays;
import java.util.Random;

public class Recursion {
	//randomly fill an array with numbers
	//pick a target number randomly from array 
	//search array using binary search to find index
	// for target number
	
	public void runRecursiveTest(){
		
		
		int iNumberRange = 100000;
		int iTotalNumbers = 1000;
		int[] aiNumbers = new int[iTotalNumbers];		
		int iTargetNumber;
		Random oRand = new Random();
		long lStartTime;
		long lEndTime;
		long lElapsed;
		
		
		//randomly fill an array with numbers
		for(int x = 0; x < aiNumbers.length; x++){
			aiNumbers[x] = oRand.nextInt(iNumberRange);	
		}
				
		//pick a target number randomly from array 
		iTargetNumber = aiNumbers[oRand.nextInt(iTotalNumbers)];
		
		//sort array
		Arrays.sort(aiNumbers);
		
//		for(int x = 0; x < aiNumbers.length; x++){
//			System.out.println("x:" + aiNumbers[x]);
//		}
		
		
		
		//search array using binary search to find index
		// for index of target number
		//get start time in nano seconds
		lStartTime = System.nanoTime();
		int indexFound = findIndexBinarySearch(aiNumbers, 0, iTotalNumbers - 1, iTargetNumber);
		lEndTime = System.nanoTime();
		lElapsed = lEndTime - lStartTime;
		System.out.println("Binary Search Time:" + lElapsed); 
		System.out.println("Index:" + indexFound + "\nTarget Number: " + iTargetNumber);
		 
		//get start time in nano seconds
		lStartTime = System.nanoTime();
		indexFound = findNumberTraditionalSearch(aiNumbers, iTargetNumber);
		lEndTime = System.nanoTime();
		//get end time in nano seconds
		lElapsed = lEndTime - lStartTime;
		
		
		System.out.println("\nTradional Search Time:" + lElapsed);	 
		System.out.println("Index:" + indexFound + "\nTarget Number: " + iTargetNumber);	 
	}	
	//binary search function
	private int findIndexBinarySearch(int[] aiNumbers, int iLow, int iHigh, int iTargetNumber){
		
		int iMiddle = (iHigh + iLow) / 2;
		
		//if target number at middle index.
		if(aiNumbers[iMiddle] == iTargetNumber){
			return iMiddle;
		}
		//if the target number is less than middle
		else if(iTargetNumber < aiNumbers[iMiddle]){
			return findIndexBinarySearch(aiNumbers, iLow, iMiddle - 1, iTargetNumber);
			
		}
		else{
			return findIndexBinarySearch(aiNumbers, iMiddle + 1, iHigh, iTargetNumber);
		
		}
	}
		
	
	private int findNumberTraditionalSearch(int[] aiNumbers, int iTargetNumber){
		
		for(int x = 0; x < aiNumbers.length; x++){
			if(aiNumbers[x] == iTargetNumber){
				return x;
					
				}		
			}
		return - 1;
		
		}	
	}

	

