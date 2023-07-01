package mapHireachy;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Collection;

/*
 * implements Map
 * order of insertion not maintained
 * used when data is stored in the form of key value pair..
 * available from 1.2v
 */

public class HashMapClass {
	public static void main(String[] args) {
		
		HashMap hm = new HashMap();
		hm.put(10,"Sachin");
		hm.put(7, "MSD");
		hm.put(18, "Kholi");
		
		//System.out.println(hm);
		
		Collection c=hm.values();
		Iterator itr1=c.iterator();
		while(itr1.hasNext()) {
			
			String s=(String)itr1.next();
			System.out.print(s+ " ");
		}
		
		System.out.println();
		
		Set s=hm.keySet();
		Iterator itr2=s.iterator();
		while(itr2.hasNext()) {
			Integer i =(Integer)itr2.next();
			System.out.print(i+ " ");
		}
		
		System.out.println();
		
		Set e=hm.entrySet();
		Iterator itr3=e.iterator();
		while(itr3.hasNext()) {
			Map.Entry data=(Entry )itr3.next();
			System.out.println("key :"+data.getKey() +" "+"value :"+ data.getValue()+" ");
		}
		
	}

}
