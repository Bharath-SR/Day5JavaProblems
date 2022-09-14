/**
 * 
 */
package com.bridgeLabz;

import java.util.Random;
/**
 * @author Admin
 *
 */
public class coinFlip {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Random random=new Random();
		int number=random.nextInt(2);
		System.out.println(number);
		
		
		if(number==0) {
			System.out.println("It is Heads");
		}
		else {
			System.out.println("Its Tails");
		}
	}

}
