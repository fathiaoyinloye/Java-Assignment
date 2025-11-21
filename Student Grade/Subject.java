public class Subject{

	private String name;
	private int[] scores;

	public Subject(String name, int numberOfStudents){
		this.name = name;
		this.scores = new int [numberOfStudents];
	}

	public String getName(){
		return name;
	}

	public void setScore(int studentIndex, int score){
		this.scores[studentIndex] = score;
	}

	public int getScore(int studentIndex){
		return scores[studentIndex];
	}
	
	public int getTotal(){
		int total =0;
		for (int score : scores) total+=score;
		return total;
	}

	public double getAverage(){
		return (getTotal() * 1.0)/scores.length;
	}

	public int getHighestScore(){
		int highestScore = scores[0];
		for(int score : scores) if(score > highestScore) highestScore = score;
		return highestScore;
	}

	public int getLowestScore(){
		int lowestScore = scores[0];
		for(int score : scores) if(score < lowestScore) lowestScore = score;
		return lowestScore;
	}

	public int getNumberOfPasses(){
		int count = 0;
		for(int score : scores) if(score >= getAverage()) count++;
		return count;
	}

}