/**
 * 
 */
package com.bridgeLabz;

import java.util.Scanner;

/**
 * @author Admin
 *
 */
public class LeapYear {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Driving Class
		int year;
	      System.out.println("Enter an Year : ");
	      Scanner input = new Scanner(System.in);
	      year = input.nextInt();

	      if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
	         System.out.println("Entered year is a leap year");
	      else
	         System.out.println("Entered year is not a leap year");
	   }
	}

