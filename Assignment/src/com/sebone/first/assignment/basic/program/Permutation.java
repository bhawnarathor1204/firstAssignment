package com.sebone.first.assignment.basic.program;

import java.util.Scanner;
/*
 * class name :Permutation
 * objective :This class find the permutation of a string
 * @author :bhawna rathor
 */
public class Permutation {
	
	 /*
     * method name :printpermutations
     * Objective : This method find the permutation of a string
     * @param : 2 param
     * @return: void
     */
    public void printpermutations(String str,String ans) {
	      if(str.length()==0) {
		     System.out.println(ans);
		     return;
	      }
	    for(int i=0;i<str.length();i++) {
		   char ch=str.charAt(i);
		   String sl=str.substring(0,i);
		   String sr=str.substring(i+1);
		   String res=sl+sr;
		   printpermutations(res,ans+ch);
		
	    }
    }
    
    // This method is the main method
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Permutation p=new Permutation();
		System.out.println("enter any string = ");
		String s=sc.next();
		p.printpermutations(s,"");
		sc.close();
		
	}
}
