import java.util.Scanner;
import java.util.Random;

class Game{
    private int number;
    private int userguess;
    Random rand;
    private int num_guesses;
    private Scanner scan;
    boolean correct;

    public Game() {
        rand = new Random();
        scan = new Scanner(System.in);
        number = rand.nextInt(100);
        num_guesses = 0;
        correct = false;
    }
    public boolean getState(){
        return correct;
    }
    public int getGuesses(){
        return num_guesses;
    }
    public void Interface(){
        System.out.println("Guess the number:: ");
        userguess = scan.nextInt();
        num_guesses++;
        if(number > userguess){
            System.out.println("Your guess is lower");
        }
        else if(number < userguess){
            System.out.println("Your guess is higher");
        }
        else{
            System.out.println("Your guess was correct!!!");
            correct = true;
        }
    }
}

public class GuessNumber {
    public static void main(String[] args) {
        Game guessing = new Game();
        while(!guessing.getState()){
            guessing.Interface();
        }
        System.out.println("Number of guesses were : " + guessing.getGuesses());
    }
}
