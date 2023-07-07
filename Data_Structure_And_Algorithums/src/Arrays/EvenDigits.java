package Arrays;

/*
 * https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
 * Input: nums = [12,345,2,6,7896]
Output: 2
Explanation: 
12 contains 2 digits (even number of digits). 
345 contains 3 digits (odd number of digits). 
2 contains 1 digit (odd number of digits). 
6 contains 1 digit (odd number of digits). 
7896 contains 4 digits (even number of digits). 
Therefore only 12 and 7896 contain an even number of digits.
 */
public class EvenDigits {
	public static void main(String[] args) {
		 int nums []= {12,345,2,6,7896};
		System.out.println(EvenDigits.findNumbers(nums));
		
	}
	public static int findNumbers(int[] nums) {
        int count=0;
		for(int num:nums){
			if(even(num)) {
				count++;
			}
		}
		
		return count;
        
    
        
    }
    public static  boolean  even(int num) {
		int noOfDigits=digits2(num);
		return noOfDigits % 2==0;
	}
     public  static int digits2(int num) {
		if(num<0) {
			num=num*-1;
		}
		return (int)(Math.log10(num)+1);
		
	}

}
