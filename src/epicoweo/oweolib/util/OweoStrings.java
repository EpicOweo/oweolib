package epicoweo.oweolib.util;

/**
 * 
 * @author EpicOweo
 * @version 0.0.2_ALPHA
 * @since 0.0.1_ALPHA
 * 
 */

public class OweoStrings {
	
	/**
	 * 
	 * Multiplies a given String any amount of times and returns the multiplied String.
	 * 
	 * @param s		The String to multiply.
	 * @param times	The amount of times the String is multiplied.
	 * @return		The multiplied String.
	 * 
	 */
	public static String multiply(String s, int times) {
		String str = "";
		for(int i = 0; i < times; i++) {
			str += s;
		}
		return str;
	}
	
	/**
	 * 
	 * Adds a prefix to an integer a given amount of times, and returns it as a String.
	 * 
	 * @param i			The integer which will be prepended by the prefix.
	 * @param prefix	The prefix that will be prepended to the integer.
	 * @param times		The amount of times the prefix will be added.
	 * @return			The manipulated version of the String.
	 */
	public static String addPrefixBeforeInt(int i, int prefix, int times) {
		return (multiply(Integer.toString(prefix), times)) + i;
	}
	
	/**
	 * 
	 * Adds a given amount of zeroes before an integer.
	 * 
	 * @param i				The number to which the zeroes will be prepended.
	 * @param totalDigits	The total amount of digits the integer should have after adding the zeroes.
	 * @return				The integer with the prepended zeroes added.
	 */
	public static String addZeroesBeforeInt(int i, int totalDigits) {
		int iDigits = OweoInts.digits(i);
		if(i >= 0 && i <= 9 || totalDigits - i == 0) {
			return Integer.toString(i);
		} else if(totalDigits < 1) {
			throw new IllegalArgumentException("You cannot add zeroes before an int with less than one digit!");
		} else if(i < 0) {
			throw new IllegalArgumentException("You cannot add zeroes before a negative number!");
		}
		
		return multiply(Integer.toString(0), totalDigits-iDigits) + i;
	}
}
