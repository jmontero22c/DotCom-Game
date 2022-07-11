import java.util.Scanner;
public class main {
	Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		main in = new main();
		in.startGame();
	}
	
	public void startGame() {
		Game game = new Game();
		String result = "";
		int Counter = 0;
		
		while(result != "You Win") {
			System.out.println("Enter a number: ");
			String Guess = input.nextLine();
			result = game.check(Guess);
			Counter++;
		}
		
		System.out.println(result + " with "+Counter+" attemps");

	}

}
