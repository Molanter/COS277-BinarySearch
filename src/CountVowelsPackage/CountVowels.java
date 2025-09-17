package CountVowelsPackage;

/** 
 * A class with just one static method (so we have something to test)
 * @author gosnat
 *
 */
public class CountVowels {

	/**
	 * This method looks ok at a glance, but is it going to return the right answer
	 * for all inputs?
	 * @param s the string you're testing
	 * @return the number of vowels in s (not counting 'y')
	 */
	public static int numVowels(String s) {
		int count = 0;
		for(int i = 0; i < s.length()-1; i++) {
			switch(s.charAt(i)) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
			}
		}
		return count;
	}
}
