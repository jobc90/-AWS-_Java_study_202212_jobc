package j18_제네릭;

public class Main {

	public static void main(String[] args) {
		TestData<String, Integer> td = new TestData<String, Integer>("조병철", 34);
//		TestData<?, ?> td = new TestData<>("조병철", 34); ?는 어떤 자료형이 들어올지 모를 때, 생성에서 생략이 가능하다.
		TestData<String, Double> td2 = new TestData<String, Double>("junil", 100.05);
		System.out.println(td);
		System.out.println(td2);
		
		CMRespDto<TestData<String, Integer>> cm =
				new CMRespDto<TestData<String, Integer>>(200, "성공", td);
//		CMRespDto<TestData<>> cm =
//				new CMRespDto<TestData<?, ?>>(200, "성공", td);
		
		System.out.println(cm);

	}

}
