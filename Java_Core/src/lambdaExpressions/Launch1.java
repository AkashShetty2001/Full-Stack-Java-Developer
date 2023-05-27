package lambdaExpressions;
/*To use LambdaExpressions we have to make use of FunctionalInterface */
/*An interface which is having only one abstract method is called as FunctionalInterface */

interface Demo {
	void disp();
}

public class Launch1 {
	public static void main(String[] args) {
		Demo d= ()->{
			System.out.println("using lambda expression");
		};
		d.disp();
	}
}


/*to write lambda exp we use lambda operator (->)
lambda operator divided into 2 parts to write lambda expression
left side of lambda operator we write parameters required
right side of lambda operator we write body or implementation
left side for parameters ,datatype is optional
right side if implementation or body has one statement then {} is optional
left side if parameter is single then () and type of data both optional
right side in body if its single line implementation then return statement is also optional
{} is mandatory if there are more then one statement and also if there is return statement explictly used by developer
*/