import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class KataTest{

		@Test
	void testThatNewArrayIsPopulatedByAllArraysAndSorted(){

		Kata monarch = new Kata();
		//Given
		int [] checkArrayOne = {2, 3, 1, 4};
		int [] checkArrayTwo = {-1, 5};
		int [] checkArrayThree = {-2, -3, 0, 12, -4};
		//int [] checkArrayFour = {9};

		//When
		int [] combinedArray = monarch.sortAllArrays(checkArrayOne, checkArrayTwo, checkArrayThree );
	
		//Assert
		int [] expectedArray = {-4, -3, -2, -1, 0, 1, 2, 3, 4,5, 12} ;
		assertArrayEquals(combinedArray, expectedArray);

	}

		@Test
	void testThatNewArrayIsPopulatedByAllArrays(){

		Kata monarch = new Kata();
		//Given
		int [] checkArrayOne = {2, 3, 1, 4};
		int [] checkArrayTwo = {-1, 5};
		int [] checkArrayThree = {-2, -3, 0, 12, -4};
		int [] checkArrayFour = {9};

		//When
		int [] combinedArray = monarch.populateCombinedArray(checkArrayOne, checkArrayTwo, checkArrayThree, checkArrayFour);
	
		//Assert
		int [] expectedArray = {2, 3, 1, 4, -1, 5, -2, -3, 0, 12, -4, 9} ;
		assertArrayEquals(combinedArray, expectedArray);

	}

	@Test
	void testThatNewArrayHasSameLengthAsAllArrays(){

		Kata monarch = new Kata();
		//Given
		int [] checkArrayOne = {2, 3, 1, 4};
		int [] checkArrayTwo = {-1, 5};
		int [] checkArrayThree = {-2, -3, 0, 12, -4};
		int [] checkArrayFour = {9};

		//When
		int [] combinedArray = monarch.getCombinedArray(checkArrayOne, checkArrayTwo, checkArrayThree, checkArrayFour);
		int lengthOfCombinedArray = combinedArray.length;
	
		//Assert
		int expectedLength = 12;
		assertEquals(lengthOfCombinedArray, expectedLength);

	}


	@Test
	void checkLengthOfAllArraysCombined(){

		Kata monarch = new Kata();
		//Given
		int [] checkArrayOne = {2, 3, 1, 4};
		int [] checkArrayTwo = {-1, 5};
		int [] checkArrayThree = {-2, -3, 0, 12, -4};
		int [] checkArrayFour = {9};

		//When
		int count = monarch.getLengthOfCombinedArray(checkArrayOne, checkArrayTwo, checkArrayThree, checkArrayFour);
	
		//Assert
		int expectedCount = 12;
		assertEquals(count, expectedCount);

	}

	

	@Test
	void checkForNumberOfArrays(){

		Kata monarch = new Kata();
		//Given
		int [] checkArrayOne = {2, 3, 1, 4};
		int [] checkArrayTwo = {-1, 5};
		int [] checkArrayThree = {-2, -3, 0, 12, -4};
		int [] checkArrayFour = {9};

		//When
		int count = monarch.countElements(checkArrayOne, checkArrayTwo, checkArrayThree, checkArrayFour);
	
		//Assert
		int expectedCount = 4;
		assertEquals(count, expectedCount);

	}


		

	@Test
	void testThatArrayExists(){

		Kata monarch = new Kata();
		//Given
		int [] checkArray = {2, 3, 1, 4};

		//When
		int [] sortedArray = monarch.sortArray(checkArray);
	
		//Assert
		int [] expectedSortedArray = {1,2,3,4};
		assertArrayEquals(expectedSortedArray, sortedArray);

	}

	

}