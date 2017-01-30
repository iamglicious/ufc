package Utils;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import ufc.*;


public class FightUtils {

    public static void addGameFight(Fight currFight) {
        
       

        // Or possibly throw an Exception?
        if (currFight.matchs == null) {
        	currFight.matchs = new Match[(int) (Math.random() * 4)];   // If fights not initialized max will be 3
        }

        
        int i = 0;
        for (Match currFights : currFight.matchs) {
        	currFights = new Match();
        	currFights.theGym = Math.random() > 0.5 ? getHomeTeam(currFight, "home") : getHomeTeam(currFight, "away");
        	currFights.theFighter = currFights.theGym.fightersArray[(int) (Math.random() * currFights.theGym.fightersArray.length)];
        	currFights.theTime = (int) (Math.random() * 90);
        	currFight.matchs[i] = currFights;
            i++;
        }
        Arrays.sort(currFight.matchs, (g1, g2) -> Double.valueOf(g1.theTime).compareTo(Double.valueOf(g2.theTime)));

    }

    // Uses reflection so works with getter method or public field
    private static Gym getHomeTeam(Fight currFight, String homeOrAway) {
        Gym theGyms = null;
        Method m;
        Field f;
        try {
            m = Fight.class.getMethod("get" + Character.toUpperCase(homeOrAway.charAt(0)) + homeOrAway.substring(1) + "Team");
            theGyms = (Gym)m.invoke(currFight);
            //System.out.println(theGym);
        } catch (NoSuchMethodException|IllegalAccessException|InvocationTargetException em) {
            try {
                f = Fight.class.getField(homeOrAway + "Team");
                theGyms = (Gym)f.get(currFight);
                //System.out.println(theGym);
            } catch (NoSuchFieldException|IllegalAccessException ef) { 
                System.out.println("The addGoals() utility requires the Goal class to contain either:\n" +
                        "public String fields called homeTeam and awayTeam, OR,\n" +
                        "public accessor methods called getHomeTeam() and getAwayTeam().");
            }
        }
        return theGyms;
    }
}
