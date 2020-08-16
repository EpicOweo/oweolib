package epicoweo.oweolib.util;

/**
 * 
 * @author EpicOweo
 * @version 0.0.2_ALPHA
 * @since 0.0.1_ALPHA
 * 
 */

public class OweoInts {

	/**
	 * 
	 * Calculates the amount of digits in a given number.
	 * 
	 * @param i		The integer of which the function will count the amount of digits.
	 * @return		The amount of digits in the integer, zero if it returns an error.
	 * 
	 */
	public static int digits(int i) {
		for(int j = 1; j <= 20; j++) {
			if(Math.floor(Math.log10(i)) + 1 == j) {
				return j;
			}
		}
		return 0;
	}
	
	/**
	 * 
	 * Calculates the amount of digits in a given number.
	 * 
	 * @param i		The long of which the function will count the amount of digits.
	 * @return		The amount of digits in the long.
	 * 
	 */
	public static int digits(long i) {
		for(int j = 1; j <= 20; j++) {
			if(Math.floor(Math.log10(i)) + 1 == j) {
				return j;
			}
		}
		return 0;
	}
	
	/**
	 * 
	 * Calculates the amount of digits in a given number.
	 * 
	 * @param i		The short of which the function will count the amount of digits.
	 * @return		The amount of digits in the short.
	 * 
	 */
	public static int digits(short i) {
		for(int j = 1; j <= 20; j++) {
			if(Math.floor(Math.log10(i)) + 1 == j) {
				return j;
			}
		}
		return 0;
	}
	
	/**
	 * 
	 * Calculates the amount of digits in a given number.
	 * 
	 * @param i		The byte of which the function will count the amount of digits.
	 * @return		The amount of digits in the byte.
	 * 
	 */
	public static int digits(byte i) {
		for(int j = 1; j <= 20; j++) {
			if(Math.floor(Math.log10(i)) + 1 == j) {
				return j;
			}
		}
		return 0;
	}

}
