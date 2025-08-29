package api07.ArrayList;



/**
 * @날짜 :2025. 8. 29.
 * @작성자 : 전희연
 * @설명 : Collection >> ArrayList
 */

import java.util.ArrayList;

public class ArrayList01 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Java");
		list.add("Oralce");
		list.add("JSP");
		list.add("HTML");
		list.add("CSS");
		
		int size=list.size();
		System.out.println("저장된 총 객체 수:"+size);
		
		String subject=list.get(2);
		System.out.println("2번 인덱스의 객체 얻기:"+subject+"\n");
		
		for(int i=0;i<list.size();i++) {
			String str=list.get(i);
			System.out.println(str);
		}
		
		System.out.println(list.toString());
		
		// 추가, 교체(수정), 삭제
		// 추가
		list.add("사과");
		list.add(1,"바나나");
		System.out.println(list.toString());
		
		// 교체(수정)
		list.set(3, "안녕하세요");
		System.out.println(list.toString());
		
		// 삭제
		list.remove(0);
		System.out.println(list.toString());
		

	}

}
