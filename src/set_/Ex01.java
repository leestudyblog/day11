package set_;

import java.util.ArrayList;
import java.util.HashSet;

public class Ex01 {

	public static void main(String[] args) {
		/*
		 set 
		 - 순서가 존재하지 않는다.
		 - 데이터가 중복되지 않는다.
		 - 배열 안에 공간을 16개로 잡고 75%가 차면 새롭게 16개 공간 생성
		 - 공간은 유동적 
		 */
		
		HashSet<String> set = new HashSet<>();
		set.add("aaa");
		set.add("bbb");
		set.add("ccc");
		
		ArrayList<String> arr = new ArrayList<>();
		arr.add("aaa");
		arr.add("bbb");
		arr.add("aaa");
		System.out.println("set : "+ set);
		System.out.println("arr : "+arr);
		
		System.out.println("=====remove====");
		set.remove("bbb");
		System.out.println(set);
		
		
		
		
	}//method

}
