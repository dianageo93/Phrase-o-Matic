
public class Player {
	private boolean isRight;
	
	public int getGuessedNumber() {
		return (int)(Math.random()*10);
	}
	
	public void setIsRight(boolean bool) {
		this.isRight=bool;
	}
	
	public boolean getIsRight() {
		return isRight;
	}

}
