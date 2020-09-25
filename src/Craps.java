import java.security.SecureRandom;

public class Craps {
    // create secure random number generator for use in method rollDice
    private static final SecureRandom randomNumbers = new SecureRandom();

    // enum type with constants that represent the game status
    private enum Status {CONTINUE, WON, LOST};

    // constant that represent common rolls of the dice
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    // plays one game of craps
    public static void main(String[] args) {
        int myPoint = 0; // point if no win or loss on first roll
        Status gameStatus; // can contain CONTINUE, WON, LOST

        int sumOfDice = rollDice(); // first roll of the dice

        // determine game status and point based on first roll
        switch (sumOfDice) {
            case SEVEN: // win with 7 on first roll
            case YO_LEVEN: // win with 11 on first roll
                gameStatus = Status.WON;
                break;
            case SNAKE_EYES: // lose with 2 on first roll
            case TREY: // lose with 3 on first roll
            case BOX_CARS: // lose with 12 on first roll
                gameStatus = Status.LOST;
                break;
            default:
                gameStatus = Status.CONTINUE;
        } // end of first roll
    while (gameStatus ==  Status.CONTINUE) { // not WON or LOST
        sumOfDice =  rollDice();

        // determine game status
        if (sumOfDice == myPoint) // win by making point
            gameStatus = Status.WON;
        else
            if (sumOfDice == SEVEN) // lose by rolling 7 before point
                gameStatus = Status.LOST;
    }
    // display won or lost message
    if (gameStatus == Status.WON)
        System.out.println("Player wins");
    else
        System.out.println("Player loses");
    }
    public static int rollDice() {
        // pick random dice values
        int die1 = 1 + randomNumbers.nextInt(6);
        int die2 = 1 + randomNumbers.nextInt(6);

        int sum =  die1 + die2;
        System.out.printf("Player rolled %d + %d = %d%n",
                die1, die2, sum);
        return sum;
    }

}


