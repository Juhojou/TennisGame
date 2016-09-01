import java.util.Scanner;

public class MainClass {
	static Scanner reader = new Scanner(System.in);
	static int scoringPlayer;

	public static void main(String[] args) {
		System.out.print(TennisGame.getScore() + "\n");
		TennisGame.addPlayer1Score();
		System.out.print(TennisGame.getScore() + "\n");
		TennisGame.addPlayer1Score();
		System.out.print(TennisGame.getScore() + "\n");
		TennisGame.addPlayer1Score();
		System.out.print(TennisGame.getScore() + "\n");
		TennisGame.addPlayer2Score();
		System.out.print(TennisGame.getScore() + "\n");
		TennisGame.addPlayer2Score();
		System.out.print(TennisGame.getScore() + "\n");
		TennisGame.addPlayer2Score();
		System.out.print(TennisGame.getScore() + "\n");
		TennisGame.addPlayer2Score();
		System.out.print(TennisGame.getScore() + "\n");
		TennisGame.addPlayer1Score();
		System.out.print(TennisGame.getScore() + "\n");
	}
}
