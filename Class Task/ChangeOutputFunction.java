public class ChangeOutputFunction{
	public static String[] reverseWord(String word){
		String newWord = "";
		for(int count = 0; count < word.length(); count++){
			
			newWord = word.charAt(count) + newWord;

				
		}
	String [] result = newWord.split(" ");

		return result;
	}

	public static String getChangedOutput(String [] result){
		String myWord = "";
		for (int counter = result.length - 1; counter >= 0; counter--){ 

			myWord = myWord + result[counter] + " ";
		}
		return myWord;

	}


	public static void main (String... args){

	String words = "This is an example. welcome to my world";
	String [] myWords = reverseWord(words);
	System.out.print(getChangedOutput(myWords));

	}

}