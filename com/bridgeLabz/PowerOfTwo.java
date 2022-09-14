/**
 * 
 */
package com.bridgeLabz;
import java.util.Scanner;

/**
 * @author Admin
 *
 */
public class PowerOfTwo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 boolean b = true;
	      Scanner input = new Scanner(System.in);
	      System.out.print("Input a number : ");
	      int num = input.nextInt();           
	     {   
	     while(num!=1)
	      {
	        if(num%2!=0)
	          { 
	            b=! b;
	            System.out.print(b);
	            System.exit(0);
	          }
	            num = num / 2;
	      }
	       System.out.print(b);

	     }}}
