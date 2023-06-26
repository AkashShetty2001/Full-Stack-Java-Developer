package IntermediateDSA.Arrays;

public class PrintSubArray {
	public static void main(String[] args) {
		int a[]= {2,4,6,8,10};
		subArray(a);
		
	}
	public static void subArray(int arr[]) {
		int tp=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				for(int k=i;k<=j;k++) {
					System.out.print(arr[k]+ " ");
					
				}
				tp++;
				System.out.println();
			}
			System.out.println();
		}
		System.out.println("Total subarray:"+ tp);
	}

}
