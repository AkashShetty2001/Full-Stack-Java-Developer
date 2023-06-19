package IntermediateDSA.problems;

import java.util.Scanner;
public class SumOfNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		int ans=sum(n);
		System.out.println("sum:"+ ans);
		sc.close();
		
	}
	
	public static int sum(int n) {
		if(n<=0)
			return -1;
		else {
		int s=((n+1)*n)/2;
		return s;
		}
	}

}



