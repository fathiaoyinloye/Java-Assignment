import java.util.Scanner;
import java.util.ArrayList;

public class StudentGradeApp{

	public static void main(String... args){
		
		Scanner inputCollector = new Scanner(System.in);

		int numberOfStudents;
		int numberOfSubjects;

		while (true){
			try{
				System.out.print("Enter number of students: ");
				numberOfStudents = Integer.parseInt(inputCollector.nextLine());

				System.out.print("Enter number of subjects: ");
				numberOfSubjects = Integer.parseInt(inputCollector.nextLine());
				
				if(numberOfStudents <= 0 || numberOfSubjects <= 0) {
					System.out.println("Enter only positive numbers"); continue;			
				}
 				break;
			} catch(Exception exception){
				System.out.println("Invalid Input. Please enter only positive integers");
			}

		}


		ArrayList<Student> students = new ArrayList<>();
		ArrayList<Subject> subjects = new ArrayList<>();

		for(int index = 0; index < numberOfStudents;index++){
			System.out.print("Enter Student" +(index+ 1) + "\'s name : ");
			String nameOfStudent = inputCollector.nextLine();
			students.add(new Student(nameOfStudent, numberOfSubjects));
		}

		for(int index = 0; index < numberOfSubjects;index++){
			System.out.print("Enter Subject" +(index+ 1) + "\'s name : ");
			String nameOfSubject = inputCollector.nextLine();
			subjects.add(new Subject(nameOfSubject, numberOfStudents));
		}

		for(int index = 0; index < numberOfStudents; index++){
			Student student = students.get(index);
			for(int subjectIndex = 0; subjectIndex < numberOfSubjects; subjectIndex++){
				int score;
				Subject subject = subjects.get(subjectIndex);
				while(true){
					try{
						System.out.println("Enter score of " + student.getName() + " in " + subject.getName());
						score = Integer.parseInt(inputCollector.nextLine());
						if(score < 0 || score > 100){
							System.out.print("Score must be between 0 and 100"); continue;
						}
						break;
					} catch (NumberFormatException exception){
						System.out.println("Invalid Input. Enter a number between 0 and 100");
					}
				}

				student.setScore(subjectIndex, score);
				subject.setScore(index, score);
			}

		}
		

		BroadSheet broadsheet = new BroadSheet(students, subjects);
		broadsheet.calculateTotalAndRank();
		broadsheet.printReport();
	
	}


}