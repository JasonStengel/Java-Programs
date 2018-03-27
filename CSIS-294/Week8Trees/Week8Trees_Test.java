package Week8Trees;

public class Week8Trees_Test {

	public static void main(String[] args) {
		
		Element oVideoGames = new Element();
			oVideoGames.title = "Space Engineers";
		    oVideoGames.ratings = 92;
		Element oVideoGames2 = new Element();
			oVideoGames.title = "Gears of War 4";
			oVideoGames.ratings = 89;
	
		treeNode oNode = new treeNode();
		oNode.element = oVideoGames;
		
		treeNode oNode2 = new treeNode();	
		oNode2.element = oVideoGames2;
		
		//Adds element to the left or right depending on chronological order
		if(oNode2.element.ratings < oNode.element.ratings)
			oNode.left = oNode2;
			else{
				oNode.right = oNode2;
		    }
	    }

}
