package j20_JSON;

import com.google.gson.Gson;

public class Json3 {
	
	public static void main(String[] args) {
		
		Gson gson = new Gson(); //Json때문에 쓴다.
//		System.out.println(Integer.valueOf("100") + 50);
//		System.out.println(Integer.parseInt("100") + 50);
		
		//fromJson
		//toJson
		// 두개를 제일 많이 쓴다.
		gson.toJson(null); 					// object -> json
		gson.fromJson("", Object.class);	//json -> object
		
	}

}
