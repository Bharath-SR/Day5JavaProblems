/**
 * 
 */
package com.bridgeLabz;

import java.util.Scanner;

/**
 * @author Admin
 *
 */
public class OddOrEven {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Driving Class
		
		int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number you want to check:");
        n = input.nextInt();
        if(n % 2 == 0)
        {
            System.out.println("The given number "+n+" is Even ");
        }
        else
        {
            System.out.println("The given number "+n+" is Odd ");
	}

	}

}
