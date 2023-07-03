package StringClass;
/*
 * 1.String Objects will be created in heap area..
 * 2.present in java.lang package.
 */
public class StringEx1 {
	public static void main(String[] args) {
		
		String s = new String("Sachin");
		s.concat("Tendulkar");
		System.out.println(s);//sachin because Strings are immutable..
		/*Changes are reflected in new Object not in original object*/
		
		
		/* == and .equals() */
		
		String s1 = "Virat";
		String s2 = new String ("Virat");
		
		System.out.println(s1==s2);
		/* == is a comparision operator , it will check whether both the 
		 *    reference variables are pointing to same object are not..
		 */
		System.out.println(s1.equals(s2));
		/* .equals() this method is present in object class.
		 * it will compare the content..
		 * this method is overriden from object class.
		 */
		
		
		
		
	}

}
