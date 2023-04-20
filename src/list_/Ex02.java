package list_;

import java.util.ArrayList;

public class Ex02 {

	public static void main(String[] args) {
		
		// 데이터 비교
		ArrayList<String> arr= new ArrayList<>();
		
		arr.add("aaa");
		arr.add("bbb");
		arr.add("ccc");
		for (String s : arr) {
			if (s.equals("bbb")) {
				System.out.println("bbb와 같다");
			}else {
				System.out.println("bbb가 아니다.");
				
			}
		}
		System.out.println("=======comtains=======");
		//arr 안에 특정 데이터가 존재하면 true, 그렇지 않으면 false
		System.out.println(arr);
		System.out.println(arr.contains("bbb"));
		System.out.println(arr.contains("bb2"));
		boolean n =arr.contains("bb2");
	
		//특정 데이터 삭제
		System.out.println("=======bbb 삭제=======");
		System.out.println("삭제 전 " +arr);
		arr.remove(1); // arr.remove("bbb");
		System.out.println("삭제 후 " +arr);

		
		
	}//method 

}
