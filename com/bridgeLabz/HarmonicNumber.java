/**
 * 
 */
package com.bridgeLabz;

import java.util.Scanner;

/**
 * @author Admin
 *
 */
public class HarmonicNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Driving Class
		  Scanner in = new Scanner(System.in); 
		  System.out.println("Harmonic Series");
		  System.out.print("Enter Number: ");
		  int number = in.nextInt();
		  int temp = number;
		  double sum = 0;
		  while(temp > 0){
			  sum = sum+((double)1/(double)temp);
			  temp--;
		  }
		  System.out.println("Harmonic Series Output for Number '"+number+"': "+sum);

		}

	

}
