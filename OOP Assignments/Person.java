import java.util.ArrayList;
public class Person{

	private String name;
	private ArrayList<Problem> problemsNotSolved = new ArrayList<>();
	private ArrayList<Problem> problemsSolved = new ArrayList<>();

	public Person (String name){
		this.name = name;
		
	}

	public void addToProblem(Problem problem){
		problemsNotSolved.add(problem);

	}
	
	public ArrayList <Problem> getProblemsNotSolved(){
		return problemsNotSolved;
	}

	public ArrayList <Problem> problemsSolved(){
		return problemsNotSolved;
	}


	public void solveProblem(String name){
		for(Problem problem : problemsNotSolved){
			if(problem.getName() == name){
				problemsSolved.add(problem);	
				problemsNotSolved.remove(problem);
			}	
			
		}	
	}



}