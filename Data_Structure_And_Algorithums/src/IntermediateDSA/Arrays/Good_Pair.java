package IntermediateDSA.Arrays;
import java.util.Scanner;

/*
 Given an array A and an integer B. A pair(i, j) in the array is a good pair if i != j and (A[i] + A[j] == B). Check if any good pair exist or not.



Problem Constraints
1 <= A.size() <= 104

1 <= A[i] <= 109

1 <= B <= 109
*/

public class Good_Pair {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int n = sc.nextInt();
		System.out.println("Enter Array elemnts");
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			 a[i]=sc.nextInt();
		}
		System.out.println("Enter target elemnt");
		int target = sc.nextInt();
		int ans = goodPair(a,target);
		System.out.println(ans);
		
	}
	public static int goodPair(int a[],int target) {
		int n=a.length;
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i]+a[j]==target && i!=j)
					return 1;
					}
	   } return 0;
		
	}

}
