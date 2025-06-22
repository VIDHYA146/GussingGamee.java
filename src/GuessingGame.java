//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Random;
import java.util.Scanner;

public class GuessingGame{
    public static void main(String[] args) {
      //Generating a random number
        Random random=new Random();
        int numberToGuess=random.nextInt(100)+1;
        //initialize the number of tries
        int tries=0;
        //create a scanner object to get user input
        System.out.println("WELCOME TO THE GUESSING GAME");
        System.out.println("I'M THINKING OF THE NUMBER BETWEEN 1 TO 100");
        while(true){
            //ask the user for their guess
            System.out.println("ENTER YOUR GUESS"); Scanner scanner=new Scanner(System.in);
            int guess=scanner.nextInt();
            //increment the number of tries;
            tries++;
if(guess==numberToGuess){
System.out.println("CONRATULATION! YOU FOUND THE NUMBER IN"+tries+"ries.");
break;
}
else if(guess<numberToGuess){
System.out.println("TOO LOW! TRY AGAIN");
}else{
    System.out.println("TOO HIGH!TRY AGAIN");
}
}
}}