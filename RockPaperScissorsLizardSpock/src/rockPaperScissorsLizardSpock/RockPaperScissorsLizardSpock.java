package rockPaperScissorsLizardSpock;

import java.util.Scanner;

public class RockPaperScissorsLizardSpock {

	private String playerOneChoice;
	private String playerTwoChoice;
	public int playerOneWins = 1;
	public int playerTwoWins = 2;
	public int draw = 0;
	private Scanner scan;
	
	public static void main(String [] args){
		RockPaperScissorsLizardSpock RPS = new RockPaperScissorsLizardSpock();
		RPS.getPlayerOneInput();
		RPS.playAgain();
	}
	
	private void getPlayerOneInput() {
		scan = new Scanner(System.in);
		System.out.println("Player one, please select Rock, Paper, Scissors, Lizard or Spock");
		playerOneChoice =scan.nextLine();
		switch (playerOneChoice.toLowerCase()){ 
			case "rock":
				System.out.println("Player One has chosen Rock");
				getPlayerTwoInput();
				break;
			case "paper":
				System.out.println("Player One has chosen Paper");
				getPlayerTwoInput();
				break;
			case "scissors":
				System.out.println("Player One has chosen Scissors");
				getPlayerTwoInput();
				break;
			case "lizard":
				System.out.println("Player One has chosen Lizard");
				getPlayerTwoInput();
				break;
			case "spock":
				System.out.println("Player One has chosen Spock");
				getPlayerTwoInput();
				break;
			default:
				System.out.println("Invalid Input, please try again!");
				getPlayerOneInput();
				break;
		}
		
	}

	private void getPlayerTwoInput() {
		scan = new Scanner(System.in);
		System.out.println("Player two, please select Rock, Paper, Scissors, Lizard or Spock");
		playerTwoChoice = scan.nextLine();
		switch (playerTwoChoice.toLowerCase()){ 
			case "rock":
				System.out.println("Player Two has chosen Rock");
				getWinner();
				break;
			case "paper":
				System.out.println("Player Two has chosen Paper");
				getWinner();
				break;
			case "scissors":
				System.out.println("Player Two has chosen Scissors");
				getWinner();
				break;
			case "lizard":
				System.out.println("Player One has chosen Lizard");
				getWinner();
				break;
			case "spock":
				System.out.println("Player One has chosen Spock");
				getWinner();
				break;
			default:
				System.out.println("Invalid Input, please try again!");
				getPlayerTwoInput();
				break;
		}
	}	
	
	public void playerOneChoice(String choice) {
		this.playerOneChoice = choice;
	}

	public void playerTwoChoice(String choice) {
		this.playerTwoChoice = choice;
	}

