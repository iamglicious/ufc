package ufc;

public class League {

	public static void main(String[] args) {

League theLeague = new League();

Gym[] theTeams = theLeague.createTeams();
	        Fight[] theGames = theLeague.createGames(theTeams);

	        Fight currFight = theGames[0];
	        
	        currFight.playGame();
	        
	        System.out.println(currFight.getDescription());

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
	        gym1.gymName = "UFC Team1";
	        gym1.fightersArray = theFighters;

	        // Create team2
	        Gym gym2 = new Gym();
	        gym2.gymName = "UFC Team2";
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

	    public Fight[] createGames(Gym[] theGyms) {
	        Fight theFight = new Fight();
	        theFight.homeTeam = theGyms[0];
	        theFight.awayTeam = theGyms[1];
	        
	       
	        
	        
	        Fight[] theMatch = {theFight};
	        return theMatch;
	    }

	}

