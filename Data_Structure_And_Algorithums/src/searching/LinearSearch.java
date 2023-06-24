package searching;

/* TC: O(n) */
public class LinearSearch {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		int key =11;
		int ans = linearSearch(a,key);
		
		if(ans==-1) {
			System.out.println("not found ");
		}
		else {
			System.out.println("Found at index : "+ ans);
		}
		
	}
	public static int linearSearch(int a[],int key) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==key) {
				return i;
			}
		}
		return -1;
	}

}
