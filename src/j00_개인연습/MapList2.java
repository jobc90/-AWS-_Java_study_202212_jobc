package j00_개인연습;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapList2 {

	public static void main(String[] args) {
//		List<Map<String, List<String>>> customers = new ArrayList<Map<String, List<String>>>();
		
		List<String> colors = new ArrayList<>();
		colors.add("red");
		colors.add("green");
		colors.add("blue");
		
		List<String> size = new ArrayList<>();
		size.add("SS");
		size.add("S");
		size.add("M");
		size.add("L");
		size.add("XL");
		
		Map<String, List<String>> options = new HashMap<String, List<String>>();
		options.put("색상", colors);
		options.put("사이즈", size);
		
		
		for(Map.Entry<String, List<String>>entry : options.entrySet()) {
			System.out.println(entry);
			
		}

	}

}
