/**
 * 
 */
package com.bridgeLabz;

import java.util.Scanner;

/**
 * @author Admin
 *
 */
public class LargestAmongThreeNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Driving Class
		
		int a, b, c, largest;  
		Scanner input = new Scanner(System.in);  
		System.out.println("Enter the first number:");  
		a = input.nextInt();  
		System.out.println("Enter the second number:");  
		b = input.nextInt();  
		System.out.println("Enter the third number:");  
		c = input.nextInt();  
		largest = c > (a > b ? a : b) ? c : ((a > b) ? a : b);  
		System.out.println("The largest number is: "+largest);  
		}  

	}


