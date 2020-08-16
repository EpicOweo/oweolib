package epicoweo.oweolib.util;

import java.util.ArrayList;

/**
 * 
 * A collection of functions that can manipulate and extract data from arrays.
 * 
 * @author EpicOweo
 * @version 0.0.2_ALPHA
 * @since 0.0.1_ALPHA
 * 
 */

public class OweoArrays {

	/**
	 * 
	 * Finds and returns the longest String in an ArrayList of Strings.
	 * 
	 * @param arr The ArrayList of which to find the longest String.
	 * @return The longest String in the ArrayList.
	 * 
	 */
	public static String longestString(ArrayList<String> arr) {
		String longestStr = "";
		for(String s : arr) {
			if(s.length() > longestStr.length()) {
				longestStr = s;
			}
		}
		return longestStr;
	}
	
	/**
	 * 
	 * Finds and returns the shortest String in an ArrayList of Strings.
	 * 
	 * @param arr The ArrayList of which to find the shortest String.
	 * @return The shortest String in the ArrayList.
	 * 
	 */
	public static String shortestString(ArrayList<String> arr) {
		String shortestStr = "";
		for(String s : arr) {
			if(s.length() < shortestStr.length()) {
				shortestStr = s;
			}
		}
		return shortestStr;
	}
	
	/**
	 * 
	 * Finds and returns the largest Integer in an array of Integers.
	 * 
	 * @param arr The array of which to find the largest Integer.
	 * @return The largest Integer in the array.
	 * 
	 */
	public static int largestVal(int[] arr) {
		int largest = 0;
		for(int i : arr) {
			if(i > largest) {
				largest = i;
			}
		}	
		return largest;
	}
	
	/**
	 * 
	 * Finds and returns the smallest Integer in an array of Integers.
	 * 
	 * @param arr The array of which to find the smallest Integer.
	 * @return The smallest Integer in the array.
	 * 
	 */
	public static int smallestVal(int[] arr) {
		int smallest = 0;
		for(int i : arr) {
			if(i > smallest) {
				smallest = i;
			}
		}	
		return smallest;
	}

	/**
	 * 
	 * Finds and returns the largest Long in an array of Longs.
	 * 
	 * @param arr The array of which to find the largest Long.
	 * @return The largest Long in the array.
	 * 
	 */
	public static long largestVal(long[] arr) {
		long largest = 0;
		for(long i : arr) {
			if(i > largest) {
				largest = i;
			}
		}	
		return largest;
	}
	
	/**
	 * 
	 * Finds and returns the smallest Long in an array of Longs.
	 * 
	 * @param	arr 	The array of which to find the smallest Long.
	 * @return 			The smallest Long in the array.
	 * 
	 */
	public static long smallestVal(long[] arr) {
		long smallest = 0;
		for(long i : arr) {
			if(i > smallest) {
				smallest = i;
			}
		}	
		return smallest;
	}

	/**
	 * 
	 * Finds and returns the largest Short in an array of Shorts.
	 * 
	 * @param 	arr The array of which to find the largest Short.
	 * @return 	The largest Short in the array.
	 * 
	 */
	public static short largestVal(short[] arr) {
		short largest = 0;
		for(short i : arr) {
			if(i > largest) {
				largest = i;
			}
		}	
		return largest;
	}
	
	/**
	 * 
	 * Finds and returns the smallest Short in an array of Shorts.
	 * 
	 * @param 	arr The array of which to find the smallest Short.
	 * @return 	The smallest Integer in the ArrayList.
	 * 
	 */
	public static short smallestVal(short[] arr) {
		short smallest = 0;
		for(short i : arr) {
			if(i > smallest) {
				smallest = i;
			}
		}	
		return smallest;
	}
	
	/** 
	 * 
	 * Finds and returns the largest Byte in an array of Bytes.
	 * 
	 * @param 	arr The array of which to find the largest Byte.
	 * @return 	The largest Byte in the array.
	 * 
	 */
	public static byte largestVal(byte[] arr) {
		byte largest = 0;
		for(byte i : arr) {
			if(i > largest) {
				largest = i;
			}
		}	
		return largest;
	}
	
	/**
	 * 
	 * Finds and returns the smallest Byte in an array of Bytes.
	 * 
	 * @param 	arr The array of which to find the smallest Byte.
	 * @return 	The smallest Byte in the array.
	 * 
	 */
	public static byte smallestVal(byte[] arr) {
		byte smallest = 0;
		for(byte i : arr) {
			if(i > smallest) {
				smallest = i;
			}
		}	
		return smallest;
	}
}