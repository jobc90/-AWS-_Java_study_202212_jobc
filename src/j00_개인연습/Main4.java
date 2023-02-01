package j00_개인연습;
//JSON 형식의 결과를 출력하는 프로그램을 작성

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import lombok.AllArgsConstructor;

@AllArgsConstructor
class Product {
	private int serialNumber;
	private String productType;
	private String productName;
	private int price;
}

public class Main4 {

	public static void main(String[] args) {
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		Product product = new Product(2001, "laptop", "Samsung GalaxyBook", 1400000);
		
		System.out.println(gson.toJson(product));

	}

}
