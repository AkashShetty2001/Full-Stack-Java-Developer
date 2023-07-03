package StringClass;

public class StringConstantPoolEx1 {
	public static void main(String[] args) {
		
		String s1="sachin";
		String s2 = new String("sachin");
		
		System.out.println(s1==s2);//false
		/* two objects are created..1 in heap and 1 in scp..
		 * s1 is pointing to object present in heap area.
		 * for scp object there is no reference, even thought it not cleaned by gc..
		 * gc cannot clean objects present in scp..
		 * in scp duplicates are not allwoed.
		 * scp memory will be cleaned at the time of jvm shutdown..
		 *  */
		
		String s3="sachin";
		String s4="sachin" ;
		System.out.println(s3==s4);//true
		
		
	}

}
