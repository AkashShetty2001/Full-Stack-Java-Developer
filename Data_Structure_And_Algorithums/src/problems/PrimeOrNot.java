package problems;

import java.util.Scanner;
public class PrimeOrNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number to check ");
		int n = sc.nextInt();
		
		Boolean a=is_Prime(n);
		if(a==true) 
			System.out.println("prime");
		else
			System.out.println("Not Prime");
		}
	
	/*public static Boolean is_Prime(int n) {
		int count =0;
		
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
			if(count ==2)
				return true;
			else
				return false;
		}
		*/
		
		/*Optimized solution*/
		
		public static Boolean is_Prime(int n) {
			int count =0;
			
			for(int i=1;i*i<=n;i++) {
				if(n%i==0) {
					if(i*i==n)
					   count+=1;
					else
						count+=2;
				}
				
			}
				if(count ==2)
					return true;
				else
					return false;
			}
	
	}



