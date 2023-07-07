package Arrays;

/*
 * https://leetcode.com/problems/running-sum-of-1d-array/submissions/988751096/
 * Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
 */
public class RunningsSum {
	public static void main(String[] args) {
		int nums []= {1,2,3,4};
		runningSum(nums);
		
	}
	 public  static void runningSum(int[] nums) {
	        for(int i=1;i<nums.length;i++){
	            nums[i]=nums[i-1]+nums[i];
	        }
	        for(int i=0;i<nums.length;i++) {
	        	System.out.print(nums[i]+" ");
	        }
	       
	        
	    }

}
