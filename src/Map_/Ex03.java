package Map_;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex03 {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("name", "c");
		map.put("age", "20");
		map.put("adrr", "home");
		//map.keySet() : 키 값들만 모두 출력 (자료형 : set)
		//map.values() : 해당 값들만 모두 출력
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		Set<String> key_set = map.keySet();
		Collection<String> value_co = map.values();
		
		System.out.println(key_set);
		System.out.println(value_co);
		
		
		Iterator<String> keyIt = key_set.iterator();
		Iterator<String> valueIt = value_co.iterator();
		
		while(keyIt.hasNext()) {
			String k = keyIt.next(); //값을 받와서 출력
			String v = valueIt.next();
			System.out.println(k+" : "+v);
			
		}
		
	}//method

}
