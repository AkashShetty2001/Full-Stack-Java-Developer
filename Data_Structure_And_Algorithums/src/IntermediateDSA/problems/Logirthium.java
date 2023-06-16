package IntermediateDSA.problems;
import java.util.Scanner;

public class Logirthium {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int ans=log(n);
		System.out.println("Answer :" + ans);
		sc.close();
		
	}
	public static int log(int n) {
		int count=0;
		if(n<=1)
			return -1;
		while(n!=1) {
			n=n/2;
			count++;
		}
		return count;
		
	}

}



