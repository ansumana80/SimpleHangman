import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String [] args)
    {
        Random rand = new Random();
        Scanner userInput= new Scanner(System.in);

        ArrayList<String> guesswords= new ArrayList<String>();
        guesswords.add("tree");
        guesswords.add("rain");
        guesswords.add("bear");
        guesswords.add("encourage");
        guesswords.add("promise");
        guesswords.add("soup");
        guesswords.add("insurance");
        guesswords.add("pancakes");
        guesswords.add("stream");

        System.out.println("Welcome, let's play simple hangman!");
        System.out.println("Randomly choose a word from that Arraylist for the user to guess.");

        int index=guesswords.size(); //storing the size of the arraylist, meaning the lenght of the list
        int guesswords1 = rand.nextInt(index); //generate a random location of the arraylist
        System.out.println(guesswords.get(guesswords1));

        System.out.println("User, Enter your guess word.");
        int index2;
        index2= userInput.nextInt();
    }
}
