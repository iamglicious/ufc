package ufc;

public class Fight {

	
public Gym homeTeam;
public Gym awayTeam;
public Match[] match;

public void playGame(int maxFights) {
    
    int numberOfFights = (int)(Math.random() * maxFights + 1);
    Match[] theFights = new Match[numberOfFights];
    this.match = theFights;
   // GameUtils.addGameGoals(this);        
}

public void playGame() {
    playGame(6);
}

public String getDescription() {
    StringBuilder returnString = new StringBuilder();
    for (Match currGoal: this.match) {
        returnString.append("Goal scored after "
        + currGoal.theTime + " mins by "
        + currGoal.theFighter.fighterName + " of "
        + currGoal.theGym.gymName +
          "\n");
    }
    return returnString.toString();
}
  
}