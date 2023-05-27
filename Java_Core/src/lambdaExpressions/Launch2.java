package lambdaExpressions;

interface Sample{
	void disp();
}

//Traditional implementation
class Sampleimpl implements Sample {
	public void disp() {
		System.out.println("Implementation given"); 
	
	}
}
public class Launch2 {
public static void main(String[] args) {
	Sampleimpl s = new Sampleimpl();
	s.disp();
	
	
	//Anonymous inner class
	Sample ss = new Sample() {
		public void disp() {
			System.out.println("Implementation given"); 	
		}
	};
	ss.disp();
	
	
	//lambda expressions.
	Sample sss=()->System.out.println("Implementation given"); 
	sss.disp();
	
}
}
