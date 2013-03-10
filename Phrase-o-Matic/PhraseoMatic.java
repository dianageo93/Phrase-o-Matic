
public class PhraseoMatic {

	public static void main(String[] args) {
		String[] nounList={"replacement","interagreement","graineness","semisolid","nonspecialist"};
		String[] adjListOne={"unfrozen","funguslike","flexuous","proboscidean","equipollent"};
		String[] adjListTwo={"easier","desperate","basic","theoretical"};
		
		int pickOne=(int)(Math.random()*nounList.length);
		int pickTwo=(int)(Math.random()*adjListOne.length);
		int pickThree=(int)(Math.random()*adjListTwo.length);
		
		String output=adjListOne[pickTwo]+" "+adjListTwo[pickThree]+" "+nounList[pickOne];
		System.out.println(output);
		
	}

}
