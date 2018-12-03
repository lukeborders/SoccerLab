public class SoccerTeam extends TournamentOfficial {
	private int wins;
	private int losses; 
	private int ties; 
	private TournamentOfficial tournOff;
	 
	public SoccerTeam(TournamentOfficial t) {
		tournOff = t;
	}
	
	public void played(SoccerTeam other, int myScore, int otherScore) {
		tournOff.goals(myScore,otherScore);
		if(myScore > otherScore) {
			wins++;
			other.losses++;
			tournOff.addGames();
		}
		else if(myScore == otherScore) {
			ties++;
			other.ties++;
			tournOff.addGames();
		}
		else {
			losses++;
			other.wins++;
			tournOff.addGames();
		}											// |      ||												// ||     
	}
	
	public int currentPoints() {
		return wins*3 + ties; 
	}
	public void reset() {
		 wins = 0;
		 losses = 0; 
		 ties = 0;
	}
	
	
	
}