package set_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Pra01 {

	public static void main(String[] args) {
		//연락처 저장 프로그램
		Scanner input = new Scanner(System.in);
		ArrayList<String> name = new ArrayList<>();
		ArrayList<String> adrr = new ArrayList<>();
		String n, ad;
		int num;
	
		while(true) {
			System.out.println("1.연락처 등록");
			System.out.println("2.연락처 보기");
			System.out.println("3.연락처 삭제");
			System.out.println("4.모든 연락처 보기");
			
			num= input.nextInt();
			switch (num) {
			case 1 : 
				System.out.println("이름을 입력하시오");
				n=input.next();
				//boolean bool1 = name.add(n);
				 name.add(n); // name리스트에 입력값 추가
				System.out.println("연락처를 입력하시오");
				ad=input.next();
				//boolean bool2 = adrr.add(ad);
				adrr.add(ad);//ad 리스트에 입력값 추가
				System.out.println("연락처 등록"); break;
			case 2 : 
				System.out.println("이름 검색");
				String n1= input.next();//사용자가 검색한 이름
				System.out.println("연락처 검색");
				String a1= input.next();
				
				for (int i=0; i<name.size(); i++) {
						if (name.equals(n1)) {
							if(adrr.equals(a1)) {
							n1=name.get(i);
							a1=name.get(i);
						System.out.println("이름 : "+n1);
						System.out.println("이름 : "+a1);
						
							}	
					}else {
						System.out.println("목록에 없습니다.");
						System.out.println("연락처를 등록해주세요.");
					}
				}
					
				System.out.println("연락처 보기"); break;
			case 3 : 
				String rename;
				System.out.println("삭제할 연락처를 입력하시오");
				rename=input.next();
				if (!name.equals(rename)) {
					System.out.println("목록에 없습니다.");
				}else {
					name.remove(rename);
					System.out.println(name);
				}
				System.out.println("연락처 삭제"); break;
			case 4 : 	
				 Iterator<String> na = name.iterator();
				 for (;na.hasNext(); ) {
					System.out.println(na.next());
					System.out.println(adrr);// 모든 연락처 보기
				}
				
				System.out.println("모든 연락처 보기"); break;
			
			}
		
		}//while
		

		
	}//method

}
