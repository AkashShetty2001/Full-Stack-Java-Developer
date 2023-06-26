package IntermediateDSA.Arrays;

public class MaxSubArray {
	public static void main(String[] args) {
		int a[]= {1,-2,6,-1,3};
		int ans =maxSubArray(a);
		System.out.println(ans);
		
		
	}
	public static int maxSubArray(int a[]) {
		int curSum=0;
		int max=Integer.MIN_VALUE;
		int prefix[]= new int[a.length];
		prefix[0]=a[0];
		
		for(int i=1;i<prefix.length;i++) {
			prefix[i]=prefix[i-1]+a[i];
		}
		
		
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<a.length;j++) {
				
					//curSum= prefix[j];}
				 curSum= i==0 ? prefix[j]: prefix[j]-prefix[i-1];
				 if(max<curSum)
					 max=curSum;
				
		}
		}
		return max;
	}

}
