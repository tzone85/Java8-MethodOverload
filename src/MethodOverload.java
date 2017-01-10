/**
 * Created by Thando Mini on 1/10/2017.
 */
public class MethodOverload {

    public static void main(String [] args){
        int newScore = calculateScore("Thando", 800000);
        System.out.println("New score is "+ newScore);

        calculateScore(590000000);
        calculateScore("Mncedi", 599668877);
        calculateScore();
    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score){
        System.out.println("Unnamed Player scored " + score + " points");
        return score * 1000;
    }

    public static void calculateScore(){
        System.out.println("No player name, hence no player score");

    }
}
