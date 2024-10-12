import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String player1 ="";
        String player2 ="";
        Scanner in = new Scanner(System.in);

        boolean done = true;
        String finished = "N";

        do {
            System.out.println("Player 1 enter your move [R, P, S]");
            player1 = in.nextLine();
            if (player1.equalsIgnoreCase("R") || player1.equalsIgnoreCase("P") || player1.equalsIgnoreCase("S")) {
                done = true;
            } else {
                System.out.println("You entered the wrong value");
                done = false;
            }
        } while (!done);
        do {
            System.out.println("Player 2 enter your move [R, P, S]");
            player2 = in.nextLine();
            if (player2.equalsIgnoreCase("R") || player2.equalsIgnoreCase("P") || player2.equalsIgnoreCase("S")) {
                done = true;
            } else {
                System.out.println("You entered the wrong value");
                done = false;
            }
        }while (!done);
        do {
            if (player1.equalsIgnoreCase("R")) {
                if (player2.equalsIgnoreCase("R")) {
                    System.out.println("It's a tie");
                } else if (player2.equalsIgnoreCase("S")) {
                    System.out.println("Player 1 wins");
                } else if (player2.equalsIgnoreCase("P")) {
                    System.out.println("Player 2 wins");
                } else
                    System.out.println("You have entered the wrong value");
            } else if (player1.equalsIgnoreCase("S")) {
                if (player2.equalsIgnoreCase("R")) {
                    System.out.println("Player 1 wins");
                } else if (player2.equalsIgnoreCase("S")) {
                    System.out.println("It's a tie");
                } else if (player2.equalsIgnoreCase("P")) {
                    System.out.println("Player 2 wins");
                } else
                    System.out.println("You have entered the wrong value");
            } else if (player1.equalsIgnoreCase("P")) {
                if (player2.equalsIgnoreCase("R")) {
                    System.out.println("Player 1 wins");
                } else if (player2.equalsIgnoreCase("S")) {
                    System.out.println("Player 2 wins");
                } else if (player2.equalsIgnoreCase("P")) {
                    System.out.println("It's a tie");
                } else
                    System.out.println("You have entered the wrong value");
            } else {
                System.out.println("You have entered the wrong value");
            }
            System.out.println("Would you like to play again type Y or N");
            finished = in.nextLine();
        } while(finished.equalsIgnoreCase("Y"));
    }
}