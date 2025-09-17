package CountVowelsPackage;

import java.util.Arrays;

public class BinarySearch {

    public int binarySearch(int[] array, int target) {
        int mid = array.length / 2;
        int i = 0;
	
//	    for (k = 0; k < array.length; k++) {
	   
        if (array[mid] == target) {
            return mid;
        } else if (array[mid] > target) {
//	        	int[] arr1;
//	        	for (int k = 0; k < (array.length/2); k++) {
//	        		arr1[k] = array[k];
//	        	}
	        	
            int[] arr = Arrays.copyOfRange(array, 0, mid);
            return binarySearch(arr, target);
	            
        } else if (array[mid] < target) {
//	        	int[] arr;
//	        	for (int k = (array.length/2); k< array.length ; k++) {
//	        		arr[k-(array.length/2)] = array[k];
//	        	}
            int[] arr = Arrays.copyOfRange(array, mid + 1, array.length);
            
            int res = binarySearch(arr, target);
            return (res == -1) ? -1 : mid + 1 + res;	            
        }
//	    }
	
        return -1;
    }
}