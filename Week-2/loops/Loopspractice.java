import java.util.Random;

public class RollTheDieGame {
    public static void main(String[] args) {
        Random random = new Random();

        int position = 0;
        int boardSize = 20;
        int maxRolls = 5;

        System.out.println("Welcome to Roll the Die Game!");
        System.out.println("You must reach exactly space 20 within 5 rolls.\n");

        for (int rollNumber = 1; rollNumber <= maxRolls; rollNumber++) {
            int dieRoll = random.nextInt(6) + 1; // random number between 1 and 6
            System.out.println("Roll " + rollNumber + ": You rolled a " + dieRoll);

            position += dieRoll;

            if (position == boardSize) {
                System.out.println("You advanced to space " + position);
                System.out.println("Congratulations! You reached space 20 and won!");
                break;
            } else if (position > boardSize) {
                System.out.println("You moved past space 20.");
                System.out.println("You lost because you must land exactly on space 20.");
                break;
            } else {
                int spacesLeft = boardSize - position;
                System.out.println("You are now on space " + position);
                System.out.println("You need " + spacesLeft + " more space(s) to win.\n");
            }

            if (rollNumber == maxRolls) {
                System.out.println("Game over! You used all 5 rolls.");
                System.out.println("You stopped at space " + position + ".");
                System.out.println("You lost because you did not reach exactly space 20.");
            }
        }
    }
}
