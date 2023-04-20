package list_;

import java.util.ArrayList;

public class Ex03 {

	public static void main(String[] args) {
		/*
		 indexOf : 특정 문자나 문자열이 앞에서부터 처음 발견되는 인덱스를 반환하며 만약 찾지 못했을 경우 "-1"을 반환함.
		 */
		
		ArrayList<String> arr =new ArrayList<>();
		arr.add("aaa");
		arr.add("bbb");
		arr.add("ccc");
		System.out.println(arr.indexOf("bbb"));
		System.out.println(arr.indexOf("bbb22"));
	
		//set
		System.out.println("===특정값 추가===");
		System.out.println(arr);
		arr.remove("bbb");
		arr.add("bbb");
		arr.add(1, "홍길동"); // 특정 위치에 넣기 : 리스트 명.add( 위치, 추가할 값)
		System.out.println(arr);
		
		System.out.println("===set===");
		arr.set(1, "김개똥"); 
		System.out.println(arr);
		
		
	}

}
