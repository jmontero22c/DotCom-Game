
public class Game {
	
	private int[] locationCells;
	private int numOfHits = 0;
	

	//Check Function
	public String check(String Guess) {
		String result = "You miss\n";
		int GuessInt = Integer.parseInt(Guess);
		
		for (int x : locationCells) {
			if(GuessInt==x) {
				numOfHits++;
				if(numOfHits == locationCells.length) {
					result = "You Win";
				}else {
					result = "YOU HIT!!!\n";
				}		
			
			}
		}
		
		return result;
		
	}


	//Getters and Setters
	public int[] getLocationCells() {
		return locationCells;
	}
	public void setLocationCells(int[] locationCells) {
		this.locationCells = locationCells;
	}
	public int getNumOfHits() {
		return numOfHits;
	}
	public void setNumOfHits(int numOfHits) {
		this.numOfHits = numOfHits;
	}
	
	
}
