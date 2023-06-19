
/* You are given an integer N you need to print all the Armstrong Numbers between 1 to N. (N inclusive).
	
	ArmStrong Number
	If sum of cubes of each digit of the number is equal to the number itself, then the number is called an Armstrong number.
	For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 ).

	Note: All the test cases in this problem are limited to 3 digit numbers.
	
 */
package IntermediateDSA.problems;
import java.util.Scanner;

public class ArmStrongNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(armStrong(i)) {
				System.out.println(i);
				}
		}
		sc.close();
		
	}
	
	public static boolean armStrong(int n) {
		int m= n;
		int sum=0;
		while(n!=0) {
			int dig = n%10;
			sum = sum+(dig *dig *dig);
			n= n/10;
		}
		if(sum==m)
			return true;
		return false;
			
		}
	}


