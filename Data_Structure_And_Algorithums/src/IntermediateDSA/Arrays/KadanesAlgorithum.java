package IntermediateDSA.Arrays;

/*program to check max of SubArray .
 * TC : O(n);
 */

public class KadanesAlgorithum {
	public static void main(String[] args) {
		int cs=0;
		int ms=Integer.MIN_VALUE;
		int a[]= {-2,-3,-1,-2,-3};
		boolean b= allElementsAreNegative(a);
		if(b) {
		 System.out.println(check(a));
		 return;
		}
		
		for(int i=0;i<a.length;i++) {
			cs=cs+a[i];
			if(cs<0)
				cs=0;
			ms=Math.max(cs, ms);	
		}
		System.out.println(ms);
	}
	public static int check(int a[]) {
		boolean b= allElementsAreNegative(a);
		int max=Integer.MIN_VALUE;
		if(b)
		{
			for(int i=0;i<a.length;i++) {
				if(max<a[i])
					max=a[i];
				
			}
		}
		return max;
		
		
	}
	public  static boolean allElementsAreNegative(int[] array) {
	    for (int element : array) {
	        if (element >= 0) {
	            return false;
	        }
	    }
	    return true; 
	}
	

}
