package Collections;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapCon {

	public static void main(String[] args) {
		Map<Integer,String> mp = new LinkedHashMap<Integer,String>();
		mp.put(1, "sachin");
		mp.put(2, "prasanna");
		mp.put(3, "hari");
		mp.put(4, "sundar");
		
	//	System.out.println(mp.get(4));
	        Set<Integer> dd = mp.keySet();
	     //   System.out.println(dd);
	        
	        Collection<String> values = mp.values();
	     //   System.out.println(values);
	        
	        Set<Entry<Integer, String>> entrySet = mp.entrySet();
	        
	        for(Entry<Integer, String> gh:entrySet) {
	        	System.out.println(gh.getKey());
	        	System.out.println(gh.getValue());
	        }
		


		
	}
}
