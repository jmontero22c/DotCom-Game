import java.util.ArrayList;

public class Game {

	private ArrayList<String> locationCells;
	private int need_to_hit;

	// Check Function
	public String check(String userInput) {
		String result = "You miss\n";

		int index = locationCells.indexOf(userInput);

		if (index >= 0) {
			locationCells.remove(index);
			if (locationCells.isEmpty()) {
				result = "You kill";
			} else {
				result = "You Hit\n";
			}

		}
		System.out.println("Lista: "+locationCells);
		return result;

	}

	// Getters and Setters

	public void setLocationCells(ArrayList<String> cells) {
		this.locationCells = cells;

	}

	public int getNumOfHits() {
		return need_to_hit;
	}

	public void setNumOfHits(int numOfHits) {
		this.need_to_hit = numOfHits;
	}

}
