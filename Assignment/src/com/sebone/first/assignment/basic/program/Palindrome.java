package com.sebone.first.assignment.basic.program;

import java.util.Scanner;

/*
 * class name :Palindrome
 * objective :This class find the palindrome of a number
 * @author :bhawna rathor
 */
public class Palindrome {
	

    /*
     * method name :isPalindrome
     * Objective : This method check if a number is plaiindrome or not
     * @param : 1 param
     * @return: void
     */
	 public  void isPalindrome(int n){
	      int newn=n;
	      int r=0;
	      int rev=0;
	      while(n>0){
	        r=n%10;
	        rev=(rev*10)+r;
	        n=n/10;
	      }//while close
	      if(rev==newn)
	        System.out.print("number is palindrome");
	      else
	        System.out.print("number is not palindrome");

	   }
	 
	   // main method
	   public static void main(String[]args){
	     Scanner sc=new Scanner(System.in);
	     Palindrome p=new Palindrome();
	     System.out.print("Enter any number to check palindrome or not =");
	     int n=sc.nextInt();
	     p.isPalindrome(n);
	     sc.close();
	   }
}
