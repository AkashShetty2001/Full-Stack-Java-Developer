package importStatements;

import static java.lang.Math.sqrt;//Explicitimport
import static java.lang.Math.*;//ImplicitImport

/* Static import: 
	This concept introduced in 1.5 versions. According to sun, static import improves 
	readability of the code but ,according to 
	worldwide Programming exports (like us) static imports creates confusion and 
	reduces readability of the code. Hence if there is no 
	specific requirement never recommended to use a static import.
	
	Usually we can access static members by using class name but whenever we are using 
	static import it is not require to use class name 
	we can access directly.
	
	*refers to static memebers of the class not the .class files or subpackages
*/

public class StaticImportStatements {
	public static void main(String[] args) {
		
		//without static import
		System.out.println(Math.sqrt(4));
		System.out.println(Math.max(10,20));
		System.out.println(Math.random());
		
		
		//With static import:
		System.out.println(sqrt(4));
		System.out.println(max(10,20));
		System.out.println(random());
			}
	}

/* eg:
 * class Test{
		static String name = "sachin";
		}
		output
		======
		Test.name.length() ====> 6
		
		================================
		
		import java.io.PrintStream;
		
		class System{
		static PrintStream out;
		}
		
		class PrintStream{
		public void println(){
		;;;;;;
		}
		}
		
		System.out.println()
		 | | |=> It is a method of PrintStream class
		 | |
		 | |=> It is a reference of PrintStream Class
		 |=> it is an class
 */


		
	

	


