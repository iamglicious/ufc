package ufc;

import Utils.FightUtils;

public class Fight {

	
public Gym homeTeam;
public Gym awayTeam;
public Match[] matchs;

public void playGame(int maxFights) {
    
    int numberOfFights = (int)(Math.random() * maxFights + 1);
    Match[] theFights = new Match[numberOfFights];
    this.matchs = theFights;
   FightUtils.addGameFight(this);        
}

public void playGame() {
    playGame(6);
}

public String getDescription() {
    StringBuilder returnString = new StringBuilder();
    for (Match currFight: this.matchs) {
        returnString.append("K.O. After "
        + currFight.theTime + " mins by "
        + currFight.theFighter.fighterName + " of "
        + currFight.theGym.gymName +
          "\n");
    }
    return returnString.toString();
}
  
}