package com.sebone.first.assignment.basic.program;

import java.util.Scanner;

/*
 * class name :PrimeNumber
 * objective :This class find the permutation of a string
 * @author :bhawna rathor
 */
public class PrimeNumber {
	
	/*
     * method name :findPrime
     * Objective : This method find the permutation of a string
     * @param : 2 param
     * @return: void
     */
	public void getPrime(int n) {
    	for(int i=0;i<n;i++) {
        	if(i==0||i==1) {
        		continue;
        	}
        	int flag=1;
        	for(int j=2;j<=i/2;j++) {
        		if(i%j==0) {
        			flag=0;
        			break;
        		}
        	}
        	if(flag==1) {
        		System.out.println(i);
        	}
        }
    }
	
	//This method is the main method
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        PrimeNumber p=new PrimeNumber();
        System.out.println("Enter any numer = ");
        int n=sc.nextInt();
        p.getPrime(n);
        sc.close();
	}

}
