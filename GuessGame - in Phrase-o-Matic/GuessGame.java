
public class GuessGame {
	
	private boolean gameReady;
	Player[] plArray;
	
	public GuessGame() {
		gameReady=false;
		plArray=new Player[3];
		for(int i=0;i<3;i++){
			plArray[i]=new Player();
		}
	}
	
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
