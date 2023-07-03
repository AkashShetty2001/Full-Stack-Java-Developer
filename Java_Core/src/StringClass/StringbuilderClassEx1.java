package StringClass;
/*
 * 1.it is present java.lang package.
 * 2.it is by default mutable..
 * 3.introduced in java 1.5v
 */
public class StringbuilderClassEx1 {
	public static void main(String[] args) {
		
		StringBuilder s = new StringBuilder("Sachin");
		s.append("Tendulkar");
		System.out.println(s);//mutable changes are reflected to same object.
		
		StringBuilder s1 =new StringBuilder( "Virat");
		StringBuilder s2 = new StringBuilder ("Virat");
		
		System.out.println(s1==s2);//compares reference
		System.out.println(s1.equals(s2));//compares reference (same as Object class)
	}

}
