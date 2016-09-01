import java.util.Scanner;

public class MainClass {
	static Scanner reader = new Scanner(System.in);
	static int scoringPlayer;

	public static void main(String[] args) {
		while (true){
			System.out.print("\nWhich player scored? Give 1 for player1 or 2 for player2: ");
			scoringPlayer = reader.nextInt();
			if (scoringPlayer == 1){
				TennisGame.addPlayer1Score();
				System.out.print(TennisGame.getScore());
			}
			else if (scoringPlayer == 2){
				TennisGame.addPlayer2Score();
				System.out.print(TennisGame.getScore());
			}
		}
	}
}
