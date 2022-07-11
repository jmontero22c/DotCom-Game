
public class Game {
	
	private int[] locationCells;
	private int numOfHits;
	
	//Constructor
	public Game() {
		locationCells = new int[7];
		locationCells[1] = 1;
		locationCells[2] = 1;
		locationCells[3] = 1;
		numOfHits = 0;
	}
	
	//Set Location Function
	public void setLocation() {
		
	}
	
	//Check Function
	public String check(String Guess) {
		
		if(Guess.equals("1") || Guess.equals("2") || Guess.equals("3")) {
			numOfHits++;
			System.out.println("HIT");
		}else {
			System.out.println("You miss");
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
