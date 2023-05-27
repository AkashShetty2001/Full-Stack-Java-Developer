package importStatements;
import java.util.ArrayList; 
/*By using explicit import complilation time will be less. */

public class ExplicitImportStatements {

	public static void main(String args[]){ 
		
	ArrayList l=new ArrayList(); 
	l.add(1);
	l.add(2);
	l.add(3);
	for(int i=0;i<l.size();i++) {
		System.out.println(l.get(i));
	}
	}
}


