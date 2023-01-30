package j19_컬렉션.복습;

import java.util.HashMap;
import java.util.Map;

public class SearchData {
	
	public static void main(String[] args) {
		Map<String, Object> searchData = new HashMap<>();
		
		searchData.put("category", "소설");
		searchData.put("searchValue", "불편한 편의점");
		
		System.out.println(searchData);
		System.out.println();
		System.out.println(searchData.get("category"));
		System.out.println(searchData.get("searchValue"));
		System.out.println();
		System.out.println(searchData.keySet());
		System.out.println(searchData.values());
		System.out.println();
		System.out.println(searchData.entrySet());
		System.out.println();
//	System.out.println(searchData); 와 System.out.println(searchData.entrySet());는 같은 결과값이지만
//	중괄호로 값이 나오느냐, 대괄호로 값이 나오느냐의 차이가 있다.
//	이는 반복문을 돌릴 수 있냐 없냐로 나뉜다.
// entrySet을 쓰는 이유가 반복문을 돌리기 위해서이다.
		
//		for(int i = 0; i < searchData.size(); i++);
//		System.out.println(searchData.get(null)); ㅡ> 인덱스로는 반복을 돌릴 수 없다.
		
		for(String key : searchData.keySet()) {
			System.out.println(searchData.get(key));
		}
		
//		for(Object value : searchData.values()) {
//			System.out.println(searchData.get(value));
//		} 이건 왜 안되는거지?
		
	}

}
