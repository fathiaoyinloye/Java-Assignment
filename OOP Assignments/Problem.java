public class Problem{
	private String name;
	private ProblemType type;
	private boolean status;
	


	public Problem(String name, ProblemType type){
		this.name = name;
		this.type = ProblemType.FINANCIAL;

	}


	public String getName(){
		return name;

	}

		public ProblemType getType(){
		return type;

	}

	
	
	public void setProblemStatus(boolean isSolved){
		this.status = isSolved;


	}

	public boolean getProblemStatus(){
		return status;

	}
	


}