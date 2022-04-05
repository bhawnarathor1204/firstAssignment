package com.sebone.first.assignment.basic.program;

import java.util.Arrays;
import java.util.Scanner;

/*
 * class name :StringAnagram
 * objective :This class check string is anagram or not
 * @author :bhawna rathor
 */
public class StringAnagram {
	
	/*
     * method name :checkAnagram
     * Objective : This method check string is anagram or not
     * @param : 2 param
     * @return: void
     */
	public boolean checkAnagram(String s1,String s2) {
	  	 s1.replaceAll("//s", "");
	  	 s2.replaceAll("//s", "");
	  	 char[]c1=s1.toLowerCase().toCharArray();
	     char[]c2=s2.toLowerCase().toCharArray();
	     Arrays.sort(c1);
	     Arrays.sort(c2);
	     boolean check=Arrays.equals(c1,c2);
	     return check;
  }
	
	//main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 StringAnagram s=new StringAnagram();
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter first string  = ");
	     String s1=sc.next();
	     System.out.println("Enter second string  = ");
	     String s2=sc.next();
	     boolean ch=s.checkAnagram(s1,s2);
	     if(ch) {
	    	 System.out.println("Anagram");
	     }
	     else
	    	 System.out.println("Not Anagram");
	     sc.close();
	     
	}
}
