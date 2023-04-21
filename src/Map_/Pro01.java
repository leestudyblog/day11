package Map_;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

public class Pro01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//메뉴 등록할 HashMap 
		LinkedHashMap<String, String> menu = new LinkedHashMap<>();
		//메뉴와 가격 입력 받을 변수
		 String putmenu, price = "";
		
		boolean bool = true;
		
		while(bool) {
			System.out.println("1.메뉴등록");
			System.out.println("2.메뉴별 가격보기");
			System.out.println("3.종료");
			System.out.println(">>>>");
			//값 입력 받기
			int num = sc.nextInt();
			
			switch (num) {
			case 1 : 
				
				System.out.println("등록할 메뉴 : ");
				putmenu = sc.next();
				System.out.println("가격 : ");
				price = sc.next();
                if(menu.containsKey(putmenu) == false) {
                	menu.put(putmenu, price);
                	System.out.println(price);
                	System.out.println(putmenu);
                	System.out.println("등록 된 메뉴 : " + putmenu + " 가격 :" + price );
                }else {System.out.println("메뉴를 다시 입력해주세요.");}
				System.out.println("메뉴 등록"); break;
			case 2 : 
					System.out.println("메뉴 선택");
					Set<String> menuSet = menu.keySet();
					Collection<String> value_price = menu.values();
					Iterator<String> itmenu = menu.keySet().iterator();
					

					System.out.println("메뉴 : " + menuSet);
					System.out.println("가격을 확인할 메뉴를 선택하세요");
					putmenu = sc.next();
					//메뉴 비었는지 확인
					if (menu.containsKey(putmenu) == false) {
						System.out.println("메뉴가 존재하지 않습니다.");
					}else {
						while(itmenu.hasNext()) {
							String menukey = itmenu.next();
							System.out.println(menukey + "의 가격은 : " + menu.get(menukey) + " 원");
						         }
					      }
					
					System.out.println("1. 수정 2. 삭제 3. 나가기");
					int num2 = sc.nextInt();
					switch (num2) {
					
					case 1 : System.out.println("수정"); break;
					case 2 : 
						System.out.println("삭제할 메뉴를 선택하세요");
						System.out.println("메뉴 : ");
						Iterator<String> demenu1 = menu.keySet().iterator();
						while(demenu1.hasNext()) {
							String menukey2 = demenu1.next();
							System.out.println(menukey2 + " : " + menu.get(menukey2) + " 원");
						         }
						
						//삭제할 메뉴 받기
						String delmenu=sc.next();
						//메뉴 비었는지 확인
						if (menu.containsKey(delmenu) == false) {
							System.out.println("메뉴가 존재하지 않습니다.");
						}else {
							//해당 메뉴 삭제
							menu.remove(delmenu);
							Iterator<String> demenu = menu.keySet().iterator();
							while(demenu.hasNext()) {
								String menukey2 = demenu.next();
								System.out.println(menukey2 + " : " + menu.get(menukey2) + " 원");
							         }
							
							System.out.println("삭제 되었습니다." + "메뉴 :" + menu);
						}	
						System.out.println("삭제"); break;
						
					case 3 : System.out.println("나가기"); bool = false; break;
					
					}
					
					System.out.println("메뉴별 가격보기"); break;
					
				
			case 3 : 
				System.out.println("종료"); 
				bool = false;
				break;
			
			}
			
			
		}
		
		
		
		
	}//method

}
