/**
 * 
 */
package com.bridgeLabz;

/**
 * @author Admin
 *
 */
public class vowelOrCon {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Driving Class
		  char ch = 'z';

	        switch (ch) {
	            case 'a':
	            case 'e':
	            case 'i':
	            case 'o':
	            case 'u':
	                System.out.println(ch + " is vowel");
	                break;
	            default:
	                System.out.println(ch + " is consonant");
	        }

	}

}
