
public class GuessGame {
	private boolean[] playerGuessIsRight=new boolean[3];
	private Number number=new Number();
	private boolean gameReady=false;
	
	public void startGame() {
		int no=number.getNumber();
		while(!gameReady) {
			System.out.println("The number to guess is "+no);
			for(int i=0;i<3;i++) {
				playerGuessIsRight[i]=false;
				int playerGuess=number.getNumber();
				System.out.println("Player "+i+" guessed "+playerGuess);
				if(playerGuess==no) {
					playerGuessIsRight[i]=true;
				}
			}
			for(int i=0;i<3;i++) {
				if(playerGuessIsRight[i]==true) {
					System.out.println("Player "+i+" got it right.");
					System.out.println("We have a winner !");
					gameReady=true;
				}
			}
		}
		
	}
}
