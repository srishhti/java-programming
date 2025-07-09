// Day 02 - Problem Solving for the day - 03.07.2025 

// Given  two integers M and N, calculate the  sum of the squares of all the prime numbers between from M and N inclusive.if M is greater than N , return 0 or display an appropriate message 

// Test Case 01 : M = 2, N = 10

// Test Case 02 : M = 11, N = 20

// Test Case 03 : M = 4, N = 4

// Test Case 0 :M=12,N=8

import java.util.*;
class problem2{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);

		System.out.println("enter your first number");
		int M=sc.nextInt();

		System.out.println("enter your second number");
		int N=sc.nextInt();

		int sum=0;
		if(M<N){
			for(int i=M; i<=N;i++){
				int count=0;
				for(int j=1;j<=i;j++){
					if(i%j==0){
						count++;
					}

				if(count==2){
					System.out.print(i+",");
					sum+=i*i;
					}
				}
			}
			System.out.println("total sum is: "+ sum);
		}
		else{
			System.out.println("as M>N so : 0");
		}
		
	}
}