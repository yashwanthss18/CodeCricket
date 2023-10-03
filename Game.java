package practise;

import java.util.Scanner;
import java.util.Random;

public class Game {
	

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Random random = new Random();

	        System.out.println("Welcome to Hand Cricket!");

	        int playerScore = 0;
	        int computerScore = 0;

	        while (true) {
	            System.out.print("Enter your move (1-10): ");
	            int playerMove = scanner.nextInt();

	            if (playerMove < 1 || playerMove > 10) {
	                System.out.println("Invalid move, please enter a number between 1 and 10.");
	                continue;
	            }

	            int computerMove = random.nextInt(10) + 1;
	            System.out.println("Computer move: " + computerMove);

	            if (playerMove == computerMove) {
	                System.out.println("Out!");
	                break;
	            } else {
	                playerScore += playerMove;
	                System.out.println("Your score: " + playerScore);
	            }

	            computerScore += computerMove;
	            System.out.println("Computer score: " + computerScore);
	        }

	        if (playerScore > computerScore) {
	            System.out.println("You win!");
	        } else if (playerScore < computerScore) {
	            System.out.println("You lose!");
	        } else {
	            System.out.println("It's a tie!");
	        }
	    }
	}

