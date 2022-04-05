package com.sebone.first.assignment.basic.program;

import java.util.Scanner;
/*
 * class name :Occurrence
 * objective :This class find the occurrence of a character in string
 * @author :bhawna rathor
 */
public class Occurrence{
		
	    /*
	     * method name :countOccurance
	     * Objective : This method count the occurrence of a character in string
	     * @param : 1 param
	     * @return: String
	     */
	    public int countOccurrence(String s){
		   int count=0;
		   for(int i=0;i<s.length();i++){
		       if(s.charAt(i)=='a')
			       count++;
		   }
		   return count;
	    }
	    
	    // this method is the main method
	    public static void main(String[]args){
		   Scanner sc=new Scanner(System.in);
		   Occurrence occurance=new Occurrence();
		   System.out.print("Enter any String = ");
		   String s=sc.nextLine();
		   System.out.print("Occurance of a in given string is = "+occurance.countOccurrence(s));
		   sc.close();
	    }
}

