package CountVowelsPackage;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TesOfBinarySearch {
	private BinarySearch testObject;
	
	@BeforeEach
    void setUp() {
        testObject = new BinarySearch();
    }
	
	@Test
	public void testOf1to10() {
		int[] array1 = {1,2,3,4,5,6,7,8,9,10};
		assertTrue(testObject.binarySearch(array1, 2) == 1);
	}
	
	@Test
	public void testOf1to3() {
		int[] array2 = {1,2,3};
		assertTrue(testObject.binarySearch(array2, 2) == 1);
	}
	
    // fail because no elements
	@Test
    void testEmptyArray() {
        int[] empty = {};
        assertEquals(-1, testObject.binarySearch(empty, 5));
    }

    @Test
    void testLastElement() {
        int[] arr = {1,2,3,4,5};
        assertEquals(4, testObject.binarySearch(arr, 5));
    }

    // fail because one elemet in array
    @Test
    void testSingleElementNotFound() {
        int[] arr = {10};
        assertEquals(-1, testObject.binarySearch(arr, 5));
    }
    
    
    @Test
    void testDublicates() {
        int[] arr = {1, 2, 2, 3, 4, 5, 6};
        assertEquals(2, testObject.binarySearch(arr, 2));
    }
    
    @Test
    void testAllSame() {
        int[] arr = {1, 1, 1, 1, 1};
        assertEquals(0, testObject.binarySearch(arr, 1));
    }
}
