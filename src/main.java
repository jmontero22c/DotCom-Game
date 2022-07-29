import java.util.ArrayList;
import java.util.Scanner;
public class main {
	Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		main in = new main();
		in.startGame();
//		Game game = new Game();
//		int[] cells = {4,5,6};
//		game.setLocationCells(cells);
		
		
		//TESTING
		//in.testingCheck();
	}
	
	public void startGame() {
		Game game = new Game();
		ArrayList<String> cells = new ArrayList<String>();
		cells.add("A1");
		cells.add("A2");
		cells.add("A3");
		
		game.setLocationCells(cells);
		
		String result = "";
		int Counter = 0;
		
		while(result != "You kill") {
			System.out.print("Enter a number: ");
			String userInput = input.nextLine();
			result = game.check(userInput);
			System.out.println(result);
			Counter++;
		}
		
		System.out.println("\nYou win with "+Counter+" attemps");

	}

}
