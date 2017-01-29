package ufc;

public class League {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

League theLeague = new League();

Gym[] theTeams = theLeague.createTeams();
	        Match[] theGames = theLeague.createGames(theTeams);

	        Fight currGame = theGames[0];
	        
	        Fight.playGame();
	        
	        System.out.println(currGame.getDescription());

	    }

	    public Gym[] createTeams() {

	        Fighter fighter1 = new Fighter();
	        fighter1.fighterName = "George Eliot";
	        Fighter fighter2 = new Fighter();
	        fighter2.fighterName = "Graham Greene";
	        Fighter fighter3 = new Fighter();
	        fighter3.fighterName = "Geoffrey Chaucer";
	        Fighter[] theFighters = {fighter1, fighter2, fighter3};

	        Gym gym1 = new Gym();
	        gym1.gymName = "The Greens";
	        gym1.fightersArray = theFighters;

	        // Create team2
	        Gym gym2 = new Gym();
	        gym2.gymName = "The Reds";
	        gym2.fightersArray = new Fighter[3];
	        gym2.fightersArray[0] = new Fighter();
	        gym2.fightersArray[0].fighterName = "Robert Service";
	        gym2.fightersArray[1] = new Fighter();
	        gym2.fightersArray[1].fighterName = "Robbie Burns";
	        gym2.fightersArray[2] = new Fighter();
	        gym2.fightersArray[2].fighterName = "Rafael Sabatini";

	        Gym[] theGyms = {gym1, gym2};
	        return theGyms;
	    }

	    public Match[] createGames(Gym[] theGyms) {
	        Fight theFight = new Fight();
	        theFight.homeTeam = theTeams[0];
	        theFight.awayTeam = theTeams[1];
	       
	        
	        
	        Match[] theMatch = {theMatch};
	        return theMatch;
	    }

	}

