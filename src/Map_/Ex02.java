package Map_;

import java.util.HashMap;

public class Ex02 {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("선풍기", "100만원");
		map.put("에어컨", "50만원");
		map.put("자동차", "10만원");

		System.out.println(map);
		System.out.println("결과 :" + map.containsKey("자동차"));
		//containsKey : 키 값이 존재하는 지 확인 (true, false 출력)
		System.out.println("결과 :" + map.containsValue("50만원"));
		//containsValue : 해당하는 값이 존재하는 지 확인
		
		map.put("선풍기", "100만원");
		map.put("자동차", "1000만원");//키에 대한 중복이 발생하면 값이 변경됨.
		
		System.out.println(map);
		
		//키 값 삭제
		map.remove("선풍기1"); 
		System.out.println(map);
		
		
	}

}
