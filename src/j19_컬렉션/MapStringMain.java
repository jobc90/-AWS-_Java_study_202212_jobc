package j19_컬렉션;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapStringMain {
	
	public static void main(String[] args) {
		Map<String, String> strMap = new HashMap<>();
		
		strMap.put("a", "A");
		strMap.put("b", "B");
		strMap.put("c", "C");
		strMap.put("d", "D");
		
//		System.out.println(strMap);
//		
//		System.out.println(strMap.get("a"));
//		System.out.println(strMap.get("e"));
		
		
//		strMap.keySet()
//		for(String s : strMap) //strMap map은 key와 value가 쌍으로 존재해 keySet을 통해 값을 뽑아준다.
		for(String k : strMap.keySet()) {
			System.out.println("key: " + k);
			System.out.println(strMap.get(k));
		}
		
		for(String v : strMap.values()) {
			System.out.println("value: " + v);
		//출력되는 값은 key값의 Hashcode의 정렬에 대한 값으로 나온다.
			
		}
		
		System.out.println(strMap.entrySet());
		for(Entry<String, String> entry : strMap.entrySet()) {
			System.out.println(entry);
			System.out.println("key: " + entry.getKey());
			System.out.println("value: " + entry.getValue());
			System.out.println();
		}
		
		strMap.forEach((k, v) -> {
			System.out.println("key: " + k);
			System.out.println("value: " + v);
			});
		
	}

}
