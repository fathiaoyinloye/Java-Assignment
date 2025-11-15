import java.util.Arrays;
public class ChangeOutput{

	public static void main (String... args){

	String word = "This is an example";

	String newWord = "";


	
	int countWord = 1;
		for(int count = 0; count < word.length(); count++){
			if(word.charAt(count) == ' ')
				countWord += 1;

		}
	
	for(int count = 0; count < word.length(); count++){
			
			newWord = word.charAt(count) + newWord;

				
		}
	
					
		
	String [] result = newWord.split(" ");

	String myWord = "";
		for (int counter = result.length - 1; counter >= 0; counter--){ 
				System.out.println(result[counter]);

			myWord = myWord + " " + result[counter];
		}
	

System.out.print(myWord);
	

	}



}