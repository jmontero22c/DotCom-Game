
public class Game {
	
	private int[] locationCells;
	private int numOfHits = 0;
	

	//Check Function
	public String check(String Guess) {
		int GuessInt = Integer.parseInt(Guess);
		for (int x : locationCells) {
			if(GuessInt==x) {
				numOfHits++;
				return "YOU HIT!!!";
			}else {
				numOfHits++;
				return "You miss";
			}
			
		}
		
		
		if(numOfHits == 3) {
			return "You Win";
		}
		return "";
		
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
