import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;

public class Main {
    public static void main(String[] args) {

        final int CHANCES = 7;
        System.out.println("===========================");
        System.out.println("\t\tNumber Game");
        System.out.println("===========================");
        System.out.println("Guess the number (Range : 1-100)");
        System.out.println("Total Chances : "+CHANCES);
        System.out.println();


        final int GUESS_RANGE = 101;
        Random rand = new Random();
        int NUMBER_GUESS = rand.nextInt(GUESS_RANGE);

        boolean PLAYAGAIN = true;

        while(PLAYAGAIN) {
            int CHANCES_COUNTER = 0;
            int flag = 0;
            Scanner sc = new Scanner(System.in);
            while (CHANCES > CHANCES_COUNTER) {
                System.out.print("Enter your guess number: ");
                int GUESSED_NUMBER = sc.nextInt();
                System.out.println("Chances remaining: " + (CHANCES - CHANCES_COUNTER - 1));

                if (NUMBER_GUESS == GUESSED_NUMBER) {
                    flag = 1;
                    break;
                } else if (GUESSED_NUMBER > NUMBER_GUESS) {
                    System.out.println("Too High");
                    System.out.println();
                } else {
                    System.out.println("Too Low");
                    System.out.println();
                }
                CHANCES_COUNTER++;
            }
            if(flag == 1){
                System.out.println("You Won..");
                System.out.println("You guessed the Number (" + NUMBER_GUESS + ")");
            } else {
                System.out.println("You Lost!");
                System.out.println("Guess Number: "+NUMBER_GUESS);
            }
            System.out.println("Play Again? (yes/no)");
            String again = sc.next().toLowerCase();
            if(again.equals("no")){
                PLAYAGAIN = false;
            }
            System.out.println();
        }
    }
}
