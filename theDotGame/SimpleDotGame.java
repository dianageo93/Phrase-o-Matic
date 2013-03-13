
public class SimpleDotGame {
	private int[] locationCells;
	private int numOfHits;
	
	public void setLocationCells(int[] locationCells) {
		this.locationCells = locationCells;
	}
	
	public String checkYourself(String guess) {
		int guessInt=Integer.parseInt(guess);
		String result="miss";
		for(int i:locationCells) {
			if(i==guessInt) {
				result="hit";
				numOfHits++;
				break;
			}
		}
		if(numOfHits==locationCells.length) {
			result="kill";
		}
		return result;
	}
}
