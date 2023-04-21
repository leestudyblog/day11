package Map_;

import java.util.HashMap;

public class Ex01 {

	public static void main(String[] args) {
		/*
		 HashMap
		 - 키, 값으로 이루어져있다. 
		 - 순서는 유지되지 않는다.
		 - 키의 중복은 허용되지 않는다. 값의 중복은 가능
		 */
					
		HashMap<String, String> map1 = new HashMap<>();
		HashMap<Integer, String> map2 = new HashMap<>();
		HashMap<String, String> map3 = new HashMap<>();
		//HashMap<Integer, > map = new HashMap<>();
		
		//값 지정
		map1.put("name", "홍길동");
		map1.put("age", "20");
		map1.put("aggr", "산골짜기");
		
		System.out.println(map1);
		
		//값 불러오기
		System.out.println(map1.get("name")); //name 키에 대한 값인 홍길동 출력
		//int + String
		map2.put(111,"일일일");
		map2.put(2,"이이");
		map2.put(3,"삼");
		System.out.println(map2);
		System.out.println(map2.get(2));
		System.out.println(map2.get(211111)); // 없는 값은 null로 출력
		

		
	}

}
