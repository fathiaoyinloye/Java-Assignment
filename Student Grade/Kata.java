public class Kata{


		public int [] sortAllArrays(int [] ... arrays){
	
			int [] combinedArray = populateCombinedArray(arrays);

			int [] sortedArray = sortArray(combinedArray);

			return sortedArray;
			
		}


		public int [] populateCombinedArray(int []... arrays){
		
			int [] combinedArray = getCombinedArray(arrays);

			int index = 0;

					for (int[] array: arrays){
						for (int innerIndex = 0; innerIndex < array.length; innerIndex++){
							combinedArray [index] = array[innerIndex];
							index++;
							
						}
					}
				
			return combinedArray;
		}


		public int[] getCombinedArray(int[]... arrays){

				int lengthOfCombinedArray = getLengthOfCombinedArray(arrays);
				int [] combinedArray = new int [lengthOfCombinedArray];

				return combinedArray;

		}
			

		public int getLengthOfCombinedArray(int[]... arrays){
				int count = 0;
				for(int [] array: arrays) count += array.length;
				return count;

		}


		public int countElements(int[]... arrays){
				int count = 0;
				for(int [] array: arrays) count ++;
				return count;

		}
			



	

		public int[] sortArray(int [] numbers ){

			int index;
			int checkingIndex;
			for(index = 0; index < numbers.length; index++){
				for(checkingIndex = 0; checkingIndex < numbers.length; checkingIndex++){
	
					if(numbers[index] < numbers[checkingIndex]){
						numbers[index] += numbers[checkingIndex]  ;
						numbers[checkingIndex] = numbers[index]  - numbers[checkingIndex] ;
						numbers[index] = numbers[index]  - numbers[checkingIndex] ;
					}
					
				}
			

			}

			return numbers;
	}

}