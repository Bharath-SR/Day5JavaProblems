/**
 * 
 */
package com.bridgeLabz;

/**
 * @author Admin
 *
 */
public class swapTwoNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Driving Class

        int n1 = 12; 
        int second = 5;

        System.out.println("--Before swap--");
        System.out.println("First number = " + n1);
        System.out.println("Second number = " + second);

        // Value of first is assigned to temporary
        int temporary = n1;

        // Value of second is assigned to first
        n1 = second;

        // Value of temporary (which contains the initial value of first) is assigned to second
        second = temporary;

        System.out.println("--After swap--");
        System.out.println("First number = " + n1);
        System.out.println("Second number = " + second);

	}

}