	public int getWinner() {
		if (playerOneChoice.toLowerCase().equals("rock") && playerTwoChoice.toLowerCase().equals("scissors")){
			System.out.println("Player One is the Winner! Rock Crushes Scissors");
			return playerOneWins;	
			}
		else if (playerOneChoice.toLowerCase().equals("scissors") && playerTwoChoice.toLowerCase().equals("rock")){
			System.out.println("Player Two is the Winner! Rock Crushes Scissors");
			return playerTwoWins;
		}
		else if (playerOneChoice.toLowerCase().equals("scissors") && playerTwoChoice.toLowerCase().equals("paper")){
			System.out.println("Player One is the Winner! Scissors Cuts Paper");
			return playerOneWins;
		}
		else if (playerOneChoice.toLowerCase().equals("paper") && playerTwoChoice.toLowerCase().equals("scissors")){
			System.out.println("Player Two is the Winner! Scissors Cuts Paper");
			return playerTwoWins;
		}
		else if (playerOneChoice.toLowerCase().equals("paper") && playerTwoChoice.toLowerCase().equals("rock")){
			System.out.println("Player One is the Winner! Paper Covers Rock");
			return playerOneWins;
		}
		else if (playerOneChoice.toLowerCase().equals("rock") && playerTwoChoice.toLowerCase().equals("paper")){
			System.out.println("Player Two is the Winner! Paper Covers Rock");
			return playerTwoWins;
		}
		else if (playerOneChoice.toLowerCase().equals("rock") && playerTwoChoice.toLowerCase().equals("lizard")){
			System.out.println("Player One is the Winner! Rock Crushes Lizard");
			return playerOneWins;
		}
		else if (playerOneChoice.toLowerCase().equals("lizard") && playerTwoChoice.toLowerCase().equals("rock")){
			System.out.println("Player Two is the Winner! Rock Crushes Lizard");
			return playerTwoWins;
		}
		else if (playerOneChoice.toLowerCase().equals("lizard") && playerTwoChoice.toLowerCase().equals("spock")){
			System.out.println("Player One is the Winner! Lizard Poisons Spock");
			return playerOneWins;
		}
		else if (playerOneChoice.toLowerCase().equals("spock") && playerTwoChoice.toLowerCase().equals("lizard")){
			System.out.println("Player Two is the Winner! Lizard Poisons Spock");
			return playerTwoWins;
		}
		else if (playerOneChoice.toLowerCase().equals("spock") && playerTwoChoice.toLowerCase().equals("scissors")){
			System.out.println("Player One is the Winner! Spock Smashes Scissors");
			return playerOneWins;
		}
		else if (playerOneChoice.toLowerCase().equals("scissors") && playerTwoChoice.toLowerCase().equals("spock")){
			System.out.println("Player Two is the Winner! Spock Smashes Scissors");
			return playerTwoWins;
		}
		else if (playerOneChoice.toLowerCase().equals("scissors") && playerTwoChoice.toLowerCase().equals("lizard")){
			System.out.println("Player One is the Winner! Scissors Decapitate Lizard");
			return playerOneWins;
		}
		else if (playerOneChoice.toLowerCase().equals("lizard") && playerTwoChoice.toLowerCase().equals("scissors")){
			System.out.println("Player Two is the Winner! Scissors Decapitate Lizard");
			return playerTwoWins;
		}
		else if (playerOneChoice.toLowerCase().equals("lizard") && playerTwoChoice.toLowerCase().equals("paper")){
			System.out.println("Player One is the Winner! Lizard Eats Paper");
			return playerOneWins;
		}
		else if (playerOneChoice.toLowerCase().equals("paper") && playerTwoChoice.toLowerCase().equals("lizard")){
			System.out.println("Player Two is the Winner! Lizard Eats Paper");
			return playerTwoWins;
		}
		else if (playerOneChoice.toLowerCase().equals("paper") && playerTwoChoice.toLowerCase().equals("spock")){
			System.out.println("Player One is the Winner! Paper Disproves Spock");
			return playerOneWins;
		}
		else if (playerOneChoice.toLowerCase().equals("spock") && playerTwoChoice.toLowerCase().equals("paper")){
			System.out.println("Player Two is the Winner! Paper Disproves Spock");
			return playerTwoWins;
		}
		else if (playerOneChoice.toLowerCase().equals("spock") && playerTwoChoice.toLowerCase().equals("rock")){
			System.out.println("Player One is the Winner! Spock Vaporizes Rock");
			return playerOneWins;
		}
		else if (playerOneChoice.toLowerCase().equals("rock") && playerTwoChoice.toLowerCase().equals("spock")){
			System.out.println("Player Two is the Winner! Spock Vaporizes Rock");
			return playerTwoWins;
		}
		else {
			System.out.println("It's a Draw!");
			return draw;
		}		
	}

	private void playAgain() {
		System.out.println("Would you like a rematch?");
		System.out.println("Please enter one of the following:");
		System.out.println("|Yes|\t|No|");
		String YN = scan.nextLine();
		
		if(YN.toLowerCase().equals("yes") || YN.toUpperCase().equals("Y")){
			RockPaperScissorsLizardSpock.main(null);
		}
		else if (YN.toLowerCase().equals("no") || YN.toUpperCase().equals("N")){
			System.out.println("See you next time!");
		}
		else {
			System.out.println("Invalid input, please try again!");
			playAgain();
		}
		
	}

}
