package searching;

/* TC: O(log n) */

public class BinarySearch {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		int key = 6;
		int ans = binarySearch(a,key);
		if(ans==-1) {
			System.out.println("not found ");
		}
		else {
			System.out.println("Found at index : "+ ans);
		}
		
	}
	public static int binarySearch(int a[], int key) {
		int start =0;
		int end =a.length-1;
		
		while(start <=end ) {
			int mid = (start + end)/2;
			
			if(a[mid]==key) //found
				return mid;
			else if(a[mid]> key) // left
				end = mid-1;
			else
				start = mid + 1;
				
		}
		return -1;
	}

}
