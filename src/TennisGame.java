import java.util.List;
import static java.util.Arrays.asList;

public class TennisGame {

	private static String score;
	private static int player1Score=0;
	private static int player2Score=0;
	private static List<String> scoreList = asList("love", "15", "30", "45", "deuce", "advantage");
	private static String player1ScoreString;
	private static String player2ScoreString;
	 
	public static String getScore(){
		score = "Player1  " + player1Score() + " - " + player2Score() + "  Player2";
		return score;
	}
	
	public static void addPlayer1Score(){
		player1Score++;
	}
	
	public static void addPlayer2Score(){
		player2Score++;
	}
	
	public static String player1Score(){
		if (player1Score == 0)
		{
			player1ScoreString = scoreList.get(0);
		}
		else if (player1Score == 1){
			player1ScoreString = scoreList.get(1);
		}
		else if (player1Score == 2){
			player1ScoreString = scoreList.get(2);
		}
		else if (player1Score == 3){
			player1ScoreString = scoreList.get(3);
		}
		else if (player1Score == player2Score && player1Score >= 3 && player2Score >= 3){
			player1ScoreString = scoreList.get(4);
		}
		else if (player1Score > player2Score && player1Score >= 3 && player2Score >= 3){
			player1ScoreString = scoreList.get(5);
		}
		return player1ScoreString;	
	}
	
	public static String player2Score(){
		if (player2Score == 0)
		{
			player2ScoreString = scoreList.get(0);
		}
		else if (player2Score == 1){
			player2ScoreString = scoreList.get(1);
		}
		else if (player2Score == 2){
			player2ScoreString = scoreList.get(2);
		}
		else if (player2Score == 3){
			player2ScoreString = scoreList.get(3);
		}
		else if (player2Score == player1Score && player2Score >= 3 && player2Score >= 3){
			player2ScoreString = scoreList.get(4);
		}
		else if (player2Score > player1Score && player2Score >= 3 && player2Score >= 3){
			player2ScoreString = scoreList.get(5);
		}
		return player2ScoreString;	
	}
}
