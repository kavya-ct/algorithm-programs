package com.bridgeit.algorithms;
import java.util.Scanner;

public class Primenumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start,end,count=0;
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the Range:\n");
		
		System.out.print("Enter starting Number");
		start=scan.nextInt();
		
		System.out.print("Enter  ending Number");
		end=scan.nextInt();
		
		System.out.print("Prime numbers between" +start+ " and " + end + " is :\n");
		
		for(int i= start; i<=end; i++)
		{
			count=0;
			for(int j=2; j<i; j++)
			{
				if(i%j==0)
				{
					count++;
					break;
				}
			}
				if(count==0)
				{
					System.out.print(i + " ");
				
			
		 }
		}
		}	
}

				
			
			


