package list_;

import java.util.ArrayList;

public class Ex01 {

	public static void main(String[] args) {
		
		/*
		 collection : 데이터의 집합 구조 (자료구조)
		 - 공간의 크기가 유동적임 (배열은 고정적) 
		 framework : 기본틀
		 collection framework :다수의 데이터를 쉽고 효과적으로 처리할 수 있는 표준화된 방법을 제공하는 클래스의 집합
		 - list : 순서가 존재한다. 데이터의 중복 허용, 자료형 첫 글자는 대문자여야함.
		 - map
		 - set  
		 */
		
		
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("111"); //데이터 추가
		arr.add("222");
		arr.add("333");
		System.out.println(arr.get(0));
		System.out.println(arr.get(1));
		System.out.println(arr.get(2));
		System.out.println("=======for======");
		
		//리스트 반복문 출력
		for(int i=0; i<arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		
		// list for each
		System.out.println("=== for each ===");
		for (String s : arr) {
			System.out.println(s);
		}
		
		System.out.println("==============");
		// ArrayList<int> arr2 = new ArrayList<>();->오류
		// int == Intenger
		ArrayList<Integer> arr2 = new ArrayList<>();
		arr2.add(111);
		System.out.println(arr2);
		
	}//method

}
