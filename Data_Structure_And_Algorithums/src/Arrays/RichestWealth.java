package Arrays;

/*
 * https://leetcode.com/problems/richest-customer-wealth/
 * Input: accounts = [[1,2,3],[3,2,1]]
Output: 6
Explanation:
1st customer has wealth = 1 + 2 + 3 = 6
2nd customer has wealth = 3 + 2 + 1 = 6
Both customers are considered the richest with a wealth of 6 each, so return 6.
 */

public class RichestWealth {
	public static void main(String[] args) {
		int accounts[][] = {{1,2,3},{3,2,1}};
		System.out.println(maximumWealth(accounts));
		
	}
	
	 public  static int maximumWealth(int[][] accounts) {
		 int ans=Integer.MIN_VALUE;
	      for(int i=0;i<accounts.length;i++){
	          int max=0;
	          for(int j=0;j<accounts[i].length;j++){
	              max= max+accounts[i][j];
	          }
	          if(max>ans)
	          ans=max;
	      }
	        
	        return ans;
	        
	    }
		 
		 
	 }
	 
	 
	 

