package rockPaperScissorsLizardSpock;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RockPaperScissorslizardSpockTest {
	
	private RockPaperScissorsLizardSpock game = new RockPaperScissorsLizardSpock();

	@Test
	public void rockCrushesScissorsPlayer1() {
		game.playerOneChoice("Rock");
		game.playerTwoChoice("Scissors");
		assertEquals(1, game.getWinner());
	}
	
	@Test
	public void rockCrushesScissorsPlayer2() {
		game.playerOneChoice("Scissors");
		game.playerTwoChoice("Rock");
		assertEquals(2, game.getWinner());
	}
	
	@Test
	public void scissorsCutsPaperPlayer1() {
		game.playerOneChoice("Scissors");
		game.playerTwoChoice("Paper");
		assertEquals(1, game.getWinner());
	}
	
	@Test
	public void scissorsCutsPaperPlayer2() {
		game.playerOneChoice("Paper");
		game.playerTwoChoice("Scissors");
		assertEquals(2, game.getWinner());
	}
	
	@Test
	public void paperCoversRockPlayer1() {
		game.playerOneChoice("Paper");
		game.playerTwoChoice("Rock");
		assertEquals(1, game.getWinner());
	}
	
	@Test
	public void paperCoversRockPlayer2() {
		game.playerOneChoice("Rock");
		game.playerTwoChoice("Paper");
		assertEquals(2, game.getWinner());
	}
	
	@Test
	public void rockCrushesLizardPlayer1() {
		game.playerOneChoice("Rock");
		game.playerTwoChoice("Lizard");
		assertEquals(1, game.getWinner());
	}
	
	@Test
	public void rockCrushesLizardPlayer2() {
		game.playerOneChoice("Lizard");
		game.playerTwoChoice("Rock");
		assertEquals(2, game.getWinner());
	}
	
	@Test
	public void lizardPoisonsSpockPlayer1() {
		game.playerOneChoice("Lizard");
		game.playerTwoChoice("Spock");
		assertEquals(1, game.getWinner());
	}
	
	@Test
	public void lizardPoisonsSpockPlayer2() {
		game.playerOneChoice("Spock");
		game.playerTwoChoice("Lizard");
		assertEquals(2, game.getWinner());
	}
	
	@Test
	public void spockSmashesScissorsPlayer1() {
		game.playerOneChoice("Spock");
		game.playerTwoChoice("Scissors");
		assertEquals(1, game.getWinner());
	}
	
	@Test
	public void spockSmashesScissorsPlayer2() {
		game.playerOneChoice("Scissors");
		game.playerTwoChoice("Spock");
		assertEquals(2, game.getWinner());
	}
	
	@Test
	public void scissorsDecapitatesLizardPlayer1() {
		game.playerOneChoice("Scissors");
		game.playerTwoChoice("Lizard");
		assertEquals(1, game.getWinner());
	}
	
	@Test
	public void scissorsDecapitatesLizardPlayer2() {
		game.playerOneChoice("Lizard");
		game.playerTwoChoice("Scissors");
		assertEquals(2, game.getWinner());
	}
	
	@Test
	public void lizardEatsPaperPlayer1() {
		game.playerOneChoice("Lizard");
		game.playerTwoChoice("Paper");
		assertEquals(1, game.getWinner());
	}
	
	@Test
	public void lizardEatsPaperPlayer2() {
		game.playerOneChoice("Paper");
		game.playerTwoChoice("Lizard");
		assertEquals(2, game.getWinner());
	}
	
	@Test
	public void paperDisprovesSpockPlayer1() {
		game.playerOneChoice("Paper");
		game.playerTwoChoice("Spock");
		assertEquals(1, game.getWinner());
	}
	
	@Test
	public void paperDisprovesSpockPlayer2() {
		game.playerOneChoice("Spock");
		game.playerTwoChoice("Paper");
		assertEquals(2, game.getWinner());
	}
	
	@Test
	public void spockVaporizesRockPlayer1() {
		game.playerOneChoice("Spock");
		game.playerTwoChoice("Rock");
		assertEquals(1, game.getWinner());
	}
	
	@Test
	public void spockVaporizesRockPlayer2() {
		game.playerOneChoice("Rock");
		game.playerTwoChoice("Spock");
		assertEquals(2, game.getWinner());
	}
	
	@Test
	public void bothRockResultInDraw() {
		game.playerOneChoice("Rock");
		game.playerTwoChoice("Rock");
		assertEquals(0, game.getWinner());
	}
	
	@Test
	public void bothPaperResultInDraw() {
		game.playerOneChoice("Paper");
		game.playerTwoChoice("Paper");
		assertEquals(0, game.getWinner());
	}
	
	@Test
	public void bothScissorsResultInDraw() {
		game.playerOneChoice("Scissors");
		game.playerTwoChoice("Scissors");
		assertEquals(0, game.getWinner());
	}
	
	@Test
	public void bothLizardResultInDraw() {
		game.playerOneChoice("Lizard");
		game.playerTwoChoice("Lizard");
		assertEquals(0, game.getWinner());
	}
	
	@Test
	public void bothSpockResultInDraw() {
		game.playerOneChoice("Spock");
		game.playerTwoChoice("Spock");
		assertEquals(0, game.getWinner());
	}


}
