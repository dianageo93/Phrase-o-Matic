
public class GuessGame {
	
	private boolean gameReady=false;
	Player[] plArray=new Player[3];

	public void startGame() {
		int targetNumber=(int)(Math.random()*10);
		while(!gameReady) {
			System.out.println("The number to guess is "+targetNumber);
			for(int i=0;i<3;i++) {
				plArray[i].setIsRight(false);
				int playerGuess=plArray[i].getGuessedNumber();
				System.out.println("Player "+i+" guessed "+playerGuess);
				if(playerGuess==targetNumber) {
					plArray[i].setIsRight(true);
				}
			}
			for(int i=0;i<3;i++) {
				if(plArray[i].getIsRight()==true) {
					System.out.println("Player "+i+" got it right.");
					System.out.println("We have a winner !");
					gameReady=true;
				}
			}
		}
		
	}
}
