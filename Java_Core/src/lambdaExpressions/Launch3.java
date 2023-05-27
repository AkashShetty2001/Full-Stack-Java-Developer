package lambdaExpressions;
/*Usage of lambda expressions..*/
@FunctionalInterface
interface Demo1{
	void add(int a,int b);
	
}

interface Demo2{
	int sub(int num1);
	
}

public class Launch3 {
	public static void main(String[] args) {
		Demo1 d=(a,b)->{
			int c=a+b;
			System.out.println(c);
		};
		d.add(1, 2);
		
		Demo2 dd=num1->num1-5;
		System.out.println(dd.sub(10));
		
	}
	

}
