
public class DotGame {
	public static void main(String[] args) {
		GameHelper helper=new GameHelper();
		SimpleDotGame dot=new SimpleDotGame();
		int firstLocation=(int)(Math.random()*5);
		int numOfGuesses=0;
		int[] locations={firstLocation,firstLocation+1,firstLocation+2};
		dot.setLocationCells(locations);
		boolean isAlive=true;
		
		while(isAlive) {
			String guess=helper.getUserInput("enter a number");
			numOfGuesses++;
			String result=dot.checkYourself(guess);
			if(result=="kill") {
				System.out.println("You took "+numOfGuesses+" guesses");
				isAlive=false;
			}
			else {
				System.out.println(result);
			}
		}
	}

}
