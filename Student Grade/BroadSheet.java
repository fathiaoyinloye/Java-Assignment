import java.util.ArrayList;

public class BroadSheet{

	private ArrayList<Student> students;
	private ArrayList<Subject> subjects;

	public BroadSheet(ArrayList<Student> students, ArrayList<Subject> subjects){
		this.students = students;
		this.subjects = subjects;
}

	public void calculateTotalAndRank(){
		for(Student student: students) student.calculateTotalAndAverage();

		for(Student student : students){
			int rank = 1;
			for(Student checkStudent : students){
				if(checkStudent.getTotal() > student.getTotal()) rank++;
			} student.setRank(rank);
		}

	}

	public void printReport(){
		System.out.println("REPORT OF THE SCHOOL");
		System.out.printf("%-12s", "STUDENT");

		for(Subject subject : subjects){
			System.out.printf("%-12s", subject.getName());
		}

			System.out.printf("%-12s%-12s%-12s%n", "TOTAL", "AVERAGE", "RANK");

			for(Student student : students){
				System.out.printf("%-12s", student.getName());
				for (int index = 0; index < subjects.size(); index++){
					System.out.printf("%-12s", student.getScore(index));
				}

			System.out.printf("%-12s%-12.2f%-4d%n", student.getTotal(), student.getAverage(), student.getRank());
			}



	}

}