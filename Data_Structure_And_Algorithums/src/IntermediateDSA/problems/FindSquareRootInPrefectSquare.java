/* Amazon Question
 * Q. given a perfectSquare Number, find Squareroot of that number
 */

package IntermediateDSA.problems;
import java.util.Scanner;


public class FindSquareRootInPrefectSquare {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		int ans = squareRoot(n);
		System.out.println("Ans: "+ans);
		sc.close();
		
		
	}
	public static int squareRoot(int n) {
		if(n<=0)
			return-1;
		for(int i=0;i<=n;i++) {
			if(i*i==n)
				return i;
		}
		return -1;
	}

}
