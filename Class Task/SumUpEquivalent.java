import java.util.Arrays;
public class SumUpEquivalent{
	public static void main (String... args){
		int[] myList = {2,1, 2, 5,6,-7,8, 1, 0};

		int [] newArray = getSumOfEquivalent(myList, 1);

	System.out.println(Arrays.toString(newArray));
		printHelloWorld();
		checkMultiples(100);
	System.out.println(findLargest(myList));
	System.out.println(Arrays.toString(sortArrays(myList)));


	}
	public static int[] getSumOfEquivalent(int[] myList, int target){
		int[] newArray = new int[2];
		for(int index = 0; index < myList.length; index++){
			for(int counter = index + 1; counter < myList.length; counter++){
				if(myList[index] + myList[counter] == target){
					newArray[0] = myList[index];
					newArray[1] = myList[counter];

				}
				else {

					newArray[0] = 0;
					newArray[1] = 0;


				}


			}
		}

		return newArray;

	}

	public static void printHelloWorld(){
		System.out.println("\"Hello, World\"");

	}
	
	public static int findLargest(int[] numbers){
		int largest = numbers[0];
		for(int count = 1; count < numbers.length; count++){
			if(numbers[count] > largest)
				largest = numbers[count];
		}
			return largest;

	}

	public static int[] sortArrays(int[] numbers){
		for(int count = 0; count < numbers.length; count++){ 
			for(int counter = count + 1;counter < numbers.length; counter++){
				if(numbers[counter] < numbers[count]){
					int temporary = numbers[count];
					numbers[count] = numbers[counter];
					numbers[counter] = temporary;

				}


			}  
		}
		return numbers;

	}

	public static void checkMultiples(int number){
		
		for (int count = 1; count <= number; count++){	
			if(count % 4 == 0 && count % 6  == 0)
				System.out.println("Hello World");
			else if(count % 4 == 0)
				System.out.println("Hello");
			else if(count % 6 == 0)
				System.out.println("World");
			else
				System.out.println(count);
		}

	}

}