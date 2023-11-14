import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to the Bowling Game!");
        int[] scores = new int[10]; // Assuming a standard game of 10 frames
        promptAndRecordScores(scores);

        Game game = new Game(); // Assuming Game class exists and has necessary methods
        for (int score : scores) {
            game.roll(score); // Assuming roll method to input each frame's score
        }

        System.out.println("Final Score: " + game.score()); // Assuming score method calculates final score
    }

    public static void promptAndRecordScores(int[] scores) {
        Scanner stdin = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter score for frame " + (i + 1) + ": ");
            scores[i] = stdin.nextInt();
            // Basic validation for frame score
            while (scores[i] < 0 || scores[i] > 10) {
                System.out.println("Invalid score! Please enter a score between 1 and 10: ");
                scores[i] = stdin.nextInt();
            }
        }
    }
}
