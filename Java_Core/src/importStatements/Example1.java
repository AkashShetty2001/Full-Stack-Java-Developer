package importStatements;
 import java.util.ArrayList;
public class Example1 {
	public static void main(String[] args) {
		/*   ArrayList al = new ArrayList();CTE  */
		
		java.util.ArrayList al = new java.util.ArrayList();//Fully qualified name
		/*The above problem can be resolved by using fully qualified name,
		 * but the scope of this path is, for that line only.
		 */
		
		//ArrayList all = new ArrayList();
		
		/*To overcome these kind of problems we use import statements 
		 * Types of Import Statements:
			There are 2 types of import statements.
			1) Explicit class import 
			2) Implicit class import.
		*/
	}

}
