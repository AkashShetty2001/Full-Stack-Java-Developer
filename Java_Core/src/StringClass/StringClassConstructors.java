package StringClass;

/*
 * 1.string class is immutable..
 * 
 * 
 *  public java.lang.String(byte[]);
  	public java.lang.String(java.lang.StringBuffer);
  	public java.lang.String(java.lang.StringBuilder);
  	public java.lang.String(char[]);
  	public java.lang.String();
  	public java.lang.String(java.lang.String);
 * 
 */
public class StringClassConstructors {
	public static void main(String[] args) {
		String s ="Sachin";//Object created..
		System.out.println(s);
		
		String s1 = new String("Sachin");
		System.out.println(s1);//Object created..
		
		 String s2 =new String();//creaates an empty string
		 
		 StringBuffer sb =new StringBuffer("sachin");
		 System.out.println("StringBuffer data is :: "+sb);
		 String s3 =new String(sb);
		 System.out.println("String data is : "+s3);
		 
		 char[] ch = {'j','a','v','a'};
		 String s4 =new String(ch);
		 System.out.println(s4);//java
		 
		 byte[] b = {65,66,67,68};
		 String s5= new String(b);
		 System.out.println(s5);//"ABCD"*/
		
		/*String s="sachin";
		String s1=s.toString();
		System.out.println(s1==s);*/
		
	}

}
