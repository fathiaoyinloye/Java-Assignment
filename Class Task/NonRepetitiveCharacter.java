import java.util.Arrays;
public class NonRepetitiveCharacter{
	public static void main(String... args){
		System.out.println(getNonRepetitiveCharacter("maddkam"));
			
		char[] myChar = new char[7];
		System.out.print(Arrays.toString(myChar));


	}

	public static char getNonRepetitiveCharacter(String new_word){
			char result = '0';
			String word = new_word.toLowerCase();
		for(int count = 0; count < word.length(); count++){
				int check = 0;
			for(int counter = 0; counter < word.length(); counter++){
				if (word.charAt(count) == word.charAt(counter))
						check += 1;
			}
				if (check == 1){
					result = word.charAt(count);
					break;
				}
					

		}
		return result;

	}




}