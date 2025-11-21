
public class Student{

	private String name;
	private int[] scores;
	private int total;
	private double average;
	private int rank;

	public Student(String name, int numberOfSubjects){
		this.name = name;
		this.scores = new int[numberOfSubjects];
	}

	public String getName(){
		return name;
	}

	public void setScore(int subjectIndex, int score){
		this.scores[subjectIndex] = score;
	}

	public int getScore(int subjectIndex){
		return scores[subjectIndex];
	}


	public void calculateTotalAndAverage(){
		total = 0;
		for (int score: scores) total += score;
		average = (total * 1.0)/ scores.length;
	}

	public int getTotal(){
		return total;
	}

	public double getAverage(){
		return average;
	}

	public void setRank(int rank){
		this.rank = rank;
	}
	
	public int getRank(){
		return rank;
	}

	public int getNumberOfPasses(){
		int count = 0;
		for(int score : scores) if(score >= getAverage()) count++;
		return count;
	}

	public boolean isPassing(){
		return getAverage()>=50;
	}
}