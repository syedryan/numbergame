  import java.util.Random;
  import  java.util.Scanner;

public class ryan1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;
        int score = 0;

        while (playAgain) {
            int min = 1;
            int max = 100;
            int attempts = 0;
            int randomNumber = random.nextInt(max - min + 1) + min;

            System.out.println("Guess the number between " + min + " and " + max + ":");
            int guess;
            boolean guessedCorrectly = false;

            while (!guessedCorrectly) {
                guess = scanner.nextInt();
                attempts++;

                if (guess == randomNumber) {
                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                    score += attempts;
                    guessedCorrectly = true;
                } else if (guess < randomNumber) {
                    System.out.println("Too low! Try again:");
                } else {
                    System.out.println("Too high! Try again:");
                }
            }

            System.out.println("Your current score: " + score);
            System.out.println("Do you want to play again? (yes/no)");
            String playAgainResponse = scanner.next();
            if (!playAgainResponse.equalsIgnoreCase("yes")) {
                playAgain = false;
            }
        }

        System.out.println("Thank you for playing! Your final score is: " + score);
        scanner.close();
    }
}



    

