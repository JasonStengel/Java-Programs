package Lab6;



public class Lab6_Test {

	
	public static void main(String[] args) {	
//************************************************************************************		

		Triple<String,Integer,Integer>[] teamPerformence = new Triple[10];
		Pair<String,Double>[] winPercent = new Pair[teamPerformence.length];
		double winLoss = 0;
		int total = 0;
		double highValue = 0;
		int highWL = 0;
			
		Triple<String,Integer,Integer> winLoss1 = new Triple<>("Mets",17,3);
		Triple<String,Integer,Integer> winLoss2 = new Triple<>("Padres",13,7);
		Triple<String,Integer,Integer> winLoss3 = new Triple<>("Bears",15,5);
		Triple<String,Integer,Integer> winLoss4 = new Triple<>("Cubs",6,14);
		Triple<String,Integer,Integer> winLoss5 = new Triple<>("Yankees",19,1);
		Triple<String,Integer,Integer> winLoss6 = new Triple<>("Giants",13,7);
		Triple<String,Integer,Integer> winLoss7 = new Triple<>("RedSoxs",8,12);
		Triple<String,Integer,Integer> winLoss8 = new Triple<>("Rays",0,20);
		Triple<String,Integer,Integer> winLoss9 = new Triple<>("Indians",3,17);
		Triple<String,Integer,Integer> winLoss10 = new Triple<>("Astros",14,6);
		
			teamPerformence[0] = winLoss1;
			teamPerformence[1] = winLoss2;
			teamPerformence[2] = winLoss3;
			teamPerformence[3] = winLoss4;
			teamPerformence[4] = winLoss5;
			teamPerformence[5] = winLoss6;
			teamPerformence[6] = winLoss7;
			teamPerformence[7] = winLoss8;
			teamPerformence[8] = winLoss9;
			teamPerformence[9] = winLoss10;			
//************************************************************************************					
			System.out.println("games won by each team:" );
			
			for(int x = 0; x < teamPerformence.length; x++){
				System.out.println(teamPerformence[x].first +"\t" + teamPerformence[x].second);			
			}
//************************************************************************************						
			for(int x = 0; x < teamPerformence.length; x++){
				total =	teamPerformence[x].second + teamPerformence[x].third;			
				winLoss = (double)teamPerformence[x].second / total;

				winPercent[x] = new Pair<>(teamPerformence[x].first,winLoss);
			}
//************************************************************************************				
			System.out.println("\nThese are the win/loss ratios for each team");
			
		for(int x = 0; x < winPercent.length; x++){
				System.out.println(winPercent[x].first + "\t" + winPercent[x].second);			
			if(winPercent[x].second > highValue){
				highValue = winPercent[x].second;
				highWL = x;
			}		
		}	
				System.out.printf("\nThe %s have the highest win/loss ratio at: %.2f ", winPercent[highWL].first, highValue);
//************************************************************************************				
	}
	
	
}			
		


