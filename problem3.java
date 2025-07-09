// Day 03 - Problem Solving for the day - 04.07.2025 

// Given two integers M and N, calculate the  sum of the factorials of all the integers from M and N inclusive.if M is greater than N , return 0 or display an appropriate message

// Test Case 01 : M = 3, N = 5

// Test Case 02 : M = 0, N = 4

// Test Case 03 : M = 5, N = 5

// Test Case 04:M=6,N=4

import java.util.*;

class problem3{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the first number");
	int M=sc.nextInt();
	System.out.println("enter the second number");
	int N=sc.nextInt();
	int sum=0;
	if(M<=N){
		
		for(int i=M; i<=N;i++){
			int fact=1;
			for(int j=1; j<=i;j++){
				fact*=j;
			}
			System.out.println("fact: "+fact);
			sum+=fact;
		}
		System.out.println("the sum is: "+ sum);
	}
	else{
		System.out.println("0");
	}


	}
}