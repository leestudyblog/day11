package set_;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Ex02 {

	public static void main(String[] args) {
		/*	
		 반복자 :
		 Iterator<String> it = .iterator();
		 
		 */
		
		ArrayList<String> arr = new ArrayList<>();
		arr.add("aaa");
		arr.add("bbb");
		arr.add("ccc");
		
		Iterator<String> it = arr.iterator();
		/*
		System.out.println(it.hasNext()); //hasNext(): 이동X
		System.out.println(it.next()); //hasNext(): 이동하고 값 가져오기O 
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.hasNext());// 값 없으면 false
		//System.out.println(it.next());// ->오류
		*/
		for(;it.hasNext();) {
			System.out.println(it.next());	
		}
		
		System.out.println("====HashSet====");
		//HashSet
		HashSet<String> set = new HashSet<>();
		set.add("aaa");
		set.add("bbb");
		set.add("ccc");
		
		Iterator<String> se = set.iterator();
		for(;se.hasNext();) {
			System.out.println(se.next());	
		}

		
	}//me

}
