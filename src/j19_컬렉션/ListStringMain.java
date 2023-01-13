package j19_컬렉션;

import java.util.ArrayList;


public class ListStringMain {

	public static void main(String[] args) {
		String[] strArray = new String[] {"java", "python", "C++"};
		
		String[] newStrArray = new String[strArray.length + 1];
		
		for(int i = 0; i < strArray.length; i++) {
			newStrArray[i] = strArray[i];
		}
		newStrArray[strArray.length] = "html";
		
		System.out.println("[strArray]");
		for(String str : strArray) {
			System.out.println(str);
		}
		System.out.println("[newstrArray]");
		for(String str : newStrArray) {
			System.out.println(str);
		}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			System.out.println("/////////////////////////////////////////////////////////");
//			new ArrayList<>().add("test");
			
		ArrayList<String> strList = new ArrayList<>();
		strList.add("java");
		strList.add("python");
		strList.add("C++");
		strList.add("js");
		strList.add("cotlin");
		strList.add("linux");
		strList.remove("cotlin");
		strList.add(1, "redhet");
		strList.remove(1);
		
		
//		System.out.println(strList);
		
		for(int i = 0; i < strList.size(); i++) {
			System.out.print("[" + i + "]:");
			System.out.println(strList.get(i));
		}
		
		//foreach로 쓰는법
		
		for(String str : strList) {
			System.out.println(str);
		}
		

			
	
	
	
	
	}
		
	
		
		
	

}
