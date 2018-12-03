public class TournamentRunner {
	public static void main(String[] args) {
		TournamentOfficial s = new TournamentOfficial();
		SoccerTeam blue = new SoccerTeam(s);
		SoccerTeam red = new SoccerTeam(s);
		SoccerTeam green  = new SoccerTeam(s);
		SoccerTeam purple = new SoccerTeam(s);
		blue.played(red,3,2);
		blue.played(green,0,3);
		blue.played(purple,6,2);
		red.played(green,8,1);
		red.played(purple,7,4);
		green.played(purple,7,3);
		System.out.println("team blue has " + blue.currentPoints() + " points");
		System.out.println("team red has " + red.currentPoints() + " points");
		System.out.println("team green has " + green.currentPoints() + " points");
		System.out.println("team purple has " + purple.currentPoints() + " points");
		System.out.println(s.getGoals() + " total goals scored");
		System.out.println(s.getGamesPlayed() + " games played");
		blue.reset();
		red.reset();
		green.reset();
		purple.reset();
		s.resetOfficial();
		
		int highestPoint = 0;
		int lowestPoint = 0; 
		SoccerTeam best = new SoccerTeam(s);
		SoccerTeam worst = new SoccerTeam(s);
		SoccerTeam[] teams = {blue,red,green,purple};
		for(int i = 0; i <= 2; i++) {
			if(teams[i].currentPoints() > highestPoint) {
				highestPoint = teams[i].currentPoints();
				best = highestPoint;
				if(teams[i].currentPoints() < lowestPoint) {
					lowestPoint = teams[i].currentPoints(); 
					worst = teams[i].lowestPoint;
					best.played(worst,Math.random(),Math.random());
				}
			}
		}

		
		
		/*blue.played(red,2,2);
		blue.played(green,7,3);
		blue.played(purple,4,5);
		red.played(green,10,2);
		red.played(purple,7,6);
		green.played(purple,8,4); */
		System.out.println("team blue has " + blue.currentPoints() + " points");
		System.out.println("team red has " + red.currentPoints() + " points");
		System.out.println("team green has " + green.currentPoints() + " points");
		System.out.println("team purple has " + purple.currentPoints() + " points");
		System.out.println(s.getGoals() + " total goals scored");
		System.out.println(s.getGamesPlayed() + " games played");
		blue.reset();
		red.reset();
		green.reset();
		purple.reset();
	}
}