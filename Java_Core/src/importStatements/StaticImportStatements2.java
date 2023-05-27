package importStatements;
import static java.lang.Integer.*;
import static java.lang.Byte.*;
import static java.lang.Integer.MAX_VALUE;

public class StaticImportStatements2 {
	public static void main(String[] args) {
		//System.out.println(MAX_VALUE);CTE
		/*Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
						The field MAX_VALUE is ambiguous*/
		
		/*While resolving static members compiler will give the precedence in the following 
		 * order. 
	1. Current class static member
	2. Explicit static import
	3. implict static import

		 */
		
	//	import static java.lang.Integer.MAX_VALUE;(EXPLICIT)
		System.out.println(MAX_VALUE);
		

		
	}
}
	
	
	
	
	



