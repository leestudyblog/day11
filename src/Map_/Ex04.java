package Map_;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class Ex04 {

	public static void main(String[] args) {
		LinkedHashMap<String, String> map = new LinkedHashMap<>();
		map.put("name", "gin");
		map.put("age", "20");
		map.put("addr", "home");
		System.out.println(map);
	
		//Set<String> set = map.keySet();
		//Iterator<String> it = set.iterator();
		Iterator<String> it = map.keySet().iterator(); //위 문장과 동일
		 
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key + ": " + map.get(key));
		}
		
		
		
		
	
	}//method

}
