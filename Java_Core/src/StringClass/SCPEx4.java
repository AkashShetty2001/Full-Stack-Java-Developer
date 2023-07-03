package StringClass;

  /*intern()
		 * Interning=> Using Heap object reference, if we want to get Corresponding 
		 * SCP Object, then we need to use intern() method
		 * if data not found it will create..
   */
		
 
public class SCPEx4 {
	public static void main(String[] args) {
		
		String a= new String("akash");
		String a1=a.intern();
		System.out.println(a==a1);
		
		String a2="akash";
		System.out.println(a1==a2);
		
		
		String s1 = "sachin";
		String s2 = s1.concat("tendulker");
		String s3=s2.intern();//data not found ,bject created in scp.
		String s4="sachintendulker";
		System.out.println(s3==s4);
		
	}

}
