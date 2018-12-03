public class TournamentOfficial {
	private int totalGoals;
	private int gamesPlayed;
	
	public void goals(int myScore, int otherScore) {
		totalGoals = totalGoals + myScore + otherScore;
	}
	public int getGoals() {
		return	totalGoals; 
	}
	
	public int getGamesPlayed () {
		return gamesPlayed; 
	}
	public void resetOfficial() {
		totalGoals = 0;
		gamesPlayed = 0;
	}
	
	public void addGames() {
		gamesPlayed++;
	}
	
}