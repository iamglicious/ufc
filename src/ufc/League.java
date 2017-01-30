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

	        Gym gym1 = new Gym();
	        gym1.gymName = "UFC Team1";
	        gym1.fightersArray = new Fighter[3];
	        gym1.fightersArray[0] = new Fighter();
	        gym1.fightersArray[0].fighterName = "Demetrious Johnson";
	        gym1.fightersArray[1] = new Fighter();
	        gym1.fightersArray[1].fighterName = "Conor McGregor";
	        gym1.fightersArray[2] = new Fighter();
	        gym1.fightersArray[2].fighterName = "Daniel Cormier";

	        // Create team2
	        Gym gym2 = new Gym();
	        gym2.gymName = "UFC Team2";
	        gym2.fightersArray = new Fighter[3];
	        gym2.fightersArray[0] = new Fighter();
	        gym2.fightersArray[0].fighterName = "Jose Aldo";
	        gym2.fightersArray[1] = new Fighter();
	        gym2.fightersArray[1].fighterName = "Cody Garbrandt";
	        gym2.fightersArray[2] = new Fighter();
	        gym2.fightersArray[2].fighterName = "Dominick Cruz";

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

