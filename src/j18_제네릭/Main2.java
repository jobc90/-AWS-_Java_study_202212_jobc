package j18_제네릭;

public class Main2 {
	//?자료형은 어떤 자료형이든 가능하기 때문에 와일드카드라고도 한다.
	public CMRespDto<?> response(CMRespDto<?> cmRespDto) {
//	public CMRespDto<? super Student> - super는 대상 객체의 상위로만 받겠다는 제약
//	public CMRespDto<? extends Person> - extends는 대상 객체의 하위로만 받겠다는 제약
		System.out.println("응답데이터");
		System.out.println(cmRespDto);
		return cmRespDto;
	}

	public static void main(String[] args) {
		Main2 main = new Main2();//response는 멤버메소드여서 Main2의 클래스가 생성이 되어야지만 사용이 가능하다.
								//main은 static으로 잡혀있기때문에 실행을 위해서는 Main2클래스를 먼저 생성해줘야 한다.
		
		CMRespDto<?> hello = 
				new CMRespDto<>(200, "성공", "안녕하세요");
		
		CMRespDto<?> score = 
				new CMRespDto<>(200, "성공", 85);
		
		System.out.println("hellp");
		System.out.println(main.response(hello));
		System.out.println();
		System.out.println("score");
		System.out.println(main.response(score));
		

		// 안녕하세요.

	}

}
