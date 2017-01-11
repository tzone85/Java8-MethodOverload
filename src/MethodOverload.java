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

        double cm = calcFeetAndInchesToCentimeters(-8,8);

        if(cm < 0.0){
            System.out.println("Invalid input");
        }

        cm = calcFeetAndInchesToCentimeters(8.6);

        if(cm < 0.0){
            System.out.println("Invalid input");
        }
    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score){
        System.out.println("Unnamed Player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(){
        System.out.println("No player name, hence no player score");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if ((feet < 0) || ((inches < 0) || (inches > 12))){
            return -1.0;
        }else{
            // 1 foot = 30.48 cm, 1 inch = 2.45 cm

            double feetToCent = feet * 30.48;
            double inchToCent = inches * 2.45;

            if (feet > 0){
                System.out.println(feetToCent + " cm in "+ feet + " feet");
                return feetToCent;
            }else {
                System.out.println(inchToCent + " cm in "+ inches + " inches");
                return inchToCent;
            }

        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches < 0){
            return -1;
        }else{
            // calc how many feet are in an inch 1 foot = 12 inches

            double feet = calcFeetAndInchesToCentimeters(0,7);
            double feetInInches = feet * 12;
            return feetInInches;
        }
    }
}
