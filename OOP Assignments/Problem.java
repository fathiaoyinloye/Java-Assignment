public class Problem(){
	private String name;
	private String type;
	private ArrayList <String> problems = new ArrayList<>();
	private boolean status;
	


	public Problem(String name, String type){
		this.name = name;
		this.type = type;

	}


	public void setName(String name){
		this.name = name;

	}

	public void getName(){
		return this.name;

	}

	public void setType(String type){
		this.type = type;

	}

	public void getType(){
		return this.type;

	}




	public void addToProblem(String problem){
		this.problems.add(problem);

	}
	
	public ArrayList <String> getProblems(){
		return this.problems;
	}



	public void solveProblem(String yourProblem){
		for(String problem : problems){
			if(problem.equalsIgnoreCase(yourProblem))
				problems.remove(yourProblem);

		}


	}
	
	public void setProblemStatus(boolean isSolved){
		this.status = isSolved;


	}

	public boolean getProblemStatus(){
		return status;

	}
	
















}