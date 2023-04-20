package set_;

import java.util.HashSet;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		HashSet<String> name = new HashSet<>();
		String n;
		
		while (true) {
			System.out.println("이름 입력");
			n=sc.next();
			boolean bool = name.add(n); // name 변수 값에 입력 받은 값(n)을 bool로 저장
			System.out.println(bool);
			if(!bool) {// bool == false
				System.out.println("존재하는 이름입니다.");
			}else {
				System.out.println("저장 완");
			}
		}
		//-> 순서가 필요한 경우에는 불편. list사용 권장
		
		
		
		
		
	}//method

}
