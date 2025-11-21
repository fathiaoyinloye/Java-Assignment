import java.util.Scanner;
public class CatchingException{
	public static void main (String... args){
		Scanner scanner = new Scanner(System.in);
		while(true){
			try{
				for(int count = 0; count < 3; count++){
					System.out.print("Enter a number: ");
					int number = scanner.nextInt();
				}
				break;
			}
			catch(Exception exception){
				System.out.println("Invalid input");
				scanner.nextLine();
								
			}

		}
		

				System.out.print(times);


	}
}