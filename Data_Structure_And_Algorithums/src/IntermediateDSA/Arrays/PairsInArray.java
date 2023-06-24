package IntermediateDSA.Arrays;

public class PairsInArray {
	public static void main(String[] args) {
		int a[]= {2,4,6,8,10};
		pairsInArray(a);
		
	}
	public static void pairsInArray(int a[]) {
		int tp=0;
		for(int i=0;i<a.length;i++) {
			int curr = a[i];
			for(int j=i+1;j<a.length;j++) {
				System.out.print("("+curr +"," +a[j]+")"+ " ");
				tp++;
			}
			System.out.println();
		}
		System.out.println("Total pairs:"+ tp);
	}

}
