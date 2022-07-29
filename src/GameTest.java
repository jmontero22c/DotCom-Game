
public class GameTest {

	public static void main(String[] args) {
		Game testCheck = new Game();
		int[] cells = {8,7,6};
		String guess = "7";
		testCheck.setLocationCells(cells);
		String result = testCheck.check(guess);
		System.out.println(result);

	}

}
