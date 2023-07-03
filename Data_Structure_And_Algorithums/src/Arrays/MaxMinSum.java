package Arrays;

/*
 * Given an array A of size N of integers. 
 * Your task is to find the sum of minimum and maximum element in the array.
 * Input:
	N = 5
	A[] = {-2, 1, -4, 5, 3}
	Output: 1
	Explanation: min = -4, max =  5. Sum = -4 + 5 = 1
*/


public class MaxMinSum {
	public static void main(String[] args) {
	int	A[] = {-2, 1, -4, 5, 3};
	System.out.println(findSum(A));
		
	}
		 
		    public static int findSum(int A[]) 
		    {
		        //code here
		        int min=A[0];
		        int max=A[0];
		        
		        for(int i=1;i<A.length;i++){
		            if(A[i]>max)
		            max=A[i];
		            if(A[i]<min)
		            min=A[i];
		        }
		        return min+max;
		    }
		
}

